package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zzglv {
    public static final zzgvd zza = zzgvd.zzb(new byte[0]);

    public static final zzgvd zza(int i7) {
        return zzgvd.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(i7).array());
    }

    public static final zzgvd zzb(int i7) {
        return zzgvd.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(i7).array());
    }
}
