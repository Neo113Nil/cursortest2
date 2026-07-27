package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhhn extends zzhfz {
    private final zzhhs zza;
    private final zzicj zzb;
    private final zzich zzc;

    @Nullable
    private final Integer zzd;

    private zzhhn(zzhhs zzhhsVar, zzicj zzicjVar, zzich zzichVar, @Nullable Integer num) {
        this.zza = zzhhsVar;
        this.zzb = zzicjVar;
        this.zzc = zzichVar;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.ads.zzhfz, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhfz
    public final zzich zzc() {
        return this.zzc;
    }

    public final zzicj zze() {
        return this.zzb;
    }

    public final zzhhs zzf() {
        return this.zza;
    }

    public static zzhhn zzd(zzhhr zzhhrVar, zzicj zzicjVar, @Nullable Integer num) throws GeneralSecurityException {
        zzich zzb;
        zzhhr zzhhrVar2 = zzhhr.zzc;
        if (zzhhrVar != zzhhrVar2 && num == null) {
            String obj = zzhhrVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 62);
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhhrVar == zzhhrVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzicjVar.zzd() != 32) {
            int zzd = zzicjVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzd).length() + 74);
            sb2.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(zzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzhhs zzb2 = zzhhs.zzb(zzhhrVar);
        if (zzb2.zzc() == zzhhrVar2) {
            zzb = zzhnx.zza;
        } else if (zzb2.zzc() == zzhhr.zzb) {
            zzb = zzhnx.zza(num.intValue());
        } else {
            if (zzb2.zzc() != zzhhr.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zzc().toString()));
            }
            zzb = zzhnx.zzb(num.intValue());
        }
        return new zzhhn(zzb2, zzicjVar, zzb, num);
    }
}
