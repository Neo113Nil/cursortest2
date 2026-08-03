package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgwx extends com.google.android.gms.internal.ads.zzgws {
    public final com.google.android.gms.internal.ads.zzgwx zzb(java.lang.Object obj, java.lang.Object... objArr) {
        java.util.List asList = java.util.Arrays.asList(objArr);
        if (obj == null) {
            java.util.Iterator it = asList.iterator();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(com.ironsource.X3.j.d);
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z = false;
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            throw new java.lang.NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        java.util.Iterator it2 = asList.iterator();
        if (it2.hasNext()) {
            com.google.android.gms.internal.ads.zzgwh zzgwhVar = (com.google.android.gms.internal.ads.zzgwh) zza().get(obj);
            if (zzgwhVar == null) {
                zzgwhVar = com.google.android.gms.internal.ads.zzgww.zzt(asList instanceof java.util.Set ? java.lang.Math.max(4, ((java.util.Set) asList).size()) : 4);
                zza().put(obj, zzgwhVar);
            }
            while (it2.hasNext()) {
                java.lang.Object next = it2.next();
                com.google.android.gms.internal.ads.zzgvi.zza(obj, next);
                zzgwhVar.zzd(next);
            }
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgwz zzc() {
        java.util.Map map = this.zza;
        if (map == null) {
            return com.google.android.gms.internal.ads.zzgwa.zza;
        }
        java.util.Set<java.util.Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return com.google.android.gms.internal.ads.zzgwa.zza;
        }
        com.google.android.gms.internal.ads.zzgwo zzgwoVar = new com.google.android.gms.internal.ads.zzgwo(entrySet.size());
        int i = 0;
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Object key = entry.getKey();
            com.google.android.gms.internal.ads.zzgww zzp = com.google.android.gms.internal.ads.zzgww.zzp(((com.google.android.gms.internal.ads.zzgwv) entry.getValue()).zzh());
            if (!zzp.isEmpty()) {
                zzgwoVar.zza(key, zzp);
                i += zzp.size();
            }
        }
        return new com.google.android.gms.internal.ads.zzgwz(zzgwoVar.zzc(), i, null);
    }
}
