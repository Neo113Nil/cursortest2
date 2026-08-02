package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b/\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\".\u0010\u0013\u001a\u00020\u000b*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b8G@GX\u0086\u000e¢\u0006\u0012\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\".\u0010\u0013\u001a\u00020\u000b*\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b8G@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0011\u0010\u0017\u001a\u0004\b\r\u0010\u0015\"\u0004\b\u000f\u0010\u0016\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001e\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b\"\u0015\u0010 \u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b\"\u0015\u0010\"\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b!\u0010\u001b\"\u0015\u0010$\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b#\u0010\u001b\"\u0015\u0010&\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b%\u0010\u001b\"\u0015\u0010(\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b'\u0010\u001b\"\u0015\u0010*\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b)\u0010\u001b\"\u0015\u0010,\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b+\u0010\u001b\"\u0015\u0010.\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b-\u0010\u001b\"\u0017\u00102\u001a\u0004\u0018\u00010/*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0015\u00104\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b3\u0010\u001b\"\u0015\u00106\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b5\u0010\u001b\"\u0015\u00108\u001a\u00020\u0019*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b7\u0010\u001b\"\u001b\u0010<\u001a\u00020\u0019*\u00020\u00188G¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u001b\"\u001b\u0010?\u001a\u00020\u0019*\u00020\u00188G¢\u0006\f\u0012\u0004\b>\u0010;\u001a\u0004\b=\u0010\u001b\"\u001b\u0010B\u001a\u00020\u0019*\u00020\u00188G¢\u0006\f\u0012\u0004\bA\u0010;\u001a\u0004\b@\u0010\u001b\"\u001b\u0010E\u001a\u00020\u0019*\u00020\u00188G¢\u0006\f\u0012\u0004\bD\u0010;\u001a\u0004\bC\u0010\u001b\"\u001b\u0010H\u001a\u00020\u0019*\u00020\u00188G¢\u0006\f\u0012\u0004\bG\u0010;\u001a\u0004\bF\u0010\u001b\"\u001b\u0010I\u001a\u00020\u000b*\u00020\u00188G¢\u0006\f\u0012\u0004\bK\u0010;\u001a\u0004\bI\u0010J\"\u001b\u0010L\u001a\u00020\u000b*\u00020\u00188G¢\u0006\f\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010J\"\u001b\u0010P\u001a\u00020\u000b*\u00020\u00188G¢\u0006\f\u0012\u0004\bO\u0010;\u001a\u0004\bN\u0010J\"\u001b\u0010S\u001a\u00020\u000b*\u00020\u00188G¢\u0006\f\u0012\u0004\bR\u0010;\u001a\u0004\bQ\u0010J\"\u001b\u0010V\u001a\u00020\u000b*\u00020\u00188G¢\u0006\f\u0012\u0004\bU\u0010;\u001a\u0004\bT\u0010J\"\u001b\u0010W\u001a\u00020\u000b*\u00020\u00188G¢\u0006\f\u0012\u0004\bX\u0010;\u001a\u0004\bW\u0010J\"\u001b\u0010[\u001a\u00020\u0019*\u00020\u00188G¢\u0006\f\u0012\u0004\bZ\u0010;\u001a\u0004\bY\u0010\u001b\"\u001b\u0010^\u001a\u00020\u0019*\u00020\u00188G¢\u0006\f\u0012\u0004\b]\u0010;\u001a\u0004\b\\\u0010\u001b"}, d2 = {"Landroidx/core/graphics/Insets;", "Landroidx/compose/foundation/layout/InsetsValues;", "toInsetsValues", "(Landroidx/core/graphics/Insets;)Landroidx/compose/foundation/layout/InsetsValues;", "insets", "", "name", "Landroidx/compose/foundation/layout/ValueInsets;", "ValueInsets", "(Landroidx/core/graphics/Insets;Ljava/lang/String;)Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getConsumeWindowInsets", "(Landroidx/compose/ui/platform/AbstractComposeView;)Z", "setConsumeWindowInsets", "(Landroidx/compose/ui/platform/AbstractComposeView;Z)V", "getConsumeWindowInsets$annotations", "(Landroidx/compose/ui/platform/AbstractComposeView;)V", "consumeWindowInsets", "Landroidx/compose/ui/platform/ComposeView;", "(Landroidx/compose/ui/platform/ComposeView;)Z", "(Landroidx/compose/ui/platform/ComposeView;Z)V", "(Landroidx/compose/ui/platform/ComposeView;)V", "Landroidx/compose/foundation/layout/WindowInsets$Companion;", "Landroidx/compose/foundation/layout/WindowInsets;", "getCaptionBar", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "captionBar", "getDisplayCutout", "displayCutout", "getIme", "ime", "getMandatorySystemGestures", "mandatorySystemGestures", "getNavigationBars", "navigationBars", "getStatusBars", "statusBars", "getSystemBars", "systemBars", "getSystemGestures", "systemGestures", "getTappableElement", "tappableElement", "getWaterfall", "waterfall", "Landroidx/compose/ui/graphics/Path;", "getCutoutPath", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Path;", "cutoutPath", "getSafeDrawing", "safeDrawing", "getSafeGestures", "safeGestures", "getSafeContent", "safeContent", "getCaptionBarIgnoringVisibility", "getCaptionBarIgnoringVisibility$annotations", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)V", "captionBarIgnoringVisibility", "getNavigationBarsIgnoringVisibility", "getNavigationBarsIgnoringVisibility$annotations", "navigationBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility$annotations", "statusBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility$annotations", "systemBarsIgnoringVisibility", "getTappableElementIgnoringVisibility", "getTappableElementIgnoringVisibility$annotations", "tappableElementIgnoringVisibility", "isCaptionBarVisible", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Z", "isCaptionBarVisible$annotations", "isImeVisible", "isImeVisible$annotations", "getAreStatusBarsVisible", "getAreStatusBarsVisible$annotations", "areStatusBarsVisible", "getAreNavigationBarsVisible", "getAreNavigationBarsVisible$annotations", "areNavigationBarsVisible", "getAreSystemBarsVisible", "getAreSystemBarsVisible$annotations", "areSystemBarsVisible", "isTappableElementVisible", "isTappableElementVisible$annotations", "getImeAnimationSource", "getImeAnimationSource$annotations", "imeAnimationSource", "getImeAnimationTarget", "getImeAnimationTarget$annotations", "imeAnimationTarget"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsets_androidKt {
    public static /* synthetic */ void getAreNavigationBarsVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void getAreStatusBarsVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void getAreSystemBarsVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void getCaptionBarIgnoringVisibility$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void getConsumeWindowInsets$annotations(androidx.compose.ui.platform.AbstractComposeView abstractComposeView) {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Please use AbstractComposeView.consumeWindowInsets")
    public static /* synthetic */ void getConsumeWindowInsets$annotations(androidx.compose.ui.platform.ComposeView composeView) {
    }

    public static /* synthetic */ void getImeAnimationSource$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void getImeAnimationTarget$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void getNavigationBarsIgnoringVisibility$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void getStatusBarsIgnoringVisibility$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void getSystemBarsIgnoringVisibility$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void getTappableElementIgnoringVisibility$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void isCaptionBarVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void isImeVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void isTappableElementVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
    }

    public static final androidx.compose.foundation.layout.InsetsValues toInsetsValues(androidx.core.graphics.Insets insets) {
        return new androidx.compose.foundation.layout.InsetsValues(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final androidx.compose.foundation.layout.ValueInsets ValueInsets(androidx.core.graphics.Insets insets, java.lang.String str) {
        return new androidx.compose.foundation.layout.ValueInsets(toInsetsValues(insets), str);
    }

    public static final boolean getConsumeWindowInsets(androidx.compose.ui.platform.AbstractComposeView abstractComposeView) {
        java.lang.Object tag = abstractComposeView.getTag(androidx.compose.ui.R.id.consume_window_insets_tag);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void setConsumeWindowInsets(androidx.compose.ui.platform.AbstractComposeView abstractComposeView, boolean z) {
        abstractComposeView.setTag(androidx.compose.ui.R.id.consume_window_insets_tag, java.lang.Boolean.valueOf(z));
    }

    public static final /* synthetic */ boolean getConsumeWindowInsets(androidx.compose.ui.platform.ComposeView composeView) {
        java.lang.Object tag = composeView.getTag(androidx.compose.ui.R.id.consume_window_insets_tag);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getCaptionBar(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1832025528, i, -1, "androidx.compose.foundation.layout.<get-captionBar> (WindowInsets.android.kt:141)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets captionBar = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getCaptionBar();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return captionBar;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getDisplayCutout(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1324817724, i, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:148)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets displayCutout = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getDisplayCutout();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return displayCutout;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getIme(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1466917860, i, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:160)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets ime = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getIme();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return ime;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getMandatorySystemGestures(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1369492988, i, -1, "androidx.compose.foundation.layout.<get-mandatorySystemGestures> (WindowInsets.android.kt:169)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets mandatorySystemGestures = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getMandatorySystemGestures();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return mandatorySystemGestures;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getNavigationBars(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1596175702, i, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:176)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets navigationBars = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getNavigationBars();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return navigationBars;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getStatusBars(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-675090670, i, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:180)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets statusBars = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getStatusBars();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return statusBars;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSystemBars(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-282936756, i, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:184)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets systemBars = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getSystemBars();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return systemBars;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSystemGestures(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(989216224, i, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:188)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets systemGestures = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getSystemGestures();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return systemGestures;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getTappableElement(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1994205284, i, -1, "androidx.compose.foundation.layout.<get-tappableElement> (WindowInsets.android.kt:192)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets tappableElement = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getTappableElement();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return tappableElement;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getWaterfall(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1943241020, i, -1, "androidx.compose.foundation.layout.<get-waterfall> (WindowInsets.android.kt:196)");
        }
        androidx.compose.foundation.layout.ValueInsets waterfall = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getWaterfall();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return waterfall;
    }

    public static final androidx.compose.ui.graphics.Path getCutoutPath(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-454263855, i, -1, "androidx.compose.foundation.layout.<get-cutoutPath> (WindowInsets.android.kt:204)");
        }
        androidx.compose.ui.graphics.Path cutoutPath = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getCutoutPath();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return cutoutPath;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSafeDrawing(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-49441252, i, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:211)");
        }
        androidx.compose.foundation.layout.WindowInsets safeDrawing = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getSafeDrawing();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return safeDrawing;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSafeGestures(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1594247780, i, -1, "androidx.compose.foundation.layout.<get-safeGestures> (WindowInsets.android.kt:219)");
        }
        androidx.compose.foundation.layout.WindowInsets safeGestures = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getSafeGestures();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return safeGestures;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSafeContent(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2026663876, i, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:226)");
        }
        androidx.compose.foundation.layout.WindowInsets safeContent = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getSafeContent();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return safeContent;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getCaptionBarIgnoringVisibility(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1731251574, i, -1, "androidx.compose.foundation.layout.<get-captionBarIgnoringVisibility> (WindowInsets.android.kt:236)");
        }
        androidx.compose.foundation.layout.ValueInsets captionBarIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getCaptionBarIgnoringVisibility();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return captionBarIgnoringVisibility;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getNavigationBarsIgnoringVisibility(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1990981160, i, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:247)");
        }
        androidx.compose.foundation.layout.ValueInsets navigationBarsIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getNavigationBarsIgnoringVisibility();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return navigationBarsIgnoringVisibility;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getStatusBarsIgnoringVisibility(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(594020756, i, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:257)");
        }
        androidx.compose.foundation.layout.ValueInsets statusBarsIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getStatusBarsIgnoringVisibility();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return statusBarsIgnoringVisibility;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSystemBarsIgnoringVisibility(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1564566798, i, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:268)");
        }
        androidx.compose.foundation.layout.ValueInsets systemBarsIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getSystemBarsIgnoringVisibility();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return systemBarsIgnoringVisibility;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getTappableElementIgnoringVisibility(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1488788292, i, -1, "androidx.compose.foundation.layout.<get-tappableElementIgnoringVisibility> (WindowInsets.android.kt:279)");
        }
        androidx.compose.foundation.layout.ValueInsets tappableElementIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getTappableElementIgnoringVisibility();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return tappableElementIgnoringVisibility;
    }

    public static final boolean isCaptionBarVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-501076620, i, -1, "androidx.compose.foundation.layout.<get-isCaptionBarVisible> (WindowInsets.android.kt:287)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getCaptionBar().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    public static final boolean isImeVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1873571424, i, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:295)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getIme().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    public static final boolean getAreStatusBarsVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1613283456, i, -1, "androidx.compose.foundation.layout.<get-areStatusBarsVisible> (WindowInsets.android.kt:303)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getStatusBars().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    public static final boolean getAreNavigationBarsVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(710310464, i, -1, "androidx.compose.foundation.layout.<get-areNavigationBarsVisible> (WindowInsets.android.kt:313)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getNavigationBars().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    public static final boolean getAreSystemBarsVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1985490720, i, -1, "androidx.compose.foundation.layout.<get-areSystemBarsVisible> (WindowInsets.android.kt:321)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getSystemBars().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    public static final boolean isTappableElementVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1737201120, i, -1, "androidx.compose.foundation.layout.<get-isTappableElementVisible> (WindowInsets.android.kt:330)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getTappableElement().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getImeAnimationSource(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1126064918, i, -1, "androidx.compose.foundation.layout.<get-imeAnimationSource> (WindowInsets.android.kt:340)");
        }
        androidx.compose.foundation.layout.ValueInsets imeAnimationSource = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getImeAnimationSource();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return imeAnimationSource;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getImeAnimationTarget(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-466319786, i, -1, "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:350)");
        }
        androidx.compose.foundation.layout.ValueInsets imeAnimationTarget = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 6).getImeAnimationTarget();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return imeAnimationTarget;
    }
}
