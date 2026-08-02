package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "onConfirmationShown", "onFinishClick", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessConfirmationViewModel$Effect;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Effect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataAccessConfirmationViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel.Effect> effect;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel.Effect> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DataAccessConfirmationViewModel() {
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoFpsRanges = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel.Effect> getEffect() {
        return this.effect;
    }

    public final void onConfirmationShown() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel$onConfirmationShown$1(null), 3, null);
    }

    public final void onFinishClick() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel$onFinishClick$1(this, null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessConfirmationViewModel$Effect;", "", "<init>", "()V", "NavigateBackToClose", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessConfirmationViewModel$Effect$NavigateBackToClose;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Effect {
        public static final int $stable = 0;

        private Effect() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessConfirmationViewModel$Effect$NavigateBackToClose;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessConfirmationViewModel$Effect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NavigateBackToClose extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel.Effect.NavigateBackToClose INSTANCE = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessConfirmationViewModel.Effect.NavigateBackToClose();

            private NavigateBackToClose() {
                super(null);
            }
        }

        public /* synthetic */ Effect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
