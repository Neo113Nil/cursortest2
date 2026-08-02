package androidx.compose.foundation.shape;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\b\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0006¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t\"\u001d\u0010\n\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/unit/Dp;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/foundation/shape/CornerSize;", "CornerSize-0680j_4", "(F)Landroidx/compose/foundation/shape/CornerSize;", "CornerSize", "", "", "percent", "(I)Landroidx/compose/foundation/shape/CornerSize;", "ZeroCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "getZeroCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getZeroCornerSize$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CornerSizeKt {
    private static final androidx.compose.foundation.shape.CornerSize ZeroCornerSize = new androidx.compose.foundation.shape.CornerSizeKt$ZeroCornerSize$1();

    public static /* synthetic */ void getZeroCornerSize$annotations() {
    }

    /* renamed from: CornerSize-0680j_4, reason: not valid java name */
    public static final androidx.compose.foundation.shape.CornerSize m1967CornerSize0680j_4(float f) {
        return new androidx.compose.foundation.shape.DpCornerSize(f, null);
    }

    public static final androidx.compose.foundation.shape.CornerSize CornerSize(float f) {
        return new androidx.compose.foundation.shape.PxCornerSize(f);
    }

    public static final androidx.compose.foundation.shape.CornerSize CornerSize(int i) {
        return new androidx.compose.foundation.shape.PercentCornerSize(i);
    }

    public static final androidx.compose.foundation.shape.CornerSize getZeroCornerSize() {
        return ZeroCornerSize;
    }
}
