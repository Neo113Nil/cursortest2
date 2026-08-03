package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzimd extends com.google.android.gms.internal.ads.zzimb implements com.google.android.gms.internal.ads.zzaup {
    private int zzg;

    protected zzimd(java.lang.String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    protected final long zzh(java.nio.ByteBuffer byteBuffer) {
        this.zzg = com.google.android.gms.internal.ads.zzauo.zzc(byteBuffer.get());
        com.google.android.gms.internal.ads.zzauo.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
