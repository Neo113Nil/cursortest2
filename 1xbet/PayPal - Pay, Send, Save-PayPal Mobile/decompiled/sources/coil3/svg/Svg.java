package coil3.svg;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0019\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000f8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/svg/Svg;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "width", "(Ljava/lang/String;)V", "height", "Lcoil3/request/Options;", "options", "(Lcoil3/request/Options;)V", "", "Lcoil3/Image;", "asImage", "(II)Lcoil3/Image;", "Lcoil3/svg/Svg$ViewBox;", "getViewBox", "()Lcoil3/svg/Svg$ViewBox;", "setViewBox", "(Lcoil3/svg/Svg$ViewBox;)V", "viewBox", "", "getWidth", "()F", "getHeight", "ViewBox", "Parser"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Svg {
    coil3.Image asImage(int width, int height);

    float getHeight();

    coil3.svg.Svg.ViewBox getViewBox();

    float getWidth();

    void height(java.lang.String value);

    void options(coil3.view.Options options);

    void setViewBox(coil3.svg.Svg.ViewBox viewBox);

    void width(java.lang.String value);

    static /* synthetic */ coil3.Image asImage$default(coil3.svg.Svg svg, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asImage");
        }
        if ((i3 & 1) != 0) {
            i = (int) svg.getWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = (int) svg.getHeight();
        }
        return svg.asImage(i, i2);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcoil3/svg/Svg$ViewBox;", "", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Lcoil3/svg/Svg$ViewBox;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getLeft", "getTop", "getRight", "getBottom"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewBox {
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        public ViewBox(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
        }

        public final float getLeft() {
            return this.left;
        }

        public final float getTop() {
            return this.top;
        }

        public final float getRight() {
            return this.right;
        }

        public final float getBottom() {
            return this.bottom;
        }

        public final java.lang.String toString() {
            float f = this.left;
            float f2 = this.top;
            float f3 = this.right;
            float f4 = this.bottom;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewBox(left=");
            sb.append(f);
            sb.append(", top=");
            sb.append(f2);
            sb.append(", right=");
            sb.append(f3);
            sb.append(", bottom=");
            sb.append(f4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Float.hashCode(this.left) * 31) + java.lang.Float.hashCode(this.top)) * 31) + java.lang.Float.hashCode(this.right)) * 31) + java.lang.Float.hashCode(this.bottom);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof coil3.svg.Svg.ViewBox)) {
                return false;
            }
            coil3.svg.Svg.ViewBox viewBox = (coil3.svg.Svg.ViewBox) other;
            return java.lang.Float.compare(this.left, viewBox.left) == 0 && java.lang.Float.compare(this.top, viewBox.top) == 0 && java.lang.Float.compare(this.right, viewBox.right) == 0 && java.lang.Float.compare(this.bottom, viewBox.bottom) == 0;
        }

        public final coil3.svg.Svg.ViewBox copy(float left, float top, float right, float bottom) {
            return new coil3.svg.Svg.ViewBox(left, top, right, bottom);
        }

        /* renamed from: component4, reason: from getter */
        public final float getBottom() {
            return this.bottom;
        }

        /* renamed from: component3, reason: from getter */
        public final float getRight() {
            return this.right;
        }

        /* renamed from: component2, reason: from getter */
        public final float getTop() {
            return this.top;
        }

        /* renamed from: component1, reason: from getter */
        public final float getLeft() {
            return this.left;
        }

        public static /* synthetic */ coil3.svg.Svg.ViewBox copy$default(coil3.svg.Svg.ViewBox viewBox, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = viewBox.left;
            }
            if ((i & 2) != 0) {
                f2 = viewBox.top;
            }
            if ((i & 4) != 0) {
                f3 = viewBox.right;
            }
            if ((i & 8) != 0) {
                f4 = viewBox.bottom;
            }
            return viewBox.copy(f, f2, f3, f4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/svg/Svg$Parser;", "", "Lokio/BufferedSource;", "source", "Lcoil3/svg/Svg;", "parse", "(Lokio/BufferedSource;)Lcoil3/svg/Svg;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Parser {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final coil3.svg.Svg.Parser.Companion INSTANCE = coil3.svg.Svg.Parser.Companion.getHighSpeedVideoFpsRangesFor;
        public static final coil3.svg.Svg.Parser DEFAULT = coil3.svg.Svg$Parser$Companion$DEFAULT$1.getHighSpeedVideoFpsRanges;

        coil3.svg.Svg parse(okio.BufferedSource source);

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lcoil3/svg/Svg$Parser$Companion;", "", "<init>", "()V", "Lcoil3/svg/Svg$Parser;", "DEFAULT", "Lcoil3/svg/Svg$Parser;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            static final /* synthetic */ coil3.svg.Svg.Parser.Companion getHighSpeedVideoFpsRangesFor = new coil3.svg.Svg.Parser.Companion();

            private Companion() {
            }
        }
    }
}
