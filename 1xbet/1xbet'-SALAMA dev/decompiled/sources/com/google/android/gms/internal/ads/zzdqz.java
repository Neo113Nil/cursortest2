package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import J2.j;
import J2.n;
import Q2.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class zzdqz {
    protected final Map zza;
    protected final Context zzb;
    protected final Executor zzc;
    protected final n zzd;
    protected final boolean zze;
    private final c zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicReference zzj;

    public zzdqz(Executor executor, n nVar, c cVar, Context context) {
        this.zza = new HashMap();
        this.zzi = new AtomicBoolean();
        this.zzj = new AtomicReference(new Bundle());
        this.zzc = executor;
        this.zzd = nVar;
        zzbbp zzbbpVar = zzbby.zzci;
        C0254t c0254t = C0254t.f2723d;
        this.zze = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue();
        this.zzf = cVar;
        this.zzg = ((Boolean) c0254t.f2726c.zzb(zzbby.zzcm)).booleanValue();
        this.zzh = ((Boolean) c0254t.f2726c.zzb(zzbby.zzgS)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map) {
        Bundle bundleG0;
        if (map == null || map.isEmpty()) {
            int i7 = J.f3546b;
            j.b("Empty or null paramMap.");
            return;
        }
        if (!this.zzi.getAndSet(true)) {
            final String str = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzkz);
            Context context = this.zzb;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdqx
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    zzdqz zzdqzVar = this.zza;
                    zzdqzVar.zzj.set(Q0.a.g0(zzdqzVar.zzb, str));
                }
            };
            if (TextUtils.isEmpty(str)) {
                bundleG0 = Bundle.EMPTY;
            } else {
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                bundleG0 = Q0.a.g0(context, str);
            }
            this.zzj.set(bundleG0);
        }
        Bundle bundle = (Bundle) this.zzj.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    private final void zzh(Map map, boolean z4) {
        if (map.isEmpty()) {
            int i7 = J.f3546b;
            j.b("Empty paramMap.");
            return;
        }
        zza(map);
        final String strA = this.zzf.a(map);
        J.k(strA);
        boolean z7 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z4 || this.zzg) {
                if (!z7 || this.zzh) {
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqw
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzd.zza(strA);
                        }
                    });
                }
            }
        }
    }

    public final String zzb(Map map) {
        return this.zzf.a(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zza);
    }

    public final void zze(Map map) {
        if (map.isEmpty()) {
            int i7 = J.f3546b;
            j.b("Empty paramMap.");
            return;
        }
        zza(map);
        final String strA = this.zzf.a(map);
        J.k(strA);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zznc)).booleanValue() || this.zze) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zza(strA);
                }
            });
        }
    }

    public final void zzf(Map map) {
        zzh(map, true);
    }

    public final void zzg(Map map) {
        zzh(map, false);
    }
}
