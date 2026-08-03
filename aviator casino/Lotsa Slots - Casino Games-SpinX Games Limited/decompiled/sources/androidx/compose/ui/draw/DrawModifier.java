package androidx.compose.ui.draw;

/* compiled from: DrawModifier.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/Modifier$Element;", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DrawModifier extends androidx.compose.ui.Modifier.Element {
    void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope);

    /* compiled from: DrawModifier.kt */
    /* renamed from: androidx.compose.ui.draw.DrawModifier$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: DrawModifier.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean all(androidx.compose.ui.draw.DrawModifier drawModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.Modifier.Element.CC.$default$all(drawModifier, function1);
        }

        @java.lang.Deprecated
        public static boolean any(androidx.compose.ui.draw.DrawModifier drawModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.Modifier.Element.CC.$default$any(drawModifier, function1);
        }

        @java.lang.Deprecated
        public static <R> R foldIn(androidx.compose.ui.draw.DrawModifier drawModifier, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.Modifier.Element.CC.$default$foldIn(drawModifier, r, function2);
        }

        @java.lang.Deprecated
        public static <R> R foldOut(androidx.compose.ui.draw.DrawModifier drawModifier, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
            return (R) androidx.compose.ui.Modifier.Element.CC.$default$foldOut(drawModifier, r, function2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier then(androidx.compose.ui.draw.DrawModifier drawModifier, androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.Modifier.CC.$default$then(drawModifier, modifier);
        }
    }
}
