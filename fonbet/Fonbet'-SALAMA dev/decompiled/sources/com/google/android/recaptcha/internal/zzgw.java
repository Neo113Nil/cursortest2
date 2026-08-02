package com.google.android.recaptcha.internal;

import android.os.Build;
import f6.C1111d;
import g6.AbstractC1170s;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgw {
    public static final Map zza() {
        LinkedHashMap N02 = AbstractC1170s.N0(new C1111d(-4, zzbg.zzo), new C1111d(-12, zzbg.zzp), new C1111d(-6, zzbg.zzk), new C1111d(-11, zzbg.zzm), new C1111d(-13, zzbg.zzq), new C1111d(-14, zzbg.zzr), new C1111d(-2, zzbg.zzl), new C1111d(-7, zzbg.zzs), new C1111d(-5, zzbg.zzt), new C1111d(-9, zzbg.zzu), new C1111d(-8, zzbg.zzE), new C1111d(-15, zzbg.zzn), new C1111d(-1, zzbg.zzv), new C1111d(-3, zzbg.zzx), new C1111d(-10, zzbg.zzy));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            N02.put(-16, zzbg.zzw);
        }
        if (i7 >= 27) {
            N02.put(1, zzbg.zzA);
            N02.put(2, zzbg.zzB);
            N02.put(0, zzbg.zzC);
            N02.put(3, zzbg.zzD);
        }
        if (i7 >= 29) {
            N02.put(4, zzbg.zzz);
        }
        return N02;
    }
}
