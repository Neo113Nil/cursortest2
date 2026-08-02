package com.paypal.oslo.feature.onboarding.signup.ui.component;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"TermsAndConditionsComponent", "", "componentConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/TermsAndConditionsComponentConfig;", "callbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$TermsAndConditions;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/TermsAndConditionsComponentConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks$TermsAndConditions;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewTermsFieldId", "", "PreviewTermsFieldType", "TermsNoLinksPreview", "(Landroidx/compose/runtime/Composer;I)V", "TermsSingleLinkPreview", "TermsMultipleLinksPreview", "TermsPersonalInfoPreview", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TermsAndConditionsComponentKt {
    public static final void TermsAndConditionsComponent(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig termsAndConditionsComponentConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions termsAndConditions, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsAndConditionsComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsAndConditions, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1001236477);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(termsAndConditionsComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(termsAndConditions) ? 32 : 16;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-1001236477, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponent (TermsAndConditionsComponent.kt:52)");
            }
            com.paypal.oslo.feature.onboarding.signup.ui.field.SignupTermsFieldKt.SignupTermsField(termsAndConditionsComponentConfig.getTermsField(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), termsAndConditions.getOnLinkClick(), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt.m16470$r8$lambda$B3j73zHSsg5KbcNk6qtpk2GEY(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig.this, termsAndConditions, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TermsNoLinksPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1872171811);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1872171811, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.TermsNoLinksPreview (TermsAndConditionsComponent.kt:67)");
            }
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig termsAndConditionsComponentConfig = new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig("terms-no-links", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("TERMS_AND_CONDITIONS"), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig("terms-field", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("TERMS_AND_CONDITIONS"), "By continuing, you agree to the terms and conditions.", null, 8, null), null);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt.m16471$r8$lambda$LN8o8NHfdmFD0M6bDhRYig6KWY((java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TermsAndConditionsComponent(termsAndConditionsComponentConfig, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions((kotlin.jvm.functions.Function2) rememberedValue), companion, startRestartGroup, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt.$r8$lambda$k9hmaGmjtJcKtLwQKqqnvP8V2nk(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TermsSingleLinkPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1650969369);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1650969369, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.TermsSingleLinkPreview (TermsAndConditionsComponent.kt:89)");
            }
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig termsAndConditionsComponentConfig = new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig("terms-single-link", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("TERMS_AND_CONDITIONS"), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig("terms-field", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("TERMS_AND_CONDITIONS"), "By continuing, you agree to our Terms of Service", kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to("Terms of Service", "https://www.paypal.com/terms")), null), null);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt.m16469$r8$lambda$7poCbUgWt7BVy6ZISt1Xs4ULE((java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TermsAndConditionsComponent(termsAndConditionsComponentConfig, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions((kotlin.jvm.functions.Function2) rememberedValue), companion, startRestartGroup, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt.$r8$lambda$eoCVA3Q3sEUZLkqXg6JkEFw_Mxw(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TermsMultipleLinksPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1324419282);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1324419282, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.TermsMultipleLinksPreview (TermsAndConditionsComponent.kt:114)");
            }
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig termsAndConditionsComponentConfig = new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig("terms-multiple-links", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("TERMS_AND_CONDITIONS"), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig("terms-field", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("TERMS_AND_CONDITIONS"), "You agree to our E-Sign Consent, User Agreement, and Privacy Statement", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to("E-Sign Consent", "https://www.paypal.com/esign"), kotlin.TuplesKt.to("User Agreement", "https://www.paypal.com/agreement"), kotlin.TuplesKt.to("Privacy Statement", "https://www.paypal.com/privacy")}), null), null);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt.$r8$lambda$Zm2MGY_8XmlV1YGOyaGgewQm9Eg((java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TermsAndConditionsComponent(termsAndConditionsComponentConfig, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions((kotlin.jvm.functions.Function2) rememberedValue), companion, startRestartGroup, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt.$r8$lambda$wj4R0wxsbmRR2kxxqezWg0wVzmw(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TermsPersonalInfoPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(893180293);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(893180293, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.TermsPersonalInfoPreview (TermsAndConditionsComponent.kt:150)");
            }
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig termsAndConditionsComponentConfig = new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig("personal-info-terms", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16539constructorimpl("TERMS_AND_CONDITIONS"), new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig("terms-field", com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16553constructorimpl("TERMS_AND_CONDITIONS"), "By tapping Agree and Create Account, you're creating a PayPal account and confirm you're at least 18 years old and agree to our E-Sign Consent, User Agreement, and Privacy Statement", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to("E-Sign Consent", "https://www.paypal.com/esign"), kotlin.TuplesKt.to("User Agreement", "https://www.paypal.com/agreement"), kotlin.TuplesKt.to("Privacy Statement", "https://www.paypal.com/privacy")}), null), null);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt.$r8$lambda$cRRkPZtUNlNtpevoWWklqkPFLqw((java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TermsAndConditionsComponent(termsAndConditionsComponentConfig, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions((kotlin.jvm.functions.Function2) rememberedValue), companion, startRestartGroup, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.component.TermsAndConditionsComponentKt.m16468$r8$lambda$5DzgYMMKIj9NU8JfCXidGCn5M(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$5DzgYMM--KIj9NU8JfCXidGCn5M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16468$r8$lambda$5DzgYMMKIj9NU8JfCXidGCn5M(int i, androidx.compose.runtime.Composer composer, int i2) {
        TermsPersonalInfoPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7poCbUgWt7BVy6ZISt1X-s4U-LE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16469$r8$lambda$7poCbUgWt7BVy6ZISt1Xs4ULE(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$B3--j73zHSsg5KbcNk6qtpk2GEY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16470$r8$lambda$B3j73zHSsg5KbcNk6qtpk2GEY(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig termsAndConditionsComponentConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.TermsAndConditions termsAndConditions, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TermsAndConditionsComponent(termsAndConditionsComponentConfig, termsAndConditions, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LN8o8NHfdmFD0M6bDhR-Yig6KWY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16471$r8$lambda$LN8o8NHfdmFD0M6bDhRYig6KWY(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Zm2MGY_8XmlV1YGOyaGgewQm9Eg(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cRRkPZtUNlNtpevoWWklqkPFLqw(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eoCVA3Q3sEUZLkqXg6JkEFw_Mxw(int i, androidx.compose.runtime.Composer composer, int i2) {
        TermsSingleLinkPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k9hmaGmjtJcKtLwQKqqnvP8V2nk(int i, androidx.compose.runtime.Composer composer, int i2) {
        TermsNoLinksPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wj4R0wxsbmRR2kxxqezWg0wVzmw(int i, androidx.compose.runtime.Composer composer, int i2) {
        TermsMultipleLinksPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
