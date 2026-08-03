package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496ko implements io.appmetrica.analytics.networktasks.internal.NetworkTask.ShouldTryNextHostCondition {
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkTask.ShouldTryNextHostCondition
    public final boolean shouldTryNextHost(int i2) {
        return !(i2 == 400);
    }
}
