package com.google.android.gms.internal.ads;

import E2.o;
import F2.AbstractBinderC0236j0;
import F2.C0254t;
import F2.InterfaceC0257u0;
import I2.C0294b;
import I2.C0303k;
import I2.J;
import I2.M;
import I2.P;
import J2.j;
import W5.AbstractC0486a1;
import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzcjb extends AbstractBinderC0236j0 {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdog zzc;
    private final zzebt zzd;
    private final zzehz zze;
    private final zzdsu zzf;
    private final zzbxm zzg;
    private final zzdol zzh;
    private final zzdtp zzi;
    private final zzber zzj;
    private final zzfgb zzk;
    private final zzfbw zzl;
    private final zzcsg zzm;
    private final zzdqq zzn;
    private boolean zzo = false;
    private final Long zzp;

    public zzcjb(Context context, VersionInfoParcel versionInfoParcel, zzdog zzdogVar, zzebt zzebtVar, zzehz zzehzVar, zzdsu zzdsuVar, zzbxm zzbxmVar, zzdol zzdolVar, zzdtp zzdtpVar, zzber zzberVar, zzfgb zzfgbVar, zzfbw zzfbwVar, zzcsg zzcsgVar, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdogVar;
        this.zzd = zzebtVar;
        this.zze = zzehzVar;
        this.zzf = zzdsuVar;
        this.zzg = zzbxmVar;
        this.zzh = zzdolVar;
        this.zzi = zzdtpVar;
        this.zzj = zzberVar;
        this.zzk = zzfgbVar;
        this.zzl = zzfbwVar;
        this.zzm = zzcsgVar;
        this.zzn = zzdqqVar;
        o.f1952C.j.getClass();
        this.zzp = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public static void zzb(zzcjb zzcjbVar) {
        o.f1952C.f1966m.zzd(zzcjbVar.zza, zzcjbVar.zzn);
    }

    public static void zzc(zzcjb zzcjbVar, Runnable runnable) {
        D.d("Adapters must be initialized on the main thread.");
        Map mapZze = ((M) o.f1952C.f1961g.zzi()).n().zze();
        if (mapZze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i7 = J.f3546b;
                j.h("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (zzcjbVar.zzc.zzd()) {
            HashMap map = new HashMap();
            Iterator it = mapZze.values().iterator();
            while (it.hasNext()) {
                for (zzboh zzbohVar : ((zzboi) it.next()).zza) {
                    String str = zzbohVar.zzb;
                    for (String str2 : zzbohVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzebu zzebuVarZza = zzcjbVar.zzd.zza(str3, jSONObject);
                    if (zzebuVarZza != null) {
                        zzfby zzfbyVar = (zzfby) zzebuVarZza.zzb;
                        if (!zzfbyVar.zzC() && zzfbyVar.zzB()) {
                            zzfbyVar.zzj(zzcjbVar.zza, (zzedj) zzebuVarZza.zzc, (List) entry.getValue());
                            int i8 = J.f3546b;
                            j.b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfbh e7) {
                    String strH = AbstractC0486a1.h("Failed to initialize rewarded video mediation adapter \"", str3, "\"");
                    int i9 = J.f3546b;
                    j.h(strH, e7);
                }
            }
        }
    }

    @Override // F2.InterfaceC0238k0
    public final synchronized float zze() {
        return o.f1952C.f1962h.a();
    }

    @Override // F2.InterfaceC0238k0
    public final String zzf() {
        return this.zzb.f10834a;
    }

    @Override // F2.InterfaceC0238k0
    public final List zzg() {
        return this.zzf.zzg();
    }

    @Override // F2.InterfaceC0238k0
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzi() {
        this.zzf.zzq();
    }

    @Override // F2.InterfaceC0238k0
    public final void zzj(boolean z4) throws RemoteException {
        try {
            zzfpv.zza(this.zza).zzc(z4);
            if (z4) {
                return;
            }
            try {
                if (this.zza.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e7) {
                o.f1952C.f1961g.zzw(e7, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e8) {
            throw new RemoteException(e8.getMessage());
        }
    }

    @Override // F2.InterfaceC0238k0
    public final synchronized void zzk() {
        if (this.zzo) {
            int i7 = J.f3546b;
            j.g("Mobile ads is initialized already.");
            return;
        }
        zzbby.zza(this.zza);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzb;
        o oVar = o.f1952C;
        oVar.f1961g.zzu(context, versionInfoParcel);
        this.zzm.zzd();
        oVar.f1963i.zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zzf();
        zzbbp zzbbpVar = zzbby.zzei;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            this.zzh.zzf();
        }
        this.zzi.zzg();
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjj)).booleanValue()) {
            zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx();
                }
            });
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzkV)).booleanValue()) {
            zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj.zza(new zzbtq());
                }
            });
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzdg)).booleanValue()) {
            zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcix
                @Override // java.lang.Runnable
                public final void run() {
                    zzfce.zzb(this.zza.zza, true);
                }
            });
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzeL)).booleanValue()) {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzeM)).booleanValue()) {
                zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciy
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcjb.zzb(this.zza);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // F2.InterfaceC0238k0
    public final void zzl(String str, p105o3.a aVar) {
        String strF;
        Runnable runnable;
        zzbby.zza(this.zza);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzen)).booleanValue()) {
            try {
                P p5 = o.f1952C.f1957c;
                strF = P.F(this.zza);
            } catch (RemoteException | RuntimeException e7) {
                o.f1952C.f1961g.zzw(e7, "NonagonMobileAdsSettingManager_AppId");
                strF = "";
            }
        } else {
            strF = "";
        }
        boolean z4 = true;
        String str2 = true == TextUtils.isEmpty(strF) ? str : strF;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzbbp zzbbpVar = zzbby.zzeg;
        C0254t c0254t = C0254t.f2723d;
        boolean zBooleanValue = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue();
        zzbbp zzbbpVar2 = zzbby.zzbd;
        zzbbw zzbbwVar = c0254t.f2726c;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue();
        if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue()) {
            final Runnable runnable2 = (Runnable) p105o3.b.t0(aVar);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcja
                @Override // java.lang.Runnable
                public final void run() {
                    zzgbn zzgbnVar = zzbza.zzf;
                    final zzcjb zzcjbVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzgbnVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcjb.zzc(zzcjbVar, runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z4 = zBooleanValue2;
        }
        zzcja zzcjaVar = runnable;
        if (z4) {
            o.f1952C.f1964k.G(this.zza, this.zzb, true, null, str2, null, zzcjaVar, this.zzk, this.zzn, this.zzp);
        }
    }

    @Override // F2.InterfaceC0238k0
    public final void zzm(InterfaceC0257u0 interfaceC0257u0) {
        this.zzi.zzh(interfaceC0257u0, zzdto.API);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzn(p105o3.a aVar, String str) {
        if (aVar == null) {
            int i7 = J.f3546b;
            j.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) p105o3.b.t0(aVar);
        if (context == null) {
            int i8 = J.f3546b;
            j.d("Context is null. Failed to open debug menu.");
        } else {
            C0303k c0303k = new C0303k(context);
            c0303k.f3617d = str;
            c0303k.f3618e = this.zzb.f10834a;
            c0303k.b();
        }
    }

    @Override // F2.InterfaceC0238k0
    public final void zzo(zzboo zzbooVar) {
        this.zzl.zzf(zzbooVar);
    }

    @Override // F2.InterfaceC0238k0
    public final synchronized void zzp(boolean z4) {
        C0294b c0294b = o.f1952C.f1962h;
        synchronized (c0294b) {
            c0294b.f3591a = z4;
        }
    }

    @Override // F2.InterfaceC0238k0
    public final synchronized void zzq(float f7) {
        C0294b c0294b = o.f1952C.f1962h;
        synchronized (c0294b) {
            c0294b.f3592b = f7;
        }
    }

    @Override // F2.InterfaceC0238k0
    public final synchronized void zzr(String str) {
        zzbby.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeg)).booleanValue()) {
                o.f1952C.f1964k.G(this.zza, this.zzb, true, null, str, null, null, this.zzk, null, null);
            }
        }
    }

    @Override // F2.InterfaceC0238k0
    public final void zzs(zzble zzbleVar) {
        this.zzf.zzs(zzbleVar);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzt(String str) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzju)).booleanValue()) {
            o.f1952C.f1961g.zzz(str);
        }
    }

    @Override // F2.InterfaceC0238k0
    public final void zzu(com.google.android.gms.ads.internal.client.zzfs zzfsVar) {
        this.zzg.zzn(this.zza, zzfsVar);
    }

    @Override // F2.InterfaceC0238k0
    public final synchronized boolean zzv() {
        boolean z4;
        C0294b c0294b = o.f1952C.f1962h;
        synchronized (c0294b) {
            z4 = c0294b.f3591a;
        }
        return z4;
    }

    public final void zzx() {
        boolean z4;
        String str;
        o oVar = o.f1952C;
        M m7 = (M) oVar.f1961g.zzi();
        m7.l();
        synchronized (m7.f3551a) {
            z4 = m7.f3574y;
        }
        if (z4) {
            M m8 = (M) oVar.f1961g.zzi();
            m8.l();
            synchronized (m8.f3551a) {
                str = m8.f3575z;
            }
            if (oVar.f1967n.f(this.zza, str, this.zzb.f10834a)) {
                return;
            }
            ((M) oVar.f1961g.zzi()).r(false);
            ((M) oVar.f1961g.zzi()).q("");
        }
    }
}
