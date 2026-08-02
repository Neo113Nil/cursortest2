package kotlinx.coroutines.selects;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001IB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u001b\u001a\u00028\u0000H\u0091@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010\u001cJ0\u0010\u001e\u001a\u00020\u001f*\u00020 2\u001c\u0010!\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\r0\"H\u0096\u0002¢\u0006\u0002\u0010$JB\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0001\u0010%*\b\u0012\u0004\u0012\u0002H%0&2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\r0'H\u0096\u0002¢\u0006\u0002\u0010(JV\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0001\u0010)\"\u0004\b\u0002\u0010%*\u000e\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H%0*2\u0006\u0010+\u001a\u0002H)2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\r0'H\u0096\u0002¢\u0006\u0002\u0010,J \u0010-\u001a\u00020\u001f*\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010.\u001a\u00020\u000fH\u0001J\u0010\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\rH\u0002J\u0010\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u000203H\u0016J\u001c\u00104\u001a\u00020\u001f2\n\u00105\u001a\u0006\u0012\u0002\b\u0003062\u0006\u00107\u001a\u00020\u0019H\u0016J\u0012\u00108\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u00109\u001a\u00020\u001fH\u0082@¢\u0006\u0002\u0010\u001cJ\u0010\u0010:\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\rH\u0002J\u001a\u0010;\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010=\u001a\u00020>2\u0006\u00100\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\rJ\u001a\u0010?\u001a\u00020\u00192\u0006\u00100\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0002J\u001c\u0010@\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020\rH\u0002J\u000e\u0010A\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010\u001cJ*\u0010B\u001a\u00028\u00002\u0010\u0010C\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0002\u0010DJ\u001a\u0010E\u001a\u00020\u001f2\u0010\u0010F\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R \u0010\u0014\u001a\u0014\u0012\u000e\u0012\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "context", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "state", "Lkotlinx/atomicfu/AtomicRef;", "", "inRegistrationPhase", "", "getInRegistrationPhase", "()Z", "isSelected", "isCancelled", "clauses", "", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "disposableHandleOrSegment", "indexInSegment", "", "internalResult", "doSelect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doSelectSuspend", "invoke", "", "Lkotlinx/coroutines/selects/SelectClause0;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", com.visa.cbp.getEncExpo.updateVisuals, "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "register", "reregister", "checkClauseObject", "clauseObject", "disposeOnCompletion", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, "Lkotlinx/coroutines/internal/Segment;", "index", "selectInRegistrationPhase", "waitUntilSelected", "reregisterClause", "trySelect", "result", "trySelectDetailed", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "trySelectInternal", "findClause", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "processResultAndInvokeBlockRecoveringException", "clause", "(Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanup", "selectedClause", "cause", "", "ClauseData", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class SelectImplementation<R> implements kotlinx.coroutines.CancelHandler, kotlinx.coroutines.selects.SelectBuilder<R>, kotlinx.coroutines.selects.SelectInstanceInternal<R> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.selects.SelectImplementation.class, java.lang.Object.class, "state$volatile");
    private final kotlin.coroutines.CoroutineContext getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> getHighSpeedVideoFpsRangesFor;
    private java.lang.Object getHighSpeedVideoSizes;
    private java.lang.Object getInputFormats;
    private volatile /* synthetic */ java.lang.Object state$volatile;

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
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineContext;
        symbol = kotlinx.coroutines.selects.SelectKt.getHighResolutionOutputSizeshNQ4ISI;
        this.state$volatile = symbol;
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(2);
        this.getHighSpeedVideoFpsRanges = -1;
        symbol2 = kotlinx.coroutines.selects.SelectKt.getHighSpeedVideoFpsRangesFor;
        this.getInputFormats = symbol2;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: getContext, reason: from getter */
    public kotlin.coroutines.CoroutineContext getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        int i;
        kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation;
        if (continuation instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) continuation;
            if ((selectImplementation$doSelectSuspend$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = selectImplementation$doSelectSuspend$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = selectImplementation$doSelectSuspend$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    selectImplementation$doSelectSuspend$1.getHighSpeedVideoFpsRanges = this;
                    selectImplementation$doSelectSuspend$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (getHighSpeedVideoFpsRangesFor(selectImplementation$doSelectSuspend$1) != coroutine_suspended) {
                        selectImplementation = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                selectImplementation = (kotlinx.coroutines.selects.SelectImplementation) selectImplementation$doSelectSuspend$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                selectImplementation$doSelectSuspend$1.getHighSpeedVideoFpsRanges = null;
                selectImplementation$doSelectSuspend$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                java.lang.Object highResolutionOutputSizeshNQ4ISI = selectImplementation.getHighResolutionOutputSizeshNQ4ISI(selectImplementation$doSelectSuspend$1);
                return highResolutionOutputSizeshNQ4ISI != coroutine_suspended ? coroutine_suspended : highResolutionOutputSizeshNQ4ISI;
            }
        }
        selectImplementation$doSelectSuspend$1 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1(this, continuation);
        java.lang.Object obj2 = selectImplementation$doSelectSuspend$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectImplementation$doSelectSuspend$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        selectImplementation$doSelectSuspend$1.getHighSpeedVideoFpsRanges = null;
        selectImplementation$doSelectSuspend$1.getHighResolutionOutputSizeshNQ4ISI = 2;
        java.lang.Object highResolutionOutputSizeshNQ4ISI2 = selectImplementation.getHighResolutionOutputSizeshNQ4ISI(selectImplementation$doSelectSuspend$1);
        if (highResolutionOutputSizeshNQ4ISI2 != coroutine_suspended2) {
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
            java.lang.Object obj = Camera2StreamConfigurationMap.get(this);
            symbol = kotlinx.coroutines.selects.SelectKt.getHighSpeedVideoFpsRanges;
            if (obj == symbol) {
                throw new java.lang.AssertionError();
            }
        }
        if (Camera2StreamConfigurationMap.get(this) instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData) {
            return;
        }
        if (!z) {
            java.lang.Object obj2 = clauseData.clauseObject;
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list2 = list;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((kotlinx.coroutines.selects.SelectImplementation.ClauseData) it.next()).clauseObject == obj2) {
                        throw new java.lang.IllegalStateException("Cannot use select clauses on the same object: ".concat(java.lang.String.valueOf(obj2)).toString());
                    }
                }
            }
        }
        if (clauseData.tryRegisterAsWaiter(this)) {
            if (!z) {
                java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list3 = this.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(list3);
                list3.add(clauseData);
            }
            clauseData.disposableHandleOrSegment = this.getHighSpeedVideoSizes;
            clauseData.indexInSegment = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = -1;
            return;
        }
        Camera2StreamConfigurationMap.set(this, clauseData);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(kotlinx.coroutines.DisposableHandle disposableHandle) {
        this.getHighSpeedVideoSizes = disposableHandle;
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
        this.getHighSpeedVideoSizes = segment;
        this.getHighSpeedVideoFpsRanges = index;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(java.lang.Object internalResult) {
        this.getInputFormats = internalResult;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(java.lang.Object clauseObject, java.lang.Object result) {
        return getHighSpeedVideoFpsRanges(clauseObject, result) == 0;
    }

    public final kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailed(java.lang.Object clauseObject, java.lang.Object result) {
        return kotlinx.coroutines.selects.SelectKt.access$TrySelectDetailedResult(getHighSpeedVideoFpsRanges(clauseObject, result));
    }

    private final kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData getHighSpeedVideoSizes(java.lang.Object obj) {
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object obj2 = null;
        if (list == null) {
            return null;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((kotlinx.coroutines.selects.SelectImplementation.ClauseData) next).clauseObject == obj) {
                obj2 = next;
                break;
            }
        }
        kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) obj2;
        if (clauseData != null) {
            return clauseData;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Clause with object ");
        sb.append(obj);
        sb.append(" is not found");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super R> continuation) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(Camera2StreamConfigurationMap.get(this) instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData)) {
            throw new java.lang.AssertionError();
        }
        java.lang.Object obj = Camera2StreamConfigurationMap.get(this);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) obj;
        java.lang.Object obj2 = this.getInputFormats;
        getHighSpeedVideoFpsRanges(clauseData);
        if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            return clauseData.invokeBlock(clauseData.processResult(obj2), continuation);
        }
        return getHighSpeedVideoFpsRangesFor(clauseData, obj2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData, java.lang.Object obj, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 selectImplementation$processResultAndInvokeBlockRecoveringException$1;
        int i;
        try {
            if (continuation instanceof kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1) {
                selectImplementation$processResultAndInvokeBlockRecoveringException$1 = (kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1) continuation;
                if ((selectImplementation$processResultAndInvokeBlockRecoveringException$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    selectImplementation$processResultAndInvokeBlockRecoveringException$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj2 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = selectImplementation$processResultAndInvokeBlockRecoveringException$1.getHighSpeedVideoFpsRanges;
                    if (i == 0) {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return obj2;
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.lang.Object processResult = clauseData.processResult(obj);
                    selectImplementation$processResultAndInvokeBlockRecoveringException$1.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object invokeBlock = clauseData.invokeBlock(processResult, selectImplementation$processResultAndInvokeBlockRecoveringException$1);
                    return invokeBlock == coroutine_suspended ? coroutine_suspended : invokeBlock;
                }
            }
            if (i == 0) {
            }
        } catch (java.lang.Throwable th) {
            if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                throw th;
            }
            if (selectImplementation$processResultAndInvokeBlockRecoveringException$1 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
                throw kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(th, selectImplementation$processResultAndInvokeBlockRecoveringException$1);
            }
            throw th;
        }
        selectImplementation$processResultAndInvokeBlockRecoveringException$1 = new kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1(this, continuation);
        java.lang.Object obj22 = selectImplementation$processResultAndInvokeBlockRecoveringException$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectImplementation$processResultAndInvokeBlockRecoveringException$1.getHighSpeedVideoFpsRanges;
    }

    private final void getHighSpeedVideoFpsRanges(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !kotlin.jvm.internal.Intrinsics.areEqual(Camera2StreamConfigurationMap.get(this), clauseData)) {
            throw new java.lang.AssertionError();
        }
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.getHighSpeedVideoFpsRangesFor;
        if (list == null) {
            return;
        }
        for (kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData clauseData2 : list) {
            if (clauseData2 != clauseData) {
                clauseData2.dispose();
            }
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Camera2StreamConfigurationMap;
        symbol = kotlinx.coroutines.selects.SelectKt.Camera2StreamConfigurationMap;
        atomicReferenceFieldUpdater.set(this, symbol);
        symbol2 = kotlinx.coroutines.selects.SelectKt.getHighSpeedVideoFpsRangesFor;
        this.getInputFormats = symbol2;
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001Bì\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00127\u0010\b\u001a3\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u0004\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007\u00127\u0010\n\u001a3\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u0004\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012W\u0010\u0010\u001aS\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u0004\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u0004\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u0004\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\u0002\u0010#RE\u0010&\u001a3\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u0004\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%RE\u0010'\u001a3\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u0004\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#R\u0014\u0010$\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#Rb\u0010\u0010\u001aS\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0005¢\u0006\u0002\b\u0004\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u0004\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u0004\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000f8\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b*\u0010#R\u0016\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "Lkotlinx/coroutines/selects/SelectInstance;", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "param", "block", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Lkotlinx/coroutines/selects/SelectImplementation;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "Lkotlinx/coroutines/selects/SelectImplementation;", "select", "", "tryRegisterAsWaiter", "(Lkotlinx/coroutines/selects/SelectImplementation;)Z", "result", "processResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "invokeBlock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "()V", "internalResult", "createOnCancellationAction", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)Lkotlin/jvm/functions/Function3;", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function3;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "disposableHandleOrSegment", "", "indexInSegment", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ClauseData {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function3<java.lang.Object, kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        public final java.lang.Object clauseObject;
        public java.lang.Object disposableHandleOrSegment;
        private final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.Object Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.Object getHighSpeedVideoFpsRanges;
        public int indexInSegment = -1;
        public final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit>> onCancellationConstructor;

        /* JADX WARN: Multi-variable type inference failed */
        public ClauseData(java.lang.Object obj, kotlin.jvm.functions.Function3<java.lang.Object, ? super kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, kotlin.Unit> function3, kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, ? extends java.lang.Object> function32, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, ? extends kotlin.jvm.functions.Function3<? super java.lang.Throwable, java.lang.Object, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>> function33) {
            this.clauseObject = obj;
            this.getHighSpeedVideoFpsRangesFor = function3;
            this.getHighResolutionOutputSizeshNQ4ISI = function32;
            this.getHighSpeedVideoFpsRanges = obj2;
            this.Camera2StreamConfigurationMap = obj3;
            this.onCancellationConstructor = function33;
        }

        public final boolean tryRegisterAsWaiter(kotlinx.coroutines.selects.SelectImplementation<R> select) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !kotlinx.coroutines.selects.SelectImplementation.access$getInRegistrationPhase(select) && !kotlinx.coroutines.selects.SelectImplementation.access$isCancelled(select)) {
                throw new java.lang.AssertionError();
            }
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = ((kotlinx.coroutines.selects.SelectImplementation) select).getInputFormats;
                symbol2 = kotlinx.coroutines.selects.SelectKt.getHighSpeedVideoFpsRangesFor;
                if (obj != symbol2) {
                    throw new java.lang.AssertionError();
                }
            }
            this.getHighSpeedVideoFpsRangesFor.invoke(this.clauseObject, select, this.getHighSpeedVideoFpsRanges);
            java.lang.Object obj2 = ((kotlinx.coroutines.selects.SelectImplementation) select).getInputFormats;
            symbol = kotlinx.coroutines.selects.SelectKt.getHighSpeedVideoFpsRangesFor;
            return obj2 == symbol;
        }

        public final java.lang.Object processResult(java.lang.Object result) {
            return this.getHighResolutionOutputSizeshNQ4ISI.invoke(this.clauseObject, this.getHighSpeedVideoFpsRanges, result);
        }

        public final java.lang.Object invokeBlock(java.lang.Object obj, kotlin.coroutines.Continuation<? super R> continuation) {
            java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
            if (this.getHighSpeedVideoFpsRanges == kotlinx.coroutines.selects.SelectKt.getPARAM_CLAUSE_0()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                return ((kotlin.jvm.functions.Function1) obj2).invoke(continuation);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            return ((kotlin.jvm.functions.Function2) obj2).invoke(obj, continuation);
        }

        public final void dispose() {
            java.lang.Object obj = this.disposableHandleOrSegment;
            kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation = kotlinx.coroutines.selects.SelectImplementation.this;
            if (obj instanceof kotlinx.coroutines.internal.Segment) {
                ((kotlinx.coroutines.internal.Segment) obj).onCancellation(this.indexInSegment, null, selectImplementation.getGetHighResolutionOutputSizeshNQ4ISI());
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
                return function3.invoke(select, this.getHighSpeedVideoFpsRanges, internalResult);
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
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Camera2StreamConfigurationMap;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            symbol = kotlinx.coroutines.selects.SelectKt.getHighResolutionOutputSizeshNQ4ISI;
            if (obj != symbol) {
                if (!(obj instanceof java.util.List)) {
                    if (obj instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData) {
                        cancellableContinuationImpl2.resume((kotlinx.coroutines.CancellableContinuationImpl) kotlin.Unit.INSTANCE, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuationImpl, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) ((kotlinx.coroutines.selects.SelectImplementation.ClauseData) obj).createOnCancellationAction(this, this.getInputFormats));
                    } else {
                        throw new java.lang.IllegalStateException("unexpected state: ".concat(java.lang.String.valueOf(obj)).toString());
                    }
                } else {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Camera2StreamConfigurationMap;
                    symbol2 = kotlinx.coroutines.selects.SelectKt.getHighResolutionOutputSizeshNQ4ISI;
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, obj, symbol2)) {
                        java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
                        while (it.hasNext()) {
                            access$reregisterClause(this, it.next());
                        }
                    }
                }
            } else if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, this, obj, cancellableContinuationImpl2)) {
                kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(cancellableContinuationImpl2, this);
                break;
            }
        }
    }

    public static final /* synthetic */ boolean access$getInRegistrationPhase(kotlinx.coroutines.selects.SelectImplementation selectImplementation) {
        kotlinx.coroutines.internal.Symbol symbol;
        java.lang.Object obj = Camera2StreamConfigurationMap.get(selectImplementation);
        symbol = kotlinx.coroutines.selects.SelectKt.getHighResolutionOutputSizeshNQ4ISI;
        return obj == symbol || (obj instanceof java.util.List);
    }

    public static final /* synthetic */ boolean access$isCancelled(kotlinx.coroutines.selects.SelectImplementation selectImplementation) {
        kotlinx.coroutines.internal.Symbol symbol;
        java.lang.Object obj = Camera2StreamConfigurationMap.get(selectImplementation);
        symbol = kotlinx.coroutines.selects.SelectKt.getHighSpeedVideoFpsRanges;
        return obj == symbol;
    }

    public static final /* synthetic */ void access$reregisterClause(kotlinx.coroutines.selects.SelectImplementation selectImplementation, java.lang.Object obj) {
        kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData highSpeedVideoSizes = selectImplementation.getHighSpeedVideoSizes(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes);
        highSpeedVideoSizes.disposableHandleOrSegment = null;
        highSpeedVideoSizes.indexInSegment = -1;
        selectImplementation.register(highSpeedVideoSizes, true);
    }

    private final int getHighSpeedVideoFpsRanges(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Camera2StreamConfigurationMap;
            java.lang.Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof kotlinx.coroutines.CancellableContinuation)) {
                symbol2 = kotlinx.coroutines.selects.SelectKt.Camera2StreamConfigurationMap;
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj3, symbol2) || (obj3 instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData)) {
                    return 3;
                }
                symbol3 = kotlinx.coroutines.selects.SelectKt.getHighSpeedVideoFpsRanges;
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj3, symbol3)) {
                    return 2;
                }
                symbol4 = kotlinx.coroutines.selects.SelectKt.getHighResolutionOutputSizeshNQ4ISI;
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj3, symbol4)) {
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj3, kotlin.collections.CollectionsKt.listOf(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof java.util.List)) {
                        throw new java.lang.IllegalStateException("Unexpected state: ".concat(java.lang.String.valueOf(obj3)).toString());
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj3, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.Object>) obj3, obj))) {
                        return 1;
                    }
                }
            } else {
                kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData highSpeedVideoSizes = getHighSpeedVideoSizes(obj);
                if (highSpeedVideoSizes != null) {
                    kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.Unit> createOnCancellationAction = highSpeedVideoSizes.createOnCancellationAction(this, obj2);
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj3, highSpeedVideoSizes)) {
                        this.getInputFormats = obj2;
                        if (kotlinx.coroutines.selects.SelectKt.access$tryResume((kotlinx.coroutines.CancellableContinuation) obj3, createOnCancellationAction)) {
                            return 0;
                        }
                        symbol = kotlinx.coroutines.selects.SelectKt.getHighSpeedVideoFpsRangesFor;
                        this.getInputFormats = symbol;
                        return 2;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public java.lang.Object doSelect(kotlin.coroutines.Continuation<? super R> continuation) {
        if (Camera2StreamConfigurationMap.get(this) instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData) {
            return getHighResolutionOutputSizeshNQ4ISI(continuation);
        }
        return getHighSpeedVideoFpsRanges(continuation);
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(java.lang.Throwable cause) {
        java.lang.Object obj;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Camera2StreamConfigurationMap;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            symbol = kotlinx.coroutines.selects.SelectKt.Camera2StreamConfigurationMap;
            if (obj == symbol) {
                return;
            } else {
                symbol2 = kotlinx.coroutines.selects.SelectKt.getHighSpeedVideoFpsRanges;
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, symbol2));
        java.util.List<kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData> list = this.getHighSpeedVideoFpsRangesFor;
        if (list == null) {
            return;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((kotlinx.coroutines.selects.SelectImplementation.ClauseData) it.next()).dispose();
        }
        symbol3 = kotlinx.coroutines.selects.SelectKt.getHighSpeedVideoFpsRangesFor;
        this.getInputFormats = symbol3;
        this.getHighSpeedVideoFpsRangesFor = null;
    }
}
