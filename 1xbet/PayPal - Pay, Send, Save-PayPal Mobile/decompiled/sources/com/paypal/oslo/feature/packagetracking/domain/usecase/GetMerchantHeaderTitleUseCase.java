package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetMerchantHeaderTitleUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;", "packageData", "invoke", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;)Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetMerchantHeaderTitleUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GetMerchantHeaderTitleUseCase() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.packagetracking.domain.model.PackageData invoke(com.paypal.oslo.feature.packagetracking.domain.model.PackageData packageData) {
        com.paypal.oslo.feature.packagetracking.domain.UiString uiString;
        java.lang.String name2;
        com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString plainString;
        java.util.Iterator<T> it;
        com.paypal.oslo.feature.packagetracking.domain.model.PackageData copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageData, "");
        java.lang.String packageNickname = packageData.getPackageNickname();
        if (packageNickname == null) {
            com.paypal.oslo.feature.packagetracking.domain.model.Merchant merchant = packageData.getMerchant();
            if (merchant == null || (name2 = merchant.getName()) == null) {
                uiString = null;
            } else {
                if (kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) name2, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, 0, false, 6, (java.lang.Object) null) != -1 && (name2.length() - r3) - 1 >= 2) {
                    plainString = new com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString(name2);
                } else {
                    uiString = new com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_merchant_order, new java.lang.String[]{name2});
                }
            }
            it = packageData.getItems().iterator();
            int i = 0;
            while (it.hasNext()) {
                java.lang.Integer quantity = ((com.paypal.oslo.feature.packagetracking.domain.model.Item) it.next()).getQuantity();
                i += quantity != null ? quantity.intValue() : 0;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
            copy = packageData.copy((r45 & 1) != 0 ? packageData.id : null, (r45 & 2) != 0 ? packageData.trackingNumber : null, (r45 & 4) != 0 ? packageData.trackingNumberHashed : null, (r45 & 8) != 0 ? packageData.carrierId : null, (r45 & 16) != 0 ? packageData.carrier : null, (r45 & 32) != 0 ? packageData.transactionNumber : null, (r45 & 64) != 0 ? packageData.status : null, (r45 & 128) != 0 ? packageData.estimatedDeliveryDate : null, (r45 & 256) != 0 ? packageData.estimatedDeliveryDateDisplayText : null, (r45 & 512) != 0 ? packageData.deliveryDate : null, (r45 & 1024) != 0 ? packageData.trackingUrl : null, (r45 & 2048) != 0 ? packageData.events : null, (r45 & 4096) != 0 ? packageData.destinationAddress : null, (r45 & 8192) != 0 ? packageData.markedAsDelivered : false, (r45 & 16384) != 0 ? packageData.packageNickname : null, (r45 & 32768) != 0 ? packageData.orderNumber : null, (r45 & 65536) != 0 ? packageData.orderManagementUrl : null, (r45 & 131072) != 0 ? packageData.items : null, (r45 & 262144) != 0 ? packageData.merchant : null, (r45 & 524288) != 0 ? packageData.tags : null, (r45 & 1048576) != 0 ? packageData.packageSource : null, (r45 & 2097152) != 0 ? packageData.displayHeaderText : uiString, (r45 & 4194304) != 0 ? packageData.displayItemCount : valueOf.intValue() <= 0 ? valueOf : null, (r45 & 8388608) != 0 ? packageData.hasMultipleShipments : false, (r45 & 16777216) != 0 ? packageData.linkedEmailProvider : null, (r45 & 33554432) != 0 ? packageData.exceptionSummary : null, (r45 & 67108864) != 0 ? packageData.exceptionDetails : null);
            return copy;
        }
        plainString = new com.paypal.oslo.feature.packagetracking.domain.UiString.PlainString(packageNickname);
        uiString = plainString;
        it = packageData.getItems().iterator();
        int i2 = 0;
        while (it.hasNext()) {
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i2);
        copy = packageData.copy((r45 & 1) != 0 ? packageData.id : null, (r45 & 2) != 0 ? packageData.trackingNumber : null, (r45 & 4) != 0 ? packageData.trackingNumberHashed : null, (r45 & 8) != 0 ? packageData.carrierId : null, (r45 & 16) != 0 ? packageData.carrier : null, (r45 & 32) != 0 ? packageData.transactionNumber : null, (r45 & 64) != 0 ? packageData.status : null, (r45 & 128) != 0 ? packageData.estimatedDeliveryDate : null, (r45 & 256) != 0 ? packageData.estimatedDeliveryDateDisplayText : null, (r45 & 512) != 0 ? packageData.deliveryDate : null, (r45 & 1024) != 0 ? packageData.trackingUrl : null, (r45 & 2048) != 0 ? packageData.events : null, (r45 & 4096) != 0 ? packageData.destinationAddress : null, (r45 & 8192) != 0 ? packageData.markedAsDelivered : false, (r45 & 16384) != 0 ? packageData.packageNickname : null, (r45 & 32768) != 0 ? packageData.orderNumber : null, (r45 & 65536) != 0 ? packageData.orderManagementUrl : null, (r45 & 131072) != 0 ? packageData.items : null, (r45 & 262144) != 0 ? packageData.merchant : null, (r45 & 524288) != 0 ? packageData.tags : null, (r45 & 1048576) != 0 ? packageData.packageSource : null, (r45 & 2097152) != 0 ? packageData.displayHeaderText : uiString, (r45 & 4194304) != 0 ? packageData.displayItemCount : valueOf2.intValue() <= 0 ? valueOf2 : null, (r45 & 8388608) != 0 ? packageData.hasMultipleShipments : false, (r45 & 16777216) != 0 ? packageData.linkedEmailProvider : null, (r45 & 33554432) != 0 ? packageData.exceptionSummary : null, (r45 & 67108864) != 0 ? packageData.exceptionDetails : null);
        return copy;
    }
}
