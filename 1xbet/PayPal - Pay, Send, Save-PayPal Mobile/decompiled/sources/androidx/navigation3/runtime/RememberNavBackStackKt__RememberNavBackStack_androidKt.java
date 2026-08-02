package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/navigation3/runtime/NavKey;", "p0", "Landroidx/navigation3/runtime/NavBackStack;", "rememberNavBackStack", "([Landroidx/navigation3/runtime/NavKey;Landroidx/compose/runtime/Composer;I)Landroidx/navigation3/runtime/NavBackStack;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/navigation3/runtime/RememberNavBackStackKt")
/* loaded from: classes7.dex */
final /* synthetic */ class RememberNavBackStackKt__RememberNavBackStack_androidKt {
    public static final androidx.navigation3.runtime.NavBackStack<androidx.navigation3.runtime.NavKey> rememberNavBackStack(final androidx.navigation3.runtime.NavKey[] navKeyArr, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-526551470, i, -1, "androidx.navigation3.runtime.rememberNavBackStack (RememberNavBackStack.android.kt:56)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.navigation3.runtime.serialization.NavBackStackSerializer navBackStackSerializer = new androidx.navigation3.runtime.serialization.NavBackStackSerializer(new androidx.navigation3.runtime.serialization.NavKeySerializer());
        boolean changedInstance = composer.changedInstance(navKeyArr);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.navigation3.runtime.RememberNavBackStackKt__RememberNavBackStack_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.navigation3.runtime.RememberNavBackStackKt__RememberNavBackStack_androidKt.Camera2StreamConfigurationMap(navKeyArr);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.navigation3.runtime.NavBackStack<androidx.navigation3.runtime.NavKey> navBackStack = (androidx.navigation3.runtime.NavBackStack) androidx.compose.runtime.saveable.RememberSerializableKt.m5467rememberSerializable(objArr, (kotlinx.serialization.KSerializer) navBackStackSerializer, (androidx.view.serialization.SavedStateConfiguration) null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return navBackStack;
    }

    public static /* synthetic */ androidx.navigation3.runtime.NavBackStack Camera2StreamConfigurationMap(androidx.navigation3.runtime.NavKey[] navKeyArr) {
        return new androidx.navigation3.runtime.NavBackStack((androidx.navigation3.runtime.NavKey[]) java.util.Arrays.copyOf(navKeyArr, navKeyArr.length));
    }
}
