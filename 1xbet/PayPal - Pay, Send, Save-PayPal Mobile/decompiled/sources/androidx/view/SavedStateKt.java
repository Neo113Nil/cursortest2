package androidx.view;

@kotlin.Metadata(d1 = {"androidx/savedstate/SavedStateKt__SavedStateKt", "androidx/savedstate/SavedStateKt__SavedState_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedStateKt {
    public static final <T> T read(android.os.Bundle bundle, kotlin.jvm.functions.Function1<? super androidx.view.SavedStateReader, ? extends T> function1) {
        return (T) androidx.view.SavedStateKt__SavedStateKt.read(bundle, function1);
    }

    public static final android.os.Bundle savedState(android.os.Bundle bundle, kotlin.jvm.functions.Function1<? super androidx.view.SavedStateWriter, kotlin.Unit> function1) {
        return androidx.view.SavedStateKt__SavedState_androidKt.savedState(bundle, function1);
    }

    public static final android.os.Bundle savedState(java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.jvm.functions.Function1<? super androidx.view.SavedStateWriter, kotlin.Unit> function1) {
        return androidx.view.SavedStateKt__SavedState_androidKt.savedState(map, function1);
    }

    public static final <T> T write(android.os.Bundle bundle, kotlin.jvm.functions.Function1<? super androidx.view.SavedStateWriter, ? extends T> function1) {
        return (T) androidx.view.SavedStateKt__SavedStateKt.write(bundle, function1);
    }
}
