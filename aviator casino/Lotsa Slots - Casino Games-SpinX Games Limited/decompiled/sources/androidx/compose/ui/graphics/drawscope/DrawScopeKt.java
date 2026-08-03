package androidx.compose.ui.graphics.drawscope;

/* compiled from: DrawScope.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ab\u0010\f\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aP\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\bH\u0086\b\u001a.\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010 \u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001a:\u0010 \u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001aF\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001aB\u0010#\u001a\u00020\u0001*\u00020\u00022\u0006\u0010$\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020&2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aB\u0010)\u001a\u00020\u0001*\u00020\u00022\u0006\u0010*\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020&2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010(\u001aB\u0010,\u001a\u00020\u0001*\u00020\u00022\u0006\u0010,\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020&2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u0010(\u001aJ\u0010,\u001a\u00020\u0001*\u00020\u00022\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020&2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a:\u00102\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001a?\u00103\u001a\u00020\u0001*\u00020\u00022\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\t2\u0017\u00106\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"clipPath", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/functions/Function1;)V", "clipRect", "left", "", "top", "right", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkotlin/jvm/functions/Function1;)V", "draw", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "draw-GRGpd60", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "drawIntoCanvas", "inset", com.helpshift.proactive.InAppViewConstants.ORIENTATION_HORIZONTAL, com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, "rotate", "degrees", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkotlin/jvm/functions/Function1;)V", "rotateRad", "radians", "rotateRad-Rg1IO4c", "scale", "scale-Rg1IO4c", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkotlin/jvm/functions/Function1;)V", "translate", "withTransform", "transformBlock", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "drawBlock", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawScopeKt {
    public static final void inset(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, float f3, float f4, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f, f2, f3, f4);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().inset(-f, -f2, -f3, -f4);
    }

    public static final void inset(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f, f, f, f);
        function1.invoke(drawScope);
        float f2 = -f;
        drawScope.getDrawContext().getTransform().inset(f2, f2, f2, f2);
    }

    public static final void translate(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        drawScope.getDrawContext().getTransform().translate(f, f2);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f, -f2);
    }

    public static /* synthetic */ void translate$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f, f2);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f, -f2);
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2717rotateRg1IO4c$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo2591getCenterF1C5BW0();
        }
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2604rotateUv8p0NA(f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2719rotateRadRg1IO4c$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo2591getCenterF1C5BW0();
        }
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2604rotateUv8p0NA(androidx.compose.ui.graphics.DegreesKt.degrees(f), j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m2721scaleFgt4K4Q$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = drawScope.mo2591getCenterF1C5BW0();
        }
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2605scale0AR0LA0(f, f2, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m2723scaleRg1IO4c$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.mo2591getCenterF1C5BW0();
        }
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2605scale0AR0LA0(f, f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m2714clipRectrOu3jXo$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, float f3, float f4, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        float f5 = (i2 & 1) != 0 ? 0.0f : f;
        float f6 = (i2 & 2) != 0 ? 0.0f : f2;
        if ((i2 & 4) != 0) {
            f3 = androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawScope.mo2592getSizeNHjbRc());
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawScope.mo2592getSizeNHjbRc());
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            i = androidx.compose.ui.graphics.ClipOp.INSTANCE.m2102getIntersectrtfAjoo();
        }
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2601clipRectN_I0leg(f5, f6, f7, f8, i);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m2712clipPathKD09W0M$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Path path, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = androidx.compose.ui.graphics.ClipOp.INSTANCE.m2102getIntersectrtfAjoo();
        }
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2600clipPathmtrdDE(path, i);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    public static final void drawIntoCanvas(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> function1) {
        function1.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void withTransform(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawTransform, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function12) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        function1.invoke(drawContext.getTransform());
        function12.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final void m2715drawGRGpd60(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.unit.Density density2 = drawScope.getDrawContext().getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo2598getSizeNHjbRc = drawScope.getDrawContext().mo2598getSizeNHjbRc();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo2599setSizeuvyYCjk(j);
        canvas.save();
        function1.invoke(drawScope);
        canvas.restore();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = drawScope.getDrawContext();
        drawContext2.setDensity(density2);
        drawContext2.setLayoutDirection(layoutDirection2);
        drawContext2.setCanvas(canvas2);
        drawContext2.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    public static final void inset(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        function1.invoke(drawScope);
        float f3 = -f;
        float f4 = -f2;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }

    public static /* synthetic */ void inset$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        function1.invoke(drawScope);
        float f3 = -f;
        float f4 = -f2;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m2716rotateRg1IO4c(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2604rotateUv8p0NA(f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m2718rotateRadRg1IO4c(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2604rotateUv8p0NA(androidx.compose.ui.graphics.DegreesKt.degrees(f), j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m2720scaleFgt4K4Q(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2605scale0AR0LA0(f, f2, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m2722scaleRg1IO4c(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2605scale0AR0LA0(f, f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m2713clipRectrOu3jXo(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, float f3, float f4, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2601clipRectN_I0leg(f, f2, f3, f4, i);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }

    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m2711clipPathKD09W0M(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Path path, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2600clipPathmtrdDE(path, i);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }
}
