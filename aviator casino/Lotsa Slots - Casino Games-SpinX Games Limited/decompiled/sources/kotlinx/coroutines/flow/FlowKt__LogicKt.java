package kotlinx.coroutines.flow;

/* compiled from: Logic.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aB\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0086@¢\u0006\u0002\u0010\b\u001aB\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0086@¢\u0006\u0002\u0010\b\u001aB\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0086@¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"any", "", "T", "Lkotlinx/coroutines/flow/Flow;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "all", "none", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes6.dex */
final /* synthetic */ class FlowKt__LogicKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object any(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        kotlinx.coroutines.flow.FlowKt__LogicKt$any$1 flowKt__LogicKt$any$1;
        int i;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LogicKt$any$1) {
            flowKt__LogicKt$any$1 = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$1) continuation;
            if ((flowKt__LogicKt$any$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__LogicKt$any$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = flowKt__LogicKt$any$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LogicKt$any$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowKt__LogicKt$any$$inlined$collectWhile$1 = new kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1<>(function2, booleanRef2);
                    try {
                        flowKt__LogicKt$any$1.L$0 = booleanRef2;
                        flowKt__LogicKt$any$1.L$1 = flowKt__LogicKt$any$$inlined$collectWhile$1;
                        flowKt__LogicKt$any$1.label = 1;
                        if (flow.collect(flowKt__LogicKt$any$$inlined$collectWhile$1, flowKt__LogicKt$any$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        booleanRef = booleanRef2;
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                        booleanRef = booleanRef2;
                        e = e2;
                        flowCollector = flowKt__LogicKt$any$$inlined$collectWhile$1;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        kotlinx.coroutines.JobKt.ensureActive(flowKt__LogicKt$any$1.get$context());
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanRef.element);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1) flowKt__LogicKt$any$1.L$1;
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) flowKt__LogicKt$any$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                        e = e3;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        kotlinx.coroutines.JobKt.ensureActive(flowKt__LogicKt$any$1.get$context());
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanRef.element);
                    }
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanRef.element);
            }
        }
        flowKt__LogicKt$any$1 = new kotlinx.coroutines.flow.FlowKt__LogicKt$any$1(continuation);
        java.lang.Object obj2 = flowKt__LogicKt$any$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LogicKt$any$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object all(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        kotlinx.coroutines.flow.FlowKt__LogicKt$all$1 flowKt__LogicKt$all$1;
        int i;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LogicKt$all$1) {
            flowKt__LogicKt$all$1 = (kotlinx.coroutines.flow.FlowKt__LogicKt$all$1) continuation;
            if ((flowKt__LogicKt$all$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__LogicKt$all$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = flowKt__LogicKt$all$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LogicKt$all$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowKt__LogicKt$all$$inlined$collectWhile$1 = new kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1<>(function2, booleanRef2);
                    try {
                        flowKt__LogicKt$all$1.L$0 = booleanRef2;
                        flowKt__LogicKt$all$1.L$1 = flowKt__LogicKt$all$$inlined$collectWhile$1;
                        flowKt__LogicKt$all$1.label = 1;
                        if (flow.collect(flowKt__LogicKt$all$$inlined$collectWhile$1, flowKt__LogicKt$all$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        booleanRef = booleanRef2;
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                        booleanRef = booleanRef2;
                        e = e2;
                        flowCollector = flowKt__LogicKt$all$$inlined$collectWhile$1;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        kotlinx.coroutines.JobKt.ensureActive(flowKt__LogicKt$all$1.get$context());
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!booleanRef.element);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1) flowKt__LogicKt$all$1.L$1;
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) flowKt__LogicKt$all$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                        e = e3;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        kotlinx.coroutines.JobKt.ensureActive(flowKt__LogicKt$all$1.get$context());
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!booleanRef.element);
                    }
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!booleanRef.element);
            }
        }
        flowKt__LogicKt$all$1 = new kotlinx.coroutines.flow.FlowKt__LogicKt$all$1(continuation);
        java.lang.Object obj2 = flowKt__LogicKt$all$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LogicKt$all$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!booleanRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object none(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        kotlinx.coroutines.flow.FlowKt__LogicKt$none$1 flowKt__LogicKt$none$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LogicKt$none$1) {
            flowKt__LogicKt$none$1 = (kotlinx.coroutines.flow.FlowKt__LogicKt$none$1) continuation;
            if ((flowKt__LogicKt$none$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__LogicKt$none$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = flowKt__LogicKt$none$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LogicKt$none$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    flowKt__LogicKt$none$1.label = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.any(flow, function2, flowKt__LogicKt$none$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!((java.lang.Boolean) obj).booleanValue());
            }
        }
        flowKt__LogicKt$none$1 = new kotlinx.coroutines.flow.FlowKt__LogicKt$none$1(continuation);
        java.lang.Object obj2 = flowKt__LogicKt$none$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LogicKt$none$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!((java.lang.Boolean) obj2).booleanValue());
    }
}
