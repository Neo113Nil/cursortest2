package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbja extends com.google.android.gms.internal.ads.zzbjb {
    zzbja() {
    }

    private static final java.lang.String zzb(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final java.lang.String zza(java.lang.String str, java.lang.String str2) {
        java.lang.String zzb = zzb(str);
        java.lang.String zzb2 = zzb(str2);
        if (android.text.TextUtils.isEmpty(zzb)) {
            return zzb2;
        }
        if (android.text.TextUtils.isEmpty(zzb2)) {
            return zzb;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzb).length() + 1 + java.lang.String.valueOf(zzb2).length());
        sb.append(zzb);
        sb.append(",");
        sb.append(zzb2);
        return sb.toString();
    }
}
