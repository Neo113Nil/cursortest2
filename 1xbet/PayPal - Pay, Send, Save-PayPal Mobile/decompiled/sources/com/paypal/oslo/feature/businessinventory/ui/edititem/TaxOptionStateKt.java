package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberTaxOptionState", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/TaxOptionState;", "taxOption", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;Landroidx/compose/runtime/Composer;II)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/TaxOptionState;", "business-inventory_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TaxOptionStateKt {
    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState rememberTaxOptionState(final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, androidx.compose.runtime.Composer composer, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            taxOption = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1132725994, i, -1, "com.paypal.oslo.feature.businessinventory.ui.edititem.rememberTaxOptionState (TaxOptionState.kt:61)");
        }
        java.lang.Object[] objArr = {taxOption};
        androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState, ?> saver = com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState.INSTANCE.getSaver();
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(taxOption)) && (i & 6) != 4) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionStateKt.$r8$lambda$ToP5vUStOAsyiGKwLjzeNBwSjsw(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState taxOptionState = (com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return taxOptionState;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState $r8$lambda$ToP5vUStOAsyiGKwLjzeNBwSjsw(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.TaxOptionState(taxOption);
    }
}
