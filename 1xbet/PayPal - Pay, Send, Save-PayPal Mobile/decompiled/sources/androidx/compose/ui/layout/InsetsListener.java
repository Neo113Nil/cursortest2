package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b)\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010\u0015\u001a\u00020-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010#\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00103R&\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0012048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010;\u001a\u00020:8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R&\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0@0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010H\u001a\b\u0012\u0004\u0012\u00020G0F8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K"}, d2 = {"Landroidx/compose/ui/layout/InsetsListener;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Ljava/lang/Runnable;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroidx/core/view/WindowInsetsAnimationCompat;", "animation", "", "onPrepare", "(Landroidx/core/view/WindowInsetsAnimationCompat;)V", "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "bounds", "onStart", "(Landroidx/core/view/WindowInsetsAnimationCompat;Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;", "p0", "p1", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;Landroidx/core/view/WindowInsetsAnimationCompat;)V", "Landroidx/core/view/WindowInsetsCompat;", "insets", "", "runningAnimations", "onProgress", "(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;", "onEnd", "(Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;)V", "Landroid/view/View;", "view", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Camera2StreamConfigurationMap", "(Landroidx/core/view/WindowInsetsCompat;)V", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/compose/ui/platform/AndroidComposeView;", "getComposeView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "", "Z", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/core/view/WindowInsetsCompat;", "Landroidx/collection/ScatterMap;", "", "insetsValues", "Landroidx/collection/ScatterMap;", "getInsetsValues", "()Landroidx/collection/ScatterMap;", "Landroidx/compose/runtime/MutableIntState;", "generation", "Landroidx/compose/runtime/MutableIntState;", "getGeneration", "()Landroidx/compose/runtime/MutableIntState;", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/MutableState;", "Landroid/graphics/Rect;", "displayCutouts", "Landroidx/collection/MutableObjectList;", "getDisplayCutouts", "()Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/ui/layout/RectRulers;", "displayCutoutRulers", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getDisplayCutoutRulers", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InsetsListener extends androidx.core.view.WindowInsetsAnimationCompat.Callback implements java.lang.Runnable, androidx.core.view.OnApplyWindowInsetsListener, android.view.View.OnAttachStateChangeListener {
    public static final int $stable = 8;
    private final androidx.compose.ui.platform.AndroidComposeView composeView;
    private final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.ui.layout.RectRulers> displayCutoutRulers;
    private final androidx.collection.MutableObjectList<androidx.compose.runtime.MutableState<android.graphics.Rect>> displayCutouts;
    private final androidx.compose.runtime.MutableIntState generation;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.core.view.WindowInsetsCompat Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoSizes;
    private final androidx.collection.ScatterMap<java.lang.Object, androidx.compose.ui.layout.WindowWindowInsetsAnimationValues> insetsValues;

    public InsetsListener(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        super(1);
        this.composeView = androidComposeView;
        androidx.collection.MutableScatterMap mutableScatterMap = new androidx.collection.MutableScatterMap(9);
        mutableScatterMap.set(androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getCaptionBar(), new androidx.compose.ui.layout.WindowWindowInsetsAnimationValues("caption bar"));
        mutableScatterMap.set(androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getDisplayCutout(), new androidx.compose.ui.layout.WindowWindowInsetsAnimationValues("display cutout"));
        mutableScatterMap.set(androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getIme(), new androidx.compose.ui.layout.WindowWindowInsetsAnimationValues("ime"));
        mutableScatterMap.set(androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getMandatorySystemGestures(), new androidx.compose.ui.layout.WindowWindowInsetsAnimationValues("mandatory system gestures"));
        mutableScatterMap.set(androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getNavigationBars(), new androidx.compose.ui.layout.WindowWindowInsetsAnimationValues("navigation bars"));
        mutableScatterMap.set(androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getStatusBars(), new androidx.compose.ui.layout.WindowWindowInsetsAnimationValues("status bars"));
        mutableScatterMap.set(androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getSystemGestures(), new androidx.compose.ui.layout.WindowWindowInsetsAnimationValues("system gestures"));
        mutableScatterMap.set(androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getTappableElement(), new androidx.compose.ui.layout.WindowWindowInsetsAnimationValues("tappable element"));
        mutableScatterMap.set(androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getWaterfall(), new androidx.compose.ui.layout.WindowWindowInsetsAnimationValues("waterfall"));
        this.insetsValues = mutableScatterMap;
        this.generation = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
        this.displayCutouts = new androidx.collection.MutableObjectList<>(4);
        this.displayCutoutRulers = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
    }

    public final androidx.compose.ui.platform.AndroidComposeView getComposeView() {
        return this.composeView;
    }

    public final androidx.collection.ScatterMap<java.lang.Object, androidx.compose.ui.layout.WindowWindowInsetsAnimationValues> getInsetsValues() {
        return this.insetsValues;
    }

    public final androidx.compose.runtime.MutableIntState getGeneration() {
        return this.generation;
    }

    public final androidx.collection.MutableObjectList<androidx.compose.runtime.MutableState<android.graphics.Rect>> getDisplayCutouts() {
        return this.displayCutouts;
    }

    public final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.ui.layout.RectRulers> getDisplayCutoutRulers() {
        return this.displayCutoutRulers;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onPrepare(androidx.core.view.WindowInsetsAnimationCompat animation) {
        this.getHighSpeedVideoSizes = true;
        super.onPrepare(animation);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat onStart(androidx.core.view.WindowInsetsAnimationCompat animation, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat bounds) {
        androidx.collection.IntObjectMap intObjectMap;
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = false;
        this.Camera2StreamConfigurationMap = null;
        if (animation.getDurationMillis() > 0 && windowInsetsCompat != null) {
            int typeMask = animation.getTypeMask();
            this.getHighResolutionOutputSizeshNQ4ISI |= typeMask;
            intObjectMap = androidx.compose.ui.layout.WindowInsetsRulers_androidKt.getHighSpeedVideoFpsRanges;
            androidx.compose.ui.layout.WindowInsetsRulers windowInsetsRulers = (androidx.compose.ui.layout.WindowInsetsRulers) intObjectMap.get(typeMask);
            if (windowInsetsRulers != null) {
                androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
                kotlin.jvm.internal.Intrinsics.checkNotNull(windowWindowInsetsAnimationValues);
                androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
                androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(typeMask);
                long m7476constructorimpl = androidx.compose.ui.layout.ValueInsets.m7476constructorimpl(insets.bottom | (insets.left << 48) | (insets.top << 32) | (insets.right << 16));
                long current = windowWindowInsetsAnimationValues2.getCurrent();
                if (!androidx.compose.ui.layout.ValueInsets.m7478equalsimpl0(m7476constructorimpl, current)) {
                    windowWindowInsetsAnimationValues2.m7492setSourceValueInsetsYnlvx88(current);
                    windowWindowInsetsAnimationValues2.m7493setTargetValueInsetsYnlvx88(m7476constructorimpl);
                    windowWindowInsetsAnimationValues2.setAnimating(true);
                    getHighSpeedVideoSizes(windowWindowInsetsAnimationValues2, animation);
                    androidx.compose.runtime.MutableIntState mutableIntState = this.generation;
                    mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                    androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
                }
            }
        }
        return super.onStart(animation, bounds);
    }

    private static void getHighSpeedVideoSizes(androidx.compose.ui.layout.WindowWindowInsetsAnimationValues p0, androidx.core.view.WindowInsetsAnimationCompat p1) {
        p0.setFraction(p1.getInterpolatedFraction());
        p0.setAlpha(p1.getAlpha());
        p0.setDurationMillis(p1.getDurationMillis());
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onEnd(androidx.core.view.WindowInsetsAnimationCompat animation) {
        androidx.collection.IntObjectMap intObjectMap;
        this.getHighSpeedVideoSizes = false;
        int typeMask = animation.getTypeMask();
        this.getHighResolutionOutputSizeshNQ4ISI &= ~typeMask;
        this.Camera2StreamConfigurationMap = null;
        intObjectMap = androidx.compose.ui.layout.WindowInsetsRulers_androidKt.getHighSpeedVideoFpsRanges;
        androidx.compose.ui.layout.WindowInsetsRulers windowInsetsRulers = (androidx.compose.ui.layout.WindowInsetsRulers) intObjectMap.get(typeMask);
        if (windowInsetsRulers != null) {
            androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
            kotlin.jvm.internal.Intrinsics.checkNotNull(windowWindowInsetsAnimationValues);
            androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
            windowWindowInsetsAnimationValues2.setFraction(0.0f);
            windowWindowInsetsAnimationValues2.setAlpha(1.0f);
            windowWindowInsetsAnimationValues2.setDurationMillis(0L);
            windowWindowInsetsAnimationValues2.setFraction(0.0f);
            getHighSpeedVideoSizes(windowWindowInsetsAnimationValues2);
            androidx.compose.runtime.MutableIntState mutableIntState = this.generation;
            mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
            androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
        }
        super.onEnd(animation);
    }

    private static void getHighSpeedVideoSizes(androidx.compose.ui.layout.WindowWindowInsetsAnimationValues p0) {
        p0.setAnimating(false);
        p0.m7492setSourceValueInsetsYnlvx88(androidx.compose.ui.layout.ValueInsets_androidKt.getUnsetValueInsets());
        p0.m7493setTargetValueInsetsYnlvx88(androidx.compose.ui.layout.ValueInsets_androidKt.getUnsetValueInsets());
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat insets) {
        if (this.getHighSpeedVideoSizes) {
            this.Camera2StreamConfigurationMap = insets;
            if (android.os.Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return insets;
            }
        } else if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            Camera2StreamConfigurationMap(insets);
        }
        return insets;
    }

    private final void Camera2StreamConfigurationMap(androidx.core.view.WindowInsetsCompat p0) {
        androidx.collection.IntObjectMap intObjectMap;
        boolean z;
        boolean z2;
        long m7476constructorimpl;
        boolean z3;
        boolean z4;
        long[] jArr;
        int[] iArr;
        java.lang.Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        java.lang.Object[] objArr2;
        int i;
        long j;
        int i2;
        intObjectMap = androidx.compose.ui.layout.WindowInsetsRulers_androidKt.getHighSpeedVideoFpsRanges;
        int[] iArr3 = intObjectMap.keys;
        java.lang.Object[] objArr3 = intObjectMap.values;
        long[] jArr3 = intObjectMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            z = false;
            z2 = false;
            while (true) {
                long j2 = jArr3[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j2 & 255) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr3[i7];
                            androidx.compose.ui.layout.WindowInsetsRulers windowInsetsRulers = (androidx.compose.ui.layout.WindowInsetsRulers) objArr3[i7];
                            androidx.core.graphics.Insets insets = p0.getInsets(i8);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            boolean z5 = z;
                            boolean z6 = z2;
                            i = length;
                            j = j2;
                            long m7476constructorimpl2 = androidx.compose.ui.layout.ValueInsets.m7476constructorimpl((insets.left << 48) | (insets.top << 32) | (insets.right << 16) | insets.bottom);
                            androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(windowWindowInsetsAnimationValues);
                            androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
                            if (!androidx.compose.ui.layout.ValueInsets.m7478equalsimpl0(m7476constructorimpl2, windowWindowInsetsAnimationValues2.getCurrent())) {
                                windowWindowInsetsAnimationValues2.m7490setCurrentYnlvx88(m7476constructorimpl2);
                                if (!androidx.compose.ui.layout.ValueInsets.m7478equalsimpl0(m7476constructorimpl2, androidx.compose.ui.layout.ValueInsets_androidKt.getZeroValueInsets())) {
                                    z5 = true;
                                }
                                z6 = true;
                            }
                            if (i8 != androidx.core.view.WindowInsetsCompat.Type.ime()) {
                                long m7476constructorimpl3 = androidx.compose.ui.layout.ValueInsets.m7476constructorimpl(r2.bottom | (p0.getInsetsIgnoringVisibility(i8).left << 48) | (r2.top << 32) | (r2.right << 16));
                                if (!androidx.compose.ui.layout.ValueInsets.m7478equalsimpl0(windowWindowInsetsAnimationValues2.getMaximum(), m7476constructorimpl3)) {
                                    windowWindowInsetsAnimationValues2.m7491setMaximumYnlvx88(m7476constructorimpl3);
                                    if (!androidx.compose.ui.layout.ValueInsets.m7478equalsimpl0(m7476constructorimpl3, androidx.compose.ui.layout.ValueInsets_androidKt.getZeroValueInsets())) {
                                        z5 = true;
                                    }
                                    z6 = true;
                                }
                            }
                            windowWindowInsetsAnimationValues2.setVisible(p0.isVisible(i8));
                            z = z5;
                            z2 = z6;
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = length;
                            j = j2;
                            i2 = i4;
                        }
                        j2 = j >> i2;
                        i6++;
                        i4 = i2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    int i9 = length;
                    if (i5 != i4) {
                        break;
                    } else {
                        length = i9;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                jArr3 = jArr;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        } else {
            z = false;
            z2 = false;
        }
        androidx.core.view.DisplayCutoutCompat displayCutout = p0.getDisplayCutout();
        if (displayCutout == null) {
            m7476constructorimpl = androidx.compose.ui.layout.ValueInsets_androidKt.getZeroValueInsets();
        } else {
            androidx.core.graphics.Insets waterfallInsets = displayCutout.getWaterfallInsets();
            m7476constructorimpl = androidx.compose.ui.layout.ValueInsets.m7476constructorimpl((waterfallInsets.left << 48) | (waterfallInsets.top << 32) | (waterfallInsets.right << 16) | waterfallInsets.bottom);
        }
        androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues3 = this.insetsValues.get(androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getWaterfall());
        kotlin.jvm.internal.Intrinsics.checkNotNull(windowWindowInsetsAnimationValues3);
        androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues4 = windowWindowInsetsAnimationValues3;
        windowWindowInsetsAnimationValues4.setVisible(!androidx.compose.ui.layout.ValueInsets.m7478equalsimpl0(m7476constructorimpl, androidx.compose.ui.layout.ValueInsets_androidKt.getZeroValueInsets()));
        if (!androidx.compose.ui.layout.ValueInsets.m7478equalsimpl0(windowWindowInsetsAnimationValues4.getCurrent(), m7476constructorimpl)) {
            windowWindowInsetsAnimationValues4.m7490setCurrentYnlvx88(m7476constructorimpl);
            windowWindowInsetsAnimationValues4.m7491setMaximumYnlvx88(m7476constructorimpl);
            if (!androidx.compose.ui.layout.ValueInsets.m7478equalsimpl0(m7476constructorimpl, androidx.compose.ui.layout.ValueInsets_androidKt.getZeroValueInsets())) {
                z = true;
            }
            z2 = true;
        }
        if (displayCutout == null) {
            if (this.displayCutouts.getSize() > 0) {
                this.displayCutouts.clear();
                this.displayCutoutRulers.clear();
                z4 = z;
                z2 = true;
            }
            z4 = z;
        } else {
            java.util.List<android.graphics.Rect> boundingRects = displayCutout.getBoundingRects();
            if (boundingRects.size() < this.displayCutouts.getSize()) {
                this.displayCutouts.removeRange(boundingRects.size(), this.displayCutouts.getSize());
                this.displayCutoutRulers.removeRange(boundingRects.size(), this.displayCutoutRulers.size());
                z3 = true;
            } else {
                int size = boundingRects.size();
                int size2 = this.displayCutouts.getSize();
                z3 = z2;
                int i10 = 0;
                while (i10 < size - size2) {
                    androidx.collection.MutableObjectList<androidx.compose.runtime.MutableState<android.graphics.Rect>> mutableObjectList = this.displayCutouts;
                    mutableObjectList.add(androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundingRects.get(mutableObjectList.getSize()), null, 2, null));
                    androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.ui.layout.RectRulers> snapshotStateList = this.displayCutoutRulers;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("display cutout rect ");
                    sb.append(this.displayCutouts.getSize());
                    snapshotStateList.add(androidx.compose.ui.layout.RectRulersKt.RectRulers(sb.toString()));
                    i10++;
                    z3 = true;
                }
            }
            java.util.List<android.graphics.Rect> list = boundingRects;
            int size3 = list.size();
            for (int i11 = 0; i11 < size3; i11++) {
                android.graphics.Rect rect = boundingRects.get(i11);
                androidx.compose.runtime.MutableState<android.graphics.Rect> mutableState = this.displayCutouts.get(i11);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(mutableState.getValue(), rect)) {
                    mutableState.setValue(rect);
                    z3 = true;
                }
            }
            z2 = z3;
            if (!list.isEmpty()) {
                z4 = true;
            }
            z4 = z;
        }
        if ((z4 || this.generation.getIntValue() != 0) && z2) {
            androidx.compose.runtime.MutableIntState mutableIntState = this.generation;
            mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
            androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.getHighSpeedVideoSizes) {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizes = false;
            androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.Camera2StreamConfigurationMap;
            if (windowInsetsCompat != null) {
                Camera2StreamConfigurationMap(windowInsetsCompat);
                this.Camera2StreamConfigurationMap = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view, this);
        androidx.core.view.ViewCompat.setWindowInsetsAnimationCallback(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view, null);
        androidx.core.view.ViewCompat.setWindowInsetsAnimationCallback(view, null);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final androidx.core.view.WindowInsetsCompat onProgress(androidx.core.view.WindowInsetsCompat insets, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> runningAnimations) {
        androidx.collection.IntObjectMap intObjectMap;
        int size = runningAnimations.size();
        for (int i = 0; i < size; i++) {
            androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat = runningAnimations.get(i);
            int typeMask = windowInsetsAnimationCompat.getTypeMask();
            intObjectMap = androidx.compose.ui.layout.WindowInsetsRulers_androidKt.getHighSpeedVideoFpsRanges;
            androidx.compose.ui.layout.WindowInsetsRulers windowInsetsRulers = (androidx.compose.ui.layout.WindowInsetsRulers) intObjectMap.get(typeMask);
            if (windowInsetsRulers != null) {
                androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = this.insetsValues.get(windowInsetsRulers);
                kotlin.jvm.internal.Intrinsics.checkNotNull(windowWindowInsetsAnimationValues);
                androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
                if (windowWindowInsetsAnimationValues2.isAnimating()) {
                    getHighSpeedVideoSizes(windowWindowInsetsAnimationValues2, windowInsetsAnimationCompat);
                }
            }
        }
        Camera2StreamConfigurationMap(insets);
        return insets;
    }
}
