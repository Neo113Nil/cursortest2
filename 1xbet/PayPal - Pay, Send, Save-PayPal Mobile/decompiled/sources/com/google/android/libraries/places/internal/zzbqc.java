package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
final class zzbqc {
    private java.util.ArrayList zza = new java.util.ArrayList();
    private volatile com.google.android.libraries.places.internal.zzbjn zzb = com.google.android.libraries.places.internal.zzbjn.IDLE;

    zzbqc() {
    }

    final void zza(@javax.annotation.Nonnull com.google.android.libraries.places.internal.zzbjn zzbjnVar) {
        com.google.common.base.Preconditions.checkNotNull(zzbjnVar, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY);
        if (this.zzb == zzbjnVar || this.zzb == com.google.android.libraries.places.internal.zzbjn.SHUTDOWN) {
            return;
        }
        this.zzb = zzbjnVar;
        if (this.zza.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = this.zza;
        this.zza = new java.util.ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
