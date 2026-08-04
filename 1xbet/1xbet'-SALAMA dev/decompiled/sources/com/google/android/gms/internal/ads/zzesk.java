package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzesk {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzffy zzd;
    private final zzdqq zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzesk(Context context, Executor executor, Set set, zzffy zzffyVar, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzffyVar;
        this.zze = zzdqqVar;
    }

    public static void zzb(zzesk zzeskVar, long j, zzesh zzeshVar, Bundle bundle) {
        o oVar = o.f1952C;
        oVar.j.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (((Boolean) zzbea.zza.zze()).booleanValue()) {
            J.k("Signal runtime (ms) : " + zzfty.zzc(zzeshVar.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        zzbbp zzbbpVar = zzbby.zzco;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzcs)).booleanValue()) {
                synchronized (zzeskVar) {
                    bundle.putLong("sig" + zzeshVar.zza(), jElapsedRealtime);
                }
            }
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzcm)).booleanValue()) {
            zzdqp zzdqpVarZza = zzeskVar.zze.zza();
            zzdqpVarZza.zzb("action", "lat_ms");
            zzdqpVarZza.zzb("lat_grp", "sig_lat_grp");
            zzdqpVarZza.zzb("lat_id", String.valueOf(zzeshVar.zza()));
            zzdqpVarZza.zzb("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzcn)).booleanValue()) {
                synchronized (zzeskVar) {
                    zzeskVar.zzg++;
                }
                zzdqpVarZza.zzb("seq_num", oVar.f1961g.zzh().zzd());
                synchronized (zzeskVar) {
                    try {
                        if (zzeskVar.zzg == zzeskVar.zzb.size() && zzeskVar.zzf != 0) {
                            zzeskVar.zzg = 0;
                            oVar.j.getClass();
                            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - zzeskVar.zzf);
                            if (zzeshVar.zza() <= 39 || zzeshVar.zza() >= 52) {
                                zzdqpVarZza.zzb("lat_clsg", strValueOf);
                            } else {
                                zzdqpVarZza.zzb("lat_gmssg", strValueOf);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zzdqpVarZza.zzk();
        }
    }

    public final I3.b zza(final Object obj, final Bundle bundle, final boolean z4) {
        zzffn zzffnVarZza = zzffm.zza(this.zza, 8);
        zzffnVarZza.zzi();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbbp zzbbpVar = zzbby.zzlJ;
        C0254t c0254t = C0254t.f2723d;
        boolean zIsEmpty = ((String) c0254t.f2726c.zzb(zzbbpVar)).isEmpty();
        zzbbw zzbbwVar = c0254t.f2726c;
        if (!zIsEmpty) {
            arrayList2 = Arrays.asList(((String) zzbbwVar.zzb(zzbbpVar)).split(","));
        }
        List list = arrayList2;
        o oVar = o.f1952C;
        oVar.j.getClass();
        this.zzf = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) zzbbwVar.zzb(zzbby.zzco)).booleanValue() && bundle != null) {
            oVar.j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof zzcts) {
                bundle.putLong(zzdpy.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdpy.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzesh zzeshVar : this.zzb) {
            if (!list.contains(String.valueOf(zzeshVar.zza()))) {
                o.f1952C.j.getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                I3.b bVarZzb = zzeshVar.zzb();
                bVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzesk.zzb(this.zza, jElapsedRealtime, zzeshVar, bundle2);
                    }
                }, zzbza.zzg);
                arrayList.add(bVarZzb);
            }
        }
        I3.b bVarZza = zzgbc.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzesj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzesg zzesgVar = (zzesg) ((I3.b) it.next()).get();
                    if (zzesgVar != null) {
                        boolean z7 = z4;
                        zzesgVar.zzb(obj2);
                        if (z7) {
                            zzesgVar.zza(obj2);
                        }
                    }
                }
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    o.f1952C.j.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (obj2 instanceof zzcts) {
                        bundle3.putLong(zzdpy.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdpy.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfgb.zza()) {
            zzffx.zza(bVarZza, this.zzd, zzffnVarZza);
        }
        return bVarZza;
    }
}
