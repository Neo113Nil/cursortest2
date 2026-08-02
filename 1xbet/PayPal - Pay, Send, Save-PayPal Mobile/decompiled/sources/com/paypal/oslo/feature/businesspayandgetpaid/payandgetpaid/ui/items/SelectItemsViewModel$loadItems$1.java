package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel$loadItems$1", f = "SelectItemsViewModel.kt", i = {1, 1, 1, 1}, l = {53, 64}, m = "invokeSuspend", n = {"this_$iv", "items", "$i$f$fold", "$i$a$-fold-SelectItemsViewModel$loadItems$1$3"}, nl = {54, 65}, s = {"L$0", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class SelectItemsViewModel$loadItems$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel getHighSpeedVideoSizesFor;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:60:0x005b, code lost:
    
        if (r13 != r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase refreshBusinessInventoryItemsUseCase;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel selectItemsViewModel;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.core.userstore.UserStore userStore;
        java.util.List list;
        com.paypal.oslo.core.userstore.model.UserState userState;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState.copy$default((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState) value, true, null, null, null, 10, null)));
            refreshBusinessInventoryItemsUseCase = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration = 1;
            obj = refreshBusinessInventoryItemsUseCase.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (java.util.List) this.getHighSpeedVideoFpsRangesFor;
                selectItemsViewModel = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                    mutableStateFlow4 = selectItemsViewModel.getHighSpeedVideoSizes;
                    do {
                        value4 = mutableStateFlow4.getValue();
                    } while (!mutableStateFlow4.compareAndSet(value4, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState.copy$default((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState) value4, false, null, "Failed to load items. Please try again.", null, 10, null)));
                } else {
                    java.lang.String accountCurrencyCode = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser().getAccountCurrencyCode();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj2).getPrice().getCurrencyCode(), accountCurrencyCode)) {
                            arrayList.add(obj2);
                        }
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItemKt.toLineItem((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) it.next()));
                    }
                    java.util.ArrayList arrayList4 = arrayList3;
                    mutableStateFlow3 = selectItemsViewModel.getHighSpeedVideoSizes;
                    do {
                        value3 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value3, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState) value3).copy(false, arrayList4, null, accountCurrencyCode)));
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        selectItemsViewModel = this.getHighSpeedVideoSizesFor;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List list2 = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            userStore = selectItemsViewModel.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState2 = userStore.getUserState();
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighSpeedVideoFpsRanges = selectItemsViewModel;
            this.getHighSpeedVideoFpsRangesFor = list2;
            this.getHighSpeedVideoSizes = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getOutputMinFrameDuration = 2;
            obj = kotlinx.coroutines.flow.FlowKt.first(userState2, this);
            if (obj != coroutine_suspended) {
                list = list2;
                userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                }
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow2 = selectItemsViewModel.getHighSpeedVideoSizes;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState.copy$default((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState) value2, false, null, "Failed to load items. Please try again.", null, 10, null)));
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel$loadItems$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel$loadItems$1(this.getHighSpeedVideoSizesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectItemsViewModel$loadItems$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel selectItemsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel$loadItems$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = selectItemsViewModel;
    }
}
