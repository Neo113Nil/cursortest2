package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/DateOfBirthViewComponentContentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/DateOfBirthViewComponentAttacher;", "", "maskedDate", "editableDigits", "Lkotlin/Function1;", "", "onDigitsChange", "", "onSetEditingMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;", "config", "onDateChange", "errorMessage", "Landroidx/compose/ui/Modifier;", "modifier", "Attach", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateOfBirthViewComponentContentAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentAttacher {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public DateOfBirthViewComponentContentAttacher(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = function12;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentAttacher
    public final void Attach(final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig dateOfBirthViewComponentConfig, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final java.lang.String str, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1297018059);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(dateOfBirthViewComponentConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(this) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1297018059, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentContentAttacher.Attach (DateOfBirthViewComponentAttacher.kt:57)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentContentKt.DateOfBirthViewComponentContent(dateOfBirthViewComponentConfig, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, function1, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, modifier, str, startRestartGroup, (i2 & 14) | ((i2 << 6) & 7168) | ((i2 << 9) & 3670016) | ((i2 << 15) & 29360128), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentContentAttacher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentContentAttacher.$r8$lambda$panp3B4B3tqStsjqomNVH5in_xE(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentContentAttacher.this, dateOfBirthViewComponentConfig, function1, str, modifier, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$panp3B4B3tqStsjqomNVH5in_xE(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentContentAttacher dateOfBirthViewComponentContentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig dateOfBirthViewComponentConfig, kotlin.jvm.functions.Function1 function1, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, androidx.compose.runtime.Composer composer, int i2) {
        dateOfBirthViewComponentContentAttacher.Attach(dateOfBirthViewComponentConfig, function1, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
