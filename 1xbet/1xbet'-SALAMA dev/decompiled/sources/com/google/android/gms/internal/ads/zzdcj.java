package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzdcj extends zzdag implements zzaxx {
    private final Map zzb;
    private final Context zzc;
    private final zzfaf zzd;

    public zzdcj(Context context, Set set, zzfaf zzfafVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfafVar;
    }

    public final synchronized void zza(View view) {
        try {
            zzaxy zzaxyVar = (zzaxy) this.zzb.get(view);
            if (zzaxyVar == null) {
                zzaxy zzaxyVar2 = new zzaxy(this.zzc, view);
                zzaxyVar2.zzd(this);
                this.zzb.put(view, zzaxyVar2);
                zzaxyVar = zzaxyVar2;
            }
            if (this.zzd.zzX) {
                zzbbp zzbbpVar = zzbby.zzbA;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    zzaxyVar.zzg(((Long) c0254t.f2726c.zzb(zzbby.zzbz)).longValue());
                    return;
                }
            }
            zzaxyVar.zzf();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzaxy) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final synchronized void zzdn(final zzaxw zzaxwVar) {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdci
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzaxx) obj).zzdn(zzaxwVar);
            }
        });
    }
}
