package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0000\u0018\u00002\u00020\u0001Bì\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R%\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R%\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b/\u0010(R\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b0\u0010+R'\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b1\u0010(R\u001a\u0010\u000f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b2\u0010+R'\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b3\u0010(R\u001a\u0010\u0011\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b4\u0010+R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R%\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b8\u0010(R0\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0019\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b<\u0010.R\u001a\u0010\u001a\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b=\u0010.R\u001a\u0010\u001c\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u001e\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010D\u001a\u0004\bE\u0010F"}, d2 = {"Landroidx/compose/material3/TwoRowsTopAppBarOverrideScope;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "Landroidx/compose/ui/text/TextStyle;", "titleTextStyle", "Landroidx/compose/ui/unit/Dp;", "titleBottomPadding", "smallTitle", "smallTitleTextStyle", "subtitle", "subtitleTextStyle", "smallSubtitle", "smallSubtitleTextStyle", "Landroidx/compose/ui/Alignment$Horizontal;", "titleHorizontalAlignment", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "collapsedHeight", "expandedHeight", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/material3/TopAppBarColors;", "colors", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "scrollBehavior", "<init>", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Lkotlin/jvm/functions/Function2;", "getTitle", "()Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/text/TextStyle;", "getTitleTextStyle", "()Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTitleBottomPadding-D9Ej5fM", "()F", "getSmallTitle", "getSmallTitleTextStyle", "getSubtitle", "getSubtitleTextStyle", "getSmallSubtitle", "getSmallSubtitleTextStyle", "Landroidx/compose/ui/Alignment$Horizontal;", "getTitleHorizontalAlignment", "()Landroidx/compose/ui/Alignment$Horizontal;", "getNavigationIcon", "Lkotlin/jvm/functions/Function3;", "getActions", "()Lkotlin/jvm/functions/Function3;", "getCollapsedHeight-D9Ej5fM", "getExpandedHeight-D9Ej5fM", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/material3/TopAppBarColors;", "getColors", "()Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "getScrollBehavior", "()Landroidx/compose/material3/TopAppBarScrollBehavior;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TwoRowsTopAppBarOverrideScope {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> actions;
    private final float collapsedHeight;
    private final androidx.compose.material3.TopAppBarColors colors;
    private final float expandedHeight;
    private final androidx.compose.ui.Modifier modifier;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> navigationIcon;
    private final androidx.compose.material3.TopAppBarScrollBehavior scrollBehavior;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> smallSubtitle;
    private final androidx.compose.ui.text.TextStyle smallSubtitleTextStyle;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> smallTitle;
    private final androidx.compose.ui.text.TextStyle smallTitleTextStyle;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> subtitle;
    private final androidx.compose.ui.text.TextStyle subtitleTextStyle;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> title;
    private final float titleBottomPadding;
    private final androidx.compose.ui.Alignment.Horizontal titleHorizontalAlignment;
    private final androidx.compose.ui.text.TextStyle titleTextStyle;
    private final androidx.compose.foundation.layout.WindowInsets windowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    private TwoRowsTopAppBarOverrideScope(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.ui.text.TextStyle textStyle, float f, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.ui.text.TextStyle textStyle2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, androidx.compose.ui.text.TextStyle textStyle3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, androidx.compose.ui.text.TextStyle textStyle4, androidx.compose.ui.Alignment.Horizontal horizontal, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, float f2, float f3, androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.material3.TopAppBarColors topAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior topAppBarScrollBehavior) {
        this.modifier = modifier;
        this.title = function2;
        this.titleTextStyle = textStyle;
        this.titleBottomPadding = f;
        this.smallTitle = function22;
        this.smallTitleTextStyle = textStyle2;
        this.subtitle = function23;
        this.subtitleTextStyle = textStyle3;
        this.smallSubtitle = function24;
        this.smallSubtitleTextStyle = textStyle4;
        this.titleHorizontalAlignment = horizontal;
        this.navigationIcon = function25;
        this.actions = function3;
        this.collapsedHeight = f2;
        this.expandedHeight = f3;
        this.windowInsets = windowInsets;
        this.colors = topAppBarColors;
        this.scrollBehavior = topAppBarScrollBehavior;
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getTitle() {
        return this.title;
    }

    public final androidx.compose.ui.text.TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    /* renamed from: getTitleBottomPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTitleBottomPadding() {
        return this.titleBottomPadding;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getSmallTitle() {
        return this.smallTitle;
    }

    public final androidx.compose.ui.text.TextStyle getSmallTitleTextStyle() {
        return this.smallTitleTextStyle;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getSubtitle() {
        return this.subtitle;
    }

    public final androidx.compose.ui.text.TextStyle getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getSmallSubtitle() {
        return this.smallSubtitle;
    }

    public final androidx.compose.ui.text.TextStyle getSmallSubtitleTextStyle() {
        return this.smallSubtitleTextStyle;
    }

    public final androidx.compose.ui.Alignment.Horizontal getTitleHorizontalAlignment() {
        return this.titleHorizontalAlignment;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getNavigationIcon() {
        return this.navigationIcon;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getActions() {
        return this.actions;
    }

    /* renamed from: getCollapsedHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCollapsedHeight() {
        return this.collapsedHeight;
    }

    /* renamed from: getExpandedHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getExpandedHeight() {
        return this.expandedHeight;
    }

    public final androidx.compose.foundation.layout.WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public final androidx.compose.material3.TopAppBarColors getColors() {
        return this.colors;
    }

    public final androidx.compose.material3.TopAppBarScrollBehavior getScrollBehavior() {
        return this.scrollBehavior;
    }

    public /* synthetic */ TwoRowsTopAppBarOverrideScope(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.text.TextStyle textStyle, float f, kotlin.jvm.functions.Function2 function22, androidx.compose.ui.text.TextStyle textStyle2, kotlin.jvm.functions.Function2 function23, androidx.compose.ui.text.TextStyle textStyle3, kotlin.jvm.functions.Function2 function24, androidx.compose.ui.text.TextStyle textStyle4, androidx.compose.ui.Alignment.Horizontal horizontal, kotlin.jvm.functions.Function2 function25, kotlin.jvm.functions.Function3 function3, float f2, float f3, androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.material3.TopAppBarColors topAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior topAppBarScrollBehavior, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, function2, textStyle, f, function22, textStyle2, function23, textStyle3, function24, textStyle4, horizontal, function25, function3, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior);
    }
}
