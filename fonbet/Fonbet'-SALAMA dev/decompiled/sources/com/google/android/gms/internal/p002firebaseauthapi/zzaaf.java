package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* loaded from: classes.dex */
final class zzaaf implements zzael<zzahz> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaac zzc;

    public zzaaf(zzaac zzaacVar, zzade zzadeVar, zzael zzaelVar) {
        this.zza = zzadeVar;
        this.zzb = zzaelVar;
        this.zzc = zzaacVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final void zza(zzahz zzahzVar) {
        zzahz zzahzVar2 = zzahzVar;
        if (TextUtils.isEmpty(zzahzVar2.zze())) {
            this.zzc.zza.zza(new zzagl(zzahzVar2.zzd(), zzahzVar2.zzb(), Long.valueOf(zzahzVar2.zza()), "Bearer"), null, "phone", Boolean.valueOf(zzahzVar2.zzf()), null, this.zza, this.zzb);
        } else {
            this.zza.zza(new Status(17025, null, null, null), new PhoneAuthCredential(null, null, zzahzVar2.zzc(), true, zzahzVar2.zze()));
        }
    }
}
