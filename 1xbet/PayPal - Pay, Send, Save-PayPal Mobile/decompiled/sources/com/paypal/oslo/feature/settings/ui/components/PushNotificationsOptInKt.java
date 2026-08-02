package com.paypal.oslo.feature.settings.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00040\u0000¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlin/Function0;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;", "Landroidx/compose/runtime/Composable;", "pushOptInStateFactory", "", "content", "ProvidePushNotificationsOptIn", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPushNotificationsOptIn", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPushNotificationsOptIn", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PushNotificationsOptInKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState> LocalPushNotificationsOptIn = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.components.PushNotificationsOptInKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.settings.ui.components.PushNotificationsOptInKt.m19276$r8$lambda$X05IVS5xVgbQ3wjWxBRiq9ZfU();
        }
    });

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState> getLocalPushNotificationsOptIn() {
        return LocalPushNotificationsOptIn;
    }

    public static final void ProvidePushNotificationsOptIn(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState> function2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(526879987);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(526879987, i2, -1, "com.paypal.oslo.feature.settings.ui.components.ProvidePushNotificationsOptIn (PushNotificationsOptIn.kt:39)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(LocalPushNotificationsOptIn.provides(function2.invoke(startRestartGroup, java.lang.Integer.valueOf(i2 & 14))), function22, startRestartGroup, (i2 & 112) | androidx.compose.runtime.ProvidedValue.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.components.PushNotificationsOptInKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.ui.components.PushNotificationsOptInKt.$r8$lambda$nkMZSCBjQrpxwo6t28YI4Q3_c0s(kotlin.jvm.functions.Function2.this, function22, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$X05IVS5xVgbQ3wjW-x-BRiq9ZfU, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState m19276$r8$lambda$X05IVS5xVgbQ3wjWxBRiq9ZfU() {
        throw new java.lang.IllegalStateException("No PushNotificationsOptIn provided".toString());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nkMZSCBjQrpxwo6t28YI4Q3_c0s(kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i, androidx.compose.runtime.Composer composer, int i2) {
        ProvidePushNotificationsOptIn(function2, function22, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
