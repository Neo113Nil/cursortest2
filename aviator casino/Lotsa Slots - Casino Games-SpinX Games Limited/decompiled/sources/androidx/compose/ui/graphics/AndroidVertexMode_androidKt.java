package androidx.compose.ui.graphics;

/* compiled from: AndroidVertexMode.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"toAndroidVertexMode", "Landroid/graphics/Canvas$VertexMode;", "Landroidx/compose/ui/graphics/VertexMode;", "toAndroidVertexMode-JOOmi9M", "(I)Landroid/graphics/Canvas$VertexMode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidVertexMode_androidKt {
    /* renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final android.graphics.Canvas.VertexMode m2019toAndroidVertexModeJOOmi9M(int i) {
        return androidx.compose.ui.graphics.VertexMode.m2516equalsimpl0(i, androidx.compose.ui.graphics.VertexMode.INSTANCE.m2522getTrianglesc2xauaI()) ? android.graphics.Canvas.VertexMode.TRIANGLES : androidx.compose.ui.graphics.VertexMode.m2516equalsimpl0(i, androidx.compose.ui.graphics.VertexMode.INSTANCE.m2521getTriangleStripc2xauaI()) ? android.graphics.Canvas.VertexMode.TRIANGLE_STRIP : androidx.compose.ui.graphics.VertexMode.m2516equalsimpl0(i, androidx.compose.ui.graphics.VertexMode.INSTANCE.m2520getTriangleFanc2xauaI()) ? android.graphics.Canvas.VertexMode.TRIANGLE_FAN : android.graphics.Canvas.VertexMode.TRIANGLES;
    }
}
