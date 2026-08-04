package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzajm {
    public static void zza(zzajn zzajnVar, zzajr zzajrVar, zzdd zzddVar) {
        for (int i7 = 0; i7 < zzajnVar.zza(); i7++) {
            long jZzb = zzajnVar.zzb(i7);
            List listZzc = zzajnVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i7 == zzajnVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzajnVar.zzb(i7 + 1) - zzajnVar.zzb(i7);
                if (jZzb2 > 0) {
                    zzddVar.zza(new zzajk(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
