package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzqi implements com.google.common.base.Supplier {
    private static final com.google.android.gms.internal.measurement.zzqi zza = new com.google.android.gms.internal.measurement.zzqi();
    private final com.google.common.base.Supplier zzb = com.google.common.base.Suppliers.ofInstance(new com.google.android.gms.internal.measurement.zzqk());

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static long zzb() {
        return zza.get().zzb();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static double zzc() {
        return zza.get().zzc();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static long zzd() {
        return zza.get().zzd();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static long zze() {
        return zza.get().zze();
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    public static java.lang.String zzf() {
        return zza.get().zzf();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzqj get() {
        return (com.google.android.gms.internal.measurement.zzqj) this.zzb.get();
    }
}
