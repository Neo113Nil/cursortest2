package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzeud implements zzesh {
    public zzeud(zzbye zzbyeVar, zzgbn zzgbnVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        final I3.b bVarZzh = zzgbc.zzh(null);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfO)).booleanValue()) {
            bVarZzh = zzgbc.zzh(null);
        }
        final I3.b bVarZzh2 = zzgbc.zzh(null);
        return zzgbc.zzc(bVarZzh, bVarZzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeue((String) bVarZzh.get(), (String) bVarZzh2.get());
            }
        }, zzbza.zza);
    }
}
