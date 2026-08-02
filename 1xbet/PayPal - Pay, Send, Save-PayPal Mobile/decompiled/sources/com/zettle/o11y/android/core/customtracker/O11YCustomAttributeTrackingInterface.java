package com.zettle.o11y.android.core.customtracker;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000e\u0010\nJ\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0010\u0010\n"}, d2 = {"Lcom/zettle/o11y/android/core/customtracker/O11YCustomAttributeTrackingInterface;", "", "", "keyName", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "trackAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", "buildNumber", "trackBuildNumber", "(Ljava/lang/String;)V", "organizationUUID", "trackOrganizationUUID", "userId", "trackUserId", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "trackUserUUID"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface O11YCustomAttributeTrackingInterface {
    void trackAttribute(java.lang.String keyName, java.lang.Object value);

    void trackBuildNumber(java.lang.String buildNumber);

    void trackOrganizationUUID(java.lang.String organizationUUID);

    void trackUserId(java.lang.String userId);

    void trackUserUUID(java.lang.String uuid);
}
