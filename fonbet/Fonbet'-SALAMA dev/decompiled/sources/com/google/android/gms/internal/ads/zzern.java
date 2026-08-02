package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o3.BinderC1507b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzern implements zzesh {
    public static final /* synthetic */ int zzb = 0;
    private static final zzero zzc = new zzero(new JSONArray().toString(), new Bundle());
    final String zza;
    private final zzgbn zzd;
    private final ScheduledExecutorService zze;
    private final zzehz zzf;
    private final Context zzg;
    private final zzfba zzh;
    private final zzehv zzi;
    private final zzdog zzj;
    private final zzdsw zzk;
    private final int zzl;

    public zzern(zzgbn zzgbnVar, ScheduledExecutorService scheduledExecutorService, String str, zzehz zzehzVar, Context context, zzfba zzfbaVar, zzehv zzehvVar, zzdog zzdogVar, zzdsw zzdswVar, int i7) {
        this.zzd = zzgbnVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzehzVar;
        this.zzg = context;
        this.zzh = zzfbaVar;
        this.zzi = zzehvVar;
        this.zzj = zzdogVar;
        this.zzk = zzdswVar;
        this.zzl = i7;
    }

    public static I3.b zzc(zzern zzernVar) {
        zzbbp zzbbpVar = zzbby.zzkT;
        C0254t c0254t = C0254t.f2723d;
        String lowerCase = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() ? zzernVar.zzh.zzf.toLowerCase(Locale.ROOT) : zzernVar.zzh.zzf;
        final Bundle zzg = ((Boolean) c0254t.f2726c.zzb(zzbby.zzbO)).booleanValue() ? zzernVar.zzk.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzbX)).booleanValue()) {
            zzernVar.zzi(arrayList, zzernVar.zzf.zza(zzernVar.zza, lowerCase));
        } else {
            for (Map.Entry entry : ((zzfwk) zzernVar.zzf.zzb(zzernVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(zzernVar.zzg(str, (List) entry.getValue(), zzernVar.zzf(str), true, true));
            }
            zzernVar.zzi(arrayList, zzernVar.zzf.zzc());
        }
        return zzgbc.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeri
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i7 = zzern.zzb;
                JSONArray jSONArray = new JSONArray();
                for (I3.b bVar : arrayList) {
                    if (((JSONObject) bVar.get()) != null) {
                        jSONArray.put(bVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzero(jSONArray.toString(), zzg);
            }
        }, zzernVar.zzd);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        I2.J.l("Couldn't create RTB adapter : ", r13);
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static I3.b zzd(final zzern zzernVar, String str, final List list, final Bundle bundle, boolean z4, boolean z7) {
        zzbqn zzbqnVar;
        final zzbzf zzbzfVar = new zzbzf();
        if (z7) {
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbP)).booleanValue()) {
                zzernVar.zzi.zzb(str);
                zzbqnVar = zzernVar.zzi.zza(str);
                if (zzbqnVar != null) {
                    if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbF)).booleanValue()) {
                        throw null;
                    }
                    zzeic.zzb(str, zzbzfVar);
                } else {
                    o.f1952C.j.getClass();
                    final zzeic zzeicVar = new zzeic(str, zzbqnVar, zzbzfVar, SystemClock.elapsedRealtime());
                    zzbbp zzbbpVar = zzbby.zzbK;
                    C0254t c0254t = C0254t.f2723d;
                    boolean booleanValue = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue();
                    zzbbw zzbbwVar = c0254t.f2726c;
                    if (booleanValue) {
                        zzernVar.zze.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzerm
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzeic.this.zzc();
                            }
                        }, ((Long) zzbbwVar.zzb(zzbby.zzbD)).longValue(), TimeUnit.MILLISECONDS);
                    }
                    if (!z4) {
                        zzeicVar.zzd();
                    } else if (((Boolean) zzbbwVar.zzb(zzbby.zzbR)).booleanValue()) {
                        final zzbqn zzbqnVar2 = zzbqnVar;
                        zzernVar.zzd.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzerj
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzern.zze(zzern.this, zzbqnVar2, bundle, list, zzeicVar, zzbzfVar);
                            }
                        });
                    } else {
                        zzernVar.zzh(zzbqnVar, bundle, list, zzeicVar);
                    }
                }
                return zzbzfVar;
            }
        }
        zzbqnVar = zzernVar.zzj.zzb(str);
        if (zzbqnVar != null) {
        }
        return zzbzfVar;
    }

    public static /* synthetic */ void zze(zzern zzernVar, zzbqn zzbqnVar, Bundle bundle, List list, zzeic zzeicVar, zzbzf zzbzfVar) {
        try {
            zzernVar.zzh(zzbqnVar, bundle, list, zzeicVar);
        } catch (RemoteException e7) {
            zzbzfVar.zzd(e7);
        }
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzh.zzd.f10742D;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgat zzg(final String str, final List list, final Bundle bundle, final boolean z4, final boolean z7) {
        zzgat zzu = zzgat.zzu(zzgbc.zzk(new zzgai() { // from class: com.google.android.gms.internal.ads.zzerk
            @Override // com.google.android.gms.internal.ads.zzgai
            public final I3.b zza() {
                return zzern.zzd(zzern.this, str, list, bundle, z4, z7);
            }
        }, this.zzd));
        zzbbp zzbbpVar = zzbby.zzbK;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            zzu = (zzgat) zzgbc.zzo(zzu, ((Long) c0254t.f2726c.zzb(zzbby.zzbD)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgat) zzgbc.zze(zzu, Throwable.class, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzerl
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i7 = zzern.zzb;
                int i8 = J.f3546b;
                String str2 = str;
                j.d("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmW)).booleanValue()) {
                    o.f1952C.f1961g.zzv(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                o.f1952C.f1961g.zzw(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, this.zzd);
    }

    private final void zzh(zzbqn zzbqnVar, Bundle bundle, List list, zzeic zzeicVar) {
        zzbqnVar.zzh(new BinderC1507b(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zze, zzeicVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzeid zzeidVar = (zzeid) ((Map.Entry) it.next()).getValue();
            String str = zzeidVar.zza;
            list.add(zzg(str, Collections.singletonList(zzeidVar.zze), zzf(str), zzeidVar.zzb, zzeidVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        if (this.zzl == 2) {
            return zzgbc.zzh(zzc);
        }
        zzfba zzfbaVar = this.zzh;
        if (zzfbaVar.zzr) {
            if (!Arrays.asList(((String) C0254t.f2723d.f2726c.zzb(zzbby.zzbQ)).split(",")).contains(Q0.a.i0(Q0.a.k0(zzfbaVar.zzd)))) {
                return zzgbc.zzh(zzc);
            }
        }
        return zzgbc.zzk(new zzgai() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // com.google.android.gms.internal.ads.zzgai
            public final I3.b zza() {
                return zzern.zzc(zzern.this);
            }
        }, this.zzd);
    }
}
