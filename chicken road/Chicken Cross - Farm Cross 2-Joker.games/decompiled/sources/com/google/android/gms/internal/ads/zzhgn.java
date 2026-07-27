package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhgn {

    @Nullable
    private zzhgu zza = null;

    @Nullable
    private zzicj zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhgn() {
    }

    /* synthetic */ zzhgn(byte[] bArr) {
    }

    public final zzhgn zza(zzhgu zzhguVar) {
        this.zza = zzhguVar;
        return this;
    }

    public final zzhgn zzb(zzicj zzicjVar) {
        this.zzb = zzicjVar;
        return this;
    }

    public final zzhgn zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhgo zzd() throws GeneralSecurityException {
        zzicj zzicjVar;
        zzich zzb;
        zzhgu zzhguVar = this.zza;
        if (zzhguVar == null || (zzicjVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhguVar.zzc() != zzicjVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhguVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhgt.zzc) {
            zzb = zzhnx.zza;
        } else if (this.zza.zze() == zzhgt.zzb) {
            zzb = zzhnx.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhgt.zza) {
                String valueOf = String.valueOf(this.zza.zze());
                String.valueOf(valueOf);
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(valueOf)));
            }
            zzb = zzhnx.zzb(this.zzc.intValue());
        }
        return new zzhgo(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
