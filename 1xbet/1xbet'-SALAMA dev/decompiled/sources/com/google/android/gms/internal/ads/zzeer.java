package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzeer {
    private final zzgbw zzc;
    private zzefh zzf;
    private final String zzh;
    private final int zzi;
    private final zzefg zzj;
    private zzfaf zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = f.API_PRIORITY_OTHER;
    private boolean zzl = false;

    public zzeer(zzfar zzfarVar, zzefg zzefgVar, zzgbw zzgbwVar) {
        this.zzi = zzfarVar.zzb.zzb.zzr;
        this.zzj = zzefgVar;
        this.zzc = zzgbwVar;
        this.zzh = zzefn.zzc(zzfarVar);
        List list = zzfarVar.zzb.zza;
        for (int i7 = 0; i7 < list.size(); i7++) {
            this.zza.put((zzfaf) list.get(i7), Integer.valueOf(i7));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zze() {
        this.zzj.zzi(this.zzk);
        zzefh zzefhVar = this.zzf;
        if (zzefhVar != null) {
            this.zzc.zzc(zzefhVar);
        } else {
            this.zzc.zzd(new zzefk(3, this.zzh));
        }
    }

    private final synchronized boolean zzf(boolean z4) {
        try {
            for (zzfaf zzfafVar : this.zzb) {
                Integer num = (Integer) this.zza.get(zzfafVar);
                int iIntValue = num != null ? num.intValue() : f.API_PRIORITY_OTHER;
                if (z4 || !this.zze.contains(zzfafVar.zzat)) {
                    int i7 = this.zzg;
                    if (iIntValue < i7) {
                        return true;
                    }
                    if (iIntValue > i7) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzg() {
        try {
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.zza.get((zzfaf) it.next());
                if ((num != null ? num.intValue() : f.API_PRIORITY_OTHER) < this.zzg) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzh() {
        return zzf(true) || zzg();
    }

    private final synchronized boolean zzi() {
        if (this.zzl) {
            return false;
        }
        if (!this.zzb.isEmpty() && ((zzfaf) this.zzb.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list = this.zzd;
            if (list.size() < this.zzi && zzf(false)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized zzfaf zza() {
        try {
            if (zzi()) {
                for (int i7 = 0; i7 < this.zzb.size(); i7++) {
                    zzfaf zzfafVar = (zzfaf) this.zzb.get(i7);
                    String str = zzfafVar.zzat;
                    if (!this.zze.contains(str)) {
                        if (zzfafVar.zzav) {
                            this.zzl = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.zze.add(str);
                        }
                        this.zzd.add(zzfafVar);
                        return (zzfaf) this.zzb.remove(i7);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Throwable th, zzfaf zzfafVar) {
        this.zzl = false;
        this.zzd.remove(zzfafVar);
        this.zze.remove(zzfafVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zze();
    }

    public final synchronized void zzc(zzefh zzefhVar, zzfaf zzfafVar) {
        this.zzl = false;
        this.zzd.remove(zzfafVar);
        if (zzd()) {
            zzefhVar.zzq();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfafVar);
        int iIntValue = num != null ? num.intValue() : f.API_PRIORITY_OTHER;
        if (iIntValue > this.zzg) {
            this.zzj.zzm(zzfafVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = iIntValue;
        this.zzf = zzefhVar;
        this.zzk = zzfafVar;
        if (zzh()) {
            return;
        }
        zze();
    }

    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
