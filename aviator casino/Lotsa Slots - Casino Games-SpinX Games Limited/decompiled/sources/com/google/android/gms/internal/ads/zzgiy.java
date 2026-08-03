package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgiy extends com.google.android.gms.internal.ads.zzgix {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzgec zzb;

    zzgiy(com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, com.google.android.gms.internal.ads.zzgec zzgecVar, java.util.Map map, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        super("XWXJTGd1s4KBDryg9VrXAlY4jSAcYHe04/o6OdELnmUPXEyQBHBmyyV+Jg4HZM6P", "cfM2dBB5yNtLTWMY73EdilHQtVEOY0O+uF0cubJKH2M=", zzaxmVar, zzghtVar, zzgqhVar.zza(122));
        this.zza = map;
        this.zzb = zzgecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Long[] lArr = new java.lang.Long[9];
        java.util.Arrays.fill((java.lang.Object[]) lArr, (java.lang.Object) (-1L));
        java.util.Map map = this.zza;
        lArr[0] = (java.lang.Long) com.google.android.gms.internal.ads.zzgtg.zza((java.lang.Long) map.get("tcq"), -1L);
        lArr[1] = (java.lang.Long) com.google.android.gms.internal.ads.zzgtg.zza((java.lang.Long) map.get("tpq"), -1L);
        lArr[2] = (java.lang.Long) com.google.android.gms.internal.ads.zzgtg.zza((java.lang.Long) map.get("tcv"), -1L);
        lArr[3] = (java.lang.Long) com.google.android.gms.internal.ads.zzgtg.zza((java.lang.Long) map.get("tpv"), -1L);
        lArr[4] = (java.lang.Long) com.google.android.gms.internal.ads.zzgtg.zza((java.lang.Long) map.get("tchv"), -1L);
        lArr[5] = (java.lang.Long) com.google.android.gms.internal.ads.zzgtg.zza((java.lang.Long) map.get("tphv"), -1L);
        lArr[6] = (java.lang.Long) com.google.android.gms.internal.ads.zzgtg.zza((java.lang.Long) map.get("tcc"), -1L);
        lArr[7] = (java.lang.Long) com.google.android.gms.internal.ads.zzgtg.zza((java.lang.Long) map.get("tpc"), -1L);
        lArr[8] = (java.lang.Long) com.google.android.gms.internal.ads.zzgtg.zza((java.lang.Long) map.get("tst"), -1L);
        for (int i = 0; i < 9; i++) {
            if (lArr[i] == null) {
                lArr[i] = -1L;
            }
        }
        java.lang.Long[] lArr2 = (java.lang.Long[]) method.invoke("", lArr, java.lang.Integer.valueOf(this.zzb.ordinal()));
        lArr2.getClass();
        java.lang.Long[] lArr3 = lArr2;
        synchronized (zzaxmVar) {
            zzaxmVar.zzac(lArr3[0].longValue());
            zzaxmVar.zzs(lArr3[1].longValue());
            zzaxmVar.zzn(lArr3[2].longValue());
            zzaxmVar.zzk(lArr3[3].longValue());
            zzaxmVar.zzY(lArr3[4].longValue());
            zzaxmVar.zzZ(lArr3[5].longValue());
            zzaxmVar.zzF(lArr3[6].longValue());
            zzaxmVar.zzG(lArr3[7].longValue());
        }
    }
}
