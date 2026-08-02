package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.I0;
import J2.d;
import L2.e;
import L2.f;
import L2.g;
import L2.h;
import L2.j;
import L2.k;
import L2.l;
import L2.n;
import L2.p;
import L2.q;
import L2.r;
import L2.t;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import e6.C1054c;
import io.sentry.protocol.SentryStackFrame;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import org.json.JSONException;
import org.json.JSONObject;
import y2.C1797a;
import y2.EnumC1798b;

/* loaded from: classes.dex */
public final class zzbpp extends zzboq {
    private final Object zza;
    private zzbpr zzb;
    private zzbvl zzc;
    private InterfaceC1506a zzd;
    private View zze;
    private k zzf;
    private t zzg;
    private r zzh;
    private p zzi;
    private j zzj;
    private f zzk;
    private final String zzl = "";

    public zzbpp(L2.a aVar) {
        this.zza = aVar;
    }

    private final Bundle zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.f10742D;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle zzW(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) {
        J2.j.b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.f10762x);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            J2.j.e("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.f10761f) {
            return true;
        }
        d dVar = C0252s.f2717f.f2718a;
        return d.n();
    }

    private static final String zzY(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        String str2 = zzmVar.f10750L;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzA(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        Object obj = this.zza;
        if (!(obj instanceof L2.a)) {
            J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        J2.j.b("Requesting rewarded ad from adapter.");
        try {
            L2.a aVar = (L2.a) this.zza;
            zzbpn zzbpnVar = new zzbpn(this, zzbouVar);
            zzW(str, zzmVar, null);
            zzV(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.f10740B;
            zzY(str, zzmVar);
            aVar.loadRewardedAd(new q(), zzbpnVar);
        } catch (Exception e7) {
            J2.j.e("", e7);
            zzbol.zza(interfaceC1506a, e7, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) {
        Object obj = this.zza;
        if (obj instanceof L2.a) {
            zzA(this.zzd, zzmVar, str, new zzbps((L2.a) obj, this.zzc));
            return;
        }
        J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzC(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        Object obj = this.zza;
        if (!(obj instanceof L2.a)) {
            J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        J2.j.b("Requesting rewarded interstitial ad from adapter.");
        try {
            L2.a aVar = (L2.a) this.zza;
            zzbpn zzbpnVar = new zzbpn(this, zzbouVar);
            zzW(str, zzmVar, null);
            zzV(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.f10740B;
            zzY(str, zzmVar);
            aVar.loadRewardedInterstitialAd(new q(), zzbpnVar);
        } catch (Exception e7) {
            zzbol.zza(interfaceC1506a, e7, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzD(InterfaceC1506a interfaceC1506a) {
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzE() {
        Object obj = this.zza;
        if (obj instanceof e) {
            try {
                ((e) obj).onPause();
            } catch (Throwable th) {
                J2.j.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzF() {
        Object obj = this.zza;
        if (obj instanceof e) {
            try {
                ((e) obj).onResume();
            } catch (Throwable th) {
                J2.j.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzG(boolean z4) {
        Object obj = this.zza;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z4);
                return;
            } catch (Throwable th) {
                J2.j.e("", th);
                return;
            }
        }
        J2.j.b(AbstractAdViewAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzH(InterfaceC1506a interfaceC1506a) {
        Object obj = this.zza;
        if (obj instanceof L2.a) {
            J2.j.b("Show app open ad from adapter.");
            J2.j.d("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzI() {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            J2.j.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
                return;
            } catch (Throwable th) {
                J2.j.e("", th);
                throw new RemoteException();
            }
        }
        J2.j.g(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzJ(InterfaceC1506a interfaceC1506a) {
        Object obj = this.zza;
        if ((obj instanceof L2.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzI();
                return;
            } else {
                J2.j.b("Show interstitial ad from adapter.");
                J2.j.d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        J2.j.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzK(InterfaceC1506a interfaceC1506a) {
        Object obj = this.zza;
        if (obj instanceof L2.a) {
            J2.j.b("Show rewarded ad from adapter.");
            J2.j.d("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzL() {
        Object obj = this.zza;
        if (obj instanceof L2.a) {
            J2.j.d("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final boolean zzN() {
        Object obj = this.zza;
        if ((obj instanceof L2.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        Object obj2 = this.zza;
        J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzboz zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbpa zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final I0 zzh() {
        Object obj = this.zza;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                J2.j.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbgd zzi() {
        zzbge zzc;
        zzbpr zzbprVar = this.zzb;
        if (zzbprVar == null || (zzc = zzbprVar.zzc()) == null) {
            return null;
        }
        return zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbox zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbpd zzk() {
        t tVar;
        t zza;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof L2.a) || (tVar = this.zzg) == null) {
                return null;
            }
            return new zzbpv(tVar);
        }
        zzbpr zzbprVar = this.zzb;
        if (zzbprVar == null || (zza = zzbprVar.zza()) == null) {
            return null;
        }
        return new zzbpv(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbrc zzl() {
        Object obj = this.zza;
        if (obj instanceof L2.a) {
            return zzbrc.zza(((L2.a) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbrc zzm() {
        Object obj = this.zza;
        if (obj instanceof L2.a) {
            return zzbrc.zza(((L2.a) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final InterfaceC1506a zzn() {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new BinderC1507b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                J2.j.e("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof L2.a) {
            return new BinderC1507b(this.zze);
        }
        J2.j.g(MediationBannerAdapter.class.getCanonicalName() + " or " + L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzo() {
        Object obj = this.zza;
        if (obj instanceof e) {
            try {
                ((e) obj).onDestroy();
            } catch (Throwable th) {
                J2.j.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzp(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvl zzbvlVar, String str2) {
        Object obj = this.zza;
        if ((obj instanceof L2.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = interfaceC1506a;
            this.zzc = zzbvlVar;
            zzbvlVar.zzl(new BinderC1507b(this.zza));
            return;
        }
        Object obj2 = this.zza;
        J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzlP)).booleanValue() != false) goto L43;
     */
    @Override // com.google.android.gms.internal.ads.zzbor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzq(InterfaceC1506a interfaceC1506a, zzblb zzblbVar, List list) {
        char c3;
        if (!(this.zza instanceof L2.a)) {
            throw new RemoteException();
        }
        zzbpi zzbpiVar = new zzbpi(this, zzblbVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((zzblh) it.next()).zza;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1052618729:
                    if (str.equals(SentryStackFrame.JsonKeys.NATIVE)) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            EnumC1798b enumC1798b = EnumC1798b.APP_OPEN_AD;
            switch (c3) {
                case 0:
                    enumC1798b = EnumC1798b.BANNER;
                    break;
                case 1:
                    enumC1798b = EnumC1798b.INTERSTITIAL;
                    break;
                case 2:
                    enumC1798b = EnumC1798b.REWARDED;
                    break;
                case 3:
                    enumC1798b = EnumC1798b.REWARDED_INTERSTITIAL;
                    break;
                case 4:
                    enumC1798b = EnumC1798b.NATIVE;
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    enumC1798b = null;
                    break;
            }
            if (enumC1798b != null) {
                arrayList.add(new C1054c(6));
            }
        }
        ((L2.a) this.zza).initialize((Context) BinderC1507b.t0(interfaceC1506a), zzbpiVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzr(InterfaceC1506a interfaceC1506a, zzbvl zzbvlVar, List list) {
        J2.j.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        zzB(zzmVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzt(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        Object obj = this.zza;
        if (!(obj instanceof L2.a)) {
            J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        J2.j.b("Requesting app open ad from adapter.");
        try {
            L2.a aVar = (L2.a) this.zza;
            zzbpo zzbpoVar = new zzbpo(this, zzbouVar);
            zzW(str, zzmVar, null);
            zzV(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.f10740B;
            zzY(str, zzmVar);
            aVar.loadAppOpenAd(new g(), zzbpoVar);
        } catch (Exception e7) {
            J2.j.e("", e7);
            zzbol.zza(interfaceC1506a, e7, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzu(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        zzv(interfaceC1506a, zzrVar, zzmVar, str, null, zzbouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzv(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) {
        y2.j jVar;
        Object obj = this.zza;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof L2.a)) {
            J2.j.g(MediationBannerAdapter.class.getCanonicalName() + " or " + L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        J2.j.b("Requesting banner ad from adapter.");
        boolean z4 = zzrVar.f10769E;
        int i7 = zzrVar.f10772b;
        int i8 = zzrVar.f10775e;
        if (z4) {
            y2.j jVar2 = new y2.j(i8, i7);
            jVar2.f18168e = true;
            jVar2.f18169f = i7;
            jVar = jVar2;
        } else {
            jVar = new y2.j(i8, i7, zzrVar.f10771a);
        }
        Object obj2 = this.zza;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = zzmVar.f10760e;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j = zzmVar.f10757b;
                zzbpg zzbpgVar = new zzbpg(j == -1 ? null : new Date(j), zzmVar.f10759d, hashSet, zzmVar.f10740B, zzX(zzmVar), zzmVar.f10762x, zzmVar.f10747I, zzmVar.f10749K, zzY(str, zzmVar));
                Bundle bundle = zzmVar.f10742D;
                mediationBannerAdapter.requestBannerAd((Context) BinderC1507b.t0(interfaceC1506a), new zzbpr(zzbouVar), zzW(str, zzmVar, str2), jVar, zzbpgVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                J2.j.e("", th);
                zzbol.zza(interfaceC1506a, th, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof L2.a) {
            try {
                zzbpj zzbpjVar = new zzbpj(this, zzbouVar);
                zzW(str, zzmVar, str2);
                zzV(zzmVar);
                zzX(zzmVar);
                Location location = zzmVar.f10740B;
                zzY(str, zzmVar);
                ((L2.a) obj2).loadBannerAd(new h(), zzbpjVar);
            } catch (Throwable th2) {
                J2.j.e("", th2);
                zzbol.zza(interfaceC1506a, th2, "adapter.loadBannerAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzw(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) {
        Object obj = this.zza;
        if (!(obj instanceof L2.a)) {
            J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        J2.j.b("Requesting interscroller ad from adapter.");
        try {
            L2.a aVar = (L2.a) this.zza;
            zzbph zzbphVar = new zzbph(this, zzbouVar, aVar);
            zzW(str, zzmVar, str2);
            zzV(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.f10740B;
            zzY(str, zzmVar);
            int i7 = zzrVar.f10775e;
            int i8 = zzrVar.f10772b;
            y2.j jVar = new y2.j(i7, i8);
            jVar.f18170g = true;
            jVar.f18171h = i8;
            zzbphVar.onFailure(new C1797a(7, aVar.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Exception e7) {
            J2.j.e("", e7);
            zzbol.zza(interfaceC1506a, e7, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzx(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) {
        zzy(interfaceC1506a, zzmVar, str, null, zzbouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzy(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) {
        Object obj = this.zza;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof L2.a)) {
            J2.j.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        J2.j.b("Requesting interstitial ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                List list = zzmVar.f10760e;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j = zzmVar.f10757b;
                zzbpg zzbpgVar = new zzbpg(j == -1 ? null : new Date(j), zzmVar.f10759d, hashSet, zzmVar.f10740B, zzX(zzmVar), zzmVar.f10762x, zzmVar.f10747I, zzmVar.f10749K, zzY(str, zzmVar));
                Bundle bundle = zzmVar.f10742D;
                mediationInterstitialAdapter.requestInterstitialAd((Context) BinderC1507b.t0(interfaceC1506a), new zzbpr(zzbouVar), zzW(str, zzmVar, str2), zzbpgVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                J2.j.e("", th);
                zzbol.zza(interfaceC1506a, th, "adapter.requestInterstitialAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof L2.a) {
            try {
                zzbpk zzbpkVar = new zzbpk(this, zzbouVar);
                zzW(str, zzmVar, str2);
                zzV(zzmVar);
                zzX(zzmVar);
                Location location = zzmVar.f10740B;
                zzY(str, zzmVar);
                ((L2.a) obj2).loadInterstitialAd(new l(), zzbpkVar);
            } catch (Throwable th2) {
                J2.j.e("", th2);
                zzbol.zza(interfaceC1506a, th2, "adapter.loadInterstitialAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzz(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar, zzbey zzbeyVar, List list) {
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof L2.a)) {
            J2.j.g(MediationNativeAdapter.class.getCanonicalName() + " or " + L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        J2.j.b("Requesting native ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = zzmVar.f10760e;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j = zzmVar.f10757b;
                zzbpu zzbpuVar = new zzbpu(j == -1 ? null : new Date(j), zzmVar.f10759d, hashSet, zzmVar.f10740B, zzX(zzmVar), zzmVar.f10762x, zzbeyVar, list, zzmVar.f10747I, zzmVar.f10749K, zzY(str, zzmVar));
                Bundle bundle = zzmVar.f10742D;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbpr(zzbouVar);
                mediationNativeAdapter.requestNativeAd((Context) BinderC1507b.t0(interfaceC1506a), this.zzb, zzW(str, zzmVar, str2), zzbpuVar, bundle2);
                return;
            } catch (Throwable th) {
                J2.j.e("", th);
                zzbol.zza(interfaceC1506a, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof L2.a) {
            try {
                zzbpm zzbpmVar = new zzbpm(this, zzbouVar);
                zzW(str, zzmVar, str2);
                zzV(zzmVar);
                zzX(zzmVar);
                Location location = zzmVar.f10740B;
                zzY(str, zzmVar);
                ((L2.a) obj2).loadNativeAdMapper(new n(), zzbpmVar);
            } catch (Throwable th2) {
                J2.j.e("", th2);
                zzbol.zza(interfaceC1506a, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    L2.a aVar = (L2.a) this.zza;
                    zzbpl zzbplVar = new zzbpl(this, zzbouVar);
                    zzW(str, zzmVar, str2);
                    zzV(zzmVar);
                    zzX(zzmVar);
                    Location location2 = zzmVar.f10740B;
                    zzY(str, zzmVar);
                    aVar.loadNativeAd(new n(), zzbplVar);
                } catch (Throwable th3) {
                    J2.j.e("", th3);
                    zzbol.zza(interfaceC1506a, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    public zzbpp(e eVar) {
        this.zza = eVar;
    }
}
