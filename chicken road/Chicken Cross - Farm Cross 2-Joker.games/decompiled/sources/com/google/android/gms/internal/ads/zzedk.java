package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzedk {
    private final zzecu zza;
    private final zzdxx zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzedk(zzecu zzecuVar, zzdxx zzdxxVar) {
        this.zza = zzecuVar;
        this.zzb = zzdxxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        String str;
        boolean z;
        zzdxw zzc;
        zzbyi zzbyiVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbsh zzbshVar = (zzbsh) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkR)).booleanValue()) {
                    zzdxw zzc2 = this.zzb.zzc(zzbshVar.zza);
                    if (zzc2 != null && (zzbyiVar = zzc2.zzc) != null) {
                        str = zzbyiVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkS)).booleanValue() && (zzc = this.zzb.zzc(zzbshVar.zza)) != null && zzc.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzbshVar.zza;
                    list2.add(new zzedj(str3, str2, this.zzb.zzd(str3), zzbshVar.zzb ? 1 : 0, zzbshVar.zzd, zzbshVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzbshVar.zza;
                list22.add(new zzedj(str32, str2, this.zzb.zzd(str32), zzbshVar.zzb ? 1 : 0, zzbshVar.zzd, zzbshVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzb(new zzedi(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                zzecu zzecuVar = this.zza;
                if (zzecuVar.zze()) {
                    zzc(zzecuVar.zzd());
                } else {
                    zza();
                }
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzedj) it.next()).zza());
            }
        }
        return jSONArray;
    }
}
