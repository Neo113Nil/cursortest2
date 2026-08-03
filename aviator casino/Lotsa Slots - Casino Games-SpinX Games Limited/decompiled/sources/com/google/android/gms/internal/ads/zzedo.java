package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzedo extends com.google.android.gms.ads.internal.client.zzds {
    final java.util.Map zza = new java.util.HashMap();
    private final android.content.Context zzb;
    private final java.lang.ref.WeakReference zzc;
    private final com.google.android.gms.internal.ads.zzedc zzd;
    private final com.google.android.gms.internal.ads.zzhcg zze;
    private com.google.android.gms.internal.ads.zzecr zzf;

    zzedo(android.content.Context context, java.lang.ref.WeakReference weakReference, com.google.android.gms.internal.ads.zzedc zzedcVar, com.google.android.gms.internal.ads.zzedq zzedqVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzedcVar;
        this.zze = zzhcgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(java.lang.String str) {
        try {
            com.google.android.gms.internal.ads.zzhbw.zzr(this.zzf.zzn(str), new com.google.android.gms.internal.ads.zzedj(this), this.zze);
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(java.lang.String str) {
        try {
            com.google.android.gms.internal.ads.zzhbw.zzr(this.zzf.zzn(str), new com.google.android.gms.internal.ads.zzedk(this), this.zze);
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final android.content.Context zzl() {
        android.content.Context context = (android.content.Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String zzm(java.lang.Object obj) {
        com.google.android.gms.ads.ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdx zzd;
        if (obj instanceof com.google.android.gms.ads.LoadAdError) {
            responseInfo = ((com.google.android.gms.ads.LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof com.google.android.gms.ads.appopen.AppOpenAd) {
            responseInfo = ((com.google.android.gms.ads.appopen.AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof com.google.android.gms.ads.interstitial.InterstitialAd) {
            responseInfo = ((com.google.android.gms.ads.interstitial.InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof com.google.android.gms.ads.rewarded.RewardedAd) {
            responseInfo = ((com.google.android.gms.ads.rewarded.RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) {
            responseInfo = ((com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof com.google.android.gms.ads.AdView) {
            responseInfo = ((com.google.android.gms.ads.AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof com.google.android.gms.ads.nativead.NativeAd)) {
                return "";
            }
            responseInfo = ((com.google.android.gms.ads.nativead.NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzd.zzj();
        } catch (android.os.RemoteException unused) {
            return "";
        }
    }

    public final void zzb(com.google.android.gms.internal.ads.zzecr zzecrVar) {
        this.zzf = zzecrVar;
    }

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzedp zzedpVar) {
        char c;
        java.lang.String zzb = zzedpVar.zzb();
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
                if (zzb.equals(com.ironsource.mediationsdk.j.f6439a)) {
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
            java.lang.String zza = zzedpVar.zza();
            com.google.android.gms.ads.appopen.AppOpenAd.load(zzl(), zza, zzedpVar.zzc(), new com.google.android.gms.internal.ads.zzedd(this, zza));
            return;
        }
        if (c == 1) {
            java.lang.String zza2 = zzedpVar.zza();
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzkO;
            com.google.android.gms.ads.BaseAdView adManagerAdView = (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() && zzedpVar.zzg()) ? new com.google.android.gms.ads.admanager.AdManagerAdView(zzl()) : new com.google.android.gms.ads.AdView(zzl());
            adManagerAdView.setAdSize(zzedpVar.zzd());
            adManagerAdView.setAdUnitId(zza2);
            adManagerAdView.setAdListener(new com.google.android.gms.internal.ads.zzede(this, zza2, adManagerAdView));
            com.google.android.gms.ads.VideoOptions zzf = zzedpVar.zzf();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() && zzedpVar.zzg() && zzf != null) {
                ((com.google.android.gms.ads.admanager.AdManagerAdView) adManagerAdView).setVideoOptions(zzf);
            }
            adManagerAdView.loadAd(zzedpVar.zzc());
            return;
        }
        if (c == 2) {
            java.lang.String zza3 = zzedpVar.zza();
            com.google.android.gms.ads.interstitial.InterstitialAd.load(zzl(), zza3, zzedpVar.zzc(), new com.google.android.gms.internal.ads.zzedf(this, zza3));
            return;
        }
        if (c != 3) {
            if (c == 4) {
                java.lang.String zza4 = zzedpVar.zza();
                com.google.android.gms.ads.rewarded.RewardedAd.load(zzl(), zza4, zzedpVar.zzc(), new com.google.android.gms.internal.ads.zzedg(this, zza4));
                return;
            } else {
                if (c != 5) {
                    return;
                }
                java.lang.String zza5 = zzedpVar.zza();
                com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd.load(zzl(), zza5, zzedpVar.zzc(), new com.google.android.gms.internal.ads.zzedh(this, zza5));
                return;
            }
        }
        final java.lang.String zza6 = zzedpVar.zza();
        com.google.android.gms.ads.AdLoader.Builder builder = new com.google.android.gms.ads.AdLoader.Builder(zzl(), zza6);
        builder.forNativeAd(new com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final /* synthetic */ void onNativeAdLoaded(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
                com.google.android.gms.internal.ads.zzedo.this.zzf(zza6, nativeAd);
            }
        });
        builder.withAdListener(new com.google.android.gms.internal.ads.zzedi(this));
        com.google.android.gms.ads.nativead.NativeAdOptions zze = zzedpVar.zze();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkO)).booleanValue() && zze != null) {
            builder.withNativeAdOptions(zze);
        }
        builder.build().loadAd(zzedpVar.zzc());
    }

    public final synchronized void zzd(java.lang.String str) {
        java.util.Map map;
        java.lang.Object obj;
        android.app.Activity zzo = this.zzd.zzo();
        if (zzo != null && (obj = (map = this.zza).get(str)) != null) {
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzkN;
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() || (obj instanceof com.google.android.gms.ads.appopen.AppOpenAd) || (obj instanceof com.google.android.gms.ads.interstitial.InterstitialAd) || (obj instanceof com.google.android.gms.ads.rewarded.RewardedAd) || (obj instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd)) {
                map.remove(str);
            }
            zzk(zzm(obj));
            if (obj instanceof com.google.android.gms.ads.appopen.AppOpenAd) {
                ((com.google.android.gms.ads.appopen.AppOpenAd) obj).show(zzo);
                return;
            }
            if (obj instanceof com.google.android.gms.ads.interstitial.InterstitialAd) {
                ((com.google.android.gms.ads.interstitial.InterstitialAd) obj).show(zzo);
                return;
            }
            if (obj instanceof com.google.android.gms.ads.rewarded.RewardedAd) {
                ((com.google.android.gms.ads.rewarded.RewardedAd) obj).show(zzo, com.google.android.gms.internal.ads.zzedn.zza);
                return;
            }
            if (obj instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) {
                ((com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) obj).show(zzo, com.google.android.gms.internal.ads.zzedl.zza);
                return;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() && ((obj instanceof com.google.android.gms.ads.AdView) || (obj instanceof com.google.android.gms.ads.nativead.NativeAd))) {
                android.content.Intent intent = new android.content.Intent();
                android.content.Context zzl = zzl();
                intent.setClassName(zzl, com.google.android.gms.ads.OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra("adUnit", str);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzY(zzl, intent);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2) {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        java.util.Map map = this.zza;
        java.lang.Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof com.google.android.gms.ads.AdView) {
            com.google.android.gms.internal.ads.zzedq.zza(context, viewGroup, (com.google.android.gms.ads.AdView) obj);
        } else if (obj instanceof com.google.android.gms.ads.nativead.NativeAd) {
            com.google.android.gms.internal.ads.zzedq.zzb(context, viewGroup, (com.google.android.gms.ads.nativead.NativeAd) obj);
        }
    }

    protected final synchronized void zzf(java.lang.String str, java.lang.Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzedc zzi() {
        return this.zzd;
    }
}
