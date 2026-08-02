package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "", "isUnchanged", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessInventoryEditViewModelKt {
    public static final boolean isUnchanged(com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData, com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
        if (flowType instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create) {
            return kotlin.jvm.internal.Intrinsics.areEqual(formData.getName(), "") && formData.getPrice().getValue() == 0 && kotlin.jvm.internal.Intrinsics.areEqual(formData.getDescription(), "") && formData.getTaxOption() == null;
        }
        if (!(flowType instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit edit = (com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit) flowType;
        if (kotlin.jvm.internal.Intrinsics.areEqual(formData.getName(), edit.getLibraryItem().getName()) && formData.getPrice().getValue() == edit.getLibraryItem().getPrice().getValue()) {
            java.lang.String description = formData.getDescription();
            java.lang.String description2 = edit.getLibraryItem().getDescription();
            if (kotlin.jvm.internal.Intrinsics.areEqual(description, description2 != null ? description2 : "")) {
                com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = formData.getTaxOption();
                java.lang.String id = taxOption != null ? taxOption.getId() : null;
                com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption2 = edit.getLibraryItem().getTaxOption();
                if (kotlin.jvm.internal.Intrinsics.areEqual(id, taxOption2 != null ? taxOption2.getId() : null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
