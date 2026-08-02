package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeud implements zzesh {
    public zzeud(zzbye zzbyeVar, zzgbn zzgbnVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        final I3.b zzh = zzgbc.zzh(null);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfO)).booleanValue()) {
            zzh = zzgbc.zzh(null);
        }
        final I3.b zzh2 = zzgbc.zzh(null);
        return zzgbc.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeue((String) I3.b.this.get(), (String) zzh2.get());
            }
        }, zzbza.zza);
    }
}
