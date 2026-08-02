package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 ]2\u00020\u0001:\u0001]B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001a\u0010\"\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001a\u0010$\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001a\u0010(\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019R\u001a\u0010+\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R/\u00107\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00109\u001a\u0002088\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010=\u001a\u0002088\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u001a\u0010?\u001a\u0002088\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<R\u001a\u0010A\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\bB\u0010.R\u001a\u0010C\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\bD\u0010.R\u001a\u0010E\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\bF\u0010.R\u001a\u0010G\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010,\u001a\u0004\bH\u0010.R\u001a\u0010I\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010,\u001a\u0004\bJ\u0010.R\u001a\u0010K\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010,\u001a\u0004\bL\u0010.R\u001a\u0010M\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010,\u001a\u0004\bN\u0010.R\u001d\u0010P\u001a\u00020O8\u0007¢\u0006\u0012\n\u0004\bP\u0010Q\u0012\u0004\bT\u0010U\u001a\u0004\bR\u0010SR\u0016\u0010X\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bZ\u0010["}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "Landroidx/core/view/WindowInsetsCompat;", "p0", "Landroid/view/View;", "p1", "<init>", "(Landroidx/core/view/WindowInsetsCompat;Landroid/view/View;)V", "view", "", "incrementAccessors", "(Landroid/view/View;)V", "decrementAccessors", "windowInsets", "", "types", "update", "(Landroidx/core/view/WindowInsetsCompat;I)V", "updateImeAnimationSource", "(Landroidx/core/view/WindowInsetsCompat;)V", "updateImeAnimationTarget", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "captionBar", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getCaptionBar", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "displayCutout", "getDisplayCutout", "ime", "getIme", "mandatorySystemGestures", "getMandatorySystemGestures", "navigationBars", "getNavigationBars", "statusBars", "getStatusBars", "systemBars", "getSystemBars", "systemGestures", "getSystemGestures", "tappableElement", "getTappableElement", "Landroidx/compose/foundation/layout/ValueInsets;", "waterfall", "Landroidx/compose/foundation/layout/ValueInsets;", "getWaterfall", "()Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/ui/graphics/Path;", "<set-?>", "cutoutPath$delegate", "Landroidx/compose/runtime/MutableState;", "getCutoutPath", "()Landroidx/compose/ui/graphics/Path;", "setCutoutPath", "(Landroidx/compose/ui/graphics/Path;)V", "cutoutPath", "Landroidx/compose/foundation/layout/WindowInsets;", "safeDrawing", "Landroidx/compose/foundation/layout/WindowInsets;", "getSafeDrawing", "()Landroidx/compose/foundation/layout/WindowInsets;", "safeGestures", "getSafeGestures", "safeContent", "getSafeContent", "captionBarIgnoringVisibility", "getCaptionBarIgnoringVisibility", "navigationBarsIgnoringVisibility", "getNavigationBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility", "tappableElementIgnoringVisibility", "getTappableElementIgnoringVisibility", "imeAnimationTarget", "getImeAnimationTarget", "imeAnimationSource", "getImeAnimationSource", "", "consumes", "Z", "getConsumes", "()Z", "getConsumes$annotations", "()V", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/layout/InsetsListener;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/layout/InsetsListener;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    private static boolean getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.foundation.layout.AndroidWindowInsets captionBar;
    private final androidx.compose.foundation.layout.ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;

    /* renamed from: cutoutPath$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState cutoutPath;
    private final androidx.compose.foundation.layout.AndroidWindowInsets displayCutout;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.InsetsListener Camera2StreamConfigurationMap;
    private final androidx.compose.foundation.layout.AndroidWindowInsets ime;
    private final androidx.compose.foundation.layout.ValueInsets imeAnimationSource;
    private final androidx.compose.foundation.layout.ValueInsets imeAnimationTarget;
    private final androidx.compose.foundation.layout.AndroidWindowInsets mandatorySystemGestures;
    private final androidx.compose.foundation.layout.AndroidWindowInsets navigationBars;
    private final androidx.compose.foundation.layout.ValueInsets navigationBarsIgnoringVisibility;
    private final androidx.compose.foundation.layout.WindowInsets safeContent;
    private final androidx.compose.foundation.layout.WindowInsets safeDrawing;
    private final androidx.compose.foundation.layout.WindowInsets safeGestures;
    private final androidx.compose.foundation.layout.AndroidWindowInsets statusBars;
    private final androidx.compose.foundation.layout.ValueInsets statusBarsIgnoringVisibility;
    private final androidx.compose.foundation.layout.AndroidWindowInsets systemBars;
    private final androidx.compose.foundation.layout.ValueInsets systemBarsIgnoringVisibility;
    private final androidx.compose.foundation.layout.AndroidWindowInsets systemGestures;
    private final androidx.compose.foundation.layout.AndroidWindowInsets tappableElement;
    private final androidx.compose.foundation.layout.ValueInsets tappableElementIgnoringVisibility;
    private final androidx.compose.foundation.layout.ValueInsets waterfall;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.layout.WindowInsetsHolder.Companion INSTANCE = new androidx.compose.foundation.layout.WindowInsetsHolder.Companion(null);
    public static final int $stable = 8;
    private static final java.util.WeakHashMap<android.view.View, androidx.compose.foundation.layout.WindowInsetsHolder> getHighSpeedVideoFpsRangesFor = new java.util.WeakHashMap<>();

    public static /* synthetic */ void getConsumes$annotations() {
    }

    private WindowInsetsHolder(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.View view) {
        androidx.core.view.DisplayCutoutCompat displayCutout;
        android.graphics.Path cutoutPath;
        androidx.core.view.DisplayCutoutCompat displayCutout2;
        androidx.core.graphics.Insets waterfallInsets;
        androidx.compose.foundation.layout.WindowInsetsHolder.Companion companion = INSTANCE;
        androidx.compose.foundation.layout.AndroidWindowInsets access$systemInsets = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$systemInsets(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.captionBar(), "captionBar");
        this.captionBar = access$systemInsets;
        androidx.compose.foundation.layout.AndroidWindowInsets access$systemInsets2 = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$systemInsets(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.displayCutout = access$systemInsets2;
        androidx.compose.foundation.layout.AndroidWindowInsets access$systemInsets3 = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$systemInsets(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.ime(), "ime");
        this.ime = access$systemInsets3;
        androidx.compose.foundation.layout.AndroidWindowInsets access$systemInsets4 = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$systemInsets(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.mandatorySystemGestures = access$systemInsets4;
        androidx.compose.foundation.layout.AndroidWindowInsets access$systemInsets5 = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$systemInsets(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.navigationBars = access$systemInsets5;
        androidx.compose.foundation.layout.AndroidWindowInsets access$systemInsets6 = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$systemInsets(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.statusBars(), "statusBars");
        this.statusBars = access$systemInsets6;
        androidx.compose.foundation.layout.AndroidWindowInsets access$systemInsets7 = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$systemInsets(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.systemBars = access$systemInsets7;
        androidx.compose.foundation.layout.AndroidWindowInsets access$systemInsets8 = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$systemInsets(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.systemGestures = access$systemInsets8;
        androidx.compose.foundation.layout.AndroidWindowInsets access$systemInsets9 = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$systemInsets(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        this.tappableElement = access$systemInsets9;
        androidx.compose.foundation.layout.ValueInsets ValueInsets = androidx.compose.foundation.layout.WindowInsets_androidKt.ValueInsets((windowInsetsCompat == null || (displayCutout2 = windowInsetsCompat.getDisplayCutout()) == null || (waterfallInsets = displayCutout2.getWaterfallInsets()) == null) ? androidx.core.graphics.Insets.NONE : waterfallInsets, "waterfall");
        this.waterfall = ValueInsets;
        this.cutoutPath = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((windowInsetsCompat == null || (displayCutout = windowInsetsCompat.getDisplayCutout()) == null || (cutoutPath = displayCutout.getCutoutPath()) == null) ? null : androidx.compose.ui.graphics.AndroidPath_androidKt.asComposePath(cutoutPath), null, 2, null);
        androidx.compose.foundation.layout.WindowInsets union = androidx.compose.foundation.layout.WindowInsetsKt.union(androidx.compose.foundation.layout.WindowInsetsKt.union(access$systemInsets7, access$systemInsets3), access$systemInsets2);
        this.safeDrawing = union;
        androidx.compose.foundation.layout.WindowInsets union2 = androidx.compose.foundation.layout.WindowInsetsKt.union(androidx.compose.foundation.layout.WindowInsetsKt.union(androidx.compose.foundation.layout.WindowInsetsKt.union(access$systemInsets9, access$systemInsets4), access$systemInsets8), ValueInsets);
        this.safeGestures = union2;
        this.safeContent = androidx.compose.foundation.layout.WindowInsetsKt.union(union, union2);
        this.captionBarIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = androidx.compose.foundation.layout.WindowInsets_androidKt.ValueInsets(androidx.core.graphics.Insets.NONE, "imeAnimationTarget");
        this.imeAnimationSource = androidx.compose.foundation.layout.WindowInsets_androidKt.ValueInsets(androidx.core.graphics.Insets.NONE, "imeAnimationSource");
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.Object tag = view2 != null ? view2.getTag(androidx.compose.ui.R.id.consume_window_insets_tag) : null;
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : false;
        this.Camera2StreamConfigurationMap = new androidx.compose.foundation.layout.InsetsListener(this);
        androidx.core.view.WindowInsetsCompat rootWindowInsets = androidx.core.view.ViewCompat.getRootWindowInsets(view);
        if (rootWindowInsets != null) {
            access$systemInsets.setVisible(rootWindowInsets.isVisible(androidx.core.view.WindowInsetsCompat.Type.captionBar()));
            access$systemInsets2.setVisible(rootWindowInsets.isVisible(androidx.core.view.WindowInsetsCompat.Type.displayCutout()));
            access$systemInsets3.setVisible(rootWindowInsets.isVisible(androidx.core.view.WindowInsetsCompat.Type.ime()));
            access$systemInsets4.setVisible(rootWindowInsets.isVisible(androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures()));
            access$systemInsets5.setVisible(rootWindowInsets.isVisible(androidx.core.view.WindowInsetsCompat.Type.navigationBars()));
            access$systemInsets6.setVisible(rootWindowInsets.isVisible(androidx.core.view.WindowInsetsCompat.Type.statusBars()));
            access$systemInsets7.setVisible(rootWindowInsets.isVisible(androidx.core.view.WindowInsetsCompat.Type.systemBars()));
            access$systemInsets8.setVisible(rootWindowInsets.isVisible(androidx.core.view.WindowInsetsCompat.Type.systemGestures()));
            access$systemInsets9.setVisible(rootWindowInsets.isVisible(androidx.core.view.WindowInsetsCompat.Type.tappableElement()));
        }
    }

    public final androidx.compose.foundation.layout.AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    public final androidx.compose.foundation.layout.AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    public final androidx.compose.foundation.layout.AndroidWindowInsets getIme() {
        return this.ime;
    }

    public final androidx.compose.foundation.layout.AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    public final androidx.compose.foundation.layout.AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    public final androidx.compose.foundation.layout.AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    public final androidx.compose.foundation.layout.AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    public final androidx.compose.foundation.layout.AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    public final androidx.compose.foundation.layout.AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    public final androidx.compose.foundation.layout.ValueInsets getWaterfall() {
        return this.waterfall;
    }

    private final void setCutoutPath(androidx.compose.ui.graphics.Path path) {
        this.cutoutPath.setValue(path);
    }

    public final androidx.compose.ui.graphics.Path getCutoutPath() {
        return (androidx.compose.ui.graphics.Path) this.cutoutPath.getValue();
    }

    public final androidx.compose.foundation.layout.WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    public final androidx.compose.foundation.layout.WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    public final androidx.compose.foundation.layout.WindowInsets getSafeContent() {
        return this.safeContent;
    }

    public final androidx.compose.foundation.layout.ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final androidx.compose.foundation.layout.ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    public final androidx.compose.foundation.layout.ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    public final androidx.compose.foundation.layout.ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    public final androidx.compose.foundation.layout.ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    public final androidx.compose.foundation.layout.ValueInsets getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    public final androidx.compose.foundation.layout.ValueInsets getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    public final void incrementAccessors(android.view.View view) {
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view, this.Camera2StreamConfigurationMap);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.Camera2StreamConfigurationMap);
            androidx.core.view.ViewCompat.setWindowInsetsAnimationCallback(view, this.Camera2StreamConfigurationMap);
        }
        this.getHighSpeedVideoFpsRangesFor++;
    }

    public final void decrementAccessors(android.view.View view) {
        int i = this.getHighSpeedVideoFpsRangesFor - 1;
        this.getHighSpeedVideoFpsRangesFor = i;
        if (i == 0) {
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view, null);
            androidx.core.view.ViewCompat.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.Camera2StreamConfigurationMap);
        }
    }

    public static /* synthetic */ void update$default(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder, androidx.core.view.WindowInsetsCompat windowInsetsCompat, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i);
    }

    public final void update(androidx.core.view.WindowInsetsCompat windowInsets, int types) {
        androidx.core.graphics.Insets insets;
        android.graphics.Path cutoutPath;
        if (getHighResolutionOutputSizeshNQ4ISI) {
            android.view.WindowInsets windowInsets2 = windowInsets.toWindowInsets();
            kotlin.jvm.internal.Intrinsics.checkNotNull(windowInsets2);
            windowInsets = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsets2);
        }
        this.captionBar.update$foundation_layout(windowInsets, types);
        this.ime.update$foundation_layout(windowInsets, types);
        this.displayCutout.update$foundation_layout(windowInsets, types);
        this.navigationBars.update$foundation_layout(windowInsets, types);
        this.statusBars.update$foundation_layout(windowInsets, types);
        this.systemBars.update$foundation_layout(windowInsets, types);
        this.systemGestures.update$foundation_layout(windowInsets, types);
        this.tappableElement.update$foundation_layout(windowInsets, types);
        this.mandatorySystemGestures.update$foundation_layout(windowInsets, types);
        if (types == 0) {
            this.captionBarIgnoringVisibility.setValue$foundation_layout(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.captionBar())));
            this.navigationBarsIgnoringVisibility.setValue$foundation_layout(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.navigationBars())));
            this.statusBarsIgnoringVisibility.setValue$foundation_layout(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.statusBars())));
            this.systemBarsIgnoringVisibility.setValue$foundation_layout(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.systemBars())));
            this.tappableElementIgnoringVisibility.setValue$foundation_layout(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.tappableElement())));
            androidx.core.view.DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
            androidx.compose.foundation.layout.ValueInsets valueInsets = this.waterfall;
            if (displayCutout == null || (insets = displayCutout.getWaterfallInsets()) == null) {
                insets = androidx.core.graphics.Insets.NONE;
            }
            valueInsets.setValue$foundation_layout(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(insets));
            setCutoutPath((displayCutout == null || (cutoutPath = displayCutout.getCutoutPath()) == null) ? null : androidx.compose.ui.graphics.AndroidPath_androidKt.asComposePath(cutoutPath));
        }
        androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(androidx.core.view.WindowInsetsCompat windowInsets) {
        this.imeAnimationSource.setValue$foundation_layout(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsets(androidx.core.view.WindowInsetsCompat.Type.ime())));
    }

    public final void updateImeAnimationTarget(androidx.core.view.WindowInsetsCompat windowInsets) {
        this.imeAnimationTarget.setValue$foundation_layout(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsets(androidx.core.view.WindowInsetsCompat.Type.ime())));
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0017\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001a\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "<init>", "()V", "", "testInsets", "", "setUseTestInsets", "(Z)V", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "current", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroid/view/View;", "view", "getOrCreateFor", "(Landroid/view/View;)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroidx/core/view/WindowInsetsCompat;", "p0", "", "p1", "", "p2", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Camera2StreamConfigurationMap", "(Landroidx/core/view/WindowInsetsCompat;ILjava/lang/String;)Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/ValueInsets;", "getHighSpeedVideoSizes", "(Landroidx/core/view/WindowInsetsCompat;ILjava/lang/String;)Landroidx/compose/foundation/layout/ValueInsets;", "Ljava/util/WeakHashMap;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/WeakHashMap;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ androidx.compose.foundation.layout.AndroidWindowInsets access$systemInsets(androidx.compose.foundation.layout.WindowInsetsHolder.Companion companion, androidx.core.view.WindowInsetsCompat windowInsetsCompat, int i, java.lang.String str) {
            return Camera2StreamConfigurationMap(windowInsetsCompat, i, str);
        }

        public static final /* synthetic */ androidx.compose.foundation.layout.ValueInsets access$valueInsetsIgnoringVisibility(androidx.compose.foundation.layout.WindowInsetsHolder.Companion companion, androidx.core.view.WindowInsetsCompat windowInsetsCompat, int i, java.lang.String str) {
            return getHighSpeedVideoSizes(windowInsetsCompat, i, str);
        }

        public final void setUseTestInsets(boolean testInsets) {
            androidx.compose.foundation.layout.WindowInsetsHolder.getHighResolutionOutputSizeshNQ4ISI = testInsets;
        }

        public final androidx.compose.foundation.layout.WindowInsetsHolder current(androidx.compose.runtime.Composer composer, int i) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:574)");
            }
            final android.view.View view = (android.view.View) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
            final androidx.compose.foundation.layout.WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            boolean changedInstance = composer.changedInstance(orCreateFor);
            boolean changedInstance2 = composer.changedInstance(view);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.runtime.DisposableEffectResult highSpeedVideoFpsRangesFor;
                        highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.WindowInsetsHolder.Companion.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.WindowInsetsHolder.this, view);
                        return highSpeedVideoFpsRangesFor;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(orCreateFor, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return orCreateFor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoFpsRangesFor(final androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder, final android.view.View view) {
            windowInsetsHolder.incrementAccessors(view);
            return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$lambda$0$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public final void dispose() {
                    androidx.compose.foundation.layout.WindowInsetsHolder.this.decrementAccessors(view);
                }
            };
        }

        public final androidx.compose.foundation.layout.WindowInsetsHolder getOrCreateFor(android.view.View view) {
            androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder;
            synchronized (androidx.compose.foundation.layout.WindowInsetsHolder.getHighSpeedVideoFpsRangesFor) {
                java.util.WeakHashMap weakHashMap = androidx.compose.foundation.layout.WindowInsetsHolder.getHighSpeedVideoFpsRangesFor;
                java.lang.Object obj = weakHashMap.get(view);
                java.lang.Object obj2 = obj;
                if (obj == null) {
                    androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder2 = new androidx.compose.foundation.layout.WindowInsetsHolder(null, view, false ? 1 : 0);
                    weakHashMap.put(view, windowInsetsHolder2);
                    obj2 = windowInsetsHolder2;
                }
                windowInsetsHolder = (androidx.compose.foundation.layout.WindowInsetsHolder) obj2;
            }
            return windowInsetsHolder;
        }

        private static androidx.compose.foundation.layout.AndroidWindowInsets Camera2StreamConfigurationMap(androidx.core.view.WindowInsetsCompat p0, int p1, java.lang.String p2) {
            androidx.compose.foundation.layout.AndroidWindowInsets androidWindowInsets = new androidx.compose.foundation.layout.AndroidWindowInsets(p1, p2);
            if (p0 != null) {
                androidWindowInsets.update$foundation_layout(p0, p1);
            }
            return androidWindowInsets;
        }

        private static androidx.compose.foundation.layout.ValueInsets getHighSpeedVideoSizes(androidx.core.view.WindowInsetsCompat p0, int p1, java.lang.String p2) {
            androidx.core.graphics.Insets insets;
            if (p0 == null || (insets = p0.getInsetsIgnoringVisibility(p1)) == null) {
                insets = androidx.core.graphics.Insets.NONE;
            }
            return androidx.compose.foundation.layout.WindowInsets_androidKt.ValueInsets(insets, p2);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WindowInsetsHolder(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.View view, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsetsCompat, view);
    }
}
