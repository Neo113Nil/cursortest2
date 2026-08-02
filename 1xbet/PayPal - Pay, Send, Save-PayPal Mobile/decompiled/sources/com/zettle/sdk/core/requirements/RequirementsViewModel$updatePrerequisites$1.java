package com.zettle.sdk.core.requirements;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.requirements.RequirementsViewModel$updatePrerequisites$1", f = "RequirementsViewModel.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class RequirementsViewModel$updatePrerequisites$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.core.requirements.RequirementsViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.zettle.sdk.core.permission.Permission permission;
        java.util.List<? extends com.zettle.sdk.core.permission.Prerequisite> list;
        com.zettle.sdk.core.requirements.RequirementsViewModel requirementsViewModel;
        androidx.view.MutableLiveData mutableLiveData;
        java.util.List list2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        java.util.List list3 = null;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.zettle.sdk.core.requirements.RequirementsViewModel requirementsViewModel2 = this.Camera2StreamConfigurationMap;
            permission = requirementsViewModel2.getInputSizeshNQ4ISI;
            list = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            if (list == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                list = null;
            }
            this.getHighSpeedVideoSizes = requirementsViewModel2;
            this.getHighSpeedVideoFpsRangesFor = 1;
            java.lang.Object checkApprovedPermissions = permission.checkApprovedPermissions(list, this);
            if (checkApprovedPermissions == coroutine_suspended) {
                return coroutine_suspended;
            }
            requirementsViewModel = requirementsViewModel2;
            obj = checkApprovedPermissions;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            requirementsViewModel = (com.zettle.sdk.core.requirements.RequirementsViewModel) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        requirementsViewModel.getOutputMinFrameDuration = (java.util.List) obj;
        mutableLiveData = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
        list2 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
        if (list2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            list3 = list2;
        }
        mutableLiveData.postValue(list3);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.requirements.RequirementsViewModel$updatePrerequisites$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.requirements.RequirementsViewModel$updatePrerequisites$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequirementsViewModel$updatePrerequisites$1(com.zettle.sdk.core.requirements.RequirementsViewModel requirementsViewModel, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.requirements.RequirementsViewModel$updatePrerequisites$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = requirementsViewModel;
    }
}
