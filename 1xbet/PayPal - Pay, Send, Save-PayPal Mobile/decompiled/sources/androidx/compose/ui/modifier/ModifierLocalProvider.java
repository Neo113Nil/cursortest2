package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalProvider;", "T", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "()Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ModifierLocalProvider<T> extends androidx.compose.ui.Modifier.Element {
    androidx.compose.ui.modifier.ProvidableModifierLocal<T> getKey();

    T getValue();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> boolean all(androidx.compose.ui.modifier.ModifierLocalProvider<T> modifierLocalProvider, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.modifier.ModifierLocalProvider.super.all(function1);
        }

        @java.lang.Deprecated
        public static <T> boolean any(androidx.compose.ui.modifier.ModifierLocalProvider<T> modifierLocalProvider, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.modifier.ModifierLocalProvider.super.any(function1);
        }

        @java.lang.Deprecated
        public static <T, R> R foldIn(androidx.compose.ui.modifier.ModifierLocalProvider<T> modifierLocalProvider, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.modifier.ModifierLocalProvider.super.foldIn(r, function2);
        }

        @java.lang.Deprecated
        public static <T, R> R foldOut(androidx.compose.ui.modifier.ModifierLocalProvider<T> modifierLocalProvider, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
            return (R) androidx.compose.ui.modifier.ModifierLocalProvider.super.foldOut(r, function2);
        }

        @java.lang.Deprecated
        public static <T> androidx.compose.ui.Modifier then(androidx.compose.ui.modifier.ModifierLocalProvider<T> modifierLocalProvider, androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.modifier.ModifierLocalProvider.super.then(modifier);
        }
    }
}
