package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Hg implements U7 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0485f5 f6033a;

    public Hg(InterfaceC0485f5 interfaceC0485f5) {
        this.f6033a = interfaceC0485f5;
    }

    @Override // io.appmetrica.analytics.impl.U7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Gg a(Context context, X4 x4, C0924w4 c0924w4) {
        return new Gg(context, x4, c0924w4, this.f6033a, new Y4(), Ll.a());
    }

    public final InterfaceC0485f5 a() {
        return this.f6033a;
    }
}
