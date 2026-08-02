package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgnx implements zzgmv {
    private static final zzgnx zza = new zzgnx();

    private zzgnx() {
    }

    public static void zzd() {
        zzglr.zza().zzd(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final Class zza() {
        return zzgnu.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final Class zzb() {
        return zzgnu.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final /* bridge */ /* synthetic */ Object zzc(zzgmu zzgmuVar) {
        if (zzgmuVar.zzc() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        zzgmf zzgmfVar = new zzgmf();
        for (zzgms zzgmsVar : zzgmuVar.zzf()) {
            zzgmfVar.zza(zzgmsVar.zzd(), (zzgnu) zzgmsVar.zze());
        }
        return new zzgnv(zzgmfVar.zzb(), (zzgnu) zzgmuVar.zzc().zze(), null);
    }
}
