package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzjt extends com.google.android.gms.measurement.internal.zzay {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjt(com.google.android.gms.measurement.internal.zzli zzliVar, com.google.android.gms.measurement.internal.zzjf zzjfVar) {
        super(zzjfVar);
        java.util.Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        final com.google.android.gms.measurement.internal.zzli zzj = this.zza.zzu.zzj();
        java.util.Objects.requireNonNull(zzj);
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzjs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zzli.this.zzw();
            }
        }).start();
    }
}
