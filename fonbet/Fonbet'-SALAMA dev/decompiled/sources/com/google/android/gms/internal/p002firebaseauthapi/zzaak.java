package com.google.android.gms.internal.p002firebaseauthapi;

import a.AbstractC0603a;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzaak implements zzael<zzaib> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzaal zzb;

    public zzaak(zzaal zzaalVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzaalVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(AbstractC0603a.y0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzaib zzaibVar) {
        zzaib zzaibVar2 = zzaibVar;
        if (!TextUtils.isEmpty(zzaibVar2.zza()) && !TextUtils.isEmpty(zzaibVar2.zzb())) {
            this.zzb.zza.zza(new zzagl(zzaibVar2.zzb(), zzaibVar2.zza(), Long.valueOf(zzagn.zza(zzaibVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
            return;
        }
        this.zza.zza(AbstractC0603a.y0("INTERNAL_SUCCESS_SIGN_OUT"));
    }
}
