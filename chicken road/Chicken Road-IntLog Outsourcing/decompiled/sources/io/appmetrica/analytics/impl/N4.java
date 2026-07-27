package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public abstract class N4 extends AbstractC1048v5 {
    public N4(BaseRequestConfig.ComponentLoader<Object, Object, S5> componentLoader, C0754jm c0754jm, BaseRequestConfig.BaseRequestArguments<C1047v4, Object> baseRequestArguments) {
        super(componentLoader, c0754jm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC1048v5
    public final void a(Object obj) {
        C1047v4 c1047v4 = (C1047v4) obj;
        synchronized (this) {
            super.a((Object) c1047v4);
        }
    }

    public final synchronized void a(C1047v4 c1047v4) {
        super.a((Object) c1047v4);
    }
}
