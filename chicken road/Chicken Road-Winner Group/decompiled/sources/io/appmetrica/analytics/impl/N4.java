package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public abstract class N4 extends AbstractC0899v5 {
    public N4(BaseRequestConfig.ComponentLoader<Object, Object, S5> componentLoader, C0605jm c0605jm, BaseRequestConfig.BaseRequestArguments<C0898v4, Object> baseRequestArguments) {
        super(componentLoader, c0605jm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0899v5
    public final void a(Object obj) {
        C0898v4 c0898v4 = (C0898v4) obj;
        synchronized (this) {
            super.a((Object) c0898v4);
        }
    }

    public final synchronized void a(C0898v4 c0898v4) {
        super.a((Object) c0898v4);
    }
}
