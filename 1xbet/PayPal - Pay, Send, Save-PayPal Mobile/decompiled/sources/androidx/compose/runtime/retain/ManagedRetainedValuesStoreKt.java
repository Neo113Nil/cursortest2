package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/runtime/retain/ManagedRetainedValuesStore;", "retainManagedRetainedValuesStore", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/retain/ManagedRetainedValuesStore;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ManagedRetainedValuesStoreKt {
    public static final androidx.compose.runtime.retain.ManagedRetainedValuesStore retainManagedRetainedValuesStore(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(847199873, i, -1, "androidx.compose.runtime.retain.retainManagedRetainedValuesStore (ManagedRetainedValuesStore.kt:172)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.retain.ManagedRetainedValuesStoreKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.runtime.retain.ManagedRetainedValuesStoreKt.m5439$r8$lambda$1qtlAUVzXpfX3iO2uw0YvjAW_E();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.retain.ManagedRetainedValuesStore getHighSpeedVideoFpsRanges = ((androidx.compose.runtime.retain.RetainManagedRetainedValuesStoreWrapper) androidx.compose.runtime.retain.RetainKt.retain("androidx.compose.runtime.retain.RetainManagedRetainedValuesStoreWrapper".hashCode(), (kotlin.jvm.functions.Function0) rememberedValue, composer, 48)).getGetHighSpeedVideoFpsRanges();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: $r8$lambda$1qtlAUVzXpfX3iO2uw0YvjAW-_E, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.retain.RetainManagedRetainedValuesStoreWrapper m5439$r8$lambda$1qtlAUVzXpfX3iO2uw0YvjAW_E() {
        return new androidx.compose.runtime.retain.RetainManagedRetainedValuesStoreWrapper();
    }
}
