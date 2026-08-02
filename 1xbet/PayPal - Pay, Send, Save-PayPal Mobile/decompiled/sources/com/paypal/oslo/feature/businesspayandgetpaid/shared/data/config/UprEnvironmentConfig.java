package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/config/UprEnvironmentConfig;", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "", "getBaseUrl", "()Ljava/lang/String;", "baseUrl", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UprEnvironmentConfig implements com.paypal.oslo.core.network.rest.config.RestConfig {
    public static final java.lang.String UPR_PURCHASE_PRODUCTION_BASE_URL = "https://upr-purchase-us-east-1.izettle.com/";
    public static final java.lang.String UPR_PURCHASE_TEST_BASE_URL = "https://upr-purchase-us-east-1.izettletest.com/";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public UprEnvironmentConfig(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @Override // com.paypal.oslo.core.network.rest.config.RestConfig
    public final java.lang.String getBaseUrl() {
        if (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfigKt.isDebugBuild(this.getHighSpeedVideoFpsRangesFor)) {
            return UPR_PURCHASE_TEST_BASE_URL;
        }
        return UPR_PURCHASE_PRODUCTION_BASE_URL;
    }
}
