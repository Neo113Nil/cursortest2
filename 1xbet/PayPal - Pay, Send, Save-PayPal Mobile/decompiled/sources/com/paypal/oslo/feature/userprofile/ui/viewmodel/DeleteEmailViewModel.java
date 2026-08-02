package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001eR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\"\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010'R \u0010)\u001a\b\u0012\u0004\u0012\u00020&0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/DeleteEmailViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/RemoveEmailUseCase;", "removeEmailUseCase", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorHandler;", "emailErrorHandler", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/userprofile/domain/usecase/RemoveEmailUseCase;Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorHandler;)V", "", "emailId", "", "deleteEmail", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/RemoveEmailUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorHandler;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighSpeedVideoFpsRangesFor", "isSuccess", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy;", "getHighSpeedVideoSizesFor", "errorStrategy", "getErrorStrategy", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/DeleteEmailEvent;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeleteEmailViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy> getHighSpeedVideoSizesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy> errorStrategy;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailEvent> events;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailEvent> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSuccess;

    @javax.inject.Inject
    public DeleteEmailViewModel(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase removeEmailUseCase, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler emailErrorHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeEmailUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailErrorHandler, "");
        this.Camera2StreamConfigurationMap = context;
        this.getHighResolutionOutputSizeshNQ4ISI = removeEmailUseCase;
        this.getHighSpeedVideoSizes = emailErrorHandler;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.isLoading = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow2;
        this.isSuccess = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoSizesFor = MutableStateFlow3;
        this.errorStrategy = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailEvent> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getInputSizeshNQ4ISI = MutableSharedFlow$default;
        this.events = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleError(com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel deleteEmailViewModel, com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel$handleError$1 deleteEmailViewModel$handleError$1;
        int i;
        java.util.List<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy> mapToEmailErrorStrategies;
        com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError2;
        java.util.Iterator<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy> it;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel$handleError$1) {
            deleteEmailViewModel$handleError$1 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel$handleError$1) continuation;
            if ((deleteEmailViewModel$handleError$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                deleteEmailViewModel$handleError$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = deleteEmailViewModel$handleError$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deleteEmailViewModel$handleError$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mapToEmailErrorStrategies = deleteEmailViewModel.getHighSpeedVideoSizes.mapToEmailErrorStrategies(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.DELETE, emailError, deleteEmailViewModel.Camera2StreamConfigurationMap);
                    emailError2 = emailError;
                    it = mapToEmailErrorStrategies.iterator();
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) deleteEmailViewModel$handleError$1.getHighSpeedVideoFpsRangesFor;
                    mapToEmailErrorStrategies = (java.util.List) deleteEmailViewModel$handleError$1.getHighResolutionOutputSizeshNQ4ISI;
                    emailError2 = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailError) deleteEmailViewModel$handleError$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy next = it.next();
                    if (next instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen) {
                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailEvent> mutableSharedFlow = deleteEmailViewModel.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailEvent.NavigateToFullScreenError navigateToFullScreenError = new com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailEvent.NavigateToFullScreenError((com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen) next);
                        deleteEmailViewModel$handleError$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailError2);
                        deleteEmailViewModel$handleError$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mapToEmailErrorStrategies);
                        deleteEmailViewModel$handleError$1.getHighSpeedVideoFpsRangesFor = it;
                        deleteEmailViewModel$handleError$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        deleteEmailViewModel$handleError$1.Camera2StreamConfigurationMap = 1;
                        if (mutableSharedFlow.emit(navigateToFullScreenError, deleteEmailViewModel$handleError$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (next instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable) {
                        deleteEmailViewModel.getHighSpeedVideoSizesFor.setValue(next);
                    } else {
                        if (!(next instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner) && !(next instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Unexpected strategy for DELETE action", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("strategyType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(next.getClass()).getSimpleName())), null, 4, null);
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        deleteEmailViewModel$handleError$1 = new com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel$handleError$1(deleteEmailViewModel, continuation);
        java.lang.Object obj2 = deleteEmailViewModel$handleError$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deleteEmailViewModel$handleError$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return this.isLoading;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSuccess() {
        return this.isSuccess;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy> getErrorStrategy() {
        return this.errorStrategy;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailEvent> getEvents() {
        return this.events;
    }

    public final void deleteEmail(java.lang.String emailId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel$deleteEmail$1(this, emailId, null), 3, null);
    }
}
