package androidx.compose.material.internal;

/* compiled from: ExposedDropdownMenuPopup.kt */
@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B=\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\r\u0010P\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010QJ\b\u0010R\u001a\u00020)H\u0002J\u0006\u0010S\u001a\u00020\u0006J\u0010\u0010T\u001a\u00020\u00132\u0006\u0010U\u001a\u00020VH\u0016J\b\u0010W\u001a\u00020\u0006H\u0016J\u0012\u0010X\u001a\u00020\u00132\b\u0010U\u001a\u0004\u0018\u00010YH\u0016J&\u0010\u001d\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020[2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0019¢\u0006\u0002\u0010\\J\u0010\u0010]\u001a\u00020\u00062\u0006\u0010^\u001a\u00020_H\u0016J\u0006\u0010`\u001a\u00020\u0006J\u0010\u0010a\u001a\u00020\u00062\u0006\u0010^\u001a\u000201H\u0002J&\u0010b\u001a\u00020\u00062\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010^\u001a\u000201J\u0006\u0010c\u001a\u00020\u0006J\f\u0010d\u001a\u00020$*\u00020CH\u0002R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000RA\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00192\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR%\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130\"X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0019\u0010%\u001a\u00020&X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010'R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010*\u001a\u0004\u0018\u00010$2\b\u0010\u0018\u001a\u0004\u0018\u00010$8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010 \u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u00100\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R8\u00107\u001a\u0004\u0018\u0001062\b\u0010\u0018\u001a\u0004\u0018\u0001068F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b<\u0010 \u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010=\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u000e\u0010B\u001a\u00020CX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010D\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013@RX\u0094\u000e¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0015R\u0014\u0010F\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u000e\u0010M\u001a\u00020CX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006e"}, d2 = {"Landroidx/compose/material/internal/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onDismissRequest", "Lkotlin/Function0;", "", "testTag", "", "composeView", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "initialPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupId", "Ljava/util/UUID;", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;)V", "canCalculatePosition", "", "getCanCalculatePosition", "()Z", "canCalculatePosition$delegate", "Landroidx/compose/runtime/State;", "<set-?>", "Landroidx/compose/runtime/Composable;", "content", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "content$delegate", "Landroidx/compose/runtime/MutableState;", "dismissOnOutsideClick", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/IntRect;", "maxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "F", "params", "Landroid/view/WindowManager$LayoutParams;", "parentBounds", "getParentBounds", "()Landroidx/compose/ui/unit/IntRect;", "setParentBounds", "(Landroidx/compose/ui/unit/IntRect;)V", "parentBounds$delegate", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "popupContentSize", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize$delegate", "positionProvider", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "previousWindowVisibleFrame", "Landroid/graphics/Rect;", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "subCompositionView", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "tmpWindowVisibleFrame", "windowManager", "Landroid/view/WindowManager;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "createLayoutParams", "dismiss", "dispatchKeyEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "onGlobalLayout", "onTouchEvent", "Landroid/view/MotionEvent;", "parent", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "setLayoutDirection", "layoutDirection", "", com.ironsource.C3232q2.v, "superSetLayoutDirection", "updateParameters", "updatePosition", "toIntBounds", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class PopupLayout extends androidx.compose.ui.platform.AbstractComposeView implements androidx.compose.ui.platform.ViewRootForInspector, android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: canCalculatePosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State canCalculatePosition;
    private final android.view.View composeView;

    /* renamed from: content$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState content;
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, androidx.compose.ui.unit.IntRect, java.lang.Boolean> dismissOnOutsideClick;
    private final float maxSupportedElevation;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest;
    private final android.view.WindowManager.LayoutParams params;

    /* renamed from: parentBounds$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState parentBounds;
    private androidx.compose.ui.unit.LayoutDirection parentLayoutDirection;

    /* renamed from: popupContentSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState popupContentSize;
    private androidx.compose.ui.window.PopupPositionProvider positionProvider;
    private final android.graphics.Rect previousWindowVisibleFrame;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private java.lang.String testTag;
    private final android.graphics.Rect tmpWindowVisibleFrame;
    private final android.view.WindowManager windowManager;

    /* compiled from: ExposedDropdownMenuPopup.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.LayoutDirection.values().length];
            iArr[androidx.compose.ui.unit.LayoutDirection.Ltr.ordinal()] = 1;
            iArr[androidx.compose.ui.unit.LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public /* synthetic */ android.view.View getViewRoot() {
        return androidx.compose.ui.platform.ViewRootForInspector.CC.$default$getViewRoot(this);
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final java.lang.String getTestTag() {
        return this.testTag;
    }

    public final void setTestTag(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.testTag = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PopupLayout(kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String testTag, android.view.View composeView, androidx.compose.ui.unit.Density density, androidx.compose.ui.window.PopupPositionProvider initialPositionProvider, java.util.UUID popupId) {
        super(r2, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testTag, "testTag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composeView, "composeView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialPositionProvider, "initialPositionProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popupId, "popupId");
        android.content.Context context = composeView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "composeView.context");
        this.onDismissRequest = function0;
        this.testTag = testTag;
        this.composeView = composeView;
        java.lang.Object systemService = composeView.getContext().getSystemService("window");
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        this.windowManager = (android.view.WindowManager) systemService;
        this.params = createLayoutParams();
        this.positionProvider = initialPositionProvider;
        this.parentLayoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
        this.parentBounds = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.popupContentSize = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.canCalculatePosition = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.internal.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf((androidx.compose.material.internal.PopupLayout.this.getParentBounds() == null || androidx.compose.material.internal.PopupLayout.this.m1589getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(30);
        this.maxSupportedElevation = m4478constructorimpl;
        this.previousWindowVisibleFrame = new android.graphics.Rect();
        this.tmpWindowVisibleFrame = new android.graphics.Rect();
        this.dismissOnOutsideClick = new kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, androidx.compose.ui.unit.IntRect, java.lang.Boolean>() { // from class: androidx.compose.material.internal.PopupLayout$dismissOnOutsideClick$1
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: invoke-KMgbckE, reason: not valid java name and merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.geometry.Offset offset, androidx.compose.ui.unit.IntRect bounds) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bounds, "bounds");
                boolean z = false;
                if (offset != null && (androidx.compose.ui.geometry.Offset.m1871getXimpl(offset.getPackedValue()) < bounds.getLeft() || androidx.compose.ui.geometry.Offset.m1871getXimpl(offset.getPackedValue()) > bounds.getRight() || androidx.compose.ui.geometry.Offset.m1872getYimpl(offset.getPackedValue()) < bounds.getTop() || androidx.compose.ui.geometry.Offset.m1872getYimpl(offset.getPackedValue()) > bounds.getBottom())) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
        };
        setId(android.R.id.content);
        androidx.compose.material.internal.PopupLayout popupLayout = this;
        androidx.lifecycle.ViewTreeLifecycleOwner.set(popupLayout, androidx.lifecycle.ViewTreeLifecycleOwner.get(composeView));
        androidx.lifecycle.ViewTreeViewModelStoreOwner.set(popupLayout, androidx.lifecycle.ViewTreeViewModelStoreOwner.get(composeView));
        androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(popupLayout, androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(composeView));
        composeView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + popupId);
        setClipChildren(false);
        setElevation(density.mo315toPx0680j_4(m4478constructorimpl));
        setOutlineProvider(new android.view.ViewOutlineProvider() { // from class: androidx.compose.material.internal.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(android.view.View view, android.graphics.Outline result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
                result.setRect(0, 0, view.getWidth(), view.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.content = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt.INSTANCE.m1585getLambda1$material_release(), null, 2, null);
    }

    public final androidx.compose.ui.window.PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    public final void setPositionProvider(androidx.compose.ui.window.PopupPositionProvider popupPositionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popupPositionProvider, "<set-?>");
        this.positionProvider = popupPositionProvider;
    }

    public final androidx.compose.ui.unit.LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    public final void setParentLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
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
    public final androidx.compose.ui.unit.IntSize m1589getPopupContentSizebOM6tXw() {
        return (androidx.compose.ui.unit.IntSize) this.popupContentSize.getValue();
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1590setPopupContentSizefhxjrPA(androidx.compose.ui.unit.IntSize intSize) {
        this.popupContentSize.setValue(intSize);
    }

    public final boolean getCanCalculatePosition() {
        return ((java.lang.Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public androidx.compose.ui.platform.AbstractComposeView getSubCompositionView() {
        return this;
    }

    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return (kotlin.jvm.functions.Function2) this.content.getValue();
    }

    private final void setContent(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        this.content.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void setContent(androidx.compose.runtime.CompositionContext parent, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1288867704);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Content)298@11564L9:ExposedDropdownMenuPopup.kt#mnwmf7");
        getContent().invoke(startRestartGroup, 0);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.internal.PopupLayout$Content$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                androidx.compose.material.internal.PopupLayout.this.Content(composer2, i | 1);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (event.getKeyCode() == 4) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onDismissRequest;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final void updateParameters(kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest, java.lang.String testTag, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testTag, "testTag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.onDismissRequest = onDismissRequest;
        this.testTag = testTag;
        superSetLayoutDirection(layoutDirection);
    }

    public final void updatePosition() {
        androidx.compose.ui.unit.IntSize m1589getPopupContentSizebOM6tXw;
        androidx.compose.ui.unit.IntRect parentBounds = getParentBounds();
        if (parentBounds == null || (m1589getPopupContentSizebOM6tXw = m1589getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long packedValue = m1589getPopupContentSizebOM6tXw.getPackedValue();
        android.graphics.Rect rect = this.previousWindowVisibleFrame;
        this.composeView.getWindowVisibleDisplayFrame(rect);
        androidx.compose.ui.unit.IntRect intBounds = toIntBounds(rect);
        long mo1002calculatePositionllwVHH4 = this.positionProvider.mo1002calculatePositionllwVHH4(parentBounds, androidx.compose.ui.unit.IntSizeKt.IntSize(intBounds.getWidth(), intBounds.getHeight()), this.parentLayoutDirection, packedValue);
        this.params.x = androidx.compose.ui.unit.IntOffset.m4610getXimpl(mo1002calculatePositionllwVHH4);
        this.params.y = androidx.compose.ui.unit.IntOffset.m4611getYimpl(mo1002calculatePositionllwVHH4);
        this.windowManager.updateViewLayout(this, this.params);
    }

    public final void dismiss() {
        androidx.compose.material.internal.PopupLayout popupLayout = this;
        androidx.lifecycle.ViewTreeLifecycleOwner.set(popupLayout, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(popupLayout);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r5.dismissOnOutsideClick.invoke((r6.getX() == 0.0f && r6.getY() == 0.0f) ? null : androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.OffsetKt.Offset(r5.params.x + r6.getX(), r5.params.y + r6.getY())), r0).booleanValue() != false) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(android.view.MotionEvent event) {
        if (event == null) {
            return super.onTouchEvent(event);
        }
        if ((event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) || event.getAction() == 4) {
            androidx.compose.ui.unit.IntRect parentBounds = getParentBounds();
            if (parentBounds != null) {
            }
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onDismissRequest;
            if (function0 == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
        return super.onTouchEvent(event);
    }

    private final void superSetLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int i = androidx.compose.material.internal.PopupLayout.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    private final android.view.WindowManager.LayoutParams createLayoutParams() {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        return layoutParams;
    }

    private final androidx.compose.ui.unit.IntRect toIntBounds(android.graphics.Rect rect) {
        return new androidx.compose.ui.unit.IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.composeView.getWindowVisibleDisplayFrame(this.tmpWindowVisibleFrame);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.tmpWindowVisibleFrame, this.previousWindowVisibleFrame)) {
            return;
        }
        updatePosition();
    }
}
