package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class zzhdo extends zzhdr implements zzaqo {
    protected final String zza = "moov";

    public zzhdo(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final void zzb(zzhds zzhdsVar, ByteBuffer byteBuffer, long j, zzaql zzaqlVar) {
        zzhdsVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhdsVar;
        this.zze = zzhdsVar.zzb();
        zzhdsVar.zze(zzhdsVar.zzb() + j);
        this.zzf = zzhdsVar.zzb();
        this.zzb = zzaqlVar;
    }
}
