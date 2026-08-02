package com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/ui/StepNameAddressViewComponentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/ui/NameAddressViewComponentAttacher;", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "config", "Lkotlin/Function0;", "", "onEditClick", "", "errorMessage", "onInfoClick", "Landroidx/compose/ui/Modifier;", "modifier", "Attach", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepNameAddressViewComponentAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentAttacher {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.StepNameAddressViewComponentAttacher INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.StepNameAddressViewComponentAttacher();

    private StepNameAddressViewComponentAttacher() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentAttacher
    public final void Attach(final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameAddressViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-231366389);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(nameAddressViewComponentConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-231366389, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.StepNameAddressViewComponentAttacher.Attach (NameAddressViewComponentAttacher.kt:39)");
            }
            int i3 = i2 << 3;
            com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt.NameAddressViewComponentContent(nameAddressViewComponentConfig, function0, modifier, str, function02, null, null, startRestartGroup, ((i2 >> 6) & 896) | (i2 & 126) | (i3 & 7168) | (i3 & 57344), 96);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.StepNameAddressViewComponentAttacher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.StepNameAddressViewComponentAttacher.$r8$lambda$WFV7ksQSrc7QVE819OJHUawg7gY(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.StepNameAddressViewComponentAttacher.this, nameAddressViewComponentConfig, function0, str, function02, modifier, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WFV7ksQSrc7QVE819OJHUawg7gY(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.StepNameAddressViewComponentAttacher stepNameAddressViewComponentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, kotlin.jvm.functions.Function0 function0, java.lang.String str, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, androidx.compose.runtime.Composer composer, int i2) {
        stepNameAddressViewComponentAttacher.Attach(nameAddressViewComponentConfig, function0, str, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
