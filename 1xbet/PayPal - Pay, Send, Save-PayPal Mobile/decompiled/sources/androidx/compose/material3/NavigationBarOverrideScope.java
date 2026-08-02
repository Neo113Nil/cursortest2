package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BQ\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR0\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/material3/NavigationBarOverrideScope;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTonalElevation-D9Ej5fM", "()F", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "Lkotlin/jvm/functions/Function3;", "getContent", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigationBarOverrideScope {
    public static final int $stable = 0;
    private final long containerColor;
    private final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;
    private final long contentColor;
    private final androidx.compose.ui.Modifier modifier;
    private final float tonalElevation;
    private final androidx.compose.foundation.layout.WindowInsets windowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    private NavigationBarOverrideScope(androidx.compose.ui.Modifier modifier, long j, long j2, float f, androidx.compose.foundation.layout.WindowInsets windowInsets, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.modifier = modifier;
        this.containerColor = j;
        this.contentColor = j2;
        this.tonalElevation = f;
        this.windowInsets = windowInsets;
        this.content = function3;
    }

    public /* synthetic */ NavigationBarOverrideScope(androidx.compose.ui.Modifier modifier, long j, long j2, float f, androidx.compose.foundation.layout.WindowInsets windowInsets, kotlin.jvm.functions.Function3 function3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier, j, j2, f, windowInsets, function3, null);
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTonalElevation() {
        return this.tonalElevation;
    }

    public final androidx.compose.foundation.layout.WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return this.content;
    }

    public /* synthetic */ NavigationBarOverrideScope(androidx.compose.ui.Modifier modifier, long j, long j2, float f, androidx.compose.foundation.layout.WindowInsets windowInsets, kotlin.jvm.functions.Function3 function3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, j, j2, f, windowInsets, function3);
    }
}
