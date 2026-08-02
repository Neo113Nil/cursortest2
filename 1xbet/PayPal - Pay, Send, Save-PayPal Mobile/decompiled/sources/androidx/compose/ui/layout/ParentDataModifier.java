package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ParentDataModifier extends androidx.compose.ui.Modifier.Element {
    java.lang.Object modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean all(androidx.compose.ui.layout.ParentDataModifier parentDataModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.layout.ParentDataModifier.super.all(function1);
        }

        @java.lang.Deprecated
        public static boolean any(androidx.compose.ui.layout.ParentDataModifier parentDataModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.layout.ParentDataModifier.super.any(function1);
        }

        @java.lang.Deprecated
        public static <R> R foldIn(androidx.compose.ui.layout.ParentDataModifier parentDataModifier, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.layout.ParentDataModifier.super.foldIn(r, function2);
        }

        @java.lang.Deprecated
        public static <R> R foldOut(androidx.compose.ui.layout.ParentDataModifier parentDataModifier, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
            return (R) androidx.compose.ui.layout.ParentDataModifier.super.foldOut(r, function2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier then(androidx.compose.ui.layout.ParentDataModifier parentDataModifier, androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.layout.ParentDataModifier.super.then(modifier);
        }
    }
}
