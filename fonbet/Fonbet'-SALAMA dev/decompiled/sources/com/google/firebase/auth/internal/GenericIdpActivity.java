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
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.A;
import b4.C0784d;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzadj;
import com.google.android.gms.internal.p002firebaseauthapi.zzadk;
import com.google.android.gms.internal.p002firebaseauthapi.zzadl;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.internal.p002firebaseauthapi.zzb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import d4.InterfaceC0965b;
import f4.C1084A;
import f4.G;
import f4.H;
import f4.J;
import f4.q;
import f4.s;
import f4.y;
import io.sentry.TransactionOptions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import m3.c;
import org.json.JSONException;
import org.json.JSONObject;
import p0.b;

@KeepName
/* loaded from: classes2.dex */
public class GenericIdpActivity extends A implements zzadl {

    /* renamed from: b, reason: collision with root package name */
    public static long f11898b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1084A f11899c = C1084A.f12901c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11900a = false;

    public final Uri.Builder d(Uri.Builder builder, Intent intent, String str, String str2) {
        String jSONObject;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str3 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str3);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject2.put(str3, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            jSONObject = jSONObject2.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String zza = zzadk.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        H h6 = H.f12924a;
        Context applicationContext = getApplicationContext();
        String str4 = jSONObject;
        String str5 = join;
        synchronized (h6) {
            D.e(str);
            D.e(uuid);
            D.e(zza);
            D.e(stringExtra4);
            SharedPreferences a2 = H.a(applicationContext, str);
            H.b(a2);
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".SESSION_ID", zza);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".OPERATION", action);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".PROVIDER_ID", stringExtra2);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".FIREBASE_APP_NAME", stringExtra4);
            edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            edit.apply();
        }
        String b7 = J.a(getApplicationContext(), i.f(stringExtra4).g()).b();
        if (TextUtils.isEmpty(b7)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            e(AbstractC0603a.y0("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (zza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b7);
        if (!TextUtils.isEmpty(str5)) {
            builder.appendQueryParameter("scopes", str5);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.appendQueryParameter("customParameters", str4);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    public final void e(Status status) {
        f11898b = 0L;
        this.f11900a = false;
        Intent intent = new Intent();
        HashMap hashMap = y.f12986a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (b.a(this).b(intent)) {
            f11899c.a(this);
        } else {
            s.a(getApplicationContext(), status);
        }
        finish();
    }

    public final void f() {
        f11898b = 0L;
        this.f11900a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (b.a(this).b(intent)) {
            f11899c.a(this);
        } else {
            s.a(this, AbstractC0603a.y0("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // androidx.fragment.app.A, androidx.activity.o, F.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            f();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f11898b < TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f11898b = currentTimeMillis;
        if (bundle != null) {
            this.f11900a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.A, android.app.Activity
    public final void onResume() {
        G g3;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f11900a) {
                f();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = c.c(c.g(this, packageName)).toLowerCase(Locale.US);
                i f7 = i.f(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(f7);
                if (zzafb.zza(f7)) {
                    f7.b();
                    zza(d(Uri.parse(zzafb.zza(f7.f7665c.f7672a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f11869v);
                } else {
                    new zzadj(packageName, lowerCase, getIntent(), f7, this).executeOnExecutor(firebaseAuth.f11872y, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e7));
                zzadk.zzb(this, packageName);
            }
            this.f11900a = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            e(y.a(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            f();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        synchronized (H.f12924a) {
            D.e(packageName2);
            D.e(stringExtra2);
            SharedPreferences a2 = H.a(this, packageName2);
            String str = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
            String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string = a2.getString(str, null);
            String string2 = a2.getString(str2, null);
            String string3 = a2.getString(str3, null);
            String string4 = a2.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            String string5 = a2.getString(str4, null);
            SharedPreferences.Editor edit = a2.edit();
            edit.remove(str);
            edit.remove(str2);
            edit.remove(str3);
            edit.remove(str4);
            edit.apply();
            g3 = (string == null || string2 == null || string3 == null) ? null : new G(string, string2, string3, string4, string5);
        }
        if (g3 == null) {
            f();
        }
        if (booleanExtra) {
            stringExtra = J.a(getApplicationContext(), i.f(g3.f12923e).g()).c(stringExtra);
        }
        zzahr zzahrVar = new zzahr(g3, stringExtra);
        String str5 = g3.f12922d;
        String str6 = g3.f12920b;
        zzahrVar.zzb(str5);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str6)) {
            Log.e("GenericIdpActivity", "unsupported operation: ".concat(str6));
            f();
            return;
        }
        f11898b = 0L;
        this.f11900a = false;
        Intent intent2 = new Intent();
        Parcel obtain = Parcel.obtain();
        zzahrVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str6);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (b.a(this).b(intent2)) {
            f11899c.a(this);
        } else {
            SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            Parcel obtain2 = Parcel.obtain();
            zzahrVar.writeToParcel(obtain2, 0);
            byte[] marshall2 = obtain2.marshall();
            obtain2.recycle();
            edit2.putString("verifyAssertionRequest", marshall2 != null ? Base64.encodeToString(marshall2, 10) : null);
            edit2.putString("operation", str6);
            edit2.putString("tenantId", str5);
            edit2.putLong("timestamp", System.currentTimeMillis());
            edit2.commit();
        }
        finish();
    }

    @Override // androidx.activity.o, F.m, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f11900a);
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
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
            q qVar = new q(0);
            qVar.f12961b = uri;
            forResult = b7.continueWith(qVar);
        } else {
            forResult = Tasks.forResult(uri);
        }
        C c3 = new C(1);
        c3.f627b = this;
        c3.f628c = str;
        forResult.addOnCompleteListener(c3);
    }
}
