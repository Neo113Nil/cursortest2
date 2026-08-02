package com.google.android.gms.internal.ads;

import I2.L;
import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeql implements zzesh {
    private final zzgbn zza;
    private final zzfba zzb;
    private final PackageInfo zzc;
    private final L zzd;

    public zzeql(zzgbn zzgbnVar, zzfba zzfbaVar, PackageInfo packageInfo, L l7) {
        this.zza = zzgbnVar;
        this.zzb = zzfbaVar;
        this.zzc = packageInfo;
        this.zzd = l7;
    }

    public static /* synthetic */ zzeqm zzc(zzeql zzeqlVar) {
        return new zzeqm(zzeqlVar.zzb, zzeqlVar.zzc, zzeqlVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeql.zzc(zzeql.this);
            }
        });
    }
}
