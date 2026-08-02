package com.plaid.internal;

/* renamed from: com.plaid.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0612p3 implements dagger.internal.Factory<android.content.res.Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f6529a;

    public C0612p3(com.plaid.internal.C0504d3 c0504d3, dagger.internal.Factory factory) {
        this.f6529a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        android.app.Application application = (android.app.Application) this.f6529a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        android.content.res.Resources resources = application.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
        return (android.content.res.Resources) dagger.internal.Preconditions.checkNotNullFromProvides(resources);
    }
}
