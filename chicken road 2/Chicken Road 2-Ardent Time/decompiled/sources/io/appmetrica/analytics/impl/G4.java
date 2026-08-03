package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class G4 extends io.appmetrica.analytics.impl.AbstractC0581o5 {
    public G4(io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader<java.lang.Object, java.lang.Object, io.appmetrica.analytics.impl.L5> componentLoader, io.appmetrica.analytics.impl.C0365fm c0365fm, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.BaseRequestArguments<io.appmetrica.analytics.impl.C0580o4, java.lang.Object> baseRequestArguments) {
        super(componentLoader, c0365fm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0581o5
    public final void a(java.lang.Object obj) {
        io.appmetrica.analytics.impl.C0580o4 c0580o4 = (io.appmetrica.analytics.impl.C0580o4) obj;
        synchronized (this) {
            super.a((java.lang.Object) c0580o4);
        }
    }

    public final synchronized void a(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        super.a((java.lang.Object) c0580o4);
    }
}
