package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DrawModifier extends androidx.compose.ui.Modifier.Element {
    void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean all(androidx.compose.ui.draw.DrawModifier drawModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.draw.DrawModifier.super.all(function1);
        }

        @java.lang.Deprecated
        public static boolean any(androidx.compose.ui.draw.DrawModifier drawModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.draw.DrawModifier.super.any(function1);
        }

        @java.lang.Deprecated
        public static <R> R foldIn(androidx.compose.ui.draw.DrawModifier drawModifier, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.draw.DrawModifier.super.foldIn(r, function2);
        }

        @java.lang.Deprecated
        public static <R> R foldOut(androidx.compose.ui.draw.DrawModifier drawModifier, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
            return (R) androidx.compose.ui.draw.DrawModifier.super.foldOut(r, function2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier then(androidx.compose.ui.draw.DrawModifier drawModifier, androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.draw.DrawModifier.super.then(modifier);
        }
    }
}
