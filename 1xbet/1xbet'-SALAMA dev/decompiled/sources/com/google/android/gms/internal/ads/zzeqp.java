package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzeqp implements zzesh {
    private static String zza;
    private final zzgbn zzb;
    private final Context zzc;

    public zzeqp(zzgbn zzgbnVar, Context context) {
        this.zzb = zzgbnVar;
        this.zzc = context;
    }

    public static zzeqq zzc(zzeqp zzeqpVar) {
        zzbbp zzbbpVar = zzbby.zzfk;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            return new zzeqq(null);
        }
        if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzft)).booleanValue()) {
            return new zzeqq(o.f1952C.f1977x.zzf(zzeqpVar.zzc));
        }
        if (zza == null) {
            zza = o.f1952C.f1977x.zzf(zzeqpVar.zzc);
        }
        return new zzeqq(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqp.zzc(this.zza);
            }
        });
    }
}
