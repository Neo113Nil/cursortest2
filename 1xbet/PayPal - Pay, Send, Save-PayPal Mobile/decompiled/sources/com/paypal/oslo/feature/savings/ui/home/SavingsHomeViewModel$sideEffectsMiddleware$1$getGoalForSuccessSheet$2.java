package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2", f = "SavingsHomeViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {537}, m = "invokeSuspend", n = {"$this$coroutineScope", "deferreds", "result", "remainingDeferreds", "$this$select_u24lambda_u240$iv", "$i$f$select", "$i$a$-run-SelectKt$select$2$iv"}, nl = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_MOBILE_WALLET_ALREADY_ENROLLED}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Set<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel getInputSizeshNQ4ISI;
    int getOutputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00d2 -> B:5:0x00d5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List<kotlinx.coroutines.Deferred> mutableList;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO;
        java.util.List list;
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Set<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> set = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel = this.getInputSizeshNQ4ISI;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
            java.util.Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$deferreds$1$1(savingsHomeViewModel, (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) it.next(), null), 3, null);
                arrayList.add(async$default);
            }
            java.util.ArrayList arrayList2 = arrayList;
            mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList2);
            goalSummaryDTO = null;
            list = arrayList2;
            if (!mutableList.isEmpty()) {
            }
            if (goalSummaryDTO != null) {
            }
            return goalSummaryDTO;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableList = (java.util.List) this.getHighSpeedVideoSizesFor;
        list = (java.util.List) this.getHighSpeedVideoSizes;
        kotlin.ResultKt.throwOnFailure(obj);
        goalSummaryDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj;
        if (!mutableList.isEmpty() || goalSummaryDTO != null) {
            if (goalSummaryDTO != null) {
                java.util.Iterator it2 = mutableList.iterator();
                while (it2.hasNext()) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) it2.next(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
            }
            return goalSummaryDTO;
        }
        kotlinx.coroutines.selects.SelectImplementation selectImplementation = new kotlinx.coroutines.selects.SelectImplementation(getGetHighSpeedVideoSizes());
        kotlinx.coroutines.selects.SelectImplementation selectImplementation2 = selectImplementation;
        for (kotlinx.coroutines.Deferred deferred : mutableList) {
            selectImplementation2.invoke(deferred.getOnAwait(), new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$1$1$1(mutableList, deferred, null));
        }
        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(goalSummaryDTO);
        this.getHighSpeedVideoSizesFor = mutableList;
        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(selectImplementation);
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getOutputFormats = 1;
        obj = selectImplementation.doSelect(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        goalSummaryDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj;
        if (!mutableList.isEmpty()) {
        }
        if (goalSummaryDTO != null) {
        }
        return goalSummaryDTO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2 savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2 = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2(this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, continuation);
        savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2.getOutputMinFrameDuration = obj;
        return savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2(java.util.Set<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> set, com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = set;
        this.getInputSizeshNQ4ISI = savingsHomeViewModel;
    }
}
