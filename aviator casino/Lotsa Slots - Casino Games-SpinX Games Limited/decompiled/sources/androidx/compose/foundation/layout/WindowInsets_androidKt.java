package androidx.compose.foundation.layout;

/* compiled from: WindowInsets.android.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0000\u001a\f\u0010V\u001a\u00020W*\u00020SH\u0000\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0011\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0010\"(\u0010\u0015\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\".\u0010\u0015\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00018F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e\"\u0004\b\u0019\u0010\u001f\"\u0015\u0010 \u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b!\u0010\u0010\"\u0015\u0010\"\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b#\u0010\u0010\"\u001e\u0010$\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0010\"\u001e\u0010'\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0010\"\u001e\u0010*\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0004\u001a\u0004\b*\u0010\u0006\"\u001e\u0010,\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0004\u001a\u0004\b,\u0010\u0006\"\u001e\u0010.\u001a\u00020\u0001*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0004\u001a\u0004\b.\u0010\u0006\"\u0015\u00100\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b1\u0010\u0010\"\u0015\u00102\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b3\u0010\u0010\"\u001e\u00104\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0010\"\u0015\u00107\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b8\u0010\u0010\"\u0015\u00109\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b:\u0010\u0010\"\u0015\u0010;\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b<\u0010\u0010\"\u0015\u0010=\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b>\u0010\u0010\"\u001e\u0010?\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010\u0004\u001a\u0004\bA\u0010\u0010\"\u0015\u0010B\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bC\u0010\u0010\"\u001e\u0010D\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0010\"\u0015\u0010G\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bH\u0010\u0010\"\u0015\u0010I\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bJ\u0010\u0010\"\u001e\u0010K\u001a\u00020\u000e*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0010\"\u0015\u0010N\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\bO\u0010\u0010¨\u0006X"}, d2 = {"areNavigationBarsVisible", "", "Landroidx/compose/foundation/layout/WindowInsets$Companion;", "getAreNavigationBarsVisible$annotations", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;)V", "getAreNavigationBarsVisible", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Z", "areStatusBarsVisible", "getAreStatusBarsVisible$annotations", "getAreStatusBarsVisible", "areSystemBarsVisible", "getAreSystemBarsVisible$annotations", "getAreSystemBarsVisible", "captionBar", "Landroidx/compose/foundation/layout/WindowInsets;", "getCaptionBar", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "captionBarIgnoringVisibility", "getCaptionBarIgnoringVisibility$annotations", "getCaptionBarIgnoringVisibility", "value", "consumeWindowInsets", "Landroidx/compose/ui/platform/AbstractComposeView;", "getConsumeWindowInsets", "(Landroidx/compose/ui/platform/AbstractComposeView;)Z", "setConsumeWindowInsets", "(Landroidx/compose/ui/platform/AbstractComposeView;Z)V", "Landroidx/compose/ui/platform/ComposeView;", "getConsumeWindowInsets$annotations", "(Landroidx/compose/ui/platform/ComposeView;)V", "(Landroidx/compose/ui/platform/ComposeView;)Z", "(Landroidx/compose/ui/platform/ComposeView;Z)V", "displayCutout", "getDisplayCutout", "ime", "getIme", "imeAnimationSource", "getImeAnimationSource$annotations", "getImeAnimationSource", "imeAnimationTarget", "getImeAnimationTarget$annotations", "getImeAnimationTarget", "isCaptionBarVisible", "isCaptionBarVisible$annotations", "isImeVisible", "isImeVisible$annotations", "isTappableElementVisible", "isTappableElementVisible$annotations", "mandatorySystemGestures", "getMandatorySystemGestures", "navigationBars", "getNavigationBars", "navigationBarsIgnoringVisibility", "getNavigationBarsIgnoringVisibility$annotations", "getNavigationBarsIgnoringVisibility", "safeContent", "getSafeContent", "safeDrawing", "getSafeDrawing", "safeGestures", "getSafeGestures", "statusBars", "getStatusBars", "statusBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility$annotations", "getStatusBarsIgnoringVisibility", "systemBars", "getSystemBars", "systemBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility$annotations", "getSystemBarsIgnoringVisibility", "systemGestures", "getSystemGestures", "tappableElement", "getTappableElement", "tappableElementIgnoringVisibility", "getTappableElementIgnoringVisibility$annotations", "getTappableElementIgnoringVisibility", com.ironsource.mediationsdk.d.h, "getWaterfall", "ValueInsets", "Landroidx/compose/foundation/layout/ValueInsets;", "insets", "Landroidx/core/graphics/Insets;", "name", "", "toInsetsValues", "Landroidx/compose/foundation/layout/InsetsValues;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsets_androidKt {
    public static /* synthetic */ void getAreNavigationBarsVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getAreStatusBarsVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getAreSystemBarsVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getCaptionBarIgnoringVisibility$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Please use AbstractComposeView.consumeWindowInsets")
    public static /* synthetic */ void getConsumeWindowInsets$annotations(androidx.compose.ui.platform.ComposeView composeView) {
    }

    public static /* synthetic */ void getImeAnimationSource$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getImeAnimationTarget$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getNavigationBarsIgnoringVisibility$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getStatusBarsIgnoringVisibility$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getSystemBarsIgnoringVisibility$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getTappableElementIgnoringVisibility$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void isCaptionBarVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void isImeVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void isTappableElementVisible$annotations(androidx.compose.foundation.layout.WindowInsets.Companion companion) {
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
        return true;
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
        return true;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getCaptionBar(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1832025528);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C142@4955L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1832025528, i, -1, "androidx.compose.foundation.layout.<get-captionBar> (WindowInsets.android.kt:142)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets captionBar = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getCaptionBar();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return captionBar;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getDisplayCutout(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1324817724);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C151@5303L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1324817724, i, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:151)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets displayCutout = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getDisplayCutout();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return displayCutout;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getIme(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1466917860);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C165@5937L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1466917860, i, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:165)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets ime = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getIme();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return ime;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getMandatorySystemGestures(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1369492988);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C174@6271L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1369492988, i, -1, "androidx.compose.foundation.layout.<get-mandatorySystemGestures> (WindowInsets.android.kt:174)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets mandatorySystemGestures = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getMandatorySystemGestures();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mandatorySystemGestures;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getNavigationBars(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1596175702);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C184@6630L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1596175702, i, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:184)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets navigationBars = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getNavigationBars();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationBars;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getStatusBars(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-675090670);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C192@6849L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-675090670, i, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:192)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets statusBars = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getStatusBars();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return statusBars;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSystemBars(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-282936756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C200@7064L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-282936756, i, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets systemBars = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getSystemBars();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemBars;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSystemGestures(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(989216224);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C208@7287L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(989216224, i, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:208)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets systemGestures = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getSystemGestures();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemGestures;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getTappableElement(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1994205284);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C216@7516L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1994205284, i, -1, "androidx.compose.foundation.layout.<get-tappableElement> (WindowInsets.android.kt:216)");
        }
        androidx.compose.foundation.layout.AndroidWindowInsets tappableElement = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getTappableElement();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tappableElement;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getWaterfall(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1943241020);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C224@7745L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1943241020, i, -1, "androidx.compose.foundation.layout.<get-waterfall> (WindowInsets.android.kt:224)");
        }
        androidx.compose.foundation.layout.ValueInsets waterfall = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getWaterfall();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return waterfall;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSafeDrawing(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-49441252);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C234@8107L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-49441252, i, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:234)");
        }
        androidx.compose.foundation.layout.WindowInsets safeDrawing = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getSafeDrawing();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return safeDrawing;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSafeGestures(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1594247780);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C245@8541L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1594247780, i, -1, "androidx.compose.foundation.layout.<get-safeGestures> (WindowInsets.android.kt:245)");
        }
        androidx.compose.foundation.layout.WindowInsets safeGestures = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getSafeGestures();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return safeGestures;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSafeContent(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-2026663876);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C254@8858L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2026663876, i, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:254)");
        }
        androidx.compose.foundation.layout.WindowInsets safeContent = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getSafeContent();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return safeContent;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getCaptionBarIgnoringVisibility(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1731251574);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C266@9266L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1731251574, i, -1, "androidx.compose.foundation.layout.<get-captionBarIgnoringVisibility> (WindowInsets.android.kt:266)");
        }
        androidx.compose.foundation.layout.ValueInsets captionBarIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getCaptionBarIgnoringVisibility();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return captionBarIgnoringVisibility;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getNavigationBarsIgnoringVisibility(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1990981160);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C280@9832L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1990981160, i, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:280)");
        }
        androidx.compose.foundation.layout.ValueInsets navigationBarsIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getNavigationBarsIgnoringVisibility();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationBarsIgnoringVisibility;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getStatusBarsIgnoringVisibility(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(594020756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C292@10273L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(594020756, i, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:292)");
        }
        androidx.compose.foundation.layout.ValueInsets statusBarsIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getStatusBarsIgnoringVisibility();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return statusBarsIgnoringVisibility;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getSystemBarsIgnoringVisibility(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1564566798);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C305@10710L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1564566798, i, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:305)");
        }
        androidx.compose.foundation.layout.ValueInsets systemBarsIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getSystemBarsIgnoringVisibility();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemBarsIgnoringVisibility;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getTappableElementIgnoringVisibility(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1488788292);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C318@11155L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1488788292, i, -1, "androidx.compose.foundation.layout.<get-tappableElementIgnoringVisibility> (WindowInsets.android.kt:318)");
        }
        androidx.compose.foundation.layout.ValueInsets tappableElementIgnoringVisibility = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getTappableElementIgnoringVisibility();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tappableElementIgnoringVisibility;
    }

    public static final boolean isCaptionBarVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-501076620);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C330@11561L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-501076620, i, -1, "androidx.compose.foundation.layout.<get-isCaptionBarVisible> (WindowInsets.android.kt:330)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getCaptionBar().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    public static final boolean isImeVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1873571424);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C342@11942L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1873571424, i, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:342)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getIme().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    public static final boolean getAreStatusBarsVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1613283456);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C354@12319L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1613283456, i, -1, "androidx.compose.foundation.layout.<get-areStatusBarsVisible> (WindowInsets.android.kt:354)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getStatusBars().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    public static final boolean getAreNavigationBarsVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(710310464);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C366@12711L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(710310464, i, -1, "androidx.compose.foundation.layout.<get-areNavigationBarsVisible> (WindowInsets.android.kt:366)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getNavigationBars().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    public static final boolean getAreSystemBarsVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1985490720);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C378@13099L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1985490720, i, -1, "androidx.compose.foundation.layout.<get-areSystemBarsVisible> (WindowInsets.android.kt:378)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getSystemBars().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    public static final boolean isTappableElementVisible(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1737201120);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C389@13490L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1737201120, i, -1, "androidx.compose.foundation.layout.<get-isTappableElementVisible> (WindowInsets.android.kt:389)");
        }
        boolean isVisible = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getTappableElement().isVisible();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return isVisible;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getImeAnimationSource(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1126064918);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C404@14002L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1126064918, i, -1, "androidx.compose.foundation.layout.<get-imeAnimationSource> (WindowInsets.android.kt:404)");
        }
        androidx.compose.foundation.layout.ValueInsets imeAnimationSource = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getImeAnimationSource();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imeAnimationSource;
    }

    public static final androidx.compose.foundation.layout.WindowInsets getImeAnimationTarget(androidx.compose.foundation.layout.WindowInsets.Companion companion, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-466319786);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C419@14543L9:WindowInsets.android.kt#2w3rfo");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-466319786, i, -1, "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:419)");
        }
        androidx.compose.foundation.layout.ValueInsets imeAnimationTarget = androidx.compose.foundation.layout.WindowInsetsHolder.INSTANCE.current(composer, 8).getImeAnimationTarget();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imeAnimationTarget;
    }
}
