package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import e1.k;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import w1.L;

/* loaded from: classes.dex */
public final class zzjg {
    private static final zzzc zza;
    private static final zzon<zziv, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzio, zzpc> zzd;
    private static final zzms<zzpc> zze;
    private static final Map<zziv.zzb, zzws> zzf;
    private static final Map<zzws, zziv.zzb> zzg;

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((zztl) ((zzajy) zztl.zzc().zza(r1.zzb()).zze())).a_()).zza(zzjg.zza(((zziv) zzchVar).zzd())).zze()));
                return zzb3;
            }
        }, zziv.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzji
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zziv zzb3;
                zzb3 = zzjg.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.AesSivKey", ((zzti) ((zzajy) zzti.zzb().zza(zzaip.zza(r1.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzjg.zza(r1.zzc().zzd()), ((zzio) zzbpVar).zza());
                return zza2;
            }
        }, zzio.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzio zzb3;
                zzb3 = zzjg.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
        HashMap hashMap = new HashMap();
        zziv.zzb zzbVar = zziv.zzb.zzc;
        zzws zzwsVar = zzws.RAW;
        hashMap.put(zzbVar, zzwsVar);
        zziv.zzb zzbVar2 = zziv.zzb.zza;
        zzws zzwsVar2 = zzws.TINK;
        hashMap.put(zzbVar2, zzwsVar2);
        zziv.zzb zzbVar3 = zziv.zzb.zzb;
        zzws zzwsVar3 = zzws.CRUNCHY;
        hashMap.put(zzbVar3, zzwsVar3);
        zzf = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(zzws.class);
        enumMap.put((EnumMap) zzwsVar, (zzws) zzbVar);
        enumMap.put((EnumMap) zzwsVar2, (zzws) zzbVar2);
        enumMap.put((EnumMap) zzwsVar3, (zzws) zzbVar3);
        enumMap.put((EnumMap) zzws.LEGACY, (zzws) zzbVar3);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzio zzb(zzpc zzpcVar, zzcn zzcnVar) {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            zzti zza2 = zzti.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzio.zzb().zza(zziv.zzc().zza(zza2.zzd().zzb()).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zza2.zzd().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    private static zziv.zzb zza(zzws zzwsVar) {
        Map<zzws, zziv.zzb> map = zzg;
        if (map.containsKey(zzwsVar)) {
            return map.get(zzwsVar);
        }
        throw new GeneralSecurityException(k.d(zzwsVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zziv zzb(zzpf zzpfVar) {
        if (zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zztl zza2 = zztl.zza(zzpfVar.zza().zze(), zzajk.zza());
                if (zza2.zzb() == 0) {
                    return zziv.zzc().zza(zza2.zza()).zza(zza(zzpfVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzakf e7) {
                throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException(L.i("Wrong type URL in call to AesSivParameters.parseParameters: ", zzpfVar.zza().zzf()));
    }

    private static zzws zza(zziv.zzb zzbVar) {
        Map<zziv.zzb, zzws> map = zzf;
        if (map.containsKey(zzbVar)) {
            return map.get(zzbVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static void zza() {
        zzof zza2 = zzof.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
