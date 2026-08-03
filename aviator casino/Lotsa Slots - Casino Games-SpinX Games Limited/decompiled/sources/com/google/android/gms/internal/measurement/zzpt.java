package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzpt implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzpt zza = new com.google.android.gms.internal.measurement.zzpt();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzpv());

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzpu get() {
        return (com.google.android.gms.internal.measurement.zzpu) this.zzb.get();
    }
}
