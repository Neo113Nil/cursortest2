package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"AddressSelectionBottomSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "formattedAddresses", "", "", "selectedIndex", "", "onAddressSelect", "Lkotlin/Function1;", "onAddNewClick", "Lkotlin/Function0;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "(Lcom/paypal/pds/components/BottomSheetController;Ljava/util/List;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/runtime/Composer;I)V", "AddressList", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AddressCard", "text", "isSelected", "", "onClick", "testTag", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "one-onboarding_prodRelease", "pendingIndex"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressSelectionBottomSheetKt {
    public static final void AddressSelectionBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.util.List<java.lang.String> list, final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        int i4;
        androidx.compose.foundation.ScrollState scrollState;
        androidx.compose.runtime.MutableIntState mutableIntState;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(675316113);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(intentId) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(675316113, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheet (AddressSelectionBottomSheet.kt:84)");
            }
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i)};
            int i6 = i3 & 896;
            boolean z = i6 == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.runtime.MutableIntState mutableIntStateOf;
                        mutableIntStateOf = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i);
                        return mutableIntStateOf;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableIntState mutableIntState2 = (androidx.compose.runtime.MutableIntState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
            androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            boolean visible = bottomSheetController.getVisible();
            int i7 = i3 & 14;
            boolean z2 = i7 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController));
            boolean changed = startRestartGroup.changed(mutableIntState2);
            boolean z3 = i6 == 256;
            boolean changed2 = startRestartGroup.changed(rememberScrollState);
            boolean changedInstance = startRestartGroup.changedInstance(intentId);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (((z2 | changed | z3 | changed2) || changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i4 = i7;
                scrollState = rememberScrollState;
                mutableIntState = mutableIntState2;
                i5 = 0;
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$AddressSelectionBottomSheet$1$1(bottomSheetController, i, rememberScrollState, intentId, mutableIntState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                i4 = i7;
                scrollState = rememberScrollState;
                mutableIntState = mutableIntState2;
                i5 = 0;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i5);
            boolean changedInstance2 = startRestartGroup.changedInstance(intentId);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.$r8$lambda$eGgkh0v9EOqk2N2uFWVi1PF8pL4(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            final androidx.compose.foundation.ScrollState scrollState2 = scrollState;
            final androidx.compose.runtime.MutableIntState mutableIntState3 = mutableIntState;
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function02, new com.paypal.pds.components.TopNavConfig(null, false, null, 4, null), null, null, null, function02, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-504185046, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.m16936$r8$lambda$3JzFJDHS4v77iAla3C1fqIiOgY(androidx.compose.foundation.ScrollState.this, intentId, list, mutableIntState3, bottomSheetController, function0, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 817889280 | i4 | (com.paypal.pds.components.TopNavConfig.$stable << 6), 312);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.m16939$r8$lambda$ZDC_o7Twjn5BKPQbHSe26otySM(com.paypal.pds.components.BottomSheetController.this, list, i, function1, function0, intentId, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.util.List<java.lang.String> list, final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1122631280);
        int i3 = (i2 & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        int i4 = 256;
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i3;
        boolean z = false;
        if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1122631280, i5, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressList (AddressSelectionBottomSheet.kt:193)");
            }
            final int i6 = 0;
            for (java.lang.Object obj : list) {
                if (i6 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                java.lang.String str = (java.lang.String) obj;
                boolean z2 = i6 == i ? true : z;
                boolean z3 = (i5 & 896) == i4 ? true : z;
                boolean changed = startRestartGroup.changed(i6);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z3 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.m16937$r8$lambda$Kp1MAGYGdtwzdCf1DkIVPAO4(kotlin.jvm.functions.Function1.this, i6);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                int i7 = i6;
                boolean z4 = z;
                getHighSpeedVideoFpsRangesFor(str, z2, (kotlin.jvm.functions.Function0) rememberedValue, "address_card_".concat(java.lang.String.valueOf(i6)), startRestartGroup, 0, 0);
                if (i7 < kotlin.collections.CollectionsKt.getLastIndex(list)) {
                    startRestartGroup.startReplaceGroup(1958576692);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, z4 ? 1 : 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1958642040);
                    startRestartGroup.endReplaceGroup();
                }
                i6 = i7 + 1;
                z = z4 ? 1 : 0;
                i4 = 256;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.$r8$lambda$VRHeOy3KGjEyUsxfq0tAzC2jDws(list, i, function1, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final java.lang.String str, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str3;
        final java.lang.String str4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1106569200);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str3 = str2;
            i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                str4 = str3;
            } else {
                java.lang.String str5 = i4 != 0 ? "" : str3;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1106569200, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCard (AddressSelectionBottomSheet.kt:214)");
                }
                androidx.compose.foundation.shape.RoundedCornerShape m1971RoundedCornerShape0680j_4 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f));
                com.paypal.pds.core.Color color = z ? com.paypal.pds.core.Color.BorderUtilityEmphasis.INSTANCE : com.paypal.pds.core.Color.BorderMuted.INSTANCE;
                com.paypal.pds.core.Color color2 = z ? com.paypal.pds.core.Color.BackgroundMuted.INSTANCE : com.paypal.pds.core.Color.BackgroundBase.INSTANCE;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, str5);
                boolean z2 = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.$r8$lambda$Xikz_bsNgYuD508nvPdc7NLgWY4(z, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), 0.0f, 1, null);
                androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape = m1971RoundedCornerShape0680j_4;
                java.lang.String str6 = str5;
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(com.paypal.pds.core.ModifierExtensionsKt.background(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.draw.ClipKt.clip(fillMaxWidth$default, roundedCornerShape), com.paypal.pds.core.ConstantsKt.getBorderSize1(), color, roundedCornerShape, startRestartGroup, 0, 0), color2, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 0, 2), null, null, false, null, null, function0, startRestartGroup, (i3 << 12) & 3670016, 31), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, (i3 & 14) | 384, 6, 1016);
                if (z) {
                    startRestartGroup.startReplaceGroup(-449191792);
                    com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.CheckCircleFill.INSTANCE, null, null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27702, 4);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-448999282);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                str4 = str6;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.m16938$r8$lambda$X_DMCF1KKWis6Q8LvopQBSnHMI(str, z, function0, str4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        str3 = str2;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$3JzFJDHS4v77iAla-3C1fqIiOgY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16936$r8$lambda$3JzFJDHS4v77iAla3C1fqIiOgY(androidx.compose.foundation.ScrollState scrollState, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List list, final androidx.compose.runtime.MutableIntState mutableIntState, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Composer composer2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-504185046, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheet.<anonymous> (AddressSelectionBottomSheet.kt:115)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), scrollState, false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_address_halfsheet_title, composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 384, 6, 1018);
            if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto) {
                composer2 = composer;
                composer2.startReplaceGroup(1714005966);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1713695563);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_address_halfsheet_subTitle, composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
                composer.endReplaceGroup();
                composer2 = composer;
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
            int intValue = mutableIntState.getIntValue();
            boolean changed = composer2.changed(mutableIntState);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.$r8$lambda$ZJ0TslKkHcWYHDYAhKpm2UnUhI4(androidx.compose.runtime.MutableIntState.this, ((java.lang.Integer) obj).intValue());
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            getHighResolutionOutputSizeshNQ4ISI(list, intValue, (kotlin.jvm.functions.Function1) rememberedValue, composer2, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_address_selection_add_new_address, composer2, 0);
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.core.Icon.Plus plus = com.paypal.pds.core.Icon.Plus.INSTANCE;
            com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
            androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null);
            boolean changedInstance = composer2.changedInstance(intentId);
            boolean changedInstance2 = composer2.changedInstance(bottomSheetController);
            boolean changed2 = composer2.changed(function0);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance | changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.m16940$r8$lambda$fE8Ssv9_aLyBv0mFcs_2BnZu9k(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.this, bottomSheetController, function0);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource, wrapContentSize$default, plus, null, tertiary, medium, false, false, composer, 1772928, 400);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), composer, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_address_collection_halfsheet_save, composer, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "address_selection_save_button");
            boolean changedInstance3 = composer.changedInstance(intentId);
            boolean changed3 = composer.changed(function1);
            boolean changed4 = composer.changed(mutableIntState);
            boolean changedInstance4 = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changedInstance3 | changed3 | changed4 | changedInstance4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.$r8$lambda$9f0MRWeOCTxHj7WY6ju5gTvZmD8(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.this, function1, bottomSheetController, mutableIntState);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource2, testTag, null, null, primary, large, false, false, composer, 1769856, 408);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9f0MRWeOCTxHj7WY6ju5gTvZmD8(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.MutableIntState mutableIntState) {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.analytics.AddressCollectionAnalytics.trackItemPressed$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.analytics.AddressCollectionAnalytics.INSTANCE, "address_selection", "save", com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(intentId), null, 8, null);
        function1.invoke(java.lang.Integer.valueOf(mutableIntState.getIntValue()));
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$K-p1MAG-YGd-twzdCf1DkIVPAO4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16937$r8$lambda$Kp1MAGYGdtwzdCf1DkIVPAO4(kotlin.jvm.functions.Function1 function1, int i) {
        function1.invoke(java.lang.Integer.valueOf(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VRHeOy3KGjEyUsxfq0tAzC2jDws(java.util.List list, int i, kotlin.jvm.functions.Function1 function1, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(list, i, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$X_DMCF1KKWis6Q8L-vopQBSnHMI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16938$r8$lambda$X_DMCF1KKWis6Q8LvopQBSnHMI(java.lang.String str, boolean z, kotlin.jvm.functions.Function0 function0, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(str, z, function0, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xikz_bsNgYuD508nvPdc7NLgWY4(boolean z, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7803getRadioButtono7Vup1c());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZDC_o7Twjn5BKPQb-HSe26otySM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16939$r8$lambda$ZDC_o7Twjn5BKPQbHSe26otySM(com.paypal.pds.components.BottomSheetController bottomSheetController, java.util.List list, int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddressSelectionBottomSheet(bottomSheetController, list, i, function1, function0, intentId, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZJ0TslKkHcWYHDYAhKpm2UnUhI4(androidx.compose.runtime.MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eGgkh0v9EOqk2N2uFWVi1PF8pL4(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.analytics.AddressCollectionAnalytics.trackItemPressed$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.analytics.AddressCollectionAnalytics.INSTANCE, "address_selection", "dismiss", com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(intentId), null, 8, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fE8Ssv9_aLyBv0mFcs_2Bn-Zu9k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16940$r8$lambda$fE8Ssv9_aLyBv0mFcs_2BnZu9k(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.analytics.AddressCollectionAnalytics.trackItemPressed$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.analytics.AddressCollectionAnalytics.INSTANCE, "address_selection", "add_new_address", com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(intentId), null, 8, null);
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
