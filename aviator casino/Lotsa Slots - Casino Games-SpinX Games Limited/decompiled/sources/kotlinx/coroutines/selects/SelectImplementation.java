package kotlinx.coroutines.selects;

/* compiled from: Select.kt */
@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001IB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u001b\u001a\u00028\u0000H\u0091@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010\u001cJ0\u0010\u001e\u001a\u00020\u001f*\u00020 2\u001c\u0010!\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\r0\"H\u0096\u0002¢\u0006\u0002\u0010$JB\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0001\u0010%*\b\u0012\u0004\u0012\u0002H%0&2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\r0'H\u0096\u0002¢\u0006\u0002\u0010(JV\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0001\u0010)\"\u0004\b\u0002\u0010%*\u000e\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H%0*2\u0006\u0010+\u001a\u0002H)2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\r0'H\u0096\u0002¢\u0006\u0002\u0010,J \u0010-\u001a\u00020\u001f*\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010.\u001a\u00020\u000fH\u0001J\u0010\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\rH\u0002J\u0010\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u000203H\u0016J\u001c\u00104\u001a\u00020\u001f2\n\u00105\u001a\u0006\u0012\u0002\b\u0003062\u0006\u00107\u001a\u00020\u0019H\u0016J\u0012\u00108\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u00109\u001a\u00020\u001fH\u0082@¢\u0006\u0002\u0010\u001cJ\u0010\u0010:\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\rH\u0002J\u001a\u0010;\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010=\u001a\u00020>2\u0006\u00100\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\rJ\u001a\u0010?\u001a\u00020\u00192\u0006\u00100\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0002J\u001c\u0010@\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020\rH\u0002J\u000e\u0010A\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010\u001cJ*\u0010B\u001a\u00028\u00002\u0010\u0010C\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0002\u0010DJ\u001a\u0010E\u001a\u00020\u001f2\u0010\u0010F\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R \u0010\u0014\u001a\u0014\u0012\u000e\u0012\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "context", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "state", "Lkotlinx/atomicfu/AtomicRef;", "", "inRegistrationPhase", "", "getInRegistrationPhase", "()Z", "isSelected", "isCancelled", "clauses", "", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "disposableHandleOrSegment", "indexInSegment", "", "internalResult", "doSelect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doSelectSuspend", "invoke", "", "Lkotlinx/coroutines/selects/SelectClause0;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "register", "reregister", "checkClauseObject", "clauseObject", "disposeOnCompletion", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", com.ironsource.D1.i, "Lkotlinx/coroutines/internal/Segment;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "selectInRegistrationPhase", "waitUntilSelected", "reregisterClause", "trySelect", "result", "trySelectDetailed", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "trySelectInternal", "findClause", "complete", "processResultAndInvokeBlockRecoveringException", "clause", "(Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanup", "selectedClause", "cause", "", "ClauseData", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SelectImplementation<R> implements kotlinx.coroutines.CancelHandler, kotlinx.coroutines.selects.SelectBuilder<R>, kotlinx.coroutines.selects.SelectInstanceInternal<R> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater state$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.selects.SelectImplementation.class, java.lang.Object.class, "state$volatile");
    private java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> clauses;
    private final kotlin.coroutines.CoroutineContext context;
    private java.lang.Object disposableHandleOrSegment;
    private int indexInSegment;
    private java.lang.Object internalResult;
    private volatile /* synthetic */ java.lang.Object state$volatile;

    private final /* synthetic */ java.lang.Object getState$volatile() {
        return this.state$volatile;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.lang.Object obj, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void setState$volatile(java.lang.Object obj) {
        this.state$volatile = obj;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Any(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.lang.Object obj, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.lang.Object> function1) {
        java.lang.Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
    }

    public java.lang.Object doSelect(kotlin.coroutines.Continuation<? super R> continuation) {
        return doSelect$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> selectClause2, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.selects.SelectBuilder.DefaultImpls.invoke(this, selectClause2, function2);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @kotlin.ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    public void onTimeout(long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1) {
        kotlinx.coroutines.selects.SelectBuilder.DefaultImpls.onTimeout(this, j, function1);
    }

    public SelectImplementation(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        this.context = coroutineContext;
        symbol = kotlinx.coroutines.selects.SelectKt.STATE_REG;
        this.state$volatile = symbol;
        this.clauses = new java.util.ArrayList(2);
        this.indexInSegment = -1;
        symbol2 = kotlinx.coroutines.selects.SelectKt.NO_RESULT;
        this.internalResult = symbol2;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public kotlin.coroutines.CoroutineContext getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInRegistrationPhase() {
        kotlinx.coroutines.internal.Symbol symbol;
        java.lang.Object obj = state$volatile$FU.get(this);
        symbol = kotlinx.coroutines.selects.SelectKt.STATE_REG;
        return obj == symbol || (obj instanceof java.util.List);
    }

    private final boolean isSelected() {
        return state$volatile$FU.get(this) instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCancelled() {
        kotlinx.coroutines.internal.Symbol symbol;
        java.lang.Object obj = state$volatile$FU.get(this);
        symbol = kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED;
        return obj == symbol;
    }

    static /* synthetic */ <R> java.lang.Object doSelect$suspendImpl(kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation, kotlin.coroutines.Continuation<? super R> continuation) {
        return selectImplementation.isSelected() ? selectImplementation.complete(continuation) : selectImplementation.doSelectSuspend(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058 A[PHI: r6
      0x0058: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0055, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doSelectSuspend(kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        int i;
        kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation;
        if (continuation instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) continuation;
            if ((selectImplementation$doSelectSuspend$1.label & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = selectImplementation$doSelectSuspend$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = selectImplementation$doSelectSuspend$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    selectImplementation$doSelectSuspend$1.L$0 = this;
                    selectImplementation$doSelectSuspend$1.label = 1;
                    if (waitUntilSelected(selectImplementation$doSelectSuspend$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    selectImplementation = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    selectImplementation = (kotlinx.coroutines.selects.SelectImplementation) selectImplementation$doSelectSuspend$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                selectImplementation$doSelectSuspend$1.L$0 = null;
                selectImplementation$doSelectSuspend$1.label = 2;
                obj = selectImplementation.complete(selectImplementation$doSelectSuspend$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        selectImplementation$doSelectSuspend$1 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1(this, continuation);
        java.lang.Object obj2 = selectImplementation$doSelectSuspend$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectImplementation$doSelectSuspend$1.label;
        if (i != 0) {
        }
        selectImplementation$doSelectSuspend$1.L$0 = null;
        selectImplementation$doSelectSuspend$1.label = 2;
        obj2 = selectImplementation.complete(selectImplementation$doSelectSuspend$1);
        if (obj2 != coroutine_suspended2) {
        }
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(kotlinx.coroutines.selects.SelectClause0 selectClause0, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1) {
        register$default(this, new kotlinx.coroutines.selects.SelectImplementation.ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), kotlinx.coroutines.selects.SelectKt.getPARAM_CLAUSE_0(), function1, selectClause0.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(kotlinx.coroutines.selects.SelectClause1<? extends Q> selectClause1, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        register$default(this, new kotlinx.coroutines.selects.SelectImplementation.ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, function2, selectClause1.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> selectClause2, P p, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        register$default(this, new kotlinx.coroutines.selects.SelectImplementation.ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p, function2, selectClause2.getOnCancellationConstructor()), false, 1, null);
    }

    public static /* synthetic */ void register$default(kotlinx.coroutines.selects.SelectImplementation selectImplementation, kotlinx.coroutines.selects.SelectImplementation.ClauseData clauseData, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        selectImplementation.register(clauseData, z);
    }

    public final void register(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData, boolean z) {
        kotlinx.coroutines.internal.Symbol symbol;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            java.lang.Object obj = state$volatile$FU.get(this);
            symbol = kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED;
            if (obj == symbol) {
                throw new java.lang.AssertionError();
            }
        }
        if (state$volatile$FU.get(this) instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData) {
            return;
        }
        if (!z) {
            checkClauseObject(clauseData.clauseObject);
        }
        if (clauseData.tryRegisterAsWaiter(this)) {
            if (!z) {
                java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.clauses;
                kotlin.jvm.internal.Intrinsics.checkNotNull(list);
                list.add(clauseData);
            }
            clauseData.disposableHandleOrSegment = this.disposableHandleOrSegment;
            clauseData.indexInSegment = this.indexInSegment;
            this.disposableHandleOrSegment = null;
            this.indexInSegment = -1;
            return;
        }
        state$volatile$FU.set(this, clauseData);
    }

    private final void checkClauseObject(java.lang.Object clauseObject) {
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.clauses;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return;
        }
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((kotlinx.coroutines.selects.SelectImplementation.ClauseData) it.next()).clauseObject == clauseObject) {
                throw new java.lang.IllegalStateException(("Cannot use select clauses on the same object: " + clauseObject).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(kotlinx.coroutines.DisposableHandle disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(java.lang.Object internalResult) {
        this.internalResult = internalResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reregisterClause(java.lang.Object clauseObject) {
        kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData findClause = findClause(clauseObject);
        kotlin.jvm.internal.Intrinsics.checkNotNull(findClause);
        findClause.disposableHandleOrSegment = null;
        findClause.indexInSegment = -1;
        register(findClause, true);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(java.lang.Object clauseObject, java.lang.Object result) {
        return trySelectInternal(clauseObject, result) == 0;
    }

    public final kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailed(java.lang.Object clauseObject, java.lang.Object result) {
        kotlinx.coroutines.selects.TrySelectDetailedResult TrySelectDetailedResult;
        TrySelectDetailedResult = kotlinx.coroutines.selects.SelectKt.TrySelectDetailedResult(trySelectInternal(clauseObject, result));
        return TrySelectDetailedResult;
    }

    private final int trySelectInternal(java.lang.Object clauseObject, java.lang.Object internalResult) {
        boolean tryResume;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        while (true) {
            java.lang.Object obj = state$volatile$FU.get(this);
            if (!(obj instanceof kotlinx.coroutines.CancellableContinuation)) {
                symbol2 = kotlinx.coroutines.selects.SelectKt.STATE_COMPLETED;
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, symbol2) || (obj instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData)) {
                    return 3;
                }
                symbol3 = kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED;
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, symbol3)) {
                    return 2;
                }
                symbol4 = kotlinx.coroutines.selects.SelectKt.STATE_REG;
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, symbol4)) {
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(state$volatile$FU, this, obj, kotlin.collections.CollectionsKt.listOf(clauseObject))) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof java.util.List)) {
                        throw new java.lang.IllegalStateException(("Unexpected state: " + obj).toString());
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(state$volatile$FU, this, obj, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.Object>) obj, clauseObject))) {
                        return 1;
                    }
                }
            } else {
                kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData findClause = findClause(clauseObject);
                if (findClause == null) {
                    continue;
                } else {
                    kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit> createOnCancellationAction = findClause.createOnCancellationAction(this, internalResult);
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(state$volatile$FU, this, obj, findClause)) {
                        this.internalResult = internalResult;
                        tryResume = kotlinx.coroutines.selects.SelectKt.tryResume((kotlinx.coroutines.CancellableContinuation) obj, createOnCancellationAction);
                        if (tryResume) {
                            return 0;
                        }
                        symbol = kotlinx.coroutines.selects.SelectKt.NO_RESULT;
                        this.internalResult = symbol;
                        return 2;
                    }
                }
            }
        }
    }

    private final kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData findClause(java.lang.Object clauseObject) {
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.clauses;
        java.lang.Object obj = null;
        if (list == null) {
            return null;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((kotlinx.coroutines.selects.SelectImplementation.ClauseData) next).clauseObject == clauseObject) {
                obj = next;
                break;
            }
        }
        kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) obj;
        if (clauseData != null) {
            return clauseData;
        }
        throw new java.lang.IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object complete(kotlin.coroutines.Continuation<? super R> continuation) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !isSelected()) {
            throw new java.lang.AssertionError();
        }
        java.lang.Object obj = state$volatile$FU.get(this);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) obj;
        java.lang.Object obj2 = this.internalResult;
        cleanup(clauseData);
        if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            return clauseData.invokeBlock(clauseData.processResult(obj2), continuation);
        }
        return processResultAndInvokeBlockRecoveringException(clauseData, obj2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData, java.lang.Object obj, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 selectImplementation$processResultAndInvokeBlockRecoveringException$1;
        int i;
        try {
            if (continuation instanceof kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1) {
                selectImplementation$processResultAndInvokeBlockRecoveringException$1 = (kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1) continuation;
                if ((selectImplementation$processResultAndInvokeBlockRecoveringException$1.label & Integer.MIN_VALUE) != 0) {
                    selectImplementation$processResultAndInvokeBlockRecoveringException$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj2 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = selectImplementation$processResultAndInvokeBlockRecoveringException$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        java.lang.Object processResult = clauseData.processResult(obj);
                        selectImplementation$processResultAndInvokeBlockRecoveringException$1.label = 1;
                        obj2 = clauseData.invokeBlock(processResult, selectImplementation$processResultAndInvokeBlockRecoveringException$1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return obj2;
                }
            }
            if (i != 0) {
            }
            return obj2;
        } catch (java.lang.Throwable th) {
            if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                throw th;
            }
            if (selectImplementation$processResultAndInvokeBlockRecoveringException$1 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
                throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th, selectImplementation$processResultAndInvokeBlockRecoveringException$1);
            }
            throw th;
        }
        selectImplementation$processResultAndInvokeBlockRecoveringException$1 = new kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1(this, continuation);
        java.lang.Object obj22 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectImplementation$processResultAndInvokeBlockRecoveringException$1.label;
    }

    private final void cleanup(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData selectedClause) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !kotlin.jvm.internal.Intrinsics.areEqual(state$volatile$FU.get(this), selectedClause)) {
            throw new java.lang.AssertionError();
        }
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        for (kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData : list) {
            if (clauseData != selectedClause) {
                clauseData.dispose();
            }
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        symbol = kotlinx.coroutines.selects.SelectKt.STATE_COMPLETED;
        atomicReferenceFieldUpdater.set(this, symbol);
        symbol2 = kotlinx.coroutines.selects.SelectKt.NO_RESULT;
        this.internalResult = symbol2;
        this.clauses = null;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(java.lang.Throwable cause) {
        java.lang.Object obj;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            symbol = kotlinx.coroutines.selects.SelectKt.STATE_COMPLETED;
            if (obj == symbol) {
                return;
            } else {
                symbol2 = kotlinx.coroutines.selects.SelectKt.STATE_CANCELLED;
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, symbol2));
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((kotlinx.coroutines.selects.SelectImplementation.ClauseData) it.next()).dispose();
        }
        symbol3 = kotlinx.coroutines.selects.SelectKt.NO_RESULT;
        this.internalResult = symbol3;
        this.clauses = null;
    }

    /* compiled from: Select.kt */
    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001BÆ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012U\u0010\u0003\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b\u0012U\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u000e\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012u\u0010\u0010\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u001a\u001a\u00020\u001b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u001f\u001a\u00028\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\nJ8\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001R\u0010\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R]\u0010\u0003\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R]\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u007f\u0010\u0010\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "clauseObject", "regFunc", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "processResFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "block", "onCancellationConstructor", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "<init>", "(Lkotlinx/coroutines/selects/SelectImplementation;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "disposableHandleOrSegment", "indexInSegment", "", "tryRegisterAsWaiter", "", "Lkotlinx/coroutines/selects/SelectImplementation;", "processResult", "result", "invokeBlock", "argument", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "createOnCancellationAction", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ClauseData {
        private final java.lang.Object block;
        public final java.lang.Object clauseObject;
        public java.lang.Object disposableHandleOrSegment;
        public int indexInSegment = -1;
        public final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit>> onCancellationConstructor;
        private final java.lang.Object param;
        private final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> processResFunc;
        private final kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> regFunc;

        /* JADX WARN: Multi-variable type inference failed */
        public ClauseData(java.lang.Object obj, kotlin.jvm.functions.Function3<java.lang.Object, ? super kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> function3, kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, ? extends java.lang.Object> function32, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, ? extends kotlin.jvm.functions.Function3<? super java.lang.Throwable, java.lang.Object, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>> function33) {
            this.clauseObject = obj;
            this.regFunc = function3;
            this.processResFunc = function32;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = function33;
        }

        public final boolean tryRegisterAsWaiter(kotlinx.coroutines.selects.SelectImplementation<R> select) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !select.getInRegistrationPhase() && !select.isCancelled()) {
                throw new java.lang.AssertionError();
            }
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = ((kotlinx.coroutines.selects.SelectImplementation) select).internalResult;
                symbol2 = kotlinx.coroutines.selects.SelectKt.NO_RESULT;
                if (obj != symbol2) {
                    throw new java.lang.AssertionError();
                }
            }
            this.regFunc.invoke(this.clauseObject, select, this.param);
            java.lang.Object obj2 = ((kotlinx.coroutines.selects.SelectImplementation) select).internalResult;
            symbol = kotlinx.coroutines.selects.SelectKt.NO_RESULT;
            return obj2 == symbol;
        }

        public final java.lang.Object processResult(java.lang.Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        public final java.lang.Object invokeBlock(java.lang.Object obj, kotlin.coroutines.Continuation<? super R> continuation) {
            java.lang.Object obj2 = this.block;
            if (this.param == kotlinx.coroutines.selects.SelectKt.getPARAM_CLAUSE_0()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((kotlin.jvm.functions.Function1) obj2).invoke(continuation);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((kotlin.jvm.functions.Function2) obj2).invoke(obj, continuation);
        }

        public final void dispose() {
            java.lang.Object obj = this.disposableHandleOrSegment;
            kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation = kotlinx.coroutines.selects.SelectImplementation.this;
            if (obj instanceof kotlinx.coroutines.internal.Segment) {
                ((kotlinx.coroutines.internal.Segment) obj).onCancellation(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            kotlinx.coroutines.DisposableHandle disposableHandle = obj instanceof kotlinx.coroutines.DisposableHandle ? (kotlinx.coroutines.DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }

        public final kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit> createOnCancellationAction(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object internalResult) {
            kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit>> function3 = this.onCancellationConstructor;
            if (function3 != null) {
                return function3.invoke(select, this.param, internalResult);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        r0 = r0.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object waitUntilSelected(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            symbol = kotlinx.coroutines.selects.SelectKt.STATE_REG;
            if (obj == symbol) {
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(state$volatile$FU, this, obj, cancellableContinuationImpl2)) {
                    kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(cancellableContinuationImpl2, this);
                    break;
                }
            } else if (obj instanceof java.util.List) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = state$volatile$FU;
                symbol2 = kotlinx.coroutines.selects.SelectKt.STATE_REG;
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, obj, symbol2)) {
                    java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
                    while (it.hasNext()) {
                        reregisterClause(it.next());
                    }
                }
            } else if (obj instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData) {
                cancellableContinuationImpl2.resume((kotlinx.coroutines.CancellableContinuationImpl) kotlin.Unit.INSTANCE, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuationImpl, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) ((kotlinx.coroutines.selects.SelectImplementation.ClauseData) obj).createOnCancellationAction(this, this.internalResult));
            } else {
                throw new java.lang.IllegalStateException(("unexpected state: " + obj).toString());
            }
        }
    }
}
