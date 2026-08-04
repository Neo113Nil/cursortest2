package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgpl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvd zzb;
    private static final zzgkd zzc;
    private static final zzgkd zzd;
    private static final zzgmd zze;
    private static final zzglz zzf;
    private static final zzgkp zzg;
    private static final zzgkl zzh;

    static {
        zzgvd zzgvdVarZzb = zzgni.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzgvdVarZzb;
        zzgkb zzgkbVarZza = zzgkd.zza();
        zzgkbVarZza.zza(zzgte.RAW, zzgoi.zzd);
        zzgkbVarZza.zza(zzgte.TINK, zzgoi.zza);
        zzgkbVarZza.zza(zzgte.LEGACY, zzgoi.zzc);
        zzgkbVarZza.zza(zzgte.CRUNCHY, zzgoi.zzb);
        zzc = zzgkbVarZza.zzb();
        zzgkb zzgkbVarZza2 = zzgkd.zza();
        zzgkbVarZza2.zza(zzgrn.SHA1, zzgoh.zza);
        zzgkbVarZza2.zza(zzgrn.SHA224, zzgoh.zzb);
        zzgkbVarZza2.zza(zzgrn.SHA256, zzgoh.zzc);
        zzgkbVarZza2.zza(zzgrn.SHA384, zzgoh.zzd);
        zzgkbVarZza2.zza(zzgrn.SHA512, zzgoh.zze);
        zzd = zzgkbVarZza2.zzb();
        zze = zzgmd.zzb(new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgph
            @Override // com.google.android.gms.internal.ads.zzgmb
            public final zzgna zza(zzgdf zzgdfVar) {
                return zzgpl.zzb((zzgok) zzgdfVar);
            }
        }, zzgok.class, zzgmx.class);
        zzf = zzglz.zzb(new zzglx() { // from class: com.google.android.gms.internal.ads.zzgpi
            @Override // com.google.android.gms.internal.ads.zzglx
            public final zzgdf zza(zzgna zzgnaVar) {
                return zzgpl.zzd((zzgmx) zzgnaVar);
            }
        }, zzgvdVarZzb, zzgmx.class);
        zzg = zzgkp.zzb(new zzgkn() { // from class: com.google.android.gms.internal.ads.zzgpj
            @Override // com.google.android.gms.internal.ads.zzgkn
            public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                return zzgpl.zza((zzgoa) zzgcsVar, zzgdjVar);
            }
        }, zzgoa.class, zzgmw.class);
        zzh = zzgkl.zzb(new zzgkj() { // from class: com.google.android.gms.internal.ads.zzgpk
            @Override // com.google.android.gms.internal.ads.zzgkj
            public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
                return zzgpl.zzc((zzgmw) zzgnaVar, zzgdjVar);
            }
        }, zzgvdVarZzb, zzgmw.class);
    }

    public static /* synthetic */ zzgmw zza(zzgoa zzgoaVar, zzgdj zzgdjVar) {
        zzgro zzgroVarZzb = zzgrq.zzb();
        zzgroVarZzb.zzb(zzf(zzgoaVar.zzc()));
        byte[] bArrZzd = zzgoaVar.zze().zzd(zzgdjVar);
        zzgroVarZzb.zza(zzgvy.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgmw.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgrq) zzgroVarZzb.zzbr()).zzaN(), zzgry.SYMMETRIC, (zzgte) zzc.zzb(zzgoaVar.zzc().zzg()), zzgoaVar.zzf());
    }

    public static /* synthetic */ zzgmx zzb(zzgok zzgokVar) {
        zzgsc zzgscVarZza = zzgse.zza();
        zzgscVarZza.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgrr zzgrrVarZzc = zzgrt.zzc();
        zzgrrVarZzc.zzb(zzf(zzgokVar));
        zzgrrVarZzc.zza(zzgokVar.zzc());
        zzgscVarZza.zzc(((zzgrt) zzgrrVarZzc.zzbr()).zzaN());
        zzgscVarZza.zza((zzgte) zzc.zzb(zzgokVar.zzg()));
        return zzgmx.zzb((zzgse) zzgscVarZza.zzbr());
    }

    public static /* synthetic */ zzgoa zzc(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        if (!zzgmwVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgrq zzgrqVarZzf = zzgrq.zzf(zzgmwVar.zze(), zzgwq.zza());
            if (zzgrqVarZzf.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgog zzgogVarZze = zzgok.zze();
            zzgogVarZze.zzb(zzgrqVarZzf.zzh().zzd());
            zzgogVarZze.zzc(zzgrqVarZzf.zzg().zza());
            zzgogVarZze.zza((zzgoh) zzd.zzc(zzgrqVarZzf.zzg().zzb()));
            zzgogVarZze.zzd((zzgoi) zzc.zzc(zzgmwVar.zzc()));
            zzgok zzgokVarZze = zzgogVarZze.zze();
            zzgny zzgnyVarZzb = zzgoa.zzb();
            zzgnyVarZzb.zzc(zzgokVarZze);
            zzgnyVarZzb.zzb(zzgve.zzb(zzgrqVarZzf.zzh().zzA(), zzgdjVar));
            zzgnyVarZzb.zza(zzgmwVar.zzf());
            return zzgnyVarZzb.zzd();
        } catch (zzgxv | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzgok zzd(zzgmx zzgmxVar) throws GeneralSecurityException {
        if (!zzgmxVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgmxVar.zzc().zzi())));
        }
        try {
            zzgrt zzgrtVarZzg = zzgrt.zzg(zzgmxVar.zzc().zzh(), zzgwq.zza());
            if (zzgrtVarZzg.zzb() != 0) {
                throw new GeneralSecurityException(k.d(zzgrtVarZzg.zzb(), "Parsing HmacParameters failed: unknown Version "));
            }
            zzgog zzgogVarZze = zzgok.zze();
            zzgogVarZze.zzb(zzgrtVarZzg.zza());
            zzgogVarZze.zzc(zzgrtVarZzg.zzh().zza());
            zzgogVarZze.zza((zzgoh) zzd.zzc(zzgrtVarZzg.zzh().zzb()));
            zzgogVarZze.zzd((zzgoi) zzc.zzc(zzgmxVar.zzc().zzg()));
            return zzgogVarZze.zze();
        } catch (zzgxv e7) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e7);
        }
    }

    public static void zze(zzglu zzgluVar) {
        zzgluVar.zzi(zze);
        zzgluVar.zzh(zzf);
        zzgluVar.zzg(zzg);
        zzgluVar.zzf(zzh);
    }

    private static zzgrw zzf(zzgok zzgokVar) {
        zzgru zzgruVarZzc = zzgrw.zzc();
        zzgruVarZzc.zzb(zzgokVar.zzb());
        zzgruVarZzc.zza((zzgrn) zzd.zzb(zzgokVar.zzf()));
        return (zzgrw) zzgruVarZzc.zzbr();
    }
}
