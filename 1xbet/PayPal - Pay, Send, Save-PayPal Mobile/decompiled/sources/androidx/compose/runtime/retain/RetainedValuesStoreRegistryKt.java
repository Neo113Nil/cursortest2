package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/runtime/retain/RetainedValuesStoreRegistry;", "retainRetainedValuesStoreRegistry", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/retain/RetainedValuesStoreRegistry;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RetainedValuesStoreRegistryKt {
    public static final androidx.compose.runtime.retain.RetainedValuesStoreRegistry retainRetainedValuesStoreRegistry(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1800021473, i, -1, "androidx.compose.runtime.retain.retainRetainedValuesStoreRegistry (RetainedValuesStoreRegistry.kt:145)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.retain.RetainedValuesStoreRegistryKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.runtime.retain.RetainedValuesStoreRegistryKt.$r8$lambda$XmK5EVT5ZmVv2MNTDNRECFWB58E();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.retain.RetainedValuesStoreRegistry getHighSpeedVideoSizes = ((androidx.compose.runtime.retain.RetainedValuesStoreRegistryWrapper) androidx.compose.runtime.retain.RetainKt.retain("androidx.compose.runtime.retain.RetainedValuesStoreRegistryWrapper".hashCode(), (kotlin.jvm.functions.Function0) rememberedValue, composer, 48)).getGetHighSpeedVideoSizes();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return getHighSpeedVideoSizes;
    }

    public static /* synthetic */ androidx.compose.runtime.retain.RetainedValuesStoreRegistryWrapper $r8$lambda$XmK5EVT5ZmVv2MNTDNRECFWB58E() {
        return new androidx.compose.runtime.retain.RetainedValuesStoreRegistryWrapper();
    }
}
