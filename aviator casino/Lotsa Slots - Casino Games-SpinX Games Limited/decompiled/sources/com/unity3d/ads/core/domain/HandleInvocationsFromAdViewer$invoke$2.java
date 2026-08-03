package com.unity3d.ads.core.domain;

/* compiled from: HandleInvocationsFromAdViewer.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/adplayer/Invocation;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class HandleInvocationsFromAdViewer$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.adplayer.Invocation, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.Map<java.lang.String, kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>> $definition;
    /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HandleInvocationsFromAdViewer$invoke$2(java.util.Map<java.lang.String, ? extends kotlin.jvm.functions.Function0<? extends com.unity3d.ads.adplayer.ExposedFunction>> map, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2> continuation) {
        super(2, continuation);
        this.$definition = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2 handleInvocationsFromAdViewer$invoke$2 = new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2(this.$definition, continuation);
        handleInvocationsFromAdViewer$invoke$2.L$0 = obj;
        return handleInvocationsFromAdViewer$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.adplayer.Invocation invocation, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2) create(invocation, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.adplayer.ExposedFunction invoke;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.adplayer.Invocation invocation = (com.unity3d.ads.adplayer.Invocation) this.L$0;
            kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction> function0 = this.$definition.get(invocation.getLocation());
            if (function0 == null || (invoke = function0.invoke()) == null) {
                return kotlin.Unit.INSTANCE;
            }
            this.label = 1;
            if (invocation.handle(new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2.AnonymousClass1(invoke, invocation, null), this) == coroutine_suspended) {
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

    /* compiled from: HandleInvocationsFromAdViewer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.adplayer.ExposedFunction $exposedFunction;
        final /* synthetic */ com.unity3d.ads.adplayer.Invocation $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.unity3d.ads.adplayer.ExposedFunction exposedFunction, com.unity3d.ads.adplayer.Invocation invocation, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2.AnonymousClass1> continuation) {
            super(1, continuation);
            this.$exposedFunction = exposedFunction;
            this.$it = invocation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2.AnonymousClass1(this.$exposedFunction, this.$it, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
            return invoke2((kotlin.coroutines.Continuation<java.lang.Object>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
            return ((com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.ads.adplayer.ExposedFunction exposedFunction = this.$exposedFunction;
                java.lang.Object[] parameters = this.$it.getParameters();
                this.label = 1;
                obj = exposedFunction.invoke(parameters, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }
}
