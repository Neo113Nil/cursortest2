package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"AccessibleToast", "", "toastState", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToastState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToastState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccessibleToastKt {
    public static final void AccessibleToast(final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1672629944);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(toastState) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(1672629944, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.AccessibleToast (AccessibleToast.kt:52)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastStateKt.OnVisible(toastState, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(107155658, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.AccessibleToastKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.AccessibleToastKt.$r8$lambda$V5oNFIrF3lhfERTsj65aIvtkFeA(androidx.compose.ui.Modifier.this, toastState, (com.paypal.oslo.core.commonui.utils.RefText) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.AccessibleToastKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.AccessibleToastKt.m12309$r8$lambda$YBtEIbnuMnNKfYRPQLrBlKg0mE(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E_opR1D5hheBUacIIlkOBs9y_M0(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState, boolean z) {
        if (!z) {
            toastState.hide();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PWFZjABbQy0x-pBKdNBhie-b_VE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12308$r8$lambda$PWFZjABbQy0xpBKdNBhieb_VE(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$V5oNFIrF3lhfERTsj65aIvtkFeA(androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState, com.paypal.oslo.core.commonui.utils.RefText refText, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(refText) : composer.changedInstance(refText) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(107155658, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.AccessibleToast.<anonymous> (AccessibleToast.kt:54)");
            }
            final java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(refText, composer, (i & 14) | com.paypal.oslo.core.commonui.utils.RefText.$stable);
            boolean changed = composer.changed(value);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.AccessibleToastKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.AccessibleToastKt.m12308$r8$lambda$PWFZjABbQy0xpBKdNBhieb_VE(value, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            boolean changed2 = composer.changed(toastState);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.AccessibleToastKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.AccessibleToastKt.$r8$lambda$E_opR1D5hheBUacIIlkOBs9y_M0(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.ToastKt.Toast(value, semantics$default, null, (kotlin.jvm.functions.Function1) rememberedValue2, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YBtEIbnuMnNKfYRPQLrB-lKg0mE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12309$r8$lambda$YBtEIbnuMnNKfYRPQLrBlKg0mE(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToastState toastState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccessibleToast(toastState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
