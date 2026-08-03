package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzrg implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzrg zza = new com.google.android.gms.internal.measurement.zzrg();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzri());

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzrh get() {
        return (com.google.android.gms.internal.measurement.zzrh) this.zzb.get();
    }
}
