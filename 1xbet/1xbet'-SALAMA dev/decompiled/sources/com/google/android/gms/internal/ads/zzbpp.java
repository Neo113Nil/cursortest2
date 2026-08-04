package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p036e6.c;
import p167y2.C1057a;
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbpp extends zzboq {
    private final Object zza;
    private zzbpr zzb;
    private zzbvl zzc;
    private p105o3.a zzd;
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

    private final Bundle zzW(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) throws RemoteException {
        J2.j.b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
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
    public final void zzA(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof L2.a)) {
            J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        J2.j.b("Requesting rewarded ad from adapter.");
        try {
            L2.a aVar2 = (L2.a) this.zza;
            zzbpn zzbpnVar = new zzbpn(this, zzbouVar);
            zzW(str, zzmVar, null);
            zzV(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.f10740B;
            zzY(str, zzmVar);
            aVar2.loadRewardedAd(new q(), zzbpnVar);
        } catch (Exception e7) {
            J2.j.e("", e7);
            zzbol.zza(aVar, e7, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof L2.a) {
            zzA(this.zzd, zzmVar, str, new zzbps((L2.a) obj, this.zzc));
            return;
        }
        J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzC(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof L2.a)) {
            J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        J2.j.b("Requesting rewarded interstitial ad from adapter.");
        try {
            L2.a aVar2 = (L2.a) this.zza;
            zzbpn zzbpnVar = new zzbpn(this, zzbouVar);
            zzW(str, zzmVar, null);
            zzV(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.f10740B;
            zzY(str, zzmVar);
            aVar2.loadRewardedInterstitialAd(new q(), zzbpnVar);
        } catch (Exception e7) {
            zzbol.zza(aVar, e7, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzD(p105o3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzE() throws RemoteException {
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
    public final void zzF() throws RemoteException {
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
    public final void zzH(p105o3.a aVar) throws RemoteException {
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
    public final void zzI() throws RemoteException {
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
    public final void zzJ(p105o3.a aVar) throws RemoteException {
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
    public final void zzK(p105o3.a aVar) throws RemoteException {
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
    public final void zzL() throws RemoteException {
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
    public final boolean zzN() throws RemoteException {
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
        zzbge zzbgeVarZzc;
        zzbpr zzbprVar = this.zzb;
        if (zzbprVar == null || (zzbgeVarZzc = zzbprVar.zzc()) == null) {
            return null;
        }
        return zzbgeVarZzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbox zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final zzbpd zzk() {
        t tVar;
        t tVarZza;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof L2.a) || (tVar = this.zzg) == null) {
                return null;
            }
            return new zzbpv(tVar);
        }
        zzbpr zzbprVar = this.zzb;
        if (zzbprVar == null || (tVarZza = zzbprVar.zza()) == null) {
            return null;
        }
        return new zzbpv(tVarZza);
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
    public final p105o3.a zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new p105o3.b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                J2.j.e("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof L2.a) {
            return new p105o3.b(this.zze);
        }
        J2.j.g(MediationBannerAdapter.class.getCanonicalName() + " or " + L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzo() throws RemoteException {
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
    public final void zzp(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvl zzbvlVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof L2.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = aVar;
            this.zzc = zzbvlVar;
            zzbvlVar.zzl(new p105o3.b(this.zza));
            return;
        }
        Object obj2 = this.zza;
        J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzq(p105o3.a aVar, zzblb zzblbVar, List list) throws RemoteException {
        byte b7;
        if (!(this.zza instanceof L2.a)) {
            throw new RemoteException();
        }
        zzbpi zzbpiVar = new zzbpi(this, zzblbVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            switch (((zzblh) it.next()).zza) {
                case "banner":
                    b7 = 0;
                    break;
                case "native":
                    b7 = 4;
                    break;
                case "rewarded":
                    b7 = 2;
                    break;
                case "interstitial":
                    b7 = 1;
                    break;
                case "app_open":
                    b7 = 5;
                    break;
                case "app_open_ad":
                    b7 = 6;
                    break;
                case "rewarded_interstitial":
                    b7 = 3;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            EnumC1058b enumC1058b = EnumC1058b.APP_OPEN_AD;
            switch (b7) {
                case 0:
                    enumC1058b = EnumC1058b.BANNER;
                    break;
                case 1:
                    enumC1058b = EnumC1058b.INTERSTITIAL;
                    break;
                case 2:
                    enumC1058b = EnumC1058b.REWARDED;
                    break;
                case 3:
                    enumC1058b = EnumC1058b.REWARDED_INTERSTITIAL;
                    break;
                case 4:
                    enumC1058b = EnumC1058b.NATIVE;
                    break;
                case 5:
                    break;
                case 6:
                    if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlP)).booleanValue()) {
                    }
                default:
                    enumC1058b = null;
                    break;
            }
            if (enumC1058b != null) {
                arrayList.add(new c(6));
            }
        }
        ((L2.a) this.zza).initialize((Context) p105o3.b.t0(aVar), zzbpiVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzr(p105o3.a aVar, zzbvl zzbvlVar, List list) throws RemoteException {
        J2.j.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        zzB(zzmVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzt(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof L2.a)) {
            J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        J2.j.b("Requesting app open ad from adapter.");
        try {
            L2.a aVar2 = (L2.a) this.zza;
            zzbpo zzbpoVar = new zzbpo(this, zzbouVar);
            zzW(str, zzmVar, null);
            zzV(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.f10740B;
            zzY(str, zzmVar);
            aVar2.loadAppOpenAd(new g(), zzbpoVar);
        } catch (Exception e7) {
            J2.j.e("", e7);
            zzbol.zza(aVar, e7, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzu(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) throws RemoteException {
        zzv(aVar, zzrVar, zzmVar, str, null, zzbouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzv(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) throws RemoteException {
        p167y2.j jVar;
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
            p167y2.j jVar2 = new p167y2.j(i8, i7);
            jVar2.f18174e = true;
            jVar2.f18175f = i7;
            jVar = jVar2;
        } else {
            jVar = new p167y2.j(i8, i7, zzrVar.f10771a);
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
                mediationBannerAdapter.requestBannerAd((Context) p105o3.b.t0(aVar), new zzbpr(zzbouVar), zzW(str, zzmVar, str2), jVar, zzbpgVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                J2.j.e("", th);
                zzbol.zza(aVar, th, "adapter.requestBannerAd");
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
                zzbol.zza(aVar, th2, "adapter.loadBannerAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzw(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof L2.a)) {
            J2.j.g(L2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        J2.j.b("Requesting interscroller ad from adapter.");
        try {
            L2.a aVar2 = (L2.a) this.zza;
            zzbph zzbphVar = new zzbph(this, zzbouVar, aVar2);
            zzW(str, zzmVar, str2);
            zzV(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.f10740B;
            zzY(str, zzmVar);
            int i7 = zzrVar.f10775e;
            int i8 = zzrVar.f10772b;
            p167y2.j jVar = new p167y2.j(i7, i8);
            jVar.f18176g = true;
            jVar.f18177h = i8;
            zzbphVar.onFailure(new C1057a(7, aVar2.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Exception e7) {
            J2.j.e("", e7);
            zzbol.zza(aVar, e7, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzx(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbou zzbouVar) throws RemoteException {
        zzy(aVar, zzmVar, str, null, zzbouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzy(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar) throws RemoteException {
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
                mediationInterstitialAdapter.requestInterstitialAd((Context) p105o3.b.t0(aVar), new zzbpr(zzbouVar), zzW(str, zzmVar, str2), zzbpgVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                J2.j.e("", th);
                zzbol.zza(aVar, th, "adapter.requestInterstitialAd");
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
                zzbol.zza(aVar, th2, "adapter.loadInterstitialAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzz(p105o3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbou zzbouVar, zzbey zzbeyVar, List list) throws RemoteException {
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
                mediationNativeAdapter.requestNativeAd((Context) p105o3.b.t0(aVar), this.zzb, zzW(str, zzmVar, str2), zzbpuVar, bundle2);
                return;
            } catch (Throwable th) {
                J2.j.e("", th);
                zzbol.zza(aVar, th, "adapter.requestNativeAd");
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
                zzbol.zza(aVar, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    L2.a aVar2 = (L2.a) this.zza;
                    zzbpl zzbplVar = new zzbpl(this, zzbouVar);
                    zzW(str, zzmVar, str2);
                    zzV(zzmVar);
                    zzX(zzmVar);
                    Location location2 = zzmVar.f10740B;
                    zzY(str, zzmVar);
                    aVar2.loadNativeAd(new n(), zzbplVar);
                } catch (Throwable th3) {
                    J2.j.e("", th3);
                    zzbol.zza(aVar, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    public zzbpp(e eVar) {
        this.zza = eVar;
    }
}
