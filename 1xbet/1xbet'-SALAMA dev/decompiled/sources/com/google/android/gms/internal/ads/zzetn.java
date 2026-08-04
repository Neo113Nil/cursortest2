package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzetn implements zzesh {
    private final Executor zza;
    private final String zzb;

    public zzetn(zzbyh zzbyhVar, Executor executor, String str, PackageInfo packageInfo, int i7) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return zzgbc.zzf(zzgbc.zzm(zzgbc.zzh(this.zzb), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzetl
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return new zzeto((String) obj);
            }
        }, this.zza), Throwable.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzetm
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzgbc.zzh(new zzeto(this.zza.zzb));
            }
        }, this.zza);
    }
}
