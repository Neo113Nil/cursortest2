package com.google.android.gms.internal.p002firebaseauthapi;

import Y3.i;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;

/* JADX INFO: loaded from: classes.dex */
public final class zzaep {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzaep(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        i iVar = this.zza.f11849a;
        iVar.b();
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", iVar.f7665c.f7672a);
        if (!TextUtils.isEmpty(this.zza.b())) {
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", this.zza.b());
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzads.zza().zzb());
        i iVar2 = this.zza.f11849a;
        iVar2.b();
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", iVar2.f7664b);
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", this.zza.f11848B);
        this.zzb.startActivity(intent);
    }
}
