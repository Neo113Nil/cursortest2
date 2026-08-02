package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import a.AbstractC0603a;

/* loaded from: classes.dex */
final class zzaam implements zzael<zzahh> {
    private final /* synthetic */ zzahi zza;
    private final /* synthetic */ zzade zzb;

    public zzaam(zzzk zzzkVar, zzahi zzahiVar, zzade zzadeVar) {
        this.zza = zzahiVar;
        this.zzb = zzadeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(AbstractC0603a.y0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzahh zzahhVar) {
        zzahh zzahhVar2 = zzahhVar;
        zzahi zzahiVar = this.zza;
        if (zzahiVar instanceof zzahm) {
            this.zzb.zzb(zzahhVar2.zza());
        } else {
            if (zzahiVar instanceof zzaho) {
                this.zzb.zza(zzahhVar2);
                return;
            }
            throw new IllegalArgumentException(AbstractC0486a1.h("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was ", this.zza.getClass().getName(), "."));
        }
    }
}
