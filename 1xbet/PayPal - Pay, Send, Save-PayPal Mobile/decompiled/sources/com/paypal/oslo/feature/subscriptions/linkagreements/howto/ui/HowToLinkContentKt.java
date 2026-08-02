package com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"HowToLinkContent", "", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HowToLinkModalSubscriptionPreview", "(Landroidx/compose/runtime/Composer;I)V", "HowToLinkModalVaultedPreview", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HowToLinkContentKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HowToLinkContent(final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String stringResource;
        java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step> listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-215061040);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(agreementType) ? 4 : 2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-215061040, i3, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkContent (HowToLinkContent.kt:58)");
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-515223660);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_subscriptions_how_to_title, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(-515225413);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-515219343);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_businesses_how_to_title, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str = stringResource;
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-515213061);
                    listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step[]{new com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step(com.paypal.pds.core.Icon.Link.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_subscriptions_how_to_step_1_title, startRestartGroup, 0)), new com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step(com.paypal.pds.core.Icon.Person.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_subscriptions_how_to_step_2_title, startRestartGroup, 0)), new com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step(com.paypal.pds.core.Icon.Card.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_subscriptions_how_to_step_3_title, startRestartGroup, 0))});
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(-515214365);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-515194190);
                    listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step[]{new com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step(com.paypal.pds.core.Icon.Link.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_businesses_how_to_step_1_title, startRestartGroup, 0)), new com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step(com.paypal.pds.core.Icon.Person.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_businesses_how_to_step_2_title, startRestartGroup, 0)), new com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step(com.paypal.pds.core.Icon.Card.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_businesses_how_to_step_3_title, startRestartGroup, 0))});
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier3, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 1, null);
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
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                startRestartGroup.startReplaceGroup(-37539374);
                for (final com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step step : listOf) {
                    androidx.compose.runtime.Composer composer3 = startRestartGroup;
                    com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(step.getHighResolutionOutputSizeshNQ4ISI, null, null, null, null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1159543238, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkContentKt.$r8$lambda$KQRH30xv8_aO7tAkiWRnoTr6A4A(com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), null, null, null, false, null, null, null, null, null, false, composer3, 100663296, 384, 519934);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), composer3, 0);
                    startRestartGroup = composer3;
                }
                composer2 = startRestartGroup;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkContentKt.$r8$lambda$tjM0_bK8KcuCFXl0utH8uABiyGE(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$7NE2ZSf8cun_rfpC2YZe_Fz8-vQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19899$r8$lambda$7NE2ZSf8cun_rfpC2YZe_Fz8vQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(266528126);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(266528126, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkModalSubscriptionPreview (HowToLinkContent.kt:131)");
            }
            HowToLinkContent(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE, null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkContentKt.m19899$r8$lambda$7NE2ZSf8cun_rfpC2YZe_Fz8vQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KQRH30xv8_aO7tAkiWRnoTr6A4A(com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.Step step, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1159543238, i, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkContent.<anonymous>.<anonymous>.<anonymous> (HowToLinkContent.kt:114)");
            }
            com.paypal.pds.components.IconKt.Icon(step.getHighSpeedVideoFpsRanges, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27696, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tCxY-PwpATt81hiOrxLEXCuZr-I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19900$r8$lambda$tCxYPwpATt81hiOrxLEXCuZrI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2055413242);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2055413242, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkModalVaultedPreview (HowToLinkContent.kt:139)");
            }
            HowToLinkContent(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE, null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkContentKt.m19900$r8$lambda$tCxYPwpATt81hiOrxLEXCuZrI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tjM0_bK8KcuCFXl0utH8uABiyGE(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        HowToLinkContent(agreementType, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
