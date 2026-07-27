package io.appmetrica.analytics.impl;

import android.content.Context;
import d2.C0277g;
import d2.InterfaceC0273c;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.in, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580in implements InterfaceC0841t {

    /* renamed from: b, reason: collision with root package name */
    public final C0893v f7553b;

    /* renamed from: a, reason: collision with root package name */
    public final C0867u f7552a = new C0867u();

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0273c f7554c = new C0277g(new C0555hn(this));

    public C0580in(Context context) {
        this.f7553b = new C0893v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0841t
    public final Map<String, String> a(Map<String, String> map) {
        map.putAll((Map) ((C0277g) this.f7554c).a());
        return map;
    }
}
