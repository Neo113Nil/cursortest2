package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzjj extends android.database.ContentObserver {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzjl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjj(com.google.android.gms.internal.measurement.zzjl zzjlVar, android.os.Handler handler) {
        super(null);
        java.util.Objects.requireNonNull(zzjlVar);
        this.zza = zzjlVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzb().set(true);
    }
}
