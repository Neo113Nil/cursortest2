package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.L;
import I2.M;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzdrb {
    private final String zze;
    private final zzdqv zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final L zza = o.f1952C.f1961g.zzi();

    public zzdrb(String str, zzdqv zzdqvVar) {
        this.zze = str;
        this.zzf = zzdqvVar;
    }

    private final Map zzg() {
        Map mapZza = this.zzf.zza();
        o.f1952C.j.getClass();
        mapZza.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        mapZza.put("tid", ((M) this.zza).k() ? "" : this.zze);
        return mapZza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzck)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "aaia");
            mapZzg.put("aair", "MalformedJson");
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzb(String str, String str2) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzck)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_finished");
            mapZzg.put("ancn", str);
            mapZzg.put("rqe", str2);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzc(String str) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzck)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_started");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzck)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_finished");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zze() {
        try {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzck)).booleanValue() && !this.zzd) {
                Map mapZzg = zzg();
                mapZzg.put("action", "init_finished");
                this.zzb.add(mapZzg);
                Iterator it = this.zzb.iterator();
                while (it.hasNext()) {
                    this.zzf.zzg((Map) it.next());
                }
                this.zzd = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzck)).booleanValue() && !this.zzc) {
            Map mapZzg = zzg();
            mapZzg.put("action", "init_started");
            this.zzb.add(mapZzg);
            this.zzc = true;
        }
    }
}
