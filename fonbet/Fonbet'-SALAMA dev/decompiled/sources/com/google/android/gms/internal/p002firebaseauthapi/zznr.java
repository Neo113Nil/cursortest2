package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zznr {
    public static final zznk zza = new zznt();

    public static <P> zznn zza(zzoz<P> zzozVar) {
        zzbr zzbrVar;
        zznm zznmVar = new zznm();
        zznmVar.zza(zzozVar.zza());
        Iterator<List<zzpb<P>>> it = zzozVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzpb<P> zzpbVar : it.next()) {
                int i7 = zznq.zza[zzpbVar.zzb().ordinal()];
                if (i7 == 1) {
                    zzbrVar = zzbr.zza;
                } else if (i7 == 2) {
                    zzbrVar = zzbr.zzb;
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzbrVar = zzbr.zzc;
                }
                int zza2 = zzpbVar.zza();
                String zze = zzpbVar.zze();
                if (zze.startsWith("type.googleapis.com/google.crypto.")) {
                    zze = zze.substring(34);
                }
                zznmVar.zza(zzbrVar, zza2, zze, zzpbVar.zzc().name());
            }
        }
        if (zzozVar.zzb() != null) {
            zznmVar.zza(zzozVar.zzb().zza());
        }
        try {
            return zznmVar.zza();
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
