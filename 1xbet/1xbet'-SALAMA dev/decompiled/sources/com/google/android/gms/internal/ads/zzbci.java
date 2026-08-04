package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzbci extends zzbcj {
    private static final String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < str.length() && str.charAt(i8) == ',') {
            i8++;
        }
        while (length > 0) {
            int i9 = length - 1;
            if (str.charAt(i9) != ',') {
                break;
            }
            length = i9;
        }
        if (length < i8) {
            return null;
        }
        if (i8 != 0) {
            i7 = i8;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i7, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final String zza(String str, String str2) {
        String strZzb = zzb(str);
        String strZzb2 = zzb(str2);
        if (TextUtils.isEmpty(strZzb)) {
            return strZzb2;
        }
        return TextUtils.isEmpty(strZzb2) ? strZzb : k.f(strZzb, ",", strZzb2);
    }
}
