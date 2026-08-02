package com.paypal.oslo.feature.onboarding.signup.ui.field;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"SignupTextInputField", "", "config", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "alerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupTextInputFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupTextInputField(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list2;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String m16200variantCBRiV3w;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupTextInputFieldConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-905920844);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(signupTextInputFieldConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                list2 = list;
                i3 |= startRestartGroup.changedInstance(list2) ? 16384 : 8192;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    list3 = list2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> emptyList = i4 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-905920844, i5, -1, "com.paypal.oslo.feature.onboarding.signup.ui.field.SignupTextInputField (SignupTextInputField.kt:42)");
                    }
                    java.lang.String label = signupTextInputFieldConfig.getLabel();
                    if (label == null) {
                        startRestartGroup.startReplaceGroup(1286933934);
                        startRestartGroup.endReplaceGroup();
                        m16200variantCBRiV3w = null;
                    } else {
                        startRestartGroup.startReplaceGroup(1286933935);
                        m16200variantCBRiV3w = com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(label), new java.lang.Object[0], startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.TextInputKt.TextInput(str, function1, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier4, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), m16200variantCBRiV3w == null ? "" : m16200variantCBRiV3w, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, emptyList, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer2, (i5 >> 3) & 126, (i5 & 57344) | 48, 112624);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    list3 = emptyList;
                    modifier3 = modifier5;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.SignupTextInputFieldKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.signup.ui.field.SignupTextInputFieldKt.$r8$lambda$uLFXcN_JSqU8L7drdR_U19A7S9o(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig.this, str, function1, modifier3, list3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            list2 = list;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        list2 = list;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uLFXcN_JSqU8L7drdR_U19A7S9o(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, java.util.List list, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupTextInputField(signupTextInputFieldConfig, str, function1, modifier, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
