package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001Bi\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R2\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR0\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b"}, d2 = {"Landroidx/compose/material3/NavigationRailOverrideScope;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "content", "<init>", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "Lkotlin/jvm/functions/Function3;", "getHeader", "()Lkotlin/jvm/functions/Function3;", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "getContent"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigationRailOverrideScope {
    public static final int $stable = 0;
    private final long containerColor;
    private final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;
    private final long contentColor;
    private final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> header;
    private final androidx.compose.ui.Modifier modifier;
    private final androidx.compose.foundation.layout.WindowInsets windowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    private NavigationRailOverrideScope(androidx.compose.ui.Modifier modifier, long j, long j2, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.foundation.layout.WindowInsets windowInsets, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32) {
        this.modifier = modifier;
        this.containerColor = j;
        this.contentColor = j2;
        this.header = function3;
        this.windowInsets = windowInsets;
        this.content = function32;
    }

    public /* synthetic */ NavigationRailOverrideScope(androidx.compose.ui.Modifier modifier, long j, long j2, kotlin.jvm.functions.Function3 function3, androidx.compose.foundation.layout.WindowInsets windowInsets, kotlin.jvm.functions.Function3 function32, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier, j, j2, function3, windowInsets, function32, null);
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

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHeader() {
        return this.header;
    }

    public final androidx.compose.foundation.layout.WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return this.content;
    }

    public /* synthetic */ NavigationRailOverrideScope(androidx.compose.ui.Modifier modifier, long j, long j2, kotlin.jvm.functions.Function3 function3, androidx.compose.foundation.layout.WindowInsets windowInsets, kotlin.jvm.functions.Function3 function32, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, j, j2, function3, windowInsets, function32);
    }
}
