package com.paypal.oslo.feature.onboarding.signup.ui.component;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"SignupHeaderComponent", "", "componentConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/HeaderComponentConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/HeaderComponentConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OnboardingHeaderNoSubTitleLightPreview", "(Landroidx/compose/runtime/Composer;I)V", "OnboardingHeaderWithSubTitleLightPreview", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupHeaderComponentKt {
    public static final void SignupHeaderComponent(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.HeaderComponentConfig headerComponentConfig, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerComponentConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1454741482);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(headerComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1454741482, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.SignupHeaderComponent (SignupHeaderComponent.kt:45)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            boolean z = headerComponentConfig.getFields().size() > 1;
            java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig> fields = headerComponentConfig.getFields();
            com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.None none = com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.None.INSTANCE;
            com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Empty empty = com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Empty.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.SignupHeaderComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.ui.Modifier Camera2StreamConfigurationMap;
                        Camera2StreamConfigurationMap = com.paypal.oslo.feature.onboarding.signup.ui.component.SignupHeaderComponentKt.Camera2StreamConfigurationMap((com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig) obj);
                        return Camera2StreamConfigurationMap;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.onboarding.signup.ui.component.FieldListKt.FieldList(fields, none, empty, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 3504, 48);
            if (!z) {
                startRestartGroup.startReplaceGroup(581623307);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(581687694);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.SignupHeaderComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.SignupHeaderComponentKt.$r8$lambda$eppSTbk_60tfN3234ENgjhj6ezY(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.HeaderComponentConfig.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier Camera2StreamConfigurationMap(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig fieldConfig) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldConfig, "");
        java.lang.String mo16551getFieldType7vt1OyQ = fieldConfig.mo16551getFieldType7vt1OyQ();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String upperCase = mo16551getFieldType7vt1OyQ.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.valueOf(upperCase));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
            m23436constructorimpl = null;
        }
        if (((com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType) ((java.lang.Enum) m23436constructorimpl)) == com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.SUBHEADER) {
            return androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null);
        }
        return androidx.compose.ui.Modifier.INSTANCE;
    }

    public static final void OnboardingHeaderNoSubTitleLightPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1317540670);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1317540670, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.OnboardingHeaderNoSubTitleLightPreview (SignupHeaderComponent.kt:74)");
            }
            SignupHeaderComponent(new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.HeaderComponentConfig(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("HEADER"), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig("title", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("HEADER"), "phone_entry.header.header.label", null, null, 24, null)), null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.SignupHeaderComponentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.SignupHeaderComponentKt.$r8$lambda$F_SLAqgm6yNBWQR8QqLhNWJryyA(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OnboardingHeaderWithSubTitleLightPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-298179811);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-298179811, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.OnboardingHeaderWithSubTitleLightPreview (SignupHeaderComponent.kt:98)");
            }
            SignupHeaderComponent(new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.HeaderComponentConfig(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("HEADER"), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig[]{new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig("title", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("HEADER"), "phone_entry.header.header.label", null, null, 24, null), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig("subtitle", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("SUBHEADER"), "phone_entry.header.subheader.label", null, null, 24, null)}), null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.SignupHeaderComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.SignupHeaderComponentKt.$r8$lambda$CEkjIbdyVasd4HqMKVgrAzyaPhw(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CEkjIbdyVasd4HqMKVgrAzyaPhw(int i, androidx.compose.runtime.Composer composer, int i2) {
        OnboardingHeaderWithSubTitleLightPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F_SLAqgm6yNBWQR8QqLhNWJryyA(int i, androidx.compose.runtime.Composer composer, int i2) {
        OnboardingHeaderNoSubTitleLightPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eppSTbk_60tfN3234ENgjhj6ezY(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.HeaderComponentConfig headerComponentConfig, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupHeaderComponent(headerComponentConfig, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
