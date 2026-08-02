package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzht extends zzhj {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzht(MessageDigest messageDigest, int i7, zzhs zzhsVar) {
        this.zza = messageDigest;
        this.zzb = i7;
    }

    private final void zzc() {
        zzgx.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzhj
    public final void zza(byte[] bArr, int i7, int i8) {
        zzc();
        this.zza.update(bArr, 0, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzhp
    public final zzhn zzb() {
        zzc();
        this.zzc = true;
        int i7 = this.zzb;
        if (i7 == this.zza.getDigestLength()) {
            byte[] digest = this.zza.digest();
            int i8 = zzhn.zzb;
            return new zzhm(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.zza.digest(), i7);
        int i9 = zzhn.zzb;
        return new zzhm(copyOf);
    }
}
