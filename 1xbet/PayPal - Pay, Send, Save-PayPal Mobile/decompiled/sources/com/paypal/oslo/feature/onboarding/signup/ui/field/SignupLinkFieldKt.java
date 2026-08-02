package com.paypal.oslo.feature.onboarding.signup.ui.field;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"SignupLinkField", "", "config", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupLinkFieldConfig;", "onLinkClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupLinkFieldConfig;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SignupLinkFieldPreview", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupLinkFieldConfig;Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupLinkFieldKt {
    public static final void SignupLinkField(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig signupLinkFieldConfig, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupLinkFieldConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(629605955);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(signupLinkFieldConfig) : startRestartGroup.changedInstance(signupLinkFieldConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(629605955, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLinkField (SignupLinkField.kt:42)");
            }
            com.paypal.pds.components.LinkKt.Link(com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(signupLinkFieldConfig.getText()), new java.lang.Object[0], startRestartGroup, 0), modifier, function0, signupLinkFieldConfig.getLinkSize(), startRestartGroup, ((i3 << 3) & 896) | ((i3 >> 3) & 112) | (com.paypal.pds.components.LinkSize.$stable << 9), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLinkFieldKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLinkFieldKt.$r8$lambda$bZZ9DnOB9K4cVr5Q0uU45xYt1Fo(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig.this, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bZZ9DnOB9K4cVr5Q0uU45xYt1Fo(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig signupLinkFieldConfig, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupLinkField(signupLinkFieldConfig, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fIrZky1Cv77xjYxH4XWnIk6iIIg(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig signupLinkFieldConfig, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1480131176);
        if ((updateChangedFlags & 6) == 0) {
            i3 = ((updateChangedFlags & 8) == 0 ? startRestartGroup.changed(signupLinkFieldConfig) : startRestartGroup.changedInstance(signupLinkFieldConfig) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1480131176, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLinkFieldPreview (SignupLinkField.kt:85)");
            }
            com.paypal.oslo.feature.onboarding.signup.ui.PreviewHelpersKt.PreviewWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(191717984, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLinkFieldKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLinkFieldKt.$r8$lambda$gjchJB4bOI4Ky40yD8Mtis3a44s(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLinkFieldKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLinkFieldKt.$r8$lambda$fIrZky1Cv77xjYxH4XWnIk6iIIg(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gjchJB4bOI4Ky40yD8Mtis3a44s(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig signupLinkFieldConfig, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(191717984, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLinkFieldPreview.<anonymous> (SignupLinkField.kt:87)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLinkFieldKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            SignupLinkField(signupLinkFieldConfig, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.Modifier.INSTANCE, composer, com.paypal.pds.components.LinkSize.$stable | 432, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
