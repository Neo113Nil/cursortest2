package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzefg {
    private final InterfaceC1436a zza;
    private final zzefi zzb;
    private final zzfia zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgL)).booleanValue();
    private final zzebw zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzefg(InterfaceC1436a interfaceC1436a, zzefi zzefiVar, zzebw zzebwVar, zzfia zzfiaVar) {
        this.zza = interfaceC1436a;
        this.zzb = zzefiVar;
        this.zzf = zzebwVar;
        this.zzc = zzfiaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzfaf zzfafVar) {
        zzeff zzeffVar = (zzeff) this.zzd.get(zzfafVar);
        if (zzeffVar == null) {
            return false;
        }
        return zzeffVar.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    public final synchronized I3.b zzf(zzfar zzfarVar, zzfaf zzfafVar, I3.b bVar, zzfhv zzfhvVar) {
        zzfai zzfaiVar = zzfarVar.zzb.zzb;
        ((m3.b) this.zza).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = zzfafVar.zzw;
        if (str != null) {
            this.zzd.put(zzfafVar, new zzeff(str, zzfafVar.zzaf, 9, 0L, null));
            zzgbc.zzr(bVar, new zzefe(this, elapsedRealtime, zzfaiVar, zzfafVar, str, zzfhvVar, zzfarVar), zzbza.zzg);
        }
        return bVar;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.zzd.entrySet().iterator();
            while (it.hasNext()) {
                zzeff zzeffVar = (zzeff) ((Map.Entry) it.next()).getValue();
                if (zzeffVar.zzc != Integer.MAX_VALUE) {
                    arrayList.add(zzeffVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(zzfaf zzfafVar) {
        try {
            ((m3.b) this.zza).getClass();
            this.zzh = SystemClock.elapsedRealtime() - this.zzi;
            if (zzfafVar != null) {
                this.zzf.zze(zzfafVar);
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzj() {
        ((m3.b) this.zza).getClass();
        this.zzh = SystemClock.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        ((m3.b) this.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfaf zzfafVar = (zzfaf) it.next();
            if (!TextUtils.isEmpty(zzfafVar.zzw)) {
                this.zzd.put(zzfafVar, new zzeff(zzfafVar.zzw, zzfafVar.zzaf, f.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        ((m3.b) this.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
    }

    public final synchronized void zzm(zzfaf zzfafVar) {
        zzeff zzeffVar = (zzeff) this.zzd.get(zzfafVar);
        if (zzeffVar == null || this.zzg) {
            return;
        }
        zzeffVar.zzc = 8;
    }
}
