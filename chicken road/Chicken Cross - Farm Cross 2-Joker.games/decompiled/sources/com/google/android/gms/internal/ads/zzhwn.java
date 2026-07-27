package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhwn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhok zzb = zzhok.zzd(zzhwl.zza, zzhwi.class, zzhfn.class);
    private static final zzhok zzc = zzhok.zzd(zzhwm.zza, zzhwo.class, zzhfo.class);
    private static final zzhfk zzd = zzhnc.zze("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzhfn.class, zzhth.zzg());
    private static final zzhet zze = zzhnc.zzf("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzhfo.class, 5, zzhtj.zzg());
    private static final zzhno zzf = zzhwk.zza;
    private static final zzhmt zzg = zzhwj.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i = zzhzi.zza;
        zzhzi.zza(zzhnw.zza());
        zzhns zza2 = zzhns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("ED25519", zzhwh.zzb(zzhwg.zza));
        zzhwg zzhwgVar = zzhwg.zzd;
        hashMap.put("ED25519_RAW", zzhwh.zzb(zzhwgVar));
        hashMap.put("ED25519WithRawOutput", zzhwh.zzb(zzhwgVar));
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhnn.zza().zzb(zzg, zzhwh.class);
        zzhnp.zza().zzb(zzf, zzhwh.class);
        zzhnt.zza().zzb(zzb);
        zzhnt.zza().zzb(zzc);
        zzhmu.zza().zzb(zzd, true);
        zzhmu.zza().zzb(zze, false);
    }
}
