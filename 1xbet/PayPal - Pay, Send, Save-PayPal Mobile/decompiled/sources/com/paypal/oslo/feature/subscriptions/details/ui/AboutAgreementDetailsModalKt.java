package com.paypal.oslo.feature.subscriptions.details.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"AboutAgreementDetailsModal", "", "infoItems", "", "Lcom/paypal/oslo/feature/subscriptions/details/manage/domain/InfoItem;", "onCopyClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AboutAgreementDetailsModalPreview", "(Landroidx/compose/runtime/Composer;I)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AboutAgreementDetailsModalKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AboutAgreementDetailsModal(final java.util.List<com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1517283003);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1517283003, i3, -1, "com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModal (AboutAgreementDetailsModal.kt:45)");
                }
                final androidx.compose.ui.platform.Clipboard clipboard = (androidx.compose.ui.platform.Clipboard) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboard());
                boolean changed = startRestartGroup.changed(list);
                java.util.ArrayList rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.util.List<com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem> list2 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (final com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem infoItem : list2) {
                        arrayList.add(new com.paypal.pds.components.ListItem(infoItem.getTitle(), infoItem.getDescription(), null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1360660537, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalKt.$r8$lambda$JB21L32lksSCyeVMAXOqffPykLE(com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem.this, clipboard, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }), null, null, null, null, null, null, 8124, null));
                    }
                    rememberedValue = arrayList;
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                java.util.List list3 = (java.util.List) rememberedValue;
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier4, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                modifier3 = modifier4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_info_title, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 7, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                com.paypal.pds.components.ListKt.List(list3, null, null, null, null, null, null, false, false, null, null, startRestartGroup, 0, 0, 2046);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalKt.$r8$lambda$txWvic8SkHTHcN0I8J6UQg5vbV8(list, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.Clipboard clipboard, com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem infoItem, kotlin.jvm.functions.Function1 function1) {
        try {
            clipboard.getCamera2StreamConfigurationMap().setPrimaryClip(android.content.ClipData.newPlainText(infoItem.getTitle(), infoItem.getDescription()));
            function1.invoke(infoItem);
        } catch (java.lang.SecurityException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Clipboard access denied", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exception", e.getMessage())), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$76xSamiX7wST0ohBwmFENSej5Lg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2034818613);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2034818613, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalPreview (AboutAgreementDetailsModal.kt:98)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem[]{new com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem("Billing ID", "B-123456789"), new com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem("Business contact", "help@spotify.com")});
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            java.util.List list = (java.util.List) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalKt.$r8$lambda$LLvR0q_4R9SETS4Q24_OCgu0fns((com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AboutAgreementDetailsModal(list, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalKt.$r8$lambda$76xSamiX7wST0ohBwmFENSej5Lg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JB21L32lksSCyeVMAXOqffPykLE(final com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem infoItem, final androidx.compose.ui.platform.Clipboard clipboard, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1360660537, i, -1, "com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModal.<anonymous>.<anonymous>.<anonymous> (AboutAgreementDetailsModal.kt:54)");
            }
            com.paypal.pds.core.Icon.Rectangles rectangles = com.paypal.pds.core.Icon.Rectangles.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "agreement_details_copy_button_".concat(java.lang.String.valueOf(infoItem.getTitle())));
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_copy_button_content_description, composer, 0);
            com.paypal.pds.core.Icon.Rectangles rectangles2 = rectangles;
            boolean changedInstance = composer.changedInstance(clipboard);
            boolean changed = composer.changed(infoItem);
            boolean changed2 = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.Clipboard.this, infoItem, function1);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(rectangles2, (kotlin.jvm.functions.Function0) rememberedValue, testTag, secondary, medium, stringResource, null, false, false, composer, 27654, 448);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LLvR0q_4R9SETS4Q24_OCgu0fns(com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem infoItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$txWvic8SkHTHcN0I8J6UQg5vbV8(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AboutAgreementDetailsModal(list, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
