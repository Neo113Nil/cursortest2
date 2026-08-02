package androidx.compose.ui.graphics.drawscope;

@androidx.compose.ui.graphics.drawscope.DrawScopeMarker
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJA\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010%\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8'X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "", "inset", "(FFFF)V", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "translate", "(FF)V", "degrees", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotate-Uv8p0NA", "(FJ)V", "rotate", "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", "scale", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", io.ktor.http.ContentDisposition.Parameters.Size, "getCenter-F1C5BW0", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DrawTransform {
    /* renamed from: clipPath-mtrdD-E */
    void mo6455clipPathmtrdDE(androidx.compose.ui.graphics.Path path, int clipOp);

    /* renamed from: clipRect-N_I0leg */
    void mo6456clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp);

    /* renamed from: getSize-NH-jbRc */
    long mo6458getSizeNHjbRc();

    void inset(float left, float top, float right, float bottom);

    /* renamed from: rotate-Uv8p0NA */
    void mo6459rotateUv8p0NA(float degrees, long pivot);

    /* renamed from: scale-0AR0LA0 */
    void mo6460scale0AR0LA0(float scaleX, float scaleY, long pivot);

    /* renamed from: transform-58bKbWc */
    void mo6461transform58bKbWc(float[] matrix);

    void translate(float left, float top);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m6593getCenterF1C5BW0(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform) {
            return androidx.compose.ui.graphics.drawscope.DrawTransform.super.mo6457getCenterF1C5BW0();
        }
    }

    /* renamed from: getCenter-F1C5BW0 */
    default long mo6457getCenterF1C5BW0() {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (mo6458getSizeNHjbRc() >> 32)) / 2.0f;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (mo6458getSizeNHjbRc() & 4294967295L)) / 2.0f;
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m6588clipRectN_I0leg$default(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = java.lang.Float.intBitsToFloat((int) (drawTransform.mo6458getSizeNHjbRc() >> 32));
        }
        if ((i2 & 8) != 0) {
            f4 = java.lang.Float.intBitsToFloat((int) (drawTransform.mo6458getSizeNHjbRc() & 4294967295L));
        }
        if ((i2 & 16) != 0) {
            i = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
        }
        drawTransform.mo6456clipRectN_I0leg(f, f2, f3, f4, i);
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m6587clipPathmtrdDE$default(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, androidx.compose.ui.graphics.Path path, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
        }
        drawTransform.mo6455clipPathmtrdDE(path, i);
    }

    static /* synthetic */ void translate$default(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, float f, float f2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.translate(f, f2);
    }

    /* renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m6589rotateUv8p0NA$default(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, float f, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = drawTransform.mo6457getCenterF1C5BW0();
        }
        drawTransform.mo6459rotateUv8p0NA(f, j);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m6590scale0AR0LA0$default(androidx.compose.ui.graphics.drawscope.DrawTransform drawTransform, float f, float f2, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i & 4) != 0) {
            j = drawTransform.mo6457getCenterF1C5BW0();
        }
        drawTransform.mo6460scale0AR0LA0(f, f2, j);
    }
}
