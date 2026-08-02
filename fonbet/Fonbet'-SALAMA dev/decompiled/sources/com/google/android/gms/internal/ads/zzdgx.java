package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.InterfaceC0244n0;
import F2.InterfaceC0250q0;
import F2.InterfaceC0265y0;
import I2.J;
import I2.P;
import J2.j;
import W5.AbstractC0486a1;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdgx extends zzcpw {
    public static final /* synthetic */ int zzc = 0;
    private final Executor zzd;
    private final zzdhc zze;
    private final zzdhk zzf;
    private final zzdic zzg;
    private final zzdhh zzh;
    private final zzdhn zzi;
    private final zzhea zzj;
    private final zzhea zzk;
    private final zzhea zzl;
    private final zzhea zzm;
    private final zzhea zzn;
    private zzdja zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbxi zzs;
    private final zzauo zzt;
    private final VersionInfoParcel zzu;
    private final Context zzv;
    private final zzdgz zzw;
    private final zzejg zzx;
    private final Map zzy;
    private final List zzz;

    static {
        zzfwh.zzs("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public zzdgx(zzcpv zzcpvVar, Executor executor, zzdhc zzdhcVar, zzdhk zzdhkVar, zzdic zzdicVar, zzdhh zzdhhVar, zzdhn zzdhnVar, zzhea zzheaVar, zzhea zzheaVar2, zzhea zzheaVar3, zzhea zzheaVar4, zzhea zzheaVar5, zzbxi zzbxiVar, zzauo zzauoVar, VersionInfoParcel versionInfoParcel, Context context, zzdgz zzdgzVar, zzejg zzejgVar, zzaxz zzaxzVar) {
        super(zzcpvVar);
        this.zzd = executor;
        this.zze = zzdhcVar;
        this.zzf = zzdhkVar;
        this.zzg = zzdicVar;
        this.zzh = zzdhhVar;
        this.zzi = zzdhnVar;
        this.zzj = zzheaVar;
        this.zzk = zzheaVar2;
        this.zzl = zzheaVar3;
        this.zzm = zzheaVar4;
        this.zzn = zzheaVar5;
        this.zzs = zzbxiVar;
        this.zzt = zzauoVar;
        this.zzu = versionInfoParcel;
        this.zzv = context;
        this.zzw = zzdgzVar;
        this.zzx = zzejgVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
    }

    public static boolean zzY(View view) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkD)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        P p5 = o.f1952C.f1957c;
        long J5 = P.J(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (J5 >= ((Integer) r1.f2726c.zzb(zzbby.zzkE)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized ImageView.ScaleType zzaa() {
        zzdja zzdjaVar = this.zzo;
        if (zzdjaVar == null) {
            int i7 = J.f3546b;
            j.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        InterfaceC1506a zzj = zzdjaVar.zzj();
        if (zzj != null) {
            return (ImageView.ScaleType) BinderC1507b.t0(zzj);
        }
        return zzdic.zza;
    }

    private final void zzab(String str, boolean z4) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfr)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        I3.b zzw = this.zze.zzw();
        if (zzw == null) {
            return;
        }
        zzgbc.zzr(zzw, new zzdgv(this, "Google", true), this.zzd);
    }

    private final synchronized void zzac(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzr(view, map, map2, zzaa());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad(View view, zzebm zzebmVar) {
        zzceb zzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzebmVar == null || zzr == null || view == null) {
            return;
        }
        o.f1952C.f1977x.zzj(zzebmVar.zza(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzae(zzdja zzdjaVar) {
        Iterator<String> keys;
        View view;
        zzauj zzc2;
        try {
            if (!this.zzp) {
                this.zzo = zzdjaVar;
                this.zzg.zze(zzdjaVar);
                this.zzf.zzz(zzdjaVar.zzf(), zzdjaVar.zzm(), zzdjaVar.zzn(), zzdjaVar, zzdjaVar);
                zzbbp zzbbpVar = zzbby.zzcO;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
                    zzc2.zzo(zzdjaVar.zzf());
                }
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzbV)).booleanValue()) {
                    zzfaf zzfafVar = this.zzb;
                    if (zzfafVar.zzak && (keys = zzfafVar.zzaj.keys()) != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            zzdja zzdjaVar2 = this.zzo;
                            WeakReference weakReference = zzdjaVar2 == null ? null : (WeakReference) zzdjaVar2.zzl().get(next);
                            this.zzy.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzaxy zzaxyVar = new zzaxy(this.zzv, view);
                                this.zzz.add(zzaxyVar);
                                zzaxyVar.zzd(new zzdgu(this, next));
                            }
                        }
                    }
                }
                if (zzdjaVar.zzi() != null) {
                    zzdjaVar.zzi().zzd(this.zzs);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(zzdja zzdjaVar) {
        this.zzf.zzA(zzdjaVar.zzf(), zzdjaVar.zzl());
        if (zzdjaVar.zzh() != null) {
            zzdjaVar.zzh().setClickable(false);
            zzdjaVar.zzh().removeAllViews();
        }
        if (zzdjaVar.zzi() != null) {
            zzdjaVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzs(zzdgx zzdgxVar, boolean z4) {
        zzdja zzdjaVar = zzdgxVar.zzo;
        if (zzdjaVar != null) {
            zzdgxVar.zzf.zzp(null, zzdjaVar.zzf(), zzdgxVar.zzo.zzl(), zzdgxVar.zzo.zzm(), z4, zzdgxVar.zzaa(), 0);
        } else {
            int i7 = J.f3546b;
            j.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    public static /* synthetic */ void zzt(zzdgx zzdgxVar) {
        try {
            zzdhc zzdhcVar = zzdgxVar.zze;
            int zzc2 = zzdhcVar.zzc();
            if (zzc2 == 1) {
                zzbgk zzb = zzdgxVar.zzi.zzb();
                if (zzb != null) {
                    zzdgxVar.zzab("Google", true);
                    zzb.zze((zzbga) zzdgxVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 2) {
                zzbgh zza = zzdgxVar.zzi.zza();
                if (zza != null) {
                    zzdgxVar.zzab("Google", true);
                    zza.zze((zzbfy) zzdgxVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 3) {
                zzbgq zzd = zzdgxVar.zzi.zzd(zzdhcVar.zzA());
                if (zzd != null) {
                    if (zzdgxVar.zze.zzs() != null) {
                        zzdgxVar.zzf("Google", true);
                    }
                    zzd.zze((zzbgd) zzdgxVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 6) {
                zzbgx zzf = zzdgxVar.zzi.zzf();
                if (zzf != null) {
                    zzdgxVar.zzab("Google", true);
                    zzf.zze((zzbhd) zzdgxVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (zzc2 != 7) {
                int i7 = J.f3546b;
                j.d("Wrong native template id!");
            } else {
                zzbls zzg = zzdgxVar.zzi.zzg();
                if (zzg != null) {
                    zzg.zzg((zzblm) zzdgxVar.zzm.zzb());
                }
            }
        } catch (RemoteException e7) {
            int i8 = J.f3546b;
            j.e("RemoteException when notifyAdLoad is called", e7);
        }
    }

    public static /* synthetic */ void zzu(zzdgx zzdgxVar, View view, boolean z4, int i7) {
        zzdja zzdjaVar = zzdgxVar.zzo;
        if (zzdjaVar != null) {
            zzdgxVar.zzf.zzp(view, zzdjaVar.zzf(), zzdgxVar.zzo.zzl(), zzdgxVar.zzo.zzm(), z4, zzdgxVar.zzaa(), i7);
        } else {
            int i8 = J.f3546b;
            j.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    public static /* synthetic */ void zzv(zzdgx zzdgxVar) {
        zzdgxVar.zzf.zzj();
        zzdgxVar.zze.zzI();
    }

    public final synchronized void zzA() {
        this.zzf.zzi();
    }

    public final synchronized void zzB(View view, Map map, Map map2, boolean z4) {
        try {
            if (!this.zzq) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbV)).booleanValue() && this.zzb.zzak) {
                    Iterator it = this.zzy.keySet().iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) this.zzy.get((String) it.next())).booleanValue()) {
                            break;
                        }
                    }
                }
                if (z4) {
                    zzac(view, map, map2);
                    return;
                }
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzec)).booleanValue() && map != null) {
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                        if (view2 != null && zzY(view2)) {
                            zzac(view, map, map2);
                            return;
                        }
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void zzC(InterfaceC0250q0 interfaceC0250q0) {
        this.zzf.zzk(interfaceC0250q0);
    }

    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z4) {
        zzceb zzs;
        this.zzg.zzc(this.zzo);
        this.zzf.zzl(view, view2, map, map2, z4, zzaa());
        if (this.zzr) {
            zzdhc zzdhcVar = this.zze;
            if (zzdhcVar.zzs() != null && (zzs = zzdhcVar.zzs()) != null) {
                zzs.zzd("onSdkAdUserInteractionClick", new r.b());
            }
        }
    }

    public final synchronized void zzE(final View view, final int i7) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlz)).booleanValue()) {
            zzdja zzdjaVar = this.zzo;
            if (zzdjaVar == null) {
                int i8 = J.f3546b;
                j.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z4 = zzdjaVar instanceof zzdhw;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdgx.zzu(zzdgx.this, view, z4, i7);
                    }
                });
            }
        }
    }

    public final synchronized void zzF(String str) {
        this.zzf.zzm(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.zzf.zzn(bundle);
    }

    public final synchronized void zzH() {
        zzdja zzdjaVar = this.zzo;
        if (zzdjaVar == null) {
            int i7 = J.f3546b;
            j.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z4 = zzdjaVar instanceof zzdhw;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgt
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgx.zzs(zzdgx.this, z4);
                }
            });
        }
    }

    public final void zzI(Bundle bundle) {
        final zzceb zzs = this.zze.zzs();
        if (zzs == null) {
            int i7 = J.f3546b;
            j.d("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgq
                @Override // java.lang.Runnable
                public final void run() {
                    int i8 = zzdgx.zzc;
                    zzceb.this.zze("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e7) {
            int i8 = J.f3546b;
            j.e("Error reading event signals", e7);
        }
    }

    public final synchronized void zzJ() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzs();
    }

    public final void zzK(View view) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfr)).booleanValue()) {
            zzdhc zzdhcVar = this.zze;
            if (zzdhcVar.zzc() != 3) {
                zzbzf zzp = zzdhcVar.zzp();
                if (zzp == null) {
                    return;
                }
                zzgbc.zzr(zzp, new zzdgw(this, view), this.zzd);
                return;
            }
        }
        zzad(view, this.zze.zzu());
    }

    public final synchronized void zzL(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzt(view, motionEvent, view2);
    }

    public final synchronized void zzM(Bundle bundle) {
        this.zzf.zzu(bundle);
    }

    public final synchronized void zzN(View view) {
        this.zzf.zzv(view);
    }

    public final synchronized void zzO() {
        this.zzf.zzw();
    }

    public final synchronized void zzP(InterfaceC0244n0 interfaceC0244n0) {
        this.zzf.zzx(interfaceC0244n0);
    }

    public final synchronized void zzQ(InterfaceC0265y0 interfaceC0265y0) {
        this.zzx.zza(interfaceC0265y0);
    }

    public final synchronized void zzR(zzbha zzbhaVar) {
        this.zzf.zzy(zzbhaVar);
    }

    public final synchronized void zzS(final zzdja zzdjaVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbT)).booleanValue()) {
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgm
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgx.this.zzae(zzdjaVar);
                }
            });
        } else {
            zzae(zzdjaVar);
        }
    }

    public final synchronized void zzT(final zzdja zzdjaVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbT)).booleanValue()) {
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgn
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgx.this.zzaf(zzdjaVar);
                }
            });
        } else {
            zzaf(zzdjaVar);
        }
    }

    public final boolean zzU() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzV() {
        return this.zzf.zzB();
    }

    public final synchronized boolean zzW() {
        return this.zzf.zzC();
    }

    public final boolean zzX() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzZ(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzD = this.zzf.zzD(bundle);
        this.zzq = zzD;
        return zzD;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcpw
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgs
            @Override // java.lang.Runnable
            public final void run() {
                zzdgx.zzv(zzdgx.this);
            }
        });
        super.zzb();
    }

    public final zzdgz zzc() {
        return this.zzw;
    }

    public final zzebm zzf(String str, boolean z4) {
        boolean z7;
        String str2;
        zzebj zzebjVar;
        zzebi zzebiVar;
        if (this.zzh.zzd() && !TextUtils.isEmpty(str)) {
            zzdhc zzdhcVar = this.zze;
            zzceb zzr = zzdhcVar.zzr();
            zzceb zzs = zzdhcVar.zzs();
            if (zzr == null && zzs == null) {
                int i7 = J.f3546b;
                j.g("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            this.zzh.zza();
            int zzc2 = this.zzh.zza().zzc();
            int i8 = zzc2 - 1;
            boolean z8 = false;
            if (i8 != 0) {
                if (i8 != 1) {
                    String h6 = AbstractC0486a1.h("Unknown omid media type: ", zzc2 != 1 ? zzc2 != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO", ". Not initializing Omid.");
                    int i9 = J.f3546b;
                    j.g(h6);
                    return null;
                }
                if (zzr == null) {
                    int i10 = J.f3546b;
                    j.g("Omid media type was display but there was no display webview.");
                    return null;
                }
                z7 = false;
                z8 = true;
            } else if (zzs != null) {
                z7 = true;
            } else {
                int i11 = J.f3546b;
                j.g("Omid media type was video but there was no video webview.");
            }
            if (z8) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzr = zzs;
            }
            if (zzr == null) {
                int i12 = J.f3546b;
                j.g("Webview is null in InternalNativeAd");
                return null;
            }
            Context context = this.zzv;
            o oVar = o.f1952C;
            if (!oVar.f1977x.zzl(context)) {
                int i13 = J.f3546b;
                j.g("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzu;
            String str3 = versionInfoParcel.f10835b + "." + versionInfoParcel.f10836c;
            if (z7) {
                zzebiVar = zzebi.VIDEO;
                zzebjVar = zzebj.DEFINED_BY_JAVASCRIPT;
            } else {
                zzdhc zzdhcVar2 = this.zze;
                zzebi zzebiVar2 = zzebi.NATIVE_DISPLAY;
                zzebjVar = zzdhcVar2.zzc() == 3 ? zzebj.UNSPECIFIED : zzebj.ONE_PIXEL;
                zzebiVar = zzebiVar2;
            }
            zzebm zzb = oVar.f1977x.zzb(str3, zzr.zzG(), "", "javascript", str2, str, zzebjVar, zzebiVar, this.zzb.zzal);
            if (zzb == null) {
                int i14 = J.f3546b;
                j.g("Failed to create omid session in InternalNativeAd");
                return null;
            }
            this.zze.zzW(zzb);
            zzr.zzat(zzb);
            zzebg zzebgVar = oVar.f1977x;
            if (z7) {
                zzfjh zza = zzb.zza();
                if (zzs != null) {
                    zzebgVar.zzj(zza, zzs.zzF());
                }
                this.zzr = true;
            }
            if (z4) {
                zzebgVar.zzk(zzb.zza());
                zzr.zzd("onSdkLoaded", new r.b());
            }
            return zzb;
        }
        return null;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzaa());
    }

    public final synchronized JSONObject zzj(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzaa());
    }

    @Override // com.google.android.gms.internal.ads.zzcpw
    public final void zzk() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgo
            @Override // java.lang.Runnable
            public final void run() {
                zzdgx.zzt(zzdgx.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdhk zzdhkVar = this.zzf;
            Objects.requireNonNull(zzdhkVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgp
                @Override // java.lang.Runnable
                public final void run() {
                    zzdhk.this.zzq();
                }
            });
        }
        super.zzk();
    }

    public final void zzz(View view) {
        zzebm zzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzu == null || view == null) {
            return;
        }
        o.f1952C.f1977x.zzg(zzu.zza(), view);
    }
}
