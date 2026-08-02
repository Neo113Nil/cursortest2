package com.paypal.oslo.feature.home.ui.accountsnapshot;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel$retryLoad$1", f = "AccountSnapshotViewModel.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, nl = {145}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AccountSnapshotViewModel$retryLoad$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent, kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase retrySectionUseCase;
        com.paypal.oslo.feature.home.domain.model.Section section;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            retrySectionUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = retrySectionUseCase.invoke(com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository.ACCOUNT_SNAPSHOT_SECTION_ID, com.paypal.oslo.feature.home.domain.model.SectionTypes.ACCOUNT_SNAPSHOT, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list = (java.util.List) ((arrow.core.Ior) obj).getOrNull();
        if (list == null || (section = (com.paypal.oslo.feature.home.domain.model.Section) kotlin.collections.CollectionsKt.firstOrNull(list)) == null) {
            throw new java.lang.IllegalStateException("Expected account snapshot section but got Ior.Left or empty list".toString());
        }
        com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.access$dispatchSectionEvent(this.getHighSpeedVideoFpsRanges, section, this.Camera2StreamConfigurationMap);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel$retryLoad$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel$retryLoad$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AccountSnapshotViewModel$retryLoad$1(com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel accountSnapshotViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel$retryLoad$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = accountSnapshotViewModel;
        this.Camera2StreamConfigurationMap = function1;
    }
}
