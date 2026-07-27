package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhor {
    public static zzich zza(zzhfm zzhfmVar, @Nullable Integer num) throws GeneralSecurityException {
        if (zzhfmVar == zzhfm.zzd) {
            if (num == null) {
                return zzhnx.zza;
            }
            throw new GeneralSecurityException("RAW output prefix type cannot have an id requirement");
        }
        if (num != null) {
            if (zzhfmVar == zzhfm.zzb) {
                return zzhnx.zzb(num.intValue());
            }
            if (zzhfmVar == zzhfm.zzc || zzhfmVar == zzhfm.zze) {
                return zzhnx.zza(num.intValue());
            }
            throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(zzhfmVar.toString()));
        }
        String obj = zzhfmVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 40);
        sb.append("idRequirement must be non-null for ");
        sb.append(obj);
        sb.append(" type");
        throw new GeneralSecurityException(sb.toString());
    }

    public static int zzb(zzhfl zzhflVar) throws GeneralSecurityException {
        if (zzhflVar.equals(zzhfl.zza)) {
            return 2;
        }
        if (zzhflVar.equals(zzhfl.zzb)) {
            return 3;
        }
        if (zzhflVar.equals(zzhfl.zzc)) {
            return 4;
        }
        if (zzhflVar.equals(zzhfl.zzd)) {
            return 5;
        }
        if (zzhflVar.equals(zzhfl.zze)) {
            return 6;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(zzhflVar.toString()));
    }

    public static zzhfl zzc(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 0) {
            return zzhfl.zza;
        }
        if (i2 == 1) {
            return zzhfl.zzb;
        }
        if (i2 == 2) {
            return zzhfl.zzc;
        }
        if (i2 == 3) {
            return zzhfl.zzd;
        }
        if (i2 == 4) {
            return zzhfl.zze;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(Integer.toString(i2)));
    }

    public static zzhfm zzd(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 0) {
            return zzhfm.zza;
        }
        if (i2 == 1) {
            return zzhfm.zzb;
        }
        if (i2 == 2) {
            return zzhfm.zzc;
        }
        if (i2 == 3) {
            return zzhfm.zzd;
        }
        if (i2 == 4) {
            return zzhfm.zze;
        }
        if (i2 == 5) {
            return zzhfm.zzf;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(Integer.toString(i2)));
    }

    public static int zze(zzhfm zzhfmVar) throws GeneralSecurityException {
        if (zzhfmVar.equals(zzhfm.zza)) {
            return 2;
        }
        if (zzhfmVar.equals(zzhfm.zzb)) {
            return 3;
        }
        if (zzhfmVar.equals(zzhfm.zzc)) {
            return 4;
        }
        if (zzhfmVar.equals(zzhfm.zzd)) {
            return 5;
        }
        if (zzhfmVar.equals(zzhfm.zze)) {
            return 6;
        }
        if (zzhfmVar.equals(zzhfm.zzf)) {
            return 7;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(zzhfmVar.toString()));
    }
}
