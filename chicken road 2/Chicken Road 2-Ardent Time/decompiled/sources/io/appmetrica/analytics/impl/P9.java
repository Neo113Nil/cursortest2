package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class P9 extends io.appmetrica.analytics.impl.Q9 {
    @Override // io.appmetrica.analytics.impl.Q9
    public final io.appmetrica.analytics.impl.R9 b(android.content.pm.FeatureInfo featureInfo) {
        return new io.appmetrica.analytics.impl.R9(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
