package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import e4.AbstractC1039m;

/* loaded from: classes.dex */
final class zzaee implements zzaeg {
    private final /* synthetic */ Status zza;

    public zzaee(zzaea zzaeaVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(AbstractC1039m abstractC1039m, Object... objArr) {
        abstractC1039m.onVerificationFailed(zzadg.zza(this.zza));
    }
}
