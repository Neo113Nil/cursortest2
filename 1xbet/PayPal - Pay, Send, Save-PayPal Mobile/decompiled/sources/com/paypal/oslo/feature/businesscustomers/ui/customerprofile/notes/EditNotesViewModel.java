package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001&B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/UpdateCustomerUseCase;", "updateCustomerUseCase", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/UpdateCustomerUseCase;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;)V", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent;", "event", "Lkotlinx/coroutines/Job;", "handleEvent$business_customers_prodRelease", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent;)Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/UpdateCustomerUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesUiState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesUiEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "uiEffects", "Lkotlinx/coroutines/flow/SharedFlow;", "getUiEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditNotesViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiEffect> uiEffects;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesViewModel;", "create", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel create(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode);
    }

    @dagger.assisted.AssistedInject
    public EditNotesViewModel(com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase updateCustomerUseCase, @dagger.assisted.Assisted com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, @dagger.assisted.Assisted com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCustomerUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersPresentationMode, "");
        this.Camera2StreamConfigurationMap = updateCustomerUseCase;
        this.getHighSpeedVideoFpsRangesFor = customer;
        java.lang.String description = customer.getDescription();
        java.lang.String str = description == null ? "" : description;
        java.lang.String description2 = customer.getDescription();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState(customersPresentationMode, str, description2 == null ? "" : description2, false, false, null, 56, null));
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoSizes = MutableSharedFlow$default;
        this.uiEffects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        if (r1 != r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$clearNotes(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel editNotesViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$clearNotes$1 editNotesViewModel$clearNotes$1;
        int i;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState value;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer copy;
        arrow.core.Either either;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState value2;
        arrow.core.Either either2;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState value3;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$clearNotes$1) {
            editNotesViewModel$clearNotes$1 = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$clearNotes$1) continuation;
            if ((editNotesViewModel$clearNotes$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                editNotesViewModel$clearNotes$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = editNotesViewModel$clearNotes$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = editNotesViewModel$clearNotes$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState> mutableStateFlow = editNotesViewModel.getHighSpeedVideoFpsRanges;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.copy$default(value, null, null, null, false, true, null, 15, null)));
                    copy = r7.copy((r24 & 1) != 0 ? r7.id : null, (r24 & 2) != 0 ? r7.type : null, (r24 & 4) != 0 ? r7.accountId : null, (r24 & 8) != 0 ? r7.externalId : null, (r24 & 16) != 0 ? r7.name : null, (r24 & 32) != 0 ? r7.photoUrl : null, (r24 & 64) != 0 ? r7.addresses : null, (r24 & 128) != 0 ? r7.emails : null, (r24 & 256) != 0 ? r7.phoneNumbers : null, (r24 & 512) != 0 ? r7.description : null, (r24 & 1024) != 0 ? editNotesViewModel.getHighSpeedVideoFpsRangesFor.isFavorite : false);
                    com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase updateCustomerUseCase = editNotesViewModel.Camera2StreamConfigurationMap;
                    editNotesViewModel$clearNotes$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy);
                    editNotesViewModel$clearNotes$1.getOutputFormats = 1;
                    obj = updateCustomerUseCase.invoke(copy, editNotesViewModel$clearNotes$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = editNotesViewModel$clearNotes$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = editNotesViewModel$clearNotes$1.getHighSpeedVideoFpsRanges;
                        int i4 = editNotesViewModel$clearNotes$1.Camera2StreamConfigurationMap;
                        either2 = (arrow.core.Either) editNotesViewModel$clearNotes$1.getOutputMinFrameDuration;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = either2;
                        if (either.isLeft()) {
                            java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Either.Left) either).getValue();
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState> mutableStateFlow2 = editNotesViewModel.getHighSpeedVideoFpsRanges;
                            do {
                                value3 = mutableStateFlow2.getValue();
                            } while (!mutableStateFlow2.compareAndSet(value3, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.copy$default(value3, null, null, null, false, false, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError.ClearFailed, 15, null)));
                            com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("EditNotesViewModel failed to clear notes", exc);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    copy = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) editNotesViewModel$clearNotes$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState> mutableStateFlow3 = editNotesViewModel.getHighSpeedVideoFpsRanges;
                    do {
                        value2 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value2, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.copy$default(value2, null, null, null, false, false, null, 47, null)));
                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiEffect> mutableSharedFlow = editNotesViewModel.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiEffect.NavigateBack navigateBack = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiEffect.NavigateBack.INSTANCE;
                    editNotesViewModel$clearNotes$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy);
                    editNotesViewModel$clearNotes$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    editNotesViewModel$clearNotes$1.getOutputMinFrameDuration = either;
                    editNotesViewModel$clearNotes$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    editNotesViewModel$clearNotes$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer);
                    editNotesViewModel$clearNotes$1.Camera2StreamConfigurationMap = 0;
                    editNotesViewModel$clearNotes$1.getHighSpeedVideoFpsRanges = 0;
                    editNotesViewModel$clearNotes$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    editNotesViewModel$clearNotes$1.getOutputFormats = 2;
                    if (mutableSharedFlow.emit(navigateBack, editNotesViewModel$clearNotes$1) != coroutine_suspended) {
                        either2 = either;
                        either = either2;
                    }
                    return coroutine_suspended;
                }
                if (either.isLeft()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        editNotesViewModel$clearNotes$1 = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$clearNotes$1(editNotesViewModel, continuation);
        java.lang.Object obj2 = editNotesViewModel$clearNotes$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = editNotesViewModel$clearNotes$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        if (r1 != r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$updateNotes(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel editNotesViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$updateNotes$1 editNotesViewModel$updateNotes$1;
        int i;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState value;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer copy;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState value2;
        arrow.core.Either either;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState value3;
        arrow.core.Either either2;
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState value4;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$updateNotes$1) {
            editNotesViewModel$updateNotes$1 = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$updateNotes$1) continuation;
            if ((editNotesViewModel$updateNotes$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                editNotesViewModel$updateNotes$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = editNotesViewModel$updateNotes$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = editNotesViewModel$updateNotes$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState> mutableStateFlow = editNotesViewModel.getHighSpeedVideoFpsRanges;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.copy$default(value, null, null, null, true, false, null, 23, null)));
                    if (editNotesViewModel.getHighSpeedVideoFpsRanges.getValue().getNotes().length() > 1000) {
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState> mutableStateFlow2 = editNotesViewModel.getHighSpeedVideoFpsRanges;
                        do {
                            value2 = mutableStateFlow2.getValue();
                        } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.copy$default(value2, null, null, null, false, false, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError.NotesTooLong, 23, null)));
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = editNotesViewModel.getHighSpeedVideoFpsRangesFor;
                    java.lang.String notes = editNotesViewModel.getHighSpeedVideoFpsRanges.getValue().getNotes();
                    if (kotlin.text.StringsKt.isBlank(notes)) {
                        notes = null;
                    }
                    copy = customer.copy((r24 & 1) != 0 ? customer.id : null, (r24 & 2) != 0 ? customer.type : null, (r24 & 4) != 0 ? customer.accountId : null, (r24 & 8) != 0 ? customer.externalId : null, (r24 & 16) != 0 ? customer.name : null, (r24 & 32) != 0 ? customer.photoUrl : null, (r24 & 64) != 0 ? customer.addresses : null, (r24 & 128) != 0 ? customer.emails : null, (r24 & 256) != 0 ? customer.phoneNumbers : null, (r24 & 512) != 0 ? customer.description : notes, (r24 & 1024) != 0 ? customer.isFavorite : false);
                    com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase updateCustomerUseCase = editNotesViewModel.Camera2StreamConfigurationMap;
                    editNotesViewModel$updateNotes$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy);
                    editNotesViewModel$updateNotes$1.getOutputMinFrameDuration = 1;
                    obj = updateCustomerUseCase.invoke(copy, editNotesViewModel$updateNotes$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = editNotesViewModel$updateNotes$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = editNotesViewModel$updateNotes$1.getHighSpeedVideoSizes;
                        int i4 = editNotesViewModel$updateNotes$1.getHighSpeedVideoFpsRangesFor;
                        either2 = (arrow.core.Either) editNotesViewModel$updateNotes$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = either2;
                        if (either.isLeft()) {
                            java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Either.Left) either).getValue();
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState> mutableStateFlow3 = editNotesViewModel.getHighSpeedVideoFpsRanges;
                            do {
                                value4 = mutableStateFlow3.getValue();
                            } while (!mutableStateFlow3.compareAndSet(value4, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.copy$default(value4, null, null, null, false, false, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesError.UpdateFailed, 23, null)));
                            com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("EditNotesViewModel failed to update notes", exc);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    copy = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) editNotesViewModel$updateNotes$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer2 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) ((arrow.core.Either.Right) either).getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState> mutableStateFlow4 = editNotesViewModel.getHighSpeedVideoFpsRanges;
                    do {
                        value3 = mutableStateFlow4.getValue();
                    } while (!mutableStateFlow4.compareAndSet(value3, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.copy$default(value3, null, null, null, false, false, null, 55, null)));
                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiEffect> mutableSharedFlow = editNotesViewModel.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiEffect.NavigateBack navigateBack = com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiEffect.NavigateBack.INSTANCE;
                    editNotesViewModel$updateNotes$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy);
                    editNotesViewModel$updateNotes$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    editNotesViewModel$updateNotes$1.getInputSizeshNQ4ISI = either;
                    editNotesViewModel$updateNotes$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    editNotesViewModel$updateNotes$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer2);
                    editNotesViewModel$updateNotes$1.getHighSpeedVideoFpsRangesFor = 0;
                    editNotesViewModel$updateNotes$1.getHighSpeedVideoSizes = 0;
                    editNotesViewModel$updateNotes$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    editNotesViewModel$updateNotes$1.getOutputMinFrameDuration = 2;
                    if (mutableSharedFlow.emit(navigateBack, editNotesViewModel$updateNotes$1) != coroutine_suspended) {
                        either2 = either;
                        either = either2;
                    }
                    return coroutine_suspended;
                }
                if (either.isLeft()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        editNotesViewModel$updateNotes$1 = new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$updateNotes$1(editNotesViewModel, continuation);
        java.lang.Object obj2 = editNotesViewModel$updateNotes$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = editNotesViewModel$updateNotes$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiEffect> getUiEffects() {
        return this.uiEffects;
    }

    public final kotlinx.coroutines.Job handleEvent$business_customers_prodRelease(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent event) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$handleEvent$1(event, this, null), 3, null);
        return launch$default;
    }
}
