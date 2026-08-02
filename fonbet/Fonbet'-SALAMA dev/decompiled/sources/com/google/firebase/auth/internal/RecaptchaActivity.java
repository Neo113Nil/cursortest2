package com.google.firebase.auth.internal;

import A3.C;
import Y3.i;
import a.AbstractC0603a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.A;
import b4.C0784d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzadj;
import com.google.android.gms.internal.p002firebaseauthapi.zzadk;
import com.google.android.gms.internal.p002firebaseauthapi.zzadl;
import com.google.android.gms.internal.p002firebaseauthapi.zzadx;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import d4.InterfaceC0965b;
import f4.C1084A;
import f4.H;
import f4.J;
import f4.q;
import f4.y;
import io.sentry.TransactionOptions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import m3.c;
import p0.b;

/* loaded from: classes2.dex */
public class RecaptchaActivity extends A implements zzadl {

    /* renamed from: b, reason: collision with root package name */
    public static long f11901b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1084A f11902c = C1084A.f12901c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11903a = false;

    public final Uri.Builder d(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        i f7 = i.f(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(f7);
        H h6 = H.f12924a;
        Context applicationContext = getApplicationContext();
        synchronized (h6) {
            D.e(str);
            D.e(uuid);
            SharedPreferences a2 = H.a(applicationContext, str);
            H.b(a2);
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".FIREBASE_APP_NAME", stringExtra3);
            edit.apply();
        }
        String b7 = J.a(getApplicationContext(), f7.g()).b();
        if (TextUtils.isEmpty(b7)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            e(AbstractC0603a.y0("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.a()) ? firebaseAuth.a() : zzadx.zza()).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b7);
        return builder;
    }

    public final void e(Status status) {
        f11901b = 0L;
        this.f11903a = false;
        Intent intent = new Intent();
        HashMap hashMap = y.f12986a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        b.a(this).b(intent);
        f11902c.a(this);
        finish();
    }

    public final void f() {
        f11901b = 0L;
        this.f11903a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        b.a(this).b(intent);
        f11902c.a(this);
        finish();
    }

    @Override // androidx.fragment.app.A, androidx.activity.o, F.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: " + action);
            f();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f11901b < TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        f11901b = currentTimeMillis;
        if (bundle != null) {
            this.f11903a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.A, android.app.Activity
    public final void onResume() {
        String str;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f11903a) {
                f();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = c.c(c.g(this, packageName)).toLowerCase(Locale.US);
                i f7 = i.f(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(f7);
                if (zzafb.zza(f7)) {
                    f7.b();
                    zza(d(Uri.parse(zzafb.zza(f7.f7665c.f7672a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f11869v);
                } else {
                    new zzadj(packageName, lowerCase, intent, f7, this).executeOnExecutor(firebaseAuth.f11872y, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e7));
                zzadk.zzb(this, packageName);
            }
            this.f11903a = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            e(y.a(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            f();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        H h6 = H.f12924a;
        Context applicationContext = getApplicationContext();
        String packageName2 = getPackageName();
        String stringExtra2 = intent2.getStringExtra("eventId");
        synchronized (h6) {
            D.e(packageName2);
            D.e(stringExtra2);
            SharedPreferences a2 = H.a(applicationContext, packageName2);
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            str = null;
            String string = a2.getString(str2, null);
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string2 = a2.getString(str3, null);
            SharedPreferences.Editor edit = a2.edit();
            edit.remove(str2);
            edit.remove(str3);
            edit.apply();
            if (!TextUtils.isEmpty(string)) {
                str = string2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            e(AbstractC0603a.y0("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = J.a(getApplicationContext(), i.f(str).g()).c(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f11901b = 0L;
        this.f11903a = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (b.a(this).b(intent3)) {
            f11902c.a(this);
        } else {
            SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            edit2.putString("recaptchaToken", queryParameter);
            edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit2.putLong("timestamp", System.currentTimeMillis());
            edit2.commit();
        }
        finish();
    }

    @Override // androidx.activity.o, F.m, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f11903a);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return d(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza(String str) {
        return zzafb.zzb(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zzb.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzadl.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(String str, Status status) {
        if (status == null) {
            f();
        } else {
            e(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(Uri uri, String str, N4.b bVar) {
        Task forResult;
        InterfaceC0965b interfaceC0965b = (InterfaceC0965b) bVar.get();
        if (interfaceC0965b != null) {
            Task b7 = ((C0784d) interfaceC0965b).b(false);
            q qVar = new q(1);
            qVar.f12961b = uri;
            forResult = b7.continueWith(qVar);
        } else {
            forResult = Tasks.forResult(uri);
        }
        C c3 = new C(2);
        c3.f627b = this;
        c3.f628c = str;
        forResult.addOnCompleteListener(c3);
    }
}
