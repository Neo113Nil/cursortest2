package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilter"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PointerInputModifier extends androidx.compose.ui.Modifier.Element {
    androidx.compose.ui.input.pointer.PointerInputFilter getPointerInputFilter();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean all(androidx.compose.ui.input.pointer.PointerInputModifier pointerInputModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.input.pointer.PointerInputModifier.super.all(function1);
        }

        @java.lang.Deprecated
        public static boolean any(androidx.compose.ui.input.pointer.PointerInputModifier pointerInputModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.input.pointer.PointerInputModifier.super.any(function1);
        }

        @java.lang.Deprecated
        public static <R> R foldIn(androidx.compose.ui.input.pointer.PointerInputModifier pointerInputModifier, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.input.pointer.PointerInputModifier.super.foldIn(r, function2);
        }

        @java.lang.Deprecated
        public static <R> R foldOut(androidx.compose.ui.input.pointer.PointerInputModifier pointerInputModifier, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
            return (R) androidx.compose.ui.input.pointer.PointerInputModifier.super.foldOut(r, function2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier then(androidx.compose.ui.input.pointer.PointerInputModifier pointerInputModifier, androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.input.pointer.PointerInputModifier.super.then(modifier);
        }
    }
}
