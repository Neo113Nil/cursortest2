package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzinf extends zzind implements zzavd {
    private int zzg;

    protected zzinf(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    protected final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzavc.zzc(byteBuffer.get());
        zzavc.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
