package androidx.compose.ui.graphics.drawscope;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0007\u001a&\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a&\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\u000f\u0010\f"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "", "inset", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FF)V", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;F)V", "radians", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "rotateRad", "scale", "scale-0AR0LA0"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DrawTransformKt {
    public static final void inset(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, float f, float f2) {
        drawTransform.inset(f, f2, f, f2);
    }

    public static /* synthetic */ void inset$default(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.inset(f, f2, f, f2);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m6597rotateRad0AR0LA0$default(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, float f, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.mo6457getCenterF1C5BW0();
        }
        drawTransform.mo6459rotateUv8p0NA(androidx.compose.ui.graphics.DegreesKt.degrees(f), j);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m6596rotateRad0AR0LA0(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, float f, long j) {
        drawTransform.mo6459rotateUv8p0NA(androidx.compose.ui.graphics.DegreesKt.degrees(f), j);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m6598scale0AR0LA0(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, float f, long j) {
        drawTransform.mo6460scale0AR0LA0(f, f, j);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m6599scale0AR0LA0$default(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, float f, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.mo6457getCenterF1C5BW0();
        }
        drawTransform.mo6460scale0AR0LA0(f, f, j);
    }

    public static final void inset(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, float f) {
        drawTransform.inset(f, f, f, f);
    }
}
