package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzhhx implements zzhoj {
    static final /* synthetic */ zzhhx zza = new zzhhx();

    private /* synthetic */ zzhhx() {
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public final /* synthetic */ Object zza(zzhes zzhesVar) {
        zzhii zzhiiVar = (zzhii) zzhesVar;
        int i = zzhhz.zza;
        String zzb = zzhiiVar.zze().zzb();
        zzhga zzd = zzhiiVar.zze().zzd();
        zzhek zzb2 = zzhfh.zza(zzb).zzb();
        int i2 = zzhhw.zza;
        try {
            return zzhla.zzc(new zzhhw(zzhtw.zzc(zzhft.zza(zzd), zziew.zzb()), zzb2), zzhiiVar.zzc());
        } catch (zzige e) {
            throw new GeneralSecurityException(e);
        }
    }
}
