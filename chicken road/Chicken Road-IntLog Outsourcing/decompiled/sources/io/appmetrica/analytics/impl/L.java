package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class L implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f7053b;

    public L(N n6, Context context) {
        this.f7053b = n6;
        this.f7052a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f7053b.f7164a.a(this.f7052a);
    }
}
