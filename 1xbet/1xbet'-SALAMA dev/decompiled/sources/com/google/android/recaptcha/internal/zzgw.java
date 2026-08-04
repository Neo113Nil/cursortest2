package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import p044f6.d;
import p050g6.s;

/* JADX INFO: loaded from: classes.dex */
public final class zzgw {
    public static final Map zza() {
        LinkedHashMap linkedHashMapN0 = s.N0(new d(-4, zzbg.zzo), new d(-12, zzbg.zzp), new d(-6, zzbg.zzk), new d(-11, zzbg.zzm), new d(-13, zzbg.zzq), new d(-14, zzbg.zzr), new d(-2, zzbg.zzl), new d(-7, zzbg.zzs), new d(-5, zzbg.zzt), new d(-9, zzbg.zzu), new d(-8, zzbg.zzE), new d(-15, zzbg.zzn), new d(-1, zzbg.zzv), new d(-3, zzbg.zzx), new d(-10, zzbg.zzy));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            linkedHashMapN0.put(-16, zzbg.zzw);
        }
        if (i7 >= 27) {
            linkedHashMapN0.put(1, zzbg.zzA);
            linkedHashMapN0.put(2, zzbg.zzB);
            linkedHashMapN0.put(0, zzbg.zzC);
            linkedHashMapN0.put(3, zzbg.zzD);
        }
        if (i7 >= 29) {
            linkedHashMapN0.put(4, zzbg.zzz);
        }
        return linkedHashMapN0;
    }
}
