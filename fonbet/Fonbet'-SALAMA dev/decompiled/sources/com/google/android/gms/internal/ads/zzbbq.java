package com.google.android.gms.internal.ads;

import F2.C0254t;
import J2.j;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbbq {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            String str = (String) C0254t.f2723d.f2726c.zzb((zzbbp) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbbz.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            String str = (String) C0254t.f2723d.f2726c.zzb((zzbbp) it.next());
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbbz.zzb());
        return zza;
    }

    public final void zzc(zzbbp zzbbpVar) {
        this.zzb.add(zzbbpVar);
    }

    public final void zzd(zzbbp zzbbpVar) {
        this.zza.add(zzbbpVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i7, JSONObject jSONObject) {
        for (zzbbp zzbbpVar : this.zza) {
            if (zzbbpVar.zze() == 1) {
                zzbbpVar.zzd(editor, zzbbpVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            j.d("Flag Json is null.");
        }
    }
}
