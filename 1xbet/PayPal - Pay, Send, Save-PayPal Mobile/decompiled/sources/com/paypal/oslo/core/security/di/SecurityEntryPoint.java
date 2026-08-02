package com.paypal.oslo.core.security.di;

@dagger.hilt.android.EarlyEntryPoint
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/security/di/SecurityEntryPoint;", "Lcom/paypal/oslo/core/di/CoreEntryPoint;", "Lcom/paypal/oslo/core/security/initializer/RiskDataConfigurator;", "riskDataConfigurator", "()Lcom/paypal/oslo/core/security/initializer/RiskDataConfigurator;", "Ljava/util/concurrent/CountDownLatch;", "securitySetupLatch", "()Ljava/util/concurrent/CountDownLatch;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SecurityEntryPoint extends com.paypal.oslo.core.di.CoreEntryPoint {
    com.paypal.oslo.core.security.initializer.RiskDataConfigurator riskDataConfigurator();

    java.util.concurrent.CountDownLatch securitySetupLatch();
}
