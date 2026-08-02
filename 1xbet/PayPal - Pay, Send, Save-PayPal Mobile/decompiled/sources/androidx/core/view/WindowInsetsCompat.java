package androidx.core.view;

/* loaded from: classes3.dex */
public class WindowInsetsCompat {
    public static final androidx.core.view.WindowInsetsCompat CONSUMED;
    private final androidx.core.view.WindowInsetsCompat.Impl Camera2StreamConfigurationMap;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            CONSUMED = androidx.core.view.WindowInsetsCompat.Impl34.CONSUMED;
        } else if (android.os.Build.VERSION.SDK_INT >= 30) {
            CONSUMED = androidx.core.view.WindowInsetsCompat.Impl30.CONSUMED;
        } else {
            CONSUMED = androidx.core.view.WindowInsetsCompat.Impl.CONSUMED;
        }
    }

    private WindowInsetsCompat(android.view.WindowInsets windowInsets) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl35(this, windowInsets);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl34(this, windowInsets);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl31(this, windowInsets);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl30(this, windowInsets);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl29(this, windowInsets);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl28(this, windowInsets);
        } else {
            this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl21(this, windowInsets);
        }
    }

    public WindowInsetsCompat(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            androidx.core.view.WindowInsetsCompat.Impl impl = windowInsetsCompat.Camera2StreamConfigurationMap;
            if (android.os.Build.VERSION.SDK_INT >= 35 && (impl instanceof androidx.core.view.WindowInsetsCompat.Impl35)) {
                this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl35(this, (androidx.core.view.WindowInsetsCompat.Impl35) impl);
            } else if (android.os.Build.VERSION.SDK_INT >= 34 && (impl instanceof androidx.core.view.WindowInsetsCompat.Impl34)) {
                this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl34(this, (androidx.core.view.WindowInsetsCompat.Impl34) impl);
            } else if (android.os.Build.VERSION.SDK_INT >= 31 && (impl instanceof androidx.core.view.WindowInsetsCompat.Impl31)) {
                this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl31(this, (androidx.core.view.WindowInsetsCompat.Impl31) impl);
            } else if (android.os.Build.VERSION.SDK_INT >= 30 && (impl instanceof androidx.core.view.WindowInsetsCompat.Impl30)) {
                this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl30(this, (androidx.core.view.WindowInsetsCompat.Impl30) impl);
            } else if (android.os.Build.VERSION.SDK_INT >= 29 && (impl instanceof androidx.core.view.WindowInsetsCompat.Impl29)) {
                this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl29(this, (androidx.core.view.WindowInsetsCompat.Impl29) impl);
            } else if (android.os.Build.VERSION.SDK_INT >= 28 && (impl instanceof androidx.core.view.WindowInsetsCompat.Impl28)) {
                this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl28(this, (androidx.core.view.WindowInsetsCompat.Impl28) impl);
            } else if (impl instanceof androidx.core.view.WindowInsetsCompat.Impl21) {
                this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl21(this, (androidx.core.view.WindowInsetsCompat.Impl21) impl);
            } else if (impl instanceof androidx.core.view.WindowInsetsCompat.Impl20) {
                this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl20(this, (androidx.core.view.WindowInsetsCompat.Impl20) impl);
            } else {
                this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl(this);
            }
            impl.copyWindowDataInto(this);
            return;
        }
        this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsCompat.Impl(this);
    }

    public static androidx.core.view.WindowInsetsCompat toWindowInsetsCompat(android.view.WindowInsets windowInsets) {
        return toWindowInsetsCompat(windowInsets, null);
    }

    public static androidx.core.view.WindowInsetsCompat toWindowInsetsCompat(android.view.WindowInsets windowInsets, android.view.View view) {
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = new androidx.core.view.WindowInsetsCompat((android.view.WindowInsets) androidx.core.util.Preconditions.checkNotNull(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.getHighSpeedVideoSizes(androidx.core.view.ViewCompat.getRootWindowInsets(view));
            windowInsetsCompat.getHighSpeedVideoFpsRanges(view.getRootView());
            windowInsetsCompat.getHighSpeedVideoFpsRangesFor(view.getWindowSystemUiVisibility());
        }
        return windowInsetsCompat;
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetLeft() {
        return this.Camera2StreamConfigurationMap.getSystemWindowInsets().left;
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetTop() {
        return this.Camera2StreamConfigurationMap.getSystemWindowInsets().top;
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetRight() {
        return this.Camera2StreamConfigurationMap.getSystemWindowInsets().right;
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetBottom() {
        return this.Camera2StreamConfigurationMap.getSystemWindowInsets().bottom;
    }

    @java.lang.Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.Camera2StreamConfigurationMap.getSystemWindowInsets().equals(androidx.core.graphics.Insets.NONE);
    }

    public boolean hasInsets() {
        return (getInsets(androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI()).equals(androidx.core.graphics.Insets.NONE) && getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI() ^ androidx.core.view.WindowInsetsCompat.Type.ime()).equals(androidx.core.graphics.Insets.NONE) && getDisplayCutout() == null) ? false : true;
    }

    public boolean isConsumed() {
        return this.Camera2StreamConfigurationMap.isConsumed();
    }

    public boolean isRound() {
        return this.Camera2StreamConfigurationMap.isRound();
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
        return this.Camera2StreamConfigurationMap.consumeSystemWindowInsets();
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(int i, int i2, int i3, int i4) {
        return new androidx.core.view.WindowInsetsCompat.Builder(this).setSystemWindowInsets(androidx.core.graphics.Insets.of(i, i2, i3, i4)).build();
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(android.graphics.Rect rect) {
        return new androidx.core.view.WindowInsetsCompat.Builder(this).setSystemWindowInsets(androidx.core.graphics.Insets.of(rect)).build();
    }

    @java.lang.Deprecated
    public int getStableInsetTop() {
        return this.Camera2StreamConfigurationMap.getStableInsets().top;
    }

    @java.lang.Deprecated
    public int getStableInsetLeft() {
        return this.Camera2StreamConfigurationMap.getStableInsets().left;
    }

    @java.lang.Deprecated
    public int getStableInsetRight() {
        return this.Camera2StreamConfigurationMap.getStableInsets().right;
    }

    @java.lang.Deprecated
    public int getStableInsetBottom() {
        return this.Camera2StreamConfigurationMap.getStableInsets().bottom;
    }

    @java.lang.Deprecated
    public boolean hasStableInsets() {
        return !this.Camera2StreamConfigurationMap.getStableInsets().equals(androidx.core.graphics.Insets.NONE);
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeStableInsets() {
        return this.Camera2StreamConfigurationMap.consumeStableInsets();
    }

    public androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
        return this.Camera2StreamConfigurationMap.getDisplayCutout();
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
        return this.Camera2StreamConfigurationMap.consumeDisplayCutout();
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getSystemWindowInsets() {
        return this.Camera2StreamConfigurationMap.getSystemWindowInsets();
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getStableInsets() {
        return this.Camera2StreamConfigurationMap.getStableInsets();
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
        return this.Camera2StreamConfigurationMap.getMandatorySystemGestureInsets();
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getTappableElementInsets() {
        return this.Camera2StreamConfigurationMap.getTappableElementInsets();
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getSystemGestureInsets() {
        return this.Camera2StreamConfigurationMap.getSystemGestureInsets();
    }

    public androidx.core.view.WindowInsetsCompat inset(androidx.core.graphics.Insets insets) {
        return inset(insets.left, insets.top, insets.right, insets.bottom);
    }

    public androidx.core.view.WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
        return this.Camera2StreamConfigurationMap.inset(i, i2, i3, i4);
    }

    public androidx.core.graphics.Insets getInsets(int i) {
        return this.Camera2StreamConfigurationMap.getInsets(i);
    }

    public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int i) {
        return this.Camera2StreamConfigurationMap.getInsetsIgnoringVisibility(i);
    }

    public boolean isVisible(int i) {
        return this.Camera2StreamConfigurationMap.isVisible(i);
    }

    public androidx.core.view.RoundedCornerCompat getRoundedCorner(int i) {
        return this.Camera2StreamConfigurationMap.getRoundedCorner(i);
    }

    public android.graphics.Rect getPrivacyIndicatorBounds() {
        return this.Camera2StreamConfigurationMap.getPrivacyIndicatorBounds();
    }

    public androidx.core.view.DisplayShapeCompat getDisplayShape() {
        return this.Camera2StreamConfigurationMap.getDisplayShape();
    }

    public java.util.List<android.graphics.Rect> getBoundingRects(int i) {
        return this.Camera2StreamConfigurationMap.getBoundingRects(i);
    }

    public java.util.List<android.graphics.Rect> getBoundingRectsIgnoringVisibility(int i) {
        return this.Camera2StreamConfigurationMap.getBoundingRectsIgnoringVisibility(i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.core.view.WindowInsetsCompat) {
            return androidx.core.util.ObjectsCompat.equals(this.Camera2StreamConfigurationMap, ((androidx.core.view.WindowInsetsCompat) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    public int hashCode() {
        androidx.core.view.WindowInsetsCompat.Impl impl = this.Camera2StreamConfigurationMap;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public android.view.WindowInsets toWindowInsets() {
        androidx.core.view.WindowInsetsCompat.Impl impl = this.Camera2StreamConfigurationMap;
        if (impl instanceof androidx.core.view.WindowInsetsCompat.Impl20) {
            return ((androidx.core.view.WindowInsetsCompat.Impl20) impl).mPlatformInsets;
        }
        return null;
    }

    static class Impl {
        static final androidx.core.view.WindowInsetsCompat CONSUMED = new androidx.core.view.WindowInsetsCompat.Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
        final androidx.core.view.WindowInsetsCompat mHost;

        void copyRootViewBounds(android.view.View view) {
        }

        void copyWindowDataInto(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        }

        androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
            return null;
        }

        android.graphics.Rect getPrivacyIndicatorBounds() {
            return null;
        }

        androidx.core.view.RoundedCornerCompat getRoundedCorner(int i) {
            return null;
        }

        void initDisplayShape(android.view.View view) {
        }

        void initTypeBoundingRectsMaps() {
        }

        boolean isConsumed() {
            return false;
        }

        boolean isRound() {
            return false;
        }

        boolean isVisible(int i) {
            return true;
        }

        public void setDisplayShape(androidx.core.view.DisplayShapeCompat displayShapeCompat) {
        }

        public void setOverriddenInsets(androidx.core.graphics.Insets[] insetsArr) {
        }

        void setRootViewData(androidx.core.graphics.Insets insets) {
        }

        void setRootWindowInsets(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        }

        public void setStableInsets(androidx.core.graphics.Insets insets) {
        }

        void setSystemUiVisibility(int i) {
        }

        void setTypeBoundingRectsMap(android.graphics.Rect[][] rectArr) {
        }

        void setTypeMaxBoundingRectsMap(android.graphics.Rect[][] rectArr) {
        }

        Impl(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            this.mHost = windowInsetsCompat;
        }

        androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
            return this.mHost;
        }

        androidx.core.view.WindowInsetsCompat consumeStableInsets() {
            return this.mHost;
        }

        androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
            return this.mHost;
        }

        androidx.core.graphics.Insets getSystemWindowInsets() {
            return androidx.core.graphics.Insets.NONE;
        }

        androidx.core.graphics.Insets getStableInsets() {
            return androidx.core.graphics.Insets.NONE;
        }

        androidx.core.graphics.Insets getSystemGestureInsets() {
            return getSystemWindowInsets();
        }

        androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
            return getSystemWindowInsets();
        }

        androidx.core.graphics.Insets getTappableElementInsets() {
            return getSystemWindowInsets();
        }

        androidx.core.view.WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            return CONSUMED;
        }

        androidx.core.graphics.Insets getInsets(int i) {
            return androidx.core.graphics.Insets.NONE;
        }

        androidx.core.graphics.Insets getInsetsIgnoringVisibility(int i) {
            if ((i & 8) != 0) {
                throw new java.lang.IllegalArgumentException("Unable to query the maximum insets for IME");
            }
            return androidx.core.graphics.Insets.NONE;
        }

        java.util.List<android.graphics.Rect> getBoundingRectsIgnoringVisibility(int i) {
            return java.util.Collections.emptyList();
        }

        androidx.core.view.DisplayShapeCompat getDisplayShape() {
            return androidx.core.view.DisplayShapeCompat.getHighSpeedVideoFpsRangesFor;
        }

        java.util.List<android.graphics.Rect> getBoundingRects(int i) {
            return java.util.Collections.emptyList();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.core.view.WindowInsetsCompat.Impl)) {
                return false;
            }
            androidx.core.view.WindowInsetsCompat.Impl impl = (androidx.core.view.WindowInsetsCompat.Impl) obj;
            return isRound() == impl.isRound() && isConsumed() == impl.isConsumed() && androidx.core.util.ObjectsCompat.equals(getSystemWindowInsets(), impl.getSystemWindowInsets()) && androidx.core.util.ObjectsCompat.equals(getStableInsets(), impl.getStableInsets()) && androidx.core.util.ObjectsCompat.equals(getDisplayCutout(), impl.getDisplayCutout());
        }

        public int hashCode() {
            boolean isRound = isRound();
            boolean isConsumed = isConsumed();
            return androidx.core.util.ObjectsCompat.hash(java.lang.Boolean.valueOf(isRound), java.lang.Boolean.valueOf(isConsumed), getSystemWindowInsets(), getStableInsets(), getDisplayCutout());
        }
    }

    static class Impl20 extends androidx.core.view.WindowInsetsCompat.Impl {
        private static final int SYSTEM_BAR_VISIBILITY_MASK = 6;
        private static java.lang.Class<?> sAttachInfoClass = null;
        private static java.lang.reflect.Field sAttachInfoField = null;
        private static java.lang.reflect.Method sGetViewRootImplMethod = null;
        private static java.lang.reflect.Field sVisibleInsetsField = null;
        private static boolean sVisibleRectReflectionFetched = false;
        androidx.core.view.DisplayShapeCompat mDisplayShapeCompat;
        private androidx.core.graphics.Insets[] mOverriddenInsets;
        final android.view.WindowInsets mPlatformInsets;
        int mRootViewHeight;
        androidx.core.graphics.Insets mRootViewVisibleInsets;
        int mRootViewWidth;
        private androidx.core.view.WindowInsetsCompat mRootWindowInsets;
        int mSystemUiVisibility;
        private androidx.core.graphics.Insets mSystemWindowInsets;
        private android.graphics.Rect[][] mTypeBoundingRectsMap;
        private android.graphics.Rect[][] mTypeMaxBoundingRectsMap;

        static boolean systemBarVisibilityEquals(int i, int i2) {
            return (i & 6) == (i2 & 6);
        }

        Impl20(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.mSystemWindowInsets = null;
            this.mTypeBoundingRectsMap = new android.graphics.Rect[10][];
            this.mTypeMaxBoundingRectsMap = new android.graphics.Rect[10][];
            this.mPlatformInsets = windowInsets;
        }

        Impl20(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl20 impl20) {
            this(windowInsetsCompat, new android.view.WindowInsets(impl20.mPlatformInsets));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isRound() {
            return this.mPlatformInsets.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsets(int i) {
            return getInsets(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int i) {
            return getInsets(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isVisible(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0 && !isTypeVisible(i2)) {
                    return false;
                }
            }
            return true;
        }

        private androidx.core.graphics.Insets getInsets(int i, boolean z) {
            androidx.core.graphics.Insets insets = androidx.core.graphics.Insets.NONE;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    insets = androidx.core.graphics.Insets.max(insets, getInsetsForType(i2, z));
                }
            }
            return insets;
        }

        protected androidx.core.graphics.Insets getInsetsForType(int i, boolean z) {
            androidx.core.graphics.Insets stableInsets;
            androidx.core.view.DisplayCutoutCompat displayCutout;
            if (i == 1) {
                if (z) {
                    return androidx.core.graphics.Insets.of(0, java.lang.Math.max(getRootStableInsets().top, getSystemWindowInsets().top), 0, 0);
                }
                if ((this.mSystemUiVisibility & 4) != 0) {
                    return androidx.core.graphics.Insets.NONE;
                }
                return androidx.core.graphics.Insets.of(0, getSystemWindowInsets().top, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    androidx.core.graphics.Insets rootStableInsets = getRootStableInsets();
                    androidx.core.graphics.Insets stableInsets2 = getStableInsets();
                    return androidx.core.graphics.Insets.of(java.lang.Math.max(rootStableInsets.left, stableInsets2.left), 0, java.lang.Math.max(rootStableInsets.right, stableInsets2.right), java.lang.Math.max(rootStableInsets.bottom, stableInsets2.bottom));
                }
                if ((this.mSystemUiVisibility & 2) != 0) {
                    return androidx.core.graphics.Insets.NONE;
                }
                androidx.core.graphics.Insets systemWindowInsets = getSystemWindowInsets();
                androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
                stableInsets = windowInsetsCompat != null ? windowInsetsCompat.getStableInsets() : null;
                int i2 = systemWindowInsets.bottom;
                if (stableInsets != null) {
                    i2 = java.lang.Math.min(i2, stableInsets.bottom);
                }
                return androidx.core.graphics.Insets.of(systemWindowInsets.left, 0, systemWindowInsets.right, i2);
            }
            if (i == 8) {
                androidx.core.graphics.Insets[] insetsArr = this.mOverriddenInsets;
                stableInsets = insetsArr != null ? insetsArr[androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(8)] : null;
                if (stableInsets != null) {
                    return stableInsets;
                }
                androidx.core.graphics.Insets systemWindowInsets2 = getSystemWindowInsets();
                androidx.core.graphics.Insets rootStableInsets2 = getRootStableInsets();
                if (systemWindowInsets2.bottom > rootStableInsets2.bottom) {
                    return androidx.core.graphics.Insets.of(0, 0, 0, systemWindowInsets2.bottom);
                }
                androidx.core.graphics.Insets insets = this.mRootViewVisibleInsets;
                if (insets != null && !insets.equals(androidx.core.graphics.Insets.NONE) && this.mRootViewVisibleInsets.bottom > rootStableInsets2.bottom) {
                    return androidx.core.graphics.Insets.of(0, 0, 0, this.mRootViewVisibleInsets.bottom);
                }
                return androidx.core.graphics.Insets.NONE;
            }
            if (i == 16) {
                return getSystemGestureInsets();
            }
            if (i == 32) {
                return getMandatorySystemGestureInsets();
            }
            if (i == 64) {
                return getTappableElementInsets();
            }
            if (i == 128) {
                androidx.core.view.WindowInsetsCompat windowInsetsCompat2 = this.mRootWindowInsets;
                if (windowInsetsCompat2 != null) {
                    displayCutout = windowInsetsCompat2.getDisplayCutout();
                } else {
                    displayCutout = getDisplayCutout();
                }
                if (displayCutout != null) {
                    return androidx.core.graphics.Insets.of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                }
                return androidx.core.graphics.Insets.NONE;
            }
            return androidx.core.graphics.Insets.NONE;
        }

        protected boolean isTypeVisible(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !getInsetsForType(i, false).equals(androidx.core.graphics.Insets.NONE);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final androidx.core.graphics.Insets getSystemWindowInsets() {
            if (this.mSystemWindowInsets == null) {
                this.mSystemWindowInsets = androidx.core.graphics.Insets.of(this.mPlatformInsets.getSystemWindowInsetLeft(), this.mPlatformInsets.getSystemWindowInsetTop(), this.mPlatformInsets.getSystemWindowInsetRight(), this.mPlatformInsets.getSystemWindowInsetBottom());
            }
            return this.mSystemWindowInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            androidx.core.view.WindowInsetsCompat.Builder builder = new androidx.core.view.WindowInsetsCompat.Builder(androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets));
            builder.setSystemWindowInsets(androidx.core.view.WindowInsetsCompat.getHighSpeedVideoSizes(getSystemWindowInsets(), i, i2, i3, i4));
            builder.setStableInsets(androidx.core.view.WindowInsetsCompat.getHighSpeedVideoSizes(getStableInsets(), i, i2, i3, i4));
            return builder.build();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyWindowDataInto(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.getHighSpeedVideoSizes(this.mRootWindowInsets);
            windowInsetsCompat.getHighSpeedVideoFpsRanges(this.mRootViewVisibleInsets);
            windowInsetsCompat.getHighSpeedVideoFpsRangesFor(this.mSystemUiVisibility);
            windowInsetsCompat.getHighSpeedVideoFpsRanges(this.mDisplayShapeCompat);
            windowInsetsCompat.Camera2StreamConfigurationMap(this.mTypeBoundingRectsMap);
            windowInsetsCompat.getHighSpeedVideoFpsRangesFor(this.mTypeMaxBoundingRectsMap);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootWindowInsets(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            this.mRootWindowInsets = windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootViewData(androidx.core.graphics.Insets insets) {
            this.mRootViewVisibleInsets = insets;
        }

        private androidx.core.graphics.Insets getRootStableInsets() {
            androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.getStableInsets();
            }
            return androidx.core.graphics.Insets.NONE;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyRootViewBounds(android.view.View view) {
            this.mRootViewWidth = view.getWidth();
            this.mRootViewHeight = view.getHeight();
            androidx.core.graphics.Insets visibleInsets = getVisibleInsets(view);
            if (visibleInsets == null) {
                visibleInsets = androidx.core.graphics.Insets.NONE;
            }
            setRootViewData(visibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void initDisplayShape(android.view.View view) {
            this.mDisplayShapeCompat = createDisplayShape(view);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void initTypeBoundingRectsMaps() {
            for (int i = 1; i <= 512; i <<= 1) {
                int highResolutionOutputSizeshNQ4ISI = androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(i);
                this.mTypeBoundingRectsMap[highResolutionOutputSizeshNQ4ISI] = getBoundingRectsFromInsets(getInsets(i));
                if (i != 8) {
                    this.mTypeMaxBoundingRectsMap[highResolutionOutputSizeshNQ4ISI] = getBoundingRectsFromInsets(getInsetsIgnoringVisibility(i));
                }
            }
        }

        private android.graphics.Rect[] getBoundingRectsFromInsets(androidx.core.graphics.Insets insets) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (insets.left != 0) {
                arrayList.add(new android.graphics.Rect(0, 0, insets.left, this.mRootViewHeight));
            }
            if (insets.top != 0) {
                arrayList.add(new android.graphics.Rect(0, 0, this.mRootViewWidth, insets.top));
            }
            if (insets.right != 0) {
                arrayList.add(new android.graphics.Rect(this.mRootViewWidth - insets.right, 0, this.mRootViewWidth, this.mRootViewHeight));
            }
            if (insets.bottom != 0) {
                arrayList.add(new android.graphics.Rect(0, this.mRootViewHeight - insets.bottom, this.mRootViewWidth, this.mRootViewHeight));
            }
            return (android.graphics.Rect[]) arrayList.toArray(new android.graphics.Rect[arrayList.size()]);
        }

        private androidx.core.view.DisplayShapeCompat createDisplayShape(android.view.View view) {
            android.view.Display display;
            if (view == null || (display = view.getDisplay()) == null) {
                return null;
            }
            android.graphics.Point point = new android.graphics.Point();
            display.getRealSize(point);
            if (this.mHost.isRound()) {
                return androidx.core.view.DisplayShapeCompat.create(point.x, point.y, true, 0, 0, 0, 0);
            }
            androidx.core.view.RoundedCornerCompat roundedCorner = androidx.core.view.DisplayCompat.getRoundedCorner(display, 0);
            androidx.core.view.RoundedCornerCompat roundedCorner2 = androidx.core.view.DisplayCompat.getRoundedCorner(display, 1);
            androidx.core.view.RoundedCornerCompat roundedCorner3 = androidx.core.view.DisplayCompat.getRoundedCorner(display, 2);
            androidx.core.view.RoundedCornerCompat roundedCorner4 = androidx.core.view.DisplayCompat.getRoundedCorner(display, 3);
            return androidx.core.view.DisplayShapeCompat.create(point.x, point.y, false, roundedCorner != null ? roundedCorner.getRadius() : 0, roundedCorner2 != null ? roundedCorner2.getRadius() : 0, roundedCorner3 != null ? roundedCorner3.getRadius() : 0, roundedCorner4 != null ? roundedCorner4.getRadius() : 0);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setDisplayShape(androidx.core.view.DisplayShapeCompat displayShapeCompat) {
            this.mDisplayShapeCompat = displayShapeCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setTypeBoundingRectsMap(android.graphics.Rect[][] rectArr) {
            java.util.Objects.requireNonNull(rectArr);
            this.mTypeBoundingRectsMap = (android.graphics.Rect[][]) rectArr.clone();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setTypeMaxBoundingRectsMap(android.graphics.Rect[][] rectArr) {
            java.util.Objects.requireNonNull(rectArr);
            this.mTypeMaxBoundingRectsMap = (android.graphics.Rect[][]) rectArr.clone();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setSystemUiVisibility(int i) {
            this.mSystemUiVisibility = i;
        }

        private androidx.core.graphics.Insets getVisibleInsets(android.view.View view) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!sVisibleRectReflectionFetched) {
                loadReflectionField();
            }
            java.lang.reflect.Method method = sGetViewRootImplMethod;
            if (method != null && sAttachInfoClass != null && sVisibleInsetsField != null) {
                try {
                    java.lang.Object invoke = method.invoke(view, new java.lang.Object[0]);
                    if (invoke == null) {
                        android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new java.lang.NullPointerException());
                        return null;
                    }
                    android.graphics.Rect rect = (android.graphics.Rect) sVisibleInsetsField.get(sAttachInfoField.get(invoke));
                    if (rect != null) {
                        return androidx.core.graphics.Insets.of(rect);
                    }
                    return null;
                } catch (java.lang.ReflectiveOperationException e) {
                    android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(androidx.core.graphics.Insets[] insetsArr) {
            this.mOverriddenInsets = insetsArr;
        }

        private static void loadReflectionField() {
            try {
                sGetViewRootImplMethod = android.view.View.class.getDeclaredMethod("getViewRootImpl", new java.lang.Class[0]);
                java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
                sAttachInfoClass = cls;
                sVisibleInsetsField = cls.getDeclaredField("mVisibleInsets");
                sAttachInfoField = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                sVisibleInsetsField.setAccessible(true);
                sAttachInfoField.setAccessible(true);
            } catch (java.lang.ReflectiveOperationException e) {
                android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            sVisibleRectReflectionFetched = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.DisplayShapeCompat getDisplayShape() {
            androidx.core.view.DisplayShapeCompat displayShapeCompat = this.mDisplayShapeCompat;
            return displayShapeCompat != null ? displayShapeCompat : androidx.core.view.DisplayShapeCompat.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(java.lang.Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            androidx.core.view.WindowInsetsCompat.Impl20 impl20 = (androidx.core.view.WindowInsetsCompat.Impl20) obj;
            return java.util.Objects.equals(this.mRootViewVisibleInsets, impl20.mRootViewVisibleInsets) && systemBarVisibilityEquals(this.mSystemUiVisibility, impl20.mSystemUiVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        java.util.List<android.graphics.Rect> getBoundingRects(int i) {
            return getBoundingRects(this.mTypeBoundingRectsMap, i);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        java.util.List<android.graphics.Rect> getBoundingRectsIgnoringVisibility(int i) {
            return getBoundingRects(this.mTypeMaxBoundingRectsMap, i);
        }

        private static java.util.List<android.graphics.Rect> getBoundingRects(android.graphics.Rect[][] rectArr, int i) {
            android.graphics.Rect[] rectArr2;
            android.graphics.Rect[] rectArr3 = null;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0 && (rectArr2 = rectArr[androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(i2)]) != null) {
                    if (rectArr3 == null) {
                        rectArr3 = rectArr2;
                    } else {
                        android.graphics.Rect[] rectArr4 = new android.graphics.Rect[rectArr3.length + rectArr2.length];
                        java.lang.System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                        java.lang.System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                        rectArr3 = rectArr4;
                    }
                }
            }
            if (rectArr3 == null) {
                return java.util.Collections.emptyList();
            }
            return java.util.Arrays.asList(rectArr3);
        }
    }

    static class Impl21 extends androidx.core.view.WindowInsetsCompat.Impl20 {
        private androidx.core.graphics.Insets mStableInsets;

        Impl21(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mStableInsets = null;
        }

        Impl21(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.mStableInsets = null;
            this.mStableInsets = impl21.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isConsumed() {
            return this.mPlatformInsets.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeStableInsets() {
            return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
            return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final androidx.core.graphics.Insets getStableInsets() {
            if (this.mStableInsets == null) {
                this.mStableInsets = androidx.core.graphics.Insets.of(this.mPlatformInsets.getStableInsetLeft(), this.mPlatformInsets.getStableInsetTop(), this.mPlatformInsets.getStableInsetRight(), this.mPlatformInsets.getStableInsetBottom());
            }
            return this.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(androidx.core.graphics.Insets insets) {
            this.mStableInsets = insets;
        }
    }

    static class Impl28 extends androidx.core.view.WindowInsetsCompat.Impl21 {
        Impl28(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl28(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
            return androidx.core.view.DisplayCutoutCompat.cf_(this.mPlatformInsets.getDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
            return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.core.view.WindowInsetsCompat.Impl28)) {
                return false;
            }
            androidx.core.view.WindowInsetsCompat.Impl28 impl28 = (androidx.core.view.WindowInsetsCompat.Impl28) obj;
            return java.util.Objects.equals(this.mPlatformInsets, impl28.mPlatformInsets) && java.util.Objects.equals(this.mRootViewVisibleInsets, impl28.mRootViewVisibleInsets) && systemBarVisibilityEquals(this.mSystemUiVisibility, impl28.mSystemUiVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.mPlatformInsets.hashCode();
        }
    }

    static class Impl29 extends androidx.core.view.WindowInsetsCompat.Impl28 {
        private androidx.core.graphics.Insets mMandatorySystemGestureInsets;
        private androidx.core.graphics.Insets mSystemGestureInsets;
        private androidx.core.graphics.Insets mTappableElementInsets;

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(androidx.core.graphics.Insets insets) {
        }

        Impl29(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        Impl29(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getSystemGestureInsets() {
            if (this.mSystemGestureInsets == null) {
                this.mSystemGestureInsets = androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getSystemGestureInsets());
            }
            return this.mSystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
            if (this.mMandatorySystemGestureInsets == null) {
                this.mMandatorySystemGestureInsets = androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getMandatorySystemGestureInsets());
            }
            return this.mMandatorySystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getTappableElementInsets() {
            if (this.mTappableElementInsets == null) {
                this.mTappableElementInsets = androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getTappableElementInsets());
            }
            return this.mTappableElementInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.inset(i, i2, i3, i4));
        }
    }

    static androidx.core.graphics.Insets getHighSpeedVideoSizes(androidx.core.graphics.Insets insets, int i, int i2, int i3, int i4) {
        int max = java.lang.Math.max(0, insets.left - i);
        int max2 = java.lang.Math.max(0, insets.top - i2);
        int max3 = java.lang.Math.max(0, insets.right - i3);
        int max4 = java.lang.Math.max(0, insets.bottom - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? insets : androidx.core.graphics.Insets.of(max, max2, max3, max4);
    }

    static class Impl30 extends androidx.core.view.WindowInsetsCompat.Impl29 {
        static final androidx.core.view.WindowInsetsCompat CONSUMED = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(android.view.WindowInsets.CONSUMED);

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        final void copyRootViewBounds(android.view.View view) {
        }

        Impl30(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl30(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsets(int i) {
            return androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getInsets(androidx.core.view.WindowInsetsCompat.TypeImpl30.getHighResolutionOutputSizeshNQ4ISI(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int i) {
            return androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.TypeImpl30.getHighResolutionOutputSizeshNQ4ISI(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            return this.mPlatformInsets.isVisible(androidx.core.view.WindowInsetsCompat.TypeImpl30.getHighResolutionOutputSizeshNQ4ISI(i));
        }
    }

    static class Impl31 extends androidx.core.view.WindowInsetsCompat.Impl30 {
        Impl31(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl31(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl31 impl31) {
            super(windowInsetsCompat, impl31);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.RoundedCornerCompat getRoundedCorner(int i) {
            return androidx.core.view.RoundedCornerCompat.cy_(this.mPlatformInsets.getRoundedCorner(i));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        android.graphics.Rect getPrivacyIndicatorBounds() {
            android.graphics.Rect privacyIndicatorBounds = this.mPlatformInsets.getPrivacyIndicatorBounds();
            if (privacyIndicatorBounds != null) {
                return new android.graphics.Rect(privacyIndicatorBounds);
            }
            return null;
        }
    }

    static class Impl34 extends androidx.core.view.WindowInsetsCompat.Impl31 {
        static final androidx.core.view.WindowInsetsCompat CONSUMED = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(android.view.WindowInsets.CONSUMED);

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        void initDisplayShape(android.view.View view) {
        }

        Impl34(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl34(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl34 impl34) {
            super(windowInsetsCompat, impl34);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsets(int i) {
            return androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getInsets(androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int i) {
            return androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            return this.mPlatformInsets.isVisible(androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.DisplayShapeCompat getDisplayShape() {
            if (this.mDisplayShapeCompat != null) {
                return this.mDisplayShapeCompat;
            }
            return androidx.core.view.DisplayShapeCompat.cs_(this.mPlatformInsets.getDisplayShape());
        }
    }

    static class Impl35 extends androidx.core.view.WindowInsetsCompat.Impl34 {
        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        void initTypeBoundingRectsMaps() {
        }

        Impl35(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl35(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl35 impl35) {
            super(windowInsetsCompat, impl35);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        java.util.List<android.graphics.Rect> getBoundingRects(int i) {
            return this.mPlatformInsets.getBoundingRects(androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        java.util.List<android.graphics.Rect> getBoundingRectsIgnoringVisibility(int i) {
            return this.mPlatformInsets.getBoundingRectsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i));
        }
    }

    public static final class Builder {
        private final androidx.core.view.WindowInsetsCompat.BuilderImpl getHighSpeedVideoFpsRanges;

        public Builder() {
            if (android.os.Build.VERSION.SDK_INT >= 36) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl36();
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl35();
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl34();
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl31();
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl30();
            } else if (android.os.Build.VERSION.SDK_INT >= 29) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl29();
            } else {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl20();
            }
        }

        public Builder(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            if (android.os.Build.VERSION.SDK_INT >= 36) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl36(windowInsetsCompat);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl35(windowInsetsCompat);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl34(windowInsetsCompat);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl31(windowInsetsCompat);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl30(windowInsetsCompat);
            } else if (android.os.Build.VERSION.SDK_INT >= 29) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl29(windowInsetsCompat);
            } else {
                this.getHighSpeedVideoFpsRanges = new androidx.core.view.WindowInsetsCompat.BuilderImpl20(windowInsetsCompat);
            }
        }

        @java.lang.Deprecated
        public final androidx.core.view.WindowInsetsCompat.Builder setSystemWindowInsets(androidx.core.graphics.Insets insets) {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(insets);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.core.view.WindowInsetsCompat.Builder setSystemGestureInsets(androidx.core.graphics.Insets insets) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(insets);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.core.view.WindowInsetsCompat.Builder setMandatorySystemGestureInsets(androidx.core.graphics.Insets insets) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(insets);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.core.view.WindowInsetsCompat.Builder setTappableElementInsets(androidx.core.graphics.Insets insets) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(insets);
            return this;
        }

        public final androidx.core.view.WindowInsetsCompat.Builder setInsets(int i, androidx.core.graphics.Insets insets) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(i, insets);
            return this;
        }

        public final androidx.core.view.WindowInsetsCompat.Builder setInsetsIgnoringVisibility(int i, androidx.core.graphics.Insets insets) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(i, insets);
            return this;
        }

        public final androidx.core.view.WindowInsetsCompat.Builder setVisible(int i, boolean z) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(i, z);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.core.view.WindowInsetsCompat.Builder setStableInsets(androidx.core.graphics.Insets insets) {
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(insets);
            return this;
        }

        public final androidx.core.view.WindowInsetsCompat.Builder setDisplayCutout(androidx.core.view.DisplayCutoutCompat displayCutoutCompat) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(displayCutoutCompat);
            return this;
        }

        public final androidx.core.view.WindowInsetsCompat.Builder setRoundedCorner(int i, androidx.core.view.RoundedCornerCompat roundedCornerCompat) {
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(i, roundedCornerCompat);
            return this;
        }

        public final androidx.core.view.WindowInsetsCompat.Builder setPrivacyIndicatorBounds(android.graphics.Rect rect) {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(rect);
            return this;
        }

        public final androidx.core.view.WindowInsetsCompat.Builder setBoundingRects(int i, java.util.List<android.graphics.Rect> list) {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(i, list);
            return this;
        }

        public final androidx.core.view.WindowInsetsCompat.Builder setBoundingRectsIgnoringVisibility(int i, java.util.List<android.graphics.Rect> list) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(i, list);
            return this;
        }

        public final androidx.core.view.WindowInsetsCompat.Builder setDisplayShape(androidx.core.view.DisplayShapeCompat displayShapeCompat) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(displayShapeCompat);
            return this;
        }

        public final androidx.core.view.WindowInsetsCompat build() {
            return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
        }
    }

    static class BuilderImpl {
        private final androidx.core.view.WindowInsetsCompat Camera2StreamConfigurationMap;
        android.graphics.Rect[][] getHighResolutionOutputSizeshNQ4ISI;
        androidx.core.graphics.Insets[] getHighSpeedVideoFpsRanges;
        android.graphics.Rect[][] getHighSpeedVideoFpsRangesFor;
        androidx.core.view.DisplayShapeCompat getHighSpeedVideoSizes;

        void Camera2StreamConfigurationMap(android.graphics.Rect rect) {
        }

        void Camera2StreamConfigurationMap(androidx.core.graphics.Insets insets) {
        }

        void getHighResolutionOutputSizeshNQ4ISI(int i, androidx.core.view.RoundedCornerCompat roundedCornerCompat) {
        }

        void getHighResolutionOutputSizeshNQ4ISI(androidx.core.graphics.Insets insets) {
        }

        void getHighSpeedVideoFpsRanges(androidx.core.graphics.Insets insets) {
        }

        void getHighSpeedVideoFpsRanges(androidx.core.view.DisplayCutoutCompat displayCutoutCompat) {
        }

        void getHighSpeedVideoFpsRangesFor(int i, boolean z) {
        }

        void getHighSpeedVideoFpsRangesFor(androidx.core.graphics.Insets insets) {
        }

        void getHighSpeedVideoSizes(androidx.core.graphics.Insets insets) {
        }

        BuilderImpl() {
            this(new androidx.core.view.WindowInsetsCompat((androidx.core.view.WindowInsetsCompat) null));
        }

        BuilderImpl(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Rect[10][];
            this.getHighSpeedVideoFpsRangesFor = new android.graphics.Rect[10][];
            this.Camera2StreamConfigurationMap = windowInsetsCompat;
            getHighSpeedVideoFpsRanges(windowInsetsCompat);
        }

        void getHighSpeedVideoFpsRangesFor(int i, androidx.core.graphics.Insets insets) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new androidx.core.graphics.Insets[10];
            }
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.getHighSpeedVideoFpsRanges[androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(i2)] = insets;
                }
            }
        }

        void getHighSpeedVideoSizes(int i, androidx.core.graphics.Insets insets) {
            if (i == 8) {
                throw new java.lang.IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        void getHighSpeedVideoFpsRangesFor(androidx.core.view.DisplayShapeCompat displayShapeCompat) {
            this.getHighSpeedVideoSizes = displayShapeCompat;
        }

        void Camera2StreamConfigurationMap(int i, java.util.List<android.graphics.Rect> list) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI[androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(i2)] = (android.graphics.Rect[]) list.toArray(new android.graphics.Rect[list.size()]);
                }
            }
        }

        void getHighSpeedVideoFpsRanges(int i, java.util.List<android.graphics.Rect> list) {
            if ((i & 8) != 0) {
                throw new java.lang.IllegalArgumentException("Maximum bounding rects not available for IME");
            }
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.getHighSpeedVideoFpsRangesFor[androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(i2)] = (android.graphics.Rect[]) list.toArray(new android.graphics.Rect[list.size()]);
                }
            }
        }

        void getHighSpeedVideoFpsRanges(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            for (int i = 1; i <= 512; i <<= 1) {
                java.util.List<android.graphics.Rect> boundingRects = windowInsetsCompat.getBoundingRects(i);
                int highResolutionOutputSizeshNQ4ISI = androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(i);
                this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI] = (android.graphics.Rect[]) boundingRects.toArray(new android.graphics.Rect[boundingRects.size()]);
                if (i != 8) {
                    java.util.List<android.graphics.Rect> boundingRectsIgnoringVisibility = windowInsetsCompat.getBoundingRectsIgnoringVisibility(i);
                    this.getHighSpeedVideoFpsRangesFor[highResolutionOutputSizeshNQ4ISI] = (android.graphics.Rect[]) boundingRectsIgnoringVisibility.toArray(new android.graphics.Rect[boundingRectsIgnoringVisibility.size()]);
                }
            }
        }

        protected final void Camera2StreamConfigurationMap() {
            androidx.core.graphics.Insets[] insetsArr = this.getHighSpeedVideoFpsRanges;
            if (insetsArr != null) {
                androidx.core.graphics.Insets insets = insetsArr[androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(1)];
                androidx.core.graphics.Insets insets2 = this.getHighSpeedVideoFpsRanges[androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(2)];
                if (insets2 == null) {
                    insets2 = this.Camera2StreamConfigurationMap.getInsets(2);
                }
                if (insets == null) {
                    insets = this.Camera2StreamConfigurationMap.getInsets(1);
                }
                Camera2StreamConfigurationMap(androidx.core.graphics.Insets.max(insets, insets2));
                androidx.core.graphics.Insets insets3 = this.getHighSpeedVideoFpsRanges[androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(16)];
                if (insets3 != null) {
                    getHighSpeedVideoFpsRanges(insets3);
                }
                androidx.core.graphics.Insets insets4 = this.getHighSpeedVideoFpsRanges[androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(32)];
                if (insets4 != null) {
                    getHighSpeedVideoFpsRangesFor(insets4);
                }
                androidx.core.graphics.Insets insets5 = this.getHighSpeedVideoFpsRanges[androidx.core.view.WindowInsetsCompat.Type.getHighResolutionOutputSizeshNQ4ISI(64)];
                if (insets5 != null) {
                    getHighSpeedVideoSizes(insets5);
                }
            }
        }

        androidx.core.view.WindowInsetsCompat getHighSpeedVideoSizes() {
            Camera2StreamConfigurationMap();
            return this.Camera2StreamConfigurationMap;
        }
    }

    void getHighSpeedVideoSizes(androidx.core.graphics.Insets[] insetsArr) {
        this.Camera2StreamConfigurationMap.setOverriddenInsets(insetsArr);
    }

    static class BuilderImpl20 extends androidx.core.view.WindowInsetsCompat.BuilderImpl {
        private static java.lang.reflect.Constructor<android.view.WindowInsets> Camera2StreamConfigurationMap = null;
        private static boolean getInputFormats = false;
        private static java.lang.reflect.Field getInputSizeshNQ4ISI = null;
        private static boolean getOutputMinFrameDuration = false;
        private android.view.WindowInsets getHighSpeedVideoSizesFor;
        private androidx.core.graphics.Insets getOutputFormats;

        BuilderImpl20() {
            this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRangesFor();
        }

        BuilderImpl20(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.getHighSpeedVideoSizesFor = windowInsetsCompat.toWindowInsets();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void Camera2StreamConfigurationMap(androidx.core.graphics.Insets insets) {
            android.view.WindowInsets windowInsets = this.getHighSpeedVideoSizesFor;
            if (windowInsets != null) {
                this.getHighSpeedVideoSizesFor = windowInsets.replaceSystemWindowInsets(insets.left, insets.top, insets.right, insets.bottom);
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighResolutionOutputSizeshNQ4ISI(androidx.core.graphics.Insets insets) {
            this.getOutputFormats = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        androidx.core.view.WindowInsetsCompat getHighSpeedVideoSizes() {
            Camera2StreamConfigurationMap();
            androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.getHighSpeedVideoSizesFor);
            windowInsetsCompat.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
            windowInsetsCompat.getHighSpeedVideoSizes(this.getOutputFormats);
            windowInsetsCompat.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
            windowInsetsCompat.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
            windowInsetsCompat.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
            return windowInsetsCompat;
        }

        private static android.view.WindowInsets getHighSpeedVideoFpsRangesFor() {
            if (!getOutputMinFrameDuration) {
                try {
                    getInputSizeshNQ4ISI = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (java.lang.ReflectiveOperationException unused) {
                }
                getOutputMinFrameDuration = true;
            }
            java.lang.reflect.Field field = getInputSizeshNQ4ISI;
            if (field != null) {
                try {
                    android.view.WindowInsets windowInsets = (android.view.WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new android.view.WindowInsets(windowInsets);
                    }
                } catch (java.lang.ReflectiveOperationException unused2) {
                }
            }
            if (!getInputFormats) {
                try {
                    Camera2StreamConfigurationMap = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
                } catch (java.lang.ReflectiveOperationException unused3) {
                }
                getInputFormats = true;
            }
            java.lang.reflect.Constructor<android.view.WindowInsets> constructor = Camera2StreamConfigurationMap;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new android.graphics.Rect());
                } catch (java.lang.ReflectiveOperationException unused4) {
                }
            }
            return null;
        }
    }

    void getHighSpeedVideoSizes(androidx.core.graphics.Insets insets) {
        this.Camera2StreamConfigurationMap.setStableInsets(insets);
    }

    void getHighSpeedVideoFpsRanges(androidx.core.view.DisplayShapeCompat displayShapeCompat) {
        this.Camera2StreamConfigurationMap.setDisplayShape(displayShapeCompat);
    }

    void Camera2StreamConfigurationMap(android.graphics.Rect[][] rectArr) {
        this.Camera2StreamConfigurationMap.setTypeBoundingRectsMap(rectArr);
    }

    void getHighSpeedVideoFpsRangesFor(android.graphics.Rect[][] rectArr) {
        this.Camera2StreamConfigurationMap.setTypeMaxBoundingRectsMap(rectArr);
    }

    static class BuilderImpl29 extends androidx.core.view.WindowInsetsCompat.BuilderImpl {
        final android.view.WindowInsets.Builder Camera2StreamConfigurationMap;

        BuilderImpl29() {
            this.Camera2StreamConfigurationMap = new android.view.WindowInsets.Builder();
        }

        BuilderImpl29(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            android.view.WindowInsets.Builder builder;
            android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                builder = new android.view.WindowInsets.Builder(windowInsets);
            } else {
                builder = new android.view.WindowInsets.Builder();
            }
            this.Camera2StreamConfigurationMap = builder;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void Camera2StreamConfigurationMap(androidx.core.graphics.Insets insets) {
            this.Camera2StreamConfigurationMap.setSystemWindowInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRanges(androidx.core.graphics.Insets insets) {
            this.Camera2StreamConfigurationMap.setSystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRangesFor(androidx.core.graphics.Insets insets) {
            this.Camera2StreamConfigurationMap.setMandatorySystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoSizes(androidx.core.graphics.Insets insets) {
            this.Camera2StreamConfigurationMap.setTappableElementInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighResolutionOutputSizeshNQ4ISI(androidx.core.graphics.Insets insets) {
            this.Camera2StreamConfigurationMap.setStableInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRanges(androidx.core.view.DisplayCutoutCompat displayCutoutCompat) {
            this.Camera2StreamConfigurationMap.setDisplayCutout(displayCutoutCompat != null ? displayCutoutCompat.cg_() : null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        androidx.core.view.WindowInsetsCompat getHighSpeedVideoSizes() {
            Camera2StreamConfigurationMap();
            androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.Camera2StreamConfigurationMap.build());
            windowInsetsCompat.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
            windowInsetsCompat.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
            windowInsetsCompat.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
            windowInsetsCompat.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
            return windowInsetsCompat;
        }
    }

    static class BuilderImpl30 extends androidx.core.view.WindowInsetsCompat.BuilderImpl29 {
        BuilderImpl30() {
        }

        BuilderImpl30(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRangesFor(int i, androidx.core.graphics.Insets insets) {
            this.Camera2StreamConfigurationMap.setInsets(androidx.core.view.WindowInsetsCompat.TypeImpl30.getHighResolutionOutputSizeshNQ4ISI(i), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoSizes(int i, androidx.core.graphics.Insets insets) {
            this.Camera2StreamConfigurationMap.setInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.TypeImpl30.getHighResolutionOutputSizeshNQ4ISI(i), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRangesFor(int i, boolean z) {
            this.Camera2StreamConfigurationMap.setVisible(androidx.core.view.WindowInsetsCompat.TypeImpl30.getHighResolutionOutputSizeshNQ4ISI(i), z);
        }
    }

    static class BuilderImpl31 extends androidx.core.view.WindowInsetsCompat.BuilderImpl30 {
        BuilderImpl31() {
        }

        BuilderImpl31(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighResolutionOutputSizeshNQ4ISI(int i, androidx.core.view.RoundedCornerCompat roundedCornerCompat) {
            this.Camera2StreamConfigurationMap.setRoundedCorner(androidx.core.view.RoundedCornerCompat.getHighResolutionOutputSizeshNQ4ISI(i), androidx.core.view.RoundedCornerCompat.cx_(roundedCornerCompat));
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void Camera2StreamConfigurationMap(android.graphics.Rect rect) {
            this.Camera2StreamConfigurationMap.setPrivacyIndicatorBounds(rect != null ? new android.graphics.Rect(rect) : null);
        }
    }

    static class BuilderImpl34 extends androidx.core.view.WindowInsetsCompat.BuilderImpl31 {
        BuilderImpl34() {
        }

        BuilderImpl34(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRangesFor(int i, androidx.core.graphics.Insets insets) {
            this.Camera2StreamConfigurationMap.setInsets(androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoSizes(int i, androidx.core.graphics.Insets insets) {
            this.Camera2StreamConfigurationMap.setInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRangesFor(int i, boolean z) {
            this.Camera2StreamConfigurationMap.setVisible(androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i), z);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRangesFor(androidx.core.view.DisplayShapeCompat displayShapeCompat) {
            android.view.DisplayShape ct_ = androidx.core.view.DisplayShapeCompat.ct_(displayShapeCompat);
            if (ct_ != null) {
                this.Camera2StreamConfigurationMap.setDisplayShape(ct_);
            } else {
                this.getHighSpeedVideoSizes = displayShapeCompat;
            }
        }
    }

    static class BuilderImpl35 extends androidx.core.view.WindowInsetsCompat.BuilderImpl34 {
        private boolean getHighSpeedVideoSizesFor;
        private boolean getOutputMinFrameDuration;

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRanges(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        }

        BuilderImpl35() {
            this.getOutputMinFrameDuration = false;
            this.getHighSpeedVideoSizesFor = false;
        }

        BuilderImpl35(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.getOutputMinFrameDuration = false;
            this.getHighSpeedVideoSizesFor = false;
            if (windowInsetsCompat.isConsumed()) {
                return;
            }
            this.getOutputMinFrameDuration = true;
            this.getHighSpeedVideoSizesFor = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl34, androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRangesFor(int i, androidx.core.graphics.Insets insets) {
            super.getHighSpeedVideoFpsRangesFor(i, insets);
            this.getOutputMinFrameDuration = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl34, androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoSizes(int i, androidx.core.graphics.Insets insets) {
            super.getHighSpeedVideoSizes(i, insets);
            this.getHighSpeedVideoSizesFor = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void Camera2StreamConfigurationMap(int i, java.util.List<android.graphics.Rect> list) {
            int highSpeedVideoFpsRanges = androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i);
            this.Camera2StreamConfigurationMap.setBoundingRects(highSpeedVideoFpsRanges, list);
            if (this.getOutputMinFrameDuration) {
                return;
            }
            this.getOutputMinFrameDuration = true;
            this.Camera2StreamConfigurationMap.setInsets(highSpeedVideoFpsRanges, android.graphics.Insets.NONE);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRanges(int i, java.util.List<android.graphics.Rect> list) {
            int highSpeedVideoFpsRanges = androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i);
            this.Camera2StreamConfigurationMap.setBoundingRectsIgnoringVisibility(highSpeedVideoFpsRanges, list);
            if (this.getHighSpeedVideoSizesFor) {
                return;
            }
            this.getHighSpeedVideoSizesFor = true;
            this.Camera2StreamConfigurationMap.setInsetsIgnoringVisibility(highSpeedVideoFpsRanges, android.graphics.Insets.NONE);
        }
    }

    static class BuilderImpl36 extends androidx.core.view.WindowInsetsCompat.BuilderImpl35 {
        BuilderImpl36() {
        }

        BuilderImpl36(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl35, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void Camera2StreamConfigurationMap(int i, java.util.List<android.graphics.Rect> list) {
            this.Camera2StreamConfigurationMap.setBoundingRects(androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i), list);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl35, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void getHighSpeedVideoFpsRanges(int i, java.util.List<android.graphics.Rect> list) {
            this.Camera2StreamConfigurationMap.setBoundingRectsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.TypeImpl34.getHighSpeedVideoFpsRanges(i), list);
        }
    }

    public static final class Type {

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        public static int captionBar() {
            return 4;
        }

        public static int displayCutout() {
            return 128;
        }

        static int getHighResolutionOutputSizeshNQ4ISI() {
            return -1;
        }

        public static int ime() {
            return 8;
        }

        public static int mandatorySystemGestures() {
            return 32;
        }

        public static int navigationBars() {
            return 2;
        }

        public static int statusBars() {
            return 1;
        }

        public static int systemBars() {
            return my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
        }

        public static int systemGestures() {
            return 16;
        }

        public static int systemOverlays() {
            return 512;
        }

        public static int tappableElement() {
            return 64;
        }

        private Type() {
        }

        static int getHighResolutionOutputSizeshNQ4ISI(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            if (i == 512) {
                return 9;
            }
            throw new java.lang.IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=".concat(java.lang.String.valueOf(i)));
        }
    }

    /* loaded from: classes7.dex */
    public static final class Side {
        public static final int BOTTOM = 8;
        public static final int LEFT = 1;
        public static final int RIGHT = 4;
        public static final int TOP = 2;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface InsetsSide {
        }

        public static int all() {
            return 15;
        }

        private Side() {
        }
    }

    static final class TypeImpl30 {
        private TypeImpl30() {
        }

        static int getHighResolutionOutputSizeshNQ4ISI(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = android.view.WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = android.view.WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = android.view.WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = android.view.WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = android.view.WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = android.view.WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = android.view.WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = android.view.WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static final class TypeImpl34 {
        private TypeImpl34() {
        }

        static int getHighSpeedVideoFpsRanges(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = android.view.WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = android.view.WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = android.view.WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = android.view.WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = android.view.WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = android.view.WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = android.view.WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = android.view.WindowInsets.Type.displayCutout();
                    } else if (i3 == 512) {
                        statusBars = android.view.WindowInsets.Type.systemOverlays();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    void getHighSpeedVideoSizes(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        this.Camera2StreamConfigurationMap.setRootWindowInsets(windowInsetsCompat);
    }

    void getHighSpeedVideoFpsRanges(androidx.core.graphics.Insets insets) {
        this.Camera2StreamConfigurationMap.setRootViewData(insets);
    }

    void getHighSpeedVideoFpsRanges(android.view.View view) {
        this.Camera2StreamConfigurationMap.copyRootViewBounds(view);
        this.Camera2StreamConfigurationMap.initDisplayShape(view);
        this.Camera2StreamConfigurationMap.initTypeBoundingRectsMaps();
    }

    void getHighSpeedVideoFpsRangesFor(int i) {
        this.Camera2StreamConfigurationMap.setSystemUiVisibility(i);
    }
}
