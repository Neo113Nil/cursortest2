package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbx implements com.google.android.libraries.places.internal.zzcam {
    private final com.google.android.libraries.places.internal.zzcff zza;
    private int zzb;
    private int zzc;

    @Override // com.google.android.libraries.places.internal.zzcam
    public final void zza(byte[] bArr, int i, int i2) {
        this.zza.zzz(bArr, i, i2);
        this.zzb -= i2;
        this.zzc += i2;
    }

    @Override // com.google.android.libraries.places.internal.zzcam
    public final void zzb(byte b) {
        this.zza.zzA(b);
        this.zzb--;
        this.zzc++;
    }

    final com.google.android.libraries.places.internal.zzcff zze() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzcam
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzcam
    public final int zzc() {
        return this.zzb;
    }

    zzcbx(com.google.android.libraries.places.internal.zzcff zzcffVar, int i) {
        this.zza = zzcffVar;
        this.zzb = i;
    }
}
