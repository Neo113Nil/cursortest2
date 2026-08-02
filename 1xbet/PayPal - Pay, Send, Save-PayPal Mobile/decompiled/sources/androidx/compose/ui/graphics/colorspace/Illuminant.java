package androidx.compose.ui.graphics.colorspace;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0006"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Illuminant;", "", "<init>", "()V", "", "newD50Xyz$ui_graphics", "()[F", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "A", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getA", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "B", "getB", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getC", "D50", "getD50", "D55", "getD55", "D60", "getD60", "D65", "getD65", "D75", "getD75", "E", "getE", "D50Xyz", "[F", "getD50Xyz$ui_graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Illuminant {
    public static final androidx.compose.ui.graphics.colorspace.Illuminant INSTANCE = new androidx.compose.ui.graphics.colorspace.Illuminant();
    private static final androidx.compose.ui.graphics.colorspace.WhitePoint A = new androidx.compose.ui.graphics.colorspace.WhitePoint(0.44757f, 0.40745f);
    private static final androidx.compose.ui.graphics.colorspace.WhitePoint B = new androidx.compose.ui.graphics.colorspace.WhitePoint(0.34842f, 0.35161f);
    private static final androidx.compose.ui.graphics.colorspace.WhitePoint C = new androidx.compose.ui.graphics.colorspace.WhitePoint(0.31006f, 0.31616f);
    private static final androidx.compose.ui.graphics.colorspace.WhitePoint D50 = new androidx.compose.ui.graphics.colorspace.WhitePoint(0.34567f, 0.3585f);
    private static final androidx.compose.ui.graphics.colorspace.WhitePoint D55 = new androidx.compose.ui.graphics.colorspace.WhitePoint(0.33242f, 0.34743f);
    private static final androidx.compose.ui.graphics.colorspace.WhitePoint D60 = new androidx.compose.ui.graphics.colorspace.WhitePoint(0.32168f, 0.33767f);
    private static final androidx.compose.ui.graphics.colorspace.WhitePoint D65 = new androidx.compose.ui.graphics.colorspace.WhitePoint(0.31271f, 0.32902f);
    private static final androidx.compose.ui.graphics.colorspace.WhitePoint D75 = new androidx.compose.ui.graphics.colorspace.WhitePoint(0.29902f, 0.31485f);
    private static final androidx.compose.ui.graphics.colorspace.WhitePoint E = new androidx.compose.ui.graphics.colorspace.WhitePoint(0.33333f, 0.33333f);
    private static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};
    public static final int $stable = 8;

    private Illuminant() {
    }

    public final androidx.compose.ui.graphics.colorspace.WhitePoint getA() {
        return A;
    }

    public final androidx.compose.ui.graphics.colorspace.WhitePoint getB() {
        return B;
    }

    public final androidx.compose.ui.graphics.colorspace.WhitePoint getC() {
        return C;
    }

    public final androidx.compose.ui.graphics.colorspace.WhitePoint getD50() {
        return D50;
    }

    public final androidx.compose.ui.graphics.colorspace.WhitePoint getD55() {
        return D55;
    }

    public final androidx.compose.ui.graphics.colorspace.WhitePoint getD60() {
        return D60;
    }

    public final androidx.compose.ui.graphics.colorspace.WhitePoint getD65() {
        return D65;
    }

    public final androidx.compose.ui.graphics.colorspace.WhitePoint getD75() {
        return D75;
    }

    public final androidx.compose.ui.graphics.colorspace.WhitePoint getE() {
        return E;
    }

    public final float[] getD50Xyz$ui_graphics() {
        return D50Xyz;
    }

    public final float[] newD50Xyz$ui_graphics() {
        return new float[]{0.964212f, 1.0f, 0.825188f};
    }
}
