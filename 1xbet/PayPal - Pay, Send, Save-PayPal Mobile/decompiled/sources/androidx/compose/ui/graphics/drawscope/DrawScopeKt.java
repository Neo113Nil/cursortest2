package androidx.compose.ui.graphics.drawscope;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\n\u0010\f\u001aA\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a?\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a?\u0010\u0019\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\u0018\u0010\u0015\u001aG\u0010\u001e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a?\u0010\u001e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\u001f\u0010\u0015\u001a_\u0010$\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020 2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\"\u0010#\u001a?\u0010)\u001a\u00020\u0007*\u00020\u00002\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010!\u001a\u00020 2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b'\u0010(\u001a(\u0010+\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b+\u0010,\u001aF\u00100\u001a\u00020\u0007*\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b0\u00101\u001aM\u0010;\u001a\u00020\u0007*\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020*2\u0006\u00108\u001a\u0002072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\b¢\u0006\u0004\b9\u0010:\u001aY\u0010;\u001a\u00020\u0007*\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020*2\u0006\u00108\u001a\u0002072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b>\u0010?"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "inset", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFLkotlin/jvm/functions/Function1;)V", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLkotlin/jvm/functions/Function1;)V", "horizontal", "vertical", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLkotlin/jvm/functions/Function1;)V", "translate", "degrees", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkotlin/jvm/functions/Function1;)V", "rotate", "radians", "rotateRad-Rg1IO4c", "rotateRad", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkotlin/jvm/functions/Function1;)V", "scale", "scale-Rg1IO4c", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkotlin/jvm/functions/Function1;)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/functions/Function1;)V", "clipPath", "Landroidx/compose/ui/graphics/Canvas;", "drawIntoCanvas", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "transformBlock", "drawBlock", "withTransform", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "canvas", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "draw-GRGpd60", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "draw", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "draw-ymL40Pk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawScopeKt {
    public static final void inset(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, float f3, float f4, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f, f2, f3, f4);
        try {
            function1.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().inset(-f, -f2, -f3, -f4);
        }
    }

    public static final void inset(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f, f, f, f);
        try {
            function1.invoke(drawScope);
        } finally {
            float f2 = -f;
            drawScope.getDrawContext().getTransform().inset(f2, f2, f2, f2);
        }
    }

    public static final void translate(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        drawScope.getDrawContext().getTransform().translate(f, f2);
        try {
            function1.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(-f, -f2);
        }
    }

    public static /* synthetic */ void translate$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f, f2);
        try {
            function1.invoke(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().translate(-f, -f2);
        }
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m6579rotateRg1IO4c$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo6530getCenterF1C5BW0();
        }
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6459rotateUv8p0NA(f, j);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m6581rotateRadRg1IO4c$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo6530getCenterF1C5BW0();
        }
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6459rotateUv8p0NA(androidx.compose.ui.graphics.DegreesKt.degrees(f), j);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m6583scaleFgt4K4Q$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = drawScope.mo6530getCenterF1C5BW0();
        }
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6460scale0AR0LA0(f, f2, j);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m6585scaleRg1IO4c$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo6530getCenterF1C5BW0();
        }
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6460scale0AR0LA0(f, f, j);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m6574clipRectrOu3jXo$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, float f3, float f4, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        float f5 = (i2 & 1) != 0 ? 0.0f : f;
        float f6 = (i2 & 2) != 0 ? 0.0f : f2;
        if ((i2 & 4) != 0) {
            f3 = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32));
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L));
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            i = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
        }
        int i3 = i;
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6456clipRectN_I0leg(f5, f6, f7, f8, i3);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m6572clipPathKD09W0M$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Path path, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
        }
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6455clipPathmtrdDE(path, i);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    public static final void drawIntoCanvas(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> function1) {
        function1.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void withTransform(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawTransform, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function12) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            function1.invoke(drawContext.getTransform());
            function12.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m6576drawymL40Pk(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long j, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.unit.Density density2 = drawScope.getDrawContext().getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo6453getSizeNHjbRc = drawScope.getDrawContext().mo6453getSizeNHjbRc();
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo6454setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            function1.invoke(drawScope);
        } finally {
            canvas.restore();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    /* renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static /* synthetic */ void m6577drawymL40Pk$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long j, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            graphicsLayer = null;
        }
        androidx.compose.ui.unit.Density density2 = drawScope.getDrawContext().getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo6453getSizeNHjbRc = drawScope.getDrawContext().mo6453getSizeNHjbRc();
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo6454setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            function1.invoke(drawScope);
        } finally {
            canvas.restore();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
        }
    }

    public static final void inset(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        try {
            function1.invoke(drawScope);
        } finally {
            float f3 = -f;
            float f4 = -f2;
            drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
        }
    }

    public static /* synthetic */ void inset$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        try {
            function1.invoke(drawScope);
        } finally {
            float f3 = -f;
            float f4 = -f2;
            drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
        }
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m6578rotateRg1IO4c(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6459rotateUv8p0NA(f, j);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m6580rotateRadRg1IO4c(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6459rotateUv8p0NA(androidx.compose.ui.graphics.DegreesKt.degrees(f), j);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m6582scaleFgt4K4Q(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6460scale0AR0LA0(f, f2, j);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m6584scaleRg1IO4c(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6460scale0AR0LA0(f, f, j);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m6573clipRectrOu3jXo(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, float f3, float f4, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6456clipRectN_I0leg(f, f2, f3, f4, i);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m6571clipPathKD09W0M(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Path path, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6455clipPathmtrdDE(path, i);
            function1.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Please use a new overload accepting nullable GraphicsLayer")
    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final /* synthetic */ void m6575drawGRGpd60(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.unit.Density density2 = drawScope.getDrawContext().getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo6453getSizeNHjbRc = drawScope.getDrawContext().mo6453getSizeNHjbRc();
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo6454setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(null);
        canvas.save();
        try {
            function1.invoke(drawScope);
        } finally {
            canvas.restore();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
        }
    }
}
