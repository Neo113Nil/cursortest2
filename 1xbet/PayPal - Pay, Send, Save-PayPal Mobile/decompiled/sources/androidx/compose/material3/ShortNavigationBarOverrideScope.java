package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BD\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/material3/ShortNavigationBarOverrideScope;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/material3/ShortNavigationBarArrangement;", "arrangement", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "<init>", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", com.visa.cbp.getEncExpo.warmup, "getArrangement-LnnQw40", "()I", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShortNavigationBarOverrideScope {
    public static final int $stable = 0;
    private final int arrangement;
    private final long containerColor;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content;
    private final long contentColor;
    private final androidx.compose.ui.Modifier modifier;
    private final androidx.compose.foundation.layout.WindowInsets windowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    private ShortNavigationBarOverrideScope(androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.foundation.layout.WindowInsets windowInsets, int i, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        this.modifier = modifier;
        this.containerColor = j;
        this.contentColor = j2;
        this.windowInsets = windowInsets;
        this.arrangement = i;
        this.content = function2;
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

    public final androidx.compose.foundation.layout.WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    /* renamed from: getArrangement-LnnQw40, reason: not valid java name and from getter */
    public final int getArrangement() {
        return this.arrangement;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return this.content;
    }

    public /* synthetic */ ShortNavigationBarOverrideScope(androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.foundation.layout.WindowInsets windowInsets, int i, kotlin.jvm.functions.Function2 function2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, j, j2, windowInsets, i, function2);
    }
}
