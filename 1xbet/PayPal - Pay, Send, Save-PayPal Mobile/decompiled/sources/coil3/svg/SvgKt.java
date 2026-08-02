package coil3.svg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003"}, d2 = {"Lcoil3/svg/Svg$ViewBox;", "", "getWidth", "(Lcoil3/svg/Svg$ViewBox;)F", "width", "getHeight", "height"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SvgKt {
    public static final float getWidth(coil3.svg.Svg.ViewBox viewBox) {
        return viewBox.getRight() - viewBox.getLeft();
    }

    public static final float getHeight(coil3.svg.Svg.ViewBox viewBox) {
        return viewBox.getBottom() - viewBox.getTop();
    }
}
