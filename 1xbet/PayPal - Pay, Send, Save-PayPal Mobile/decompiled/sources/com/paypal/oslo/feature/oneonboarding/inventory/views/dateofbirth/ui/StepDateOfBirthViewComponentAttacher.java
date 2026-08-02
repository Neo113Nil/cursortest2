package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/StepDateOfBirthViewComponentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/ui/DateOfBirthViewComponentAttacher;", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;", "config", "Lkotlin/Function1;", "", "", "onDateChange", "errorMessage", "Landroidx/compose/ui/Modifier;", "modifier", "Attach", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepDateOfBirthViewComponentAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentAttacher {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.StepDateOfBirthViewComponentAttacher INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.StepDateOfBirthViewComponentAttacher();

    private StepDateOfBirthViewComponentAttacher() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentAttacher
    public final void Attach(final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig dateOfBirthViewComponentConfig, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final java.lang.String str, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1248408712);
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
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1248408712, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.StepDateOfBirthViewComponentAttacher.Attach (DateOfBirthViewComponentAttacher.kt:35)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentContentKt.DateOfBirthViewComponentContent(dateOfBirthViewComponentConfig, function1, modifier, str, null, startRestartGroup, (i2 & 126) | ((i2 >> 3) & 896) | ((i2 << 3) & 7168), 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.StepDateOfBirthViewComponentAttacher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.StepDateOfBirthViewComponentAttacher.$r8$lambda$hgP8KJBbxSFbb6rODB2TzAj5HfU(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.StepDateOfBirthViewComponentAttacher.this, dateOfBirthViewComponentConfig, function1, str, modifier, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hgP8KJBbxSFbb6rODB2TzAj5HfU(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.StepDateOfBirthViewComponentAttacher stepDateOfBirthViewComponentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig dateOfBirthViewComponentConfig, kotlin.jvm.functions.Function1 function1, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, androidx.compose.runtime.Composer composer, int i2) {
        stepDateOfBirthViewComponentAttacher.Attach(dateOfBirthViewComponentConfig, function1, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
