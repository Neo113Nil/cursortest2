package com.paypal.oslo.feature.ads.data.user;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\t\u0010\bJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProviderImpl;", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProvider;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "", "getPayPalPayerId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserCountry", "Lcom/paypal/oslo/core/userstore/model/User;", "Camera2StreamConfigurationMap", "()Lcom/paypal/oslo/core/userstore/model/User;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserIdentificationProviderImpl implements com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UserIdentificationProviderImpl(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoSizes = userStore;
    }

    @Override // com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider
    public final java.lang.Object getPayPalPayerId(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.core.userstore.model.User Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap == null) {
            return null;
        }
        return Camera2StreamConfigurationMap.getId();
    }

    @Override // com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider
    public final java.lang.Object getUserCountry(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.core.userstore.model.User Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap == null) {
            return null;
        }
        java.lang.String accountCountryCode = Camera2StreamConfigurationMap.getAccountCountryCode();
        java.lang.String str = kotlin.text.StringsKt.isBlank(accountCountryCode) ? null : accountCountryCode;
        return str == null ? Camera2StreamConfigurationMap.getCountry() : str;
    }

    private final com.paypal.oslo.core.userstore.model.User Camera2StreamConfigurationMap() {
        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoSizes.getUserState().getValue();
        if (value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            return ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser();
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.ads.LoggerKt.log, "User profile not loaded. Current state: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName())), null, null, 6, null);
        return null;
    }
}
