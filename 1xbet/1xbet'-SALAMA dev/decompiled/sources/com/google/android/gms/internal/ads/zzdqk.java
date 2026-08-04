package com.google.android.gms.internal.ads;

import E2.h;
import E2.o;
import F2.C0254t;
import J2.d;
import J2.j;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzdqk {
    private final ConcurrentHashMap zza;
    private final zzbyu zzb;
    private final zzfba zzc;
    private final String zzd;
    private final String zze;
    private final h zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdqk(Context context, zzdqv zzdqvVar, zzbyu zzbyuVar, zzfba zzfbaVar, String str, String str2, h hVar) {
        ActivityManager activityManager;
        String str3;
        ConcurrentHashMap concurrentHashMapZzc = zzdqvVar.zzc();
        this.zza = concurrentHashMapZzc;
        this.zzb = zzbyuVar;
        this.zzc = zzfbaVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = hVar;
        this.zzh = context;
        concurrentHashMapZzc.put("ad_format", str2.toUpperCase(Locale.ROOT));
        zzbbp zzbbpVar = zzbby.zzjz;
        C0254t c0254t = C0254t.f2723d;
        ActivityManager.MemoryInfo memoryInfo = null;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            int i7 = hVar.f1927F;
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            if (i8 != 0) {
                str3 = i8 != 1 ? "na" : "2";
            } else {
                str3 = "1";
            }
            concurrentHashMapZzc.put("asv", str3);
        }
        zzbbp zzbbpVar2 = zzbby.zzco;
        zzbbw zzbbwVar = c0254t.f2726c;
        if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(o.f1952C.f1961g.zzb()));
            if (((Boolean) zzbbwVar.zzb(zzbby.zzct)).booleanValue()) {
                zzfpq zzfpqVar = d.f3805b;
                if (context != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                    memoryInfo = new ActivityManager.MemoryInfo();
                    try {
                        activityManager.getMemoryInfo(memoryInfo);
                    } catch (NullPointerException unused) {
                        j.g("Error retrieving the memory information.");
                    }
                }
                if (memoryInfo != null) {
                    zzd("mem_avl", String.valueOf(memoryInfo.availMem));
                    zzd("mem_tt", String.valueOf(memoryInfo.totalMem));
                    zzd("low_m", true != memoryInfo.lowMemory ? "0" : "1");
                }
            }
        }
        if (((Boolean) zzbbwVar.zzb(zzbby.zzgR)).booleanValue()) {
            int iO0 = Q0.a.o0(zzfbaVar) - 1;
            if (iO0 == 0) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("scar", "false");
                return;
            }
            if (iO0 == 1) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("se", "query_g");
            } else if (iO0 == 2) {
                concurrentHashMapZzc.put("se", "r_adinfo");
            } else if (iO0 != 3) {
                concurrentHashMapZzc.put("se", "r_both");
            } else {
                concurrentHashMapZzc.put("se", "r_adstring");
            }
            concurrentHashMapZzc.put("scar", "true");
            zzd("ragent", zzfbaVar.zzd.f10745G);
            zzd("rtype", Q0.a.i0(Q0.a.k0(zzfbaVar.zzd)));
        }
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzni)).booleanValue()) {
            zzd("brr", true != this.zzc.zzp ? "0" : "1");
        }
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final void zze(zzfar zzfarVar) {
        if (!zzfarVar.zzb.zza.isEmpty()) {
            zzfaf zzfafVar = (zzfaf) zzfarVar.zzb.zza.get(0);
            zzd("ad_format", zzfaf.zza(zzfafVar.zzb));
            if (zzfafVar.zzb == 6) {
                this.zza.put("as", true != this.zzb.zzm() ? "0" : "1");
            }
        }
        zzd("gqi", zzfarVar.zzb.zzb.zzb);
    }

    public final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
