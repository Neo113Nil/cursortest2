package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* loaded from: classes.dex */
public abstract class X9 {
    public final Y9 a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i3 = featureInfo.reqGlEsVersion;
        if (i3 == 0) {
            return b(featureInfo);
        }
        return new Y9("openGlFeature", i3, (featureInfo.flags & 1) != 0);
    }

    public abstract Y9 b(FeatureInfo featureInfo);
}
