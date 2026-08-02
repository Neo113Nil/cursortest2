package androidx.compose.ui.input.nestedscroll;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010 J!\u0010$\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b$\u0010\bR\"\u0010\u0004\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010*R$\u0010+\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00102\u001a\u0004\u0018\u00010\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010'R\u001a\u00105\u001a\u0002048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u00103\u001a\u0002098CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/Modifier$Node;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "<init>", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "Landroidx/compose/ui/geometry/Offset;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "onAttach", "()V", "onDetach", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "updateNode$ui", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "lastKnownParentNode", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getLastKnownParentNode$ui", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setLastKnownParentNode$ui", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "getParentNestedScrollNode$ui", "parentNestedScrollNode", "getHighSpeedVideoSizes", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "Camera2StreamConfigurationMap", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NestedScrollNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode, androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    public static final int $stable = 8;
    private androidx.compose.ui.input.nestedscroll.NestedScrollConnection connection;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher getHighSpeedVideoFpsRanges;
    private androidx.compose.ui.input.nestedscroll.NestedScrollNode lastKnownParentNode;
    private final java.lang.Object traverseKey;

    public NestedScrollNode(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.getHighSpeedVideoFpsRanges = nestedScrollDispatcher == null ? new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher() : nestedScrollDispatcher;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final void setConnection(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    /* renamed from: getLastKnownParentNode$ui, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollNode getLastKnownParentNode() {
        return this.lastKnownParentNode;
    }

    public final void setLastKnownParentNode$ui(androidx.compose.ui.input.nestedscroll.NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final androidx.compose.ui.input.nestedscroll.NestedScrollNode getParentNestedScrollNode$ui() {
        if (getIsAttached()) {
            return (androidx.compose.ui.input.nestedscroll.NestedScrollNode) androidx.compose.ui.node.TraversableNodeKt.findNearestAncestor(this);
        }
        return null;
    }

    private final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getHighSpeedVideoSizes() {
        if (getIsAttached()) {
            return getParentNestedScrollNode$ui();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap() {
        androidx.compose.ui.input.nestedscroll.NestedScrollNode parentNestedScrollNode$ui = getParentNestedScrollNode$ui();
        kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap = parentNestedScrollNode$ui != null ? parentNestedScrollNode$ui.Camera2StreamConfigurationMap() : null;
        if (Camera2StreamConfigurationMap != null && kotlinx.coroutines.CoroutineScopeKt.isActive(Camera2StreamConfigurationMap)) {
            return Camera2StreamConfigurationMap;
        }
        kotlinx.coroutines.CoroutineScope scope = this.getHighSpeedVideoFpsRanges.getScope();
        if (scope != null) {
            return scope;
        }
        throw new java.lang.IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo1754onPreScrollOzD1aCk(long available, int source) {
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection highSpeedVideoSizes = getHighSpeedVideoSizes();
        long mo1754onPreScrollOzD1aCk = highSpeedVideoSizes != null ? highSpeedVideoSizes.mo1754onPreScrollOzD1aCk(available, source) : androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(mo1754onPreScrollOzD1aCk, this.connection.mo1754onPreScrollOzD1aCk(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(available, mo1754onPreScrollOzD1aCk), source));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
        long m5768getZeroF1C5BW0;
        long mo1529onPostScrollDzOQY0M = this.connection.mo1529onPostScrollDzOQY0M(consumed, available, source);
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes != null) {
            m5768getZeroF1C5BW0 = highSpeedVideoSizes.mo1529onPostScrollDzOQY0M(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(consumed, mo1529onPostScrollDzOQY0M), androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(available, mo1529onPostScrollDzOQY0M), source);
        } else {
            m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(mo1529onPostScrollDzOQY0M, m5768getZeroF1C5BW0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        long m8850getZero9UxMQ8M;
        long j2;
        if (continuation instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) continuation;
            if ((nestedScrollNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                obj = nestedScrollNode$onPreFling$1.getHighSpeedVideoFpsRanges;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.nestedscroll.NestedScrollConnection highSpeedVideoSizes = getHighSpeedVideoSizes();
                    if (highSpeedVideoSizes == null) {
                        m8850getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
                        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection = this.connection;
                        long m8842minusAH228Gc = androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j, m8850getZero9UxMQ8M);
                        nestedScrollNode$onPreFling$1.getHighSpeedVideoFpsRangesFor = m8850getZero9UxMQ8M;
                        nestedScrollNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                        obj = nestedScrollConnection.mo1753onPreFlingQWom1Mo(m8842minusAH228Gc, nestedScrollNode$onPreFling$1);
                        if (obj != coroutine_suspended) {
                            j2 = m8850getZero9UxMQ8M;
                            return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.m8843plusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes()));
                        }
                        return coroutine_suspended;
                    }
                    nestedScrollNode$onPreFling$1.getHighSpeedVideoFpsRangesFor = j;
                    nestedScrollNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = highSpeedVideoSizes.mo1753onPreFlingQWom1Mo(j, nestedScrollNode$onPreFling$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j2 = nestedScrollNode$onPreFling$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.m8843plusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes()));
                    }
                    j = nestedScrollNode$onPreFling$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                m8850getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
                androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection2 = this.connection;
                long m8842minusAH228Gc2 = androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j, m8850getZero9UxMQ8M);
                nestedScrollNode$onPreFling$1.getHighSpeedVideoFpsRangesFor = m8850getZero9UxMQ8M;
                nestedScrollNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                obj = nestedScrollConnection2.mo1753onPreFlingQWom1Mo(m8842minusAH228Gc2, nestedScrollNode$onPreFling$1);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        nestedScrollNode$onPreFling$1 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1(this, continuation);
        obj = nestedScrollNode$onPreFling$1.getHighSpeedVideoFpsRanges;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        m8850getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection22 = this.connection;
        long m8842minusAH228Gc22 = androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j, m8850getZero9UxMQ8M);
        nestedScrollNode$onPreFling$1.getHighSpeedVideoFpsRangesFor = m8850getZero9UxMQ8M;
        nestedScrollNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI = 2;
        obj = nestedScrollConnection22.mo1753onPreFlingQWom1Mo(m8842minusAH228Gc22, nestedScrollNode$onPreFling$1);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r1 != r9) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        int i;
        long j3;
        long j4;
        long getHighSpeedVideoSizes;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection highSpeedVideoSizes;
        long m8850getZero9UxMQ8M;
        long j5;
        if (continuation instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) continuation;
            if ((nestedScrollNode$onPostFling$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = nestedScrollNode$onPostFling$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollNode$onPostFling$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection = this.connection;
                    j3 = j;
                    nestedScrollNode$onPostFling$1.getHighResolutionOutputSizeshNQ4ISI = j3;
                    j4 = j2;
                    nestedScrollNode$onPostFling$1.getHighSpeedVideoSizes = j4;
                    nestedScrollNode$onPostFling$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = nestedScrollConnection.mo1528onPostFlingRZ2iAVY(j, j2, nestedScrollNode$onPostFling$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j5 = nestedScrollNode$onPostFling$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        m8850getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
                        getHighSpeedVideoSizes = j5;
                        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.m8843plusAH228Gc(getHighSpeedVideoSizes, m8850getZero9UxMQ8M));
                    }
                    long j6 = nestedScrollNode$onPostFling$1.getHighSpeedVideoSizes;
                    long j7 = nestedScrollNode$onPostFling$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    j4 = j6;
                    j3 = j7;
                }
                getHighSpeedVideoSizes = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
                highSpeedVideoSizes = !getIsAttached() ? getHighSpeedVideoSizes() : this.lastKnownParentNode;
                if (highSpeedVideoSizes == null) {
                    long m8843plusAH228Gc = androidx.compose.ui.unit.Velocity.m8843plusAH228Gc(j3, getHighSpeedVideoSizes);
                    long m8842minusAH228Gc = androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j4, getHighSpeedVideoSizes);
                    nestedScrollNode$onPostFling$1.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes;
                    nestedScrollNode$onPostFling$1.getHighSpeedVideoFpsRangesFor = 2;
                    obj = highSpeedVideoSizes.mo1528onPostFlingRZ2iAVY(m8843plusAH228Gc, m8842minusAH228Gc, nestedScrollNode$onPostFling$1);
                    if (obj != coroutine_suspended) {
                        j5 = getHighSpeedVideoSizes;
                        m8850getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
                        getHighSpeedVideoSizes = j5;
                        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.m8843plusAH228Gc(getHighSpeedVideoSizes, m8850getZero9UxMQ8M));
                    }
                    return coroutine_suspended;
                }
                m8850getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
                return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.m8843plusAH228Gc(getHighSpeedVideoSizes, m8850getZero9UxMQ8M));
            }
        }
        nestedScrollNode$onPostFling$1 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1(this, continuation);
        java.lang.Object obj2 = nestedScrollNode$onPostFling$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollNode$onPostFling$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        getHighSpeedVideoSizes = ((androidx.compose.ui.unit.Velocity) obj2).getGetHighSpeedVideoSizes();
        highSpeedVideoSizes = !getIsAttached() ? getHighSpeedVideoSizes() : this.lastKnownParentNode;
        if (highSpeedVideoSizes == null) {
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher p0) {
        getHighSpeedVideoFpsRanges();
        if (p0 == null) {
            this.getHighSpeedVideoFpsRanges = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher();
        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(p0, this.getHighSpeedVideoFpsRanges)) {
            this.getHighSpeedVideoFpsRanges = p0;
        }
        if (getIsAttached()) {
            getHighSpeedVideoFpsRangesFor();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.node.TraversableNode highSpeedVideoFpsRanges;
        highSpeedVideoFpsRanges = androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.getHighSpeedVideoFpsRanges(this);
        androidx.compose.ui.input.nestedscroll.NestedScrollNode nestedScrollNode = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) highSpeedVideoFpsRanges;
        this.lastKnownParentNode = nestedScrollNode;
        this.getHighSpeedVideoFpsRanges.setLastKnownParentNode$ui(nestedScrollNode);
        getHighSpeedVideoFpsRanges();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        this.getHighSpeedVideoFpsRanges.setNestedScrollNode$ui(this);
        this.getHighSpeedVideoFpsRanges.setLastKnownParentNode$ui(null);
        this.lastKnownParentNode = null;
        this.getHighSpeedVideoFpsRanges.setCalculateNestedScrollScope$ui(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode$updateDispatcherFields$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final kotlinx.coroutines.CoroutineScope invoke() {
                kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.ui.input.nestedscroll.NestedScrollNode.this.Camera2StreamConfigurationMap();
                return Camera2StreamConfigurationMap;
            }

            {
                super(0);
            }
        });
        this.getHighSpeedVideoFpsRanges.setScope$ui(getCoroutineScope());
    }

    private final void getHighSpeedVideoFpsRanges() {
        if (this.getHighSpeedVideoFpsRanges.getNestedScrollNode() == this) {
            this.getHighSpeedVideoFpsRanges.setNestedScrollNode$ui(null);
        }
    }

    public final void updateNode$ui(androidx.compose.ui.input.nestedscroll.NestedScrollConnection connection, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher dispatcher) {
        this.connection = connection;
        getHighResolutionOutputSizeshNQ4ISI(dispatcher);
    }
}
