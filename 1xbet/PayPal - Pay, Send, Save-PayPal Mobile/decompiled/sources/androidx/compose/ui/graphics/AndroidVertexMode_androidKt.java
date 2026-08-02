package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/VertexMode;", "Landroid/graphics/Canvas$VertexMode;", "toAndroidVertexMode-JOOmi9M", "(I)Landroid/graphics/Canvas$VertexMode;", "toAndroidVertexMode"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidVertexMode_androidKt {
    /* renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final android.graphics.Canvas.VertexMode m5901toAndroidVertexModeJOOmi9M(int i) {
        return androidx.compose.ui.graphics.VertexMode.m6383equalsimpl0(i, androidx.compose.ui.graphics.VertexMode.INSTANCE.m6389getTrianglesc2xauaI()) ? android.graphics.Canvas.VertexMode.TRIANGLES : androidx.compose.ui.graphics.VertexMode.m6383equalsimpl0(i, androidx.compose.ui.graphics.VertexMode.INSTANCE.m6388getTriangleStripc2xauaI()) ? android.graphics.Canvas.VertexMode.TRIANGLE_STRIP : androidx.compose.ui.graphics.VertexMode.m6383equalsimpl0(i, androidx.compose.ui.graphics.VertexMode.INSTANCE.m6387getTriangleFanc2xauaI()) ? android.graphics.Canvas.VertexMode.TRIANGLE_FAN : android.graphics.Canvas.VertexMode.TRIANGLES;
    }
}
