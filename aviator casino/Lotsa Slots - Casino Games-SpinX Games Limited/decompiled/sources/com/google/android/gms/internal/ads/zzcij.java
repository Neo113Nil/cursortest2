package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcij {
    private long zza;

    public final long zza(java.nio.ByteBuffer byteBuffer) {
        com.google.android.gms.internal.ads.zzaus zzausVar;
        com.google.android.gms.internal.ads.zzaur zzaurVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            java.util.Iterator it = new com.google.android.gms.internal.ads.zzaun(new com.google.android.gms.internal.ads.zzcii(duplicate), com.google.android.gms.internal.ads.zzcin.zzb).zzc().iterator();
            while (true) {
                zzausVar = null;
                if (!it.hasNext()) {
                    zzaurVar = null;
                    break;
                }
                com.google.android.gms.internal.ads.zzaup zzaupVar = (com.google.android.gms.internal.ads.zzaup) it.next();
                if (zzaupVar instanceof com.google.android.gms.internal.ads.zzaur) {
                    zzaurVar = (com.google.android.gms.internal.ads.zzaur) zzaupVar;
                    break;
                }
            }
            java.util.Iterator it2 = zzaurVar.zzc().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                com.google.android.gms.internal.ads.zzaup zzaupVar2 = (com.google.android.gms.internal.ads.zzaup) it2.next();
                if (zzaupVar2 instanceof com.google.android.gms.internal.ads.zzaus) {
                    zzausVar = (com.google.android.gms.internal.ads.zzaus) zzaupVar2;
                    break;
                }
            }
            long zzd = (zzausVar.zzd() * 1000) / zzausVar.zzc();
            this.zza = zzd;
            return zzd;
        } catch (java.io.IOException | java.lang.RuntimeException unused) {
            return 0L;
        }
    }
}
