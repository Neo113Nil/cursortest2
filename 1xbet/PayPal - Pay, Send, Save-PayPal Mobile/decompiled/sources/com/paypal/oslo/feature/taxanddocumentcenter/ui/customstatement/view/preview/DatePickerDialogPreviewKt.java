package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.preview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002"}, d2 = {"", "FromDateCalendarPreview", "(Landroidx/compose/runtime/Composer;I)V", "ToDateCalendarPreview"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DatePickerDialogPreviewKt {
    /* renamed from: $r8$lambda$-UgWw80mmN9kNC-FrEj_5MqPr-M, reason: not valid java name */
    public static /* synthetic */ boolean m20347$r8$lambda$UgWw80mmN9kNCFrEj_5MqPrM(long j) {
        return true;
    }

    public static final void FromDateCalendarPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1190718652);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1190718652, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.preview.FromDateCalendarPreview (DatePickerDialogPreview.kt:29)");
            }
            java.time.LocalDate defaultFromDate = com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils.INSTANCE.getDefaultFromDate();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.preview.DatePickerDialogPreviewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.preview.DatePickerDialogPreviewKt.m20347$r8$lambda$UgWw80mmN9kNCFrEj_5MqPrM(((java.lang.Long) obj).longValue()));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.CalendarKt.Calendar(com.paypal.pds.components.CalendarKt.rememberSingleDateCalendarState(defaultFromDate, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4), (androidx.compose.ui.Modifier) null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.preview.DatePickerDialogPreviewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.preview.DatePickerDialogPreviewKt.$r8$lambda$5ScKugMssvSN8O3csFxNFso9OaA(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ToDateCalendarPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1659706453);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1659706453, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.preview.ToDateCalendarPreview (DatePickerDialogPreview.kt:47)");
            }
            java.time.LocalDate of = java.time.LocalDate.of(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.FIRST_YEAR, 1, 1);
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils dateRangeUtils = com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.DateRangeUtils.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(of);
            com.paypal.pds.components.CalendarKt.Calendar(com.paypal.pds.components.CalendarKt.rememberSingleDateCalendarState(of, dateRangeUtils.createToDateSelectablePredicate(of), null, startRestartGroup, 0, 4), (androidx.compose.ui.Modifier) null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.preview.DatePickerDialogPreviewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.preview.DatePickerDialogPreviewKt.$r8$lambda$SGTMg_1EYQpNeuTPaWiMZDaLQ3A(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5ScKugMssvSN8O3csFxNFso9OaA(int i, androidx.compose.runtime.Composer composer, int i2) {
        FromDateCalendarPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SGTMg_1EYQpNeuTPaWiMZDaLQ3A(int i, androidx.compose.runtime.Composer composer, int i2) {
        ToDateCalendarPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
