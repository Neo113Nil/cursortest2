package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxq extends com.google.android.libraries.places.internal.zzboh {
    int zza;
    final int zzb;
    final byte[] zzc;
    int zzd = -1;

    zzbxq(byte[] bArr, int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "offset must be >= 0");
        com.google.common.base.Preconditions.checkArgument(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        com.google.common.base.Preconditions.checkArgument(i3 <= bArr.length, "offset + length exceeds array boundary");
        this.zzc = (byte[]) com.google.common.base.Preconditions.checkNotNull(bArr, com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES);
        this.zza = i;
        this.zzb = i3;
    }

    @Override // com.google.android.libraries.places.internal.zzboh, com.google.android.libraries.places.internal.zzbxo
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzboh, com.google.android.libraries.places.internal.zzbxo
    public final void zzc() {
        int i = this.zzd;
        if (i == -1) {
            throw new java.nio.InvalidMarkException();
        }
        this.zza = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final int zzg() {
        zzd(1);
        int i = this.zza;
        this.zza = i + 1;
        return this.zzc[i] & 255;
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzh(int i) {
        zzd(i);
        this.zza += i;
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzi(byte[] bArr, int i, int i2) {
        java.lang.System.arraycopy(this.zzc, this.zza, bArr, i, i2);
        this.zza += i2;
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzj(java.nio.ByteBuffer byteBuffer) {
        com.google.common.base.Preconditions.checkNotNull(byteBuffer, "dest");
        int remaining = byteBuffer.remaining();
        zzd(remaining);
        byteBuffer.put(this.zzc, this.zza, remaining);
        this.zza += remaining;
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzk(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        zzd(i);
        outputStream.write(this.zzc, this.zza, i);
        this.zza += i;
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final /* synthetic */ com.google.android.libraries.places.internal.zzbxo zzl(int i) {
        zzd(i);
        int i2 = this.zza;
        this.zza = i2 + i;
        return new com.google.android.libraries.places.internal.zzbxq(this.zzc, i2, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final int zzf() {
        return this.zzb - this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzboh, com.google.android.libraries.places.internal.zzbxo
    public final void zzb() {
        this.zzd = this.zza;
    }
}
