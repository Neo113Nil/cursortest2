package com.google.android.gms.internal.ads;

import t.e;

/* loaded from: classes.dex */
public final class zzacr {
    public final String zza;

    private zzacr(int i7, int i8, String str) {
        this.zza = str;
    }

    public static zzacr zza(zzed zzedVar) {
        String str;
        zzedVar.zzM(2);
        int zzm = zzedVar.zzm();
        int i7 = zzm >> 1;
        int i8 = zzm & 1;
        int zzm2 = zzedVar.zzm() >> 3;
        if (i7 == 4 || i7 == 5 || i7 == 7 || i7 == 8) {
            str = "dvhe";
        } else if (i7 == 9) {
            str = "dvav";
        } else {
            if (i7 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i9 = zzm2 | (i8 << 5);
        StringBuilder c3 = e.c(str);
        c3.append(i7 < 10 ? ".0" : ".");
        c3.append(i7);
        c3.append(i9 < 10 ? ".0" : ".");
        c3.append(i9);
        return new zzacr(i7, i9, c3.toString());
    }
}
