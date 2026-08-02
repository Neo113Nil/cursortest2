package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\"\u001a\u00020\u00152\u0018\u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c\u0012\u0004\u0012\u00020\u00150 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010(J5\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020$2\u0018\u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c\u0012\u0004\u0012\u00020\u00150 H\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0011\u0010.\u001a\u00020-*\u00020\n¢\u0006\u0004\b.\u0010/R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00103R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0018048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00105R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010<R\u0014\u00108\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010@R\u001c\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180B8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/MerchantProviderDetailedConfig;", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "Lcom/zettle/sdk/core/Module;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/core/auth/AuthModule;", "auth", "Lcom/zettle/sdk/core/network/NetworkModule;", "networkModule", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "service", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "publicApi", "Lcom/zettle/sdk/commons/SecureStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "<init>", "(Lcom/zettle/sdk/core/auth/AuthModule;Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/core/auth/ServiceProvider;Lcom/zettle/sdk/meta/AppInfo;Landroidx/lifecycle/MutableLiveData;Lcom/zettle/sdk/commons/SecureStorage;)V", "Lcom/zettle/sdk/core/user/userconfig/DetailedUserConfig;", "p0", "", "Camera2StreamConfigurationMap", "(Lcom/zettle/sdk/core/user/userconfig/DetailedUserConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "getHighSpeedVideoFpsRanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Result;", "getUserConfig-d1pmJ48", "()Ljava/lang/Object;", "getUserConfig", "Lkotlin/Function1;", "onResult", "getUserConfigAsync", "(Lkotlin/jvm/functions/Function1;)V", "", "isLoggedIn", "()Z", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "stop", "force", "syncUserConfig", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/izettle/android/auth/dto/ClientInfo;", "toClientInfo", "(Lcom/zettle/sdk/meta/AppInfo;)Lcom/izettle/android/auth/dto/ClientInfo;", "Lcom/zettle/sdk/meta/AppInfo;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/core/auth/AuthModule;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "Lcom/zettle/sdk/commons/state/MutableState;", "Lcom/zettle/sdk/commons/state/MutableState;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/core/network/NetworkModule;", "getOutputMinFrameDuration", "Landroidx/lifecycle/MutableLiveData;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizesFor", "getOutputFormats", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "Lcom/zettle/sdk/commons/SecureStorage;", "getInputFormats", "Lcom/zettle/sdk/commons/state/State;", "getUserConfigState", "()Lcom/zettle/sdk/commons/state/State;", "userConfigState"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MerchantProviderDetailedConfig implements com.zettle.sdk.core.auth.merchant.MerchantConfig, com.zettle.sdk.core.Module, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.zettle.sdk.core.user.userconfig.UserConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.core.user.userconfig.UserConfig> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.core.network.NetworkModule Camera2StreamConfigurationMap;
    private final com.zettle.sdk.core.auth.AuthModule getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.SecureStorage getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.ServiceProvider getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> getInputSizeshNQ4ISI;

    public MerchantProviderDetailedConfig(com.zettle.sdk.core.auth.AuthModule authModule, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.zettle.sdk.meta.AppInfo appInfo, androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> mutableLiveData, com.zettle.sdk.commons.SecureStorage secureStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureStorage, "");
        this.getHighSpeedVideoSizes = authModule;
        this.Camera2StreamConfigurationMap = networkModule;
        this.getOutputMinFrameDuration = serviceProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = appInfo;
        this.getInputSizeshNQ4ISI = mutableLiveData;
        this.getInputFormats = secureStorage;
        this.getHighSpeedVideoSizesFor = com.zettle.sdk.core.ZettleScope.scope$default(com.zettle.sdk.core.ZettleScope.INSTANCE, "MerchantConfig", null, null, 6, null);
        this.getHighSpeedVideoFpsRangesFor = com.zettle.sdk.commons.state.MutableState.Companion.create$default(com.zettle.sdk.commons.state.MutableState.INSTANCE, null, null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        if (r1 != r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$refreshConfig(com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig, okhttp3.Request request, okhttp3.OkHttpClient okHttpClient, kotlin.coroutines.Continuation continuation) {
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$1 merchantProviderDetailedConfig$refreshConfig$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        int code;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig2;
        java.lang.Object obj2;
        com.zettle.sdk.core.user.userconfig.DetailedUserConfig copy;
        com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig;
        com.zettle.sdk.core.user.userconfig.DetailedUserConfig copy2;
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig3 = merchantProviderDetailedConfig;
        if (continuation instanceof com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$1) {
            merchantProviderDetailedConfig$refreshConfig$1 = (com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$1) continuation;
            if ((merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoFpsRanges -= 2147483648;
                obj = merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoFpsRangesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher io2 = kotlinx.coroutines.Dispatchers.getIO();
                    com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$2 merchantProviderDetailedConfig$refreshConfig$2 = new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$2(okHttpClient, request, merchantProviderDetailedConfig3, null);
                    merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoSizes = merchantProviderDetailedConfig3;
                    merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoFpsRanges = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(io2, merchantProviderDetailedConfig$refreshConfig$2, merchantProviderDetailedConfig$refreshConfig$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                obj2 = merchantProviderDetailedConfig$refreshConfig$1.getHighResolutionOutputSizeshNQ4ISI;
                                merchantProviderDetailedConfig2 = (com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig) merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj);
                                detailedUserConfig = (com.zettle.sdk.core.user.userconfig.DetailedUserConfig) obj;
                                if (detailedUserConfig != null) {
                                    return obj2;
                                }
                                copy2 = detailedUserConfig.copy((r42 & 1) != 0 ? detailedUserConfig.getPublicName() : null, (r42 & 2) != 0 ? detailedUserConfig.getCurrency() : null, (r42 & 4) != 0 ? detailedUserConfig.getEmailAddress() : null, (r42 & 8) != 0 ? detailedUserConfig.getImageUrlTemplate() : null, (r42 & 16) != 0 ? detailedUserConfig.getTerminalLocaleString() : null, (r42 & 32) != 0 ? detailedUserConfig.getCountryId() : null, (r42 & 64) != 0 ? detailedUserConfig.getBetaFeatures() : null, (r42 & 128) != 0 ? detailedUserConfig.getFeatures() : null, (r42 & 256) != 0 ? detailedUserConfig.getOrganizationSettings() : null, (r42 & 512) != 0 ? detailedUserConfig.getUserUUID() : null, (r42 & 1024) != 0 ? detailedUserConfig.getOrganizationUUID() : null, (r42 & 2048) != 0 ? detailedUserConfig.getManualAppEvents() : null, (r42 & 4096) != 0 ? detailedUserConfig.getSupportedReaders() : null, (r42 & 8192) != 0 ? detailedUserConfig.getConfigByCurrency() : null, (r42 & 16384) != 0 ? detailedUserConfig.getGratuityAmountMaxPercentage() : null, (r42 & 32768) != 0 ? detailedUserConfig.getIsShowAdvance() : false, (r42 & 65536) != 0 ? detailedUserConfig.getIsGetStartedList() : false, (r42 & 131072) != 0 ? detailedUserConfig.getUserInfoHash() : null, (r42 & 262144) != 0 ? detailedUserConfig.getTransactionConfigHash() : null, (r42 & 524288) != 0 ? detailedUserConfig.getTokenProviderStatus() : com.zettle.sdk.core.auth.TokenProviderStatus.INVALID_TOKEN);
                                merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoSizes = obj2;
                                merchantProviderDetailedConfig$refreshConfig$1.getHighResolutionOutputSizeshNQ4ISI = null;
                                merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoFpsRanges = 4;
                                return merchantProviderDetailedConfig2.Camera2StreamConfigurationMap(copy2, merchantProviderDetailedConfig$refreshConfig$1) == coroutine_suspended ? coroutine_suspended : obj2;
                            }
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        java.lang.Object obj3 = merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj3;
                    }
                    merchantProviderDetailedConfig3 = (com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig) merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.zettle.sdk.core.network.HttpPayload httpPayload = (com.zettle.sdk.core.network.HttpPayload) obj;
                code = httpPayload.getCode();
                if (200 > code && code < 300) {
                    com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig2 = (com.zettle.sdk.core.user.userconfig.DetailedUserConfig) httpPayload.getBody();
                    if (detailedUserConfig2 != null) {
                        copy = detailedUserConfig2.copy((r42 & 1) != 0 ? detailedUserConfig2.getPublicName() : null, (r42 & 2) != 0 ? detailedUserConfig2.getCurrency() : null, (r42 & 4) != 0 ? detailedUserConfig2.getEmailAddress() : null, (r42 & 8) != 0 ? detailedUserConfig2.getImageUrlTemplate() : null, (r42 & 16) != 0 ? detailedUserConfig2.getTerminalLocaleString() : null, (r42 & 32) != 0 ? detailedUserConfig2.getCountryId() : null, (r42 & 64) != 0 ? detailedUserConfig2.getBetaFeatures() : null, (r42 & 128) != 0 ? detailedUserConfig2.getFeatures() : null, (r42 & 256) != 0 ? detailedUserConfig2.getOrganizationSettings() : null, (r42 & 512) != 0 ? detailedUserConfig2.getUserUUID() : null, (r42 & 1024) != 0 ? detailedUserConfig2.getOrganizationUUID() : null, (r42 & 2048) != 0 ? detailedUserConfig2.getManualAppEvents() : null, (r42 & 4096) != 0 ? detailedUserConfig2.getSupportedReaders() : null, (r42 & 8192) != 0 ? detailedUserConfig2.getConfigByCurrency() : null, (r42 & 16384) != 0 ? detailedUserConfig2.getGratuityAmountMaxPercentage() : null, (r42 & 32768) != 0 ? detailedUserConfig2.getIsShowAdvance() : false, (r42 & 65536) != 0 ? detailedUserConfig2.getIsGetStartedList() : false, (r42 & 131072) != 0 ? detailedUserConfig2.getUserInfoHash() : null, (r42 & 262144) != 0 ? detailedUserConfig2.getTransactionConfigHash() : null, (r42 & 524288) != 0 ? detailedUserConfig2.getTokenProviderStatus() : com.zettle.sdk.core.auth.TokenProviderStatus.VALID_TOKEN);
                        merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoSizes = obj;
                        merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoFpsRanges = 2;
                        if (merchantProviderDetailedConfig3.Camera2StreamConfigurationMap(copy, merchantProviderDetailedConfig$refreshConfig$1) != coroutine_suspended) {
                        }
                    }
                    return obj;
                }
                merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoSizes = merchantProviderDetailedConfig3;
                merchantProviderDetailedConfig$refreshConfig$1.getHighResolutionOutputSizeshNQ4ISI = obj;
                merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoFpsRanges = 3;
                highResolutionOutputSizeshNQ4ISI = merchantProviderDetailedConfig3.getHighResolutionOutputSizeshNQ4ISI(merchantProviderDetailedConfig$refreshConfig$1);
                if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                    merchantProviderDetailedConfig2 = merchantProviderDetailedConfig3;
                    obj2 = obj;
                    obj = highResolutionOutputSizeshNQ4ISI;
                    detailedUserConfig = (com.zettle.sdk.core.user.userconfig.DetailedUserConfig) obj;
                    if (detailedUserConfig != null) {
                    }
                }
            }
        }
        merchantProviderDetailedConfig$refreshConfig$1 = new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$1(merchantProviderDetailedConfig3, continuation);
        obj = merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoFpsRangesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.zettle.sdk.core.network.HttpPayload httpPayload2 = (com.zettle.sdk.core.network.HttpPayload) obj;
        code = httpPayload2.getCode();
        if (200 > code) {
        }
        merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoSizes = merchantProviderDetailedConfig3;
        merchantProviderDetailedConfig$refreshConfig$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        merchantProviderDetailedConfig$refreshConfig$1.getHighSpeedVideoFpsRanges = 3;
        highResolutionOutputSizeshNQ4ISI = merchantProviderDetailedConfig3.getHighResolutionOutputSizeshNQ4ISI(merchantProviderDetailedConfig$refreshConfig$1);
        if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$syncUserConfig(com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig, kotlin.coroutines.Continuation continuation) {
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$syncUserConfig$1 merchantProviderDetailedConfig$syncUserConfig$1;
        int i;
        if (continuation instanceof com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$syncUserConfig$1) {
            merchantProviderDetailedConfig$syncUserConfig$1 = (com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$syncUserConfig$1) continuation;
            if ((merchantProviderDetailedConfig$syncUserConfig$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                merchantProviderDetailedConfig$syncUserConfig$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = merchantProviderDetailedConfig$syncUserConfig$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = merchantProviderDetailedConfig$syncUserConfig$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    merchantProviderDetailedConfig$syncUserConfig$1.getHighSpeedVideoFpsRangesFor = merchantProviderDetailedConfig;
                    merchantProviderDetailedConfig$syncUserConfig$1.getHighSpeedVideoSizes = 1;
                    obj = merchantProviderDetailedConfig.getHighSpeedVideoFpsRanges(merchantProviderDetailedConfig$syncUserConfig$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    merchantProviderDetailedConfig = (com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig) merchantProviderDetailedConfig$syncUserConfig$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                final com.zettle.sdk.core.user.userconfig.UserConfig userConfig = (com.zettle.sdk.core.user.userconfig.UserConfig) obj;
                com.zettle.sdk.core.log.LogKt.log(merchantProviderDetailedConfig, "## Updating with config -> ".concat(java.lang.String.valueOf(userConfig)));
                merchantProviderDetailedConfig.getHighSpeedVideoFpsRangesFor.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.core.user.userconfig.UserConfig, com.zettle.sdk.core.user.userconfig.UserConfig>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$syncUserConfig$2
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final com.zettle.sdk.core.user.userconfig.UserConfig invoke(com.zettle.sdk.core.user.userconfig.UserConfig userConfig2) {
                        return com.zettle.sdk.core.user.userconfig.UserConfig.this;
                    }

                    {
                        super(1);
                    }
                });
                merchantProviderDetailedConfig.getHighSpeedVideoFpsRanges = userConfig;
                return userConfig;
            }
        }
        merchantProviderDetailedConfig$syncUserConfig$1 = new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$syncUserConfig$1(merchantProviderDetailedConfig, continuation);
        java.lang.Object obj2 = merchantProviderDetailedConfig$syncUserConfig$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = merchantProviderDetailedConfig$syncUserConfig$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        final com.zettle.sdk.core.user.userconfig.UserConfig userConfig2 = (com.zettle.sdk.core.user.userconfig.UserConfig) obj2;
        com.zettle.sdk.core.log.LogKt.log(merchantProviderDetailedConfig, "## Updating with config -> ".concat(java.lang.String.valueOf(userConfig2)));
        merchantProviderDetailedConfig.getHighSpeedVideoFpsRangesFor.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.core.user.userconfig.UserConfig, com.zettle.sdk.core.user.userconfig.UserConfig>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$syncUserConfig$2
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.core.user.userconfig.UserConfig invoke(com.zettle.sdk.core.user.userconfig.UserConfig userConfig22) {
                return com.zettle.sdk.core.user.userconfig.UserConfig.this;
            }

            {
                super(1);
            }
        });
        merchantProviderDetailedConfig.getHighSpeedVideoFpsRanges = userConfig2;
        return userConfig2;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
    public final com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> getUserConfigState() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
    public final boolean isLoggedIn() {
        return this.getHighSpeedVideoSizes.isLoggedIn();
    }

    @Override // com.zettle.sdk.core.Module
    public final void start() {
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(this.getHighSpeedVideoSizes.getAuthFlow(), new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$start$1(this, null)), this.getHighSpeedVideoSizesFor);
    }

    @Override // com.zettle.sdk.core.Module
    public final void stop() {
        com.zettle.sdk.core.log.LogKt.debug(this, "## Stop");
        kotlinx.coroutines.JobKt__JobKt.cancelChildren$default(this.getHighSpeedVideoSizesFor.getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
    public final void getUserConfigAsync(kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResult, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizesFor, null, null, new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$getUserConfigAsync$1(this, onResult, null), 3, null);
    }

    @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
    /* renamed from: getUserConfig-d1pmJ48 */
    public final java.lang.Object mo23163getUserConfigd1pmJ48() {
        java.lang.Object runBlocking$default;
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$getUserConfig$1(this, null), 1, null);
        return ((kotlin.Result) runBlocking$default).getCamera2StreamConfigurationMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super com.zettle.sdk.core.user.userconfig.DetailedUserConfig> continuation) {
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$getCachedUserConfig$1 merchantProviderDetailedConfig$getCachedUserConfig$1;
        int i;
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig;
        java.lang.String str;
        if (continuation instanceof com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$getCachedUserConfig$1) {
            merchantProviderDetailedConfig$getCachedUserConfig$1 = (com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$getCachedUserConfig$1) continuation;
            if ((merchantProviderDetailedConfig$getCachedUserConfig$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                merchantProviderDetailedConfig$getCachedUserConfig$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = merchantProviderDetailedConfig$getCachedUserConfig$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = merchantProviderDetailedConfig$getCachedUserConfig$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.commons.SecureStorage secureStorage = this.getInputFormats;
                    merchantProviderDetailedConfig$getCachedUserConfig$1.Camera2StreamConfigurationMap = this;
                    merchantProviderDetailedConfig$getCachedUserConfig$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = secureStorage.get(com.zettle.sdk.core.auth.merchant.MerchantConfigKt.USER_CONFIG_KEY, merchantProviderDetailedConfig$getCachedUserConfig$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    merchantProviderDetailedConfig = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    merchantProviderDetailedConfig = (com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig) merchantProviderDetailedConfig$getCachedUserConfig$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    return null;
                }
                try {
                    kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                    companion.getSerializersModule();
                    com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig = (com.zettle.sdk.core.user.userconfig.DetailedUserConfig) companion.decodeFromString(com.zettle.sdk.core.user.userconfig.DetailedUserConfig.INSTANCE.serializer(), str);
                    merchantProviderDetailedConfig.getHighSpeedVideoFpsRanges = detailedUserConfig;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("## Cached user config retrieved -> ");
                    sb.append(detailedUserConfig);
                    com.zettle.sdk.core.log.LogKt.log(merchantProviderDetailedConfig, sb.toString());
                    return detailedUserConfig;
                } catch (java.lang.Exception e) {
                    com.zettle.sdk.core.log.LogKt.warn(merchantProviderDetailedConfig, "Failed to deserialize cached user config", e);
                    return null;
                }
            }
        }
        merchantProviderDetailedConfig$getCachedUserConfig$1 = new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$getCachedUserConfig$1(this, continuation);
        java.lang.Object obj2 = merchantProviderDetailedConfig$getCachedUserConfig$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = merchantProviderDetailedConfig$getCachedUserConfig$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$cacheUserConfig$1 merchantProviderDetailedConfig$cacheUserConfig$1;
        int i;
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig;
        if (continuation instanceof com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$cacheUserConfig$1) {
            merchantProviderDetailedConfig$cacheUserConfig$1 = (com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$cacheUserConfig$1) continuation;
            if ((merchantProviderDetailedConfig$cacheUserConfig$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                merchantProviderDetailedConfig$cacheUserConfig$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = merchantProviderDetailedConfig$cacheUserConfig$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = merchantProviderDetailedConfig$cacheUserConfig$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        com.zettle.sdk.commons.SecureStorage secureStorage = this.getInputFormats;
                        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                        companion.getSerializersModule();
                        java.lang.String encodeToString = companion.encodeToString(com.zettle.sdk.core.user.userconfig.DetailedUserConfig.INSTANCE.serializer(), detailedUserConfig);
                        merchantProviderDetailedConfig$cacheUserConfig$1.getHighResolutionOutputSizeshNQ4ISI = this;
                        merchantProviderDetailedConfig$cacheUserConfig$1.Camera2StreamConfigurationMap = detailedUserConfig;
                        merchantProviderDetailedConfig$cacheUserConfig$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (secureStorage.save(com.zettle.sdk.core.auth.merchant.MerchantConfigKt.USER_CONFIG_KEY, encodeToString, merchantProviderDetailedConfig$cacheUserConfig$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        merchantProviderDetailedConfig = this;
                    } catch (java.lang.Exception e) {
                        e = e;
                        merchantProviderDetailedConfig = this;
                        com.zettle.sdk.core.log.LogKt.warn(merchantProviderDetailedConfig, "Failed to serialize user config", e);
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    detailedUserConfig = (com.zettle.sdk.core.user.userconfig.DetailedUserConfig) merchantProviderDetailedConfig$cacheUserConfig$1.Camera2StreamConfigurationMap;
                    merchantProviderDetailedConfig = (com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig) merchantProviderDetailedConfig$cacheUserConfig$1.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        com.zettle.sdk.core.log.LogKt.warn(merchantProviderDetailedConfig, "Failed to serialize user config", e);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("## User config cached -> ");
                sb.append(detailedUserConfig);
                com.zettle.sdk.core.log.LogKt.log(merchantProviderDetailedConfig, sb.toString());
                return kotlin.Unit.INSTANCE;
            }
        }
        merchantProviderDetailedConfig$cacheUserConfig$1 = new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$cacheUserConfig$1(this, continuation);
        java.lang.Object obj2 = merchantProviderDetailedConfig$cacheUserConfig$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = merchantProviderDetailedConfig$cacheUserConfig$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("## User config cached -> ");
        sb2.append(detailedUserConfig);
        com.zettle.sdk.core.log.LogKt.log(merchantProviderDetailedConfig, sb2.toString());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super com.zettle.sdk.core.user.userconfig.UserConfig> continuation) {
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig = this;
        com.zettle.sdk.core.log.LogKt.log(merchantProviderDetailedConfig, "Refreshing user config");
        java.lang.Object mo23162getServiceUrlsIoAF18A = this.getOutputMinFrameDuration.mo23162getServiceUrlsIoAF18A(com.zettle.sdk.commons.network.Service.ApiAuthenticated.getKey());
        if (kotlin.Result.m23442isSuccessimpl(mo23162getServiceUrlsIoAF18A)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            mo23162getServiceUrlsIoAF18A = okhttp3.HttpUrl.INSTANCE.get(((com.izettle.android.auth.model.ServiceUrls) mo23162getServiceUrlsIoAF18A).getCurrent().getUrl()).newBuilder().addPathSegments(kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"mobile", "configdata"}), androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, null, null, 0, null, null, 62, null)).build();
        }
        java.lang.Object m23436constructorimpl = kotlin.Result.m23436constructorimpl(mo23162getServiceUrlsIoAF18A);
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        okhttp3.HttpUrl httpUrl = (okhttp3.HttpUrl) m23436constructorimpl;
        if (httpUrl == null) {
            return null;
        }
        okhttp3.MediaType mediaType = okhttp3.MediaType.INSTANCE.get("application/json; charset=utf8");
        byte[] bytes = com.izettle.android.serialization.JsonSerializer.INSTANCE.serializeToString(toClientInfo(this.getHighResolutionOutputSizeshNQ4ISI)).getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        okhttp3.RequestBody create$default = okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, bytes, mediaType, 0, 0, 6, (java.lang.Object) null);
        com.zettle.sdk.core.log.LogKt.log(merchantProviderDetailedConfig, "Calling url: ".concat(java.lang.String.valueOf(httpUrl)));
        return kotlinx.coroutines.SupervisorKt.supervisorScope(new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$fetchRemoteUserConfig$2(this, new okhttp3.Request.Builder().url(httpUrl).post(create$default).build(), null), continuation);
    }

    @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
    public final java.lang.Object syncUserConfig(boolean z, kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        function1.invoke(kotlin.Result.m23435boximpl(mo23163getUserConfigd1pmJ48()));
        return kotlin.Unit.INSTANCE;
    }

    public final com.izettle.android.auth.dto.ClientInfo toClientInfo(com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        java.lang.String deviceName = appInfo.getDeviceName();
        java.lang.String str = deviceName == null ? "" : deviceName;
        java.lang.String deviceModel = appInfo.getDeviceModel();
        return new com.izettle.android.auth.dto.ClientInfo(str, deviceModel == null ? "" : deviceModel, "ANDROID", appInfo.getDeviceLocale(), "", appInfo.getVersionCode(), appInfo.getAppVersion(), "", appInfo.getDeviceId());
    }
}
