package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeld implements zzesh {
    private final zzgbn zza;
    private final zzdog zzb;
    private final zzdsu zzc;
    private final zzelf zzd;

    public zzeld(zzgbn zzgbnVar, zzdog zzdogVar, zzdsu zzdsuVar, zzelf zzelfVar) {
        this.zza = zzgbnVar;
        this.zzb = zzdogVar;
        this.zzc = zzdsuVar;
        this.zzd = zzelfVar;
    }

    public static zzele zzc(zzeld zzeldVar) {
        List<String> asList = Arrays.asList(((String) C0254t.f2723d.f2726c.zzb(zzbby.zzbC)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfby zzc = zzeldVar.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = zzeldVar.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlE)).booleanValue() || zzt) {
                    try {
                        zzbrc zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzfbh unused) {
                    }
                }
                try {
                    zzbrc zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfbh unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfbh unused3) {
            }
        }
        zzele zzeleVar = new zzele(bundle);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlE)).booleanValue()) {
            zzeldVar.zzd.zzb(zzeleVar);
        }
        return zzeleVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        zzbbp zzbbpVar = zzbby.zzlE;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && this.zzd.zza() != null) {
            zzele zza = this.zzd.zza();
            zza.getClass();
            return zzgbc.zzh(zza);
        }
        if (zzfty.zzd((String) c0254t.f2726c.zzb(zzbby.zzbC)) || (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && (this.zzd.zzd() || !this.zzc.zzt()))) {
            return zzgbc.zzh(new zzele(new Bundle()));
        }
        this.zzd.zzc(true);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeld.zzc(zzeld.this);
            }
        });
    }
}
