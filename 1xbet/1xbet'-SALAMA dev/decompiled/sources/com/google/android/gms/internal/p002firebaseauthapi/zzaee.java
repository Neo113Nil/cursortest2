package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import p034e4.m;

/* JADX INFO: loaded from: classes.dex */
final class zzaee implements zzaeg {
    private final /* synthetic */ Status zza;

    public zzaee(zzaea zzaeaVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(m mVar, Object... objArr) {
        mVar.onVerificationFailed(zzadg.zza(this.zza));
    }
}
