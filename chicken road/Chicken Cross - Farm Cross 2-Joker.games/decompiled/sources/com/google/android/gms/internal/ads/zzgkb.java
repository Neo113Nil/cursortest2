package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgkb extends zzgka {
    private final Map zza;
    private final zzgff zzb;

    zzgkb(zzaya zzayaVar, zzgiw zzgiwVar, zzgff zzgffVar, Map map, zzgrh zzgrhVar) {
        super("FRbH3YSkWLoeHfFsbLmVPzOa63aS7qRNcxlL25CUBAPaDEl/9m5xoZHvOSUnXb3F", "n3MzKzWgNLpU97/XE2w+GCw7DhFJXqnLmao7nSZ1jSU=", zzayaVar, zzgiwVar, zzgrhVar.zza(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        this.zza = map;
        this.zzb = zzgffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    protected final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.zza;
        lArr[0] = (Long) zzguh.zza((Long) map.get("tcq"), -1L);
        lArr[1] = (Long) zzguh.zza((Long) map.get("tpq"), -1L);
        lArr[2] = (Long) zzguh.zza((Long) map.get("tcv"), -1L);
        lArr[3] = (Long) zzguh.zza((Long) map.get("tpv"), -1L);
        lArr[4] = (Long) zzguh.zza((Long) map.get("tchv"), -1L);
        lArr[5] = (Long) zzguh.zza((Long) map.get("tphv"), -1L);
        lArr[6] = (Long) zzguh.zza((Long) map.get("tcc"), -1L);
        lArr[7] = (Long) zzguh.zza((Long) map.get("tpc"), -1L);
        lArr[8] = (Long) zzguh.zza((Long) map.get("tst"), -1L);
        for (int i = 0; i < 9; i++) {
            if (lArr[i] == null) {
                lArr[i] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.zzb.ordinal()));
        lArr2.getClass();
        Long[] lArr3 = lArr2;
        synchronized (zzayaVar) {
            zzayaVar.zzac(lArr3[0].longValue());
            zzayaVar.zzs(lArr3[1].longValue());
            zzayaVar.zzn(lArr3[2].longValue());
            zzayaVar.zzk(lArr3[3].longValue());
            zzayaVar.zzY(lArr3[4].longValue());
            zzayaVar.zzZ(lArr3[5].longValue());
            zzayaVar.zzF(lArr3[6].longValue());
            zzayaVar.zzG(lArr3[7].longValue());
        }
    }
}
