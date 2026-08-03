package androidx.compose.ui.input.nestedscroll;

/* compiled from: NestedScrollNode.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J#\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J*\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020%2\u0006\u0010!\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\"\u0010-\u001a\u00020%2\u0006\u0010!\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\b\u00100\u001a\u00020\u001cH\u0002J\u0012\u00101\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u00103\u001a\u00020\u001cH\u0002J\u001f\u00104\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b5R\u001a\u0010\u0005\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/Modifier$Node;", "connection", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "nestedCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getNestedCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "parentConnection", "getParentConnection", "parentModifierLocal", "getParentModifierLocal", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "resolvedDispatcher", "onAttach", "", "onDetach", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "resetDispatcherFields", "updateDispatcher", "newDispatcher", "updateDispatcherFields", "updateNode", "updateNode$ui_release", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NestedScrollNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.ui.node.DelegatableNode {
    public static final int $stable = 8;
    private androidx.compose.ui.input.nestedscroll.NestedScrollConnection connection;
    private final androidx.compose.ui.modifier.ModifierLocalMap providedValues;
    private androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher resolvedDispatcher;

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ java.lang.Object getCurrent(androidx.compose.ui.modifier.ModifierLocal modifierLocal) {
        return androidx.compose.ui.modifier.ModifierLocalModifierNode.CC.$default$getCurrent(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(androidx.compose.ui.modifier.ModifierLocal modifierLocal, java.lang.Object obj) {
        androidx.compose.ui.modifier.ModifierLocalModifierNode.CC.$default$provide(this, modifierLocal, obj);
    }

    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final void setConnection(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    public NestedScrollNode(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher() : nestedScrollDispatcher;
        this.providedValues = androidx.compose.ui.modifier.ModifierLocalModifierNodeKt.modifierLocalMapOf(kotlin.TuplesKt.to(androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.getModifierLocalNestedScroll(), this));
    }

    private final androidx.compose.ui.input.nestedscroll.NestedScrollNode getParentModifierLocal() {
        if (getIsAttached()) {
            return (androidx.compose.ui.input.nestedscroll.NestedScrollNode) getCurrent(androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    private final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getParentConnection() {
        if (getIsAttached()) {
            return (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) getCurrent(androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.CoroutineScope getNestedCoroutineScope() {
        kotlinx.coroutines.CoroutineScope scope;
        androidx.compose.ui.input.nestedscroll.NestedScrollNode parentModifierLocal = getParentModifierLocal();
        if ((parentModifierLocal == null || (scope = parentModifierLocal.getNestedCoroutineScope()) == null) && (scope = this.resolvedDispatcher.getScope()) == null) {
            throw new java.lang.IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return scope;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo404onPreScrollOzD1aCk(long available, int source) {
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection parentConnection = getParentConnection();
        long mo404onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo404onPreScrollOzD1aCk(available, source) : androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        return androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(mo404onPreScrollOzD1aCk, this.connection.mo404onPreScrollOzD1aCk(androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(available, mo404onPreScrollOzD1aCk), source));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo402onPostScrollDzOQY0M(long consumed, long available, int source) {
        long m1887getZeroF1C5BW0;
        long mo402onPostScrollDzOQY0M = this.connection.mo402onPostScrollDzOQY0M(consumed, available, source);
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection parentConnection = getParentConnection();
        if (parentConnection != null) {
            m1887getZeroF1C5BW0 = parentConnection.mo402onPostScrollDzOQY0M(androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(consumed, mo402onPostScrollDzOQY0M), androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(available, mo402onPostScrollDzOQY0M), source);
        } else {
            m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        }
        return androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(mo402onPostScrollDzOQY0M, m1887getZeroF1C5BW0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object mo403onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        long m4728getZero9UxMQ8M;
        androidx.compose.ui.input.nestedscroll.NestedScrollNode nestedScrollNode;
        long j2;
        if (continuation instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) continuation;
            if ((nestedScrollNode$onPreFling$1.label & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPreFling$1.label -= Integer.MIN_VALUE;
                obj = nestedScrollNode$onPreFling$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollNode$onPreFling$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.nestedscroll.NestedScrollConnection parentConnection = getParentConnection();
                    if (parentConnection == null) {
                        m4728getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M();
                        nestedScrollNode = this;
                        long j3 = j;
                        j2 = m4728getZero9UxMQ8M;
                        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection = nestedScrollNode.connection;
                        long m4720minusAH228Gc = androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j3, j2);
                        nestedScrollNode$onPreFling$1.L$0 = null;
                        nestedScrollNode$onPreFling$1.J$0 = j2;
                        nestedScrollNode$onPreFling$1.label = 2;
                        obj = nestedScrollConnection.mo403onPreFlingQWom1Mo(m4720minusAH228Gc, nestedScrollNode$onPreFling$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.m4721plusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) obj).getPackedValue()));
                    }
                    nestedScrollNode$onPreFling$1.L$0 = this;
                    nestedScrollNode$onPreFling$1.J$0 = j;
                    nestedScrollNode$onPreFling$1.label = 1;
                    obj = parentConnection.mo403onPreFlingQWom1Mo(j, nestedScrollNode$onPreFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    nestedScrollNode = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j2 = nestedScrollNode$onPreFling$1.J$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.m4721plusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) obj).getPackedValue()));
                    }
                    j = nestedScrollNode$onPreFling$1.J$0;
                    nestedScrollNode = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) nestedScrollNode$onPreFling$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                m4728getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getPackedValue();
                long j32 = j;
                j2 = m4728getZero9UxMQ8M;
                androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection2 = nestedScrollNode.connection;
                long m4720minusAH228Gc2 = androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j32, j2);
                nestedScrollNode$onPreFling$1.L$0 = null;
                nestedScrollNode$onPreFling$1.J$0 = j2;
                nestedScrollNode$onPreFling$1.label = 2;
                obj = nestedScrollConnection2.mo403onPreFlingQWom1Mo(m4720minusAH228Gc2, nestedScrollNode$onPreFling$1);
                if (obj == coroutine_suspended) {
                }
                return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.m4721plusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) obj).getPackedValue()));
            }
        }
        nestedScrollNode$onPreFling$1 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1(this, continuation);
        obj = nestedScrollNode$onPreFling$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollNode$onPreFling$1.label;
        if (i != 0) {
        }
        m4728getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getPackedValue();
        long j322 = j;
        j2 = m4728getZero9UxMQ8M;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection22 = nestedScrollNode.connection;
        long m4720minusAH228Gc22 = androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j322, j2);
        nestedScrollNode$onPreFling$1.L$0 = null;
        nestedScrollNode$onPreFling$1.J$0 = j2;
        nestedScrollNode$onPreFling$1.label = 2;
        obj = nestedScrollConnection22.mo403onPreFlingQWom1Mo(m4720minusAH228Gc22, nestedScrollNode$onPreFling$1);
        if (obj == coroutine_suspended) {
        }
        return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.m4721plusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) obj).getPackedValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object mo401onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        int i;
        long j3;
        long j4;
        androidx.compose.ui.input.nestedscroll.NestedScrollNode nestedScrollNode;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection parentConnection;
        long j5;
        long m4728getZero9UxMQ8M;
        long j6;
        if (continuation instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) continuation;
            if ((nestedScrollNode$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = nestedScrollNode$onPostFling$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollNode$onPostFling$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection = this.connection;
                    nestedScrollNode$onPostFling$1.L$0 = this;
                    j3 = j;
                    nestedScrollNode$onPostFling$1.J$0 = j3;
                    j4 = j2;
                    nestedScrollNode$onPostFling$1.J$1 = j4;
                    nestedScrollNode$onPostFling$1.label = 1;
                    obj = nestedScrollConnection.mo401onPostFlingRZ2iAVY(j, j2, nestedScrollNode$onPostFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    nestedScrollNode = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j6 = nestedScrollNode$onPostFling$1.J$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        m4728getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getPackedValue();
                        j5 = j6;
                        return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.m4721plusAH228Gc(j5, m4728getZero9UxMQ8M));
                    }
                    long j7 = nestedScrollNode$onPostFling$1.J$1;
                    long j8 = nestedScrollNode$onPostFling$1.J$0;
                    nestedScrollNode = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) nestedScrollNode$onPostFling$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    j4 = j7;
                    j3 = j8;
                }
                long packedValue = ((androidx.compose.ui.unit.Velocity) obj).getPackedValue();
                parentConnection = nestedScrollNode.getParentConnection();
                if (parentConnection == null) {
                    long m4721plusAH228Gc = androidx.compose.ui.unit.Velocity.m4721plusAH228Gc(j3, packedValue);
                    long m4720minusAH228Gc = androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j4, packedValue);
                    nestedScrollNode$onPostFling$1.L$0 = null;
                    nestedScrollNode$onPostFling$1.J$0 = packedValue;
                    nestedScrollNode$onPostFling$1.label = 2;
                    obj = parentConnection.mo401onPostFlingRZ2iAVY(m4721plusAH228Gc, m4720minusAH228Gc, nestedScrollNode$onPostFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j6 = packedValue;
                    m4728getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getPackedValue();
                    j5 = j6;
                    return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.m4721plusAH228Gc(j5, m4728getZero9UxMQ8M));
                }
                j5 = packedValue;
                m4728getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M();
                return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.m4721plusAH228Gc(j5, m4728getZero9UxMQ8M));
            }
        }
        nestedScrollNode$onPostFling$1 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1(this, continuation);
        java.lang.Object obj2 = nestedScrollNode$onPostFling$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollNode$onPostFling$1.label;
        if (i != 0) {
        }
        long packedValue2 = ((androidx.compose.ui.unit.Velocity) obj2).getPackedValue();
        parentConnection = nestedScrollNode.getParentConnection();
        if (parentConnection == null) {
        }
    }

    private final void updateDispatcher(androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher newDispatcher) {
        resetDispatcherFields();
        if (newDispatcher == null) {
            this.resolvedDispatcher = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher();
        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(newDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = newDispatcher;
        }
        if (getIsAttached()) {
            updateDispatcherFields();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetDispatcherFields();
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setModifierLocalNode$ui_release(this);
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui_release(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode$updateDispatcherFields$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlinx.coroutines.CoroutineScope invoke() {
                kotlinx.coroutines.CoroutineScope nestedCoroutineScope;
                nestedCoroutineScope = androidx.compose.ui.input.nestedscroll.NestedScrollNode.this.getNestedCoroutineScope();
                return nestedCoroutineScope;
            }
        });
        this.resolvedDispatcher.setScope$ui_release(getCoroutineScope());
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getModifierLocalNode() == this) {
            this.resolvedDispatcher.setModifierLocalNode$ui_release(null);
        }
    }

    public final void updateNode$ui_release(androidx.compose.ui.input.nestedscroll.NestedScrollConnection connection, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher dispatcher) {
        this.connection = connection;
        updateDispatcher(dispatcher);
    }
}
