package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzjo extends android.database.ContentObserver {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzjq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjo(com.google.android.gms.internal.measurement.zzjq zzjqVar, android.os.Handler handler) {
        super(null);
        java.util.Objects.requireNonNull(zzjqVar);
        this.zza = zzjqVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzc();
    }
}
