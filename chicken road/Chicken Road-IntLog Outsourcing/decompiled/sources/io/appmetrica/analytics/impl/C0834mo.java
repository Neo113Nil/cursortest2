package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* renamed from: io.appmetrica.analytics.impl.mo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0834mo implements NetworkTask.ShouldTryNextHostCondition {
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkTask.ShouldTryNextHostCondition
    public final boolean shouldTryNextHost(int i2) {
        return !(i2 == 400);
    }
}
