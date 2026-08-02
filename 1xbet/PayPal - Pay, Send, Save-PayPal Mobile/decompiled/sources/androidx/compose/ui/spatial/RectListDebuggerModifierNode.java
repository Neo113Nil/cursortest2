package androidx.compose.ui.spatial;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00060\u000bj\u0002`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/spatial/RectListDebuggerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", "onAttach", "onDetach", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/getHighResolutionOutputSizeshNQ4ISI;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/graphics/Paint;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RectListDebuggerModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.DrawModifierNode {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.graphics.Paint getHighSpeedVideoSizes;
    public java.lang.Object getHighSpeedVideoFpsRangesFor;

    public RectListDebuggerModifierNode() {
        androidx.compose.ui.graphics.Paint Paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        Paint.mo5873setColor8_81llA(androidx.compose.ui.graphics.Color.INSTANCE.m6030getRed0d7_KjU());
        Paint.mo5877setStylek9PVt8s(androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m6260getStrokeTiuSbCo());
        this.getHighSpeedVideoSizes = Paint.getGetHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getRectManager().registerOnChangedCallback(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.spatial.RectListDebuggerModifierNode$onAttach$1
            public final void getHighSpeedVideoSizes() {
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(androidx.compose.ui.spatial.RectListDebuggerModifierNode.this);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoSizes();
                return kotlin.Unit.INSTANCE;
            }

            {
                super(0);
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getRectManager().unregisterOnChangedCallback(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.spatial.RectList rects = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getRectManager().getRects();
        android.graphics.Canvas nativeCanvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        android.graphics.Paint paint = this.getHighSpeedVideoSizes;
        long[] jArr = rects.items;
        int i = rects.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            nativeCanvas.drawRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2, paint);
        }
    }
}
