package androidx.compose.ui.modifier;

/* compiled from: ModifierLocalProvider.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalProvider;", "T", "Landroidx/compose/ui/Modifier$Element;", com.ironsource.X3.i.W, "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "value", "getValue", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ModifierLocalProvider<T> extends androidx.compose.ui.Modifier.Element {
    androidx.compose.ui.modifier.ProvidableModifierLocal<T> getKey();

    T getValue();

    /* compiled from: ModifierLocalProvider.kt */
    /* renamed from: androidx.compose.ui.modifier.ModifierLocalProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: ModifierLocalProvider.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> boolean all(androidx.compose.ui.modifier.ModifierLocalProvider<T> modifierLocalProvider, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.Modifier.Element.CC.$default$all(modifierLocalProvider, function1);
        }

        @java.lang.Deprecated
        public static <T> boolean any(androidx.compose.ui.modifier.ModifierLocalProvider<T> modifierLocalProvider, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.Modifier.Element.CC.$default$any(modifierLocalProvider, function1);
        }

        @java.lang.Deprecated
        public static <T, R> R foldIn(androidx.compose.ui.modifier.ModifierLocalProvider<T> modifierLocalProvider, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.Modifier.Element.CC.$default$foldIn(modifierLocalProvider, r, function2);
        }

        @java.lang.Deprecated
        public static <T, R> R foldOut(androidx.compose.ui.modifier.ModifierLocalProvider<T> modifierLocalProvider, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
            return (R) androidx.compose.ui.Modifier.Element.CC.$default$foldOut(modifierLocalProvider, r, function2);
        }

        @java.lang.Deprecated
        public static <T> androidx.compose.ui.Modifier then(androidx.compose.ui.modifier.ModifierLocalProvider<T> modifierLocalProvider, androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.Modifier.CC.$default$then(modifierLocalProvider, modifier);
        }
    }
}
