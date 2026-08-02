package com.paypal.oslo.feature.inappcheckout.ui.ryp.screen;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "merchant", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/IntegrationType;", "variant", "billPayIntegratorName", "logoUrl", "", "RypBanner", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/model/IntegrationType;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RypBannerKt {
    public static final void RypBanner(final java.lang.String str, final com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType integrationType, final java.lang.String str2, final java.lang.String str3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        final java.lang.String rememberStringValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1180928837);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(integrationType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 2048 : 1024;
        }
        int i5 = i2;
        if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1180928837, i5, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBanner (RypBanner.kt:54)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            if (com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBannerKt.WhenMappings.$EnumSwitchMapping$0[integrationType.ordinal()] == 1) {
                i3 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_banner_edit_fi_title;
            } else {
                i3 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_banner_title;
            }
            final java.lang.String rememberStringValue2 = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, i3, new java.lang.Object[0], startRestartGroup, 0);
            int i6 = com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBannerKt.WhenMappings.$EnumSwitchMapping$0[integrationType.ordinal()];
            if (i6 == 1) {
                i4 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_banner_description_edit_fi;
            } else if (i6 == 2) {
                i4 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_banner_description_integrator;
            } else if (i6 == 3) {
                i4 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_banner_description_merchant;
            } else if (i6 == 4) {
                i4 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_banner_description_platform;
            } else {
                if (i6 != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                i4 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_banner_description_platform_meta;
            }
            int i7 = com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBannerKt.WhenMappings.$EnumSwitchMapping$0[integrationType.ordinal()];
            if (i7 == 1) {
                z = false;
                startRestartGroup.startReplaceGroup(-1001206423);
                rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, i4, new java.lang.Object[]{str}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (i7 == 2) {
                z = false;
                startRestartGroup.startReplaceGroup(-1001212806);
                rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, i4, new java.lang.Object[]{str, str2}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (i7 == 3) {
                z = false;
                startRestartGroup.startReplaceGroup(-1001195831);
                rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, i4, new java.lang.Object[]{str}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (i7 == 4) {
                startRestartGroup.startReplaceGroup(-1001199511);
                z = false;
                rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, i4, new java.lang.Object[]{str}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (i7 != 5) {
                    startRestartGroup.startReplaceGroup(-1001214053);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-1001202881);
                rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, i4, new java.lang.Object[0], startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
                z = false;
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSize8(), 1, null), 0.0f, 1, null), null, z, 3, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BorderRoleBaseWarning.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), startRestartGroup, 0);
            androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSize20(), 1, null), 0.0f, 1, null), null, false, 3, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier align = rowScopeInstance.align(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), null, false, 3, null), com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 10, null), 1.0f, false, 2, null), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, align);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.ShimmerKt.Shimmer((com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, false, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize4(), 7, null), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1213460030, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBannerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBannerKt.$r8$lambda$Q45FEPAnRo31W7eFblHDYJvYCN4(rememberStringValue2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 3126, 0);
            com.paypal.pds.components.ShimmerKt.Shimmer((com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, false, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.RYP_DESCRIPTION), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1805842421, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBannerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBannerKt.m15560$r8$lambda$TWYkFRe84yElCW0EYh4VLrgsg(rememberStringValue, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 3510, 0);
            startRestartGroup.endNode();
            java.lang.String str4 = str3;
            if (str4 != null && !kotlin.text.StringsKt.isBlank(str4)) {
                startRestartGroup.startReplaceGroup(1353620890);
                com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt.ShimmerAsyncAvatar(rowScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 11, null), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically()), com.paypal.pds.components.AvatarSize.Medium.INSTANCE, str3, null, null, startRestartGroup, (com.paypal.pds.components.AvatarSize.Medium.$stable << 3) | ((i5 >> 3) & 896), 24);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1353929805);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BorderRoleBaseWarning.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBannerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBannerKt.$r8$lambda$ZhF24GuJ6B51yny0QnsHW1CKe1E(str, integrationType, str2, str3, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q45FEPAnRo31W7eFblHDYJvYCN4(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1213460030, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBanner.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RypBanner.kt:116)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, composer, 48, 6, 1020);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TWYkFR-e8-4yElCW0EYh4VLrgsg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15560$r8$lambda$TWYkFRe84yElCW0EYh4VLrgsg(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1805842421, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBanner.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RypBanner.kt:127)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 48, 6, 1020);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZhF24GuJ6B51yny0QnsHW1CKe1E(java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType integrationType, java.lang.String str2, java.lang.String str3, int i, androidx.compose.runtime.Composer composer, int i2) {
        RypBanner(str, integrationType, str2, str3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType.EDIT_STICKY_FI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType.INTEGRATOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType.MERCHANT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType.PLATFORM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType.META.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
