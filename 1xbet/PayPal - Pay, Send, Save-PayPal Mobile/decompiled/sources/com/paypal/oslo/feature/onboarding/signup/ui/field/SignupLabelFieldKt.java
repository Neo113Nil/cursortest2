package com.paypal.oslo.feature.onboarding.signup.ui.field;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"SignupLabelField", "", "config", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupLabelFieldConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupLabelFieldConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupLabelFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupLabelField(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig signupLabelFieldConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object m23436constructorimpl;
        com.paypal.pds.core.Typography.HeadingMedium headingMedium;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupLabelFieldConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-313499495);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(signupLabelFieldConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-313499495, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLabelField (SignupLabelField.kt:36)");
                }
                java.lang.String mo16551getFieldType7vt1OyQ = signupLabelFieldConfig.mo16551getFieldType7vt1OyQ();
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
                com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType = (com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType) ((java.lang.Enum) m23436constructorimpl);
                int i5 = signupFieldType != null ? com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLabelFieldKt.WhenMappings.$EnumSwitchMapping$0[signupFieldType.ordinal()] : -1;
                if (i5 == 1) {
                    headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                } else if (i5 == 2) {
                    headingMedium = com.paypal.pds.core.Typography.LabelLarge.INSTANCE;
                } else {
                    headingMedium = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(signupLabelFieldConfig.getLabel()), new java.lang.Object[0], startRestartGroup, 0), modifier3, null, null, null, null, false, 0, 0, null, headingMedium, composer2, i3 & 112, 0, 1020);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLabelFieldKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.field.SignupLabelFieldKt.m16479$r8$lambda$i_vyGnlJ8n0SABSvjIyOjGTF3Q(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$i_v-yGnlJ8n0SABSvjIyOjGTF3Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16479$r8$lambda$i_vyGnlJ8n0SABSvjIyOjGTF3Q(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig signupLabelFieldConfig, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupLabelField(signupLabelFieldConfig, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.HEADER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.SUBHEADER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
