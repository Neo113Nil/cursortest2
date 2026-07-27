package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Nb implements InterfaceC0818s2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0846t4 f6320a;

    public Nb(C0846t4 c0846t4) {
        this.f6320a = c0846t4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0818s2
    public final C0556ho a(C0504fo c0504fo, C0556ho c0556ho) {
        int i3 = c0504fo.f7314b;
        int i4 = this.f6320a.f8328a;
        if (i3 == i4) {
            if (((C0556ho) ((HashMap) c0504fo.f7313a.get(c0556ho.f7464b)).get(new String(c0556ho.f7463a))) != null) {
                ((HashMap) c0504fo.f7313a.get(c0556ho.f7464b)).put(new String(c0556ho.f7463a), c0556ho);
                return c0556ho;
            }
        } else if (i3 < i4) {
            ((HashMap) c0504fo.f7313a.get(c0556ho.f7464b)).put(new String(c0556ho.f7463a), c0556ho);
            c0504fo.f7314b++;
        }
        return c0556ho;
    }
}
