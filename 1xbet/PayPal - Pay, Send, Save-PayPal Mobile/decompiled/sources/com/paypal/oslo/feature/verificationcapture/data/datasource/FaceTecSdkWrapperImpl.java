package com.paypal.oslo.feature.verificationcapture.data.datasource;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012JS\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecSdkWrapperImpl;", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/FaceTecSdkWrapper;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/facetec/sdk/FaceTecFaceScanProcessor;", "processor", "", "sessionToken", "", "launchSession", "(Landroid/content/Context;Lcom/facetec/sdk/FaceTecFaceScanProcessor;Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/verificationcapture/util/SensorCollector;", "createSensorCollector", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/verificationcapture/util/SensorCollector;", "Lcom/paypal/oslo/feature/verificationcapture/util/BatteryMonitor;", "createBatteryMonitor", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/verificationcapture/util/BatteryMonitor;", "sensorCollector", "batteryMonitor", "sdkVersion", "appVersion", "", "retryCount", "effort", "", "activeLivenessScore", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "buildDeviceCaptureData", "(Landroid/content/Context;Lcom/paypal/oslo/feature/verificationcapture/util/SensorCollector;Lcom/paypal/oslo/feature/verificationcapture/util/BatteryMonitor;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Float;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FaceTecSdkWrapperImpl implements com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public FaceTecSdkWrapperImpl() {
    }

    @Override // com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapper
    public final void launchSession(android.content.Context context, com.facetec.sdk.FaceTecFaceScanProcessor processor, java.lang.String sessionToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionToken, "");
        com.facetec.sdk.FaceTecSessionActivity.createAndLaunchSession(context, processor, sessionToken);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapper
    public final com.paypal.oslo.feature.verificationcapture.util.SensorCollector createSensorCollector(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.feature.verificationcapture.util.SensorCollector(context);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapper
    public final com.paypal.oslo.feature.verificationcapture.util.BatteryMonitor createBatteryMonitor(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.feature.verificationcapture.util.BatteryMonitor(context);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapper
    public final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData buildDeviceCaptureData(android.content.Context context, com.paypal.oslo.feature.verificationcapture.util.SensorCollector sensorCollector, com.paypal.oslo.feature.verificationcapture.util.BatteryMonitor batteryMonitor, java.lang.String sdkVersion, java.lang.String appVersion, int retryCount, int effort, java.lang.Float activeLivenessScore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensorCollector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryMonitor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "");
        try {
            return com.paypal.oslo.feature.verificationcapture.util.DeviceCaptureDataBuilder.INSTANCE.buildForFaceTec(context, sensorCollector, batteryMonitor, sdkVersion, appVersion, retryCount, effort, activeLivenessScore);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
