package com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\u001ag\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001aW\u0010\u0011\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\"\"\u000e\u0010\u001d\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"SelectionBottomSheet", "", "options", "", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionOption;", "currentOptionId", "", "selectionType", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionType;", "onOptionSelect", "Lkotlin/Function1;", "onBackClick", "Lkotlin/Function0;", "onCloseClick", "shouldFilterCurrentOption", "", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "SelectionBottomSheetContent", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "showError", "buttonText", "onOptionClick", "onButtonClick", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionOption;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SelectionOptionItem", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "isSelected", "onClick", "(Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionOption;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PREVIEW_PHONE_1", "PREVIEW_PHONE_2", "PREVIEW_CARD_1", "PREVIEW_CARD_2", "PhoneSelectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "CreditCardSelectionPreview", "identity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectionBottomSheetKt {
    private static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption("1", "+1 (6••) •••-5678", true, null, 8, null);
    private static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "+1 (2••) •••-0418", false, null, 12, null);
    private static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption("card_1", "Visa ••34", true, null, 8, null);
    private static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption("card_2", "Mastercard ••78", false, null, 12, null);

    public static final void SelectionBottomSheet(final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> list, final java.lang.String str, final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType selectionType, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        boolean z2;
        androidx.compose.runtime.Composer composer2;
        final boolean z3;
        int i3;
        java.lang.Object mutableStateOf$default;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-906904364);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(selectionType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i4 |= 1572864;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
            }
        }
        if (!startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            z3 = z2;
        } else {
            boolean z4 = i5 != 0 ? false : z2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-906904364, i4, -1, "com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheet (SelectionBottomSheet.kt:95)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            boolean changed = startRestartGroup.changed(list);
            boolean z5 = (i4 & 112) == 32;
            boolean z6 = (3670016 & i4) == 1048576;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | z5 | z6) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                if (z4) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption) obj).getId(), str)) {
                            arrayList.add(obj);
                        }
                    }
                    rememberedValue2 = arrayList;
                } else {
                    rememberedValue2 = list;
                }
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final java.util.List list2 = (java.util.List) rememberedValue2;
            boolean changed2 = startRestartGroup.changed(list2);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = 2;
                mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.CollectionsKt.firstOrNull(list2), null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default);
            } else {
                mutableStateOf$default = rememberedValue3;
                i3 = 2;
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) mutableStateOf$default;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, i3, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue4;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$SelectionBottomSheet$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
            int i6 = com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[selectionType.ordinal()];
            if (i6 == 1) {
                startRestartGroup.startReplaceGroup(343300954);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_number_selection_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (i6 == 2) {
                startRestartGroup.startReplaceGroup(343304211);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_selection_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (i6 != 3) {
                    startRestartGroup.startReplaceGroup(343299488);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(343307449);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_credit_card_selection_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            int i7 = com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[selectionType.ordinal()];
            if (i7 == 1 || i7 == 2) {
                startRestartGroup.startReplaceGroup(343313246);
                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_number_selection_send_code, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (i7 != 3) {
                    startRestartGroup.startReplaceGroup(343310789);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(343316828);
                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_credit_card_selection_continue, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
            int i8 = i4 & 57344;
            boolean z7 = i8 == 16384;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if ((z7 | changedInstance2) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.m15210$r8$lambda$gI0wfeJpKnSpbqSP6ol1e7D_S8(com.paypal.pds.components.BottomSheetController.this, function0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(stringResource, true, (kotlin.jvm.functions.Function0) rememberedValue6);
            boolean changedInstance3 = startRestartGroup.changedInstance(bottomSheetController);
            boolean z8 = i8 == 16384;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if ((changedInstance3 | z8) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.$r8$lambda$13xwnnznlh9cCqa4n_aAI9AGtb8(com.paypal.pds.components.BottomSheetController.this, function0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue7;
            boolean changedInstance4 = startRestartGroup.changedInstance(bottomSheetController);
            boolean z9 = (i4 & 458752) == 131072;
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if ((changedInstance4 | z9) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.$r8$lambda$nFO0gf3SdXRUMXrQMOyhjQ0lZQg(com.paypal.pds.components.BottomSheetController.this, function02);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            final java.lang.String str2 = stringResource2;
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function03, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue8, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-904091301, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.$r8$lambda$M9zgzffx9JjDLrb0RILcW389DI8(list2, str2, mutableState, bottomSheetController, function1, mutableState2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 905969664 | (com.paypal.pds.components.TopNavConfig.$stable << 6), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            z3 = z4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.$r8$lambda$jvTXM8W3znIGUYxTtdgessOA2HA(list, str, selectionType, function1, function0, function02, z3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final void SelectionBottomSheetContent(final java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> list, final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption, final boolean z, final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(636352366);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(selectionOption) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(636352366, i2, -1, "com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetContent (SelectionBottomSheet.kt:189)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null);
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean z2 = (i2 & 112) == 32;
            boolean z3 = (57344 & i2) == 16384;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.$r8$lambda$Lojpm3LU8TIOG7uWnnX8JE6Zt24(list, selectionOption, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(m1708paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 510);
            if (z && selectionOption != null && selectionOption.getHasError()) {
                startRestartGroup.startReplaceGroup(1379849384);
                java.lang.String errorMessage = selectionOption.getErrorMessage();
                if (errorMessage != null) {
                    startRestartGroup.startReplaceGroup(-174342054);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                    com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.m15209$r8$lambda$azu_52kbTgxVH9VgwRgtosjpx8((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(errorMessage, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1708paddingVpY3zN4$default2, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null), contentMuted, null, null, null, false, 0, 0, null, bodySmall, startRestartGroup, 384, 6, 1016);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-174342055);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-173897762);
                startRestartGroup.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, str, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, ((i2 >> 15) & 14) | 1769472 | ((i2 >> 6) & 112), 408);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.m15207$r8$lambda$UXwoTEkmghL9lCBinE2TabcIZ4(list, selectionOption, z, str, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1008653901);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(selectionOption) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1008653901, i2, -1, "com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionOptionItem (SelectionBottomSheet.kt:254)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.m22102selectableXVZzFYc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), z, null, null, false, androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7803getRadioButtono7Vup1c()), function0, startRestartGroup, (i2 & 112) | 6 | ((i2 << 12) & 3670016), 14), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(selectionOption.getDisplayValue(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
            if (z) {
                composer2.startReplaceGroup(426602466);
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleEmphasisPositive.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer2, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, background);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Checkmark.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_phone_number_selection_selected, composer2, 0), null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, composer2, 27654, 4);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(427226155);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.$r8$lambda$e30DEMKGgy57Fr3lvC8L6_ahPwY(com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption.this, z, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$13xwnnznlh9cCqa4n_aAI9AGtb8(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KdEWa9v7CY3Ws-Qa4lGa2s5gVnk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15205$r8$lambda$KdEWa9v7CY3WsQa4lGa2s5gVnk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-994127240);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-994127240, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.PhoneSelectionPreview (SelectionBottomSheet.kt:318)");
            }
            com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption = Camera2StreamConfigurationMap;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption[]{selectionOption, getHighSpeedVideoSizes});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.$r8$lambda$zWMZN0_USaECoRM2k6cupbcfVKk((com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SelectionBottomSheetContent(listOf, selectionOption, false, "Send Code", function1, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 224694);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.m15205$r8$lambda$KdEWa9v7CY3WsQa4lGa2s5gVnk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Lojpm3LU8TIOG7uWnnX8JE6Zt24(final java.util.List list, final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.$r8$lambda$uFsZJonyCAJRQdSIZxHMiXMXSPs((com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption) obj);
            }
        };
        final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$SelectionBottomSheetContent$lambda$0$0$0$$inlined$items$default$1 selectionBottomSheetKt$SelectionBottomSheetContent$lambda$0$0$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$SelectionBottomSheetContent$lambda$0$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption2) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption) obj);
            }
        };
        lazyListScope.items(list.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$SelectionBottomSheetContent$lambda$0$0$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$SelectionBottomSheetContent$lambda$0$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$SelectionBottomSheetContent$lambda$0$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption2 = (com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption) list.get(i);
                composer.startReplaceGroup(1276688170);
                java.lang.String id = selectionOption2.getId();
                com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption3 = selectionOption;
                boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(id, selectionOption3 != null ? selectionOption3.getId() : null);
                boolean changed = composer.changed(function1);
                boolean changed2 = composer.changed(selectionOption2);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function13 = function1;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$SelectionBottomSheetContent$1$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function13.invoke(selectionOption2);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.getHighSpeedVideoFpsRanges(selectionOption2, areEqual, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$M9zgzffx9JjDLrb0RILcW389DI8(java.util.List list, java.lang.String str, final androidx.compose.runtime.MutableState mutableState, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function1 function1, final androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-904091301, i, -1, "com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheet.<anonymous> (SelectionBottomSheet.kt:149)");
            }
            com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption = (com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption) mutableState.getValue();
            boolean booleanValue = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
            boolean changed = composer.changed(mutableState);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.m15208$r8$lambda$ZPeP6sCuivnRonDfazcPc4O5rs(androidx.compose.runtime.MutableState.this, mutableState2, (com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changed2 = composer.changed(mutableState);
            boolean changedInstance = composer.changedInstance(bottomSheetController);
            boolean changed3 = composer.changed(function1);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changedInstance | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.m15206$r8$lambda$U6I714CBIJrLO9jIwv8lDaVfwc(androidx.compose.runtime.MutableState.this, bottomSheetController, function1, mutableState2);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            SelectionBottomSheetContent(list, selectionOption, booleanValue, str, function12, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$U6I714CBIJrLO9jIw-v8lDaVfwc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15206$r8$lambda$U6I714CBIJrLO9jIwv8lDaVfwc(androidx.compose.runtime.MutableState mutableState, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState2) {
        com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption = (com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption) mutableState.getValue();
        if (selectionOption != null) {
            if (!selectionOption.getHasError()) {
                bottomSheetController.hideSheet();
                function1.invoke(selectionOption);
            } else {
                mutableState2.setValue(java.lang.Boolean.TRUE);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UXwoT-EkmghL9lCBinE2TabcIZ4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15207$r8$lambda$UXwoTEkmghL9lCBinE2TabcIZ4(java.util.List list, com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption, boolean z, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        SelectionBottomSheetContent(list, selectionOption, z, str, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZPeP6sCuivnR-onDfazcPc4O5rs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15208$r8$lambda$ZPeP6sCuivnRonDfazcPc4O5rs(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionOption, "");
        mutableState.setValue(selectionOption);
        mutableState2.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$azu_52kbTgxVH9V-gwRgtosjpx8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15209$r8$lambda$azu_52kbTgxVH9VgwRgtosjpx8(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7791getPolite0phEisY());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e30DEMKGgy57Fr3lvC8L6_ahPwY(com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption, boolean z, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(selectionOption, z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fhaa1QapTLsK7oT4fAI0v_G7jpA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1048624959);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1048624959, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.CreditCardSelectionPreview (SelectionBottomSheet.kt:333)");
            }
            com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption = getHighSpeedVideoFpsRanges;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption[]{selectionOption, getHighResolutionOutputSizeshNQ4ISI});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.$r8$lambda$lpmlpKzVeY1kEgwrIM5G5PC6gzg((com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SelectionBottomSheetContent(listOf, selectionOption, false, "Continue", function1, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 224694);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.$r8$lambda$fhaa1QapTLsK7oT4fAI0v_G7jpA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gI0-wfeJpKnSpbqSP6ol1e7D_S8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15210$r8$lambda$gI0wfeJpKnSpbqSP6ol1e7D_S8(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jvTXM8W3znIGUYxTtdgessOA2HA(java.util.List list, java.lang.String str, com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType selectionType, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SelectionBottomSheet(list, str, selectionType, function1, function0, function02, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lpmlpKzVeY1kEgwrIM5G5PC6gzg(com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionOption, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nFO0gf3SdXRUMXrQMOyhjQ0lZQg(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$uFsZJonyCAJRQdSIZxHMiXMXSPs(com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionOption, "");
        return selectionOption.getId();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zWMZN0_USaECoRM2k6cupbcfVKk(com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionOption, "");
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType.PHONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType.EMAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType.CREDIT_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
