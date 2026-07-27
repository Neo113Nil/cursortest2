package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class M implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Li f6262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f6263c;

    public M(N n3, Context context, Li li) {
        this.f6263c = n3;
        this.f6261a = context;
        this.f6262b = li;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f6263c.f6307a.a(this.f6261a, this.f6262b);
    }
}
