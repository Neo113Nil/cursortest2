package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
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
        zzdoc zzdocVarZza;
        zzdoc zzdocVarZza2;
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
                    String string = (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() || (zzdocVarZza2 = this.zzb.zza(zzbkxVar.zza)) == null || (zzbrcVar = zzdocVarZza2.zzc) == null) ? "" : zzbrcVar.toString();
                    String str = string;
                    boolean z4 = ((Boolean) c0254t.f2726c.zzb(zzbby.zzjr)).booleanValue() && (zzdocVarZza = this.zzb.zza(zzbkxVar.zza)) != null && zzdocVarZza.zzd;
                    List list2 = this.zzd;
                    String str2 = zzbkxVar.zza;
                    list2.add(new zzdtj(str2, str, this.zzb.zzb(str2), zzbkxVar.zzb ? 1 : 0, zzbkxVar.zzd, zzbkxVar.zzc, z4));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[Catch: all -> 0x001e, LOOP:0: B:15:0x002b->B:17:0x0031, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:11:0x0020, B:12:0x0023, B:14:0x0025, B:15:0x002b, B:17:0x0031, B:18:0x003f), top: B:22:0x0008 }] */
    public final JSONArray zza() {
        Iterator it;
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    it = this.zzd.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((zzdtj) it.next()).zza());
                    }
                } else if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                    it = this.zzd.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((zzdtj) it.next()).zza());
                    }
                } else {
                    zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdti(this));
    }
}
