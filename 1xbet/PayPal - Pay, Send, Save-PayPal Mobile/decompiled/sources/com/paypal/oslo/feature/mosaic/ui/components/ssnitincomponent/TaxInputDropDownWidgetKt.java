package com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001am\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0014\u001a&\u0010\u0015\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0000¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001bX\u008a\u008e\u0002"}, d2 = {"TaxInputDropDownWidget", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onValueChange", "Lkotlin/Function1;", "dropdownState", "Lcom/paypal/pds/components/DropdownState;", "allowedTaxOption", "", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTaxOption;", "taxIdNumberType", "Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;", "onTaxIdNumberTypeChange", "linkText", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/paypal/pds/components/DropdownState;Ljava/util/List;Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getLabelForDropDownItem", "type", "(Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "getHelperText", "selectedItem", "Lcom/paypal/pds/components/MenuItem;", "Lcom/paypal/pds/components/DropdownItem;", "mosaic_prodRelease", "isHidden", "", "isInfoSheetVisible"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxInputDropDownWidgetKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void TaxInputDropDownWidget(final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final com.paypal.pds.components.DropdownState dropdownState, final java.util.List<com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption> list, final com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType, kotlin.Unit> function12, final java.lang.String str2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        int i4;
        java.lang.Object obj;
        final androidx.compose.runtime.MutableState mutableState;
        java.util.Iterator it;
        androidx.compose.runtime.MutableState mutableState2;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxIdNumberType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(666978326);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(dropdownState) : startRestartGroup.changedInstance(dropdownState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(taxIdNumberType.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 |= 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(666978326, i3, -1, "com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidget (TaxInputDropDownWidget.kt:82)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i4 = 2;
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i4 = 2;
            }
            final androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, i4, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.MutableState mutableState4 = (androidx.compose.runtime.MutableState) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue3;
            androidx.compose.runtime.MutableState mutableState5 = mutableState4;
            boolean booleanValue = ((java.lang.Boolean) mutableState5.getValue()).booleanValue();
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt$TaxInputDropDownWidget$1$1(bottomSheetController, mutableState4, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 0);
            java.lang.String label = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxIdNumberTypeExtensionsKt.label(taxIdNumberType, startRestartGroup, (i3 >> 12) & 14);
            final int maxLength = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxIdNumberTypeExtensionsKt.maxLength(taxIdNumberType);
            startRestartGroup.startReplaceGroup(1016072990);
            java.util.List<com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption mosaicTaxOption = (com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption) it2.next();
                com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType type = mosaicTaxOption.getType();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    it = it2;
                    mutableState2 = mutableState4;
                    androidx.compose.runtime.ComposerKt.traceEventStart(993425033, 0, -1, "com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.getLabelForDropDownItem (TaxInputDropDownWidget.kt:181)");
                } else {
                    it = it2;
                    mutableState2 = mutableState4;
                }
                int i6 = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i6 == 1) {
                    startRestartGroup.startReplaceGroup(1198721023);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_individual_taxpayer_identification_number_itin, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (i6 == 2) {
                    startRestartGroup.startReplaceGroup(1198724811);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_social_security_number_ssn, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (i6 != 3) {
                        startRestartGroup.startReplaceGroup(1198719801);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1198727979);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_social_security_number_ssn, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str3 = stringResource;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                arrayList.add(new com.paypal.pds.components.MenuItem(null, str3, mosaicTaxOption.getType(), null, null, 25, null));
                mutableState4 = mutableState2;
                it2 = it;
            }
            androidx.compose.runtime.MutableState mutableState6 = mutableState4;
            java.util.ArrayList arrayList2 = arrayList;
            startRestartGroup.endReplaceGroup();
            java.util.Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                java.lang.Object next = it3.next();
                if (((com.paypal.pds.components.MenuItem) next).getKey() == taxIdNumberType) {
                    obj = next;
                    break;
                }
            }
            com.paypal.pds.components.MenuItem menuItem = (com.paypal.pds.components.MenuItem) obj;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            androidx.compose.ui.Modifier modifier5 = modifier4;
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
            boolean z = (57344 & i3) == 16384;
            int i7 = i3 & 112;
            boolean z2 = i7 == 32;
            boolean z3 = (458752 & i3) == 131072;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if ((z2 | z | z3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt.$r8$lambda$U68G3ml4FDotyLAZwBwN9OIg8DQ(com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.this, function1, function12, (com.paypal.pds.components.MenuItem) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            com.paypal.pds.components.DropdownKt.Dropdown(dropdownState, arrayList2, null, menuItem, (kotlin.jvm.functions.Function1) rememberedValue5, null, null, false, null, false, null, null, null, null, null, null, null, startRestartGroup, com.paypal.pds.components.DropdownState.$stable | ((i3 >> 6) & 14), 0, 131044);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            com.paypal.pds.components.textinput.VisualTransformation visualTransformation = ((java.lang.Boolean) mutableState3.getValue()).booleanValue() ? com.paypal.pds.components.textinput.VisualTransformation.Password.INSTANCE : com.paypal.pds.components.textinput.VisualTransformation.None.INSTANCE;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.pds.components.textinput.ValidationAlert.HelpedText(getHelperText(list, menuItem)));
            boolean changed = startRestartGroup.changed(maxLength);
            boolean z4 = i7 == 32;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if ((changed | z4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt.$r8$lambda$hu4s06bSY0rpKhstMktBdfeySec(maxLength, function1, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            int i8 = i3;
            com.paypal.pds.components.TextInputKt.TextInput(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue6, fillMaxWidth$default, label, (java.lang.String) null, (java.lang.String) null, false, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, visualTransformation, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) listOf, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1051891659, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt.m15802$r8$lambda$fy0NlW9OUBeunjumaw2xOUDYs(androidx.compose.runtime.MutableState.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i8 & 14) | 100663680, (com.paypal.pds.components.textinput.VisualTransformation.$stable << 6) | 1572864 | (com.paypal.pds.components.textinput.ValidationAlert.HelpedText.$stable << 12), 44784);
            composer2 = startRestartGroup;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
            java.lang.Object rememberedValue7 = composer2.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState6;
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt.$r8$lambda$aklUVijUpkIdbtVw2PBrdSxy_ck(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue7);
            } else {
                mutableState = mutableState6;
            }
            com.paypal.pds.components.LinkKt.Link(str2, null, (kotlin.jvm.functions.Function0) rememberedValue7, null, composer2, ((i8 >> 18) & 14) | 384, 10);
            composer2.endNode();
            if (((java.lang.Boolean) mutableState5.getValue()).booleanValue()) {
                composer2.startReplaceGroup(1435541619);
                java.lang.Object rememberedValue8 = composer2.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt.$r8$lambda$Bye8vhgTzw2mEyDanO1sfOvEua4(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue8);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue8;
                com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_why_do_we_need_your_info, composer2, 0), false, null, 6, null);
                java.lang.Object rememberedValue9 = composer2.rememberedValue();
                if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt.$r8$lambda$O7HBQmZKkSBw756CKTm4os6zY8I(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue9);
                }
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue9, false, false, com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.ComposableSingletons$TaxInputDropDownWidgetKt.INSTANCE.m15800getLambda$370128542$mosaic_prodRelease(), composer2, com.paypal.pds.components.BottomSheetController.$stable | 806879280 | (com.paypal.pds.components.TopNavConfig.$stable << 6), 440);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1436395948);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt.m15801$r8$lambda$_TYYH0ENR9UkjJBsGRK433EYX0(str, function1, dropdownState, list, taxIdNumberType, function12, str2, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final java.lang.String getHelperText(java.util.List<com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption> list, com.paypal.pds.components.MenuItem menuItem) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption) obj).getType() == (menuItem != null ? menuItem.getKey() : null)) {
                break;
            }
        }
        com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption mosaicTaxOption = (com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption) obj;
        java.lang.String helperText = mosaicTaxOption != null ? mosaicTaxOption.getHelperText() : null;
        return helperText == null ? "" : helperText;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bye8vhgTzw2mEyDanO1sfOvEua4(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O7HBQmZKkSBw756CKTm4os6zY8I(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$U68G3ml4FDotyLAZwBwN9OIg8DQ(com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        java.lang.Object key = menuItem.getKey();
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType2 = key instanceof com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType ? (com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType) key : null;
        if (taxIdNumberType2 != null && taxIdNumberType2 != taxIdNumberType) {
            function1.invoke("");
            function12.invoke(taxIdNumberType2);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_TYYH0ENR9UkjJBsGRK43-3EYX0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15801$r8$lambda$_TYYH0ENR9UkjJBsGRK433EYX0(java.lang.String str, kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.DropdownState dropdownState, java.util.List list, com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType, kotlin.jvm.functions.Function1 function12, java.lang.String str2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TaxInputDropDownWidget(str, function1, dropdownState, list, taxIdNumberType, function12, str2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$aklUVijUpkIdbtVw2PBrdSxy_ck(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$fy0NlW9OUBeunjuma-w2xO-UDYs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15802$r8$lambda$fy0NlW9OUBeunjumaw2xOUDYs(final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1051891659, i, -1, "com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidget.<anonymous>.<anonymous> (TaxInputDropDownWidget.kt:139)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt.TestTagTaxInputVisibilityToggle);
            com.paypal.pds.core.Icon icon = ((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.pds.core.Icon.Eye.INSTANCE : com.paypal.pds.core.Icon.EyeSlash.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt.$r8$lambda$jujUh1J0ajwj3UjgNbJjTjV91A4(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(icon, (kotlin.jvm.functions.Function0) rememberedValue, testTag, tertiary, large, null, null, false, false, composer, 28080, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hu4s06bSY0rpKhstMktBdfeySec(int i, kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        function1.invoke(kotlin.text.StringsKt.take(sb.toString(), i));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$jujUh1J0ajwj3UjgNbJjTjV91A4(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.values().length];
            try {
                iArr[com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.ITIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.SSN4.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.SSN9.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
