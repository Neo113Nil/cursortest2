package com.zettle.sdk.core.requirements;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.requirements.RequirementsViewModel$monitorNetworkConnection$1", f = "RequirementsViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class RequirementsViewModel$monitorNetworkConnection$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.core.requirements.RequirementsViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.zettle.sdk.core.network.NetworkModule networkModule;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            networkModule = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.network.Connection> connected = networkModule.getConnected();
            final com.zettle.sdk.core.requirements.RequirementsViewModel requirementsViewModel = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (connected.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.zettle.sdk.core.requirements.RequirementsViewModel$monitorNetworkConnection$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object emit(com.zettle.sdk.core.network.Connection connection, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.Job job;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(connection, com.zettle.sdk.core.network.Connection.Connected.INSTANCE)) {
                        com.zettle.sdk.core.requirements.RequirementsViewModel.this.updatePrerequisites();
                        job = com.zettle.sdk.core.requirements.RequirementsViewModel.this.getHighResolutionOutputSizeshNQ4ISI;
                        if (job != null) {
                            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        }
                    }
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
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.requirements.RequirementsViewModel$monitorNetworkConnection$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.requirements.RequirementsViewModel$monitorNetworkConnection$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequirementsViewModel$monitorNetworkConnection$1(com.zettle.sdk.core.requirements.RequirementsViewModel requirementsViewModel, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.requirements.RequirementsViewModel$monitorNetworkConnection$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = requirementsViewModel;
    }
}
