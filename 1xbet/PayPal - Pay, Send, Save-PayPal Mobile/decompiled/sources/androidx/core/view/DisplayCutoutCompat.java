package androidx.core.view;

/* loaded from: classes3.dex */
public final class DisplayCutoutCompat {
    private final android.view.DisplayCutout getHighSpeedVideoFpsRangesFor;

    public DisplayCutoutCompat(android.graphics.Rect rect, java.util.List<android.graphics.Rect> list) {
        this(android.os.Build.VERSION.SDK_INT >= 28 ? androidx.core.view.DisplayCutoutCompat.Api28Impl.ch_(rect, list) : null);
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, androidx.core.graphics.Insets insets2) {
        this(ce_(insets, rect, rect2, rect3, rect4, insets2, null));
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, androidx.core.graphics.Insets insets2, android.graphics.Path path) {
        this(ce_(insets, rect, rect2, rect3, rect4, insets2, path));
    }

    private static android.view.DisplayCutout ce_(androidx.core.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, androidx.core.graphics.Insets insets2, android.graphics.Path path) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.view.DisplayCutoutCompat.Api33Impl.cr_(insets.toPlatformInsets(), rect, rect2, rect3, rect4, insets2.toPlatformInsets(), path);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.DisplayCutoutCompat.Api30Impl.co_(insets.toPlatformInsets(), rect, rect2, rect3, rect4, insets2.toPlatformInsets());
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.view.DisplayCutoutCompat.Api29Impl.cn_(insets.toPlatformInsets(), rect, rect2, rect3, rect4);
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return null;
        }
        android.graphics.Rect rect5 = new android.graphics.Rect(insets.left, insets.top, insets.right, insets.bottom);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return androidx.core.view.DisplayCutoutCompat.Api28Impl.ch_(rect5, arrayList);
    }

    private DisplayCutoutCompat(android.view.DisplayCutout displayCutout) {
        this.getHighSpeedVideoFpsRangesFor = displayCutout;
    }

    public final int getSafeInsetTop() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.DisplayCutoutCompat.Api28Impl.cm_(this.getHighSpeedVideoFpsRangesFor);
        }
        return 0;
    }

    public final int getSafeInsetBottom() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.DisplayCutoutCompat.Api28Impl.cj_(this.getHighSpeedVideoFpsRangesFor);
        }
        return 0;
    }

    public final int getSafeInsetLeft() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.DisplayCutoutCompat.Api28Impl.ck_(this.getHighSpeedVideoFpsRangesFor);
        }
        return 0;
    }

    public final int getSafeInsetRight() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.DisplayCutoutCompat.Api28Impl.cl_(this.getHighSpeedVideoFpsRangesFor);
        }
        return 0;
    }

    public final java.util.List<android.graphics.Rect> getBoundingRects() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.DisplayCutoutCompat.Api28Impl.ci_(this.getHighSpeedVideoFpsRangesFor);
        }
        return java.util.Collections.emptyList();
    }

    public final androidx.core.graphics.Insets getWaterfallInsets() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.graphics.Insets.toCompatInsets(androidx.core.view.DisplayCutoutCompat.Api30Impl.cp_(this.getHighSpeedVideoFpsRangesFor));
        }
        return androidx.core.graphics.Insets.NONE;
    }

    public final android.graphics.Path getCutoutPath() {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.view.DisplayCutoutCompat.Api31Impl.cq_(this.getHighSpeedVideoFpsRangesFor);
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return androidx.core.util.ObjectsCompat.equals(this.getHighSpeedVideoFpsRangesFor, ((androidx.core.view.DisplayCutoutCompat) obj).getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        android.view.DisplayCutout displayCutout = this.getHighSpeedVideoFpsRangesFor;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayCutoutCompat{");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("}");
        return sb.toString();
    }

    static androidx.core.view.DisplayCutoutCompat cf_(android.view.DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new androidx.core.view.DisplayCutoutCompat(displayCutout);
    }

    final android.view.DisplayCutout cg_() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.view.DisplayCutout ch_(android.graphics.Rect rect, java.util.List<android.graphics.Rect> list) {
            return new android.view.DisplayCutout(rect, list);
        }

        static int cm_(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        static int cj_(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int ck_(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int cl_(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static java.util.List<android.graphics.Rect> ci_(android.view.DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }
    }

    /* loaded from: classes7.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        static android.view.DisplayCutout cn_(android.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4) {
            return new android.view.DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* loaded from: classes7.dex */
    static class Api30Impl {
        private Api30Impl() {
        }

        static android.view.DisplayCutout co_(android.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, android.graphics.Insets insets2) {
            return new android.view.DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        static android.graphics.Insets cp_(android.view.DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* loaded from: classes7.dex */
    static class Api31Impl {
        private Api31Impl() {
        }

        static android.graphics.Path cq_(android.view.DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }

    /* loaded from: classes7.dex */
    static class Api33Impl {
        private Api33Impl() {
        }

        static android.view.DisplayCutout cr_(android.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, android.graphics.Insets insets2, android.graphics.Path path) {
            android.view.DisplayCutout.Builder waterfallInsets = new android.view.DisplayCutout.Builder().setSafeInsets(insets).setWaterfallInsets(insets2);
            if (rect != null) {
                waterfallInsets.setBoundingRectLeft(rect);
            }
            if (rect2 != null) {
                waterfallInsets.setBoundingRectTop(rect2);
            }
            if (rect3 != null) {
                waterfallInsets.setBoundingRectRight(rect3);
            }
            if (rect4 != null) {
                waterfallInsets.setBoundingRectBottom(rect4);
            }
            if (path != null) {
                waterfallInsets.setCutoutPath(path);
            }
            return waterfallInsets.build();
        }
    }
}
