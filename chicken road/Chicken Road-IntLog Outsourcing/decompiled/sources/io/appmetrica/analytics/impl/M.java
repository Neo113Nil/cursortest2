package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class M implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Li f7117b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f7118c;

    public M(N n6, Context context, Li li) {
        this.f7118c = n6;
        this.f7116a = context;
        this.f7117b = li;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f7118c.f7164a.a(this.f7116a, this.f7117b);
    }
}
