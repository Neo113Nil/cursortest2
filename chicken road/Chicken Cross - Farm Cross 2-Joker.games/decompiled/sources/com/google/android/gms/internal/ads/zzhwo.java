package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhwo extends zzhyo {
    private final zzhwh zza;
    private final zzich zzb;
    private final zzich zzc;

    @Nullable
    private final Integer zzd;

    private zzhwo(zzhwh zzhwhVar, zzich zzichVar, zzich zzichVar2, @Nullable Integer num) {
        this.zza = zzhwhVar;
        this.zzb = zzichVar;
        this.zzc = zzichVar2;
        this.zzd = num;
    }

    public static zzhwo zzc(zzhwg zzhwgVar, zzich zzichVar, @Nullable Integer num) throws GeneralSecurityException {
        zzich zza;
        zzhwh zzb = zzhwh.zzb(zzhwgVar);
        zzhwg zzhwgVar2 = zzhwg.zzd;
        if (!zzhwgVar.equals(zzhwgVar2) && num == null) {
            String obj = zzhwgVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhwgVar.equals(zzhwgVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzichVar.zzd() != 32) {
            int zzd = zzichVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzd).length() + 65);
            sb2.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzb.zzc() == zzhwgVar2) {
            zza = zzhnx.zza;
        } else if (zzb.zzc() == zzhwg.zzb || zzb.zzc() == zzhwg.zzc) {
            zza = zzhnx.zza(num.intValue());
        } else {
            if (zzb.zzc() != zzhwg.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb.zzc().toString()));
            }
            zza = zzhnx.zzb(num.intValue());
        }
        return new zzhwo(zzb, zzichVar, zza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhyo, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzich zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhyo
    public final zzich zze() {
        return this.zzc;
    }

    public final zzhwh zzf() {
        return this.zza;
    }
}
