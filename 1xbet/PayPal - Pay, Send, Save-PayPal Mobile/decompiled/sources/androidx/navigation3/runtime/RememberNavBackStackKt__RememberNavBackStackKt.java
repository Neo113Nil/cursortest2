package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration;", "p0", "", "Landroidx/navigation3/runtime/NavKey;", "p1", "Landroidx/navigation3/runtime/NavBackStack;", "rememberNavBackStack", "(Landroidx/savedstate/serialization/SavedStateConfiguration;[Landroidx/navigation3/runtime/NavKey;Landroidx/compose/runtime/Composer;I)Landroidx/navigation3/runtime/NavBackStack;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/navigation3/runtime/RememberNavBackStackKt")
/* loaded from: classes7.dex */
final /* synthetic */ class RememberNavBackStackKt__RememberNavBackStackKt {
    public static final androidx.navigation3.runtime.NavBackStack<androidx.navigation3.runtime.NavKey> rememberNavBackStack(androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, final androidx.navigation3.runtime.NavKey[] navKeyArr, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-901404045, i, -1, "androidx.navigation3.runtime.rememberNavBackStack (RememberNavBackStack.kt:62)");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(savedStateConfiguration.getSerializersModule(), androidx.view.serialization.SavedStateConfiguration.DEFAULT.getSerializersModule())) {
            throw new java.lang.IllegalArgumentException("You must pass a `SavedStateConfiguration.serializersModule` configured to handle `NavKey` open polymorphism. Define it with: `polymorphic(NavKey::class) { ... }`".toString());
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.navigation3.runtime.serialization.NavBackStackSerializer navBackStackSerializer = new androidx.navigation3.runtime.serialization.NavBackStackSerializer(new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.navigation3.runtime.NavKey.class)));
        boolean changedInstance = composer.changedInstance(navKeyArr);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.navigation3.runtime.RememberNavBackStackKt__RememberNavBackStackKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.navigation3.runtime.RememberNavBackStackKt__RememberNavBackStackKt.getHighSpeedVideoFpsRangesFor(navKeyArr);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.navigation3.runtime.NavBackStack<androidx.navigation3.runtime.NavKey> navBackStack = (androidx.navigation3.runtime.NavBackStack) androidx.compose.runtime.saveable.RememberSerializableKt.m5467rememberSerializable(objArr, (kotlinx.serialization.KSerializer) navBackStackSerializer, savedStateConfiguration, (kotlin.jvm.functions.Function0) rememberedValue, composer, (i << 6) & 896, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return navBackStack;
    }

    public static /* synthetic */ androidx.navigation3.runtime.NavBackStack getHighSpeedVideoFpsRangesFor(androidx.navigation3.runtime.NavKey[] navKeyArr) {
        return new androidx.navigation3.runtime.NavBackStack((androidx.navigation3.runtime.NavKey[]) java.util.Arrays.copyOf(navKeyArr, navKeyArr.length));
    }
}
