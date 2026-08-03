package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Q9 {
    public final io.appmetrica.analytics.impl.R9 a(android.content.pm.FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i2 = featureInfo.reqGlEsVersion;
        if (i2 == 0) {
            return b(featureInfo);
        }
        return new io.appmetrica.analytics.impl.R9("openGlFeature", i2, (featureInfo.flags & 1) != 0);
    }

    public abstract io.appmetrica.analytics.impl.R9 b(android.content.pm.FeatureInfo featureInfo);
}
