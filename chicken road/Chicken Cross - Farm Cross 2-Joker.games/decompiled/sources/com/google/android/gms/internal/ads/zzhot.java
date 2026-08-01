package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhot implements zzhow {
    private final zzich zza;
    private final zzhtw zzb;
    private final zzhfm zzc;

    private zzhot(zzhtw zzhtwVar, zzich zzichVar, zzhfm zzhfmVar) {
        this.zzb = zzhtwVar;
        this.zza = zzichVar;
        this.zzc = zzhfmVar;
    }

    public static zzhot zza(String str, zzhfm zzhfmVar, zziei zzieiVar) throws GeneralSecurityException {
        int i;
        zzhtv zzd = zzhtw.zzd();
        zzd.zza(str);
        if (zzhfmVar.equals(zzhfm.zza)) {
            i = 2;
        } else if (zzhfmVar.equals(zzhfm.zzb)) {
            i = 3;
        } else if (zzhfmVar.equals(zzhfm.zzc)) {
            i = 4;
        } else if (zzhfmVar.equals(zzhfm.zzd)) {
            i = 5;
        } else if (zzhfmVar.equals(zzhfm.zze)) {
            i = 6;
        } else {
            if (!zzhfmVar.equals(zzhfm.zzf)) {
                throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(zzhfmVar.toString()));
            }
            i = 7;
        }
        zzd.zzc(i);
        zzd.zzb(zzieiVar);
        return zzb((zzhtw) zzd.zzbu());
    }

    public static zzhot zzb(zzhtw zzhtwVar) throws GeneralSecurityException {
        zzhfm zzhfmVar;
        zzich zzb = zzhpd.zzb(zzhtwVar.zza());
        int zzk = zzhtwVar.zzk() - 2;
        if (zzk == 0) {
            zzhfmVar = zzhfm.zza;
        } else if (zzk == 1) {
            zzhfmVar = zzhfm.zzb;
        } else if (zzk == 2) {
            zzhfmVar = zzhfm.zzc;
        } else if (zzk == 3) {
            zzhfmVar = zzhfm.zzd;
        } else if (zzk == 4) {
            zzhfmVar = zzhfm.zze;
        } else {
            if (zzk != 5) {
                throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(Integer.toString(zzk)));
            }
            zzhfmVar = zzhfm.zzf;
        }
        return new zzhot(zzhtwVar, zzb, zzhfmVar);
    }

    public final zzhtw zzc() {
        return this.zzb;
    }

    public final zzhfm zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhow
    public final zzich zzf() {
        return this.zza;
    }
}
