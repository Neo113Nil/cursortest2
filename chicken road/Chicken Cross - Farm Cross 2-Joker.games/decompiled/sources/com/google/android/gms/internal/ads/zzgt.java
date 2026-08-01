package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgt {
    public final int zza;
    public final ByteBuffer zzb;

    private zzgt(int i, ByteBuffer byteBuffer) {
        this.zza = i;
        this.zzb = byteBuffer;
    }

    public static zzgt zza(zzgv zzgvVar) {
        int zzd;
        zzguk.zza(zzgvVar.zza == 5);
        ByteBuffer asReadOnlyBuffer = zzgvVar.zzb.asReadOnlyBuffer();
        zzd = zzgx.zzd(asReadOnlyBuffer);
        return new zzgt(zzd, asReadOnlyBuffer);
    }
}
