package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzine extends zzinh implements zzavd {
    protected final String zza = "moov";

    public zzine(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzavd
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzavd
    public final void zzb(zzini zziniVar, ByteBuffer byteBuffer, long j, zzava zzavaVar) throws IOException {
        zziniVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zziniVar;
        this.zze = zziniVar.zzc();
        zziniVar.zzd(zziniVar.zzc() + j);
        this.zzf = zziniVar.zzc();
        this.zzb = zzavaVar;
    }
}
