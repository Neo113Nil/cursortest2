package com.ingo.sdk.android.ux.feature.sdk_authorization;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/sdk_authorization/SdkAuthorizationViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationParameters;", "params", "", com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.AUTHORIZE, "(Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationParameters;)V", "Landroidx/lifecycle/MutableLiveData;", "", "sdkAuthorizeResponseData", "Landroidx/lifecycle/MutableLiveData;", "getSdkAuthorizeResponseData", "()Landroidx/lifecycle/MutableLiveData;", "Lcom/ingo/sdk/kotlin/common/features/customer/model/CustomerResponse;", "customerResponseData", "getCustomerResponseData", "Lcom/ingo/sdk/kotlin/common/features/configuration/model/ConfigurationResponse;", "configurationResponseData", "getConfigurationResponseData", "Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationUseCase;", "sdkAuthorizationUseCase", "Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationUseCase;", "getSdkAuthorizationUseCase", "()Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationUseCase;", "setSdkAuthorizationUseCase", "(Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationUseCase;)V", "Lcom/ingo/sdk/kotlin/common/features/configuration/GetConfigurationUseCase;", "configurationUseCase", "Lcom/ingo/sdk/kotlin/common/features/configuration/GetConfigurationUseCase;", "getConfigurationUseCase", "()Lcom/ingo/sdk/kotlin/common/features/configuration/GetConfigurationUseCase;", "setConfigurationUseCase", "(Lcom/ingo/sdk/kotlin/common/features/configuration/GetConfigurationUseCase;)V", "Lcom/ingo/sdk/kotlin/common/features/customer/GetCustomerUseCase;", "customerUseCase", "Lcom/ingo/sdk/kotlin/common/features/customer/GetCustomerUseCase;", "getCustomerUseCase", "()Lcom/ingo/sdk/kotlin/common/features/customer/GetCustomerUseCase;", "setCustomerUseCase", "(Lcom/ingo/sdk/kotlin/common/features/customer/GetCustomerUseCase;)V", "", "callsCompleted", com.visa.cbp.getEncExpo.warmup, "getCallsCompleted", "()I", "setCallsCompleted", "(I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SdkAuthorizationViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationViewModel {
    public static final int $stable = 8;
    private int callsCompleted;
    private final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse> configurationResponseData;
    private com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase configurationUseCase;
    private final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse> customerResponseData;
    private com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase customerUseCase;
    private com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationUseCase sdkAuthorizationUseCase;
    private final androidx.view.MutableLiveData<java.lang.Object> sdkAuthorizeResponseData;

    public /* synthetic */ SdkAuthorizationViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public SdkAuthorizationViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.sdkAuthorizeResponseData = new androidx.view.MutableLiveData<>();
        this.customerResponseData = new androidx.view.MutableLiveData<>();
        this.configurationResponseData = new androidx.view.MutableLiveData<>();
        this.sdkAuthorizationUseCase = new com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationUseCase();
        this.configurationUseCase = new com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase();
        this.customerUseCase = new com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase();
    }

    public final androidx.view.MutableLiveData<java.lang.Object> getSdkAuthorizeResponseData() {
        return this.sdkAuthorizeResponseData;
    }

    public final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse> getCustomerResponseData() {
        return this.customerResponseData;
    }

    public final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse> getConfigurationResponseData() {
        return this.configurationResponseData;
    }

    public final com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationUseCase getSdkAuthorizationUseCase() {
        return this.sdkAuthorizationUseCase;
    }

    public final void setSdkAuthorizationUseCase(com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationUseCase sdkAuthorizationUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkAuthorizationUseCase, "");
        this.sdkAuthorizationUseCase = sdkAuthorizationUseCase;
    }

    public final com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase getConfigurationUseCase() {
        return this.configurationUseCase;
    }

    public final void setConfigurationUseCase(com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase getConfigurationUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getConfigurationUseCase, "");
        this.configurationUseCase = getConfigurationUseCase;
    }

    public final com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase getCustomerUseCase() {
        return this.customerUseCase;
    }

    public final void setCustomerUseCase(com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase getCustomerUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCustomerUseCase, "");
        this.customerUseCase = getCustomerUseCase;
    }

    public final int getCallsCompleted() {
        return this.callsCompleted;
    }

    public final void setCallsCompleted(int i) {
        this.callsCompleted = i;
    }

    @Override // com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationViewModel
    public final void authorize(com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        this.callsCompleted = 0;
        com.ingo.sdk.kotlin.common.core.interactor.UseCase.cancel$default(this.sdkAuthorizationUseCase, null, 1, null);
        com.ingo.sdk.kotlin.common.core.interactor.UseCase.cancel$default(this.configurationUseCase, null, 1, null);
        com.ingo.sdk.kotlin.common.core.interactor.UseCase.cancel$default(this.customerUseCase, null, 1, null);
        this.sdkAuthorizationUseCase = new com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationUseCase();
        this.configurationUseCase = new com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase();
        this.customerUseCase = new com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase();
        kotlinx.coroutines.CoroutineScope coroutineScope = getCoroutineScope();
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.IngoDispatchers.class));
        if (obj != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, ((com.ingo.sdk.kotlin.common.core.IngoDispatchers) obj).getBackgroundDispatcher(), null, new com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$1(this, params, null), 2, null);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = getCoroutineScope();
            java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.IngoDispatchers.class));
            if (obj2 != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, ((com.ingo.sdk.kotlin.common.core.IngoDispatchers) obj2).getBackgroundDispatcher(), null, new com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$authorize$2(this, params, null), 2, null);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.core.IngoDispatchers");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.core.IngoDispatchers");
    }

    public static final /* synthetic */ void access$checkCompletion(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl, com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters sdkAuthorizationParameters) {
        if (sdkAuthorizationViewModelImpl.callsCompleted >= 2) {
            kotlinx.coroutines.CoroutineScope coroutineScope = sdkAuthorizationViewModelImpl.getCoroutineScope();
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.IngoDispatchers.class));
            if (obj != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, ((com.ingo.sdk.kotlin.common.core.IngoDispatchers) obj).getBackgroundDispatcher(), null, new com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl$postAuthorization$1(sdkAuthorizationViewModelImpl, sdkAuthorizationParameters, null), 2, null);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.core.IngoDispatchers");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdkAuthorizationViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
