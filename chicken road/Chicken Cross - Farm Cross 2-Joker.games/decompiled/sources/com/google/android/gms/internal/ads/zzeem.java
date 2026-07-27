package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.mediationsdk.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeem extends com.google.android.gms.ads.internal.client.zzds {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzeea zzd;
    private final zzhdi zze;
    private zzedp zzf;

    zzeem(Context context, WeakReference weakReference, zzeea zzeeaVar, zzeeo zzeeoVar, zzhdi zzhdiVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzeeaVar;
        this.zze = zzhdiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzf(String str) {
        try {
            zzhcy.zzr(this.zzf.zzn(str), new zzeeh(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzj(String str) {
        try {
            zzhcy.zzr(this.zzf.zzn(str), new zzeei(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzk() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdx zzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zza(zzedp zzedpVar) {
        this.zzf = zzedpVar;
    }

    public final synchronized void zzb(zzeen zzeenVar) {
        char c;
        String zzb = zzeenVar.zzb();
        switch (zzb.hashCode()) {
            case -1999289321:
                if (zzb.equals("NATIVE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (zzb.equals("INTERSTITIAL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -428325382:
                if (zzb.equals("APP_OPEN_AD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (zzb.equals("REWARDED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1854800829:
                if (zzb.equals("REWARDED_INTERSTITIAL")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (zzb.equals(j.f8411a)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            String zza = zzeenVar.zza();
            AppOpenAd.load(zzk(), zza, zzeenVar.zzc(), new zzeeb(this, zza));
            return;
        }
        if (c == 1) {
            String zza2 = zzeenVar.zza();
            zzbix zzbixVar = zzbjg.zzkV;
            BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue() && zzeenVar.zzg()) ? new AdManagerAdView(zzk()) : new AdView(zzk());
            adManagerAdView.setAdSize(zzeenVar.zzd());
            adManagerAdView.setAdUnitId(zza2);
            adManagerAdView.setAdListener(new zzeec(this, zza2, adManagerAdView));
            VideoOptions zzf = zzeenVar.zzf();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue() && zzeenVar.zzg() && zzf != null) {
                ((AdManagerAdView) adManagerAdView).setVideoOptions(zzf);
            }
            adManagerAdView.loadAd(zzeenVar.zzc());
            return;
        }
        if (c == 2) {
            String zza3 = zzeenVar.zza();
            InterstitialAd.load(zzk(), zza3, zzeenVar.zzc(), new zzeed(this, zza3));
            return;
        }
        if (c != 3) {
            if (c == 4) {
                String zza4 = zzeenVar.zza();
                RewardedAd.load(zzk(), zza4, zzeenVar.zzc(), new zzeee(this, zza4));
                return;
            } else {
                if (c != 5) {
                    return;
                }
                String zza5 = zzeenVar.zza();
                RewardedInterstitialAd.load(zzk(), zza5, zzeenVar.zzc(), new zzeef(this, zza5));
                return;
            }
        }
        final String zza6 = zzeenVar.zza();
        AdLoader.Builder builder = new AdLoader.Builder(zzk(), zza6);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzeek
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                zzeem.this.zzd(zza6, nativeAd);
            }
        });
        builder.withAdListener(new zzeeg(this));
        NativeAdOptions zze = zzeenVar.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkV)).booleanValue() && zze != null) {
            builder.withNativeAdOptions(zze);
        }
        builder.build().loadAd(zzeenVar.zzc());
    }

    public final synchronized void zzc(String str) {
        Map map;
        Object obj;
        Activity zzo = this.zzd.zzo();
        if (zzo != null && (obj = (map = this.zza).get(str)) != null) {
            zzbix zzbixVar = zzbjg.zzkU;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                map.remove(str);
            }
            zzj(zzl(obj));
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(zzo);
                return;
            }
            if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(zzo);
                return;
            }
            if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(zzo, zzeel.zza);
                return;
            }
            if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(zzo, zzeej.zza);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context zzk = zzk();
                intent.setClassName(zzk, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra("adUnit", str);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzY(zzk, intent);
            }
        }
    }

    protected final synchronized void zzd(String str, Object obj) {
        this.zza.put(str, obj);
        zzf(zzl(obj));
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            zzeeo.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzeeo.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    final /* synthetic */ zzeea zzh() {
        return this.zzd;
    }
}
