package com.paypal.oslo.core.webview.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0015\u001a\u00020\f2\u0019\u0010\u0014\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\u0012¢\u0006\u0002\b\u0013\u0012\u0004\u0012\u00020\f0\u0011H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010)R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00190+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u00101R\u0018\u0010\u001a\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\"\u001a\u0002098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010:"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/viewmodel/SecureWebViewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/webview/domain/usecase/WebAuthSessionAuthorizationUseCase;", "webAuthSessionAuthorizationUseCase", "Lcom/paypal/oslo/core/webview/domain/usecase/ValidateURLUseCase;", "validateURLUseCase", "Lcom/paypal/oslo/core/webview/config/SecureWebViewAppConfig;", "secureWebViewAppConfig", "<init>", "(Lcom/paypal/oslo/core/webview/domain/usecase/WebAuthSessionAuthorizationUseCase;Lcom/paypal/oslo/core/webview/domain/usecase/ValidateURLUseCase;Lcom/paypal/oslo/core/webview/config/SecureWebViewAppConfig;)V", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent;", "contentSource", "", "initialize", "(Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent;)V", "clearSensitiveData", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "onResult", "reAuthenticate$webview_release", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent$Url;", "p0", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent$Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError;", "p1", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError;Ljava/lang/String;)Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/webview/domain/usecase/WebAuthSessionAuthorizationUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/webview/domain/usecase/ValidateURLUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/webview/config/SecureWebViewAppConfig;", "getSecureWebViewAppConfig$webview_release", "()Lcom/paypal/oslo/core/webview/config/SecureWebViewAppConfig;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent;", "getOutputFormats", "Lkotlinx/coroutines/sync/Mutex;", "getInputFormats", "Lkotlinx/coroutines/sync/Mutex;", "getInputSizeshNQ4ISI", "", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureWebViewViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final int MAX_REAUTH_ATTEMPTS = 3;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.oslo.core.webview.ui.config.SecureWebViewContent getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.core.webview.config.SecureWebViewAppConfig secureWebViewAppConfig;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState> state;
    private static final com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel.Companion Companion = new com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public SecureWebViewViewModel(com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase webAuthSessionAuthorizationUseCase, com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase validateURLUseCase, com.paypal.oslo.core.webview.config.SecureWebViewAppConfig secureWebViewAppConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webAuthSessionAuthorizationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateURLUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewAppConfig, "");
        this.getHighSpeedVideoFpsRanges = webAuthSessionAuthorizationUseCase;
        this.Camera2StreamConfigurationMap = validateURLUseCase;
        this.secureWebViewAppConfig = secureWebViewAppConfig;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Idle.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.getInputSizeshNQ4ISI = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* renamed from: getSecureWebViewAppConfig$webview_release, reason: from getter */
    public final com.paypal.oslo.core.webview.config.SecureWebViewAppConfig getSecureWebViewAppConfig() {
        return this.secureWebViewAppConfig;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState> getState() {
        return this.state;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/viewmodel/SecureWebViewViewModel$Companion;", "", "<init>", "()V", "", "MAX_REAUTH_ATTEMPTS", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initialize(com.paypal.oslo.core.webview.ui.config.SecureWebViewContent contentSource) {
        java.lang.String str;
        kotlinx.coroutines.Job job;
        java.lang.String str2;
        com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.ConfigFailed configFailed;
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentSource, "");
        boolean z = contentSource instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url;
        if (z) {
            str = "URL";
        } else {
            if (!(contentSource instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Html)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = "HTML";
        }
        kotlinx.coroutines.Job job2 = this.getHighSpeedVideoFpsRangesFor;
        int i = 2;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] initialize", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", contentSource.getSource()), kotlin.TuplesKt.to("content_type", str), kotlin.TuplesKt.to("cancelling_in_flight", java.lang.String.valueOf((job2 != null && job2.isActive()) || ((job = this.getHighSpeedVideoSizes) != null && job.isActive())))), null, 4, null);
        kotlinx.coroutines.Job job3 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable th = null;
        java.lang.Object[] objArr = 0;
        if (job3 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job3, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        kotlinx.coroutines.Job job4 = this.getHighSpeedVideoSizes;
        if (job4 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job4, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getHighSpeedVideoSizesFor = 0;
        this.getOutputFormats = contentSource;
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Loading.INSTANCE);
        if (kotlin.text.StringsKt.isBlank(contentSource.getSource())) {
            str2 = "Source identifier cannot be empty";
        } else if (z && kotlin.text.StringsKt.isBlank(((com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url) contentSource).getUrl())) {
            str2 = "URL cannot be empty";
        } else {
            str2 = ((contentSource instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Html) && kotlin.text.StringsKt.isBlank(((com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Html) contentSource).getData())) ? "HTML data cannot be empty" : null;
        }
        if (str2 != null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] configuration validation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", contentSource.getSource()), kotlin.TuplesKt.to("error_message", str2)), null, null, 12, null);
            configFailed = new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.ConfigFailed(new com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed(str2, th, i, objArr == true ? 1 : 0));
        } else {
            configFailed = null;
        }
        if (configFailed == null) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$initialize$1(this, contentSource, null), 3, null);
            this.getHighSpeedVideoFpsRangesFor = launch$default;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.setValue(configFailed);
        }
    }

    public final void clearSensitiveData() {
        java.lang.String str;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
        com.paypal.oslo.core.webview.ui.config.SecureWebViewContent secureWebViewContent = this.getOutputFormats;
        if (secureWebViewContent == null || (str = secureWebViewContent.getSource()) == null) {
            str = "unknown";
        }
        com.paypal.android.logger.Logger.d$default(logger, "[Webview] clearing sensitive data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str)), null, 4, null);
        kotlinx.coroutines.Job job = this.getHighSpeedVideoFpsRangesFor;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        kotlinx.coroutines.Job job2 = this.getHighSpeedVideoSizes;
        if (job2 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoSizesFor = 0;
        this.getOutputFormats = null;
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Idle.INSTANCE);
    }

    public final void reAuthenticate$webview_release(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onResult) {
        java.lang.String str;
        kotlinx.coroutines.Job launch$default;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResult, "");
        com.paypal.oslo.core.webview.ui.config.SecureWebViewContent secureWebViewContent = this.getOutputFormats;
        if (secureWebViewContent == null || (str = secureWebViewContent.getSource()) == null) {
            str = "unknown";
        }
        java.lang.String str3 = str;
        com.paypal.oslo.core.webview.ui.config.SecureWebViewContent secureWebViewContent2 = this.getOutputFormats;
        com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url url = secureWebViewContent2 instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url ? (com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url) secureWebViewContent2 : null;
        com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url url2 = (url == null || !url.isAuthRequired()) ? null : url;
        if (url2 == null) {
            com.paypal.oslo.core.webview.ui.config.SecureWebViewContent secureWebViewContent3 = this.getOutputFormats;
            if (secureWebViewContent3 == null) {
                str2 = "no_content";
            } else {
                str2 = !(secureWebViewContent3 instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url) ? "html_content" : "auth_not_required";
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] re-authentication skipped - not applicable", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str3), kotlin.TuplesKt.to("reason", str2)), null, 4, null);
            return;
        }
        kotlinx.coroutines.Job job = this.getHighSpeedVideoSizes;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$reAuthenticate$1(this, onResult, str3, url2, null), 3, null);
        this.getHighSpeedVideoSizes = launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url url, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState> continuation) {
        com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$authenticateUrl$1 secureWebViewViewModel$authenticateUrl$1;
        int i;
        com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url url2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$authenticateUrl$1) {
            secureWebViewViewModel$authenticateUrl$1 = (com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$authenticateUrl$1) continuation;
            if ((secureWebViewViewModel$authenticateUrl$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                secureWebViewViewModel$authenticateUrl$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = secureWebViewViewModel$authenticateUrl$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = secureWebViewViewModel$authenticateUrl$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
                    kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", url.getSource()));
                    kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url.getUrl()));
                    com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase webAuthSessionAuthorizationUseCase = this.getHighSpeedVideoFpsRanges;
                    java.lang.String url3 = url.getUrl();
                    com.paypal.oslo.core.webview.domain.models.WebAuthContext webAuthContext = new com.paypal.oslo.core.webview.domain.models.WebAuthContext(null, 1, null);
                    secureWebViewViewModel$authenticateUrl$1.getHighSpeedVideoFpsRanges = url;
                    secureWebViewViewModel$authenticateUrl$1.Camera2StreamConfigurationMap = 1;
                    obj = webAuthSessionAuthorizationUseCase.invoke(webAuthContext, url3, secureWebViewViewModel$authenticateUrl$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    url2 = url;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url url4 = (com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url) secureWebViewViewModel$authenticateUrl$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    url2 = url4;
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.core.webview.domain.models.WebAuthSession webAuthSession = (com.paypal.oslo.core.webview.domain.models.WebAuthSession) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] URL authentication succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", url2.getSource())), null, 4, null);
                    com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url copy$default = com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url.copy$default(url2, webAuthSession.getRedirectUrl(), null, false, false, null, 30, null);
                    return new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success(new com.paypal.oslo.core.webview.ui.state.LoadableContent.Url(copy$default.getUrl(), copy$default.getAdditionalHttpHeaders()));
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError webAuthSessionAuthorizationError = (com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.webview.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to("source", url2.getSource());
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(webAuthSessionAuthorizationError.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "";
                    }
                    pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName);
                    com.paypal.android.logger.Logger.e$default(logger2, "[Webview] URL authentication failed", kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url2.getUrl())), null, 8, null);
                    return getHighSpeedVideoFpsRanges(webAuthSessionAuthorizationError, url2.getUrl());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        secureWebViewViewModel$authenticateUrl$1 = new com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$authenticateUrl$1(this, continuation);
        java.lang.Object obj2 = secureWebViewViewModel$authenticateUrl$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = secureWebViewViewModel$authenticateUrl$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    private static com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState getHighSpeedVideoFpsRanges(com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError p0, java.lang.String p1) {
        if (p0 instanceof com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.UrlValidationError) {
            return new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl(p1, ((com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.UrlValidationError) p0).getError());
        }
        if (!(p0 instanceof com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.SessionAuthorizationFailure)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.AuthFailed(p1, ((com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.SessionAuthorizationFailure) p0).getError());
    }

    public static final /* synthetic */ java.lang.Object access$processUrl(com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel secureWebViewViewModel, com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url url, kotlin.coroutines.Continuation continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] processing URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", url.getSource()), kotlin.TuplesKt.to("auth_required", java.lang.String.valueOf(url.isAuthRequired())), kotlin.TuplesKt.to("bypass_validation", java.lang.String.valueOf(url.getBypassUrlValidation()))), null, 4, null);
        if (url.getBypassUrlValidation()) {
            return new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success(new com.paypal.oslo.core.webview.ui.state.LoadableContent.Url(url.getUrl(), url.getAdditionalHttpHeaders()));
        }
        if (url.isAuthRequired()) {
            return secureWebViewViewModel.getHighSpeedVideoSizes(url, continuation);
        }
        arrow.core.Either<com.paypal.oslo.core.webview.domain.models.ValidateURLError, kotlin.Unit> invoke = secureWebViewViewModel.Camera2StreamConfigurationMap.invoke(url.getUrl());
        if (invoke instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] URL validation passed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", url.getSource())), null, 4, null);
            return new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success(new com.paypal.oslo.core.webview.ui.state.LoadableContent.Url(url.getUrl(), url.getAdditionalHttpHeaders()));
        }
        if (invoke instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError = (com.paypal.oslo.core.webview.domain.models.ValidateURLError) ((arrow.core.Either.Left) invoke).getValue();
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] URL validation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", url.getSource()), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, validateURLError.getCode().name()), kotlin.TuplesKt.to("error_message", validateURLError.getMessage())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url.getUrl())), null, 8, null);
            return new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl(url.getUrl(), validateURLError);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
