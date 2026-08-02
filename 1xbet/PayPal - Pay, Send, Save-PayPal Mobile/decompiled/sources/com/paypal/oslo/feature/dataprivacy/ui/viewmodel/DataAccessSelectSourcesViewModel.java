package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetLinkedAccountsUseCase;", "getLinkedAccountsUseCase", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetLinkedAccountsUseCase;)V", "", "", "sources", "", "updateSelectedSources", "(Ljava/util/List;)V", "onContinueClick", "()V", "onBackClick", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetLinkedAccountsUseCase;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel$Effect;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "availableSources", "Lkotlinx/coroutines/flow/StateFlow;", "getAvailableSources", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "selectedSources", "getSelectedSources", "Companion", "Effect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataAccessSelectSourcesViewModel extends androidx.view.ViewModel {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> availableSources;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect> effect;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> selectedSources;
    public static final int $stable = 8;

    @javax.inject.Inject
    public DataAccessSelectSourcesViewModel(com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase getLinkedAccountsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLinkedAccountsUseCase, "");
        this.getHighSpeedVideoSizes = getLinkedAccountsUseCase;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoFpsRangesFor = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.availableSources = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow2;
        this.selectedSources = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$loadAvailableSources(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$loadAvailableSources$1 dataAccessSelectSourcesViewModel$loadAvailableSources$1;
        int i;
        arrow.core.Ior ior;
        java.util.List list;
        java.util.Iterator it;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$loadAvailableSources$1) {
            dataAccessSelectSourcesViewModel$loadAvailableSources$1 = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$loadAvailableSources$1) continuation;
            if ((dataAccessSelectSourcesViewModel$loadAvailableSources$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                dataAccessSelectSourcesViewModel$loadAvailableSources$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = dataAccessSelectSourcesViewModel$loadAvailableSources$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataAccessSelectSourcesViewModel$loadAvailableSources$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase getLinkedAccountsUseCase = dataAccessSelectSourcesViewModel.getHighSpeedVideoSizes;
                    dataAccessSelectSourcesViewModel$loadAvailableSources$1.getHighSpeedVideoSizes = 1;
                    obj = getLinkedAccountsUseCase.invoke(dataAccessSelectSourcesViewModel$loadAvailableSources$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    list = kotlin.collections.CollectionsKt.emptyList();
                } else if (ior instanceof arrow.core.Ior.Right) {
                    list = (java.util.List) ((arrow.core.Ior.Right) ior).getValue();
                } else {
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    list = (java.util.List) ((arrow.core.Ior.Both) ior).getRightValue();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    int i2 = com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount) it.next()).ordinal()];
                    if (i2 == 1) {
                        str = "Honey";
                    } else if (i2 == 2) {
                        str = "Xoom";
                    } else if (i2 == 3) {
                        str = "Zettle";
                    } else {
                        if (i2 != 4) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                dataAccessSelectSourcesViewModel.Camera2StreamConfigurationMap.setValue(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf("PayPal"), (java.lang.Iterable) arrayList));
                dataAccessSelectSourcesViewModel.getHighResolutionOutputSizeshNQ4ISI.setValue(kotlin.collections.CollectionsKt.listOf("PayPal"));
                return kotlin.Unit.INSTANCE;
            }
        }
        dataAccessSelectSourcesViewModel$loadAvailableSources$1 = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$loadAvailableSources$1(dataAccessSelectSourcesViewModel, continuation);
        java.lang.Object obj2 = dataAccessSelectSourcesViewModel$loadAvailableSources$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataAccessSelectSourcesViewModel$loadAvailableSources$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        it = list.iterator();
        while (it.hasNext()) {
        }
        dataAccessSelectSourcesViewModel.Camera2StreamConfigurationMap.setValue(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf("PayPal"), (java.lang.Iterable) arrayList2));
        dataAccessSelectSourcesViewModel.getHighResolutionOutputSizeshNQ4ISI.setValue(kotlin.collections.CollectionsKt.listOf("PayPal"));
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect> getEffect() {
        return this.effect;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getAvailableSources() {
        return this.availableSources;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getSelectedSources() {
        return this.selectedSources;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$1", f = "DataAccessSelectSourcesViewModel.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, nl = {56}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                if (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.access$loadAvailableSources(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.this, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final void updateSelectedSources(java.util.List<java.lang.String> sources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sources, "");
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(sources);
    }

    public final void onContinueClick() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$onContinueClick$1(this, null), 3, null);
    }

    public final void onBackClick() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel$onBackClick$1(this, null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel$Effect;", "", "<init>", "()V", "NavigateToChooseFormat", "NavigateBack", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel$Effect$NavigateBack;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel$Effect$NavigateToChooseFormat;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        private Effect() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel$Effect$NavigateToChooseFormat;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel$Effect;", "", "", "selectedSources", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel$Effect$NavigateToChooseFormat;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSelectedSources"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToChooseFormat extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect {
            public static final int $stable = 8;
            private final java.util.List<java.lang.String> selectedSources;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToChooseFormat(java.util.List<java.lang.String> list) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.selectedSources = list;
            }

            public final java.util.List<java.lang.String> getSelectedSources() {
                return this.selectedSources;
            }

            public final java.lang.String toString() {
                java.util.List<java.lang.String> list = this.selectedSources;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToChooseFormat(selectedSources=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.selectedSources.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateToChooseFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedSources, ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateToChooseFormat) other).selectedSources);
            }

            public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateToChooseFormat copy(java.util.List<java.lang.String> selectedSources) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedSources, "");
                return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateToChooseFormat(selectedSources);
            }

            public final java.util.List<java.lang.String> component1() {
                return this.selectedSources;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateToChooseFormat copy$default(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateToChooseFormat navigateToChooseFormat, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = navigateToChooseFormat.selectedSources;
                }
                return navigateToChooseFormat.copy(list);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel$Effect$NavigateBack;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessSelectSourcesViewModel$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateBack extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateBack INSTANCE = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateBack();

            private NavigateBack() {
                super(null);
            }
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.values().length];
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.HONEY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.XOOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.ZETTLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.PAYPAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
