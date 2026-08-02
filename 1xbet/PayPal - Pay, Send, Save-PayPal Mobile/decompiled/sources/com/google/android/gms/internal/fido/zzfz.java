package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzfz extends com.google.android.gms.internal.fido.zzfp {
    private final java.security.MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    /* synthetic */ zzfz(java.security.MessageDigest messageDigest, int i, com.google.android.gms.internal.fido.zzfy zzfyVar) {
        this.zza = messageDigest;
        this.zzb = i;
    }

    private final void zzd() {
        com.google.android.gms.internal.fido.zzbm.zzf(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.gms.internal.fido.zzfp
    protected final void zzb(byte[] bArr, int i, int i2) {
        zzd();
        this.zza.update(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.fido.zzfv
    public final com.google.android.gms.internal.fido.zzft zzc() {
        zzd();
        this.zzc = true;
        int i = this.zzb;
        if (i == this.zza.getDigestLength()) {
            byte[] digest = this.zza.digest();
            int i2 = com.google.android.gms.internal.fido.zzft.zzb;
            return new com.google.android.gms.internal.fido.zzfs(digest);
        }
        byte[] copyOf = java.util.Arrays.copyOf(this.zza.digest(), i);
        int i3 = com.google.android.gms.internal.fido.zzft.zzb;
        return new com.google.android.gms.internal.fido.zzfs(copyOf);
    }
}
