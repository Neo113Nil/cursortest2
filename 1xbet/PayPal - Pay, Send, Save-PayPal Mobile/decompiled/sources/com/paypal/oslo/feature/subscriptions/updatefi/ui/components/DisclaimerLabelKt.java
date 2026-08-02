package com.paypal.oslo.feature.subscriptions.updatefi.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"DisclaimerLabel", "", "modifier", "Landroidx/compose/ui/Modifier;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DisclaimerLabelKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DisclaimerLabel(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, kotlin.Unit> function12;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, kotlin.Unit> function13;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(310444059);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.ui.components.DisclaimerLabelKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.subscriptions.updatefi.ui.components.DisclaimerLabelKt.$r8$lambda$jJuXqxCT0Z3zZijhIzY7QT5oPyg((com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                } else {
                    function13 = function12;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(310444059, i3, -1, "com.paypal.oslo.feature.subscriptions.updatefi.ui.components.DisclaimerLabel (DisclaimerLabel.kt:30)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_updatefi_about_payment_methods_html, new java.lang.Object[]{"disclosure"}, startRestartGroup, 0);
                boolean changed = startRestartGroup.changed(stringResource);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = com.paypal.oslo.feature.subscriptions.shared.ui.HtmlRichTextParserKt.htmlToRichText(stringResource);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.core.RichText richText = (com.paypal.pds.core.RichText) rememberedValue2;
                com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), "disclaimer_label");
                com.paypal.pds.core.Color.ContentMuted contentMuted2 = contentMuted;
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.ui.components.DisclaimerLabelKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.updatefi.ui.components.DisclaimerLabelKt.$r8$lambda$LFMjwTdy9nRcwWe7aNJ2LixzdgA(kotlin.jvm.functions.Function1.this, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, kotlin.Unit> function14 = function13;
                modifier3 = modifier2;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, testTag, contentMuted2, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue3, bodyMedium, null, composer2, 384, 48, 5112);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function12 = function14;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.ui.components.DisclaimerLabelKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.updatefi.ui.components.DisclaimerLabelKt.$r8$lambda$IA1xILB18Z5_pGTqmH_gVtYQWuQ(androidx.compose.ui.Modifier.this, function12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IA1xILB18Z5_pGTqmH_gVtYQWuQ(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DisclaimerLabel(modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LFMjwTdy9nRcwWe7aNJ2LixzdgA(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnAboutPaymentMethodsClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jJuXqxCT0Z3zZijhIzY7QT5oPyg(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent updateFiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateFiEvent, "");
        return kotlin.Unit.INSTANCE;
    }
}
