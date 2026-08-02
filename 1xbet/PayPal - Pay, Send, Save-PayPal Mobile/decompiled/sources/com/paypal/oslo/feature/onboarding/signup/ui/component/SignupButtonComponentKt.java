package com.paypal.oslo.feature.onboarding.signup.ui.component;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"SignupButtonComponent", "", "componentConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ButtonComponentConfig;", "callbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Button;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ButtonComponentConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$Button;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SignupButtonComponentPreview", "(Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupButtonComponentKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupButtonComponent(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ButtonComponentConfig buttonComponentConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Button button, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1658334737);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(buttonComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(button) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1658334737, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.SignupButtonComponent (SignupButtonComponent.kt:42)");
                }
                com.paypal.pds.components.ButtonKt.Button(button.getOnClick(), com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(buttonComponentConfig.getButtonField().getLabel()), new java.lang.Object[0], startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 7, null), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, false, false, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.SignupButtonComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.component.SignupButtonComponentKt.m16463$r8$lambda$nBaL5aNpgkw0NId0RE_cAns(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ButtonComponentConfig.this, button, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SignupButtonComponentPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1397072261);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1397072261, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.SignupButtonComponentPreview (SignupButtonComponent.kt:53)");
            }
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ButtonComponentConfig buttonComponentConfig = new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ButtonComponentConfig("button", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("BUTTON"), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig("button_field", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("BUTTON"), "How it works", null, null, 24, null), null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.SignupButtonComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SignupButtonComponent(buttonComponentConfig, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Button((kotlin.jvm.functions.Function0) rememberedValue), null, startRestartGroup, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.SignupButtonComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.SignupButtonComponentKt.$r8$lambda$dixGUuPr6sXi0cNw4XIQOSG0cWY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dixGUuPr6sXi0cNw4XIQOSG0cWY(int i, androidx.compose.runtime.Composer composer, int i2) {
        SignupButtonComponentPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nBaL5aNp-gk-w0NId0R-E_cA-ns, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16463$r8$lambda$nBaL5aNpgkw0NId0RE_cAns(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ButtonComponentConfig buttonComponentConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.Button button, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupButtonComponent(buttonComponentConfig, button, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
