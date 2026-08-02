package com.paypal.oslo.feature.inappcheckout.ui.card.screen;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aW\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"CvvCoachTipWidthFraction", "", "CardDetailsFields", "", "cardDetails", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "onCardDetailsChange", "Lkotlin/Function1;", "validationErrors", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ValidationErrors;", "cardValidations", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "modifier", "Landroidx/compose/ui/Modifier;", "isCardNumberEditable", "", "isLoading", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ValidationErrors;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease", "isCvvTooltipVisible"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardDetailsFieldsKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardDetailsFields(final com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails, kotlin.Unit> function1, final com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validationErrors, final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final boolean z3;
        int i5;
        boolean z4;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationErrors, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentMetadataDefinition, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1934632439);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(cardDetails) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(validationErrors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(financialInstrumentMetadataDefinition) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z5 = z4;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    boolean z6 = i4 != 0 ? true : z3;
                    if (i5 != 0) {
                        z4 = false;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1934632439, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFields (CardDetailsFields.kt:63)");
                    }
                    final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    final java.lang.String cvvMask = financialInstrumentMetadataDefinition.getCvvMask(cardDetails.getCvv().length());
                    final java.lang.String cardBrandImageUrl = financialInstrumentMetadataDefinition.getCardBrandImageUrl(cardDetails.getCardNumber().length());
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    java.lang.String cardNumber = cardDetails.getCardNumber();
                    int i7 = i3 & 112;
                    boolean z7 = i7 == 32;
                    int i8 = i3 & 14;
                    boolean z8 = i8 == 4;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z7 | z8) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.$r8$lambda$ek3ZHUg7TDRhZdlreEjpQCd2HjQ(kotlin.jvm.functions.Function1.this, cardDetails, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> rememberDigitsOnlyChangeHandler = com.paypal.oslo.feature.inappcheckout.ui.util.CardUtilsKt.rememberDigitsOnlyChangeHandler(cardNumber, 19, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 48);
                    final boolean z9 = z6;
                    int i9 = ((i3 >> 15) & 112) | 3078;
                    com.paypal.pds.components.ShimmerKt.Shimmer(com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z4, (androidx.compose.ui.Modifier) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-27554912, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.$r8$lambda$4i1wCvjbBcUtd5g3rkeoZDdh16s(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.this, context, financialInstrumentMetadataDefinition, validationErrors, rememberDigitsOnlyChangeHandler, z9, cardBrandImageUrl, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, i9, 4);
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
                    java.lang.String expirationDate = cardDetails.getExpirationDate();
                    boolean z10 = i7 == 32;
                    boolean z11 = i8 == 4;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((z10 | z11) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.m15478$r8$lambda$SWYh3KWw_z0XahcnA2gyf9zLA(kotlin.jvm.functions.Function1.this, cardDetails, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> rememberDigitsOnlyChangeHandler2 = com.paypal.oslo.feature.inappcheckout.ui.util.CardUtilsKt.rememberDigitsOnlyChangeHandler(expirationDate, 4, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 48);
                    com.paypal.pds.components.ShimmerKt.Shimmer(com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z4, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-305544252, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.$r8$lambda$eVpqxY69wtX5SxByXesuV22vqyw(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.this, context, financialInstrumentMetadataDefinition, validationErrors, rememberDigitsOnlyChangeHandler2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, i9, 0);
                    java.lang.String cvv = cardDetails.getCvv();
                    int maximumLength = financialInstrumentMetadataDefinition.getCvv().getMaximumLength();
                    boolean z12 = i7 == 32;
                    boolean z13 = i8 == 4;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((z12 | z13) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.m15477$r8$lambda$Emd_GeAhBO2q8dIA2huztqjTeg(kotlin.jvm.functions.Function1.this, cardDetails, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> rememberDigitsOnlyChangeHandler3 = com.paypal.oslo.feature.inappcheckout.ui.util.CardUtilsKt.rememberDigitsOnlyChangeHandler(cvv, maximumLength, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 0);
                    com.paypal.pds.components.ShimmerKt.Shimmer(com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z4, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1102433477, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.m15479$r8$lambda$amGWBE0hCCW3tybNy3kFPydOF8(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.this, context, cvvMask, validationErrors, rememberDigitsOnlyChangeHandler3, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, i9, 0);
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    modifier3 = modifier4;
                    z3 = z6;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.m15476$r8$lambda$6N6oyxnTLP2bm3MOYxjaT35yME(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.this, function1, validationErrors, financialInstrumentMetadataDefinition, modifier3, z3, z5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1HlQpop1JCLmIW_w92c1anRF8m8(android.content.Context context, final androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1975495355, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFields.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardDetailsFields.kt:167)");
            }
            androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_question_mark_icon, composer, 0);
            java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_cvv_info_description, new java.lang.Object[0], composer, 0);
            androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(modifier, com.paypal.pds.core.ConstantsKt.getSize24());
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.$r8$lambda$Lvn__SKVz_jD5SiU8rt4ppKTMuM(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ImageKt.Image(painterResource, rememberStringValue, com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(m1740size3ABfNKs, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 1572864, 31), null, null, null, null, composer, androidx.compose.ui.graphics.painter.Painter.$stable, 120);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4i1wCvjbBcUtd5g3rkeoZDdh16s(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, android.content.Context context, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validationErrors, kotlin.jvm.functions.Function1 function1, boolean z, final java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-27554912, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFields.<anonymous>.<anonymous> (CardDetailsFields.kt:84)");
            }
            com.paypal.pds.components.TextInputKt.TextInput(cardDetails.getCardNumber(), (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_card_number_label, new java.lang.Object[0], composer, 0), (java.lang.String) null, (java.lang.String) null, z, false, new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) new com.paypal.pds.components.textinput.VisualTransformation.Number(financialInstrumentMetadataDefinition.getCardNumberMask()), (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationAlertUtilsKt.createValidationAlerts(validationErrors.getCardNumberError()), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(665787338, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.$r8$lambda$rKWz2k16JFuSXc69niZmsgiN_PU(str, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 100663680, (com.paypal.pds.components.textinput.VisualTransformation.Number.$stable << 6) | 196656, 75440);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6N6oyxnTLP2b-m3MOYxjaT35yME, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15476$r8$lambda$6N6oyxnTLP2bm3MOYxjaT35yME(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validationErrors, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CardDetailsFields(cardDetails, function1, validationErrors, financialInstrumentMetadataDefinition, modifier, z, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Emd_GeAhBO2q-8dIA2huztqjTeg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15477$r8$lambda$Emd_GeAhBO2q8dIA2huztqjTeg(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.copy$default(cardDetails, null, null, null, null, str, 15, null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$Lvn__SKVz_jD5SiU8rt4ppKTMuM(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SWYh-3KWw_z0XahcnA2gyf9zL-A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15478$r8$lambda$SWYh3KWw_z0XahcnA2gyf9zLA(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.copy$default(cardDetails, null, null, null, str, null, 23, null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$amG-WBE0hCCW3tybNy3kFPydOF8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15479$r8$lambda$amGWBE0hCCW3tybNy3kFPydOF8(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, final android.content.Context context, java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validationErrors, kotlin.jvm.functions.Function1 function1, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1102433477, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFields.<anonymous>.<anonymous>.<anonymous> (CardDetailsFields.kt:152)");
            }
            com.paypal.pds.components.TextInputKt.TextInput(cardDetails.getCvv(), (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_cvv_label, new java.lang.Object[0], composer, 0), (java.lang.String) null, (java.lang.String) null, false, false, new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) new com.paypal.pds.components.textinput.VisualTransformation.Number(str), (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationAlertUtilsKt.createValidationAlerts(validationErrors.getCvvError()), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2122840422, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.m15480$r8$lambda$ffdcUsPI2VhYpt3ECiu7ZgqF0(context, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 100663680, (com.paypal.pds.components.textinput.VisualTransformation.Number.$stable << 6) | 1572912, 42736);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eVpqxY69wtX5SxByXesuV22vqyw(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, android.content.Context context, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validationErrors, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-305544252, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFields.<anonymous>.<anonymous>.<anonymous> (CardDetailsFields.kt:124)");
            }
            com.paypal.pds.components.TextInputKt.TextInput(cardDetails.getExpirationDate(), (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_expiration_date_label, new java.lang.Object[0], composer, 0), (java.lang.String) null, (java.lang.String) null, false, false, new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) new com.paypal.pds.components.textinput.VisualTransformation.Number(financialInstrumentMetadataDefinition.getExpirationDateMask()), (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationAlertUtilsKt.createValidationAlerts(validationErrors.getExpirationDateError()), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 100663680, (com.paypal.pds.components.textinput.VisualTransformation.Number.$stable << 6) | 48, 108272);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ek3ZHUg7TDRhZdlreEjpQCd2HjQ(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.copy$default(cardDetails, null, null, str, null, null, 27, null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$f-fdcUsPI2Vh-Ypt3ECiu7ZgqF0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15480$r8$lambda$ffdcUsPI2VhYpt3ECiu7ZgqF0(final android.content.Context context, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2122840422, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFields.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardDetailsFields.kt:165)");
            }
            java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_cvv_label, new java.lang.Object[0], composer, 0);
            java.lang.String rememberStringValue2 = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_cvv_tooltip_text, new java.lang.Object[0], composer, 0);
            boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            com.paypal.pds.components.AnchorEdge.Top top = com.paypal.pds.components.AnchorEdge.Top.INSTANCE;
            com.paypal.pds.components.AnchorEdge.EdgePositioning edgePositioning = new com.paypal.pds.components.AnchorEdge.EdgePositioning(com.paypal.pds.components.AnchorEdge.Position.END, 0.0f, 2, null);
            androidx.compose.ui.Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(androidx.compose.ui.Modifier.INSTANCE, 0.5f);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.$r8$lambda$jvZEijYbngdTIsSY9Gw_uzvoMfU(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.CoachTipKt.CoachTip(rememberStringValue, rememberStringValue2, fillMaxWidth, booleanValue, (kotlin.jvm.functions.Function1) rememberedValue, null, 0, 0, null, null, null, null, false, top, edgePositioning, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1975495355, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.$r8$lambda$1HlQpop1JCLmIW_w92c1anRF8m8(context, mutableState, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, composer, 54), composer, 24960, (com.paypal.pds.components.AnchorEdge.Top.$stable << 9) | 196992 | (com.paypal.pds.components.AnchorEdge.EdgePositioning.$stable << 12), 4064);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jvZEijYbngdTIsSY9Gw_uzvoMfU(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rKWz2k16JFuSXc69niZmsgiN_PU(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(665787338, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFields.<anonymous>.<anonymous>.<anonymous> (CardDetailsFields.kt:100)");
            }
            com.paypal.oslo.feature.inappcheckout.ui.common.FiImageKt.FiImage(str, com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_card_icon, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
