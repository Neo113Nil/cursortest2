package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhmn {
    private static final com.google.android.gms.internal.ads.zzhmn zzb = new com.google.android.gms.internal.ads.zzhmn();
    private final java.util.Map zza = new java.util.HashMap();

    zzhmn() {
    }

    public static com.google.android.gms.internal.ads.zzhmn zza() {
        return zzb;
    }

    public final synchronized void zzb(java.lang.String str, com.google.android.gms.internal.ads.zzheh zzhehVar) throws java.security.GeneralSecurityException {
        java.util.Map map = this.zza;
        if (!map.containsKey(str)) {
            map.put(str, zzhehVar);
            return;
        }
        if (((com.google.android.gms.internal.ads.zzheh) map.get(str)).equals(zzhehVar)) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(map.get(str));
        java.lang.String valueOf2 = java.lang.String.valueOf(zzhehVar);
        int length = java.lang.String.valueOf(str).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 45 + java.lang.String.valueOf(valueOf).length() + 17 + java.lang.String.valueOf(valueOf2).length());
        sb.append("Parameters object with name ");
        sb.append(str);
        sb.append(" already exists (");
        sb.append(valueOf);
        sb.append("), cannot insert ");
        sb.append(valueOf2);
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public final synchronized com.google.android.gms.internal.ads.zzheh zzc(java.lang.String str) throws java.security.GeneralSecurityException {
        java.util.Map map;
        map = this.zza;
        if (!map.containsKey("AES128_GCM")) {
            throw new java.security.GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (com.google.android.gms.internal.ads.zzheh) map.get("AES128_GCM");
    }

    public final synchronized void zzd(java.util.Map map) throws java.security.GeneralSecurityException {
        for (java.util.Map.Entry entry : map.entrySet()) {
            zzb((java.lang.String) entry.getKey(), (com.google.android.gms.internal.ads.zzheh) entry.getValue());
        }
    }
}
