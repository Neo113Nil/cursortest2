package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Hg implements U7 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0634f5 f6880a;

    public Hg(InterfaceC0634f5 interfaceC0634f5) {
        this.f6880a = interfaceC0634f5;
    }

    @Override // io.appmetrica.analytics.impl.U7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Gg a(Context context, X4 x42, C1073w4 c1073w4) {
        return new Gg(context, x42, c1073w4, this.f6880a, new Y4(), Ll.a());
    }

    public final InterfaceC0634f5 a() {
        return this.f6880a;
    }
}
