package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class L implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f6198b;

    public L(N n3, Context context) {
        this.f6198b = n3;
        this.f6197a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f6198b.f6307a.a(this.f6197a);
    }
}
