package androidx.compose.ui.input.nestedscroll;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR*\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010!8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0016\u00103\u001a\u0004\u0018\u0001008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u00102"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchPreScroll-OzD1aCk", "(JI)J", "dispatchPreScroll", "consumed", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPostScroll", "Landroidx/compose/ui/unit/Velocity;", "dispatchPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPreFling", "dispatchPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPostFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "nestedScrollNode", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getNestedScrollNode$ui", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setNestedScrollNode$ui", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "lastKnownParentNode", "getLastKnownParentNode$ui", "setLastKnownParentNode$ui", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "calculateNestedScrollScope", "Lkotlin/jvm/functions/Function0;", "getCalculateNestedScrollScope$ui", "()Lkotlin/jvm/functions/Function0;", "setCalculateNestedScrollScope$ui", "(Lkotlin/jvm/functions/Function0;)V", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "getScope$ui", "()Lkotlinx/coroutines/CoroutineScope;", "setScope$ui", "(Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope", "coroutineScope", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parent"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.CoroutineScope> calculateNestedScrollScope = new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.CoroutineScope invoke() {
            return androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.this.getScope();
        }

        {
            super(0);
        }
    };
    private androidx.compose.ui.input.nestedscroll.NestedScrollNode lastKnownParentNode;
    private androidx.compose.ui.input.nestedscroll.NestedScrollNode nestedScrollNode;
    private kotlinx.coroutines.CoroutineScope scope;

    /* renamed from: getNestedScrollNode$ui, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollNode getNestedScrollNode() {
        return this.nestedScrollNode;
    }

    public final void setNestedScrollNode$ui(androidx.compose.ui.input.nestedscroll.NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    /* renamed from: getLastKnownParentNode$ui, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollNode getLastKnownParentNode() {
        return this.lastKnownParentNode;
    }

    public final void setLastKnownParentNode$ui(androidx.compose.ui.input.nestedscroll.NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope> getCalculateNestedScrollScope$ui() {
        return this.calculateNestedScrollScope;
    }

    public final void setCalculateNestedScrollScope$ui(kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.CoroutineScope> function0) {
        this.calculateNestedScrollScope = function0;
    }

    /* renamed from: getScope$ui, reason: from getter */
    public final kotlinx.coroutines.CoroutineScope getScope() {
        return this.scope;
    }

    public final void setScope$ui(kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        kotlinx.coroutines.CoroutineScope invoke = this.calculateNestedScrollScope.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new java.lang.IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getParent$ui() {
        androidx.compose.ui.input.nestedscroll.NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        return nestedScrollNode != null ? nestedScrollNode.getParentNestedScrollNode$ui() : null;
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m7110dispatchPreScrollOzD1aCk(long available, int source) {
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection parent$ui = getParent$ui();
        return parent$ui != null ? parent$ui.mo1754onPreScrollOzD1aCk(available, source) : androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m7108dispatchPostScrollDzOQY0M(long consumed, long available, int source) {
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection parent$ui = getParent$ui();
        return parent$ui != null ? parent$ui.mo1529onPostScrollDzOQY0M(consumed, available, source) : androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m7109dispatchPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        int i;
        long m8850getZero9UxMQ8M;
        if (continuation instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) continuation;
            if ((nestedScrollDispatcher$dispatchPreFling$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = nestedScrollDispatcher$dispatchPreFling$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollDispatcher$dispatchPreFling$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.nestedscroll.NestedScrollConnection parent$ui = getParent$ui();
                    if (parent$ui == null) {
                        m8850getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
                        return androidx.compose.ui.unit.Velocity.m8830boximpl(m8850getZero9UxMQ8M);
                    }
                    nestedScrollDispatcher$dispatchPreFling$1.Camera2StreamConfigurationMap = 1;
                    obj = parent$ui.mo1753onPreFlingQWom1Mo(j, nestedScrollDispatcher$dispatchPreFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                m8850getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
                return androidx.compose.ui.unit.Velocity.m8830boximpl(m8850getZero9UxMQ8M);
            }
        }
        nestedScrollDispatcher$dispatchPreFling$1 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1(this, continuation);
        java.lang.Object obj2 = nestedScrollDispatcher$dispatchPreFling$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollDispatcher$dispatchPreFling$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        m8850getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj2).getGetHighSpeedVideoSizes();
        return androidx.compose.ui.unit.Velocity.m8830boximpl(m8850getZero9UxMQ8M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r12 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r12 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m7107dispatchPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        int i;
        long m8850getZero9UxMQ8M;
        if (continuation instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) continuation;
            if ((nestedScrollDispatcher$dispatchPostFling$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.getHighSpeedVideoSizes -= 2147483648;
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$12 = nestedScrollDispatcher$dispatchPostFling$1;
                java.lang.Object obj = nestedScrollDispatcher$dispatchPostFling$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollDispatcher$dispatchPostFling$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (getParent$ui() == null) {
                        androidx.compose.ui.input.nestedscroll.NestedScrollNode nestedScrollNode = this.lastKnownParentNode;
                        if (nestedScrollNode != null) {
                            nestedScrollDispatcher$dispatchPostFling$12.getHighSpeedVideoSizes = 1;
                            obj = nestedScrollNode.mo1528onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                        } else {
                            m8850getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
                        }
                    } else {
                        androidx.compose.ui.input.nestedscroll.NestedScrollConnection parent$ui = getParent$ui();
                        if (parent$ui != null) {
                            nestedScrollDispatcher$dispatchPostFling$12.getHighSpeedVideoSizes = 2;
                            obj = parent$ui.mo1528onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                        } else {
                            m8850getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
                        }
                    }
                } else if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    m8850getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    m8850getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(m8850getZero9UxMQ8M);
            }
        }
        nestedScrollDispatcher$dispatchPostFling$1 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1(this, continuation);
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$122 = nestedScrollDispatcher$dispatchPostFling$1;
        java.lang.Object obj2 = nestedScrollDispatcher$dispatchPostFling$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollDispatcher$dispatchPostFling$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(m8850getZero9UxMQ8M);
    }
}
