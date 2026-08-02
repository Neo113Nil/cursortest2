package com.google.android.gms.internal.p002firebaseauthapi;

import a.AbstractC0603a;
import com.google.firebase.auth.UserProfileChangeRequest;

/* loaded from: classes.dex */
final class zzabd implements zzael<zzagl> {
    private final /* synthetic */ UserProfileChangeRequest zza;
    private final /* synthetic */ zzade zzb;
    private final /* synthetic */ zzzk zzc;

    public zzabd(zzzk zzzkVar, UserProfileChangeRequest userProfileChangeRequest, zzade zzadeVar) {
        this.zza = userProfileChangeRequest;
        this.zzb = zzadeVar;
        this.zzc = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(AbstractC0603a.y0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final void zza(zzagl zzaglVar) {
        zzagl zzaglVar2 = zzaglVar;
        zzahb zzahbVar = new zzahb();
        zzahbVar.zzd(zzaglVar2.zzc());
        UserProfileChangeRequest userProfileChangeRequest = this.zza;
        if (userProfileChangeRequest.f11895c || userProfileChangeRequest.f11893a != null) {
            zzahbVar.zzb(userProfileChangeRequest.f11893a);
        }
        UserProfileChangeRequest userProfileChangeRequest2 = this.zza;
        if (userProfileChangeRequest2.f11896d || userProfileChangeRequest2.f11897e != null) {
            zzahbVar.zzg(userProfileChangeRequest2.f11894b);
        }
        zzzk.zza(this.zzc, this.zzb, zzaglVar2, zzahbVar, this);
    }
}
