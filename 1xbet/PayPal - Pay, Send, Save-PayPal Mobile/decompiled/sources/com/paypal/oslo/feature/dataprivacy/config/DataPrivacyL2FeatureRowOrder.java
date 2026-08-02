package com.paypal.oslo.feature.dataprivacy.config;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyL2FeatureRowOrder;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2Settings;", "l2Options", "Ljava/util/List;", "getL2Options", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataPrivacyL2FeatureRowOrder {
    public static final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2FeatureRowOrder INSTANCE = new com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2FeatureRowOrder();
    private static final java.util.List<com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings> l2Options = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings[]{com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.DOWNLOAD_YOUR_DATA, com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.DELETE_YOUR_DATA, com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.FACE_SCAN_DATA});
    public static final int $stable = 8;

    private DataPrivacyL2FeatureRowOrder() {
    }

    public final java.util.List<com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings> getL2Options() {
        return l2Options;
    }
}
