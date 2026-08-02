package com.paypal.oslo.feature.consumerprivacy.ui.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u001a\u0083\u0001\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0013\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aG\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0011\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a_\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"", "profileId", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Function1;", "", "", "onPersonalProfileEnabledChange", "onPaymentRequestsEnabledChange", "", "onPaymentRequestsFromChange", "onPayPalMeEnabledChange", "onVenmoEnabledChange", "AccountVisibilitySimplifiedContent", "(Ljava/lang/String;Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "p0", "p1", "p2", "p3", "p4", "p5", "getHighSpeedVideoFpsRanges", "(ZLkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRangesFor", "(ZLkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "p6", "Camera2StreamConfigurationMap", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountVisibilitySimplifiedContentKt {
    public static final void AccountVisibilitySimplifiedContent(final java.lang.String str, final com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function13, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function14, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function15, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountVisibilityData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function15, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1885721988);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(accountVisibilityData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function13) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function14) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function15) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1885721988, i2, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContent (AccountVisibilitySimplifiedContent.kt:47)");
            }
            java.lang.Boolean allowFindByIdentifiers = accountVisibilityData.getAllowFindByIdentifiers();
            final boolean booleanValue = allowFindByIdentifiers != null ? allowFindByIdentifiers.booleanValue() : false;
            java.lang.Boolean allowPaymentRequests = accountVisibilityData.getAllowPaymentRequests();
            boolean booleanValue2 = allowPaymentRequests != null ? allowPaymentRequests.booleanValue() : false;
            com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFrom = accountVisibilityData.getPaymentRequestsFrom();
            int i3 = (paymentRequestsFrom == null || com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.WhenMappings.$EnumSwitchMapping$0[paymentRequestsFrom.ordinal()] != 1) ? 0 : 1;
            boolean z7 = accountVisibilityData.getAllowFindViaPayPalMe() != null;
            java.lang.Boolean allowFindViaPayPalMe = accountVisibilityData.getAllowFindViaPayPalMe();
            boolean booleanValue3 = allowFindViaPayPalMe != null ? allowFindViaPayPalMe.booleanValue() : false;
            boolean z8 = accountVisibilityData.getAllowVenmoDiscovery() != null;
            java.lang.Boolean allowVenmoDiscovery = accountVisibilityData.getAllowVenmoDiscovery();
            boolean booleanValue4 = allowVenmoDiscovery != null ? allowVenmoDiscovery.booleanValue() : false;
            androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_title, startRestartGroup, 0);
            com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
            androidx.compose.ui.Modifier focusable$default = androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.ui.Modifier.INSTANCE, false, null, 3, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.$r8$lambda$iZuCgAtC4azANlozwmL2e_dMp0c((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(focusable$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), null, null, null, null, false, 0, 0, null, headingMedium, startRestartGroup, 0, 6, 1020);
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing40(), 0.0f, 0.0f, 13, null);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24());
            boolean changed = startRestartGroup.changed(booleanValue);
            boolean z9 = (i2 & 896) == 256;
            boolean changed2 = startRestartGroup.changed(booleanValue2);
            boolean z10 = (i2 & 7168) == 2048;
            boolean changed3 = startRestartGroup.changed(i3);
            if ((i2 & 57344) == 16384) {
                z = z7;
                z2 = true;
            } else {
                z = z7;
                z2 = false;
            }
            boolean changed4 = startRestartGroup.changed(z);
            final boolean z11 = booleanValue2;
            final boolean z12 = z8;
            boolean changed5 = startRestartGroup.changed(z12);
            final int i4 = i3;
            if ((i2 & 14) == 4) {
                z3 = booleanValue3;
                z4 = true;
            } else {
                z3 = booleanValue3;
                z4 = false;
            }
            boolean changed6 = startRestartGroup.changed(z3);
            if ((i2 & 458752) == 131072) {
                z5 = booleanValue4;
                z6 = true;
            } else {
                z5 = booleanValue4;
                z6 = false;
            }
            boolean changed7 = startRestartGroup.changed(z5);
            boolean z13 = (i2 & 3670016) == 1048576;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (((z4 | changed | z9 | changed2 | z10 | changed3 | z2 | changed4 | changed5 | changed6 | z6 | changed7) || z13) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                final boolean z14 = z;
                final boolean z15 = z3;
                final boolean z16 = z5;
                composer2 = startRestartGroup;
                kotlin.jvm.functions.Function1 function16 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.m13520$r8$lambda$Pd40CWk4TDVQcWDTojic91IJms(z14, z12, booleanValue, function1, z11, function12, i4, function13, str, z15, function14, z16, function15, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer2.updateRememberedValue(function16);
                rememberedValue2 = function16;
            } else {
                composer2 = startRestartGroup;
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(m1710paddingqDBjuR0$default, null, null, false, m1602spacedBy0680j_4, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue2, composer2, 0, 494);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.$r8$lambda$6pXJvRpcwGHtL354DiPlqCWtu08(str, accountVisibilityData, function1, function12, function13, function14, function15, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final boolean z2, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12, final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function13, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(909703567);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
        }
        int i4 = i3;
        if (!startRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(909703567, i4, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.PeopleOnPayPalSection (AccountVisibilitySimplifiedContent.kt:111)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_people_on_paypal_title, startRestartGroup, 0);
            com.paypal.pds.core.Typography.LabelLarge labelLarge = com.paypal.pds.core.Typography.LabelLarge.INSTANCE;
            androidx.compose.ui.Modifier focusable$default = androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), false, null, 3, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.$r8$lambda$BnQCC1M4sDNUydIFTwIwiXtC78Q((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(focusable$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), null, null, null, null, false, 0, 0, null, labelLarge, startRestartGroup, 0, 6, 1020);
            int i5 = i4 << 3;
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt.AccountVisibilityToggleSection(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_personal_profile_info_title, startRestartGroup, 0), z, function1, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_personal_profile_info_description, startRestartGroup, 0), true, null, null, null, true, "simplified_personal_profile_toggle", startRestartGroup, (i5 & 112) | 905994240 | (i5 & 896), 224);
            if (z) {
                composer2.startReplaceGroup(-263475793);
                getHighSpeedVideoFpsRangesFor(z2, function12, i, function13, composer2, (i4 >> 6) & 8190);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-263164429);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.$r8$lambda$LhJSJ12k3lB0Y67NZI6d6zIgEdE(z, function1, z2, function12, i, function13, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        java.util.List list;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-912064411);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-912064411, i3, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.PaymentRequestsSection (AccountVisibilitySimplifiedContent.kt:151)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_payment_requests_title, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_payment_requests_description, startRestartGroup, 0);
            if (z) {
                startRestartGroup.startReplaceGroup(-1347018190);
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_payment_requests_option_everyone, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_payment_requests_option_contacts_only, startRestartGroup, 0)});
                startRestartGroup.endReplaceGroup();
                list = listOf;
            } else {
                startRestartGroup.startReplaceGroup(-1346662527);
                startRestartGroup.endReplaceGroup();
                list = null;
            }
            int i4 = i3 << 3;
            com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt.AccountVisibilityToggleSection(stringResource, z, function1, stringResource2, false, list, z ? java.lang.Integer.valueOf(i) : null, z ? function12 : null, true, "simplified_payment_requests_toggle", startRestartGroup, (i4 & 112) | 905969664 | (i4 & 896), 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.$r8$lambda$K4ezSb15sDO7OKVHki6G83uuAZY(z, function1, i, function12, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final java.lang.String str, final boolean z, final boolean z2, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final boolean z3, final boolean z4, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1330462766);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1330462766, i2, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.PeopleOutsidePayPalSection (AccountVisibilitySimplifiedContent.kt:189)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_people_outside_of_paypal_title, startRestartGroup, 0);
            com.paypal.pds.core.Typography.LabelLarge labelLarge = com.paypal.pds.core.Typography.LabelLarge.INSTANCE;
            androidx.compose.ui.Modifier focusable$default = androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), false, null, 3, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.$r8$lambda$9upe3f7MSIGZEPE87UcDsWTq9GY((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(focusable$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), null, null, null, null, false, 0, 0, null, labelLarge, startRestartGroup, 0, 6, 1020);
            if (z) {
                startRestartGroup.startReplaceGroup(-1857403819);
                int i4 = i2 >> 3;
                int i5 = (i4 & 112) | 905969664 | (i4 & 896);
                i3 = 0;
                com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt.AccountVisibilityToggleSection(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_paypal_me_title, startRestartGroup, 0), z2, function1, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_paypal_me_description, new java.lang.Object[]{str}, startRestartGroup, 0), false, null, null, null, true, "simplified_paypal_me_toggle", startRestartGroup, i5, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                startRestartGroup.endReplaceGroup();
            } else {
                i3 = 0;
                startRestartGroup.startReplaceGroup(-1856879888);
                startRestartGroup.endReplaceGroup();
            }
            if (z3) {
                startRestartGroup.startReplaceGroup(-1856829172);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_people_on_venmo_title, startRestartGroup, i3);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_account_visibility_people_on_venmo_description, startRestartGroup, i3);
                int i6 = i2 >> 12;
                com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt.AccountVisibilityToggleSection(stringResource2, z4, function12, stringResource3, false, null, null, null, true, "simplified_venmo_toggle", startRestartGroup, 905969664 | (i6 & 112) | (i6 & 896), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1856358096);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.m13521$r8$lambda$ZPvwLlByd6VMhOAmReTrRvOkA(str, z, z2, function1, z3, z4, function12, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6pXJvRpcwGHtL354DiPlqCWtu08(java.lang.String str, com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function1 function15, int i, androidx.compose.runtime.Composer composer, int i2) {
        AccountVisibilitySimplifiedContent(str, accountVisibilityData, function1, function12, function13, function14, function15, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9O7kFMqceONqESO1e8jTLQC0mac(java.lang.String str, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, boolean z3, boolean z4, kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1952108830, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountVisibilitySimplifiedContent.kt:88)");
            }
            Camera2StreamConfigurationMap(str, z, z2, function1, z3, z4, function12, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9upe3f7MSIGZEPE87UcDsWTq9GY(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BnQCC1M4sDNUydIFTwIwiXtC78Q(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GNK67lM15H0X2T077tVEkURpdwo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-355667141);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-355667141, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentPreview (AccountVisibilitySimplifiedContent.kt:231)");
            }
            com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityMockData = com.paypal.oslo.feature.consumerprivacy.ui.util.AccountVisibilityMockResponse.INSTANCE.getAccountVisibilityMockData();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            AccountVisibilitySimplifiedContent("", accountVisibilityMockData, function1, function12, function13, function14, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, 1797510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.$r8$lambda$GNK67lM15H0X2T077tVEkURpdwo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K4ezSb15sDO7OKVHki6G83uuAZY(boolean z, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.functions.Function1 function12, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(z, function1, i, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LhJSJ12k3lB0Y67NZI6d6zIgEdE(boolean z, kotlin.jvm.functions.Function1 function1, boolean z2, kotlin.jvm.functions.Function1 function12, int i, kotlin.jvm.functions.Function1 function13, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(z, function1, z2, function12, i, function13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Pd4-0CWk4TDVQcWDTojic91IJms, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13520$r8$lambda$Pd40CWk4TDVQcWDTojic91IJms(final boolean z, final boolean z2, final boolean z3, final kotlin.jvm.functions.Function1 function1, final boolean z4, final kotlin.jvm.functions.Function1 function12, final int i, final kotlin.jvm.functions.Function1 function13, final java.lang.String str, final boolean z5, final kotlin.jvm.functions.Function1 function14, final boolean z6, final kotlin.jvm.functions.Function1 function15, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2049914201, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.m13522$r8$lambda$um9st7_AtMtq6kTOQgXsPJn5Ts(z3, function1, z4, function12, i, function13, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        if (z || z2) {
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1952108830, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContentKt.$r8$lambda$9O7kFMqceONqESO1e8jTLQC0mac(str, z, z5, function14, z2, z6, function15, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZPvwLlByd6VMhOAmRe-Tr-RvOkA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13521$r8$lambda$ZPvwLlByd6VMhOAmReTrRvOkA(java.lang.String str, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, boolean z3, boolean z4, kotlin.jvm.functions.Function1 function12, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(str, z, z2, function1, z3, z4, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iZuCgAtC4azANlozwmL2e_dMp0c(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$um9st7_AtMtq6kTOQg-XsPJn5Ts, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13522$r8$lambda$um9st7_AtMtq6kTOQgXsPJn5Ts(boolean z, kotlin.jvm.functions.Function1 function1, boolean z2, kotlin.jvm.functions.Function1 function12, int i, kotlin.jvm.functions.Function1 function13, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2049914201, i2, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.AccountVisibilitySimplifiedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountVisibilitySimplifiedContent.kt:77)");
            }
            getHighSpeedVideoFpsRanges(z, function1, z2, function12, i, function13, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType.CONTACTS_ONLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType.EVERYONE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
