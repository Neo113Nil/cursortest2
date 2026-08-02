package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u000b\u0010\u0007\u001a&\u0010\r\u001a\u00020\f2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0010\u0010\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "onDraw", "drawBehind", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "onBuildDrawCache", "drawWithCache", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "CacheDrawModifierNode", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/CacheDrawModifierNode;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawWithContent"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawModifierKt {
    public static final androidx.compose.ui.Modifier drawBehind(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.ui.draw.DrawBehindElement(function1));
    }

    public static final androidx.compose.ui.Modifier drawWithCache(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.draw.DrawResult> function1) {
        return modifier.then(new androidx.compose.ui.draw.DrawWithCacheElement(function1));
    }

    public static final androidx.compose.ui.draw.CacheDrawModifierNode CacheDrawModifierNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.draw.DrawResult> function1) {
        return new androidx.compose.ui.draw.CacheDrawModifierNodeImpl(new androidx.compose.ui.draw.CacheDrawScope(), function1);
    }

    public static final androidx.compose.ui.Modifier drawWithContent(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.ui.draw.DrawWithContentElement(function1));
    }
}
