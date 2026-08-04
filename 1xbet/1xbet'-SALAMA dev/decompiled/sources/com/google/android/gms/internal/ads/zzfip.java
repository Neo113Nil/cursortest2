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
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import p031e1.k;
import p090m3.c;
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
public final class zzfip {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfja zzc;
    private final zzfil zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final p090m3.a zzg;
    private AtomicInteger zzh;

    public zzfip(zzfja zzfjaVar, zzfil zzfilVar, Context context, p090m3.a aVar) {
        this.zzc = zzfjaVar;
        this.zzd = zzfilVar;
        this.zze = context;
        this.zzg = aVar;
    }

    public static String zzd(String str, EnumC1058b enumC1058b) {
        return k.f(str, "#", enumC1058b == null ? "NULL" : enumC1058b.name());
    }

    private final synchronized zzfiz zzm(String str, EnumC1058b enumC1058b) {
        return (zzfiz) this.zza.get(zzd(str, enumC1058b));
    }

    private final synchronized Object zzn(Class cls, String str, EnumC1058b enumC1058b) {
        ((p090m3.b) this.zzg).getClass();
        this.zzd.zze(enumC1058b, System.currentTimeMillis());
        zzfiz zzfizVarZzm = zzm(str, enumC1058b);
        if (zzfizVarZzm == null) {
            return null;
        }
        try {
            String strZzg = zzfizVarZzm.zzg();
            Object objZzf = zzfizVarZzm.zzf();
            Object objCast = objZzf == null ? null : cls.cast(objZzf);
            if (objCast != null) {
                zzfil zzfilVar = this.zzd;
                ((p090m3.b) this.zzg).getClass();
                zzfilVar.zzf(enumC1058b, System.currentTimeMillis(), strZzg);
            }
            return objCast;
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
                String strZzd = zzd(zzfqVar.f10729a, EnumC1058b.a(zzfqVar.f10730b));
                hashSet.add(strZzd);
                zzfiz zzfizVar = (zzfiz) this.zza.get(strZzd);
                if (zzfizVar != null) {
                    if (zzfizVar.zze.equals(zzfqVar)) {
                        zzfizVar.zzu(zzfqVar.f10732d);
                    } else {
                        this.zzb.put(strZzd, zzfizVar);
                        this.zza.remove(strZzd);
                    }
                } else if (this.zzb.containsKey(strZzd)) {
                    zzfiz zzfizVar2 = (zzfiz) this.zzb.get(strZzd);
                    if (zzfizVar2.zze.equals(zzfqVar)) {
                        zzfizVar2.zzu(zzfqVar.f10732d);
                        zzfizVar2.zzr();
                        this.zza.put(strZzd, zzfizVar2);
                        this.zzb.remove(strZzd);
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

    private final synchronized boolean zzs(String str, EnumC1058b enumC1058b) {
        boolean z4;
        Long lValueOf;
        try {
            ((p090m3.b) this.zzg).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfiz zzfizVarZzm = zzm(str, enumC1058b);
            z4 = false;
            if (zzfizVarZzm != null && zzfizVarZzm.zzv()) {
                z4 = true;
            }
            if (z4) {
                ((p090m3.b) this.zzg).getClass();
                lValueOf = Long.valueOf(System.currentTimeMillis());
            } else {
                lValueOf = null;
            }
            this.zzd.zzb(enumC1058b, jCurrentTimeMillis, lValueOf, zzfizVarZzm == null ? null : zzfizVarZzm.zzg());
        } catch (Throwable th) {
            throw th;
        }
        return z4;
    }

    public final synchronized zzazq zza(String str) {
        return (zzazq) zzn(zzazq.class, str, EnumC1058b.APP_OPEN_AD);
    }

    public final synchronized M zzb(String str) {
        return (M) zzn(M.class, str, EnumC1058b.INTERSTITIAL);
    }

    public final synchronized zzbvt zzc(String str) {
        return (zzbvt) zzn(zzbvt.class, str, EnumC1058b.REWARDED);
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final synchronized void zzi(List list, S s7) {
        try {
            List<com.google.android.gms.ads.internal.client.zzfq> listZzo = zzo(list);
            EnumMap enumMap = new EnumMap(EnumC1058b.class);
            for (com.google.android.gms.ads.internal.client.zzfq zzfqVar : listZzo) {
                String str = zzfqVar.f10729a;
                EnumC1058b enumC1058bA = EnumC1058b.a(zzfqVar.f10730b);
                zzfiz zzfizVarZza = this.zzc.zza(zzfqVar, s7);
                if (enumC1058bA != null && zzfizVarZza != null) {
                    AtomicInteger atomicInteger = this.zzh;
                    if (atomicInteger != null) {
                        zzfizVarZza.zzq(atomicInteger.get());
                    }
                    zzfizVarZza.zzs(this.zzd);
                    zzp(zzd(str, enumC1058bA), zzfizVarZza);
                    zzfpq zzfpqVar = d.f3805b;
                    enumMap.put(enumC1058bA, Integer.valueOf(((Integer) (enumMap.containsKey(enumC1058bA) ? enumMap.get(enumC1058bA) : 0)).intValue() + 1));
                    zzfil zzfilVar = this.zzd;
                    int i7 = zzfqVar.f10732d;
                    ((p090m3.b) this.zzg).getClass();
                    zzfilVar.zzi(enumC1058bA, i7, System.currentTimeMillis());
                }
            }
            zzfil zzfilVar2 = this.zzd;
            ((p090m3.b) this.zzg).getClass();
            zzfilVar2.zzh(enumMap, System.currentTimeMillis());
            o.f1952C.f1960f.zzc(new zzfin(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzj(String str) {
        return zzs(str, EnumC1058b.APP_OPEN_AD);
    }

    public final synchronized boolean zzk(String str) {
        return zzs(str, EnumC1058b.INTERSTITIAL);
    }

    public final synchronized boolean zzl(String str) {
        return zzs(str, EnumC1058b.REWARDED);
    }
}
