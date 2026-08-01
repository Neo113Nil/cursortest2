package com.google.android.gms.internal.ads;

import com.ironsource.U3;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzavg extends zzinf {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzinp zzm;
    private long zzn;

    public zzavg() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzinp.zzj;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + U3.j.e;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzind
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzink.zza(zzavc.zzd(byteBuffer));
            this.zzh = zzink.zza(zzavc.zzd(byteBuffer));
            this.zzi = zzavc.zza(byteBuffer);
            this.zzj = zzavc.zzd(byteBuffer);
        } else {
            this.zzg = zzink.zza(zzavc.zza(byteBuffer));
            this.zzh = zzink.zza(zzavc.zza(byteBuffer));
            this.zzi = zzavc.zza(byteBuffer);
            this.zzj = zzavc.zza(byteBuffer);
        }
        this.zzk = zzavc.zze(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzavc.zzb(byteBuffer);
        zzavc.zza(byteBuffer);
        zzavc.zza(byteBuffer);
        this.zzm = new zzinp(zzavc.zze(byteBuffer), zzavc.zze(byteBuffer), zzavc.zze(byteBuffer), zzavc.zze(byteBuffer), zzavc.zzf(byteBuffer), zzavc.zzf(byteBuffer), zzavc.zzf(byteBuffer), zzavc.zze(byteBuffer), zzavc.zze(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzavc.zza(byteBuffer);
    }
}
