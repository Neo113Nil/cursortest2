package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class FinalConfigProvider<T> implements ConfigProvider<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5503a;

    public FinalConfigProvider(T t2) {
        this.f5503a = t2;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    public T getConfig() {
        return (T) this.f5503a;
    }
}
