package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzoc {
    private final java.util.Map zza;

    zzoc(java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.zza = hashMap;
        hashMap.putAll(map);
    }

    private final android.os.Bundle zzf() {
        int zzg;
        java.util.Map map = this.zza;
        if ("1".equals(map.get("GoogleConsent")) && (zzg = zzg()) >= 0) {
            java.lang.String str = (java.lang.String) map.get("PurposeConsents");
            if (!android.text.TextUtils.isEmpty(str)) {
                android.os.Bundle bundle = new android.os.Bundle();
                if (str.length() > 0) {
                    bundle.putString(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(com.google.android.gms.measurement.internal.zzjj.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && zzg >= 4) {
                    bundle.putString(com.google.android.gms.measurement.internal.zzjj.AD_USER_DATA.zze, (str.charAt(0) == '1' && str.charAt(6) == '1') ? "granted" : "denied");
                }
                return bundle;
            }
        }
        return android.os.Bundle.EMPTY;
    }

    private final int zzg() {
        try {
            java.lang.String str = (java.lang.String) this.zza.get("PolicyVersion");
            if (android.text.TextUtils.isEmpty(str)) {
                return -1;
            }
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.measurement.internal.zzoc) {
            return zza().equalsIgnoreCase(((com.google.android.gms.measurement.internal.zzoc) obj).zza());
        }
        return false;
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final java.lang.String toString() {
        return zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final java.lang.String zza() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.google.common.collect.ImmutableList immutableList = com.google.android.gms.measurement.internal.zzoe.zza;
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String str = (java.lang.String) immutableList.get(i);
            java.util.Map map = this.zza;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append(com.ironsource.X3.j.b);
                sb.append((java.lang.String) map.get(str));
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        if (r0.get("Version") != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        return zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (zzg() >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        r1 = new android.os.Bundle();
        r2 = com.google.android.gms.measurement.internal.zzjj.AD_STORAGE.zze;
        r6 = "denied";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (true == java.util.Objects.equals(r0.get("AuthorizePurpose1"), "1")) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        r4 = "denied";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        r1.putString(r2, r4);
        r2 = com.google.android.gms.measurement.internal.zzjj.AD_PERSONALIZATION.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose3"), "1") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose4"), "1") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        r4 = "granted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        r1.putString(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (zzg() < 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        r2 = com.google.android.gms.measurement.internal.zzjj.AD_USER_DATA.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose1"), "1") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose7"), "1") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        r6 = "granted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        r1.putString(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        r4 = "denied";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        r4 = "granted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        return zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004c, code lost:
    
        if ("1".equals(r2.get("EnableAdvertiserConsentMode")) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if ("1".equals(r2.get("EnableAdvertiserConsentMode")) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        if (((java.lang.Boolean) r0.zzb(null)).booleanValue() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        r0 = r9.zza;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.os.Bundle zzb() {
        com.google.android.gms.measurement.internal.zzfw zzfwVar = com.google.android.gms.measurement.internal.zzfx.zzaZ;
        if (((java.lang.Boolean) zzfwVar.zzb(null)).booleanValue()) {
            java.util.Map map = this.zza;
            if ("1".equals(map.get("gdprApplies"))) {
            }
            return android.os.Bundle.EMPTY;
        }
        java.util.Map map2 = this.zza;
        if ("1".equals(map2.get("GoogleConsent"))) {
            if ("1".equals(map2.get("gdprApplies"))) {
            }
        }
        return android.os.Bundle.EMPTY;
    }

    public final java.lang.String zzc() {
        java.lang.String str = (java.lang.String) this.zza.get("PurposeDiagnostics");
        return android.text.TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final java.lang.String zzd(com.google.android.gms.measurement.internal.zzoc zzocVar) {
        java.util.Map map = zzocVar.zza;
        java.lang.String str = "1";
        java.lang.String str2 = (map.isEmpty() || ((java.lang.String) map.get("Version")) != null) ? "0" : "1";
        android.os.Bundle zzb = zzb();
        android.os.Bundle zzb2 = zzocVar.zzb();
        if (zzb.size() == zzb2.size() && java.util.Objects.equals(zzb.getString("ad_storage"), zzb2.getString("ad_storage")) && java.util.Objects.equals(zzb.getString("ad_personalization"), zzb2.getString("ad_personalization")) && java.util.Objects.equals(zzb.getString("ad_user_data"), zzb2.getString("ad_user_data"))) {
            str = "0";
        }
        return str2.concat(str);
    }

    public final java.lang.String zze() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("1");
        int i = -1;
        try {
            java.lang.String str = (java.lang.String) this.zza.get("CmpSdkID");
            if (!android.text.TextUtils.isEmpty(str)) {
                i = java.lang.Integer.parseInt(str);
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        if (i < 0 || i > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i & 63));
        }
        int zzg = zzg();
        if (zzg < 0 || zzg > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(zzg));
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(true);
        java.util.Map map = this.zza;
        int i2 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean equals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i3 = i2 | 4;
        if (equals) {
            i3 = i2 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i3));
        return sb.toString();
    }
}
