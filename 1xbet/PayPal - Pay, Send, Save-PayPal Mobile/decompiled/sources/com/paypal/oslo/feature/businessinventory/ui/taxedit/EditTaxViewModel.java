package com.paypal.oslo.feature.businessinventory.ui.taxedit;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u00018BG\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010#\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001a\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102R \u00104\u001a\b\u0012\u0004\u0012\u000201038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/EditTaxViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "initialTax", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxEntityValidator;", "taxValidator", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/AddTaxUseCase;", "addTax", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/UpdateTaxUseCase;", "updateTax", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/DeleteTaxUseCase;", "deleteTax", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxEntityValidator;Lcom/paypal/oslo/feature/businessinventory/domain/usecase/AddTaxUseCase;Lcom/paypal/oslo/feature/businessinventory/domain/usecase/UpdateTaxUseCase;Lcom/paypal/oslo/feature/businessinventory/domain/usecase/DeleteTaxUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent;", "event", "Lkotlinx/coroutines/Job;", "publishEvent", "(Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent;)Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "Camera2StreamConfigurationMap", "getOutputFormats", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxEntityValidator;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/AddTaxUseCase;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/UpdateTaxUseCase;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/DeleteTaxUseCase;", "getHighSpeedVideoSizes", "getInputFormats", "Landroidx/lifecycle/SavedStateHandle;", "", "getOutputMinFrameDuration", "Z", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxUiEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/Flow;", "effects", "Lkotlinx/coroutines/flow/Flow;", "getEffects", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/State;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public class EditTaxViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect> effects;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.taxedit.State> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect> getOutputMinFrameDuration;
    private final androidx.view.SavedStateHandle getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final boolean getOutputFormats;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businessinventory.ui.taxedit.State> state;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/EditTaxViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "taxOption", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/EditTaxViewModel;", "create", "(Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;)Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/EditTaxViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel create(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode presentationMode, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption);
    }

    @dagger.assisted.AssistedInject
    public EditTaxViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode, @dagger.assisted.Assisted com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator taxEntityValidator, com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase addTaxUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase updateTaxUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase deleteTaxUseCase, androidx.view.SavedStateHandle savedStateHandle) {
        com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel access$toUiModel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxesPresentationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxEntityValidator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addTaxUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateTaxUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteTaxUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.Camera2StreamConfigurationMap = taxOption;
        this.getHighSpeedVideoFpsRangesFor = taxEntityValidator;
        this.getHighSpeedVideoFpsRanges = addTaxUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = updateTaxUseCase;
        this.getHighSpeedVideoSizes = deleteTaxUseCase;
        this.getInputFormats = savedStateHandle;
        boolean z = taxOption == null;
        this.getOutputFormats = z;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getOutputMinFrameDuration = MutableSharedFlow$default;
        this.effects = MutableSharedFlow$default;
        com.paypal.oslo.feature.businessinventory.ui.taxedit.State state = (com.paypal.oslo.feature.businessinventory.ui.taxedit.State) savedStateHandle.get("state");
        if (state == null) {
            com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel taxUiModel = (taxOption == null || (access$toUiModel = com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModelKt.access$toUiModel(taxOption)) == null) ? new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel(null, "", "") : access$toUiModel;
            state = new com.paypal.oslo.feature.businessinventory.ui.taxedit.State(taxesPresentationMode, taxUiModel, taxUiModel, z, kotlin.collections.SetsKt.emptySet(), com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None.INSTANCE, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None);
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.taxedit.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(state);
        this.getInputSizeshNQ4ISI = MutableStateFlow;
        this.state = MutableStateFlow;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r1 != r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$delete(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$delete$1 editTaxViewModel$delete$1;
        int i;
        com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel tax;
        arrow.core.Either either;
        arrow.core.Either either2;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$delete$1) {
            editTaxViewModel$delete$1 = (com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$delete$1) continuation;
            if ((editTaxViewModel$delete$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                editTaxViewModel$delete$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = editTaxViewModel$delete$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = editTaxViewModel$delete$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, null, null, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.Deleting, 63, null));
                    tax = editTaxViewModel.state.getValue().getTax();
                    com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase deleteTaxUseCase = editTaxViewModel.getHighSpeedVideoSizes;
                    java.lang.String id = tax.getId();
                    if (id == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    editTaxViewModel$delete$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tax);
                    editTaxViewModel$delete$1.getOutputFormats = 1;
                    obj = deleteTaxUseCase.invoke(id, editTaxViewModel$delete$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = editTaxViewModel$delete$1.Camera2StreamConfigurationMap;
                        int i3 = editTaxViewModel$delete$1.getHighSpeedVideoSizes;
                        int i4 = editTaxViewModel$delete$1.getHighSpeedVideoFpsRanges;
                        either2 = (arrow.core.Either) editTaxViewModel$delete$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = either2;
                        if (either.isLeft()) {
                            java.lang.Throwable th = (java.lang.Throwable) ((arrow.core.Either.Left) either).getValue();
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businessinventory.ui.taxedit.State> mutableStateFlow = editTaxViewModel.getInputSizeshNQ4ISI;
                            mutableStateFlow.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(mutableStateFlow.getValue(), null, null, null, false, null, new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Delete.INSTANCE), null, 95, null));
                            com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("EditTaxViewModel failed to delete tax", th);
                        }
                        editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, null, null, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None, 63, null));
                        return kotlin.Unit.INSTANCE;
                    }
                    tax = (com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel) editTaxViewModel$delete$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect> mutableSharedFlow = editTaxViewModel.getOutputMinFrameDuration;
                    com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBack navigateBack = com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBack.INSTANCE;
                    editTaxViewModel$delete$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tax);
                    editTaxViewModel$delete$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    editTaxViewModel$delete$1.getInputSizeshNQ4ISI = either;
                    editTaxViewModel$delete$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    editTaxViewModel$delete$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
                    editTaxViewModel$delete$1.getHighSpeedVideoFpsRanges = 0;
                    editTaxViewModel$delete$1.getHighSpeedVideoSizes = 0;
                    editTaxViewModel$delete$1.Camera2StreamConfigurationMap = 0;
                    editTaxViewModel$delete$1.getOutputFormats = 2;
                    if (mutableSharedFlow.emit(navigateBack, editTaxViewModel$delete$1) != coroutine_suspended) {
                        either2 = either;
                        either = either2;
                    }
                    return coroutine_suspended;
                }
                if (either.isLeft()) {
                }
                editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, null, null, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None, 63, null));
                return kotlin.Unit.INSTANCE;
            }
        }
        editTaxViewModel$delete$1 = new com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$delete$1(editTaxViewModel, continuation);
        java.lang.Object obj2 = editTaxViewModel$delete$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = editTaxViewModel$delete$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        if (either.isLeft()) {
        }
        editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, null, null, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None, 63, null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c8, code lost:
    
        if (r5.emit(r6, r0) != r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0207, code lost:
    
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0203, code lost:
    
        if (r5.emit(r6, r0) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e9, code lost:
    
        if (r15 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c9, code lost:
    
        if (r15 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$save(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$save$1 editTaxViewModel$save$1;
        java.util.Set set;
        com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel tax;
        com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption access$toTaxOption;
        java.util.Set set2;
        com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel taxUiModel;
        java.util.Set set3;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$save$1) {
            editTaxViewModel$save$1 = (com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$save$1) continuation;
            if ((editTaxViewModel$save$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                editTaxViewModel$save$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = editTaxViewModel$save$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (editTaxViewModel$save$1.getOutputFormats) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, kotlin.collections.SetsKt.emptySet(), com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None.INSTANCE, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.Saving, 15, null));
                        com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator taxEntityValidator = editTaxViewModel.getHighSpeedVideoFpsRangesFor;
                        java.lang.String label = editTaxViewModel.state.getValue().getTax().getLabel();
                        java.lang.String id = editTaxViewModel.state.getValue().getTax().getId();
                        editTaxViewModel$save$1.getOutputFormats = 1;
                        obj = taxEntityValidator.validateName(label, id, editTaxViewModel$save$1);
                        break;
                    case 1:
                        kotlin.ResultKt.throwOnFailure(obj);
                        set = (java.util.Set) obj;
                        com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator taxEntityValidator2 = editTaxViewModel.getHighSpeedVideoFpsRangesFor;
                        java.lang.String percentage = editTaxViewModel.state.getValue().getTax().getPercentage();
                        editTaxViewModel$save$1.getHighResolutionOutputSizeshNQ4ISI = set;
                        editTaxViewModel$save$1.getOutputFormats = 2;
                        obj = taxEntityValidator2.validateValue(percentage, editTaxViewModel$save$1);
                        break;
                    case 2:
                        set = (java.util.Set) editTaxViewModel$save$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.Set plus = kotlin.collections.SetsKt.plus(set, (java.lang.Iterable) obj);
                        if (!plus.isEmpty()) {
                            editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, plus, plus.size() > 1 ? new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show(com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.SaveValidation.INSTANCE) : com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None.INSTANCE, null, 79, null));
                            editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, null, null, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None, 63, null));
                            return kotlin.Unit.INSTANCE;
                        }
                        tax = editTaxViewModel.state.getValue().getTax();
                        if (editTaxViewModel.getOutputFormats) {
                            com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase addTaxUseCase = editTaxViewModel.getHighSpeedVideoFpsRanges;
                            java.lang.String obj2 = kotlin.text.StringsKt.trim(tax.getLabel()).toString();
                            double percentToFraction = com.paypal.oslo.feature.businessinventory.common.FormatAsPercentKt.percentToFraction(tax.getPercentage());
                            editTaxViewModel$save$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plus);
                            editTaxViewModel$save$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tax);
                            editTaxViewModel$save$1.getOutputFormats = 3;
                            obj = addTaxUseCase.invoke(obj2, percentToFraction, editTaxViewModel$save$1);
                            if (obj != coroutine_suspended) {
                                taxUiModel = tax;
                                set3 = plus;
                                right = (arrow.core.Either) obj;
                                if (right.isRight()) {
                                    com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) ((arrow.core.Either.Right) right).getValue();
                                    com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode presentationMode = editTaxViewModel.getInputSizeshNQ4ISI.getValue().getPresentationMode();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(presentationMode, com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.INSTANCE)) {
                                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect> mutableSharedFlow = editTaxViewModel.getOutputMinFrameDuration;
                                        com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBack navigateBack = com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBack.INSTANCE;
                                        editTaxViewModel$save$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(set3);
                                        editTaxViewModel$save$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(taxUiModel);
                                        editTaxViewModel$save$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                                        editTaxViewModel$save$1.getInputSizeshNQ4ISI = right;
                                        editTaxViewModel$save$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                                        editTaxViewModel$save$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(taxOption);
                                        editTaxViewModel$save$1.getHighSpeedVideoFpsRanges = 0;
                                        editTaxViewModel$save$1.getHighSpeedVideoFpsRangesFor = 0;
                                        editTaxViewModel$save$1.getHighSpeedVideoSizes = 0;
                                        editTaxViewModel$save$1.getOutputFormats = 5;
                                        break;
                                    } else {
                                        if (!(presentationMode instanceof com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect> mutableSharedFlow2 = editTaxViewModel.getOutputMinFrameDuration;
                                        com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBackWithResult navigateBackWithResult = new com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBackWithResult(taxOption);
                                        editTaxViewModel$save$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(set3);
                                        editTaxViewModel$save$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(taxUiModel);
                                        editTaxViewModel$save$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                                        editTaxViewModel$save$1.getInputSizeshNQ4ISI = right;
                                        editTaxViewModel$save$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                                        editTaxViewModel$save$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(taxOption);
                                        editTaxViewModel$save$1.getHighSpeedVideoFpsRanges = 0;
                                        editTaxViewModel$save$1.getHighSpeedVideoFpsRangesFor = 0;
                                        editTaxViewModel$save$1.getHighSpeedVideoSizes = 0;
                                        editTaxViewModel$save$1.getOutputFormats = 6;
                                        break;
                                    }
                                    right = r1;
                                }
                                if (right.isLeft()) {
                                    java.lang.Throwable th = (java.lang.Throwable) ((arrow.core.Either.Left) right).getValue();
                                    if (th instanceof com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException) {
                                        com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException saveTaxOptionException = (com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException) th;
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(saveTaxOptionException, com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.Duplicated.INSTANCE)) {
                                            editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, kotlin.collections.SetsKt.plus(editTaxViewModel.state.getValue().getValidationErrors(), com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.NotUnique), null, null, 111, null));
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(saveTaxOptionException, com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.NameTooLong.INSTANCE)) {
                                            editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, kotlin.collections.SetsKt.plus(editTaxViewModel.state.getValue().getValidationErrors(), com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.TooLong), null, null, 111, null));
                                        }
                                    }
                                    editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, null, new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show(new com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save(kotlin.jvm.internal.Intrinsics.areEqual(th, com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.ExceedsMaxItemLimit.INSTANCE) ? com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError.TooManyTaxes : com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.Show.FailedAction.Save.SaveError.General)), null, 95, null));
                                    java.lang.String str = editTaxViewModel.getOutputFormats ? "create" : "update";
                                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.businessinventory.LoggerKt.log;
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("EditTaxViewModel failed to ");
                                    sb.append(str);
                                    sb.append(" tax");
                                    logger.e(sb.toString(), th);
                                }
                                editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, null, null, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None, 63, null));
                                return kotlin.Unit.INSTANCE;
                            }
                        } else {
                            access$toTaxOption = com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModelKt.access$toTaxOption(tax);
                            com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase updateTaxUseCase = editTaxViewModel.getHighResolutionOutputSizeshNQ4ISI;
                            editTaxViewModel$save$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plus);
                            editTaxViewModel$save$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tax);
                            editTaxViewModel$save$1.getOutputMinFrameDuration = access$toTaxOption;
                            editTaxViewModel$save$1.getOutputFormats = 4;
                            obj = updateTaxUseCase.invoke(access$toTaxOption, editTaxViewModel$save$1);
                            if (obj != coroutine_suspended) {
                                set2 = plus;
                                right = (arrow.core.Either) obj;
                                if (!(right instanceof arrow.core.Either.Right)) {
                                    right = new arrow.core.Either.Right(access$toTaxOption);
                                } else if (!(right instanceof arrow.core.Either.Left)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                taxUiModel = tax;
                                set3 = set2;
                                if (right.isRight()) {
                                }
                                if (right.isLeft()) {
                                }
                                editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, null, null, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None, 63, null));
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    case 3:
                        taxUiModel = (com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel) editTaxViewModel$save$1.Camera2StreamConfigurationMap;
                        set3 = (java.util.Set) editTaxViewModel$save$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        right = (arrow.core.Either) obj;
                        if (right.isRight()) {
                        }
                        if (right.isLeft()) {
                        }
                        editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, null, null, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None, 63, null));
                        return kotlin.Unit.INSTANCE;
                    case 4:
                        access$toTaxOption = (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) editTaxViewModel$save$1.getOutputMinFrameDuration;
                        tax = (com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel) editTaxViewModel$save$1.Camera2StreamConfigurationMap;
                        set2 = (java.util.Set) editTaxViewModel$save$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        right = (arrow.core.Either) obj;
                        if (!(right instanceof arrow.core.Either.Right)) {
                        }
                        taxUiModel = tax;
                        set3 = set2;
                        if (right.isRight()) {
                        }
                        if (right.isLeft()) {
                        }
                        editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, null, null, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None, 63, null));
                        return kotlin.Unit.INSTANCE;
                    case 5:
                    case 6:
                        int i = editTaxViewModel$save$1.getHighSpeedVideoSizes;
                        int i2 = editTaxViewModel$save$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = editTaxViewModel$save$1.getHighSpeedVideoFpsRanges;
                        arrow.core.Either either = (arrow.core.Either) editTaxViewModel$save$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        right = either;
                        if (right.isLeft()) {
                        }
                        editTaxViewModel.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(editTaxViewModel.state.getValue(), null, null, null, false, null, null, com.paypal.oslo.feature.businessinventory.ui.taxedit.State.LoadingState.None, 63, null));
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        editTaxViewModel$save$1 = new com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$save$1(editTaxViewModel, continuation);
        java.lang.Object obj3 = editTaxViewModel$save$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (editTaxViewModel$save$1.getOutputFormats) {
        }
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect> getEffects() {
        return this.effects;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businessinventory.ui.taxedit.State> getState() {
        return this.state;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$1", f = "EditTaxViewModel.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businessinventory.ui.taxedit.State> state = com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.this.getState();
                final com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel = com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.this;
                this.getHighSpeedVideoFpsRanges = 1;
                if (state.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.this.getInputFormats.set("state", (com.paypal.oslo.feature.businessinventory.ui.taxedit.State) obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final kotlinx.coroutines.Job publishEvent(com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent event) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$publishEvent$1(event, this, null), 3, null);
        return launch$default;
    }
}
