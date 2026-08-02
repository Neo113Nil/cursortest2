package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0016\u0017B2\u0012)\u0010\n\u001a%\b\u0001\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR9\u0010\u0012\u001a%\b\u0001\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R/\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\r8C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015\"\u0004\b\u0013\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Companion", "ClickTextContextMenuDataProvider"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextContextMenuGestureNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode {
    private static final androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.Companion Companion = new androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(null, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());

    public TextContextMenuGestureNode(kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.getHighSpeedVideoFpsRanges = function2;
        delegate(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$1$1, reason: invalid class name and collision with other inner class name */
            static final /* synthetic */ class C00221 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> {
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                    androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.getHighSpeedVideoFpsRangesFor((androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode) this.receiver, offset.m5762unboximpl());
                    return kotlin.Unit.INSTANCE;
                }

                C00221(java.lang.Object obj) {
                    super(1, obj, androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object onRightClickDown = androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt.onRightClickDown(pointerInputScope, new androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.AnonymousClass1.C00221(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.this), continuation);
                return onRightClickDown == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? onRightClickDown : kotlin.Unit.INSTANCE;
            }
        }));
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.layout.LayoutCoordinates getHighSpeedVideoFpsRangesFor() {
        return (androidx.compose.ui.layout.LayoutCoordinates) this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    private final void getHighSpeedVideoSizes(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.getHighSpeedVideoFpsRangesFor.setValue(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates p0) {
        getHighSpeedVideoSizes(p0);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode$ClickTextContextMenuDataProvider;", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "Landroidx/compose/ui/geometry/Offset;", "p0", "<init>", "(Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "position-tuRUvjQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", com.daon.sdk.face.license.License.FEATURE_POSITION, "Landroidx/compose/ui/geometry/Rect;", "contentBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class ClickTextContextMenuDataProvider implements androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final long getHighSpeedVideoFpsRangesFor;

        private ClickTextContextMenuDataProvider(long j) {
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        /* renamed from: position-tuRUvjQ, reason: not valid java name */
        public final long mo2160positiontuRUvjQ(androidx.compose.ui.layout.LayoutCoordinates p0) {
            androidx.compose.ui.layout.LayoutCoordinates highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.this.getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor != null) {
                return p0.mo7362localPositionOfR5De75A(highSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor);
            }
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Tried to open context menu before the anchor was placed.");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        public final androidx.compose.ui.geometry.Rect contentBounds(androidx.compose.ui.layout.LayoutCoordinates p0) {
            return androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(mo2160positiontuRUvjQ(p0), androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc());
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        public final androidx.compose.foundation.text.contextmenu.data.TextContextMenuData data() {
            return androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt.collectTextContextMenuData(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.this);
        }

        public /* synthetic */ ClickTextContextMenuDataProvider(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode textContextMenuGestureNode, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }
    }

    public static final /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode textContextMenuGestureNode, long j) {
        androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider textContextMenuProvider = (androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(textContextMenuGestureNode, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt.getLocalTextContextMenuDropdownProvider());
        if (textContextMenuProvider != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(textContextMenuGestureNode.getCoroutineScope(), null, null, new androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1(textContextMenuGestureNode, j, textContextMenuProvider, new androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.ClickTextContextMenuDataProvider(textContextMenuGestureNode, j, null), null), 3, null);
        }
    }
}
