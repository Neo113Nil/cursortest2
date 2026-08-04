package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzdod {
    private final Map zza = new HashMap();

    public final synchronized zzdoc zza(String str) {
        return (zzdoc) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbrc zzbrcVar;
        zzdoc zzdocVarZza = zza(str);
        return (zzdocVarZza == null || (zzbrcVar = zzdocVarZza.zzb) == null) ? "" : zzbrcVar.toString();
    }

    public final synchronized void zzc(String str, zzfby zzfbyVar) {
        zzbrc zzbrcVarZze;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbrc zzbrcVarZzf = null;
        if (zzfbyVar == null) {
            zzbrcVarZze = null;
        } else {
            try {
                zzbrcVarZze = zzfbyVar.zze();
            } catch (zzfbh unused) {
                zzbrcVarZze = null;
            }
        }
        if (zzfbyVar != null) {
            try {
                zzbrcVarZzf = zzfbyVar.zzf();
            } catch (zzfbh unused2) {
            }
        }
        boolean z4 = true;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjr)).booleanValue()) {
            if (zzfbyVar == null) {
                z4 = false;
            } else {
                try {
                    zzfbyVar.zzC();
                } catch (zzfbh unused3) {
                    z4 = false;
                }
            }
        }
        this.zza.put(str, new zzdoc(str, zzbrcVarZze, zzbrcVarZzf, z4));
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
