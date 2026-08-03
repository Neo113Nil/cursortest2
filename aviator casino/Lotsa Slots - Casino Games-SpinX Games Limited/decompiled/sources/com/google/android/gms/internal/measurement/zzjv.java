package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzjv extends android.database.ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjv(com.google.android.gms.internal.measurement.zzjx zzjxVar, android.os.Handler handler) {
        super(null);
        java.util.Objects.requireNonNull(zzjxVar);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        com.google.android.gms.internal.measurement.zzkl.zzc();
    }
}
