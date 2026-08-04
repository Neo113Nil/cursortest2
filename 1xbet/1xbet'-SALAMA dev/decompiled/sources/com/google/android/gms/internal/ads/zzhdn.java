package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzhdn implements zzaqo {
    private static final zzhdy zzg = zzhdy.zzb(zzhdn.class);
    protected final String zza;
    long zzd;
    zzhds zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    public zzhdn(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        try {
            if (this.zzc) {
                return;
            }
            try {
                zzhdy zzhdyVar = zzg;
                String str = this.zza;
                zzhdyVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzh = this.zzf.zzd(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final void zzb(zzhds zzhdsVar, ByteBuffer byteBuffer, long j, zzaql zzaqlVar) {
        this.zzd = zzhdsVar.zzb();
        byteBuffer.remaining();
        this.zze = j;
        this.zzf = zzhdsVar;
        zzhdsVar.zze(zzhdsVar.zzb() + j);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        try {
            zzc();
            zzhdy zzhdyVar = zzg;
            String str = this.zza;
            zzhdyVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.zzh;
            if (byteBuffer != null) {
                this.zzb = true;
                byteBuffer.rewind();
                zze(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.zzh = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
