package io.appmetrica.analytics.impl;

import a.AbstractC0169a;
import android.content.Context;
import f4.InterfaceC0428e;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.in, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729in implements InterfaceC0990t {

    /* renamed from: b, reason: collision with root package name */
    public final C1042v f8464b;

    /* renamed from: a, reason: collision with root package name */
    public final C1016u f8463a = new C1016u();

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0428e f8465c = AbstractC0169a.A(new C0704hn(this));

    public C0729in(Context context) {
        this.f8464b = new C1042v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0990t
    public final Map<String, String> a(Map<String, String> map) {
        map.putAll((Map) this.f8465c.getValue());
        return map;
    }
}
