package com.paypal.oslo.feature.moneymovement.ui.summary;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"DeliveryRow", "", "delivery", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentDelivery;", "dateTimeFormatUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentDelivery;Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;Landroidx/compose/runtime/Composer;II)V", "ExpiryDateRow", "expiryDateForPayPalLink", "Ljava/util/Date;", "(Ljava/util/Date;Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;Landroidx/compose/runtime/Composer;I)V", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SummaryDeliveryKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeliveryRow(final com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery paymentDelivery, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object m23436constructorimpl;
        java.time.Instant instant;
        java.lang.String str;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDelivery, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1929537537);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(paymentDelivery) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            dateTimeFormatUseCase2 = dateTimeFormatUseCase;
            i3 |= startRestartGroup.changedInstance(dateTimeFormatUseCase2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                dateTimeFormatUseCase3 = dateTimeFormatUseCase2;
            } else {
                com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase4 = i4 != 0 ? null : dateTimeFormatUseCase2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1929537537, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.summary.DeliveryRow (SummaryDelivery.kt:42)");
                }
                if (paymentDelivery.getCustomEstimatedDeliveryText() != null) {
                    startRestartGroup.startReplaceGroup(-989293294);
                    final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase5 = dateTimeFormatUseCase4;
                    com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_estimated_delivery, startRestartGroup, 0), null, null, paymentDelivery.getCustomEstimatedDeliveryText(), null, false, false, null, null, null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), null, null, false, startRestartGroup, 0, 0, 475126);
                    startRestartGroup.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        endRestartGroup2.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDeliveryKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDeliveryKt.$r8$lambda$rfVA3qWET4Mf8Iw0XMD4ngIwXOY(com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery.this, dateTimeFormatUseCase5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                dateTimeFormatUseCase3 = dateTimeFormatUseCase4;
                startRestartGroup.startReplaceGroup(-989032863);
                startRestartGroup.endReplaceGroup();
                int i5 = com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDeliveryKt.WhenMappings.$EnumSwitchMapping$0[paymentDelivery.getSpeed().ordinal()];
                if (i5 == 1) {
                    startRestartGroup.startReplaceGroup(-988922937);
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_estimated_delivery, startRestartGroup, 0), null, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_summary_in_seconds, startRestartGroup, 0), null, false, false, null, null, null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), null, null, false, composer2, 0, 0, 475126);
                    composer2.endReplaceGroup();
                } else if (i5 == 2) {
                    startRestartGroup.startReplaceGroup(-988576729);
                    com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_estimated_delivery, startRestartGroup, 0), null, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_summary_in_minutes, startRestartGroup, 0), null, false, false, null, null, null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), null, null, false, startRestartGroup, 0, 0, 475126);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    if (i5 != 3) {
                        startRestartGroup.startReplaceGroup(-1140279855);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-988211766);
                    boolean changed = startRestartGroup.changed(paymentDelivery.getEstimatedArrivalTime());
                    boolean changed2 = startRestartGroup.changed(dateTimeFormatUseCase3);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        java.lang.String estimatedArrivalTime = paymentDelivery.getEstimatedArrivalTime();
                        if (estimatedArrivalTime != null) {
                            try {
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                instant = java.time.OffsetDateTime.parse(estimatedArrivalTime).toInstant();
                            } catch (java.lang.Throwable th) {
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                            }
                            if (dateTimeFormatUseCase3 != null) {
                                java.util.Date from = java.util.Date.from(instant);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
                                arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> invoke = dateTimeFormatUseCase3.invoke(new com.paypal.oslo.core.i18n.domain.model.DateTime(from, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC), new com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration(new com.paypal.oslo.core.i18n.domain.model.CustomStyle("MMMd"), null, 2, null));
                                if (invoke != null) {
                                    str = invoke.getOrNull();
                                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(str);
                                    r9 = (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
                                }
                            }
                            str = null;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(str);
                            r9 = (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
                        }
                        startRestartGroup.updateRememberedValue(r9);
                        rememberedValue = r9;
                    }
                    java.lang.String str2 = (java.lang.String) rememberedValue;
                    if (str2 != null) {
                        startRestartGroup.startReplaceGroup(-987616256);
                        com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_estimated_delivery, startRestartGroup, 0), null, null, str2, null, false, false, null, null, null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), null, null, false, startRestartGroup, 0, 0, 475126);
                        startRestartGroup.endReplaceGroup();
                        composer3 = startRestartGroup;
                    } else {
                        composer3 = startRestartGroup;
                        composer3.startReplaceGroup(-987338527);
                        composer3.endReplaceGroup();
                    }
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDeliveryKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDeliveryKt.$r8$lambda$bYoCBvrZTyqtqvNEZUIN4_XybSs(com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery.this, dateTimeFormatUseCase3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        dateTimeFormatUseCase2 = dateTimeFormatUseCase;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ExpiryDateRow(final java.util.Date date, final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1933884798);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(date) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(dateTimeFormatUseCase) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1933884798, i2, -1, "com.paypal.oslo.feature.moneymovement.ui.summary.ExpiryDateRow (SummaryDelivery.kt:109)");
            }
            if (date == null || dateTimeFormatUseCase == null) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                scopeUpdateScope = startRestartGroup.endRestartGroup();
                if (scopeUpdateScope != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDeliveryKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDeliveryKt.$r8$lambda$EIxN7VzsfkYMaI3pf08itB9z4Xc(date, dateTimeFormatUseCase, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScope.updateScope(function2);
                }
                return;
            }
            boolean changed = startRestartGroup.changed(date);
            boolean changed2 = startRestartGroup.changed(dateTimeFormatUseCase);
            java.lang.String rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = dateTimeFormatUseCase.invoke(new com.paypal.oslo.core.i18n.domain.model.DateTime(date, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC), new com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration(new com.paypal.oslo.core.i18n.domain.model.CustomStyle("MMMd"), null, 2, null)).getOrNull();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            java.lang.String str = (java.lang.String) rememberedValue;
            if (str == null) {
                startRestartGroup.startReplaceGroup(329756389);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(329756390);
                composer2 = startRestartGroup;
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_expires_on, startRestartGroup, 0), null, null, str, null, false, false, null, null, null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing4()), null, null, false, composer2, 0, 0, 475126);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        scopeUpdateScope = composer2.endRestartGroup();
        if (scopeUpdateScope != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDeliveryKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDeliveryKt.$r8$lambda$CtqzPcm53gmK3f1D1615cO2U61Y(date, dateTimeFormatUseCase, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            scopeUpdateScope.updateScope(function2);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CtqzPcm53gmK3f1D1615cO2U61Y(java.util.Date date, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, int i, androidx.compose.runtime.Composer composer, int i2) {
        ExpiryDateRow(date, dateTimeFormatUseCase, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EIxN7VzsfkYMaI3pf08itB9z4Xc(java.util.Date date, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, int i, androidx.compose.runtime.Composer composer, int i2) {
        ExpiryDateRow(date, dateTimeFormatUseCase, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bYoCBvrZTyqtqvNEZUIN4_XybSs(com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery paymentDelivery, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DeliveryRow(paymentDelivery, dateTimeFormatUseCase, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rfVA3qWET4Mf8Iw0XMD4ngIwXOY(com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery paymentDelivery, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DeliveryRow(paymentDelivery, dateTimeFormatUseCase, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.INSTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.STANDARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.DEFERRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
