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

/* JADX INFO: loaded from: classes.dex */
@Deprecated
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
        boolean zBooleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                for (zzbck zzbckVar : this.zza) {
                    long jZza = zzbckVar.zza();
                    String strZzc = zzbckVar.zzc();
                    zzbck zzbckVarZzb = zzbckVar.zzb();
                    if (zzbckVarZzb != null && jZza > 0) {
                        long jZza2 = jZza - zzbckVarZzb.zza();
                        sb.append(strZzc);
                        sb.append('.');
                        sb.append(jZza2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbckVarZzb.zza()))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbckVarZzb.zza()));
                                sb2.append('+');
                                sb2.append(strZzc);
                            } else {
                                map.put(Long.valueOf(zzbckVarZzb.zza()), new StringBuilder(strZzc));
                            }
                        }
                    }
                }
                this.zza.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        o oVar = o.f1952C;
                        oVar.j.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        oVar.j.getClass();
                        sb3.append(jCurrentTimeMillis + (jLongValue - SystemClock.elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                zzbcmVar = new zzbcm(sb.toString(), string);
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
        zzbcd zzbcdVarZzg;
        if (TextUtils.isEmpty(str2) || (zzbcdVarZzg = o.f1952C.f1961g.zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbcj zzbcjVarZza = zzbcdVarZzg.zza(str);
            Map map = this.zzb;
            map.put(str, zzbcjVarZza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbck zzbckVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbck(j, strArr[0], zzbckVar));
        }
        return true;
    }
}
