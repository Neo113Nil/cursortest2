package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J4\u0010\t\u001a\u00020\u0002*\u00020\u00022\u001f\u0010\b\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\b\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/TooltipScope;", "", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/draw/DrawResult;", "Lkotlin/ExtensionFunctionType;", "draw", "drawCaret", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/MeasureScope;", "obtainAnchorBounds", "(Landroidx/compose/ui/layout/MeasureScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/window/PopupPositionProvider;", "obtainPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/material3/TooltipScopeImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TooltipScope {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* synthetic */ androidx.compose.ui.Modifier drawCaret(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2);

    androidx.compose.ui.layout.LayoutCoordinates obtainAnchorBounds(androidx.compose.ui.layout.MeasureScope measureScope);

    androidx.compose.ui.window.PopupPositionProvider obtainPositionProvider();
}
