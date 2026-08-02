package com.paypal.oslo.feature.businessinventory.domain;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/ItemLibraryAnalytics;", "", "", "isSuccessful", "", "logTaxListLoad", "(Z)V", "Lcom/paypal/oslo/feature/businessinventory/domain/ItemLibraryFlowOrigin;", "origin", "logAddNewTax", "(Lcom/paypal/oslo/feature/businessinventory/domain/ItemLibraryFlowOrigin;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ItemLibraryAnalytics {
    void logAddNewTax(com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin origin);

    void logTaxListLoad(boolean isSuccessful);
}
