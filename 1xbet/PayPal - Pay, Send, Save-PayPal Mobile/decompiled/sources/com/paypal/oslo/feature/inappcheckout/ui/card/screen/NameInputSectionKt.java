package com.paypal.oslo.feature.inappcheckout.ui.card.screen;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"NameInputSection", "", "cardDetails", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "onCardDetailsChange", "Lkotlin/Function1;", "validationErrors", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ValidationErrors;", "cardValidations", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "modifier", "Landroidx/compose/ui/Modifier;", "isLoading", "", "isVisible", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ValidationErrors;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameInputSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NameInputSection(final com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails, kotlin.Unit> function1, final com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validationErrors, final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final boolean z5;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationErrors, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentMetadataDefinition, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-910030033);
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
        int i7 = i2 & 16;
        if (i7 != 0) {
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
                } else if ((1572864 & i) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        z5 = z3;
                        modifier3 = modifier2;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        boolean z6 = i4 != 0 ? false : z3;
                        boolean z7 = i5 != 0 ? true : z4;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-910030033, i6, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSection (NameInputSection.kt:42)");
                        }
                        if (!z7) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                final androidx.compose.ui.Modifier modifier5 = modifier4;
                                final boolean z8 = z6;
                                final boolean z9 = z7;
                                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt.$r8$lambda$tzqdWcyv_hDaYEYXkC9uS0hmY8Y(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.this, function1, validationErrors, financialInstrumentMetadataDefinition, modifier5, z8, z9, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                };
                                endRestartGroup.updateScope(function2);
                                return;
                            }
                            return;
                        }
                        final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                        final int maximumLength = financialInstrumentMetadataDefinition.getFirstName().getMaximumLength();
                        final int maximumLength2 = financialInstrumentMetadataDefinition.getLastName().getMaximumLength();
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        com.paypal.pds.components.ShimmerStyle.Container container = com.paypal.pds.components.ShimmerStyle.Container.INSTANCE;
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1497384518, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt.$r8$lambda$hBLupBZ9ClAm1bmzuEnfObPrFAA(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.this, context, validationErrors, maximumLength, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54);
                        int i8 = ((i6 >> 12) & 112) | 3078;
                        androidx.compose.ui.Modifier modifier6 = modifier4;
                        com.paypal.pds.components.ShimmerKt.Shimmer(container, z6, weight$default, rememberComposableLambda, startRestartGroup, i8, 0);
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.ShimmerKt.Shimmer(com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z6, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-459127555, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt.m15483$r8$lambda$0DWj7kZk7Gt3TgdW9uI1gh7So(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.this, context, validationErrors, maximumLength2, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, i8, 0);
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z5 = z6;
                        z4 = z7;
                        modifier3 = modifier6;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        final boolean z10 = z4;
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt.m15484$r8$lambda$mkCtY4VIg6dNxG_d1YZ2cvYwYw(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.this, function1, validationErrors, financialInstrumentMetadataDefinition, modifier3, z5, z10, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        endRestartGroup.updateScope(function2);
                        return;
                    }
                    return;
                }
                z4 = z2;
                i6 = i3;
                if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i3;
            if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
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
        z4 = z2;
        i6 = i3;
        if (startRestartGroup.shouldExecute((599187 & i6) == 599186, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$0DWj-7kZk7Gt3TgdW9uI1gh-7So, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15483$r8$lambda$0DWj7kZk7Gt3TgdW9uI1gh7So(final com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, android.content.Context context, com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validationErrors, final int i, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-459127555, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSection.<anonymous>.<anonymous> (NameInputSection.kt:78)");
            }
            java.lang.String lastName = cardDetails.getLastName();
            java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_last_name_label, new java.lang.Object[0], composer, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            java.util.List<com.paypal.pds.components.textinput.ValidationAlert> createValidationAlerts = com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationAlertUtilsKt.createValidationAlerts(validationErrors.getLastNameError());
            boolean changed = composer.changed(i);
            boolean changed2 = composer.changed(function1);
            boolean changed3 = composer.changed(cardDetails);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt.$r8$lambda$hBRl1jVx8Ni8hlE4tqF3uWuqu74(i, function1, cardDetails, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.TextInputKt.TextInput(lastName, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue, fillMaxWidth$default, rememberStringValue, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) createValidationAlerts, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 384, 48, 112624);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hBLupBZ9ClAm1bmzuEnfObPrFAA(final com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, android.content.Context context, com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validationErrors, final int i, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1497384518, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSection.<anonymous>.<anonymous> (NameInputSection.kt:57)");
            }
            java.lang.String firstName = cardDetails.getFirstName();
            java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_first_name_label, new java.lang.Object[0], composer, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            java.util.List<com.paypal.pds.components.textinput.ValidationAlert> createValidationAlerts = com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationAlertUtilsKt.createValidationAlerts(validationErrors.getFirstNameError());
            boolean changed = composer.changed(i);
            boolean changed2 = composer.changed(function1);
            boolean changed3 = composer.changed(cardDetails);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt.m15485$r8$lambda$tKhwrFyBm2ZHYGANecuEdesnus(i, function1, cardDetails, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.TextInputKt.TextInput(firstName, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue, fillMaxWidth$default, rememberStringValue, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) createValidationAlerts, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 384, 48, 112624);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hBRl1jVx8Ni8hlE4tqF3uWuqu74(int i, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.copy$default(cardDetails, null, kotlin.text.StringsKt.take(str, i), null, null, null, 29, null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mk-CtY4VIg6dNxG_d1YZ2cvYwYw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15484$r8$lambda$mkCtY4VIg6dNxG_d1YZ2cvYwYw(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validationErrors, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NameInputSection(cardDetails, function1, validationErrors, financialInstrumentMetadataDefinition, modifier, z, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tKh-wrFyBm2ZHYGANecuEdesnus, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15485$r8$lambda$tKhwrFyBm2ZHYGANecuEdesnus(int i, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.copy$default(cardDetails, kotlin.text.StringsKt.take(str, i), null, null, null, null, 30, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tzqdWcyv_hDaYEYXkC9uS0hmY8Y(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validationErrors, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition financialInstrumentMetadataDefinition, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NameInputSection(cardDetails, function1, validationErrors, financialInstrumentMetadataDefinition, modifier, z, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
