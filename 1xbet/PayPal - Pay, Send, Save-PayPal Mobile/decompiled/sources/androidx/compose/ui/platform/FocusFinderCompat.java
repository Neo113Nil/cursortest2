package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ+\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJM\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\b2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0017j\b\u0012\u0004\u0012\u00020\u0006`\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJC\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0017j\b\u0012\u0004\u0012\u00020\u0006`\u00182\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0012\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u001fJK\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\f2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0017j\b\u0012\u0004\u0012\u00020\u0006`\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010 J;\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0017j\b\u0012\u0004\u0012\u00020\u0006`\u00182\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010!J;\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0017j\b\u0012\u0004\u0012\u00020\u0006`\u00182\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010!J\u0017\u0010\u001a\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010#R\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010\u0015\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0017j\b\u0012\u0004\u0012\u00020\u0006`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "focused", "", "direction", "findNextFocus", "(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "Landroid/graphics/Rect;", "focusedRect", "findNextFocusFromRect", "(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/ViewGroup;", "p2", "Camera2StreamConfigurationMap", "p3", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "p4", "getHighSpeedVideoSizes", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;ILjava/util/ArrayList;)Landroid/view/View;", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;Ljava/util/ArrayList;I)Landroid/view/View;", "(Landroid/view/View;Ljava/util/ArrayList;I)Landroid/view/View;", "", "(I)Z", "Landroid/graphics/Rect;", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "getHighSpeedVideoSizesFor", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/ArrayList;", "Companion", "UserSpecifiedFocusComparator"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusFinderCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.FocusFinderCompat.Companion INSTANCE = new androidx.compose.ui.platform.FocusFinderCompat.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.ui.platform.FocusFinderCompat$Companion$FocusFinderThreadLocal$1 Camera2StreamConfigurationMap = new java.lang.ThreadLocal<androidx.compose.ui.platform.FocusFinderCompat>() { // from class: androidx.compose.ui.platform.FocusFinderCompat$Companion$FocusFinderThreadLocal$1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public final androidx.compose.ui.platform.FocusFinderCompat initialValue() {
            return new androidx.compose.ui.platform.FocusFinderCompat();
        }
    };

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Rect();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.graphics.Rect getHighSpeedVideoFpsRanges = new android.graphics.Rect();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.graphics.Rect getHighSpeedVideoSizes = new android.graphics.Rect();

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator Camera2StreamConfigurationMap = new androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator(new androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter() { // from class: androidx.compose.ui.platform.FocusFinderCompat$$ExternalSyntheticLambda0
        @Override // androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter
        public final android.view.View get(android.view.View view, android.view.View view2) {
            android.view.View highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.ui.platform.FocusFinderCompat.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.platform.FocusFinderCompat.this, view, view2);
            return highSpeedVideoFpsRangesFor;
        }
    });
    private final java.util.ArrayList<android.view.View> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();

    private final boolean getHighSpeedVideoSizes(int p0) {
        return (p0 == 0 || p0 == -1) ? false : true;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/platform/FocusFinderCompat;", "getInstance", "()Landroidx/compose/ui/platform/FocusFinderCompat;", "instance"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.platform.FocusFinderCompat getInstance() {
            androidx.compose.ui.platform.FocusFinderCompat focusFinderCompat = androidx.compose.ui.platform.FocusFinderCompat.Camera2StreamConfigurationMap.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(focusFinderCompat);
            return focusFinderCompat;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.view.View getHighSpeedVideoFpsRangesFor(androidx.compose.ui.platform.FocusFinderCompat focusFinderCompat, android.view.View view, android.view.View view2) {
        android.view.View highResolutionOutputSizeshNQ4ISI;
        if (!focusFinderCompat.getHighSpeedVideoSizes(view2.getNextFocusForwardId())) {
            return null;
        }
        highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.FocusFinderCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(view2, view, 2);
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final android.view.View findNextFocus(android.view.ViewGroup root, android.view.View focused, int direction) {
        android.view.ViewGroup highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(root, focused);
        android.view.View Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, focused, direction);
        if (Camera2StreamConfigurationMap2 != null) {
            return Camera2StreamConfigurationMap2;
        }
        java.util.ArrayList<android.view.View> arrayList = this.getHighSpeedVideoFpsRangesFor;
        try {
            arrayList.clear();
            androidx.compose.ui.platform.FocusFinderCompat_androidKt.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, arrayList, direction);
            if (!arrayList.isEmpty()) {
                Camera2StreamConfigurationMap2 = getHighSpeedVideoSizes(highSpeedVideoFpsRanges, focused, null, direction, arrayList);
            }
            return Camera2StreamConfigurationMap2;
        } finally {
            arrayList.clear();
        }
    }

    public final android.view.View findNextFocusFromRect(android.view.ViewGroup root, android.graphics.Rect focusedRect, int direction) {
        this.getHighResolutionOutputSizeshNQ4ISI.set(focusedRect);
        return Camera2StreamConfigurationMap(root, this.getHighResolutionOutputSizeshNQ4ISI, direction);
    }

    private final android.view.ViewGroup getHighSpeedVideoFpsRanges(android.view.ViewGroup p0, android.view.View p1) {
        if (p1 != null && p1 != p0) {
            android.view.ViewParent parent = p1.getParent();
            android.view.ViewGroup viewGroup = null;
            while (true) {
                if (!(parent instanceof android.view.ViewGroup)) {
                    break;
                }
                if (parent != p0) {
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) parent;
                    if (viewGroup2.getTouchscreenBlocksFocus() && p1.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup = viewGroup2;
                    }
                    parent = viewGroup2.getParent();
                } else if (viewGroup != null) {
                    return viewGroup;
                }
            }
        }
        return p0;
    }

    private final android.view.View Camera2StreamConfigurationMap(android.view.ViewGroup p0, android.view.View p1, int p2) {
        android.view.View highResolutionOutputSizeshNQ4ISI;
        android.view.ViewGroup viewGroup = p0;
        highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.FocusFinderCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p1, viewGroup, p2);
        boolean z = true;
        android.view.View view = highResolutionOutputSizeshNQ4ISI;
        while (highResolutionOutputSizeshNQ4ISI != null) {
            if (highResolutionOutputSizeshNQ4ISI.isFocusable() && highResolutionOutputSizeshNQ4ISI.getVisibility() == 0 && (!highResolutionOutputSizeshNQ4ISI.isInTouchMode() || highResolutionOutputSizeshNQ4ISI.isFocusableInTouchMode())) {
                return highResolutionOutputSizeshNQ4ISI;
            }
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.FocusFinderCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, viewGroup, p2);
            if (!z) {
                view = view != null ? androidx.compose.ui.platform.FocusFinderCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(view, viewGroup, p2) : null;
                if (view == highResolutionOutputSizeshNQ4ISI) {
                    break;
                }
            }
            z = !z;
        }
        return null;
    }

    private final android.view.View Camera2StreamConfigurationMap(android.view.ViewGroup p0, android.graphics.Rect p1, int p2) {
        android.view.ViewGroup highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0, (android.view.View) null);
        java.util.ArrayList<android.view.View> arrayList = this.getHighSpeedVideoFpsRangesFor;
        try {
            arrayList.clear();
            androidx.compose.ui.platform.FocusFinderCompat_androidKt.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, arrayList, p2);
            if (arrayList.isEmpty()) {
                return null;
            }
            return getHighSpeedVideoSizes(highSpeedVideoFpsRanges, null, p1, p2, arrayList);
        } finally {
            arrayList.clear();
        }
    }

    private final android.view.View getHighSpeedVideoSizes(android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2, int p3, java.util.ArrayList<android.view.View> p4) {
        android.graphics.Rect rect = this.getHighResolutionOutputSizeshNQ4ISI;
        if (p1 != null) {
            p1.getFocusedRect(rect);
            p0.offsetDescendantRectToMyCoords(p1, rect);
        } else if (p2 != null) {
            rect.set(p2);
        } else if (p3 == 1) {
            if (p0.getLayoutDirection() == 1) {
                getHighSpeedVideoFpsRanges(p0, rect);
            }
            getHighResolutionOutputSizeshNQ4ISI(p0, rect);
        } else if (p3 == 2) {
            if (p0.getLayoutDirection() != 1) {
                getHighSpeedVideoFpsRanges(p0, rect);
            }
            getHighResolutionOutputSizeshNQ4ISI(p0, rect);
        } else if (p3 == 17 || p3 == 33) {
            getHighResolutionOutputSizeshNQ4ISI(p0, rect);
        } else if (p3 == 66 || p3 == 130) {
            getHighSpeedVideoFpsRanges(p0, rect);
        }
        if (p3 == 1 || p3 == 2) {
            return getHighSpeedVideoFpsRanges(p4, p0, p1, p3);
        }
        if (p3 == 17 || p3 == 33 || p3 == 66 || p3 == 130) {
            return getHighResolutionOutputSizeshNQ4ISI(p0, p1, rect, p4, p3);
        }
        throw new java.lang.IllegalArgumentException("Unknown direction: ".concat(java.lang.String.valueOf(p3)));
    }

    private final android.view.View getHighSpeedVideoFpsRanges(java.util.ArrayList<android.view.View> p0, android.view.ViewGroup p1, android.view.View p2, int p3) {
        try {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(p0, p1);
            java.util.Collections.sort(p0, this.Camera2StreamConfigurationMap);
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
            int size = p0.size();
            android.view.View view = null;
            if (size < 2) {
                return null;
            }
            if (p3 == 1) {
                view = getHighSpeedVideoFpsRanges(p2, p0, size);
            } else if (p3 == 2) {
                view = getHighResolutionOutputSizeshNQ4ISI(p2, p0, size);
            } else if (p3 == 17 || p3 == 33 || p3 == 66 || p3 == 130) {
                view = getHighResolutionOutputSizeshNQ4ISI(p1, p2, this.getHighResolutionOutputSizeshNQ4ISI, p0, p3);
            }
            return view == null ? p0.get(size - 1) : view;
        } catch (java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
            throw th;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(android.view.ViewGroup p0, android.graphics.Rect p1) {
        int scrollY = p0.getScrollY() + p0.getHeight();
        int scrollX = p0.getScrollX() + p0.getWidth();
        p1.set(scrollX, scrollY, scrollX, scrollY);
    }

    private final void getHighSpeedVideoFpsRanges(android.view.ViewGroup p0, android.graphics.Rect p1) {
        int scrollY = p0.getScrollY();
        int scrollX = p0.getScrollX();
        p1.set(scrollX, scrollY, scrollX, scrollY);
    }

    private final android.view.View getHighResolutionOutputSizeshNQ4ISI(android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2, java.util.ArrayList<android.view.View> p3, int p4) {
        this.getHighSpeedVideoFpsRanges.set(p2);
        if (p4 == 17) {
            this.getHighSpeedVideoFpsRanges.offset(p2.width() + 1, 0);
        } else if (p4 == 33) {
            this.getHighSpeedVideoFpsRanges.offset(0, p2.height() + 1);
        } else if (p4 == 66) {
            this.getHighSpeedVideoFpsRanges.offset((-p2.width()) - 1, 0);
        } else if (p4 == 130) {
            this.getHighSpeedVideoFpsRanges.offset(0, (-p2.height()) - 1);
        }
        java.util.ArrayList<android.view.View> arrayList = p3;
        int size = arrayList.size();
        android.view.View view = null;
        for (int i = 0; i < size; i++) {
            android.view.View view2 = arrayList.get(i);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(view2, p1) && !kotlin.jvm.internal.Intrinsics.areEqual(view2, p0)) {
                view2.getFocusedRect(this.getHighSpeedVideoSizes);
                p0.offsetDescendantRectToMyCoords(view2, this.getHighSpeedVideoSizes);
                androidx.compose.ui.geometry.Rect composeRect = androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(this.getHighSpeedVideoSizes);
                androidx.compose.ui.geometry.Rect composeRect2 = androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(this.getHighSpeedVideoFpsRanges);
                androidx.compose.ui.geometry.Rect composeRect3 = androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(p2);
                androidx.compose.ui.focus.FocusDirection focusDirection = androidx.compose.ui.focus.FocusInteropUtils_androidKt.toFocusDirection(p4);
                if (androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m5701isBetterCandidateI7lrPNg(composeRect, composeRect2, composeRect3, focusDirection != null ? focusDirection.getCamera2StreamConfigurationMap() : androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s())) {
                    this.getHighSpeedVideoFpsRanges.set(this.getHighSpeedVideoSizes);
                    view = view2;
                }
            }
        }
        return view;
    }

    private final android.view.View getHighResolutionOutputSizeshNQ4ISI(android.view.View p0, java.util.ArrayList<android.view.View> p1, int p2) {
        int lastIndexOf;
        int i;
        if (p2 < 2) {
            return null;
        }
        if (p0 != null && (lastIndexOf = p1.lastIndexOf(p0)) >= 0 && (i = lastIndexOf + 1) < p2) {
            return p1.get(i);
        }
        return p1.get(0);
    }

    private final android.view.View getHighSpeedVideoFpsRanges(android.view.View p0, java.util.ArrayList<android.view.View> p1, int p2) {
        int indexOf;
        if (p2 < 2) {
            return null;
        }
        if (p0 != null && (indexOf = p1.indexOf(p0)) > 0) {
            return p1.get(indexOf - 1);
        }
        return p1.get(p2 - 1);
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003:\u0001 B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u00020\b2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000bj\b\u0012\u0004\u0012\u00020\u0002`\f2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "Ljava/util/Comparator;", "Landroid/view/View;", "Lkotlin/getOutputStallDuration;", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "p0", "<init>", "(Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;)V", "", "getHighSpeedVideoFpsRangesFor", "()V", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/util/ArrayList;Landroid/view/View;)V", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/View;)V", "", "Camera2StreamConfigurationMap", "(Landroid/view/View;Landroid/view/View;)I", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterSet;", "Landroidx/collection/MutableScatterSet;", "getHighSpeedVideoSizes", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/collection/MutableObjectIntMap;", "getOutputFormats", "Landroid/view/View;", "getOutputMinFrameDuration", "NextFocusGetter"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class UserSpecifiedFocusComparator implements java.util.Comparator<android.view.View> {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private android.view.View getOutputMinFrameDuration;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.collection.MutableScatterMap<android.view.View, android.view.View> getHighSpeedVideoFpsRanges = androidx.collection.ScatterMapKt.mutableScatterMapOf();

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.collection.MutableScatterSet<android.view.View> getHighSpeedVideoFpsRangesFor = androidx.collection.ScatterSetKt.mutableScatterSetOf();

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.collection.MutableScatterMap<android.view.View, android.view.View> Camera2StreamConfigurationMap = androidx.collection.ScatterMapKt.mutableScatterMapOf();

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.collection.MutableObjectIntMap<android.view.View> getHighSpeedVideoSizes = androidx.collection.ObjectIntMapKt.mutableObjectIntMapOf();

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "", "Landroid/view/View;", "root", "view", "get", "(Landroid/view/View;Landroid/view/View;)Landroid/view/View;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface NextFocusGetter {
            android.view.View get(android.view.View root, android.view.View view);
        }

        public UserSpecifiedFocusComparator(androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter nextFocusGetter) {
            this.getHighResolutionOutputSizeshNQ4ISI = nextFocusGetter;
        }

        public final void getHighSpeedVideoFpsRangesFor() {
            this.getOutputMinFrameDuration = null;
            this.Camera2StreamConfigurationMap.clear();
            this.getHighSpeedVideoFpsRangesFor.clear();
            this.getHighSpeedVideoSizes.clear();
            this.getHighSpeedVideoFpsRanges.clear();
        }

        public final void getHighSpeedVideoFpsRanges(java.util.ArrayList<android.view.View> p0, android.view.View p1) {
            this.getOutputMinFrameDuration = p1;
            java.util.ArrayList<android.view.View> arrayList = p0;
            java.util.ArrayList<android.view.View> arrayList2 = arrayList;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                this.getHighSpeedVideoSizes.set(arrayList.get(i), i);
            }
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i2 = size2 - 1;
                    android.view.View view = arrayList.get(size2);
                    android.view.View view2 = this.getHighResolutionOutputSizeshNQ4ISI.get(p1, view);
                    if (view2 != null && this.getHighSpeedVideoSizes.containsKey(view2)) {
                        this.getHighSpeedVideoFpsRanges.set(view, view2);
                        this.getHighSpeedVideoFpsRangesFor.add(view2);
                    }
                    if (i2 < 0) {
                        break;
                    } else {
                        size2 = i2;
                    }
                }
            }
            int size3 = arrayList2.size() - 1;
            if (size3 < 0) {
                return;
            }
            while (true) {
                int i3 = size3 - 1;
                android.view.View view3 = arrayList.get(size3);
                if (this.getHighSpeedVideoFpsRanges.get(view3) != null && !this.getHighSpeedVideoFpsRangesFor.contains(view3)) {
                    getHighResolutionOutputSizeshNQ4ISI(view3);
                }
                if (i3 < 0) {
                    return;
                } else {
                    size3 = i3;
                }
            }
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(android.view.View p0) {
            android.view.View view = p0;
            while (p0 != null) {
                android.view.View view2 = this.Camera2StreamConfigurationMap.get(p0);
                if (view2 != null) {
                    if (view2 == view) {
                        return;
                    }
                    p0 = view;
                    view = view2;
                }
                this.Camera2StreamConfigurationMap.set(p0, view);
                p0 = this.getHighSpeedVideoFpsRanges.get(p0);
            }
        }

        @Override // java.util.Comparator
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final int compare(android.view.View p0, android.view.View p1) {
            if (p0 == p1) {
                return 0;
            }
            if (p0 == null) {
                return -1;
            }
            if (p1 == null) {
                return 1;
            }
            android.view.View view = this.Camera2StreamConfigurationMap.get(p0);
            android.view.View view2 = this.Camera2StreamConfigurationMap.get(p1);
            if (view == view2 && view != null) {
                if (p0 == view) {
                    return -1;
                }
                return (p1 == view || this.getHighSpeedVideoFpsRanges.get(p0) == null) ? 1 : -1;
            }
            if (view != null) {
                p0 = view;
            }
            if (view2 != null) {
                p1 = view2;
            }
            if (view == null && view2 == null) {
                return 0;
            }
            return this.getHighSpeedVideoSizes.get(p0) < this.getHighSpeedVideoSizes.get(p1) ? -1 : 1;
        }
    }
}
