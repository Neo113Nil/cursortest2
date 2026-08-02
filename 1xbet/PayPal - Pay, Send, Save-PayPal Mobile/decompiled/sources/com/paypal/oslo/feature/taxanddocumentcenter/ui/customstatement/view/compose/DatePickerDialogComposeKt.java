package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001au\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0014\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aY\u0010\u0014\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/ActiveDatePicker;", "activeDatePicker", "Ljava/time/LocalDate;", "fromDate", "toDate", "Lkotlin/Function1;", "", "", "isSelectableDatePredicate", "", "onFromDateSelect", "onToDateSelect", "Lkotlin/Function0;", "onDismiss", "RenderDatePicker", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/ActiveDatePicker;Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "p0", "p1", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(Ljava/time/LocalDate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "p4", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DatePickerDialogComposeKt {
    public static final void RenderDatePicker(final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker activeDatePicker, final java.time.LocalDate localDate, final java.time.LocalDate localDate2, final kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> function1, final kotlin.jvm.functions.Function1<? super java.time.LocalDate, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super java.time.LocalDate, kotlin.Unit> function13, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean> createToDateSelectablePredicate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeDatePicker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(338797847);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(activeDatePicker.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(localDate) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(localDate2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if (startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(338797847, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.RenderDatePicker (DatePickerDialogCompose.kt:30)");
            }
            int i3 = com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt.WhenMappings.$EnumSwitchMapping$0[activeDatePicker.ordinal()];
            if (i3 == 1) {
                startRestartGroup.startReplaceGroup(-46136375);
                int i4 = i2 >> 6;
                getHighSpeedVideoFpsRangesFor(localDate, function1, function12, function0, startRestartGroup, (i4 & 896) | ((i2 >> 3) & 14) | (i4 & 112) | ((i2 >> 9) & 7168));
                startRestartGroup.endReplaceGroup();
            } else if (i3 == 2) {
                startRestartGroup.startReplaceGroup(-45834807);
                boolean changed = startRestartGroup.changed(localDate);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (localDate == null || (createToDateSelectablePredicate = com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils.INSTANCE.createToDateSelectablePredicate(localDate)) == null) ? function1 : createToDateSelectablePredicate;
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                int i5 = i2 >> 6;
                getHighSpeedVideoFpsRangesFor(localDate, localDate2, function14, function13, function0, startRestartGroup, ((i2 >> 3) & 126) | (i5 & 7168) | (i5 & 57344));
                startRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 3) {
                    startRestartGroup.startReplaceGroup(-832773620);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-832744517);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt.m20341$r8$lambda$HIOaAODUx0YEDyTpxsgzwaVXGs(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker.this, localDate, localDate2, function1, function12, function13, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.time.LocalDate localDate, final kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> function1, final kotlin.jvm.functions.Function1<? super java.time.LocalDate, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1136258797);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(localDate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1136258797, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.FromDatePickerDialog (DatePickerDialogCompose.kt:67)");
            }
            final com.paypal.pds.components.SingleDateCalendarState rememberSingleDateCalendarState = com.paypal.pds.components.CalendarKt.rememberSingleDateCalendarState(localDate == null ? com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils.INSTANCE.getDefaultFromDate() : localDate, function1, null, startRestartGroup, i3 & 112, 4);
            boolean changed = startRestartGroup.changed(rememberSingleDateCalendarState);
            boolean z = (i3 & 896) == 256;
            boolean z2 = (i3 & 7168) == 2048;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt.$r8$lambda$2lIWBHnWNzHqYo9GbewOEbF4sTk(com.paypal.pds.components.SingleDateCalendarState.this, function12, function0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.CalendarKt.CalendarDialog((kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue, function0, rememberSingleDateCalendarState, (java.lang.String) null, (java.lang.String) null, startRestartGroup, (i3 >> 6) & 112, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt.m20340$r8$lambda$8vXlhnCJ47UxY7VhmWoSN9NGOs(localDate, function1, function12, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.time.LocalDate localDate, final java.time.LocalDate localDate2, final kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> function1, final kotlin.jvm.functions.Function1<? super java.time.LocalDate, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.time.LocalDate localDate3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2052083345);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(localDate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(localDate2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2052083345, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.ToDatePickerDialog (DatePickerDialogCompose.kt:93)");
            }
            if (localDate2 == null) {
                localDate3 = localDate == null ? com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils.INSTANCE.getDefaultToDate() : localDate;
            } else {
                localDate3 = localDate2;
            }
            final com.paypal.pds.components.SingleDateCalendarState rememberSingleDateCalendarState = com.paypal.pds.components.CalendarKt.rememberSingleDateCalendarState(localDate3, function1, null, startRestartGroup, (i3 >> 3) & 112, 4);
            boolean changed = startRestartGroup.changed(rememberSingleDateCalendarState);
            boolean z = (i3 & 7168) == 2048;
            boolean z2 = (57344 & i3) == 16384;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt.$r8$lambda$uTjsFkcjis1E8Ye2zvxZgEcZXto(com.paypal.pds.components.SingleDateCalendarState.this, function12, function0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.CalendarKt.CalendarDialog((kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue, function0, rememberSingleDateCalendarState, (java.lang.String) null, (java.lang.String) null, startRestartGroup, (i3 >> 9) & 112, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.compose.DatePickerDialogComposeKt.$r8$lambda$ufjr5feZlAuU439nXTOvFBzO4Ig(localDate, localDate2, function1, function12, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2lIWBHnWNzHqYo9GbewOEbF4sTk(com.paypal.pds.components.SingleDateCalendarState singleDateCalendarState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0) {
        java.time.LocalDate selectedDate = singleDateCalendarState.getSelectedDate();
        if (selectedDate != null) {
            function1.invoke(selectedDate);
        }
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8vXlhnCJ47UxY7VhmWoSN9NG-Os, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20340$r8$lambda$8vXlhnCJ47UxY7VhmWoSN9NGOs(java.time.LocalDate localDate, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(localDate, function1, function12, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HIOaAODUx0YEDyTpxsgzwaVXG-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20341$r8$lambda$HIOaAODUx0YEDyTpxsgzwaVXGs(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker activeDatePicker, java.time.LocalDate localDate, java.time.LocalDate localDate2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderDatePicker(activeDatePicker, localDate, localDate2, function1, function12, function13, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uTjsFkcjis1E8Ye2zvxZgEcZXto(com.paypal.pds.components.SingleDateCalendarState singleDateCalendarState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0) {
        java.time.LocalDate selectedDate = singleDateCalendarState.getSelectedDate();
        if (selectedDate != null) {
            function1.invoke(selectedDate);
        }
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ufjr5feZlAuU439nXTOvFBzO4Ig(java.time.LocalDate localDate, java.time.LocalDate localDate2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(localDate, localDate2, function1, function12, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker.FROM_DATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker.TO_DATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
