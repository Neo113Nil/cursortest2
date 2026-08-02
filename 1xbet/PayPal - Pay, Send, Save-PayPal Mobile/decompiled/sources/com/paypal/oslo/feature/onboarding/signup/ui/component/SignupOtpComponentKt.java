package com.paypal.oslo.feature.onboarding.signup.ui.component;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000f\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"OtpCodeLength", "Lcom/paypal/pds/components/CodeInputFieldCount;", "getOtpCodeLength", "()Lcom/paypal/pds/components/CodeInputFieldCount;", "SignupOtpComponent", "", "onInputChange", "Lkotlin/Function0;", "onComplete", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "errorMessage", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/core/commonui/utils/RefText;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease", "otpCode"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupOtpComponentKt {
    private static final com.paypal.pds.components.CodeInputFieldCount getHighResolutionOutputSizeshNQ4ISI = com.paypal.pds.components.CodeInputFieldCount.SIX;

    public static final com.paypal.pds.components.CodeInputFieldCount getOtpCodeLength() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupOtpComponent(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.commonui.utils.RefText refText, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.core.commonui.utils.RefText refText2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String value;
        com.paypal.oslo.core.commonui.utils.RefText refText3 = refText;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(370415119);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
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
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? startRestartGroup.changed(refText3) : startRestartGroup.changedInstance(refText3) ? 2048 : 1024;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                refText2 = refText3;
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (i4 != 0) {
                    refText3 = null;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(370415119, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.component.SignupOtpComponent (SignupOtpComponent.kt:49)");
                }
                final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
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
                java.lang.String str = (java.lang.String) mutableState.getValue();
                com.paypal.pds.components.CodeInputFieldCount codeInputFieldCount = getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.pds.components.InputType inputType = com.paypal.pds.components.InputType.Number;
                if (refText3 == null) {
                    startRestartGroup.startReplaceGroup(-136264543);
                    startRestartGroup.endReplaceGroup();
                    value = null;
                } else {
                    startRestartGroup.startReplaceGroup(-1666963616);
                    value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(refText3, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | ((i3 >> 9) & 14));
                    startRestartGroup.endReplaceGroup();
                }
                int m8214getDoneeUduSuo = androidx.compose.ui.text.input.ImeAction.INSTANCE.m8214getDoneeUduSuo();
                boolean changed = startRestartGroup.changed(softwareKeyboardController);
                int i6 = i3 & 112;
                com.paypal.oslo.core.commonui.utils.RefText refText4 = refText3;
                boolean z = i6 == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.SignupOtpComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.onboarding.signup.ui.component.SignupOtpComponentKt.m16464$r8$lambda$I7_ND6_VYvEpuZdRwOaVYald7k(androidx.compose.ui.platform.SoftwareKeyboardController.this, function1, mutableState, (androidx.compose.foundation.text.KeyboardActionScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.foundation.text.KeyboardActions keyboardActions = new androidx.compose.foundation.text.KeyboardActions((kotlin.jvm.functions.Function1) rememberedValue2, null, null, null, null, null, 62, null);
                boolean z2 = i6 == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.SignupOtpComponentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.onboarding.signup.ui.component.SignupOtpComponentKt.$r8$lambda$ANwasMCYW73DvOXAOWlnxqKMEaE(kotlin.jvm.functions.Function1.this, mutableState);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean z3 = (i3 & 14) == 4;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.SignupOtpComponentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.onboarding.signup.ui.component.SignupOtpComponentKt.m16465$r8$lambda$qGWf46oAxZ6B81nvXwhrQWPZqA(kotlin.jvm.functions.Function0.this, mutableState, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                modifier3 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.CodeInputKt.m21717CodeInputJ5mU35w(null, str, value, codeInputFieldCount, inputType, (char) 0, false, false, m8214getDoneeUduSuo, keyboardActions, function02, (kotlin.jvm.functions.Function1) rememberedValue4, composer2, 100690944, 0, 225);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                refText2 = refText4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.component.SignupOtpComponentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.component.SignupOtpComponentKt.$r8$lambda$RshZCrts98BLiaXOuNeY5cnrHcM(kotlin.jvm.functions.Function0.this, function1, modifier3, refText2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$ANwasMCYW73DvOXAOWlnxqKMEaE(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState) {
        androidx.compose.runtime.MutableState mutableState2 = mutableState;
        if (((java.lang.String) mutableState2.getValue()).length() == getHighResolutionOutputSizeshNQ4ISI.getCount()) {
            function1.invoke((java.lang.String) mutableState2.getValue());
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$I7_ND6_VYv-EpuZdRwOaVYald7k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16464$r8$lambda$I7_ND6_VYvEpuZdRwOaVYald7k(androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.text.KeyboardActionScope keyboardActionScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardActionScope, "");
        androidx.compose.runtime.MutableState mutableState2 = mutableState;
        if (((java.lang.String) mutableState2.getValue()).length() == getHighResolutionOutputSizeshNQ4ISI.getCount() && softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        function1.invoke((java.lang.String) mutableState2.getValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RshZCrts98BLiaXOuNeY5cnrHcM(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.commonui.utils.RefText refText, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupOtpComponent(function0, function1, modifier, refText, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qGWf46oA-xZ6B81nvXwhrQWPZqA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16465$r8$lambda$qGWf46oAxZ6B81nvXwhrQWPZqA(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
