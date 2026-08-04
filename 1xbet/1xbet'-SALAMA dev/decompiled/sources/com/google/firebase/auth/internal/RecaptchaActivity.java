package com.google.firebase.auth.internal;

import A3.C;
import Y3.i;
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
import io.sentry.TransactionOptions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import p003a.a;
import p014b4.d;
import p042f4.H;
import p042f4.J;
import p042f4.q;
import p042f4.y;
import p090m3.c;
import p110p0.b;

/* JADX INFO: loaded from: classes2.dex */
public class RecaptchaActivity extends A implements zzadl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f11901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p042f4.A f11902c = p042f4.A.f12907c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11903a = false;

    public final Uri.Builder d(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        i iVarF = i.f(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(iVarF);
        H h6 = H.f12930a;
        Context applicationContext = getApplicationContext();
        synchronized (h6) {
            D.e(str);
            D.e(string);
            SharedPreferences sharedPreferencesA = H.a(applicationContext, str);
            H.b(sharedPreferencesA);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".FIREBASE_APP_NAME", stringExtra3);
            editorEdit.apply();
        }
        String strB = J.a(getApplicationContext(), iVarF.g()).b();
        if (TextUtils.isEmpty(strB)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            e(a.y0("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.a()) ? firebaseAuth.a() : zzadx.zza()).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strB);
        return builder;
    }

    public final void e(Status status) {
        f11901b = 0L;
        this.f11903a = false;
        Intent intent = new Intent();
        HashMap map = y.f12992a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
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
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f11901b < TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        f11901b = jCurrentTimeMillis;
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
                i iVarF = i.f(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(iVarF);
                if (zzafb.zza(iVarF)) {
                    iVarF.b();
                    zza(d(Uri.parse(zzafb.zza(iVarF.f7665c.f7672a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f11869v);
                } else {
                    new zzadj(packageName, lowerCase, intent, iVarF, this).executeOnExecutor(firebaseAuth.f11872y, new Void[0]);
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
        H h6 = H.f12930a;
        Context applicationContext = getApplicationContext();
        String packageName2 = getPackageName();
        String stringExtra2 = intent2.getStringExtra("eventId");
        synchronized (h6) {
            D.e(packageName2);
            D.e(stringExtra2);
            SharedPreferences sharedPreferencesA = H.a(applicationContext, packageName2);
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            str = null;
            String string = sharedPreferencesA.getString(str2, null);
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string2 = sharedPreferencesA.getString(str3, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.remove(str2);
            editorEdit.remove(str3);
            editorEdit.apply();
            if (!TextUtils.isEmpty(string)) {
                str = string2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            e(a.y0("Failed to find registration for this reCAPTCHA event"));
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
            SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            editorEdit2.putString("recaptchaToken", queryParameter);
            editorEdit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit2.putLong("timestamp", System.currentTimeMillis());
            editorEdit2.commit();
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
        Task taskForResult;
        p026d4.b bVar2 = (p026d4.b) bVar.get();
        if (bVar2 != null) {
            Task taskB = ((d) bVar2).b(false);
            q qVar = new q(1);
            qVar.f12967b = uri;
            taskForResult = taskB.continueWith(qVar);
        } else {
            taskForResult = Tasks.forResult(uri);
        }
        C c3 = new C(2);
        c3.f627b = this;
        c3.f628c = str;
        taskForResult.addOnCompleteListener(c3);
    }
}
