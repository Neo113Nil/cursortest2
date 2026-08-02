package com.paypal.pds.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ComposableSingletons$ModalKt {
    public static final com.paypal.pds.components.ComposableSingletons$ModalKt INSTANCE = new com.paypal.pds.components.ComposableSingletons$ModalKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(696426718, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ComposableSingletons$ModalKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.pds.components.ComposableSingletons$ModalKt.$r8$lambda$h5cFK6SFHVY7KiwlCn1MYXrK3oM((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1691548056, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.pds.components.ComposableSingletons$ModalKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.pds.components.ComposableSingletons$ModalKt.$r8$lambda$MQKGz1CGjxal8JfvRmKcleelx60((androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(804005380, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ComposableSingletons$ModalKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.pds.components.ComposableSingletons$ModalKt.m21835$r8$lambda$e8yUdFVNTdLZbk2BVmyGTF2FZk((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$MQKGz1CGjxal8JfvRmKcleelx60(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1691548056, i3, -1, "com.paypal.pds.components.ComposableSingletons$ModalKt.lambda$1691548056.<anonymous> (Modal.kt:420)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("List item ".concat(java.lang.String.valueOf(i)), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 5, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 48, 6, 1020);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$e8yUdFVNTdLZbk-2BVmyGTF2FZk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21835$r8$lambda$e8yUdFVNTdLZbk2BVmyGTF2FZk(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(804005380, i, -1, "com.paypal.pds.components.ComposableSingletons$ModalKt.lambda$804005380.<anonymous> (Modal.kt:407)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f));
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ComposableSingletons$ModalKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.ComposableSingletons$ModalKt.$r8$lambda$kzKtjfgtqaJauJWMO4xIfkno_F8((androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(weight$default, null, null, false, m1602spacedBy0680j_4, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer, 805330944, 494);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h5cFK6SFHVY7KiwlCn1MYXrK3oM(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(696426718, i, -1, "com.paypal.pds.components.ComposableSingletons$ModalKt.lambda$696426718.<anonymous> (Modal.kt:160)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kzKtjfgtqaJauJWMO4xIfkno_F8(androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, 30, null, null, getHighSpeedVideoSizes, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$804005380$pds_release() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$696426718$pds_release() {
        return getHighSpeedVideoFpsRanges;
    }

    public final kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1691548056$pds_release() {
        return getHighSpeedVideoSizes;
    }
}
