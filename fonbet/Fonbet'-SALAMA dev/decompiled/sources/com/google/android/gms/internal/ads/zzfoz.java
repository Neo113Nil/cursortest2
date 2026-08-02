package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class zzfoz implements Closeable {
    public static zzfpl zza() {
        return new zzfpl();
    }

    public static zzfpl zzb(final int i7, zzfpk zzfpkVar) {
        return new zzfpl(new zzftz() { // from class: com.google.android.gms.internal.ads.zzfox
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i7);
                return valueOf;
            }
        }, new zzftz() { // from class: com.google.android.gms.internal.ads.zzfoy
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                return zzfoz.zze();
            }
        }, zzfpkVar);
    }

    public static zzfpl zzc(zzftz<Integer> zzftzVar, zzftz<Integer> zzftzVar2, zzfpk zzfpkVar) {
        return new zzfpl(zzftzVar, zzftzVar2, zzfpkVar);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
