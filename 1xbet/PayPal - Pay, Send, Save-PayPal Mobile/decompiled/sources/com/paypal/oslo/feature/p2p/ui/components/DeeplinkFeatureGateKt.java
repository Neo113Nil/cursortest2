package com.paypal.oslo.feature.p2p.ui.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aN\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "p2pFeatureGateManager", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/reflect/KClass;", "destinationClass", "", "claimWebViewUrl", "claimWebViewTitle", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "DeeplinkFeatureGate", "(Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/reflect/KClass;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeeplinkFeatureGateKt {
    public static final void DeeplinkFeatureGate(final com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.reflect.KClass<?> kClass, final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2pFeatureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(797552037);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(p2pFeatureGateManager) : startRestartGroup.changedInstance(p2pFeatureGateManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(kClass) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(797552037, i2, -1, "com.paypal.oslo.feature.p2p.ui.components.DeeplinkFeatureGate (DeeplinkFeatureGate.kt:44)");
            }
            if (!p2pFeatureGateManager.isClaimMoneyDeeplinkEnabled()) {
                startRestartGroup.startReplaceGroup(113968284);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(kClass);
                boolean z = (i2 & 112) == 32;
                boolean z2 = (i2 & 7168) == 2048;
                boolean z3 = (i2 & 57344) == 16384;
                com.paypal.oslo.feature.p2p.ui.components.DeeplinkFeatureGateKt$DeeplinkFeatureGate$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.p2p.ui.components.DeeplinkFeatureGateKt$DeeplinkFeatureGate$1$1(kClass, appNavigator, str, str2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.components.DeeplinkFeatureGateKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.p2p.ui.components.DeeplinkFeatureGateKt.m17263$r8$lambda$dCFoaBxVsqjUQcQNuLOIhNS5eI(com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager.this, appNavigator, kClass, str, str2, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            startRestartGroup.startReplaceGroup(114553533);
            startRestartGroup.endReplaceGroup();
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i2 >> 15) & 14));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.components.DeeplinkFeatureGateKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.components.DeeplinkFeatureGateKt.$r8$lambda$3yWs7kxQR0XTgJzdfjimjhlOzu4(com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager.this, appNavigator, kClass, str, str2, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-dCFoaBxVsqjUQcQNuLOIhNS5eI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17263$r8$lambda$dCFoaBxVsqjUQcQNuLOIhNS5eI(com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.reflect.KClass kClass, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        DeeplinkFeatureGate(p2pFeatureGateManager, appNavigator, kClass, str, str2, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3yWs7kxQR0XTgJzdfjimjhlOzu4(com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.reflect.KClass kClass, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        DeeplinkFeatureGate(p2pFeatureGateManager, appNavigator, kClass, str, str2, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
