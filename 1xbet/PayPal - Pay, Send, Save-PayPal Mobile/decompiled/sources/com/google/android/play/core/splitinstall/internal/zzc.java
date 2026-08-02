package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
final class zzc implements com.google.android.play.core.splitinstall.internal.zzb {
    private final java.nio.channels.FileChannel zza;
    private final long zzb;
    private final long zzc;

    @Override // com.google.android.play.core.splitinstall.internal.zzb
    public final void zzb(java.security.MessageDigest[] messageDigestArr, long j, int i) throws java.io.IOException {
        java.nio.MappedByteBuffer map = this.zza.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, this.zzb + j, i);
        map.load();
        for (java.security.MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzb
    public final long zza() {
        return this.zzc;
    }

    public zzc(java.nio.channels.FileChannel fileChannel, long j, long j2) {
        this.zza = fileChannel;
        this.zzb = j;
        this.zzc = j2;
    }
}
