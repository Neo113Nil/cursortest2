package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdod {
    private final Map zza = new HashMap();

    public final synchronized zzdoc zza(String str) {
        return (zzdoc) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbrc zzbrcVar;
        zzdoc zza = zza(str);
        return (zza == null || (zzbrcVar = zza.zzb) == null) ? "" : zzbrcVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc(String str, zzfby zzfbyVar) {
        zzbrc zze;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbrc zzbrcVar = null;
        if (zzfbyVar != null) {
            try {
                zze = zzfbyVar.zze();
            } catch (zzfbh unused) {
            }
            if (zzfbyVar != null) {
                try {
                    zzbrcVar = zzfbyVar.zzf();
                } catch (zzfbh unused2) {
                }
            }
            boolean z4 = true;
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjr)).booleanValue()) {
                if (zzfbyVar != null) {
                    try {
                        zzfbyVar.zzC();
                    } catch (zzfbh unused3) {
                    }
                }
                z4 = false;
            }
            this.zza.put(str, new zzdoc(str, zze, zzbrcVar, z4));
        }
        zze = null;
        if (zzfbyVar != null) {
        }
        boolean z42 = true;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjr)).booleanValue()) {
        }
        this.zza.put(str, new zzdoc(str, zze, zzbrcVar, z42));
    }

    public final synchronized void zzd(String str, zzbqn zzbqnVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdoc(str, zzbqnVar.zzf(), zzbqnVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
