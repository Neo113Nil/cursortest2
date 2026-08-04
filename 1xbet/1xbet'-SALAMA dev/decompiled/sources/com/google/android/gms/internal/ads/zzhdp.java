package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzhdp extends zzhdn implements zzaqo {
    private int zzg;

    public zzhdp(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    public final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzaqn.zzc(byteBuffer.get());
        zzaqn.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
