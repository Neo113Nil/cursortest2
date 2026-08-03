package com.google.ads.mediation.unity;

/* loaded from: classes3.dex */
public class UnityAdsAdapterUtils {

    public enum AdEvent {
        LOADED,
        OPENED,
        CLICKED,
        CLOSED,
        LEFT_APPLICATION,
        IMPRESSION,
        VIDEO_START,
        REWARD,
        VIDEO_COMPLETE
    }

    private UnityAdsAdapterUtils() {
    }

    static com.google.android.gms.ads.AdError createSDKError(com.unity3d.ads.UnityAds.UnityAdsInitializationError unityAdsInitializationError, java.lang.String str) {
        return createAdError(getMediationErrorCode(unityAdsInitializationError), str);
    }

    static com.google.android.gms.ads.AdError createSDKError(com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str) {
        return createAdError(getMediationErrorCode(unityAdsLoadError), str);
    }

    static com.google.android.gms.ads.AdError createSDKError(com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str) {
        return createAdError(getMediationErrorCode(unityAdsShowError), str);
    }

    static com.google.android.gms.ads.AdError createAdError(int i, java.lang.String str) {
        return new com.google.android.gms.ads.AdError(i, str, "com.unity3d.ads");
    }

    static int getMediationErrorCode(com.unity3d.services.banners.BannerErrorInfo bannerErrorInfo) {
        int i = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AnonymousClass1.$SwitchMap$com$unity3d$services$banners$BannerErrorCode[bannerErrorInfo.errorCode.ordinal()];
        if (i == 1) {
            return 201;
        }
        if (i == 2) {
            return 202;
        }
        if (i != 3) {
            return i != 4 ? 200 : 204;
        }
        return 203;
    }

    static int getMediationErrorCode(com.unity3d.ads.UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        int i = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError[unityAdsInitializationError.ordinal()];
        if (i == 1) {
            return com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
        }
        if (i == 2) {
            return com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
        }
        if (i != 3) {
            return androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis;
        }
        return 303;
    }

    static int getMediationErrorCode(com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i = com.google.ads.mediation.unity.UnityAdsAdapterUtils.AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        if (i == 1) {
            return 401;
        }
        if (i == 2) {
            return 402;
        }
        if (i == 3) {
            return 403;
        }
        if (i == 4) {
            return com.ironsource.InterfaceC3141l1.a.b.d;
        }
        if (i != 5) {
            return 400;
        }
        return com.ironsource.InterfaceC3141l1.a.b.e;
    }

    /* renamed from: com.google.ads.mediation.unity.UnityAdsAdapterUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$banners$BannerErrorCode;

        static {
            int[] iArr = new int[com.unity3d.ads.UnityAds.UnityAdsShowError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError = iArr;
            try {
                iArr[com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[com.unity3d.ads.UnityAds.UnityAdsLoadError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = iArr2;
            try {
                iArr2[com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[com.unity3d.ads.UnityAds.UnityAdsInitializationError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError = iArr3;
            try {
                iArr3[com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError[com.unity3d.ads.UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError[com.unity3d.ads.UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            int[] iArr4 = new int[com.unity3d.services.banners.BannerErrorCode.values().length];
            $SwitchMap$com$unity3d$services$banners$BannerErrorCode = iArr4;
            try {
                iArr4[com.unity3d.services.banners.BannerErrorCode.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[com.unity3d.services.banners.BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[com.unity3d.services.banners.BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[com.unity3d.services.banners.BannerErrorCode.NO_FILL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
        }
    }

    static int getMediationErrorCode(com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (com.google.ads.mediation.unity.UnityAdsAdapterUtils.AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[unityAdsShowError.ordinal()]) {
            case 1:
                return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE;
            case 2:
                return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION;
            case 3:
                return 503;
            case 4:
                return 504;
            case 5:
                return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_KEY_NOT_SET;
            case 6:
                return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INVALID_KEY_VALUE;
            case 7:
                return 507;
            case 8:
                return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INIT_FAILED;
            default:
                return 500;
        }
    }

    public static com.unity3d.services.banners.UnityBannerSize getUnityBannerSize(android.content.Context context, com.google.android.gms.ads.AdSize adSize, boolean z, com.google.ads.mediation.unity.MediationUtilsWrapper mediationUtilsWrapper) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.google.android.gms.ads.AdSize.BANNER);
        arrayList.add(com.google.android.gms.ads.AdSize.LEADERBOARD);
        com.google.android.gms.ads.AdSize findClosestSize = mediationUtilsWrapper.findClosestSize(context, adSize, arrayList);
        if (findClosestSize != null) {
            return new com.unity3d.services.banners.UnityBannerSize(findClosestSize.getWidth(), findClosestSize.getHeight());
        }
        if (z) {
            return new com.unity3d.services.banners.UnityBannerSize(adSize.getWidth(), adSize.getHeight());
        }
        return null;
    }

    public static void setUnityAdsPrivacy(com.google.android.gms.ads.RequestConfiguration requestConfiguration, com.unity3d.ads.metadata.MetaData metaData) {
        if (shouldTreatAsAdult(requestConfiguration)) {
            metaData.set("user.nonbehavioral", (java.lang.Object) false);
        } else {
            metaData.set("user.nonbehavioral", (java.lang.Object) true);
        }
        metaData.commit();
    }

    public static boolean areValidIds(java.lang.String str, java.lang.String str2) {
        return (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) ? false : true;
    }

    static com.google.android.gms.ads.AdFormat getAdFormat(com.google.android.gms.ads.mediation.rtb.RtbSignalData rtbSignalData) {
        java.util.Iterator<com.google.android.gms.ads.mediation.MediationConfiguration> it = rtbSignalData.getConfigurations().iterator();
        if (it.hasNext()) {
            return it.next().getFormat();
        }
        return null;
    }

    private static boolean shouldTreatAsAdult(com.google.android.gms.ads.RequestConfiguration requestConfiguration) {
        int tagForChildDirectedTreatment = requestConfiguration.getTagForChildDirectedTreatment();
        int tagForUnderAgeOfConsent = requestConfiguration.getTagForUnderAgeOfConsent();
        return (tagForChildDirectedTreatment == 1 || tagForUnderAgeOfConsent == 1 || (tagForChildDirectedTreatment != 0 && tagForUnderAgeOfConsent != 0)) ? false : true;
    }
}
