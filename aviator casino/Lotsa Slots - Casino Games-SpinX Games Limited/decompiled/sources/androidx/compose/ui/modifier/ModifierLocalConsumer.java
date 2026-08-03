package androidx.compose.ui.modifier;

/* compiled from: ModifierLocalConsumer.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/Modifier$Element;", "onModifierLocalsUpdated", "", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ModifierLocalConsumer extends androidx.compose.ui.Modifier.Element {
    void onModifierLocalsUpdated(androidx.compose.ui.modifier.ModifierLocalReadScope scope);

    /* compiled from: ModifierLocalConsumer.kt */
    /* renamed from: androidx.compose.ui.modifier.ModifierLocalConsumer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: ModifierLocalConsumer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean all(androidx.compose.ui.modifier.ModifierLocalConsumer modifierLocalConsumer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.Modifier.Element.CC.$default$all(modifierLocalConsumer, function1);
        }

        @java.lang.Deprecated
        public static boolean any(androidx.compose.ui.modifier.ModifierLocalConsumer modifierLocalConsumer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.Modifier.Element.CC.$default$any(modifierLocalConsumer, function1);
        }

        @java.lang.Deprecated
        public static <R> R foldIn(androidx.compose.ui.modifier.ModifierLocalConsumer modifierLocalConsumer, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.Modifier.Element.CC.$default$foldIn(modifierLocalConsumer, r, function2);
        }

        @java.lang.Deprecated
        public static <R> R foldOut(androidx.compose.ui.modifier.ModifierLocalConsumer modifierLocalConsumer, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
            return (R) androidx.compose.ui.Modifier.Element.CC.$default$foldOut(modifierLocalConsumer, r, function2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier then(androidx.compose.ui.modifier.ModifierLocalConsumer modifierLocalConsumer, androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.Modifier.CC.$default$then(modifierLocalConsumer, modifier);
        }
    }
}
