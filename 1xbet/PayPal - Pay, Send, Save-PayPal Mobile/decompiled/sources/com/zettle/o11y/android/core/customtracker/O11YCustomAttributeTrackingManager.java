package com.zettle.o11y.android.core.customtracker;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u0019\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u000bJ\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u000bJ\u0019\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u000bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/zettle/o11y/android/core/customtracker/O11YCustomAttributeTrackingManager;", "Lcom/zettle/o11y/android/core/customtracker/O11YCustomAttributeTrackingInterface;", "Lcom/zettle/o11y/android/core/customtracker/O11YCustomLogInterface;", "Lcom/datadog/android/api/SdkCore;", "ddInstance", "<init>", "(Lcom/datadog/android/api/SdkCore;)V", "", "message", "", "addAction", "(Ljava/lang/String;)V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "addError", "(Ljava/lang/Throwable;)V", "keyName", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "trackAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", "buildNumber", "trackBuildNumber", "organizationUUID", "trackOrganizationUUID", "userId", "trackUserId", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "trackUserUUID", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/SdkCore;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class O11YCustomAttributeTrackingManager implements com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingInterface, com.zettle.o11y.android.core.customtracker.O11YCustomLogInterface {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.SdkCore getHighSpeedVideoFpsRangesFor;

    public O11YCustomAttributeTrackingManager(com.datadog.android.api.SdkCore sdkCore) {
        this.getHighSpeedVideoFpsRangesFor = sdkCore;
    }

    @Override // com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingInterface
    public final void trackBuildNumber(java.lang.String buildNumber) {
        com.datadog.android.api.SdkCore sdkCore = this.getHighSpeedVideoFpsRangesFor;
        if (sdkCore == null) {
            return;
        }
        com.datadog.android.rum.GlobalRumMonitor.get(sdkCore).addAttribute("BuildNumber", buildNumber);
    }

    @Override // com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingInterface
    public final void trackUserId(java.lang.String userId) {
        java.lang.String str;
        if (this.getHighSpeedVideoFpsRangesFor == null || (str = userId) == null || str.length() == 0) {
            return;
        }
        com.datadog.android.api.SdkCore.DefaultImpls.setUserInfo$default(this.getHighSpeedVideoFpsRangesFor, userId, null, null, null, 14, null);
        com.datadog.android.rum.GlobalRumMonitor.get(this.getHighSpeedVideoFpsRangesFor).addAttribute("UserId", userId);
    }

    @Override // com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingInterface
    public final void trackUserUUID(java.lang.String uuid) {
        com.datadog.android.api.SdkCore sdkCore = this.getHighSpeedVideoFpsRangesFor;
        if (sdkCore == null) {
            return;
        }
        com.datadog.android.rum.GlobalRumMonitor.get(sdkCore).addAttribute("UserUUID", uuid);
    }

    @Override // com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingInterface
    public final void trackOrganizationUUID(java.lang.String organizationUUID) {
        com.datadog.android.api.SdkCore sdkCore = this.getHighSpeedVideoFpsRangesFor;
        if (sdkCore == null) {
            return;
        }
        com.datadog.android.rum.GlobalRumMonitor.get(sdkCore).addAttribute("OrganizationUUID", organizationUUID);
    }

    @Override // com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingInterface
    public final void trackAttribute(java.lang.String keyName, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        com.datadog.android.api.SdkCore sdkCore = this.getHighSpeedVideoFpsRangesFor;
        if (sdkCore == null) {
            return;
        }
        com.datadog.android.rum.GlobalRumMonitor.get(sdkCore).addAttribute(keyName, value);
    }

    @Override // com.zettle.o11y.android.core.customtracker.O11YCustomLogInterface
    public final void addError(java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        com.datadog.android.api.SdkCore sdkCore = this.getHighSpeedVideoFpsRangesFor;
        if (sdkCore == null) {
            return;
        }
        com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(sdkCore);
        java.lang.String message = throwable.getMessage();
        if (message == null) {
            message = "Actionable error logged";
        }
        rumMonitor.addError(message, com.datadog.android.rum.RumErrorSource.SOURCE, throwable, kotlin.collections.MapsKt.emptyMap());
    }

    @Override // com.zettle.o11y.android.core.customtracker.O11YCustomLogInterface
    public final void addAction(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        com.datadog.android.api.SdkCore sdkCore = this.getHighSpeedVideoFpsRangesFor;
        if (sdkCore == null) {
            return;
        }
        com.datadog.android.rum.GlobalRumMonitor.get(sdkCore).addAction(com.datadog.android.rum.RumActionType.CUSTOM, message, kotlin.collections.MapsKt.emptyMap());
    }
}
