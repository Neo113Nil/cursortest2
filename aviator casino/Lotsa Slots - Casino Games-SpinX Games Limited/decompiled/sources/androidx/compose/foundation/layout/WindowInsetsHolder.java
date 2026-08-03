package androidx.compose.foundation.layout;

/* compiled from: WindowInsets.android.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010=\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010?\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\bJ\u000e\u0010C\u001a\u00020>2\u0006\u0010A\u001a\u00020\u0003J\u000e\u0010D\u001a\u00020>2\u0006\u0010A\u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0011\u0010#\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0010R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010+\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010-\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\fR\u0011\u0010/\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0010R\u0011\u00101\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\fR\u0011\u00103\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0010R\u0011\u00105\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\fR\u0011\u00107\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\fR\u0011\u00109\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0010R\u0011\u0010;\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0010¨\u0006F"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "insets", "Landroidx/core/view/WindowInsetsCompat;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Landroidx/core/view/WindowInsetsCompat;Landroid/view/View;)V", "accessCount", "", "captionBar", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getCaptionBar", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "captionBarIgnoringVisibility", "Landroidx/compose/foundation/layout/ValueInsets;", "getCaptionBarIgnoringVisibility", "()Landroidx/compose/foundation/layout/ValueInsets;", "consumes", "", "getConsumes", "()Z", "displayCutout", "getDisplayCutout", "ime", "getIme", "imeAnimationSource", "getImeAnimationSource", "imeAnimationTarget", "getImeAnimationTarget", "insetsListener", "Landroidx/compose/foundation/layout/InsetsListener;", "mandatorySystemGestures", "getMandatorySystemGestures", "navigationBars", "getNavigationBars", "navigationBarsIgnoringVisibility", "getNavigationBarsIgnoringVisibility", "safeContent", "Landroidx/compose/foundation/layout/WindowInsets;", "getSafeContent", "()Landroidx/compose/foundation/layout/WindowInsets;", "safeDrawing", "getSafeDrawing", "safeGestures", "getSafeGestures", "statusBars", "getStatusBars", "statusBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility", "systemBars", "getSystemBars", "systemBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility", "systemGestures", "getSystemGestures", "tappableElement", "getTappableElement", "tappableElementIgnoringVisibility", "getTappableElementIgnoringVisibility", com.ironsource.mediationsdk.d.h, "getWaterfall", "decrementAccessors", "", "incrementAccessors", "update", "windowInsets", "types", "updateImeAnimationSource", "updateImeAnimationTarget", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    private static boolean testInsets;
    private int accessCount;
    private final androidx.compose.foundation.layout.AndroidWindowInsets captionBar;
    private final androidx.compose.foundation.layout.ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;
    private final androidx.compose.foundation.layout.AndroidWindowInsets displayCutout;
    private final androidx.compose.foundation.layout.AndroidWindowInsets ime;
    private final androidx.compose.foundation.layout.ValueInsets imeAnimationSource;
    private final androidx.compose.foundation.layout.ValueInsets imeAnimationTarget;
    private final androidx.compose.foundation.layout.InsetsListener insetsListener;
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
    private static final java.util.WeakHashMap<android.view.View, androidx.compose.foundation.layout.WindowInsetsHolder> viewMap = new java.util.WeakHashMap<>();

    public /* synthetic */ WindowInsetsHolder(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.View view, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsetsCompat, view);
    }

    private WindowInsetsHolder(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.View view) {
        androidx.core.view.DisplayCutoutCompat displayCutout;
        androidx.core.graphics.Insets waterfallInsets;
        androidx.compose.foundation.layout.WindowInsetsHolder.Companion companion = INSTANCE;
        this.captionBar = companion.systemInsets(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.captionBar(), "captionBar");
        androidx.compose.foundation.layout.AndroidWindowInsets systemInsets = companion.systemInsets(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.displayCutout = systemInsets;
        androidx.compose.foundation.layout.AndroidWindowInsets systemInsets2 = companion.systemInsets(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.ime(), "ime");
        this.ime = systemInsets2;
        androidx.compose.foundation.layout.AndroidWindowInsets systemInsets3 = companion.systemInsets(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.mandatorySystemGestures = systemInsets3;
        this.navigationBars = companion.systemInsets(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.statusBars = companion.systemInsets(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.statusBars(), "statusBars");
        androidx.compose.foundation.layout.AndroidWindowInsets systemInsets4 = companion.systemInsets(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.systemBars = systemInsets4;
        androidx.compose.foundation.layout.AndroidWindowInsets systemInsets5 = companion.systemInsets(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.systemGestures = systemInsets5;
        androidx.compose.foundation.layout.AndroidWindowInsets systemInsets6 = companion.systemInsets(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        this.tappableElement = systemInsets6;
        androidx.compose.foundation.layout.ValueInsets ValueInsets = androidx.compose.foundation.layout.WindowInsets_androidKt.ValueInsets((windowInsetsCompat == null || (displayCutout = windowInsetsCompat.getDisplayCutout()) == null || (waterfallInsets = displayCutout.getWaterfallInsets()) == null) ? androidx.core.graphics.Insets.NONE : waterfallInsets, com.ironsource.mediationsdk.d.h);
        this.waterfall = ValueInsets;
        androidx.compose.foundation.layout.WindowInsets union = androidx.compose.foundation.layout.WindowInsetsKt.union(androidx.compose.foundation.layout.WindowInsetsKt.union(systemInsets4, systemInsets2), systemInsets);
        this.safeDrawing = union;
        androidx.compose.foundation.layout.WindowInsets union2 = androidx.compose.foundation.layout.WindowInsetsKt.union(androidx.compose.foundation.layout.WindowInsetsKt.union(androidx.compose.foundation.layout.WindowInsetsKt.union(systemInsets6, systemInsets3), systemInsets5), ValueInsets);
        this.safeGestures = union2;
        this.safeContent = androidx.compose.foundation.layout.WindowInsetsKt.union(union, union2);
        this.captionBarIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.ime(), "imeAnimationTarget");
        this.imeAnimationSource = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Type.ime(), "imeAnimationSource");
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.Object tag = view2 != null ? view2.getTag(androidx.compose.ui.R.id.consume_window_insets_tag) : null;
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new androidx.compose.foundation.layout.InsetsListener(this);
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
        if (this.accessCount == 0) {
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            androidx.core.view.ViewCompat.setWindowInsetsAnimationCallback(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void decrementAccessors(android.view.View view) {
        int i = this.accessCount - 1;
        this.accessCount = i;
        if (i == 0) {
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view, null);
            androidx.core.view.ViewCompat.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    public static /* synthetic */ void update$default(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder, androidx.core.view.WindowInsetsCompat windowInsetsCompat, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i);
    }

    public final void update(androidx.core.view.WindowInsetsCompat windowInsets, int types) {
        if (testInsets) {
            android.view.WindowInsets windowInsets2 = windowInsets.toWindowInsets();
            kotlin.jvm.internal.Intrinsics.checkNotNull(windowInsets2);
            windowInsets = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsets2);
        }
        this.captionBar.update$foundation_layout_release(windowInsets, types);
        this.ime.update$foundation_layout_release(windowInsets, types);
        this.displayCutout.update$foundation_layout_release(windowInsets, types);
        this.navigationBars.update$foundation_layout_release(windowInsets, types);
        this.statusBars.update$foundation_layout_release(windowInsets, types);
        this.systemBars.update$foundation_layout_release(windowInsets, types);
        this.systemGestures.update$foundation_layout_release(windowInsets, types);
        this.tappableElement.update$foundation_layout_release(windowInsets, types);
        this.mandatorySystemGestures.update$foundation_layout_release(windowInsets, types);
        if (types == 0) {
            this.captionBarIgnoringVisibility.setValue$foundation_layout_release(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.captionBar())));
            this.navigationBarsIgnoringVisibility.setValue$foundation_layout_release(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.navigationBars())));
            this.statusBarsIgnoringVisibility.setValue$foundation_layout_release(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.statusBars())));
            this.systemBarsIgnoringVisibility.setValue$foundation_layout_release(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.systemBars())));
            this.tappableElementIgnoringVisibility.setValue$foundation_layout_release(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.tappableElement())));
            androidx.core.view.DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                this.waterfall.setValue$foundation_layout_release(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(displayCutout.getWaterfallInsets()));
            }
        }
        androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(androidx.core.view.WindowInsetsCompat windowInsets) {
        this.imeAnimationSource.setValue$foundation_layout_release(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsets(androidx.core.view.WindowInsetsCompat.Type.ime())));
    }

    public final void updateImeAnimationTarget(androidx.core.view.WindowInsetsCompat windowInsets) {
        this.imeAnimationTarget.setValue$foundation_layout_release(androidx.compose.foundation.layout.WindowInsets_androidKt.toInsetsValues(windowInsets.getInsets(androidx.core.view.WindowInsetsCompat.Type.ime())));
    }

    /* compiled from: WindowInsets.android.kt */
    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\"\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\"\u0010\u0017\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "()V", "testInsets", "", "viewMap", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "current", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "getOrCreateFor", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "setUseTestInsets", "", "systemInsets", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroidx/core/view/WindowInsetsCompat;", "type", "", "name", "", "valueInsetsIgnoringVisibility", "Landroidx/compose/foundation/layout/ValueInsets;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setUseTestInsets(boolean testInsets) {
            androidx.compose.foundation.layout.WindowInsetsHolder.testInsets = testInsets;
        }

        public final androidx.compose.foundation.layout.WindowInsetsHolder current(androidx.compose.runtime.Composer composer, int i) {
            composer.startReplaceableGroup(-1366542614);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(current)627@22834L7,630@22901L186:WindowInsets.android.kt#2w3rfo");
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            androidx.compose.runtime.ProvidableCompositionLocal<android.view.View> localView = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = composer.consume(localView);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            final android.view.View view = (android.view.View) consume;
            final androidx.compose.foundation.layout.WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            androidx.compose.runtime.EffectsKt.DisposableEffect(orCreateFor, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                    androidx.compose.foundation.layout.WindowInsetsHolder.this.incrementAccessors(view);
                    final androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder = androidx.compose.foundation.layout.WindowInsetsHolder.this;
                    final android.view.View view2 = view;
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            androidx.compose.foundation.layout.WindowInsetsHolder.this.decrementAccessors(view2);
                        }
                    };
                }
            }, composer, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return orCreateFor;
        }

        private final androidx.compose.foundation.layout.WindowInsetsHolder getOrCreateFor(android.view.View view) {
            androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder;
            synchronized (androidx.compose.foundation.layout.WindowInsetsHolder.viewMap) {
                java.util.WeakHashMap weakHashMap = androidx.compose.foundation.layout.WindowInsetsHolder.viewMap;
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

        /* JADX INFO: Access modifiers changed from: private */
        public final androidx.compose.foundation.layout.AndroidWindowInsets systemInsets(androidx.core.view.WindowInsetsCompat windowInsets, int type, java.lang.String name) {
            androidx.compose.foundation.layout.AndroidWindowInsets androidWindowInsets = new androidx.compose.foundation.layout.AndroidWindowInsets(type, name);
            if (windowInsets != null) {
                androidWindowInsets.update$foundation_layout_release(windowInsets, type);
            }
            return androidWindowInsets;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final androidx.compose.foundation.layout.ValueInsets valueInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat windowInsets, int type, java.lang.String name) {
            androidx.core.graphics.Insets insets;
            if (windowInsets == null || (insets = windowInsets.getInsetsIgnoringVisibility(type)) == null) {
                insets = androidx.core.graphics.Insets.NONE;
            }
            return androidx.compose.foundation.layout.WindowInsets_androidKt.ValueInsets(insets, name);
        }
    }
}
