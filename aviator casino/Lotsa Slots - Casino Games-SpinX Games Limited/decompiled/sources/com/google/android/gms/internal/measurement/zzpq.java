package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzpq implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzpq zza = new com.google.android.gms.internal.measurement.zzpq();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzps());

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzb() {
        return zza.get().zzb();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzc() {
        return zza.get().zzc();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zzd() {
        return zza.get().zzd();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzpr get() {
        return (com.google.android.gms.internal.measurement.zzpr) this.zzb.get();
    }
}
