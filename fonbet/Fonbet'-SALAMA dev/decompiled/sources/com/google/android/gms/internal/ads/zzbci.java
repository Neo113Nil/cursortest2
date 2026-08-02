package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e1.k;

/* loaded from: classes.dex */
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
        String zzb = zzb(str);
        String zzb2 = zzb(str2);
        return TextUtils.isEmpty(zzb) ? zzb2 : TextUtils.isEmpty(zzb2) ? zzb : k.f(zzb, ",", zzb2);
    }
}
