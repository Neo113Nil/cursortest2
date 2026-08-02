package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class zzdtk {
    private final zzdsu zza;
    private final zzdod zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzdtk(zzdsu zzdsuVar, zzdod zzdodVar) {
        this.zza = zzdsuVar;
        this.zzb = zzdodVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        zzdoc zza;
        zzbrc zzbrcVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbkx zzbkxVar = (zzbkx) it.next();
                    zzbbp zzbbpVar = zzbby.zzjq;
                    C0254t c0254t = C0254t.f2723d;
                    if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                        zzdoc zza2 = this.zzb.zza(zzbkxVar.zza);
                        if (zza2 != null && (zzbrcVar = zza2.zzc) != null) {
                            str = zzbrcVar.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    boolean z4 = ((Boolean) c0254t.f2726c.zzb(zzbby.zzjr)).booleanValue() && (zza = this.zzb.zza(zzbkxVar.zza)) != null && zza.zzd;
                    List list2 = this.zzd;
                    String str3 = zzbkxVar.zza;
                    list2.add(new zzdtj(str3, str2, this.zzb.zzb(str3), zzbkxVar.zzb ? 1 : 0, zzbkxVar.zzd, zzbkxVar.zzc, z4));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final JSONArray zza() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    if (this.zza.zzt()) {
                        zzd(this.zza.zzg());
                    } else {
                        zzc();
                    }
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzdtj) it.next()).zza());
                }
            } finally {
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdti(this));
    }
}
