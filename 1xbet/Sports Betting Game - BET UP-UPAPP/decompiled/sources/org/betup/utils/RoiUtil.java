package org.betup.utils;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.betup.model.domain.RemoteConfigConstants;

/* loaded from: classes4.dex */
public final class RoiUtil {
    public static float getStars(float roi) {
        double d = FirebaseRemoteConfig.getInstance().getDouble(RemoteConfigConstants.STAR_LOG_BASE);
        double d2 = FirebaseRemoteConfig.getInstance().getDouble(RemoteConfigConstants.STAR_DIVIDER);
        if (roi <= 0.0f) {
            return 1.0f - (Math.abs(roi) / 100.0f);
        }
        double d3 = roi;
        if (d3 < d2 * d) {
            return 1.0f;
        }
        return (float) Math.min((Math.log(d3) / Math.log(d)) / d2, 5.0d);
    }
}
