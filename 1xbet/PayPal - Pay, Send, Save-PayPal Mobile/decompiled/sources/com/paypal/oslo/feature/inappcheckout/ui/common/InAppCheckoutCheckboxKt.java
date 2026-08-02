package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"InAppCheckoutCheckbox", "", "enabled", "", com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, "onSelect", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutCheckboxKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InAppCheckoutCheckbox(final boolean z, final boolean z2, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1835252470);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1835252470, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCheckbox (InAppCheckoutCheckbox.kt:60)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(modifier4, com.paypal.pds.core.ConstantsKt.getSize24());
                if (z) {
                    modifier3 = modifier4;
                    if (z2) {
                        startRestartGroup.startReplaceGroup(-926582700);
                        z3 = (i3 & 896) == 256;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCheckboxKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCheckboxKt.m15499$r8$lambda$VNMdRrimtwgWmvsCmvzOv0qo9U(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.pds.components.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_ppbl_checkbox_selected, startRestartGroup, 0), com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_ppbl_custom_check_box, new java.lang.Object[0], startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(m1740size3ABfNKs, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 31), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.ContentLink.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize4()), startRestartGroup, 48, 0), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.INAPPCHECKOUT_CHECKBOX_SELECTED), null, null, null, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable, 120);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-925993483);
                        z3 = (i3 & 896) == 256;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCheckboxKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCheckboxKt.$r8$lambda$qeWdDLJpL87XAgZnMLR0pw5jGuE(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(m1740size3ABfNKs, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 31), com.paypal.pds.core.ConstantsKt.getSize2(), com.paypal.pds.core.Color.BorderBase.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(com.paypal.pds.core.ConstantsKt.getSize4())), startRestartGroup, 384, 0), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize4()), startRestartGroup, 48, 0), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.INAPPCHECKOUT_CHECKBOX_UNSELECTED), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                } else {
                    startRestartGroup.startReplaceGroup(-927061092);
                    modifier3 = modifier4;
                    com.paypal.pds.components.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_ppbl_checkbox_disabled, startRestartGroup, 0), com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_ppbl_custom_check_box_disabled, new java.lang.Object[0], startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(m1740size3ABfNKs, com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.INAPPCHECKOUT_CHECKBOX_DISABLED), null, null, null, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable, 120);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCheckboxKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCheckboxKt.m15498$r8$lambda$6e9wSOu_YEQYS44FqzIgUnQL90(z, z2, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$6e9wSOu_YEQYS44FqzIgUnQL9-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15498$r8$lambda$6e9wSOu_YEQYS44FqzIgUnQL90(boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InAppCheckoutCheckbox(z, z2, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VNMdRrimtwgWmvsCmvzOv-0qo9U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15499$r8$lambda$VNMdRrimtwgWmvsCmvzOv0qo9U(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qeWdDLJpL87XAgZnMLR0pw5jGuE(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }
}
