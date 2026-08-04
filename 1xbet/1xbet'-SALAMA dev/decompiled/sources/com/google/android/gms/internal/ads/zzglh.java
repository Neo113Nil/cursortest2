package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzglh {
    public static final zzgkz zza = new zzglf(null);

    public static zzgle zza(zzgmu zzgmuVar) {
        zzglb zzglbVar = new zzglb();
        zzglbVar.zzb(zzgmuVar.zza());
        Iterator it = zzgmuVar.zze().iterator();
        while (it.hasNext()) {
            for (zzgms zzgmsVar : (List) it.next()) {
                zzglbVar.zza(zzgmsVar.zzb(), zzgmsVar.zzc(), zzgmsVar.zza());
            }
        }
        if (zzgmuVar.zzc() != null) {
            zzglbVar.zzc(zzgmuVar.zzc().zza());
        }
        try {
            return zzglbVar.zzd();
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
