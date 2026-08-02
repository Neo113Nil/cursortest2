package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "nameAddressConfig", "Landroidx/compose/runtime/MutableState;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "selectedAddressState", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressCollectionStateHolder;", "addressCollectionStateHolder", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/NameAddressState;", "rememberNameAddressState", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;Landroidx/compose/runtime/MutableState;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressCollectionStateHolder;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/NameAddressState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameAddressStateKt {
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState rememberNameAddressState(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, androidx.compose.runtime.MutableState<com.paypal.oslo.core.i18n.domain.model.Address> mutableState, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder addressCollectionStateHolder, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressCollectionStateHolder, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-802857478, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.rememberNameAddressState (NameAddressState.kt:90)");
        }
        boolean changed = composer.changed(nameAddressViewComponentConfig);
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(mutableState)) || (i & 48) == 32;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState(nameAddressViewComponentConfig, mutableState, addressCollectionStateHolder);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState nameAddressState = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return nameAddressState;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionVariant access$toAddressSelectionVariant(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant) {
        int i = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressStateKt.WhenMappings.$EnumSwitchMapping$0[nameAddressVariant.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionVariant.PRIMARY_USER;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionVariant.UNKNOWN__;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant.PRIMARY_USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant.UNKNOWN__.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
