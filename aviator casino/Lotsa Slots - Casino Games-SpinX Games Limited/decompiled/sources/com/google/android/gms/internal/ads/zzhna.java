package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhna {
    private final java.util.Map zza = new java.util.HashMap();

    public final com.google.android.gms.internal.ads.zzhna zza(com.google.android.gms.internal.ads.zziaz zziazVar, java.lang.Object obj) throws java.security.GeneralSecurityException {
        java.util.List list;
        if (zziazVar.zzd() != 0 && zziazVar.zzd() != 5) {
            throw new java.security.GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        java.util.Map map = this.zza;
        if (map.containsKey(zziazVar)) {
            list = (java.util.List) map.get(zziazVar);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            map.put(zziazVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhnc zzb() {
        return new com.google.android.gms.internal.ads.zzhnc(this.zza, null);
    }
}
