package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000bJ3\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/sdk/TapToPaySDKManager;", "", "", "zettleAuthCode", "", "initialize", "(Ljava/lang/String;)V", "Landroid/content/Context;", "applicationContext", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;", "isRunningOnRemoteProcess", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;", "context", "checkDeviceSupport", "checkDeviceCapability", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "", "amount", "Larrow/core/Either;", "", "Landroid/content/Intent;", "createPaymentIntent", "(Landroid/content/Context;Ljava/lang/String;J)Larrow/core/Either;", "logout", "()V", "", "isInitialized", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TapToPaySDKManager {
    com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult checkDeviceCapability(android.content.Context context);

    com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult checkDeviceSupport(android.content.Context context);

    arrow.core.Either<java.lang.Throwable, android.content.Intent> createPaymentIntent(android.content.Context context, java.lang.String uuid, long amount);

    void initialize(java.lang.String zettleAuthCode);

    boolean isInitialized();

    com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult isRunningOnRemoteProcess(android.content.Context applicationContext);

    void logout();
}
