package com.unity3d.services.core.domain.task;

/* compiled from: InitializeStateComplete.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2", f = "InitializeStateComplete.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class InitializeStateComplete$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateComplete.Params $params;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateComplete$doWork$2(com.unity3d.services.core.domain.task.InitializeStateComplete.Params params, com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2> continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateComplete;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        androidx.datastore.core.DataStore dataStore;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.services.core.domain.task.InitializeStateComplete.Params params = this.$params;
                com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete = this.this$0;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(moduleConfigurationList, "params.config.moduleConfigurationList");
                for (java.lang.Class cls : moduleConfigurationList) {
                    com.unity3d.services.core.configuration.IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(moduleConfiguration.initCompleteState(params.getConfig()));
                    }
                }
                dataStore = initializeStateComplete.dataStore;
                com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1(null);
                this.label = 1;
                if (dataStore.updateData(initializeStateComplete$doWork$2$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(m10798constructorimpl);
        } else {
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
            if (m10801exceptionOrNullimpl != null) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
            }
        }
        return kotlin.Result.m10797boximpl(m10798constructorimpl);
    }
}
