package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.M;
import F2.S;
import I2.J;
import J2.d;
import J2.j;
import android.content.Context;
import android.net.ConnectivityManager;
import e1.k;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import m3.InterfaceC1436a;
import m3.c;
import y2.EnumC1798b;

/* loaded from: classes.dex */
public final class zzfip {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfja zzc;
    private final zzfil zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final InterfaceC1436a zzg;
    private AtomicInteger zzh;

    public zzfip(zzfja zzfjaVar, zzfil zzfilVar, Context context, InterfaceC1436a interfaceC1436a) {
        this.zzc = zzfjaVar;
        this.zzd = zzfilVar;
        this.zze = context;
        this.zzg = interfaceC1436a;
    }

    public static String zzd(String str, EnumC1798b enumC1798b) {
        return k.f(str, "#", enumC1798b == null ? "NULL" : enumC1798b.name());
    }

    private final synchronized zzfiz zzm(String str, EnumC1798b enumC1798b) {
        return (zzfiz) this.zza.get(zzd(str, enumC1798b));
    }

    private final synchronized Object zzn(Class cls, String str, EnumC1798b enumC1798b) {
        ((m3.b) this.zzg).getClass();
        this.zzd.zze(enumC1798b, System.currentTimeMillis());
        zzfiz zzm = zzm(str, enumC1798b);
        if (zzm == null) {
            return null;
        }
        try {
            String zzg = zzm.zzg();
            Object zzf = zzm.zzf();
            Object cast = zzf == null ? null : cls.cast(zzf);
            if (cast != null) {
                zzfil zzfilVar = this.zzd;
                ((m3.b) this.zzg).getClass();
                zzfilVar.zzf(enumC1798b, System.currentTimeMillis(), zzg);
            }
            return cast;
        } catch (ClassCastException e7) {
            o.f1952C.f1961g.zzw(e7, "PreloadAdManager.pollAd");
            J.l("Unable to cast ad to the requested type:".concat(cls.getName()), e7);
            return null;
        }
    }

    private final synchronized List zzo(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.client.zzfq zzfqVar = (com.google.android.gms.ads.internal.client.zzfq) it.next();
                String zzd = zzd(zzfqVar.f10729a, EnumC1798b.a(zzfqVar.f10730b));
                hashSet.add(zzd);
                zzfiz zzfizVar = (zzfiz) this.zza.get(zzd);
                if (zzfizVar != null) {
                    if (zzfizVar.zze.equals(zzfqVar)) {
                        zzfizVar.zzu(zzfqVar.f10732d);
                    } else {
                        this.zzb.put(zzd, zzfizVar);
                        this.zza.remove(zzd);
                    }
                } else if (this.zzb.containsKey(zzd)) {
                    zzfiz zzfizVar2 = (zzfiz) this.zzb.get(zzd);
                    if (zzfizVar2.zze.equals(zzfqVar)) {
                        zzfizVar2.zzu(zzfqVar.f10732d);
                        zzfizVar2.zzr();
                        this.zza.put(zzd, zzfizVar2);
                        this.zzb.remove(zzd);
                    }
                } else {
                    arrayList.add(zzfqVar);
                }
            }
            Iterator it2 = this.zza.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.zzb.put((String) entry.getKey(), (zzfiz) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.zzb.entrySet().iterator();
            while (it3.hasNext()) {
                zzfiz zzfizVar3 = (zzfiz) ((Map.Entry) it3.next()).getValue();
                zzfizVar3.zzt();
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzw)).booleanValue()) {
                    zzfizVar3.zzo();
                }
                if (!zzfizVar3.zzv()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized void zzp(String str, zzfiz zzfizVar) {
        zzfizVar.zzd();
        this.zza.put(str, zzfizVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzq(boolean z4) {
        try {
            if (z4) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzfiz) it.next()).zzr();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzfiz) it2.next()).zzf.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzr(boolean z4) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzu)).booleanValue()) {
            zzq(z4);
        }
    }

    private final synchronized boolean zzs(String str, EnumC1798b enumC1798b) {
        boolean z4;
        Long l7;
        try {
            ((m3.b) this.zzg).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            zzfiz zzm = zzm(str, enumC1798b);
            z4 = false;
            if (zzm != null && zzm.zzv()) {
                z4 = true;
            }
            if (z4) {
                ((m3.b) this.zzg).getClass();
                l7 = Long.valueOf(System.currentTimeMillis());
            } else {
                l7 = null;
            }
            this.zzd.zzb(enumC1798b, currentTimeMillis, l7, zzm == null ? null : zzm.zzg());
        } catch (Throwable th) {
            throw th;
        }
        return z4;
    }

    public final synchronized zzazq zza(String str) {
        return (zzazq) zzn(zzazq.class, str, EnumC1798b.APP_OPEN_AD);
    }

    public final synchronized M zzb(String str) {
        return (M) zzn(M.class, str, EnumC1798b.INTERSTITIAL);
    }

    public final synchronized zzbvt zzc(String str) {
        return (zzbvt) zzn(zzbvt.class, str, EnumC1798b.REWARDED);
    }

    public final void zzg() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    try {
                        this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                    } catch (ClassCastException e7) {
                        int i7 = J.f3546b;
                        j.h("Failed to get connectivity manager", e7);
                    }
                }
            }
        }
        if (!c.h() || this.zzf == null) {
            this.zzh = new AtomicInteger(((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzA)).intValue());
            return;
        }
        try {
            this.zzf.registerDefaultNetworkCallback(new zzfio(this));
        } catch (RuntimeException e8) {
            int i8 = J.f3546b;
            j.h("Failed to register network callback", e8);
            this.zzh = new AtomicInteger(((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzA)).intValue());
        }
    }

    public final void zzh(zzboo zzbooVar) {
        this.zzc.zzb(zzbooVar);
    }

    public final synchronized void zzi(List list, S s7) {
        try {
            List<com.google.android.gms.ads.internal.client.zzfq> zzo = zzo(list);
            EnumMap enumMap = new EnumMap(EnumC1798b.class);
            for (com.google.android.gms.ads.internal.client.zzfq zzfqVar : zzo) {
                String str = zzfqVar.f10729a;
                EnumC1798b a2 = EnumC1798b.a(zzfqVar.f10730b);
                zzfiz zza = this.zzc.zza(zzfqVar, s7);
                if (a2 != null && zza != null) {
                    AtomicInteger atomicInteger = this.zzh;
                    if (atomicInteger != null) {
                        zza.zzq(atomicInteger.get());
                    }
                    zza.zzs(this.zzd);
                    zzp(zzd(str, a2), zza);
                    zzfpq zzfpqVar = d.f3805b;
                    enumMap.put((EnumMap) a2, (EnumC1798b) Integer.valueOf(((Integer) (enumMap.containsKey(a2) ? enumMap.get(a2) : 0)).intValue() + 1));
                    zzfil zzfilVar = this.zzd;
                    int i7 = zzfqVar.f10732d;
                    ((m3.b) this.zzg).getClass();
                    zzfilVar.zzi(a2, i7, System.currentTimeMillis());
                }
            }
            zzfil zzfilVar2 = this.zzd;
            ((m3.b) this.zzg).getClass();
            zzfilVar2.zzh(enumMap, System.currentTimeMillis());
            o.f1952C.f1960f.zzc(new zzfin(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzj(String str) {
        return zzs(str, EnumC1798b.APP_OPEN_AD);
    }

    public final synchronized boolean zzk(String str) {
        return zzs(str, EnumC1798b.INTERSTITIAL);
    }

    public final synchronized boolean zzl(String str) {
        return zzs(str, EnumC1798b.REWARDED);
    }
}
