package com.paypal.oslo.feature.bnplservicing.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\t\u001a0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0017\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"PlanDetailsRecentActivity", "", "items", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PlanActivityModel;", "modifier", "Landroidx/compose/ui/Modifier;", "title", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/core/commonui/utils/RefText;Landroidx/compose/runtime/Composer;II)V", "getListItem", "Lcom/paypal/pds/components/ListItem;", "index", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "amount", "state", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PlanActivityState;", "PlanDetailsRecentActivityPreview", "(Landroidx/compose/runtime/Composer;I)V", "PlanDetailsRecentActivitySingleItemPreview", "PlanDetailsRecentActivityLargeFontPreview", "PreviewDate", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanDetailsRecentActivityKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlanDetailsRecentActivity(final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel> list, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.commonui.utils.RefText refText, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.oslo.core.commonui.utils.RefText refText2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1093712019);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? startRestartGroup.changed(refText) : startRestartGroup.changedInstance(refText) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                refText2 = refText;
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                com.paypal.oslo.core.commonui.utils.RefText refText3 = i4 != 0 ? null : refText;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1093712019, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivity (PlanDetailsRecentActivity.kt:96)");
                }
                if (!list.isEmpty()) {
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityTestTag.ROOT_TAG);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                    if (refText3 == null) {
                        startRestartGroup.startReplaceGroup(-647257977);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-647257976);
                        com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityTestTag.SECTION_HEADER_TAG), com.paypal.oslo.core.commonui.utils.RefTextKt.value(refText3, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, null, startRestartGroup, 6, 12);
                        startRestartGroup.endReplaceGroup();
                    }
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    com.paypal.oslo.core.commonui.utils.RefText refText4 = refText3;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(companion.then(refText3 != null ? androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(companion2, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null) : companion2), com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityTestTag.CARD_TAG), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-996899601, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt.m12575$r8$lambda$pww9GnEPkUJ6gSrHVp4i9K_LrE(list, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306416, 500);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    refText2 = refText4;
                    modifier3 = modifier5;
                } else {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final androidx.compose.ui.Modifier modifier6 = modifier4;
                        final com.paypal.oslo.core.commonui.utils.RefText refText5 = refText3;
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt.$r8$lambda$G_W3Wx0Uc2gRSbCSxhVqTjaRBUQ(list, modifier6, refText5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        endRestartGroup.updateScope(function2);
                        return;
                    }
                    return;
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.core.commonui.utils.RefText refText6 = refText2;
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt.$r8$lambda$ku7EO8VTZVeCLyOm08vMvnAoaqc(list, modifier3, refText6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                endRestartGroup.updateScope(function2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7YRZaSOZqWHJfnGFtoqifUmPN0Y(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(443289858);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(443289858, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityLargeFontPreview (PlanDetailsRecentActivity.kt:244)");
            }
            PlanDetailsRecentActivity(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel[]{new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_merchant_refund, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_description_format, "01-01-2025", java.lang.Integer.valueOf(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_amount_remaining_decreased)), "$1,250.00", com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.PURCHASE), new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_automatic_payment, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_description_format, "01-01-2025", java.lang.Integer.valueOf(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_payment_received)), "-$100.00", com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.AUTOMATIC_PAYMENT_SUCCESSFUL)}), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_recent_activity_title, new java.lang.Object[0]), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | (com.paypal.oslo.core.commonui.utils.RefText.$stable << 6), 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt.$r8$lambda$7YRZaSOZqWHJfnGFtoqifUmPN0Y(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BSSR2A2r56lCkke1orvqEIBUl6s(int i, com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState planActivityState, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-998186554, i2, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.getListItem.<anonymous> (PlanDetailsRecentActivity.kt:155)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityTestTag.ACTIVITY_ITEM_TAG_PREFIX.concat(java.lang.String.valueOf(i)));
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(planActivityState.getIcon$bnpl_servicing_prodRelease()), testTag, null, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE), planActivityState.getBadge$bnpl_servicing_prodRelease(), null, composer, com.paypal.pds.components.AvatarBadge.$stable << 12, 36);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ET1SWvdzaWg2QQrk3JG5N6vPbU4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(715800349);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(715800349, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivitySingleItemPreview (PlanDetailsRecentActivity.kt:218)");
            }
            PlanDetailsRecentActivity(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_automatic_payment, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_description_format, "01-01-2025", java.lang.Integer.valueOf(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_payment_reversed)), "$100.00", com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.PURCHASE)), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_recent_activity_title, new java.lang.Object[0]), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | (com.paypal.oslo.core.commonui.utils.RefText.$stable << 6), 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt.$r8$lambda$ET1SWvdzaWg2QQrk3JG5N6vPbU4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G_W3Wx0Uc2gRSbCSxhVqTjaRBUQ(java.util.List list, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.commonui.utils.RefText refText, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PlanDetailsRecentActivity(list, modifier, refText, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ku7EO8VTZVeCLyOm08vMvnAoaqc(java.util.List list, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.commonui.utils.RefText refText, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PlanDetailsRecentActivity(list, modifier, refText, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pww9GnEPkUJ6gSrHVp-4i9K_LrE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12575$r8$lambda$pww9GnEPkUJ6gSrHVp4i9K_LrE(java.util.List list, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-996899601, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivity.<anonymous>.<anonymous> (PlanDetailsRecentActivity.kt:117)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
            composer.startReplaceGroup(-1756166339);
            final int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel planActivityModel = (com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel) obj;
                java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(planActivityModel.getTitle(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(planActivityModel.getDescription(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                java.lang.String amount = planActivityModel.getAmount();
                final com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState state = planActivityModel.getState();
                com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(value, value2, amount, null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-998186554, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt.$r8$lambda$BSSR2A2r56lCkke1orvqEIBUl6s(i2, state, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }), null, null, null, null, null, 8056, null), null, false, null, com.paypal.pds.components.ListStyle.INSTANCE.getDefault(), com.paypal.pds.components.ListAlignment.Center, false, composer, com.paypal.pds.components.ListItem.$stable | 1769856 | (com.paypal.pds.components.ListStyle.$stable << 12), 10);
                i2++;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xQx00-ypIV90rme2gC8WbxS6KTE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12576$r8$lambda$xQx00ypIV90rme2gC8WbxS6KTE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1287559426);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1287559426, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityPreview (PlanDetailsRecentActivity.kt:173)");
            }
            PlanDetailsRecentActivity(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel[]{new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_merchant_refund, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_description_format, "01-01-2025", com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_amount_remaining_decreased, new java.lang.Object[0])), "$450.00", com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.PURCHASE), new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_automatic_payment, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_description_format, "01-01-2025", com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_payment_failed, new java.lang.Object[0])), "-$150.00", com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.AUTOMATIC_PAYMENT_SUCCESSFUL), new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_automatic_payment, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_description_format, "01-01-2025", com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_activity_payment_received, new java.lang.Object[0])), "-$100.00", com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState.AUTOMATIC_PAYMENT_FAILED)}), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_recent_activity_title, new java.lang.Object[0]), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | (com.paypal.oslo.core.commonui.utils.RefText.$stable << 6), 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanDetailsRecentActivityKt.m12576$r8$lambda$xQx00ypIV90rme2gC8WbxS6KTE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
