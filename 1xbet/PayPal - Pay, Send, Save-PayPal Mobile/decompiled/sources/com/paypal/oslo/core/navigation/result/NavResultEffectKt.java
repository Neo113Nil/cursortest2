package com.paypal.oslo.core.navigation.result;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\u001a\u0017\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0007\u001aq\u0010\b\u001a\u00020\t\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00102\"\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00140\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aY\u0010\u0017\u001a\u00020\t\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022$\b\b\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002"}, d2 = {"LocalNavResultManager", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "getLocalNavResultManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "resolveNavResultManager", "explicit", "(Lcom/paypal/oslo/core/navigation/result/NavResultManager;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "NavResultEffectImpl", "", "T", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "requestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "manager", "onResult", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "getResultFlow", "Lkotlinx/coroutines/flow/Flow;", "NavResultEffectImpl-rtGRyWw", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/result/NavResultManager;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "NavResultEffect", "navResultManager", "NavResultEffect-rtGRyWw", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/result/NavResultManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "navigation_release", "isRegistered", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NavResultEffectKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.core.navigation.result.NavResultManager> Camera2StreamConfigurationMap = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.result.NavResultEffectKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.navigation.result.NavResultEffectKt.$r8$lambda$q4l70p0jdICNI9N7xNE7xap2Drs();
        }
    });

    public static /* synthetic */ com.paypal.oslo.core.navigation.result.NavResultManager $r8$lambda$q4l70p0jdICNI9N7xNE7xap2Drs() {
        return null;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.core.navigation.result.NavResultManager> getLocalNavResultManager() {
        return Camera2StreamConfigurationMap;
    }

    public static final com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2133785651, i, -1, "com.paypal.oslo.core.navigation.result.resolveNavResultManager (NavResultEffect.kt:67)");
        }
        if (navResultManager == null) {
            composer.startReplaceGroup(-1868606508);
            navResultManager = (com.paypal.oslo.core.navigation.result.NavResultManager) composer.consume(Camera2StreamConfigurationMap);
        } else {
            composer.startReplaceGroup(-1868607562);
        }
        composer.endReplaceGroup();
        if (navResultManager == null) {
            throw new java.lang.IllegalStateException("NavResultManager not provided. Either pass it explicitly or provide via CompositionLocalProvider.".toString());
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return navResultManager;
    }

    /* renamed from: NavResultEffectImpl-rtGRyWw, reason: not valid java name */
    public static final <T extends com.paypal.oslo.core.navigation.result.NavResult> void m11578NavResultEffectImplrtGRyWw(final java.lang.String str, final com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, final kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.core.navigation.result.NavResultManager, ? super com.paypal.oslo.core.navigation.result.NavResultRequestId, ? extends kotlinx.coroutines.flow.Flow<? extends java.lang.Object>> function22, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-897437639);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(navResultManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-897437639, i2, -1, "com.paypal.oslo.core.navigation.result.NavResultEffectImpl (NavResultEffect.kt:89)");
            }
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(navResultManager.m11583observeRequestRegistrationDpEMydE(str), null, startRestartGroup, 0, 1);
            com.paypal.oslo.core.navigation.result.NavResultRequestId m11587boximpl = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(str);
            boolean booleanValue = ((java.lang.Boolean) collectAsState.getValue()).booleanValue();
            boolean z = (i2 & 7168) == 2048;
            boolean changedInstance = startRestartGroup.changedInstance(navResultManager);
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            boolean changedInstance2 = startRestartGroup.changedInstance(function2);
            com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((z | changedInstance | z2) || changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = i4;
                rememberedValue = new com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1(function22, navResultManager, str, function2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i3 = i4;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(m11587boximpl, java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, i3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.result.NavResultEffectKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.result.NavResultEffectKt.$r8$lambda$9I73dPMFCBAPTJqmqkIvwvyORoA(str, navResultManager, function2, function22, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: NavResultEffect-rtGRyWw, reason: not valid java name */
    public static final /* synthetic */ <T extends com.paypal.oslo.core.navigation.result.NavResult> void m11577NavResultEffectrtGRyWw(java.lang.String str, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if ((i2 & 2) != 0) {
            navResultManager = null;
        }
        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = resolveNavResultManager(navResultManager, composer, (i >> 3) & 14);
        com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffect$1$1 rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffect$1$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                    return m11579invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                }

                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m11579invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                    return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str2);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue, composer, (i & 14) | 3072 | (i & 896));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9I73dPMFCBAPTJqmqkIvwvyORoA(java.lang.String str, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i, androidx.compose.runtime.Composer composer, int i2) {
        m11578NavResultEffectImplrtGRyWw(str, navResultManager, function2, function22, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
