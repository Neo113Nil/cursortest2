package com.paypal.oslo.feature.wallet.me.ui.promotional;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"TestTagPromoDetailsAccordion", "", "TestTagPromoHeader", "TestTagPromoDetailsItem", "TestTagPromoHeaderDismissButton", "PromoCard", "", "promoHeader", "Lcom/paypal/oslo/feature/wallet/me/ui/promotional/PromoHeader;", "promoDetails", "Lcom/paypal/oslo/feature/wallet/me/ui/promotional/PromoDetails;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/wallet/me/ui/promotional/PromoHeader;Lcom/paypal/oslo/feature/wallet/me/ui/promotional/PromoDetails;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PromoCardDismissPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", "headerVisible", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PromoCardKt {
    public static final java.lang.String TestTagPromoDetailsAccordion = "promo_details_accordion";
    public static final java.lang.String TestTagPromoDetailsItem = "promo_details_list_item";
    public static final java.lang.String TestTagPromoHeader = "promo_header";
    public static final java.lang.String TestTagPromoHeaderDismissButton = "promo_header_dismiss_button";

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PromoCard(final com.paypal.oslo.feature.wallet.me.ui.promotional.PromoHeader promoHeader, final com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails promoDetails, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoHeader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoDetails, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(109361068);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(promoHeader) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(promoDetails) ? 32 : 16;
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
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(109361068, i3, -1, "com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCard (PromoCard.kt:53)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(promoHeader.getHeaderVisible()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                com.paypal.pds.core.Color.BackgroundContainerFilled backgroundContainerFilled = com.paypal.pds.core.Color.BackgroundContainerFilled.INSTANCE;
                com.paypal.pds.components.CardStyle.Outlined outlined = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
                com.paypal.pds.components.CardPadding cardPadding = com.paypal.pds.components.CardPadding.Padding0;
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1679186724, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt.$r8$lambda$EfFKdNmxZpVzKyF51GVczqlhbZk(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails.this, mutableState, promoHeader, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54);
                int i5 = ((i3 >> 6) & 14) | 805503024 | (com.paypal.pds.components.CardStyle.Outlined.$stable << 9);
                com.paypal.pds.components.CardKt.Card(modifier3, backgroundContainerFilled, null, outlined, null, cardPadding, null, null, null, rememberComposableLambda, startRestartGroup, i5, 468);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt.$r8$lambda$53Kbg9mUnTto1YEPkHEM2QIUPPk(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoHeader.this, promoDetails, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$53Kbg9mUnTto1YEPkHEM2QIUPPk(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoHeader promoHeader, com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails promoDetails, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PromoCard(promoHeader, promoDetails, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$EfFKdNmxZpVzKyF51GVczqlhbZk(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails promoDetails, final androidx.compose.runtime.MutableState mutableState, final com.paypal.oslo.feature.wallet.me.ui.promotional.PromoHeader promoHeader, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1679186724, i, -1, "com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCard.<anonymous>.<anonymous> (PromoCard.kt:62)");
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
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, ((java.lang.Boolean) mutableState.getValue()).booleanValue(), (androidx.compose.ui.Modifier) null, androidx.compose.animation.EnterExitTransitionKt.expandVertically$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(0, 0, null, 7, null), androidx.compose.ui.Alignment.INSTANCE.getBottom(), false, null, 12, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), androidx.compose.animation.EnterExitTransitionKt.shrinkVertically$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(0, 0, null, 7, null), androidx.compose.ui.Alignment.INSTANCE.getBottom(), false, null, 12, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1728557846, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt.m21443$r8$lambda$edsbRV_S422QhWf8llNiPxeC1o(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoHeader.this, mutableState, (androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, composer, 54), composer, 1572870, 18);
            com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsAccordionKt.PromoDetailsAccordion(promoDetails, androidx.compose.ui.Modifier.INSTANCE, composer, 48, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZZXY-jU3fjKBeIwnv86812g9y_0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21442$r8$lambda$ZZXYjU3fjKBeIwnv86812g9y_0(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aZEaCxrEbhZCcfi0YeX2q7CqdrU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(721412188);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(721412188, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardDismissPreview (PromoCard.kt:97)");
            }
            PromoCard(new com.paypal.oslo.feature.wallet.me.ui.promotional.PromoHeader(null, com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_no_icon_description, com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_paypal_balance, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_information, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_not_now, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_apply, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_recommend, com.paypal.pds.core.Icon.StarFill.INSTANCE, null, false, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DIFF_USER_ID, null), new com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_details, true, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsItem[]{new com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsItem(com.paypal.pds.core.Icon.NoIcon.INSTANCE, com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_no_icon_description, com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_pay_later, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_details, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_learn_more, null, 32, null), new com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsItem(com.paypal.pds.core.Icon.ShoppingBag.INSTANCE, com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_no_icon_description, com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_crypto, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_details, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_apply, null, 32, null), new com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsItem(com.paypal.pds.core.Icon.Bills.INSTANCE, com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_no_icon_description, com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_paypal_savings, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_details, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_apply, null, 32, null)})), null, startRestartGroup, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt.$r8$lambda$aZEaCxrEbhZCcfi0YeX2q7CqdrU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$edsbRV_S422Q-hWf8llNiPxeC1o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21443$r8$lambda$edsbRV_S422QhWf8llNiPxeC1o(final com.paypal.oslo.feature.wallet.me.ui.promotional.PromoHeader promoHeader, final androidx.compose.runtime.MutableState mutableState, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1728557846, i, -1, "com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PromoCard.kt:68)");
        }
        com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.Transparent.INSTANCE, null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1859938416, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt.$r8$lambda$qgGT1UPPCEjLNfYse3OGvUwpdOs(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoHeader.this, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306422, 500);
        com.paypal.pds.components.DividerKt.Divider(null, composer, 0, 1);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qgGT1UPPCEjLNfYse3OGvUwpdOs(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoHeader promoHeader, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1859938416, i, -1, "com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PromoCard.kt:73)");
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
            com.paypal.pds.components.BadgeKt.Badge(androidx.compose.ui.res.StringResources_androidKt.stringResource(promoHeader.getPromoTextResId(), composer, 0), null, com.paypal.pds.components.BadgeStyle.Special.INSTANCE, com.paypal.pds.components.BadgeEmphasis.High, com.paypal.pds.components.BadgeSize.Small.INSTANCE, promoHeader.getPromoIcon(), null, composer, 28032, 66);
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt.m21442$r8$lambda$ZZXYjU3fjKBeIwnv86812g9y_0(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.me.ui.promotional.PromoHeaderComposableKt.PromoHeaderComposable(promoHeader, companion2, (kotlin.jvm.functions.Function0) rememberedValue, composer, 432, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
