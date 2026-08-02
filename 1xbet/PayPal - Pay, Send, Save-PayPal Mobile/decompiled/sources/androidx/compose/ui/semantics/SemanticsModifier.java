package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsModifier;", "Landroidx/compose/ui/Modifier$Element;", "", "getId", "()I", "getId$annotations", "()V", "id", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SemanticsModifier extends androidx.compose.ui.Modifier.Element {
    default int getId() {
        return -1;
    }

    androidx.compose.ui.semantics.SemanticsConfiguration getSemanticsConfiguration();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public static /* synthetic */ void getId$annotations() {
        }

        @java.lang.Deprecated
        public static boolean all(androidx.compose.ui.semantics.SemanticsModifier semanticsModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.semantics.SemanticsModifier.super.all(function1);
        }

        @java.lang.Deprecated
        public static boolean any(androidx.compose.ui.semantics.SemanticsModifier semanticsModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.semantics.SemanticsModifier.super.any(function1);
        }

        @java.lang.Deprecated
        public static <R> R foldIn(androidx.compose.ui.semantics.SemanticsModifier semanticsModifier, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.semantics.SemanticsModifier.super.foldIn(r, function2);
        }

        @java.lang.Deprecated
        public static <R> R foldOut(androidx.compose.ui.semantics.SemanticsModifier semanticsModifier, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
            return (R) androidx.compose.ui.semantics.SemanticsModifier.super.foldOut(r, function2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier then(androidx.compose.ui.semantics.SemanticsModifier semanticsModifier, androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.semantics.SemanticsModifier.super.then(modifier);
        }

        @java.lang.Deprecated
        public static int getId(androidx.compose.ui.semantics.SemanticsModifier semanticsModifier) {
            return androidx.compose.ui.semantics.SemanticsModifier.super.getId();
        }
    }
}
