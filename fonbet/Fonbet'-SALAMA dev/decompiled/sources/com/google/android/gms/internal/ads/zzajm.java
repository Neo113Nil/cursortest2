package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzajm {
    public static void zza(zzajn zzajnVar, zzajr zzajrVar, zzdd zzddVar) {
        for (int i7 = 0; i7 < zzajnVar.zza(); i7++) {
            long zzb = zzajnVar.zzb(i7);
            List zzc = zzajnVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i7 == zzajnVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long zzb2 = zzajnVar.zzb(i7 + 1) - zzajnVar.zzb(i7);
                if (zzb2 > 0) {
                    zzddVar.zza(new zzajk(zzc, zzb, zzb2));
                }
            }
        }
    }
}
