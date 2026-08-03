package androidx.compose.ui.layout;

/* compiled from: SubcomposeLayout.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u001d\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u001eJ(\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00012\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000f0#¢\u0006\u0002\b$¢\u0006\u0002\u0010%R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012RB\u0010\u0013\u001a0\u0012\u0004\u0012\u00020\r\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\f¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R+\u0010\u0018\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "()V", "maxSlotsToRetainForReuse", "", "(I)V", "slotReusePolicy", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "_state", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setCompositionContext", "Lkotlin/Function2;", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/CompositionContext;", "", "Lkotlin/ExtensionFunctionType;", "getSetCompositionContext$ui_release", "()Lkotlin/jvm/functions/Function2;", "setMeasurePolicy", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "getSetMeasurePolicy$ui_release", "setRoot", "getSetRoot$ui_release", "state", "getState", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "forceRecomposeChildren", "forceRecomposeChildren$ui_release", "precompose", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "slotId", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "PrecomposedSlotHandle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    private androidx.compose.ui.layout.LayoutNodeSubcompositionsState _state;
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.compose.runtime.CompositionContext, kotlin.Unit> setCompositionContext;
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.SubcomposeMeasureScope, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult>, kotlin.Unit> setMeasurePolicy;
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.SubcomposeLayoutState, kotlin.Unit> setRoot;
    private final androidx.compose.ui.layout.SubcomposeSlotReusePolicy slotReusePolicy;

    /* compiled from: SubcomposeLayout.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "placeablesCount", "", "getPlaceablesCount", "()I", "dispose", "", "premeasure", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "constraints", "Landroidx/compose/ui/unit/Constraints;", "premeasure-0kLqBqw", "(IJ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PrecomposedSlotHandle {

        /* compiled from: SubcomposeLayout.kt */
        /* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static int $default$getPlaceablesCount(androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle _this) {
                return 0;
            }

            /* renamed from: $default$premeasure-0kLqBqw, reason: not valid java name */
            public static void m3492$default$premeasure0kLqBqw(androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle _this, int i, long j) {
            }
        }

        void dispose();

        int getPlaceablesCount();

        /* renamed from: premeasure-0kLqBqw */
        void mo3420premeasure0kLqBqw(int index, long constraints);
    }

    public SubcomposeLayoutState(androidx.compose.ui.layout.SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        this.setRoot = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.SubcomposeLayoutState, kotlin.Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.layout.SubcomposeLayoutState subcomposeLayoutState) {
                invoke2(layoutNode, subcomposeLayoutState);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.layout.SubcomposeLayoutState subcomposeLayoutState) {
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState state;
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState state2;
                androidx.compose.ui.layout.SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2;
                androidx.compose.ui.layout.SubcomposeSlotReusePolicy subcomposeSlotReusePolicy3;
                androidx.compose.ui.layout.SubcomposeLayoutState subcomposeLayoutState2 = androidx.compose.ui.layout.SubcomposeLayoutState.this;
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState subcompositionsState = layoutNode.getSubcompositionsState();
                if (subcompositionsState == null) {
                    subcomposeSlotReusePolicy3 = androidx.compose.ui.layout.SubcomposeLayoutState.this.slotReusePolicy;
                    subcompositionsState = new androidx.compose.ui.layout.LayoutNodeSubcompositionsState(layoutNode, subcomposeSlotReusePolicy3);
                    layoutNode.setSubcompositionsState$ui_release(subcompositionsState);
                }
                subcomposeLayoutState2._state = subcompositionsState;
                state = androidx.compose.ui.layout.SubcomposeLayoutState.this.getState();
                state.makeSureStateIsConsistent();
                state2 = androidx.compose.ui.layout.SubcomposeLayoutState.this.getState();
                subcomposeSlotReusePolicy2 = androidx.compose.ui.layout.SubcomposeLayoutState.this.slotReusePolicy;
                state2.setSlotReusePolicy(subcomposeSlotReusePolicy2);
            }
        };
        this.setCompositionContext = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.compose.runtime.CompositionContext, kotlin.Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.runtime.CompositionContext compositionContext) {
                invoke2(layoutNode, compositionContext);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.runtime.CompositionContext compositionContext) {
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState state;
                state = androidx.compose.ui.layout.SubcomposeLayoutState.this.getState();
                state.setCompositionContext(compositionContext);
            }
        };
        this.setMeasurePolicy = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.SubcomposeMeasureScope, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult>, kotlin.Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.SubcomposeMeasureScope, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult> function2) {
                invoke2(layoutNode, function2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.LayoutNode layoutNode, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.SubcomposeMeasureScope, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult> function2) {
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState state;
                state = androidx.compose.ui.layout.SubcomposeLayoutState.this.getState();
                layoutNode.setMeasurePolicy(state.createMeasurePolicy(function2));
            }
        };
    }

    public SubcomposeLayoutState() {
        this(androidx.compose.ui.layout.NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    @kotlin.Deprecated(message = "This constructor is deprecated", replaceWith = @kotlin.ReplaceWith(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public SubcomposeLayoutState(int i) {
        this(androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.layout.LayoutNodeSubcompositionsState getState() {
        androidx.compose.ui.layout.LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new java.lang.IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.SubcomposeLayoutState, kotlin.Unit> getSetRoot$ui_release() {
        return this.setRoot;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.compose.runtime.CompositionContext, kotlin.Unit> getSetCompositionContext$ui_release() {
        return this.setCompositionContext;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.SubcomposeMeasureScope, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult>, kotlin.Unit> getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    public final androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle precompose(java.lang.Object slotId, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        return getState().precompose(slotId, content);
    }

    public final void forceRecomposeChildren$ui_release() {
        getState().forceRecomposeChildren();
    }
}
