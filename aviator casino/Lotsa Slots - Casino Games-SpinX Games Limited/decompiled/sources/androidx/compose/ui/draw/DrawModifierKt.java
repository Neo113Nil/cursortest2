package androidx.compose.ui.draw;

/* compiled from: DrawModifier.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a#\u0010\u0007\u001a\u00020\b*\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\u0006\u001a#\u0010\f\u001a\u00020\b*\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a#\u0010\r\u001a\u00020\b*\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\u0006¨\u0006\u000f"}, d2 = {"CacheDrawModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "onBuildDrawCache", "Lkotlin/Function1;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "Lkotlin/ExtensionFunctionType;", "drawBehind", "Landroidx/compose/ui/Modifier;", "onDraw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "drawWithCache", "drawWithContent", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
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
