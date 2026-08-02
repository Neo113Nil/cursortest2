package com.paypal.oslo.feature.oneonboarding.inventory.views.address.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressCollectionHalfSheetNoOpAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressCollectionHalfSheetAttacher;", "<init>", "()V", "Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressCollectionConfig;", "config", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "", "onAddressConfirm", "onUnverifiedAddressUse", "Lkotlin/Function0;", "onDismiss", "Attach", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressCollectionConfig;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressCollectionHalfSheetNoOpAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressCollectionHalfSheetAttacher {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressCollectionHalfSheetAttacher
    public final void Attach(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectionConfig addressCollectionConfig, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressCollectionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1580132212);
        int i2 = i & 1;
        if (startRestartGroup.shouldExecute(i2 != 0, i2)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1580132212, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressCollectionHalfSheetNoOpAttacher.Attach (AddressCollectionHalfSheetAttacher.kt:88)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressCollectionHalfSheetNoOpAttacher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressCollectionHalfSheetNoOpAttacher.m16895$r8$lambda$paKVdGGmDAvAlMtnv2TTvKUV4o(com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressCollectionHalfSheetNoOpAttacher.this, bottomSheetController, addressCollectionConfig, userIntentContext, function1, function12, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$paKVdGGm-DAvAlMtnv2TTvKUV4o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16895$r8$lambda$paKVdGGmDAvAlMtnv2TTvKUV4o(com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressCollectionHalfSheetNoOpAttacher addressCollectionHalfSheetNoOpAttacher, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectionConfig addressCollectionConfig, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        addressCollectionHalfSheetNoOpAttacher.Attach(bottomSheetController, addressCollectionConfig, userIntentContext, function1, function12, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
