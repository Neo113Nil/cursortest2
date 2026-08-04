package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzalg {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzalg(String str, int i7, String str2, Set set) {
        this.zzb = i7;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzalg zza(String str, int i7) {
        String str2;
        String strTrim = str.trim();
        zzcv.zzd(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        int i8 = zzen.zza;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str3 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i9 = 1; i9 < strArrSplit.length; i9++) {
            hashSet.add(strArrSplit[i9]);
        }
        return new zzalg(str3, i7, str2, hashSet);
    }

    public static zzalg zzb() {
        return new zzalg("", 0, "", Collections.emptySet());
    }
}
