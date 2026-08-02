package com.paypal.oslo.core.navigation.result;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "rememberNavResultRequestId", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NavResultRequestIdKt {
    public static final java.lang.String rememberNavResultRequestId(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-776959254, i, -1, "com.paypal.oslo.core.navigation.result.rememberNavResultRequestId (NavResultRequestId.kt:193)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<com.paypal.oslo.core.navigation.result.NavResultRequestId, java.lang.String> saver = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.getSaver();
        com.paypal.oslo.core.navigation.result.NavResultRequestId.Companion companion = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE;
        com.paypal.oslo.core.navigation.result.NavResultRequestIdKt$rememberNavResultRequestId$1$1 rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.core.navigation.result.NavResultRequestIdKt$rememberNavResultRequestId$1$1(companion);
            composer.updateRememberedValue(rememberedValue);
        }
        java.lang.String m11592unboximpl = ((com.paypal.oslo.core.navigation.result.NavResultRequestId) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue), composer, 0)).m11592unboximpl();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m11592unboximpl;
    }
}
