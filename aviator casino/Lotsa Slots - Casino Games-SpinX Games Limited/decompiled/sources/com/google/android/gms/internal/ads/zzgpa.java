package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgpa implements com.google.android.gms.internal.ads.zzgox {
    private final com.google.android.gms.internal.ads.zzgqh zza;
    private final long zzb;

    zzgpa(com.google.android.gms.internal.ads.zzgcn zzgcnVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar, long j) {
        this.zza = zzgqhVar;
        this.zzb = j;
    }

    private static boolean zzc(com.google.android.gms.internal.ads.zzgfq zzgfqVar) {
        int zza = zzgfqVar.zzb().zza().zza();
        int zzb = zzgfqVar.zzb().zza().zzb();
        byte[] versionArray = com.google.android.gms.internal.ads.zzava.zza();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(6);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) zza);
        allocate.putInt(zzb);
        byte[] array = allocate.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return java.util.Arrays.equals(array, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.zzgox
    public final boolean zza(com.google.android.gms.internal.ads.zzgfq zzgfqVar) {
        if (zzgfqVar == null || zzgfqVar.equals(com.google.android.gms.internal.ads.zzgfq.zzh())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzgfqVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z = zzgfqVar.zzb().zzc() - java.lang.System.currentTimeMillis() <= this.zzb;
        if (z) {
            this.zza.zzb(20203);
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzgox
    public final boolean zzb(com.google.android.gms.internal.ads.zzgfq zzgfqVar) {
        if (zzgfqVar == null || zzgfqVar.equals(com.google.android.gms.internal.ads.zzgfq.zzh())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzgfqVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }
}
