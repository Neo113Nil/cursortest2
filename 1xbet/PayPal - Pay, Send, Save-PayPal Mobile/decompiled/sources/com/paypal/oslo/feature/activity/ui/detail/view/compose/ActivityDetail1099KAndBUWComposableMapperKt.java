package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a!\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a!\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\u000f\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a,\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¨\u0006\u0014"}, d2 = {"ActivityDetail1099kAndBUWCompose", "", "activityDetailAdditionalInfoViewModel", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetail1099KAndBUWInfoModel;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetail1099KAndBUWInfoModel;Landroidx/compose/runtime/Composer;I)V", "additionalInfoItem", "Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;", "viewModel", "Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;Landroidx/compose/runtime/Composer;II)V", "RenderTaxHoldInfoBreakDownIfApplicable", "activityTaxHoldBreakDownDomainModel", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownModel;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownModel;Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;Landroidx/compose/runtime/Composer;II)V", "RenderTaxHoldAmountBreakDown", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownModel;Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;Landroidx/compose/runtime/Composer;I)V", "getDescriptionDisplayValue", "", "onLinkClickListener", "Lkotlin/Function2;", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetail1099KAndBUWComposableMapperKt {
    public static final void ActivityDetail1099kAndBUWCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel activityDetail1099KAndBUWInfoModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetail1099KAndBUWInfoModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(652005894);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activityDetail1099KAndBUWInfoModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(652005894, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099kAndBUWCompose (ActivityDetail1099KAndBUWComposableMapper.kt:76)");
            }
            androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), null, false, 3, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
            startRestartGroup.startReplaceGroup(1488383473);
            com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItems = activityDetail1099KAndBUWInfoModel.getAdditionalInfoItems();
            if (additionalInfoItems != null) {
                startRestartGroup.startReplaceGroup(-1211923591);
                ActivityDetail1099kAndBUWCompose(additionalInfoItems, null, startRestartGroup, 0, 2);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1211923592);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel = activityDetail1099KAndBUWInfoModel.getActivityTaxHoldBreakDownModel();
            if (activityTaxHoldBreakDownModel != null) {
                startRestartGroup.startReplaceGroup(-1211786974);
                RenderTaxHoldInfoBreakDownIfApplicable(activityTaxHoldBreakDownModel, null, startRestartGroup, 0, 2);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1211786975);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt.$r8$lambda$nWbZgDV9JKhfNfjmb92YW8jPQMI(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if ((r36 & 2) != 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityDetail1099kAndBUWCompose(final com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel2;
        androidx.compose.runtime.Composer composer2;
        com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel3;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel;
        java.lang.Object obj;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoItemModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2028666215);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(additionalInfoItemModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
                if (startRestartGroup.changedInstance(activityTransactionDetailViewModel2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    activityTransactionDetailViewModel2 = (com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel) startRestartGroup.consume(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.getLocalActivityTransactionDetailViewModel());
                    i3 &= -113;
                }
                final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel4 = activityTransactionDetailViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2028666215, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099kAndBUWCompose (ActivityDetail1099KAndBUWComposableMapper.kt:100)");
                }
                final java.lang.String resolveString = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(additionalInfoItemModel.getLinkTextResId(), new java.lang.Object[0], startRestartGroup, 0);
                java.lang.String descriptionDisplayValue = getDescriptionDisplayValue(additionalInfoItemModel);
                if (!kotlin.text.StringsKt.isBlank(descriptionDisplayValue)) {
                    startRestartGroup.startReplaceGroup(-1509987287);
                    java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> activityAction = additionalInfoItemModel.getActivityAction();
                    if (activityAction != null) {
                        java.util.Iterator<T> it = activityAction.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj).getType() == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.VIEW_DETAILS) {
                                    break;
                                }
                            }
                        }
                        activityActionModel = (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj;
                    } else {
                        activityActionModel = null;
                    }
                    final boolean z = activityActionModel != null;
                    androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), null, false, 3, null);
                    com.paypal.pds.components.ListItem listItem = new com.paypal.pds.components.ListItem(descriptionDisplayValue, null, null, null, z, false, null, null, null, null, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), 2030, null);
                    boolean changed = startRestartGroup.changed(z);
                    boolean changedInstance = startRestartGroup.changedInstance(additionalInfoItemModel);
                    boolean changedInstance2 = startRestartGroup.changedInstance(activityTransactionDetailViewModel4);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt.m11812$r8$lambda$nwVPn_wPvznFHnGn_Yb1wx9NxQ(z, additionalInfoItemModel, activityTransactionDetailViewModel4);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.ListKt.ListItemView(listItem, wrapContentHeight$default, false, (kotlin.jvm.functions.Function0) rememberedValue, null, null, false, startRestartGroup, com.paypal.pds.components.ListItem.$stable | 48, 116);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1508757207);
                    startRestartGroup.endReplaceGroup();
                }
                if (!kotlin.text.StringsKt.isBlank(resolveString)) {
                    startRestartGroup.startReplaceGroup(-1508711482);
                    com.paypal.pds.core.RichText.Companion companion = com.paypal.pds.core.RichText.INSTANCE;
                    boolean changed2 = startRestartGroup.changed(resolveString);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt.m11813$r8$lambda$y1BYwozU_nhg4HgNybFGju4KL0(resolveString, (com.paypal.pds.core.Builder) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    activityTransactionDetailViewModel3 = activityTransactionDetailViewModel4;
                    com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue2), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, onLinkClickListener(additionalInfoItemModel, activityTransactionDetailViewModel4), com.paypal.pds.core.Typography.BodyMedium.INSTANCE, null, startRestartGroup, 384, 48, 5114);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    activityTransactionDetailViewModel3 = activityTransactionDetailViewModel4;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-1508339575);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                activityTransactionDetailViewModel2 = activityTransactionDetailViewModel3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt.$r8$lambda$krqudHiHFRPG1QGyhYwl1GpXySs(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel.this, activityTransactionDetailViewModel2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if ((r36 & 2) != 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderTaxHoldInfoBreakDownIfApplicable(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel2;
        androidx.compose.runtime.Composer composer2;
        com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTaxHoldBreakDownModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(249089661);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(activityTaxHoldBreakDownModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
                if (startRestartGroup.changedInstance(activityTransactionDetailViewModel2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    activityTransactionDetailViewModel2 = (com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel) startRestartGroup.consume(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.getLocalActivityTransactionDetailViewModel());
                    i3 &= -113;
                }
                com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel4 = activityTransactionDetailViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(249089661, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.RenderTaxHoldInfoBreakDownIfApplicable (ActivityDetail1099KAndBUWComposableMapper.kt:156)");
                }
                RenderTaxHoldAmountBreakDown(activityTaxHoldBreakDownModel, activityTransactionDetailViewModel4, startRestartGroup, i3 & 126);
                java.lang.String title = activityTaxHoldBreakDownModel.getTitle();
                if (title != null && !kotlin.text.StringsKt.isBlank(title)) {
                    startRestartGroup.startReplaceGroup(-1072873014);
                    activityTransactionDetailViewModel3 = activityTransactionDetailViewModel4;
                    com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(activityTaxHoldBreakDownModel.getTitle(), null, null, null, false, false, null, null, null, null, null, null, null, 8174, null), null, false, null, null, null, false, startRestartGroup, com.paypal.pds.components.ListItem.$stable, 126);
                    startRestartGroup.endReplaceGroup();
                } else {
                    activityTransactionDetailViewModel3 = activityTransactionDetailViewModel4;
                    startRestartGroup.startReplaceGroup(-1072754811);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String description = activityTaxHoldBreakDownModel.getDescription();
                if (description != null && !kotlin.text.StringsKt.isBlank(description)) {
                    startRestartGroup.startReplaceGroup(-1072633384);
                    com.paypal.pds.core.RichText.Companion companion = com.paypal.pds.core.RichText.INSTANCE;
                    boolean changedInstance = startRestartGroup.changedInstance(activityTaxHoldBreakDownModel);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt.$r8$lambda$HHFn2XZmAwXBY0KLEOKnhTa2TMk(com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel.this, (com.paypal.pds.core.Builder) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, null, startRestartGroup, 384, 48, 6136);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-1072344123);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                activityTransactionDetailViewModel2 = activityTransactionDetailViewModel3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt.m11810$r8$lambda$9C36r9on7D6qgMTYSH1piCmdxE(com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel.this, activityTransactionDetailViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RenderTaxHoldAmountBreakDown(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel, final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, androidx.compose.runtime.Composer composer, final int i) {
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel;
        java.lang.String createdTime;
        java.lang.String displayDateFormat;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTaxHoldBreakDownModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1746592425);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(activityTaxHoldBreakDownModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(activityTransactionDetailViewModel) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1746592425, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.RenderTaxHoldAmountBreakDown (ActivityDetail1099KAndBUWComposableMapper.kt:182)");
            }
            java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownItemsModel> taxHoldBreakDown = activityTaxHoldBreakDownModel.getTaxHoldBreakDown();
            if (taxHoldBreakDown == null) {
                startRestartGroup.startReplaceGroup(794130573);
            } else {
                startRestartGroup.startReplaceGroup(794130574);
                int i4 = 0;
                for (java.lang.Object obj2 : taxHoldBreakDown) {
                    if (i4 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    final com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownItemsModel activityTaxHoldBreakDownItemsModel = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownItemsModel) obj2;
                    startRestartGroup.startReplaceGroup(856902776);
                    java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> actions = activityTaxHoldBreakDownItemsModel.getActions();
                    if (actions != null) {
                        java.util.Iterator<T> it = actions.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj).getType() == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.VIEW_DETAILS) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        activityActionModel = (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj;
                    } else {
                        activityActionModel = null;
                    }
                    final boolean z = activityActionModel != null;
                    java.lang.String createdTime2 = activityTaxHoldBreakDownItemsModel.getCreatedTime();
                    if (createdTime2 != null && !kotlin.text.StringsKt.isBlank(createdTime2) && (displayDateFormat = activityTaxHoldBreakDownItemsModel.getDisplayDateFormat()) != null && !kotlin.text.StringsKt.isBlank(displayDateFormat)) {
                        createdTime = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.toDisplayDateTimeFormat$activity_prodRelease(activityTaxHoldBreakDownItemsModel.getCreatedTime(), activityTaxHoldBreakDownItemsModel.getDisplayDateFormat());
                    } else {
                        createdTime = activityTaxHoldBreakDownItemsModel.getCreatedTime();
                    }
                    com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation amountInfo = activityTaxHoldBreakDownItemsModel.getAmountInfo();
                    java.lang.String formatAmount$activity_prodRelease$default = amountInfo != null ? com.paypal.oslo.feature.activity.domain.base.utils.AmountUtils.formatAmount$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.base.utils.AmountUtils.INSTANCE, amountInfo, null, i2, null) : null;
                    com.paypal.pds.components.ListItem listItem = new com.paypal.pds.components.ListItem(createdTime == null ? "" : createdTime, null, formatAmount$activity_prodRelease$default == null ? "" : formatAmount$activity_prodRelease$default, null, z, false, null, null, null, null, null, null, null, 8170, null);
                    if (i4 == activityTaxHoldBreakDownModel.getTaxHoldBreakDown().size() - 1) {
                        listItem = listItem.m21924copy_BKMH08((r28 & 1) != 0 ? listItem.title : null, (r28 & 2) != 0 ? listItem.description : null, (r28 & 4) != 0 ? listItem.data : null, (r28 & 8) != 0 ? listItem.metadata : null, (r28 & 16) != 0 ? listItem.shouldShowChevron : false, (r28 & 32) != 0 ? listItem.shouldShowDivider : true, (r28 & 64) != 0 ? listItem.trailingSlot : null, (r28 & 128) != 0 ? listItem.leadingSlot : null, (r28 & 256) != 0 ? listItem.bottomSlot : null, (r28 & 512) != 0 ? listItem.inlineSlot : null, (r28 & 1024) != 0 ? listItem.selectedIconContentDescription : null, (r28 & 2048) != 0 ? listItem.paddingTop : null, (r28 & 4096) != 0 ? listItem.paddingBottom : null);
                    }
                    boolean changed = startRestartGroup.changed(z);
                    boolean changedInstance = startRestartGroup.changedInstance(activityTaxHoldBreakDownItemsModel);
                    boolean changedInstance2 = startRestartGroup.changedInstance(activityTransactionDetailViewModel);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt.m11811$r8$lambda$dizcYEM0iYAR_7cI6OQmCFxXxE(z, activityTaxHoldBreakDownItemsModel, activityTransactionDetailViewModel);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.ListKt.ListItemView(listItem, null, false, (kotlin.jvm.functions.Function0) rememberedValue, null, null, false, startRestartGroup, com.paypal.pds.components.ListItem.$stable, 118);
                    startRestartGroup.endReplaceGroup();
                    i4++;
                    i2 = i2;
                }
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt.$r8$lambda$I7ZuRCUwzMY6uLqnWYehkxpUqXM(com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel.this, activityTransactionDetailViewModel, i, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static final java.lang.String getDescriptionDisplayValue(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoItemModel, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!kotlin.text.StringsKt.isBlank(additionalInfoItemModel.getDescriptionText())) {
            sb.append(additionalInfoItemModel.getDescriptionText());
        }
        java.util.List<java.lang.String> subMessages = additionalInfoItemModel.getSubMessages();
        if (subMessages != null && !subMessages.isEmpty()) {
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            int i = 0;
            for (java.lang.Object obj : additionalInfoItemModel.getSubMessages()) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                java.lang.String str = (java.lang.String) obj;
                if (i != 0) {
                    sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                }
                sb.append(str);
                i++;
            }
        }
        return sb.toString();
    }

    public static final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> onLinkClickListener(final com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel, final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoItemModel, "");
        return new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapperKt.m11809$r8$lambda$4IUUYHHOggvYY5YtQ_5rnpy6Ew(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel.this, activityTransactionDetailViewModel, (java.lang.String) obj, (java.lang.String) obj2);
            }
        };
    }

    /* renamed from: $r8$lambda$4IUUYHHOggvYY5YtQ_5rnpy6-Ew, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11809$r8$lambda$4IUUYHHOggvYY5YtQ_5rnpy6Ew(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (additionalInfoItemModel.getActivityInsightType() == com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.TAX_WITHHOLD) {
            java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> activityAction = additionalInfoItemModel.getActivityAction();
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel = activityAction != null ? (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) activityAction) : null;
            if ((activityActionModel != null ? activityActionModel.getType() : null) == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.LEARN_TAX_LAW) {
                if (activityTransactionDetailViewModel != null) {
                    activityTransactionDetailViewModel.invokeAction$activity_prodRelease(activityActionModel);
                }
            } else if (activityTransactionDetailViewModel != null) {
                activityTransactionDetailViewModel.navigateToNavKey$activity_prodRelease(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityWebViewDto((java.lang.String) null, str2, false, 5, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            }
        } else if (activityTransactionDetailViewModel != null) {
            activityTransactionDetailViewModel.navigateToNavKey$activity_prodRelease(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityWebViewDto((java.lang.String) null, str2, false, 5, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9C36r9on7D6qgMTYSH1p-iCmdxE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11810$r8$lambda$9C36r9on7D6qgMTYSH1piCmdxE(com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderTaxHoldInfoBreakDownIfApplicable(activityTaxHoldBreakDownModel, activityTransactionDetailViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HHFn2XZmAwXBY0KLEOKnhTa2TMk(com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, activityTaxHoldBreakDownModel.getDescription(), null, false, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I7ZuRCUwzMY6uLqnWYehkxpUqXM(com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderTaxHoldAmountBreakDown(activityTaxHoldBreakDownModel, activityTransactionDetailViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dizcYEM0iYAR_7cI6O-QmCFxXxE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11811$r8$lambda$dizcYEM0iYAR_7cI6OQmCFxXxE(boolean z, com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownItemsModel activityTaxHoldBreakDownItemsModel, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel) {
        java.lang.String str;
        if (z) {
            java.lang.String id = activityTaxHoldBreakDownItemsModel.getId();
            java.lang.String type = activityTaxHoldBreakDownItemsModel.getType();
            java.lang.String str2 = id;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2) && (str = type) != null && !kotlin.text.StringsKt.isBlank(str)) {
                com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey payPalActivityTransactionDetailScreenDestinationKey = new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey((java.lang.String) null, id, id, (java.lang.String) null, type, (java.lang.String) null, (java.lang.String) null, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_DETAILS, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 3945, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                if (activityTransactionDetailViewModel != null) {
                    activityTransactionDetailViewModel.navigateToNavKey$activity_prodRelease(payPalActivityTransactionDetailScreenDestinationKey);
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$krqudHiHFRPG1QGyhYwl1GpXySs(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityDetail1099kAndBUWCompose(additionalInfoItemModel, activityTransactionDetailViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$n-wVPn_wPvznFHnGn_Yb1wx9NxQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11812$r8$lambda$nwVPn_wPvznFHnGn_Yb1wx9NxQ(boolean z, com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel) {
        java.lang.String str;
        if (z) {
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityInsightAction action = additionalInfoItemModel.getAction();
            java.lang.String linkedActivityId = action != null ? action.getLinkedActivityId() : null;
            com.paypal.oslo.feature.activity.domain.detail.models.ActivityInsightAction action2 = additionalInfoItemModel.getAction();
            java.lang.String linkedActivityType = action2 != null ? action2.getLinkedActivityType() : null;
            java.lang.String str2 = linkedActivityId;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2) && (str = linkedActivityType) != null && !kotlin.text.StringsKt.isBlank(str)) {
                com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey payPalActivityTransactionDetailScreenDestinationKey = new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey((java.lang.String) null, linkedActivityId, linkedActivityId, (java.lang.String) null, linkedActivityType, (java.lang.String) null, (java.lang.String) null, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_DETAILS, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 3945, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                if (activityTransactionDetailViewModel != null) {
                    activityTransactionDetailViewModel.navigateToNavKey$activity_prodRelease(payPalActivityTransactionDetailScreenDestinationKey);
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nWbZgDV9JKhfNfjmb92YW8jPQMI(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel activityDetail1099KAndBUWInfoModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityDetail1099kAndBUWCompose(activityDetail1099KAndBUWInfoModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$y1BYwozU_nhg-4HgNybFGju4KL0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11813$r8$lambda$y1BYwozU_nhg4HgNybFGju4KL0(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.append(com.paypal.pds.core.RichTextKt.toRichText(str, kotlin.collections.CollectionsKt.listOf(new kotlin.Pair(str, str))));
        return kotlin.Unit.INSTANCE;
    }
}
