package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzeam extends com.google.android.gms.internal.ads.zzeaq {
    private long zza;
    private int zzb;
    private byte zzc;

    zzeam() {
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final com.google.android.gms.internal.ads.zzeaq zza(long j) {
        this.zza = j;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final com.google.android.gms.internal.ads.zzeaq zzb(int i) {
        this.zzb = i;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final com.google.android.gms.internal.ads.zzear zzc() {
        if (this.zzc == 3) {
            return new com.google.android.gms.internal.ads.zzean(this.zza, this.zzb, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(" id");
        }
        if ((this.zzc & 2) == 0) {
            sb.append(" eventType");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
