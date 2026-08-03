package com.google.ads.mediation.fyber;

/* compiled from: DTExchangeErrorCodes.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/google/ads/mediation/fyber/DTExchangeErrorCodes;", "", "<init>", "()V", "ERROR_DOMAIN", "", "ERROR_INVALID_SERVER_PARAMETERS", "", "ERROR_BANNER_SIZE_MISMATCH", "ERROR_WRONG_CONTROLLER_TYPE", "ERROR_AD_NOT_READY", "ERROR_CONTEXT_NOT_ACTIVITY_INSTANCE", "getAdError", "Lcom/google/android/gms/ads/AdError;", "initStatus", "Lcom/fyber/inneractive/sdk/external/OnFyberMarketplaceInitializedListener$FyberInitStatus;", "inneractiveErrorCode", "Lcom/fyber/inneractive/sdk/external/InneractiveErrorCode;", "dtexchange_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DTExchangeErrorCodes {
    public static final int ERROR_AD_NOT_READY = 106;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 103;
    public static final int ERROR_CONTEXT_NOT_ACTIVITY_INSTANCE = 107;
    public static final java.lang.String ERROR_DOMAIN = "com.google.ads.mediation.dtexchange";
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_WRONG_CONTROLLER_TYPE = 105;
    public static final com.google.ads.mediation.fyber.DTExchangeErrorCodes INSTANCE = new com.google.ads.mediation.fyber.DTExchangeErrorCodes();

    /* compiled from: DTExchangeErrorCodes.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.values().length];
            try {
                iArr[com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.fyber.inneractive.sdk.external.InneractiveErrorCode.values().length];
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.CONNECTION_TIMEOUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.NO_FILL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INTERNAL_ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSPECIFIED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.LOAD_TIMEOUT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.SPOT_DISABLED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSUPPORTED_SPOT.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.IN_FLIGHT_TIMEOUT.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.NATIVE_ADS_NOT_SUPPORTED_FOR_OS.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr2[com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private DTExchangeErrorCodes() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.gms.ads.AdError getAdError(com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus initStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        int i = com.google.ads.mediation.fyber.DTExchangeErrorCodes.WhenMappings.$EnumSwitchMapping$0[initStatus.ordinal()];
        return new com.google.android.gms.ads.AdError(i != 1 ? i != 2 ? i != 3 ? i != 4 ? 299 : 203 : 202 : 201 : 200, "DT Exchange failed to initialize with reason: " + initStatus, ERROR_DOMAIN);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.gms.ads.AdError getAdError(com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inneractiveErrorCode, "inneractiveErrorCode");
        int i = 399;
        switch (com.google.ads.mediation.fyber.DTExchangeErrorCodes.WhenMappings.$EnumSwitchMapping$1[inneractiveErrorCode.ordinal()]) {
            case 1:
                i = androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis;
                break;
            case 2:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
                break;
            case 3:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
                break;
            case 4:
                i = 303;
                break;
            case 5:
                i = 304;
                break;
            case 6:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE;
                break;
            case 7:
                i = 306;
                break;
            case 8:
                i = 307;
                break;
            case 9:
                i = 308;
                break;
            case 10:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE;
                break;
            case 11:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                break;
            case 12:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE;
                break;
            case 13:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE;
                break;
            case 14:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE;
                break;
            case 15:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE;
                break;
            case 16:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE;
                break;
            case 17:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE;
                break;
            case 18:
                i = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE;
                break;
        }
        return new com.google.android.gms.ads.AdError(i, "DT Exchange failed to request ad with reason: " + inneractiveErrorCode, ERROR_DOMAIN);
    }
}
