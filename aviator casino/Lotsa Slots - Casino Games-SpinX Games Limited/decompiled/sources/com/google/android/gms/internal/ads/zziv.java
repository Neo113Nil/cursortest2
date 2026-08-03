package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zziv extends com.google.android.gms.internal.ads.zziq {
    public com.google.android.gms.internal.ads.zzv zza;
    public final com.google.android.gms.internal.ads.zzis zzb = new com.google.android.gms.internal.ads.zzis();
    public java.nio.ByteBuffer zzc;
    public boolean zzd;
    public long zze;
    public java.nio.ByteBuffer zzf;
    private final int zzg;

    static {
        com.google.android.gms.internal.ads.zzal.zzb("media3.decoder");
    }

    public zziv(int i, int i2) {
        this.zzg = i;
    }

    private final java.nio.ByteBuffer zzm(int i) {
        int i2 = this.zzg;
        if (i2 == 1) {
            return java.nio.ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return java.nio.ByteBuffer.allocateDirect(i);
        }
        java.nio.ByteBuffer byteBuffer = this.zzc;
        throw new com.google.android.gms.internal.ads.zziu(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public void zza() {
        super.zza();
        java.nio.ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        java.nio.ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzd = false;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"data"})
    public final void zzj(int i) {
        java.nio.ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            this.zzc = zzm(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.zzc = byteBuffer;
            return;
        }
        java.nio.ByteBuffer zzm = zzm(i2);
        zzm.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            zzm.put(byteBuffer);
        }
        this.zzc = zzm;
    }

    public final boolean zzk() {
        return zzi(1073741824);
    }

    public final void zzl() {
        java.nio.ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        java.nio.ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
