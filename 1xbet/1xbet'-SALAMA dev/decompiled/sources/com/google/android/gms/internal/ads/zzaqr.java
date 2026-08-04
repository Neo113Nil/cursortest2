package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class zzaqr extends zzhdp {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhdz zzm;
    private long zzn;

    public zzaqr() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhdz.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        sb.append(this.zzg);
        sb.append(";modificationTime=");
        sb.append(this.zzh);
        sb.append(";timescale=");
        sb.append(this.zzi);
        sb.append(";duration=");
        sb.append(this.zzj);
        sb.append(";rate=");
        sb.append(this.zzk);
        sb.append(";volume=");
        sb.append(this.zzl);
        sb.append(";matrix=");
        sb.append(this.zzm);
        sb.append(";nextTrackId=");
        return AbstractC0486a1.i(sb, this.zzn, "]");
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhdn
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzhdu.zza(zzaqn.zzf(byteBuffer));
            this.zzh = zzhdu.zza(zzaqn.zzf(byteBuffer));
            this.zzi = zzaqn.zze(byteBuffer);
            this.zzj = zzaqn.zzf(byteBuffer);
        } else {
            this.zzg = zzhdu.zza(zzaqn.zze(byteBuffer));
            this.zzh = zzhdu.zza(zzaqn.zze(byteBuffer));
            this.zzi = zzaqn.zze(byteBuffer);
            this.zzj = zzaqn.zze(byteBuffer);
        }
        this.zzk = zzaqn.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        zzaqn.zzd(byteBuffer);
        zzaqn.zze(byteBuffer);
        zzaqn.zze(byteBuffer);
        this.zzm = new zzhdz(zzaqn.zzb(byteBuffer), zzaqn.zzb(byteBuffer), zzaqn.zzb(byteBuffer), zzaqn.zzb(byteBuffer), zzaqn.zza(byteBuffer), zzaqn.zza(byteBuffer), zzaqn.zza(byteBuffer), zzaqn.zzb(byteBuffer), zzaqn.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzaqn.zze(byteBuffer);
    }
}
