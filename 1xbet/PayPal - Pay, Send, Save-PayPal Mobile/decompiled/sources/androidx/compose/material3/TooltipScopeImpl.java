package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u000f\u001a\u00020\t*\u00020\t2\u001f\u0010\u000e\u001a\u001b\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015"}, d2 = {"Landroidx/compose/material3/TooltipScopeImpl;", "Landroidx/compose/material3/TooltipScope;", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getAnchorBounds", "Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupPositionProvider;)V", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "Lkotlin/ExtensionFunctionType;", "draw", "drawCaret", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/MeasureScope;", "obtainAnchorBounds", "(Landroidx/compose/ui/layout/MeasureScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "obtainPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "Lkotlin/jvm/functions/Function0;", "getGetAnchorBounds", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/window/PopupPositionProvider;", "getPositionProvider"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TooltipScopeImpl implements androidx.compose.material3.TooltipScope {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<androidx.compose.ui.layout.LayoutCoordinates> getAnchorBounds;
    private final androidx.compose.ui.window.PopupPositionProvider positionProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public TooltipScopeImpl(kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> function0, androidx.compose.ui.window.PopupPositionProvider popupPositionProvider) {
        this.getAnchorBounds = function0;
        this.positionProvider = popupPositionProvider;
    }

    public final kotlin.jvm.functions.Function0<androidx.compose.ui.layout.LayoutCoordinates> getGetAnchorBounds() {
        return this.getAnchorBounds;
    }

    public final androidx.compose.ui.window.PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.material3.TooltipScope
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final /* synthetic */ androidx.compose.ui.Modifier drawCaret(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2 function2) {
        return androidx.compose.ui.draw.DrawModifierKt.drawWithCache(modifier, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TooltipScopeImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.TooltipScopeImpl.$r8$lambda$j1CXzVZMKKX4Z0Zse5_0WbA4XsI(kotlin.jvm.functions.Function2.this, this, (androidx.compose.ui.draw.CacheDrawScope) obj);
            }
        });
    }

    @Override // androidx.compose.material3.TooltipScope
    public final androidx.compose.ui.layout.LayoutCoordinates obtainAnchorBounds(androidx.compose.ui.layout.MeasureScope measureScope) {
        return this.getAnchorBounds.invoke();
    }

    @Override // androidx.compose.material3.TooltipScope
    public final androidx.compose.ui.window.PopupPositionProvider obtainPositionProvider() {
        return this.positionProvider;
    }

    public static /* synthetic */ androidx.compose.ui.draw.DrawResult $r8$lambda$j1CXzVZMKKX4Z0Zse5_0WbA4XsI(kotlin.jvm.functions.Function2 function2, androidx.compose.material3.TooltipScopeImpl tooltipScopeImpl, androidx.compose.ui.draw.CacheDrawScope cacheDrawScope) {
        return (androidx.compose.ui.draw.DrawResult) function2.invoke(cacheDrawScope, tooltipScopeImpl.getAnchorBounds.invoke());
    }
}
