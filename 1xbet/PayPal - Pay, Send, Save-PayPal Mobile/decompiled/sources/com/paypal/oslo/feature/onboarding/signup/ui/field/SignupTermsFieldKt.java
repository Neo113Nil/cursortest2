package com.paypal.oslo.feature.onboarding.signup.ui.field;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u000526\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"SignupTermsField", "", "config", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTermsFieldConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "onLinkClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "text", "url", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTermsFieldConfig;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupTermsFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupTermsField(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig signupTermsFieldConfig, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupTermsFieldConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(575257790);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(signupTermsFieldConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(575257790, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.field.SignupTermsField (SignupTermsField.kt:47)");
                }
                java.lang.String m16200variantCBRiV3w = com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(signupTermsFieldConfig.getText()), new java.lang.Object[0], startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-1228037340);
                java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> links = signupTermsFieldConfig.getLinks();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(links, 10));
                java.util.Iterator<T> it = links.iterator();
                while (it.hasNext()) {
                    kotlin.Pair pair = (kotlin.Pair) it.next();
                    arrayList.add(kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl((java.lang.String) pair.component1()), new java.lang.Object[0], startRestartGroup, 0), com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl((java.lang.String) pair.component2()), new java.lang.Object[0], startRestartGroup, 0)));
                }
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(com.paypal.pds.utils.BackwardCompatibleRichTextKt.toRichText(m16200variantCBRiV3w, arrayList), modifier4, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, function2, com.paypal.pds.core.Typography.BodySmall.INSTANCE, null, composer2, (i3 & 112) | 384, ((i3 >> 6) & 14) | 48, 5112);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.SignupTermsFieldKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.field.SignupTermsFieldKt.$r8$lambda$HKdqCvzscXtFF8j0AIZJSX2y41w(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig.this, modifier3, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HKdqCvzscXtFF8j0AIZJSX2y41w(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig signupTermsFieldConfig, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupTermsField(signupTermsFieldConfig, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
