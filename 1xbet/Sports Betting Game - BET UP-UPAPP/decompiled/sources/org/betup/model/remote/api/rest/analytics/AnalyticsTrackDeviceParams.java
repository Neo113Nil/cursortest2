package org.betup.model.remote.api.rest.analytics;

import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.betup.BuildConfig;
import org.betup.model.remote.entity.analytics.TrackRequestOsType;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AnalyticsTrackDeviceParams.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lorg/betup/model/remote/api/rest/analytics/AnalyticsTrackDeviceParams;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "osTypeAndroid", "Lorg/betup/model/remote/entity/analytics/TrackRequestOsType;", "buildNumber", "", "buildVersion", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnalyticsTrackDeviceParams {
    public static final int $stable = 0;
    public static final AnalyticsTrackDeviceParams INSTANCE = new AnalyticsTrackDeviceParams();

    public final int buildNumber() {
        return BuildConfig.VERSION_CODE;
    }

    private AnalyticsTrackDeviceParams() {
    }

    public final TrackRequestOsType osTypeAndroid() {
        return TrackRequestOsType.ANDROID;
    }

    public final String buildVersion() {
        String obj = StringsKt.trim((CharSequence) BuildConfig.VERSION_NAME).toString();
        if (obj == null || obj.length() <= 0) {
            return null;
        }
        return obj;
    }
}
