package androidx.compose.material.internal;

@kotlin.Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010 \u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010\"J\u0019\u0010$\u001a\u00020\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010\"R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u0010*\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00105\u001a\u0002078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010<\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\u00020\u001f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010+R/\u0010O\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010G8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR/\u0010V\u001a\u0004\u0018\u00010P2\b\u0010H\u001a\u0004\u0018\u00010P8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010J\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001b\u0010X\u001a\u00020\u001c8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b \u0010W\u001a\u0004\bX\u0010YR\u0014\u0010-\u001a\u00020Z8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010[\u001a\u00020]8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020]8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b`\u0010_R\u0014\u0010d\u001a\u00020\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR(\u0010^\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010f\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u001c0e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bd\u0010gR<\u0010j\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010J\u001a\u0004\b*\u0010h\"\u0004\b \u0010iR$\u0010m\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001c8\u0015@RX\u0095\u000e¢\u0006\f\n\u0004\ba\u0010k\u001a\u0004\bl\u0010Y"}, d2 = {"Landroidx/compose/material/internal/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lkotlin/Function0;", "", "p0", "", "p1", "Landroid/view/View;", "p2", "Landroidx/compose/ui/unit/Density;", "p3", "Landroidx/compose/ui/window/PopupPositionProvider;", "p4", "Ljava/util/UUID;", "p5", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;)V", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Landroid/view/KeyEvent;", "", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "getHighSpeedVideoFpsRanges", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V", "()V", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "layoutDirection", "setLayoutDirection", "(I)V", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "onGlobalLayout", "getHighSpeedVideoSizesFor", "Lkotlin/jvm/functions/Function0;", "testTag", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "getHighSpeedVideoSizes", "Landroid/view/View;", "Landroid/view/WindowManager;", "Landroid/view/WindowManager;", "Landroid/view/WindowManager$LayoutParams;", "getHighSpeedVideoFpsRangesFor", "Landroid/view/WindowManager$LayoutParams;", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "Landroidx/compose/ui/unit/IntRect;", "<set-?>", "parentBounds$delegate", "Landroidx/compose/runtime/MutableState;", "getParentBounds", "()Landroidx/compose/ui/unit/IntRect;", "setParentBounds", "(Landroidx/compose/ui/unit/IntRect;)V", "parentBounds", "Landroidx/compose/ui/unit/IntSize;", "popupContentSize$delegate", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize", "Landroidx/compose/runtime/State;", "Camera2StreamConfigurationMap", "()Z", "Landroidx/compose/ui/unit/Dp;", "getOutputFormats", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Landroid/graphics/Rect;", "getOutputMinFrameDuration", "Landroid/graphics/Rect;", "getOutputSizes", "getInputFormats", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "getInputSizeshNQ4ISI", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "getOutputMinFrameDurationlomOqCM", "Z", "getShouldCreateCompositionOnAttachedToWindow", "getOutputStallDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PopupLayout extends androidx.compose.ui.platform.AbstractComposeView implements androidx.compose.ui.platform.ViewRootForInspector, android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final android.view.WindowManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.State Camera2StreamConfigurationMap;
    final android.view.WindowManager.LayoutParams getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final android.view.View getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getOutputStallDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, androidx.compose.ui.unit.IntRect, java.lang.Boolean> getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final android.graphics.Rect getOutputFormats;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final android.graphics.Rect getInputFormats;

    /* renamed from: parentBounds$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState parentBounds;
    private androidx.compose.ui.unit.LayoutDirection parentLayoutDirection;

    /* renamed from: popupContentSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState popupContentSize;
    private androidx.compose.ui.window.PopupPositionProvider positionProvider;
    private java.lang.String testTag;

    @Override // android.view.View
    public final void setLayoutDirection(int layoutDirection) {
    }

    public final java.lang.String getTestTag() {
        return this.testTag;
    }

    public final void setTestTag(java.lang.String str) {
        this.testTag = str;
    }

    public PopupLayout(kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str, android.view.View view, androidx.compose.ui.unit.Density density, androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, java.util.UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        this.getHighSpeedVideoFpsRanges = function0;
        this.testTag = str;
        this.getHighResolutionOutputSizeshNQ4ISI = view;
        java.lang.Object systemService = view.getContext().getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.getHighSpeedVideoSizes = (android.view.WindowManager) systemService;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        this.getHighSpeedVideoFpsRangesFor = layoutParams;
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
        this.parentBounds = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.popupContentSize = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.internal.PopupLayout$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.material.internal.PopupLayout.getHighSpeedVideoSizes(androidx.compose.material.internal.PopupLayout.this));
            }
        });
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f);
        this.getHighSpeedVideoSizesFor = m8601constructorimpl;
        this.getOutputFormats = new android.graphics.Rect();
        this.getInputFormats = new android.graphics.Rect();
        this.getOutputMinFrameDuration = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.internal.PopupLayout$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(androidx.compose.material.internal.PopupLayout.getHighSpeedVideoSizes((androidx.compose.ui.geometry.Offset) obj, (androidx.compose.ui.unit.IntRect) obj2));
            }
        };
        setId(android.R.id.content);
        androidx.compose.material.internal.PopupLayout popupLayout = this;
        androidx.view.C0276ViewTreeLifecycleOwner.set(popupLayout, androidx.view.C0276ViewTreeLifecycleOwner.get(view));
        androidx.view.C0278ViewTreeViewModelStoreOwner.set(popupLayout, androidx.view.C0278ViewTreeViewModelStoreOwner.get(view));
        androidx.view.C0291ViewTreeSavedStateRegistryOwner.set(popupLayout, androidx.view.C0291ViewTreeSavedStateRegistryOwner.get(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:".concat(java.lang.String.valueOf(uuid)));
        setClipChildren(false);
        setElevation(density.mo1418toPx0680j_4(m8601constructorimpl));
        setOutlineProvider(new android.view.ViewOutlineProvider() { // from class: androidx.compose.material.internal.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(android.view.View view2, android.graphics.Outline result) {
                result.setRect(0, 0, view2.getWidth(), view2.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.getOutputMinFrameDurationlomOqCM = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopup_androidKt.INSTANCE.m2834getLambda$1578637197$material(), null, 2, null);
    }

    public final androidx.compose.ui.window.PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    public final void setPositionProvider(androidx.compose.ui.window.PopupPositionProvider popupPositionProvider) {
        this.positionProvider = popupPositionProvider;
    }

    public final androidx.compose.ui.unit.LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    public final void setParentLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.ui.unit.IntRect getParentBounds() {
        return (androidx.compose.ui.unit.IntRect) this.parentBounds.getValue();
    }

    public final void setParentBounds(androidx.compose.ui.unit.IntRect intRect) {
        this.parentBounds.setValue(intRect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final androidx.compose.ui.unit.IntSize m2839getPopupContentSizebOM6tXw() {
        return (androidx.compose.ui.unit.IntSize) this.popupContentSize.getValue();
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m2840setPopupContentSizefhxjrPA(androidx.compose.ui.unit.IntSize intSize) {
        this.popupContentSize.setValue(intSize);
    }

    public final boolean Camera2StreamConfigurationMap() {
        return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final androidx.compose.ui.platform.AbstractComposeView getSubCompositionView() {
        return this;
    }

    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI() {
        return (kotlin.jvm.functions.Function2) this.getOutputMinFrameDurationlomOqCM.getValue();
    }

    private final void getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        this.getOutputMinFrameDurationlomOqCM.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getGetOutputStallDuration() {
        return this.getOutputStallDuration;
    }

    public final void setContent(androidx.compose.runtime.CompositionContext parent, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        setParentCompositionContext(parent);
        getHighSpeedVideoFpsRanges(content);
        this.getOutputStallDuration = true;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-864350873);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-864350873, i2, -1, "androidx.compose.material.internal.PopupLayout.Content (ExposedDropdownMenuPopup.android.kt:303)");
            }
            getHighResolutionOutputSizeshNQ4ISI().invoke(startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.internal.PopupLayout$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.internal.PopupLayout.getHighSpeedVideoFpsRanges(androidx.compose.material.internal.PopupLayout.this, i, (androidx.compose.runtime.Composer) obj);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent p0) {
        if (p0.getKeyCode() == 4 || p0.getKeyCode() == 111) {
            android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(p0);
            }
            if (p0.getAction() == 0 && p0.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(p0, this);
                return true;
            }
            if (p0.getAction() == 1 && keyDispatcherState.isTracking(p0) && !p0.isCanceled()) {
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRanges;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(p0);
    }

    public final void getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function0<kotlin.Unit> p0, java.lang.String p1, androidx.compose.ui.unit.LayoutDirection p2) {
        this.getHighSpeedVideoFpsRanges = p0;
        this.testTag = p1;
        getHighResolutionOutputSizeshNQ4ISI(p2);
    }

    public final void getHighSpeedVideoFpsRanges() {
        androidx.compose.ui.unit.IntSize m2839getPopupContentSizebOM6tXw;
        androidx.compose.ui.unit.IntRect parentBounds = getParentBounds();
        if (parentBounds == null || (m2839getPopupContentSizebOM6tXw = m2839getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long m8776unboximpl = m2839getPopupContentSizebOM6tXw.m8776unboximpl();
        android.graphics.Rect rect = this.getOutputFormats;
        this.getHighResolutionOutputSizeshNQ4ISI.getWindowVisibleDisplayFrame(rect);
        androidx.compose.ui.unit.IntRect intRect = new androidx.compose.ui.unit.IntRect(rect.left, rect.top, rect.right, rect.bottom);
        long mo1386calculatePositionllwVHH4 = this.positionProvider.mo1386calculatePositionllwVHH4(parentBounds, androidx.compose.ui.unit.IntSize.m8767constructorimpl((intRect.getWidth() << 32) | (intRect.getHeight() & 4294967295L)), this.parentLayoutDirection, m8776unboximpl);
        this.getHighSpeedVideoFpsRangesFor.x = androidx.compose.ui.unit.IntOffset.m8729getXimpl(mo1386calculatePositionllwVHH4);
        this.getHighSpeedVideoFpsRangesFor.y = androidx.compose.ui.unit.IntOffset.m8730getYimpl(mo1386calculatePositionllwVHH4);
        this.getHighSpeedVideoSizes.updateViewLayout(this, this.getHighSpeedVideoFpsRangesFor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r2.invoke(r1, r0).booleanValue() != false) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(android.view.MotionEvent p0) {
        androidx.compose.ui.geometry.Offset offset;
        if (p0 == null) {
            return super.onTouchEvent(p0);
        }
        if ((p0.getAction() == 0 && (p0.getX() < 0.0f || p0.getX() >= getWidth() || p0.getY() < 0.0f || p0.getY() >= getHeight())) || p0.getAction() == 4) {
            androidx.compose.ui.unit.IntRect parentBounds = getParentBounds();
            if (parentBounds != null) {
                kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, androidx.compose.ui.unit.IntRect, java.lang.Boolean> function2 = this.getOutputMinFrameDuration;
                if (p0.getRawX() == 0.0f || p0.getRawY() == 0.0f) {
                    offset = null;
                } else {
                    float rawX = p0.getRawX();
                    float rawY = p0.getRawY();
                    offset = androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(rawX) << 32) | (java.lang.Float.floatToRawIntBits(rawY) & 4294967295L)));
                }
            }
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRanges;
            if (function0 == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
        return super.onTouchEvent(p0);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.unit.LayoutDirection p0) {
        int i = androidx.compose.material.internal.PopupLayout.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.getHighResolutionOutputSizeshNQ4ISI.getWindowVisibleDisplayFrame(this.getInputFormats);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats, this.getOutputFormats)) {
            return;
        }
        getHighSpeedVideoFpsRanges();
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.material.internal.PopupLayout popupLayout, int i, androidx.compose.runtime.Composer composer) {
        popupLayout.Content(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean getHighSpeedVideoSizes(androidx.compose.material.internal.PopupLayout popupLayout) {
        return (popupLayout.getParentBounds() == null || popupLayout.m2839getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    public static /* synthetic */ boolean getHighSpeedVideoSizes(androidx.compose.ui.geometry.Offset offset, androidx.compose.ui.unit.IntRect intRect) {
        if (offset == null) {
            return false;
        }
        return java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() >> 32)) < ((float) intRect.getLeft()) || java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() >> 32)) > ((float) intRect.getRight()) || java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() & 4294967295L)) < ((float) intRect.getTop()) || java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() & 4294967295L)) > ((float) intRect.getBottom());
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.LayoutDirection.values().length];
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
