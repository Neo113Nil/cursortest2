package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Function0;", "", "rememberReattachClickListenersHandle", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ReattachClickListenersKt {
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> rememberReattachClickListenersHandle(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1516905133, i, -1, "com.google.maps.android.compose.rememberReattachClickListenersHandle (ReattachClickListeners.kt:16)");
        }
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
        final com.google.maps.android.compose.MapApplier mapApplier = (com.google.maps.android.compose.MapApplier) applier;
        boolean changed = composer.changed(mapApplier);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.google.maps.android.compose.ReattachClickListenersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit rememberReattachClickListenersHandle$lambda$0$0;
                    rememberReattachClickListenersHandle$lambda$0$0 = com.google.maps.android.compose.ReattachClickListenersKt.rememberReattachClickListenersHandle$lambda$0$0(com.google.maps.android.compose.MapApplier.this);
                    return rememberReattachClickListenersHandle$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit rememberReattachClickListenersHandle$lambda$0$0(com.google.maps.android.compose.MapApplier mapApplier) {
        mapApplier.attachClickListeners$maps_compose_release();
        return kotlin.Unit.INSTANCE;
    }
}
