package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzsf extends zzhg {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzsf() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzhg, com.google.android.gms.internal.ads.zzha
    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzm() {
        return this.zzh;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final void zzo(int i7) {
        this.zzi = i7;
    }

    public final boolean zzp(zzhg zzhgVar) {
        ByteBuffer byteBuffer;
        zzcv.zzd(!zzhgVar.zzd(1073741824));
        zzcv.zzd(!zzhgVar.zzd(268435456));
        zzcv.zzd(!zzhgVar.zzd(4));
        if (zzq()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzhgVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i7 = this.zzh;
        this.zzh = i7 + 1;
        if (i7 == 0) {
            this.zze = zzhgVar.zze;
            if (zzhgVar.zzd(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = zzhgVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzhgVar.zze;
        return true;
    }

    public final boolean zzq() {
        return this.zzh > 0;
    }
}
