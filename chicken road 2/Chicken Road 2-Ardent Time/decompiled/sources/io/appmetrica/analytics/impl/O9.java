package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class O9 extends io.appmetrica.analytics.impl.Q9 {
    @Override // io.appmetrica.analytics.impl.Q9
    @android.annotation.TargetApi(24)
    public final io.appmetrica.analytics.impl.R9 b(android.content.pm.FeatureInfo featureInfo) {
        return new io.appmetrica.analytics.impl.R9(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
