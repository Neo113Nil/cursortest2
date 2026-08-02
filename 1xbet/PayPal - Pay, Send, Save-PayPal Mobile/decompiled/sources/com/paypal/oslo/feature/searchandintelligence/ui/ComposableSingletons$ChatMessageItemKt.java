package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$ChatMessageItemKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1032622013, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt.m19140$r8$lambda$7UmLOdv384IFTBH4hY430aVFvE((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$16sbUYYW-LT26YlKO3ePJEcc5eo, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer m19138$r8$lambda$16sbUYYWLT26YlKO3ePJEcc5eo(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return null;
    }

    /* renamed from: $r8$lambda$1ZzW7qUY-xnZ6Z96_Li12BTBWa4, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer m19139$r8$lambda$1ZzW7qUYxnZ6Z96_Li12BTBWa4(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return null;
    }

    /* renamed from: $r8$lambda$7UmLOdv384IFTBH4hY430-aVFvE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19140$r8$lambda$7UmLOdv384IFTBH4hY430aVFvE(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1032622013, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt.lambda$1032622013.<anonymous> (ChatMessageItem.kt:147)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User user = new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User("What's my account balance?", 0, 2, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt.$r8$lambda$iP04NmPVx1hXkhE8X5iSUhomk9A((kotlin.reflect.KClass) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemKt.ChatMessageItem(user, 0, false, linkedHashSet, (kotlin.jvm.functions.Function1) rememberedValue, null, composer, 25008, 32);
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote remote = new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText[]{new com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText("Let me check that for you."), new com.paypal.oslo.feature.searchandintelligence.domain.model.ui.PlainText("Your current balance is $1,234.56")}));
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt.$r8$lambda$xgGP3605zg5p1H1Ck3xaBMqIPBg((kotlin.reflect.KClass) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemKt.ChatMessageItem(remote, 1, false, linkedHashSet, (kotlin.jvm.functions.Function1) rememberedValue2, null, composer, 25008, 32);
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User user2 = new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User("Thanks!", 0, 2, null);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt.m19141$r8$lambda$jXihkONNZIIP8KxV_VemjIcvoQ((kotlin.reflect.KClass) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemKt.ChatMessageItem(user2, 2, false, linkedHashSet, (kotlin.jvm.functions.Function1) rememberedValue3, null, composer, 25008, 32);
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Error error = new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Error(new com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error.Unknown(new java.lang.Exception("preview")));
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt.m19138$r8$lambda$16sbUYYWLT26YlKO3ePJEcc5eo((kotlin.reflect.KClass) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemKt.ChatMessageItem(error, 4, false, linkedHashSet, (kotlin.jvm.functions.Function1) rememberedValue4, null, composer, 25008, 32);
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Thinking thinking = com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Thinking.INSTANCE;
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$ChatMessageItemKt.m19139$r8$lambda$1ZzW7qUYxnZ6Z96_Li12BTBWa4((kotlin.reflect.KClass) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.feature.searchandintelligence.ui.ChatMessageItemKt.ChatMessageItem(thinking, 3, true, linkedHashSet, (kotlin.jvm.functions.Function1) rememberedValue5, null, composer, 25014, 32);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer $r8$lambda$iP04NmPVx1hXkhE8X5iSUhomk9A(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return null;
    }

    /* renamed from: $r8$lambda$jXih-kONNZIIP8KxV_VemjIcvoQ, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer m19141$r8$lambda$jXihkONNZIIP8KxV_VemjIcvoQ(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer $r8$lambda$xgGP3605zg5p1H1Ck3xaBMqIPBg(kotlin.reflect.KClass kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return null;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1032622013$search_and_intelligence_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
