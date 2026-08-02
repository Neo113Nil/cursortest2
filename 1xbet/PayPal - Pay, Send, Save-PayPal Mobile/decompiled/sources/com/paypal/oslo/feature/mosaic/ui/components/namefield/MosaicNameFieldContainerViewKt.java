package com.paypal.oslo.feature.mosaic.ui.components.namefield;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001aA\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0014\u001a\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000eH\u0002\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"MosaicNameFieldContainerView", "", "model", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicPagePersonNameInputComponent;", "onNameChange", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/mosaic/domain/model/PersonName;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicPagePersonNameInputComponent;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "nameKeyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "NameTextInput", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "label", "isRequired", "", "enabled", "onValueChange", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "buildValidationAlerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "fieldLabel", "MosaicNameFieldContainerViewPreview", "(Landroidx/compose/runtime/Composer;I)V", "MosaicNameFieldContainerViewWithExistingValuePreview", "mosaic_prodRelease", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "surname"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicNameFieldContainerViewKt {
    private static final androidx.compose.foundation.text.KeyboardOptions getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.text.KeyboardOptions(androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m8248getWordsIUNYP9k(), (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8272getTextPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MosaicNameFieldContainerView(final com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameInputComponent mosaicPagePersonNameInputComponent, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.domain.model.PersonName, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final androidx.compose.runtime.MutableState mutableState;
        androidx.compose.ui.Modifier modifier4;
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicPagePersonNameInputComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-466963294);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(mosaicPagePersonNameInputComponent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-466963294, i4, -1, "com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerView (MosaicNameFieldContainerView.kt:52)");
                }
                com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig fieldsToCollect = mosaicPagePersonNameInputComponent.getFieldsToCollect();
                if (fieldsToCollect == null) {
                    fieldsToCollect = new com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig((java.lang.String) null, false, false, false, (java.lang.String) null, (java.lang.String) null, 63, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                }
                com.paypal.oslo.feature.mosaic.domain.model.PersonName existingValue = mosaicPagePersonNameInputComponent.getExistingValue();
                if (existingValue == null) {
                    existingValue = new com.paypal.oslo.feature.mosaic.domain.model.PersonName((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 127, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                }
                boolean changed = startRestartGroup.changed(existingValue.getGivenName());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.lang.String givenName = existingValue.getGivenName();
                    if (givenName == null) {
                        givenName = "";
                    }
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(givenName, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
                boolean changed2 = startRestartGroup.changed(existingValue.getMiddleName());
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.lang.String middleName = existingValue.getMiddleName();
                    if (middleName == null) {
                        middleName = "";
                    }
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(middleName, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue2;
                boolean changed3 = startRestartGroup.changed(existingValue.getSurname());
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.lang.String surname = existingValue.getSurname();
                    rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(surname != null ? surname : "", null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final androidx.compose.runtime.MutableState mutableState4 = (androidx.compose.runtime.MutableState) rememberedValue3;
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                if (fieldsToCollect.getGivenNameLabel() == null) {
                    mutableState = mutableState2;
                    modifier4 = modifier5;
                    z = false;
                    z2 = true;
                    startRestartGroup.startReplaceGroup(602835082);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(602171992);
                    java.lang.String str = (java.lang.String) mutableState2.getValue();
                    java.lang.String givenNameLabel = fieldsToCollect.getGivenNameLabel();
                    boolean isGivenNameRequired = fieldsToCollect.isGivenNameRequired();
                    boolean isDisabled = mosaicPagePersonNameInputComponent.isDisabled();
                    boolean changed4 = startRestartGroup.changed(mutableState2);
                    boolean z3 = (i4 & 112) == 32;
                    boolean changed5 = startRestartGroup.changed(mutableState3);
                    boolean changed6 = startRestartGroup.changed(mutableState4);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((z3 | changed4 | changed5 | changed6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt.$r8$lambda$M0SOFcrovbfu7C_38yGEnVcjjOQ(kotlin.jvm.functions.Function1.this, mutableState2, mutableState3, mutableState4, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
                    z2 = true;
                    boolean z4 = !isDisabled;
                    mutableState = mutableState2;
                    z = false;
                    modifier4 = modifier5;
                    getHighSpeedVideoFpsRangesFor(str, givenNameLabel, isGivenNameRequired, z4, function12, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                if (fieldsToCollect.getMiddleNameLabel() == null) {
                    startRestartGroup.startReplaceGroup(603568170);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(602902197);
                    java.lang.String str2 = (java.lang.String) mutableState3.getValue();
                    java.lang.String middleNameLabel = fieldsToCollect.getMiddleNameLabel();
                    boolean isMiddleNameRequired = fieldsToCollect.isMiddleNameRequired();
                    boolean isDisabled2 = mosaicPagePersonNameInputComponent.isDisabled();
                    boolean changed7 = startRestartGroup.changed(mutableState3);
                    boolean z5 = (i4 & 112) == 32 ? z2 : z;
                    boolean changed8 = startRestartGroup.changed(mutableState);
                    boolean changed9 = startRestartGroup.changed(mutableState4);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if ((changed7 | z5 | changed8 | changed9) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt.m15795$r8$lambda$LDJULUNmIQmvEfArqXYxfd8NQ0(kotlin.jvm.functions.Function1.this, mutableState3, mutableState, mutableState4, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    getHighSpeedVideoFpsRangesFor(str2, middleNameLabel, isMiddleNameRequired, isDisabled2 ^ z2, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                if (fieldsToCollect.getSurnameLabel() == null) {
                    startRestartGroup.startReplaceGroup(604289354);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(603632030);
                    java.lang.String str3 = (java.lang.String) mutableState4.getValue();
                    java.lang.String surnameLabel = fieldsToCollect.getSurnameLabel();
                    boolean isSurnameRequired = fieldsToCollect.isSurnameRequired();
                    boolean isDisabled3 = mosaicPagePersonNameInputComponent.isDisabled();
                    boolean changed10 = startRestartGroup.changed(mutableState4);
                    boolean z6 = (i4 & 112) != 32 ? false : z2;
                    boolean changed11 = startRestartGroup.changed(mutableState);
                    boolean changed12 = startRestartGroup.changed(mutableState3);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if ((changed10 | z6 | changed11 | changed12) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt.$r8$lambda$nA9FMaU6Ic7iBUco_YEMOpZNwOo(kotlin.jvm.functions.Function1.this, mutableState4, mutableState, mutableState3, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    getHighSpeedVideoFpsRangesFor(str3, surnameLabel, isSurnameRequired, !isDisabled3, (kotlin.jvm.functions.Function1) rememberedValue6, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt.$r8$lambda$0RGE1Bx4CDdJowxftly09qPx3ZA(com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameInputComponent.this, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.lang.String str, final java.lang.String str2, final boolean z, final boolean z2, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.util.List listOf;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-562685146);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-562685146, i2, -1, "com.paypal.oslo.feature.mosaic.ui.components.namefield.NameTextInput (MosaicNameFieldContainerView.kt:149)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = getHighSpeedVideoFpsRangesFor;
            if (!z) {
                listOf = kotlin.collections.CollectionsKt.emptyList();
            } else {
                listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt.$r8$lambda$b753DveOu_d3Dc7_3x1c_OEnZTU(str2, (java.lang.String) obj);
                    }
                }));
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.TextInputKt.TextInput(str, function1, fillMaxWidth$default, str2, (java.lang.String) null, (java.lang.String) null, z2, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) listOf, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer2, (i2 & 14) | 100663680 | ((i2 >> 9) & 112) | ((i2 << 6) & 7168) | ((i2 << 9) & 3670016), 0, 114352);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt.$r8$lambda$jlugKlpDvtg_f7EkPV6AsFQ9aRo(str, str2, z, z2, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0RGE1Bx4CDdJowxftly09qPx3ZA(com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameInputComponent mosaicPagePersonNameInputComponent, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MosaicNameFieldContainerView(mosaicPagePersonNameInputComponent, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$LDJULUNm-IQmvEfArqXYxfd8NQ0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15795$r8$lambda$LDJULUNmIQmvEfArqXYxfd8NQ0(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        java.lang.String str2 = (java.lang.String) mutableState2.getValue();
        java.lang.String str3 = kotlin.text.StringsKt.isBlank(str2) ? null : str2;
        java.lang.String str4 = !kotlin.text.StringsKt.isBlank(str) ? str : null;
        java.lang.String str5 = (java.lang.String) mutableState3.getValue();
        function1.invoke(new com.paypal.oslo.feature.mosaic.domain.model.PersonName((java.lang.String) null, str3, str4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, kotlin.text.StringsKt.isBlank(str5) ? null : str5, 57, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$M0SOFcrovbfu7C_38yGEnVcjjOQ(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        java.lang.String str2 = !kotlin.text.StringsKt.isBlank(str) ? str : null;
        java.lang.String str3 = (java.lang.String) mutableState2.getValue();
        java.lang.String str4 = kotlin.text.StringsKt.isBlank(str3) ? null : str3;
        java.lang.String str5 = (java.lang.String) mutableState3.getValue();
        function1.invoke(new com.paypal.oslo.feature.mosaic.domain.model.PersonName((java.lang.String) null, str2, str4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, kotlin.text.StringsKt.isBlank(str5) ? null : str5, 57, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q0ex6u4_r6AbofzoQ9MLT7Zx5U8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1543178274);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1543178274, updateChangedFlags, -1, "com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewWithExistingValuePreview (MosaicNameFieldContainerView.kt:220)");
            }
            com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameInputComponent mosaicPagePersonNameInputComponent = new com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameInputComponent("name-field-2", "Person Name", false, true, new com.paypal.oslo.feature.mosaic.domain.model.PersonName((java.lang.String) null, "John", "Michael", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "Doe", 57, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig("First Name", true, false, true, com.daon.dmds.recognizers.IDMDSResultCreatorFields.MiddleName, "Last Name"), false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 960, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt.m15796$r8$lambda$U62WPNpta8zEPb1yLdofvYI5nI((com.paypal.oslo.feature.mosaic.domain.model.PersonName) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MosaicNameFieldContainerView(mosaicPagePersonNameInputComponent, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt.$r8$lambda$Q0ex6u4_r6AbofzoQ9MLT7Zx5U8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U62WPNpta-8zEPb1yLdofvYI5nI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15796$r8$lambda$U62WPNpta8zEPb1yLdofvYI5nI(com.paypal.oslo.feature.mosaic.domain.model.PersonName personName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personName, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$b753DveOu_d3Dc7_3x1c_OEnZTU(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (!kotlin.text.StringsKt.isBlank(str2)) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" is required");
        return new com.paypal.pds.components.textinput.ValidationAlertData(sb.toString(), com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    /* renamed from: $r8$lambda$jGqDZGBbk1MOZR58tmkUf5K6-xk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15797$r8$lambda$jGqDZGBbk1MOZR58tmkUf5K6xk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(435013316);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(435013316, updateChangedFlags, -1, "com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewPreview (MosaicNameFieldContainerView.kt:195)");
            }
            com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameInputComponent mosaicPagePersonNameInputComponent = new com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameInputComponent("name-field-1", "Person Name", false, true, (com.paypal.oslo.feature.mosaic.domain.model.PersonName) null, new com.paypal.oslo.feature.mosaic.domain.model.MosaicPagePersonNameFieldsConfig("First Name", true, false, true, com.daon.dmds.recognizers.IDMDSResultCreatorFields.MiddleName, "Last Name"), false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 960, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt.m15798$r8$lambda$nGTIRuMtYklDKVjYpXdMP0dQY((com.paypal.oslo.feature.mosaic.domain.model.PersonName) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MosaicNameFieldContainerView(mosaicPagePersonNameInputComponent, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.components.namefield.MosaicNameFieldContainerViewKt.m15797$r8$lambda$jGqDZGBbk1MOZR58tmkUf5K6xk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jlugKlpDvtg_f7EkPV6AsFQ9aRo(java.lang.String str, java.lang.String str2, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(str, str2, z, z2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$n-GTIR-uMtYklDKVjYpXdMP0dQY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15798$r8$lambda$nGTIRuMtYklDKVjYpXdMP0dQY(com.paypal.oslo.feature.mosaic.domain.model.PersonName personName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personName, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$nA9FMaU6Ic7iBUco_YEMOpZNwOo(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        java.lang.String str2 = (java.lang.String) mutableState2.getValue();
        java.lang.String str3 = kotlin.text.StringsKt.isBlank(str2) ? null : str2;
        java.lang.String str4 = (java.lang.String) mutableState3.getValue();
        function1.invoke(new com.paypal.oslo.feature.mosaic.domain.model.PersonName((java.lang.String) null, str3, kotlin.text.StringsKt.isBlank(str4) ? null : str4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, kotlin.text.StringsKt.isBlank(str) ? null : str, 57, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }
}
