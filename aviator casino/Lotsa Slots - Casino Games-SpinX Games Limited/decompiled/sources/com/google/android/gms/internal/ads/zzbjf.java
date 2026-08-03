package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class zzbjf {
    private final java.util.List zza = new java.util.LinkedList();
    private final java.util.Map zzb;
    private final java.lang.Object zzc;

    public zzbjf(boolean z, java.lang.String str, java.lang.String str2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new java.lang.Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public static final com.google.android.gms.internal.ads.zzbjc zzf() {
        return new com.google.android.gms.internal.ads.zzbjc(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(com.google.android.gms.internal.ads.zzbjf zzbjfVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzbjc zzbjcVar, long j, java.lang.String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new com.google.android.gms.internal.ads.zzbjc(j, strArr[0], zzbjcVar));
        }
        return true;
    }

    public final com.google.android.gms.internal.ads.zzbje zzc() {
        com.google.android.gms.internal.ads.zzbje zzbjeVar;
        boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.HashMap hashMap = new java.util.HashMap();
        synchronized (this.zzc) {
            java.util.List<com.google.android.gms.internal.ads.zzbjc> list = this.zza;
            for (com.google.android.gms.internal.ads.zzbjc zzbjcVar : list) {
                long zza = zzbjcVar.zza();
                java.lang.String zzb = zzbjcVar.zzb();
                com.google.android.gms.internal.ads.zzbjc zzc = zzbjcVar.zzc();
                if (zzc != null && zza > 0) {
                    long zza2 = zza - zzc.zza();
                    sb.append(zzb);
                    sb.append('.');
                    sb.append(zza2);
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                    if (booleanValue) {
                        if (hashMap.containsKey(java.lang.Long.valueOf(zzc.zza()))) {
                            java.lang.StringBuilder sb2 = (java.lang.StringBuilder) hashMap.get(java.lang.Long.valueOf(zzc.zza()));
                            sb2.append('+');
                            sb2.append(zzb);
                        } else {
                            hashMap.put(java.lang.Long.valueOf(zzc.zza()), new java.lang.StringBuilder(zzb));
                        }
                    }
                }
            }
            list.clear();
            java.lang.String str = null;
            if (!android.text.TextUtils.isEmpty(null)) {
                sb.append((java.lang.String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            if (booleanValue) {
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((java.lang.CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + (((java.lang.Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
                    sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbjeVar = new com.google.android.gms.internal.ads.zzbje(sb.toString(), str);
        }
        return zzbjeVar;
    }

    public final void zzd(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzbiv zza;
        if (android.text.TextUtils.isEmpty(str2) || (zza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            com.google.android.gms.internal.ads.zzbjb zzd = zza.zzd(str);
            java.util.Map map = this.zzb;
            map.put(str, zzd.zza((java.lang.String) map.get(str), str2));
        }
    }

    public final java.util.Map zze() {
        java.util.Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
