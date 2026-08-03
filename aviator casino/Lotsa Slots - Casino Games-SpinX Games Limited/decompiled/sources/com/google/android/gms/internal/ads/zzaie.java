package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaie extends com.google.android.gms.internal.ads.zzafk {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaie(final com.google.android.gms.internal.ads.zzagl zzaglVar, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r13, java.lang.Math.max(6, zzaglVar.zzc));
        long j3;
        java.util.Objects.requireNonNull(zzaglVar);
        com.google.android.gms.internal.ads.zzafh zzafhVar = new com.google.android.gms.internal.ads.zzafh() { // from class: com.google.android.gms.internal.ads.zzaic
            @Override // com.google.android.gms.internal.ads.zzafh
            public final /* synthetic */ long zza(long j4) {
                return com.google.android.gms.internal.ads.zzagl.this.zzb(j4);
            }
        };
        com.google.android.gms.internal.ads.zzaid zzaidVar = new com.google.android.gms.internal.ads.zzaid(zzaglVar, i, null);
        long zza = zzaglVar.zza();
        long j4 = zzaglVar.zzj;
        int i2 = zzaglVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzaglVar.zzc) / 2) + 1;
        } else {
            int i3 = zzaglVar.zza;
            int i4 = zzaglVar.zzb;
            long j5 = android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * zzaglVar.zzg) * zzaglVar.zzh) / 8) + 64;
        }
    }
}
