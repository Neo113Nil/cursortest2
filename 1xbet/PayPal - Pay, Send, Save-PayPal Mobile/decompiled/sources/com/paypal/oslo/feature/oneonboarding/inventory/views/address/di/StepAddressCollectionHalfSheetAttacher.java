package com.paypal.oslo.feature.oneonboarding.inventory.views.address.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/StepAddressCollectionHalfSheetAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressCollectionHalfSheetAttacher;", "<init>", "()V", "Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressCollectionConfig;", "config", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "", "onAddressConfirm", "onUnverifiedAddressUse", "Lkotlin/Function0;", "onDismiss", "Attach", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressCollectionConfig;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepAddressCollectionHalfSheetAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressCollectionHalfSheetAttacher {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressCollectionHalfSheetAttacher INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressCollectionHalfSheetAttacher();

    private StepAddressCollectionHalfSheetAttacher() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressCollectionHalfSheetAttacher
    public final void Attach(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectionConfig addressCollectionConfig, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressCollectionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2103522626);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(addressCollectionConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2103522626, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressCollectionHalfSheetAttacher.Attach (AddressCollectionHalfSheetAttacher.kt:62)");
            }
            int i3 = i2 << 6;
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt.AddressCollectionHalfSheet(bottomSheetController, addressCollectionConfig, userIntentContext, null, null, function1, function12, function0, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | (i2 & 14) | (i2 & 112) | (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 6) | (i2 & 896) | (458752 & i3) | (3670016 & i3) | (29360128 & i3), 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressCollectionHalfSheetAttacher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressCollectionHalfSheetAttacher.$r8$lambda$l2jG1X2SoPKUGWNJfxpttYnQiRo(com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressCollectionHalfSheetAttacher.this, bottomSheetController, addressCollectionConfig, userIntentContext, function1, function12, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l2jG1X2SoPKUGWNJfxpttYnQiRo(com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressCollectionHalfSheetAttacher stepAddressCollectionHalfSheetAttacher, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectionConfig addressCollectionConfig, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        stepAddressCollectionHalfSheetAttacher.Attach(bottomSheetController, addressCollectionConfig, userIntentContext, function1, function12, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
