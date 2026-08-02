package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiMapper;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewContentProvider;", "contentProvider", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewContentProvider;)V", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FormattedAddressOverviewItem;", "formattedAddressOverviewItems", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiModel;", "toUiModel", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiModel;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewContentProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressOverviewUiMapper {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewContentProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AddressOverviewUiMapper(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewContentProvider addressOverviewContentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressOverviewContentProvider, "");
        this.Camera2StreamConfigurationMap = addressOverviewContentProvider;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel toUiModel(java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem> formattedAddressOverviewItems) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAddressOverviewItems, "");
        java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem> list = formattedAddressOverviewItems;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem formattedAddressOverviewItem = (com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem) obj;
            arrayList.add(new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel(java.lang.String.valueOf(i), formattedAddressOverviewItem.getLine1(), formattedAddressOverviewItem.getLine2(), i == 0, formattedAddressOverviewItem.getAddress()));
            i++;
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel addressItemUiModel = (com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel(arrayList2, addressItemUiModel != null ? addressItemUiModel.getId() : null, this.Camera2StreamConfigurationMap.getTitle(), this.Camera2StreamConfigurationMap.getAddNewAddressButtonText(), this.Camera2StreamConfigurationMap.getDoneButtonText(), this.Camera2StreamConfigurationMap.getToolBarContent());
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
