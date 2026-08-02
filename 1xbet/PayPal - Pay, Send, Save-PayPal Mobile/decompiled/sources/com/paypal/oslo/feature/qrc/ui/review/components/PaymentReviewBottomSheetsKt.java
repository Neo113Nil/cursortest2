package com.paypal.oslo.feature.qrc.ui.review.components;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0000¢\u0006\u0004\b\t\u0010\b"}, d2 = {"", "visible", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "Lkotlin/ParameterName;", "", "onEvent", "LowBalanceBottomSheet", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "NoFIBottomSheet"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentReviewBottomSheetsKt {
    public static final void LowBalanceBottomSheet(final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1296250247);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1296250247, i2, -1, "com.paypal.oslo.feature.qrc.ui.review.components.LowBalanceBottomSheet (PaymentReviewBottomSheets.kt:25)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z2 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt$LowBalanceBottomSheet$1$1(z, bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i3);
            if (z || bottomSheetController.getVisible()) {
                startRestartGroup.startReplaceGroup(-539782100);
                int i4 = i2 & 112;
                boolean z3 = i4 == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt.$r8$lambda$Yi87qyFtokBS8PHp47bdsmecQwM(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_title_low_balance, startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_desc_low_balance, startRestartGroup, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_button_add_payment_method, startRestartGroup, 0);
                boolean z4 = i4 == 32;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt.$r8$lambda$gxKzFB9FCSmemArik2jD8i8x4vw(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_button_top_up_balance, startRestartGroup, 0);
                boolean z5 = i4 == 32;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt.m17845$r8$lambda$HvIPmCA5DVy0rxde1CsDHdLjhc(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt.ReviewBottomSheet(bottomSheetController, function0, stringResource, stringResource2, stringResource3, function02, stringResource4, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-539077687);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt.$r8$lambda$42sn4tIuizxG3nhJZtg4D04Lluk(z, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NoFIBottomSheet(final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1679131165);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1679131165, i2, -1, "com.paypal.oslo.feature.qrc.ui.review.components.NoFIBottomSheet (PaymentReviewBottomSheets.kt:48)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z2 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt$NoFIBottomSheet$1$1(z, bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i3);
            if (z || bottomSheetController.getVisible()) {
                startRestartGroup.startReplaceGroup(-487227086);
                int i4 = i2 & 112;
                boolean z3 = i4 == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt.m17846$r8$lambda$bm3wMqpKApRLNTtrNbokB9Y00(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_title_payment_method_needed, startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_desc_payment_method_needed, startRestartGroup, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_fi_error_button_add_payment_method, startRestartGroup, 0);
                boolean z4 = i4 == 32;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt.m17844$r8$lambda$HSvhNRn0qzqm1X2uR7AMaJN2As(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.feature.qrc.ui.review.components.ReviewBottomSheetKt.ReviewBottomSheet(bottomSheetController, function0, stringResource, stringResource2, stringResource3, (kotlin.jvm.functions.Function0) rememberedValue4, null, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 192);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-486686043);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt.$r8$lambda$6duLIeAZwLmIxtPL8C4EpUJdeAM(z, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-HSvhNRn0qzqm1X2uR7AMaJN2As, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17844$r8$lambda$HSvhNRn0qzqm1X2uR7AMaJN2As(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.AddPaymentMethodClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$42sn4tIuizxG3nhJZtg4D04Lluk(boolean z, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        LowBalanceBottomSheet(z, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6duLIeAZwLmIxtPL8C4EpUJdeAM(boolean z, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        NoFIBottomSheet(z, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HvIPmCA5DV-y0rxde1CsDHdLjhc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17845$r8$lambda$HvIPmCA5DVy0rxde1CsDHdLjhc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.TopUpBalanceClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Yi87qyFtokBS8PHp47bdsmecQwM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissBottomSheet.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bm3wMqpKApRLNTtrNbokB-9-Y00, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17846$r8$lambda$bm3wMqpKApRLNTtrNbokB9Y00(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissBottomSheet.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gxKzFB9FCSmemArik2jD8i8x4vw(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.AddPaymentMethodClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
