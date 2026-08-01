package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhhb {

    @Nullable
    private Integer zza = null;

    @Nullable
    private Integer zzb = null;

    @Nullable
    private Integer zzc = null;
    private zzhhc zzd = zzhhc.zzc;

    private zzhhb() {
    }

    /* synthetic */ zzhhb(byte[] bArr) {
    }

    public final zzhhb zzb(int i) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzhhb zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzhhb zzd(zzhhc zzhhcVar) {
        this.zzd = zzhhcVar;
        return this;
    }

    public final zzhhd zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        this.zzb.intValue();
        this.zzc.intValue();
        return new zzhhd(intValue, 12, 16, this.zzd, null);
    }

    public final zzhhb zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }
}
