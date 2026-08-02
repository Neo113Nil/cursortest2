package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018RC\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/Continuation;", "", "dragAndDropSourceHandler", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "Lkotlin/jvm/functions/Function1;", "getDrawDragDecoration", "()Lkotlin/jvm/functions/Function1;", "setDrawDragDecoration", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function2;", "getDragAndDropSourceHandler", "()Lkotlin/jvm/functions/Function2;", "setDragAndDropSourceHandler", "(Lkotlin/jvm/functions/Function2;)V", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyDragAndDropSourceNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.LayoutAwareModifierNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
    private kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropSourceScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> dragAndDropSourceHandler;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> drawDragDecoration;

    public LegacyDragAndDropSourceNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropSourceScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.drawDragDecoration = function1;
        this.dragAndDropSourceHandler = function2;
        final androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode = (androidx.compose.ui.draganddrop.DragAndDropModifierNode) delegate(androidx.compose.ui.draganddrop.DragAndDropNodeKt.DragAndDropModifierNode());
        delegate(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode.1

            @kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\u000f\u001a\u00028\u0000\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\b0\n¢\u0006\u0002\b\rH\u0096A¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0015\u001a\u00020\u0012*\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u0012*\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001dJ\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010$\u001a\u00020!*\u00020 H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0014\u0010&\u001a\u00020\u001c*\u00020\u0011H\u0096\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0014\u0010&\u001a\u00020\u001c*\u00020\u0016H\u0096\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0014\u0010*\u001a\u00020)*\u00020(H\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0014\u0010-\u001a\u00020 *\u00020!H\u0096\u0001¢\u0006\u0004\b,\u0010#J\u0014\u00100\u001a\u00020\u0016*\u00020\u0012H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0014\u00100\u001a\u00020\u0016*\u00020\u001cH\u0096\u0001¢\u0006\u0004\b.\u00101J\u0014\u00100\u001a\u00020\u0016*\u00020\u0011H\u0096\u0001¢\u0006\u0004\b2\u00101R\u0014\u00105\u001a\u00020\u001c8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u00020 8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u001c8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u00104R$\u0010A\u001a\u00020;2\u0006\u0010<\u001a\u00020;8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020B8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u00107R\u0014\u0010H\u001a\u00020E8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010G"}, d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode$1$1;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "", "startTransfer", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;)V", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-u2uoSUM", "(I)F", "toDp", "", "(F)F", "toDp-GaN1DYA", "(J)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-kPz2Gy4", "(I)J", "toSp", "(F)J", "toSp-0xMU5do", "getDensity", "()F", "density", "getExtendedTouchPadding-NH-jbRc", "()J", "extendedTouchPadding", "getFontScale", "fontScale", "", "_", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00131 implements androidx.compose.foundation.draganddrop.DragAndDropSourceScope, androidx.compose.ui.input.pointer.PointerInputScope {
                final /* synthetic */ androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode getHighResolutionOutputSizeshNQ4ISI;
                private final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighSpeedVideoFpsRanges;
                final /* synthetic */ androidx.compose.ui.draganddrop.DragAndDropModifierNode getHighSpeedVideoSizes;

                C00131(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode, androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
                    this.getHighSpeedVideoSizes = dragAndDropModifierNode;
                    this.getHighResolutionOutputSizeshNQ4ISI = legacyDragAndDropSourceNode;
                    this.getHighSpeedVideoFpsRanges = pointerInputScope;
                }

                @Override // androidx.compose.foundation.draganddrop.DragAndDropSourceScope
                public final void startTransfer(androidx.compose.ui.draganddrop.DragAndDropTransferData transferData) {
                    this.getHighSpeedVideoSizes.mo5527drag12SF9DM(transferData, androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(getGetOutputStallDuration()), this.getHighResolutionOutputSizeshNQ4ISI.getDrawDragDecoration());
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toSp-kPz2Gy4 */
                public final long mo1422toSpkPz2Gy4(int i) {
                    return this.getHighSpeedVideoFpsRanges.mo1422toSpkPz2Gy4(i);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toSp-kPz2Gy4 */
                public final long mo1421toSpkPz2Gy4(float f) {
                    return this.getHighSpeedVideoFpsRanges.mo1421toSpkPz2Gy4(f);
                }

                @Override // androidx.compose.ui.unit.FontScaling
                /* renamed from: toSp-0xMU5do */
                public final long mo1420toSp0xMU5do(float f) {
                    return this.getHighSpeedVideoFpsRanges.mo1420toSp0xMU5do(f);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toSize-XkaWNTQ */
                public final long mo1419toSizeXkaWNTQ(long j) {
                    return this.getHighSpeedVideoFpsRanges.mo1419toSizeXkaWNTQ(j);
                }

                @Override // androidx.compose.ui.unit.Density
                public final androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
                    return this.getHighSpeedVideoFpsRanges.toRect(dpRect);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toPx-0680j_4 */
                public final float mo1418toPx0680j_4(float f) {
                    return this.getHighSpeedVideoFpsRanges.mo1418toPx0680j_4(f);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toPx--R2X_6o */
                public final float mo1417toPxR2X_6o(long j) {
                    return this.getHighSpeedVideoFpsRanges.mo1417toPxR2X_6o(j);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toDpSize-k-rfVVM */
                public final long mo1416toDpSizekrfVVM(long j) {
                    return this.getHighSpeedVideoFpsRanges.mo1416toDpSizekrfVVM(j);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toDp-u2uoSUM */
                public final float mo1415toDpu2uoSUM(int i) {
                    return this.getHighSpeedVideoFpsRanges.mo1415toDpu2uoSUM(i);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: toDp-u2uoSUM */
                public final float mo1414toDpu2uoSUM(float f) {
                    return this.getHighSpeedVideoFpsRanges.mo1414toDpu2uoSUM(f);
                }

                @Override // androidx.compose.ui.unit.FontScaling
                /* renamed from: toDp-GaN1DYA */
                public final float mo1413toDpGaN1DYA(long j) {
                    return this.getHighSpeedVideoFpsRanges.mo1413toDpGaN1DYA(j);
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public final void setInterceptOutOfBoundsChildEvents(boolean z) {
                    this.getHighSpeedVideoFpsRanges.setInterceptOutOfBoundsChildEvents(z);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: roundToPx-0680j_4 */
                public final int mo1412roundToPx0680j_4(float f) {
                    return this.getHighSpeedVideoFpsRanges.mo1412roundToPx0680j_4(f);
                }

                @Override // androidx.compose.ui.unit.Density
                /* renamed from: roundToPx--R2X_6o */
                public final int mo1411roundToPxR2X_6o(long j) {
                    return this.getHighSpeedVideoFpsRanges.mo1411roundToPxR2X_6o(j);
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public final androidx.compose.ui.platform.ViewConfiguration getViewConfiguration() {
                    return this.getHighSpeedVideoFpsRanges.getViewConfiguration();
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                /* renamed from: getSize-YbymL2g */
                public final long getGetOutputStallDuration() {
                    return this.getHighSpeedVideoFpsRanges.getGetOutputStallDuration();
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public final boolean getInterceptOutOfBoundsChildEvents() {
                    return this.getHighSpeedVideoFpsRanges.getInterceptOutOfBoundsChildEvents();
                }

                @Override // androidx.compose.ui.unit.FontScaling
                public final float getFontScale() {
                    return this.getHighSpeedVideoFpsRanges.getFontScale();
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                /* renamed from: getExtendedTouchPadding-NH-jbRc */
                public final long mo1408getExtendedTouchPaddingNHjbRc() {
                    return this.getHighSpeedVideoFpsRanges.mo1408getExtendedTouchPaddingNHjbRc();
                }

                @Override // androidx.compose.ui.unit.Density
                public final float getDensity() {
                    return this.getHighSpeedVideoFpsRanges.getDensity();
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputScope
                public final <R> java.lang.Object awaitPointerEventScope(kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
                    return this.getHighSpeedVideoFpsRanges.awaitPointerEventScope(function2, continuation);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object invoke = androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode.this.getDragAndDropSourceHandler().invoke(new androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode.AnonymousClass1.C00131(pointerInputScope, dragAndDropModifierNode, androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode.this), continuation);
                return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
            }
        }));
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final void setDrawDragDecoration(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        this.drawDragDecoration = function1;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.foundation.draganddrop.DragAndDropSourceScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final void setDragAndDropSourceHandler(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropSourceScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.dragAndDropSourceHandler = function2;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final void mo1407onRemeasuredozmzZPI(long size) {
        this.getHighSpeedVideoFpsRanges = size;
    }
}
