package androidx.compose.ui.input.nestedscroll;

/* compiled from: NestedScrollModifier.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J#\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J(\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020$ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J \u0010*\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020$ø\u0001\u0000¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "()V", "calculateNestedScrollScope", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "setCalculateNestedScrollScope$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "coroutineScope", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "modifierLocalNode", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "getModifierLocalNode$ui_release", "()Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "setModifierLocalNode$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocalModifierNode;)V", "parent", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scope", "getScope$ui_release", "setScope$ui_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "dispatchPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "dispatchPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPreFling", "dispatchPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPreScroll", "dispatchPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.CoroutineScope> calculateNestedScrollScope = new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.coroutines.CoroutineScope invoke() {
            return androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.this.getScope();
        }
    };
    private androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalNode;
    private kotlinx.coroutines.CoroutineScope scope;

    /* renamed from: getModifierLocalNode$ui_release, reason: from getter */
    public final androidx.compose.ui.modifier.ModifierLocalModifierNode getModifierLocalNode() {
        return this.modifierLocalNode;
    }

    public final void setModifierLocalNode$ui_release(androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode) {
        this.modifierLocalNode = modifierLocalModifierNode;
    }

    public final kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope> getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    public final void setCalculateNestedScrollScope$ui_release(kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.CoroutineScope> function0) {
        this.calculateNestedScrollScope = function0;
    }

    /* renamed from: getScope$ui_release, reason: from getter */
    public final kotlinx.coroutines.CoroutineScope getScope() {
        return this.scope;
    }

    public final void setScope$ui_release(kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        kotlinx.coroutines.CoroutineScope invoke = this.calculateNestedScrollScope.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new java.lang.IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getParent$ui_release() {
        androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode = this.modifierLocalNode;
        return modifierLocalModifierNode != null ? (androidx.compose.ui.input.nestedscroll.NestedScrollNode) modifierLocalModifierNode.getCurrent(androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.getModifierLocalNestedScroll()) : null;
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m3159dispatchPreScrollOzD1aCk(long available, int source) {
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo404onPreScrollOzD1aCk(available, source) : androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m3157dispatchPostScrollDzOQY0M(long consumed, long available, int source) {
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo402onPostScrollDzOQY0M(consumed, available, source) : androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m3158dispatchPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        int i;
        long m4728getZero9UxMQ8M;
        if (continuation instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) continuation;
            if ((nestedScrollDispatcher$dispatchPreFling$1.label & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = nestedScrollDispatcher$dispatchPreFling$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollDispatcher$dispatchPreFling$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.nestedscroll.NestedScrollConnection parent$ui_release = getParent$ui_release();
                    if (parent$ui_release == null) {
                        m4728getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M();
                        return androidx.compose.ui.unit.Velocity.m4708boximpl(m4728getZero9UxMQ8M);
                    }
                    nestedScrollDispatcher$dispatchPreFling$1.label = 1;
                    obj = parent$ui_release.mo403onPreFlingQWom1Mo(j, nestedScrollDispatcher$dispatchPreFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                m4728getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getPackedValue();
                return androidx.compose.ui.unit.Velocity.m4708boximpl(m4728getZero9UxMQ8M);
            }
        }
        nestedScrollDispatcher$dispatchPreFling$1 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1(this, continuation);
        java.lang.Object obj2 = nestedScrollDispatcher$dispatchPreFling$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollDispatcher$dispatchPreFling$1.label;
        if (i != 0) {
        }
        m4728getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj2).getPackedValue();
        return androidx.compose.ui.unit.Velocity.m4708boximpl(m4728getZero9UxMQ8M);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m3156dispatchPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        int i;
        long m4728getZero9UxMQ8M;
        if (continuation instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) continuation;
            if ((nestedScrollDispatcher$dispatchPostFling$1.label & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.label -= Integer.MIN_VALUE;
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$12 = nestedScrollDispatcher$dispatchPostFling$1;
                java.lang.Object obj = nestedScrollDispatcher$dispatchPostFling$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollDispatcher$dispatchPostFling$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.nestedscroll.NestedScrollConnection parent$ui_release = getParent$ui_release();
                    if (parent$ui_release == null) {
                        m4728getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M();
                        return androidx.compose.ui.unit.Velocity.m4708boximpl(m4728getZero9UxMQ8M);
                    }
                    nestedScrollDispatcher$dispatchPostFling$12.label = 1;
                    obj = parent$ui_release.mo401onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                m4728getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj).getPackedValue();
                return androidx.compose.ui.unit.Velocity.m4708boximpl(m4728getZero9UxMQ8M);
            }
        }
        nestedScrollDispatcher$dispatchPostFling$1 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1(this, continuation);
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$122 = nestedScrollDispatcher$dispatchPostFling$1;
        java.lang.Object obj2 = nestedScrollDispatcher$dispatchPostFling$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollDispatcher$dispatchPostFling$122.label;
        if (i != 0) {
        }
        m4728getZero9UxMQ8M = ((androidx.compose.ui.unit.Velocity) obj2).getPackedValue();
        return androidx.compose.ui.unit.Velocity.m4708boximpl(m4728getZero9UxMQ8M);
    }
}
