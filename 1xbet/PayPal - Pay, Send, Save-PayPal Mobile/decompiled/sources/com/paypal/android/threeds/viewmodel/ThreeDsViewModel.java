package com.paypal.android.threeds.viewmodel;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020 0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00188G¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001bR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00188G¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020(0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00188G¢\u0006\u0006\u001a\u0004\b)\u0010\u001eR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001bR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\u00188G¢\u0006\u0006\u001a\u0004\b-\u0010\u001e"}, d2 = {"Lcom/paypal/android/threeds/viewmodel/ThreeDsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/android/threeds/repository/ApiRepository;", "apiRepository", "<init>", "(Lcom/paypal/android/threeds/repository/ApiRepository;)V", "Lcom/paypal/android/threeds/data/model/SdkDdcRequest;", "sdkDdcRequest", "", "sdkDDC", "(Lcom/paypal/android/threeds/data/model/SdkDdcRequest;)V", "Lcom/paypal/android/threeds/data/model/AuthenticationRequest;", "aReq", "authenticateRequest", "(Lcom/paypal/android/threeds/data/model/AuthenticationRequest;)V", "", "url", "Lcom/paypal/android/threeds/data/model/TenantData;", "tenantData", "initChallengeSdk", "(Ljava/lang/String;Lcom/paypal/android/threeds/data/model/TenantData;)V", "Lcom/paypal/android/threeds/repository/ApiRepository;", "getApiRepository", "()Lcom/paypal/android/threeds/repository/ApiRepository;", "Landroidx/lifecycle/MutableLiveData;", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/MutableLiveData;", "getHighSpeedVideoFpsRangesFor", "getLoadingProgress", "()Landroidx/lifecycle/MutableLiveData;", "loadingProgress", "Lcom/paypal/android/threeds/data/model/SdkDdcResponse;", "Camera2StreamConfigurationMap", "getSdkDDCResponse", "sdkDDCResponse", "Lcom/paypal/android/threeds/data/model/NetworkErrorResponse;", "getHighSpeedVideoSizes", "getNetworkErrorResponse", "networkErrorResponse", "Lcom/paypal/android/threeds/data/model/AuthenticationResponse;", "getAuthenticationResponse", "authenticationResponse", "Lcom/paypal/android/threeds/data/model/InitChallengeSdkResponse;", "getHighSpeedVideoFpsRanges", "getInitChallengeSdkResponse", "initChallengeSdkResponse", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreeDsViewModel extends androidx.view.ViewModel {
    private static final androidx.lifecycle.ViewModelProvider.Factory ThreeDsViewModelFactory;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.MutableLiveData<com.paypal.android.threeds.data.model.SdkDdcResponse> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.android.threeds.repository.ApiRepository apiRepository;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.MutableLiveData<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private final androidx.view.MutableLiveData<com.paypal.android.threeds.data.model.InitChallengeSdkResponse> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.MutableLiveData<com.paypal.android.threeds.data.model.AuthenticationResponse> Camera2StreamConfigurationMap;
    private final androidx.view.MutableLiveData<com.paypal.android.threeds.data.model.NetworkErrorResponse> getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.android.threeds.viewmodel.ThreeDsViewModel.Companion INSTANCE = new com.paypal.android.threeds.viewmodel.ThreeDsViewModel.Companion(null);
    public static final int $stable = 8;

    public ThreeDsViewModel(com.paypal.android.threeds.repository.ApiRepository apiRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiRepository, "");
        this.apiRepository = apiRepository;
        this.getHighSpeedVideoFpsRangesFor = new androidx.view.MutableLiveData<>();
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.view.MutableLiveData<>();
        this.getHighSpeedVideoSizes = new androidx.view.MutableLiveData<>();
        this.Camera2StreamConfigurationMap = new androidx.view.MutableLiveData<>();
        this.getHighSpeedVideoFpsRanges = new androidx.view.MutableLiveData<>();
    }

    public final com.paypal.android.threeds.repository.ApiRepository getApiRepository() {
        return this.apiRepository;
    }

    public final androidx.view.MutableLiveData<java.lang.Boolean> getLoadingProgress() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final androidx.view.MutableLiveData<com.paypal.android.threeds.data.model.SdkDdcResponse> getSdkDDCResponse() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.view.MutableLiveData<com.paypal.android.threeds.data.model.NetworkErrorResponse> getNetworkErrorResponse() {
        return this.getHighSpeedVideoSizes;
    }

    public final androidx.view.MutableLiveData<com.paypal.android.threeds.data.model.AuthenticationResponse> getAuthenticationResponse() {
        return this.Camera2StreamConfigurationMap;
    }

    public final androidx.view.MutableLiveData<com.paypal.android.threeds.data.model.InitChallengeSdkResponse> getInitChallengeSdkResponse() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/threeds/viewmodel/ThreeDsViewModel$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "ThreeDsViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getThreeDsViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.lifecycle.ViewModelProvider.Factory getThreeDsViewModelFactory() {
            return com.paypal.android.threeds.viewmodel.ThreeDsViewModel.ThreeDsViewModelFactory;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void sdkDDC(com.paypal.android.threeds.data.model.SdkDdcRequest sdkDdcRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkDdcRequest, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.android.threeds.viewmodel.ThreeDsViewModel$sdkDDC$1(this, sdkDdcRequest, null), 3, null);
    }

    public final void authenticateRequest(com.paypal.android.threeds.data.model.AuthenticationRequest aReq) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aReq, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.android.threeds.viewmodel.ThreeDsViewModel$authenticateRequest$1(this, aReq, null), 3, null);
    }

    public final void initChallengeSdk(java.lang.String url, com.paypal.android.threeds.data.model.TenantData tenantData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tenantData, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.android.threeds.viewmodel.ThreeDsViewModel$initChallengeSdk$1(this, url, new com.paypal.android.threeds.data.model.InitChallengeSdkRequest(tenantData), null), 3, null);
    }

    static {
        androidx.view.viewmodel.InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new androidx.view.viewmodel.InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.android.threeds.viewmodel.ThreeDsViewModel.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.viewmodel.ThreeDsViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.android.threeds.viewmodel.ThreeDsViewModel.$r8$lambda$VdGvhpcUmEi8btWseOfVKWa9UNI((androidx.view.viewmodel.CreationExtras) obj);
            }
        });
        ThreeDsViewModelFactory = initializerViewModelFactoryBuilder.build();
    }

    public static /* synthetic */ com.paypal.android.threeds.viewmodel.ThreeDsViewModel $r8$lambda$VdGvhpcUmEi8btWseOfVKWa9UNI(androidx.view.viewmodel.CreationExtras creationExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
        com.paypal.android.threeds.network.api.ThreeDsServerApi threeDsServerApi = com.paypal.android.threeds.network.RetrofitBuilder.INSTANCE.getThreeDsServerApi();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(threeDsServerApi, "");
        return new com.paypal.android.threeds.viewmodel.ThreeDsViewModel(new com.paypal.android.threeds.repository.ApiRepository(threeDsServerApi));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void access$postNetworkError(com.paypal.android.threeds.viewmodel.ThreeDsViewModel threeDsViewModel, com.paypal.android.threeds.network.NetworkResponse.Error error) {
        java.lang.String str;
        java.lang.String string;
        try {
            okhttp3.ResponseBody errorBody = error.getErrorResponse().errorBody();
            org.json.JSONObject jSONObject = (errorBody == null || (string = errorBody.string()) == null) ? null : new org.json.JSONObject(string);
            if (jSONObject != null) {
                str = jSONObject.getString("message");
            }
        } catch (java.lang.Exception unused) {
        }
        str = com.paypal.android.threeds.utils.NetworkUtil.SOMETHING_WENT_WRONG;
        threeDsViewModel.getHighSpeedVideoSizes.postValue(new com.paypal.android.threeds.data.model.NetworkErrorResponse(error.getErrorResponse().code(), str));
    }
}
