package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzgvb {
    public static void zza(int i7) {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 * 8)));
        }
    }
}
