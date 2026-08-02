package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class zzbcn {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbcn(boolean z4, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbck zzf() {
        o.f1952C.j.getClass();
        return new zzbck(SystemClock.elapsedRealtime(), null, null);
    }

    public final zzbcm zza() {
        zzbcm zzbcmVar;
        boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            try {
                for (zzbck zzbckVar : this.zza) {
                    long zza = zzbckVar.zza();
                    String zzc = zzbckVar.zzc();
                    zzbck zzb = zzbckVar.zzb();
                    if (zzb != null && zza > 0) {
                        long zza2 = zza - zzb.zza();
                        sb.append(zzc);
                        sb.append('.');
                        sb.append(zza2);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                                sb2.append('+');
                                sb2.append(zzc);
                            } else {
                                hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                            }
                        }
                    }
                }
                this.zza.clear();
                String str = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long longValue = ((Long) entry.getKey()).longValue();
                        o oVar = o.f1952C;
                        oVar.j.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        oVar.j.getClass();
                        sb3.append(currentTimeMillis + (longValue - SystemClock.elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str = sb3.toString();
                }
                zzbcmVar = new zzbcm(sb.toString(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbcmVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            o.f1952C.f1961g.zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbcn zzbcnVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbcd zzg;
        if (TextUtils.isEmpty(str2) || (zzg = o.f1952C.f1961g.zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbcj zza = zzg.zza(str);
            Map map = this.zzb;
            map.put(str, zza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbck zzbckVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbck(j, strArr[0], zzbckVar));
        }
        return true;
    }
}
