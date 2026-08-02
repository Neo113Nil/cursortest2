package com.paypal.oslo.core.telemetry.di;

@dagger.hilt.android.EarlyEntryPoint
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/di/TelemetryEntryPoint;", "Lcom/paypal/oslo/core/di/CoreEntryPoint;", "Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentProvider;", "telemetryEnvironmentProvider", "()Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentProvider;", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "appIdentity", "()Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustThirdPartySharingManager;", "adjustThirdPartySharingManager", "()Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustThirdPartySharingManager;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "()Lcom/paypal/oslo/core/userstore/UserStore;", "Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "telemetryFeatureGateProvider", "()Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeIdentitiesManager;", "adobeIdentitiesManager", "()Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeIdentitiesManager;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentManager;", "adobeEnvironmentManager", "()Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TelemetryEntryPoint extends com.paypal.oslo.core.di.CoreEntryPoint {
    com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager adjustThirdPartySharingManager();

    com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager adobeEnvironmentManager();

    com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager adobeIdentitiesManager();

    com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity();

    com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentProvider telemetryEnvironmentProvider();

    com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider();

    com.paypal.oslo.core.userstore.UserStore userStore();
}
