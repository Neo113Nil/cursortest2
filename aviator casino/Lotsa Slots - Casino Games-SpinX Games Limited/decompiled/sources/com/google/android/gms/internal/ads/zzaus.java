package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaus extends com.google.android.gms.internal.ads.zzimd {
    private java.util.Date zzg;
    private java.util.Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private com.google.android.gms.internal.ads.zzimn zzm;
    private long zzn;

    public zzaus() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = com.google.android.gms.internal.ads.zzimn.zzj;
    }

    public final java.lang.String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + com.ironsource.X3.j.e;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzimb
    public final void zze(java.nio.ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = com.google.android.gms.internal.ads.zzimi.zza(com.google.android.gms.internal.ads.zzauo.zzd(byteBuffer));
            this.zzh = com.google.android.gms.internal.ads.zzimi.zza(com.google.android.gms.internal.ads.zzauo.zzd(byteBuffer));
            this.zzi = com.google.android.gms.internal.ads.zzauo.zza(byteBuffer);
            this.zzj = com.google.android.gms.internal.ads.zzauo.zzd(byteBuffer);
        } else {
            this.zzg = com.google.android.gms.internal.ads.zzimi.zza(com.google.android.gms.internal.ads.zzauo.zza(byteBuffer));
            this.zzh = com.google.android.gms.internal.ads.zzimi.zza(com.google.android.gms.internal.ads.zzauo.zza(byteBuffer));
            this.zzi = com.google.android.gms.internal.ads.zzauo.zza(byteBuffer);
            this.zzj = com.google.android.gms.internal.ads.zzauo.zza(byteBuffer);
        }
        this.zzk = com.google.android.gms.internal.ads.zzauo.zze(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        com.google.android.gms.internal.ads.zzauo.zzb(byteBuffer);
        com.google.android.gms.internal.ads.zzauo.zza(byteBuffer);
        com.google.android.gms.internal.ads.zzauo.zza(byteBuffer);
        this.zzm = new com.google.android.gms.internal.ads.zzimn(com.google.android.gms.internal.ads.zzauo.zze(byteBuffer), com.google.android.gms.internal.ads.zzauo.zze(byteBuffer), com.google.android.gms.internal.ads.zzauo.zze(byteBuffer), com.google.android.gms.internal.ads.zzauo.zze(byteBuffer), com.google.android.gms.internal.ads.zzauo.zzf(byteBuffer), com.google.android.gms.internal.ads.zzauo.zzf(byteBuffer), com.google.android.gms.internal.ads.zzauo.zzf(byteBuffer), com.google.android.gms.internal.ads.zzauo.zze(byteBuffer), com.google.android.gms.internal.ads.zzauo.zze(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = com.google.android.gms.internal.ads.zzauo.zza(byteBuffer);
    }
}
