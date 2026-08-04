package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import F2.I0;
import J2.d;
import J2.j;
import L2.f;
import L2.g;
import L2.h;
import L2.k;
import L2.l;
import L2.n;
import L2.p;
import L2.q;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p036e6.c;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes.dex */
public final class zzbra extends zzbqm {
    private final RtbAdapter zza;
    private k zzb;
    private p zzc;
    private f zzd;
    private String zze = "";

    public zzbra(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.f10742D;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzw(String str) throws RemoteException {
        j.g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e7) {
            j.e("", e7);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.f10761f) {
            return true;
        }
        d dVar = C0252s.f2717f.f2718a;
        return d.n();
    }

    private static final String zzy(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        String str2 = zzmVar.f10750L;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final I0 zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final zzbrc zzf() {
        return zzbrc.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final zzbrc zzg() {
        return zzbrc.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzh(p105o3.a aVar, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbqq zzbqqVar) throws RemoteException {
        try {
            zzbqy zzbqyVar = new zzbqy(this, zzbqqVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str) {
                case "banner":
                case "interstitial":
                case "rewarded":
                case "rewarded_interstitial":
                case "native":
                case "app_open":
                    new ArrayList().add(new c(6));
                    new p167y2.j(zzrVar.f10775e, zzrVar.f10772b, zzrVar.f10771a);
                    rtbAdapter.collectSignals(new N2.a(), zzbqyVar);
                    return;
                case "app_open_ad":
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlP)).booleanValue()) {
                        new ArrayList().add(new c(6));
                        new p167y2.j(zzrVar.f10775e, zzrVar.f10772b, zzrVar.f10771a);
                        rtbAdapter.collectSignals(new N2.a(), zzbqyVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            j.e("Error generating signals for RTB", th);
            zzbol.zza(aVar, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, p105o3.a aVar, zzbpy zzbpyVar, zzbou zzbouVar) throws RemoteException {
        try {
            zzbqx zzbqxVar = new zzbqx(this, zzbpyVar, zzbouVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(zzmVar);
            zzx(zzmVar);
            Location location = zzmVar.f10740B;
            zzy(str2, zzmVar);
            rtbAdapter.loadRtbAppOpenAd(new g(), zzbqxVar);
        } catch (Throwable th) {
            j.e("Adapter failed to render app open ad.", th);
            zzbol.zza(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, p105o3.a aVar, zzbqb zzbqbVar, zzbou zzbouVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        try {
            zzbqs zzbqsVar = new zzbqs(this, zzbqbVar, zzbouVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(zzmVar);
            zzx(zzmVar);
            Location location = zzmVar.f10740B;
            zzy(str2, zzmVar);
            new p167y2.j(zzrVar.f10775e, zzrVar.f10772b, zzrVar.f10771a);
            rtbAdapter.loadRtbBannerAd(new h(), zzbqsVar);
        } catch (Throwable th) {
            j.e("Adapter failed to render banner ad.", th);
            zzbol.zza(aVar, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, p105o3.a aVar, zzbqb zzbqbVar, zzbou zzbouVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        try {
            zzbqt zzbqtVar = new zzbqt(this, zzbqbVar, zzbouVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(zzmVar);
            zzx(zzmVar);
            Location location = zzmVar.f10740B;
            zzy(str2, zzmVar);
            new p167y2.j(zzrVar.f10775e, zzrVar.f10772b, zzrVar.f10771a);
            zzbqtVar.onFailure(new C1057a(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Throwable th) {
            j.e("Adapter failed to render interscroller ad.", th);
            zzbol.zza(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, p105o3.a aVar, zzbqe zzbqeVar, zzbou zzbouVar) throws RemoteException {
        try {
            zzbqu zzbquVar = new zzbqu(this, zzbqeVar, zzbouVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(zzmVar);
            zzx(zzmVar);
            Location location = zzmVar.f10740B;
            zzy(str2, zzmVar);
            rtbAdapter.loadRtbInterstitialAd(new l(), zzbquVar);
        } catch (Throwable th) {
            j.e("Adapter failed to render interstitial ad.", th);
            zzbol.zza(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, p105o3.a aVar, zzbqh zzbqhVar, zzbou zzbouVar) throws RemoteException {
        zzn(str, str2, zzmVar, aVar, zzbqhVar, zzbouVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, p105o3.a aVar, zzbqh zzbqhVar, zzbou zzbouVar, zzbey zzbeyVar) throws RemoteException {
        try {
            zzbqv zzbqvVar = new zzbqv(this, zzbqhVar, zzbouVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(zzmVar);
            zzx(zzmVar);
            Location location = zzmVar.f10740B;
            zzy(str2, zzmVar);
            rtbAdapter.loadRtbNativeAdMapper(new n(), zzbqvVar);
        } catch (Throwable th) {
            j.e("Adapter failed to render native ad.", th);
            zzbol.zza(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                zzbqw zzbqwVar = new zzbqw(this, zzbqhVar, zzbouVar);
                RtbAdapter rtbAdapter2 = this.zza;
                zzw(str2);
                zzv(zzmVar);
                zzx(zzmVar);
                Location location2 = zzmVar.f10740B;
                zzy(str2, zzmVar);
                rtbAdapter2.loadRtbNativeAd(new n(), zzbqwVar);
            } catch (Throwable th2) {
                j.e("Adapter failed to render native ad.", th2);
                zzbol.zza(aVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, p105o3.a aVar, zzbqk zzbqkVar, zzbou zzbouVar) throws RemoteException {
        try {
            zzbqz zzbqzVar = new zzbqz(this, zzbqkVar, zzbouVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(zzmVar);
            zzx(zzmVar);
            Location location = zzmVar.f10740B;
            zzy(str2, zzmVar);
            rtbAdapter.loadRtbRewardedInterstitialAd(new q(), zzbqzVar);
        } catch (Throwable th) {
            j.e("Adapter failed to render rewarded interstitial ad.", th);
            zzbol.zza(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, p105o3.a aVar, zzbqk zzbqkVar, zzbou zzbouVar) throws RemoteException {
        try {
            zzbqz zzbqzVar = new zzbqz(this, zzbqkVar, zzbouVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(zzmVar);
            zzx(zzmVar);
            Location location = zzmVar.f10740B;
            zzy(str2, zzmVar);
            rtbAdapter.loadRtbRewardedAd(new q(), zzbqzVar);
        } catch (Throwable th) {
            j.e("Adapter failed to render rewarded ad.", th);
            zzbol.zza(aVar, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzq(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final boolean zzr(p105o3.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final boolean zzs(p105o3.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final boolean zzt(p105o3.a aVar) {
        return false;
    }
}
