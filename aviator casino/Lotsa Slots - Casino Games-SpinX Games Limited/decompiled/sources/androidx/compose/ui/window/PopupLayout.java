package androidx.compose.ui.window;

/* compiled from: AndroidPopup.android.kt */
@kotlin.Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u008b\u00012\u00020\u00012\u00020\u0002:\u0002\u008b\u0001BO\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\r\u0010_\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010`J\u0010\u0010a\u001a\u00020\u00052\u0006\u0010b\u001a\u00020%H\u0002J\b\u0010c\u001a\u000200H\u0002J\u0006\u0010d\u001a\u00020\u0005J\u0010\u0010e\u001a\u00020\u00162\u0006\u0010f\u001a\u00020gH\u0016J5\u0010h\u001a\u00020\u00052\u0006\u0010i\u001a\u00020\u00162\u0006\u0010j\u001a\u00020%2\u0006\u0010k\u001a\u00020%2\u0006\u0010l\u001a\u00020%2\u0006\u0010m\u001a\u00020%H\u0010¢\u0006\u0002\bnJ\u001d\u0010o\u001a\u00020\u00052\u0006\u0010p\u001a\u00020%2\u0006\u0010q\u001a\u00020%H\u0010¢\u0006\u0002\brJ\b\u0010s\u001a\u00020\u0005H\u0014J\b\u0010t\u001a\u00020\u0005H\u0014J\u0012\u0010u\u001a\u00020\u00162\b\u0010f\u001a\u0004\u0018\u00010vH\u0016J\u0006\u0010w\u001a\u00020\u0005J\u0010\u0010x\u001a\u00020\u00052\u0006\u0010y\u001a\u00020\u0016H\u0002J&\u0010 \u001a\u00020\u00052\u0006\u0010z\u001a\u00020{2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001c¢\u0006\u0002\u0010|J\u0010\u0010}\u001a\u00020\u00052\u0006\u0010~\u001a\u00020\u0016H\u0002J\u0011\u0010\u007f\u001a\u00020\u00052\u0007\u0010\u0080\u0001\u001a\u00020%H\u0016J\u0013\u0010\u0081\u0001\u001a\u00020\u00052\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J\u0007\u0010\u0084\u0001\u001a\u00020\u0005J\u0012\u0010\u0085\u0001\u001a\u00020\u00052\u0007\u0010\u0080\u0001\u001a\u00020?H\u0002J0\u0010\u0086\u0001\u001a\u00020\u00052\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0007\u0010\u0080\u0001\u001a\u00020?J\u000f\u0010\u0087\u0001\u001a\u00020\u0005H\u0001¢\u0006\u0003\b\u0088\u0001J\u000f\u0010\u0089\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u000207J\u0007\u0010\u008a\u0001\u001a\u00020\u0005R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000RA\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001c2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010$\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\u00020-X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010.R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0002008\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R/\u00108\u001a\u0004\u0018\u0001072\b\u0010\u001b\u001a\u0004\u0018\u0001078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010#\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020?X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR5\u0010E\u001a\u0004\u0018\u00010D2\b\u0010\u001b\u001a\u0004\u0018\u00010D8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bJ\u0010#\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u000e\u0010P\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010R\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016@RX\u0094\u000e¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0018R\u000e\u0010T\u001a\u00020UX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010V\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u000e\u0010]\u001a\u00020^X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008c\u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "onDismissRequest", "Lkotlin/Function0;", "", "properties", "Landroidx/compose/ui/window/PopupProperties;", "testTag", "", "composeView", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "initialPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupId", "Ljava/util/UUID;", "popupLayoutHelper", "Landroidx/compose/ui/window/PopupLayoutHelper;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;Landroidx/compose/ui/window/PopupLayoutHelper;)V", "canCalculatePosition", "", "getCanCalculatePosition", "()Z", "canCalculatePosition$delegate", "Landroidx/compose/runtime/State;", "<set-?>", "Landroidx/compose/runtime/Composable;", "content", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "content$delegate", "Landroidx/compose/runtime/MutableState;", "displayHeight", "", "getDisplayHeight", "()I", "displayWidth", "getDisplayWidth", "locationOnScreen", "", "maxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "F", "params", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "()V", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "parentBounds", "Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setParentLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "parentLayoutCoordinates$delegate", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "popupContentSize", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize$delegate", "positionProvider", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "previousWindowVisibleFrame", "Landroid/graphics/Rect;", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "snapshotStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "subCompositionView", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "windowManager", "Landroid/view/WindowManager;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "applyNewFlags", "flags", "createLayoutParams", "dismiss", "dispatchKeyEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "internalOnLayout", "changed", "left", "top", "right", com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, "internalOnLayout$ui_release", "internalOnMeasure", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "onAttachedToWindow", "onDetachedFromWindow", "onTouchEvent", "Landroid/view/MotionEvent;", "pollForLocationOnScreenChange", "setClippingEnabled", "clippingEnabled", "parent", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "setIsFocusable", "isFocusable", "setLayoutDirection", "layoutDirection", "setSecurePolicy", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", com.ironsource.C3232q2.v, "superSetLayoutDirection", "updateParameters", "updateParentBounds", "updateParentBounds$ui_release", "updateParentLayoutCoordinates", "updatePosition", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PopupLayout extends androidx.compose.ui.platform.AbstractComposeView implements androidx.compose.ui.platform.ViewRootForInspector {

    /* renamed from: canCalculatePosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State canCalculatePosition;
    private final android.view.View composeView;

    /* renamed from: content$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState content;
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest;
    private final android.view.WindowManager.LayoutParams params;
    private androidx.compose.ui.unit.IntRect parentBounds;

    /* renamed from: parentLayoutCoordinates$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState parentLayoutCoordinates;
    private androidx.compose.ui.unit.LayoutDirection parentLayoutDirection;

    /* renamed from: popupContentSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState popupContentSize;
    private final androidx.compose.ui.window.PopupLayoutHelper popupLayoutHelper;
    private androidx.compose.ui.window.PopupPositionProvider positionProvider;
    private final android.graphics.Rect previousWindowVisibleFrame;
    private androidx.compose.ui.window.PopupProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final androidx.compose.runtime.snapshots.SnapshotStateObserver snapshotStateObserver;
    private java.lang.String testTag;
    private final android.view.WindowManager windowManager;
    private static final androidx.compose.ui.window.PopupLayout.Companion Companion = new androidx.compose.ui.window.PopupLayout.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.window.PopupLayout, kotlin.Unit> onCommitAffectingPopupPosition = new kotlin.jvm.functions.Function1<androidx.compose.ui.window.PopupLayout, kotlin.Unit>() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.window.PopupLayout popupLayout) {
            invoke2(popupLayout);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.ui.window.PopupLayout popupLayout) {
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.updatePosition();
            }
        }
    };

    /* compiled from: AndroidPopup.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    public static /* synthetic */ void getParams$ui_release$annotations() {
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
        this.testTag = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PopupLayout(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.window.PopupProperties popupProperties, java.lang.String str, android.view.View view, androidx.compose.ui.unit.Density density, androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, java.util.UUID uuid, androidx.compose.ui.window.PopupLayoutHelper popupLayoutHelper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, popupProperties, str, view, density, popupPositionProvider, uuid, r9);
        androidx.compose.ui.window.PopupLayoutHelper popupLayoutHelper2;
        androidx.compose.ui.window.PopupLayoutHelperImpl popupLayoutHelperImpl;
        if ((i & 128) != 0) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                popupLayoutHelperImpl = new androidx.compose.ui.window.PopupLayoutHelperImpl29();
            } else {
                popupLayoutHelperImpl = new androidx.compose.ui.window.PopupLayoutHelperImpl();
            }
            popupLayoutHelper2 = popupLayoutHelperImpl;
        } else {
            popupLayoutHelper2 = popupLayoutHelper;
        }
    }

    public PopupLayout(kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.window.PopupProperties popupProperties, java.lang.String str, android.view.View view, androidx.compose.ui.unit.Density density, androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, java.util.UUID uuid, androidx.compose.ui.window.PopupLayoutHelper popupLayoutHelper) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = function0;
        this.properties = popupProperties;
        this.testTag = str;
        this.composeView = view;
        this.popupLayoutHelper = popupLayoutHelper;
        java.lang.Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (android.view.WindowManager) systemService;
        this.params = createLayoutParams();
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
        this.popupContentSize = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentLayoutCoordinates = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.canCalculatePosition = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates;
                parentLayoutCoordinates = androidx.compose.ui.window.PopupLayout.this.getParentLayoutCoordinates();
                return java.lang.Boolean.valueOf((parentLayoutCoordinates == null || androidx.compose.ui.window.PopupLayout.this.m4735getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(8);
        this.maxSupportedElevation = m4478constructorimpl;
        this.previousWindowVisibleFrame = new android.graphics.Rect();
        this.snapshotStateObserver = new androidx.compose.runtime.snapshots.SnapshotStateObserver(new androidx.compose.ui.window.PopupLayout$snapshotStateObserver$1(this));
        setId(android.R.id.content);
        androidx.compose.ui.window.PopupLayout popupLayout = this;
        androidx.lifecycle.ViewTreeLifecycleOwner.set(popupLayout, androidx.lifecycle.ViewTreeLifecycleOwner.get(view));
        androidx.lifecycle.ViewTreeViewModelStoreOwner.set(popupLayout, androidx.lifecycle.ViewTreeViewModelStoreOwner.get(view));
        androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(popupLayout, androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(view));
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.mo315toPx0680j_4(m4478constructorimpl));
        setOutlineProvider(new android.view.ViewOutlineProvider() { // from class: androidx.compose.ui.window.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(android.view.View view2, android.graphics.Outline result) {
                result.setRect(0, 0, view2.getWidth(), view2.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.content = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.INSTANCE.m4734getLambda1$ui_release(), null, 2, null);
        this.locationOnScreen = new int[2];
    }

    /* renamed from: getParams$ui_release, reason: from getter */
    public final android.view.WindowManager.LayoutParams getParams() {
        return this.params;
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
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final androidx.compose.ui.unit.IntSize m4735getPopupContentSizebOM6tXw() {
        return (androidx.compose.ui.unit.IntSize) this.popupContentSize.getValue();
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m4736setPopupContentSizefhxjrPA(androidx.compose.ui.unit.IntSize intSize) {
        this.popupContentSize.setValue(intSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.layout.LayoutCoordinates getParentLayoutCoordinates() {
        return (androidx.compose.ui.layout.LayoutCoordinates) this.parentLayoutCoordinates.getValue();
    }

    private final void setParentLayoutCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates.setValue(layoutCoordinates);
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
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-857613600);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Content)476@19626L9:AndroidPopup.android.kt#2oxthz");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-857613600, i, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:475)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.window.PopupLayout$Content$4
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
                    androidx.compose.ui.window.PopupLayout.this.Content(composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.stop();
        this.snapshotStateObserver.clear();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.internalOnMeasure$ui_release(android.view.View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean changed, int left, int top, int right, int bottom) {
        android.view.View childAt;
        super.internalOnLayout$ui_release(changed, left, top, right, bottom);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    private final int getDisplayWidth() {
        return kotlin.math.MathKt.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayHeight() {
        return kotlin.math.MathKt.roundToInt(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        if (event.getKeyCode() == 4 && this.properties.getDismissOnBackPress()) {
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

    private final void setIsFocusable(boolean isFocusable) {
        int i;
        if (!isFocusable) {
            i = this.params.flags | 8;
        } else {
            i = this.params.flags & (-9);
        }
        applyNewFlags(i);
    }

    private final void setSecurePolicy(androidx.compose.ui.window.SecureFlagPolicy securePolicy) {
        int i;
        if (androidx.compose.ui.window.SecureFlagPolicy_androidKt.shouldApplySecureFlag(securePolicy, androidx.compose.ui.window.AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView))) {
            i = this.params.flags | 8192;
        } else {
            i = this.params.flags & (-8193);
        }
        applyNewFlags(i);
    }

    private final void setClippingEnabled(boolean clippingEnabled) {
        int i;
        if (clippingEnabled) {
            i = this.params.flags & (-513);
        } else {
            i = this.params.flags | 512;
        }
        applyNewFlags(i);
    }

    public final void updateParameters(kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest, androidx.compose.ui.window.PopupProperties properties, java.lang.String testTag, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        if (properties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            this.params.width = -2;
            this.params.height = -2;
            this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
        }
        this.properties = properties;
        this.testTag = testTag;
        setIsFocusable(properties.getFocusable());
        setSecurePolicy(properties.getSecurePolicy());
        setClippingEnabled(properties.getClippingEnabled());
        superSetLayoutDirection(layoutDirection);
    }

    private final void applyNewFlags(int flags) {
        this.params.flags = flags;
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    public final void updateParentLayoutCoordinates(androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates) {
        setParentLayoutCoordinates(parentLayoutCoordinates);
        updateParentBounds$ui_release();
    }

    public final void pollForLocationOnScreenChange() {
        int[] iArr = this.locationOnScreen;
        int i = iArr[0];
        int i2 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i == iArr2[0] && i2 == iArr2[1]) {
            return;
        }
        updateParentBounds$ui_release();
    }

    public final void updateParentBounds$ui_release() {
        androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long mo3409getSizeYbymL2g = parentLayoutCoordinates.mo3409getSizeYbymL2g();
        long positionInWindow = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        androidx.compose.ui.unit.IntRect m4642IntRectVbeCjmY = androidx.compose.ui.unit.IntRectKt.m4642IntRectVbeCjmY(androidx.compose.ui.unit.IntOffsetKt.IntOffset(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m1871getXimpl(positionInWindow)), kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m1872getYimpl(positionInWindow))), mo3409getSizeYbymL2g);
        if (kotlin.jvm.internal.Intrinsics.areEqual(m4642IntRectVbeCjmY, this.parentBounds)) {
            return;
        }
        this.parentBounds = m4642IntRectVbeCjmY;
        updatePosition();
    }

    public final void updatePosition() {
        androidx.compose.ui.unit.IntSize m4735getPopupContentSizebOM6tXw;
        androidx.compose.ui.unit.IntRect intBounds;
        final androidx.compose.ui.unit.IntRect intRect = this.parentBounds;
        if (intRect == null || (m4735getPopupContentSizebOM6tXw = m4735getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long packedValue = m4735getPopupContentSizebOM6tXw.getPackedValue();
        android.graphics.Rect rect = this.previousWindowVisibleFrame;
        this.popupLayoutHelper.getWindowVisibleDisplayFrame(this.composeView, rect);
        intBounds = androidx.compose.ui.window.AndroidPopup_androidKt.toIntBounds(rect);
        final long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(intBounds.getWidth(), intBounds.getHeight());
        final kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
        longRef.element = androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
        this.snapshotStateObserver.observeReads(this, onCommitAffectingPopupPosition, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlin.jvm.internal.Ref.LongRef.this.element = this.getPositionProvider().mo1002calculatePositionllwVHH4(intRect, IntSize, this.getParentLayoutDirection(), packedValue);
            }
        });
        this.params.x = androidx.compose.ui.unit.IntOffset.m4610getXimpl(longRef.element);
        this.params.y = androidx.compose.ui.unit.IntOffset.m4611getYimpl(longRef.element);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.setGestureExclusionRects(this, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(IntSize), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(IntSize));
        }
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    public final void dismiss() {
        androidx.compose.ui.window.PopupLayout popupLayout = this;
        androidx.lifecycle.ViewTreeLifecycleOwner.set(popupLayout, null);
        this.windowManager.removeViewImmediate(popupLayout);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(event);
        }
        if (event != null && event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) {
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onDismissRequest;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (event != null && event.getAction() == 4) {
            kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onDismissRequest;
            if (function02 != null) {
                function02.invoke();
            }
            return true;
        }
        return super.onTouchEvent(event);
    }

    private final void superSetLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int i = androidx.compose.ui.window.PopupLayout.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
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
        layoutParams.flags &= -8552473;
        layoutParams.flags |= 262144;
        layoutParams.type = 1002;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        return layoutParams;
    }

    /* compiled from: AndroidPopup.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/window/PopupLayout$Companion;", "", "()V", "onCommitAffectingPopupPosition", "Lkotlin/Function1;", "Landroidx/compose/ui/window/PopupLayout;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
