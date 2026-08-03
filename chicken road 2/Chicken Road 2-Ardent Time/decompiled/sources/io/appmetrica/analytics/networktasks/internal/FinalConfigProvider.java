package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class FinalConfigProvider<T> implements io.appmetrica.analytics.networktasks.internal.ConfigProvider<T> {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Object f7393a;

    public FinalConfigProvider(T t) {
        this.f7393a = t;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    public T getConfig() {
        return (T) this.f7393a;
    }
}
