package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0002\u0010\b\u001aV\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00042'\u0010\u0005\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00070\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"toListItem", "Lcom/paypal/pds/components/ListItem;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiPostUpdateAgreement;", "showChangeButton", "", "onChangeClick", "Lkotlin/Function0;", "", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiPostUpdateAgreement;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/ListItem;", "BulkUpdateFiPostUpdateAgreementListSection", "agreements", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "agreementIds", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BulkUpdateFiPostUpdateAgreementListSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkUpdateFiPostUpdateAgreementListSectionKt {
    public static final com.paypal.pds.components.ListItem toListItem(final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement bulkUpdateFiPostUpdateAgreement, boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiPostUpdateAgreement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1045248332, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.toListItem (BulkUpdateFiPostUpdateAgreementListSection.kt:51)");
        }
        androidx.compose.runtime.internal.ComposableLambda composableLambda2 = null;
        final com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult rememberAvatarSource = com.paypal.oslo.feature.subscriptions.shared.ui.AvatarUtilsKt.rememberAvatarSource(bulkUpdateFiPostUpdateAgreement.getMerchantLogo(), null, composer, 0, 2);
        java.lang.String merchantName = bulkUpdateFiPostUpdateAgreement.getMerchantName();
        java.lang.String formattedFiLabel = bulkUpdateFiPostUpdateAgreement.getFormattedFiLabel();
        if (z) {
            composer.startReplaceGroup(-479749845);
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(998718131, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt.$r8$lambda$EtGXEJUuNFbqgVtz_YsvULW7wbs(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54);
            composer.endReplaceGroup();
            composableLambda = rememberComposableLambda;
        } else {
            composer.startReplaceGroup(-479432622);
            composer.endReplaceGroup();
            composableLambda = null;
        }
        if (bulkUpdateFiPostUpdateAgreement.getReason().length() > 0) {
            composer.startReplaceGroup(-479336336);
            composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-72083707, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt.$r8$lambda$wvI65u1aULV1XNgnFXKq27E45wg(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-478654894);
            composer.endReplaceGroup();
        }
        com.paypal.pds.components.ListItem listItem = new com.paypal.pds.components.ListItem(merchantName, formattedFiLabel, null, null, false, false, composableLambda, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1562238000, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt.m19758$r8$lambda$_i9ALFbqihVmEe4P3MLnDQ1jis(com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composableLambda2, null, null, null, null, 7692, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return listItem;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BulkUpdateFiPostUpdateAgreementListSection(final java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement> list, final boolean z, final kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-766382890);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = 256;
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i4;
            boolean z2 = true;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-766382890, i3, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSection (BulkUpdateFiPostUpdateAgreementListSection.kt:104)");
                }
                modifier3 = modifier4;
                androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderUtilityUnselected.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 384, 0), com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24());
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clip);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(683420246);
                for (final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement bulkUpdateFiPostUpdateAgreement : list) {
                    boolean z3 = (i3 & 896) == i5 ? z2 : false;
                    boolean changed = startRestartGroup.changed(bulkUpdateFiPostUpdateAgreement);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt.$r8$lambda$6F1WCjqyQKa3DGJG7WGBXdrGeH8(kotlin.jvm.functions.Function1.this, bulkUpdateFiPostUpdateAgreement);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.ListKt.ListItemView(toListItem(bulkUpdateFiPostUpdateAgreement, z, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, i3 & 112), null, false, null, null, null, false, startRestartGroup, com.paypal.pds.components.ListItem.$stable, 126);
                    i5 = i5;
                    z2 = z2;
                    i3 = i3;
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt.$r8$lambda$NKuVajLRH1hIsKK7ApRa2kNxzzE(list, z, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4;
        boolean z22 = true;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6F1WCjqyQKa3DGJG7WGBXdrGeH8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement bulkUpdateFiPostUpdateAgreement) {
        function1.invoke(kotlin.collections.CollectionsKt.listOf(bulkUpdateFiPostUpdateAgreement.getId()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EtGXEJUuNFbqgVtz_YsvULW7wbs(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(998718131, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.toListItem.<anonymous> (BulkUpdateFiPostUpdateAgreementListSection.kt:61)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_fi_error_change_button, composer, 0), null, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, composer, 1769472, 412);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NKuVajLRH1hIsKK7ApRa2kNxzzE(java.util.List list, boolean z, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BulkUpdateFiPostUpdateAgreementListSection(list, z, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_i-9ALFbqihVmEe4P3MLnDQ1jis, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19758$r8$lambda$_i9ALFbqihVmEe4P3MLnDQ1jis(com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1562238000, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.toListItem.<anonymous> (BulkUpdateFiPostUpdateAgreementListSection.kt:57)");
            }
            com.paypal.oslo.feature.subscriptions.shared.ui.component.MerchantIconKt.MerchantIcon(avatarResult, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jONagFzlmGmoyN5wl-3Sld4PkTw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19759$r8$lambda$jONagFzlmGmoyN5wl3Sld4PkTw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(810060194);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(810060194, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionPreview (BulkUpdateFiPostUpdateAgreementListSection.kt:135)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement[]{new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement("1", "Merchant 1", null, "Visa", "Debit 1234", "Card expired"), new com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "Merchant 2", null, "Mastercard", "Credit 5678", "")});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt.m19760$r8$lambda$uZRrJyvH0K6G1HfATbrK8KULJ8((java.util.List) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BulkUpdateFiPostUpdateAgreementListSection(listOf, true, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), startRestartGroup, 3510, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt.m19759$r8$lambda$jONagFzlmGmoyN5wl3Sld4PkTw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uZRrJyvH0K6G-1HfATbrK8KULJ8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19760$r8$lambda$uZRrJyvH0K6G1HfATbrK8KULJ8(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wvI65u1aULV1XNgnFXKq27E45wg(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement bulkUpdateFiPostUpdateAgreement, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-72083707, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.toListItem.<anonymous> (BulkUpdateFiPostUpdateAgreementListSection.kt:73)");
            }
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, composer, 48);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Alert.INSTANCE, null, androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), null, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, composer, 25014, 8);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(bulkUpdateFiPostUpdateAgreement.getReason(), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1018);
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
