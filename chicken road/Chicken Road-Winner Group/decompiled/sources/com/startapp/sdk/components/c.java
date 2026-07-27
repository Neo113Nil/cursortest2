package com.startapp.sdk.components;

import g2.C0318b;
import g2.C0320d;
import g2.InterfaceC0321e;
import g2.InterfaceC0322f;
import g2.h;
import g2.i;
import kotlin.jvm.internal.j;
import o2.p;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3381a;

    public /* synthetic */ c(int i3) {
        this.f3381a = i3;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        C0318b c0318b;
        switch (this.f3381a) {
            case 0:
                return a.a((String) obj, (String) obj2);
            case 1:
                String acc = (String) obj;
                InterfaceC0322f element = (InterfaceC0322f) obj2;
                j.e(acc, "acc");
                j.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                h acc2 = (h) obj;
                InterfaceC0322f element2 = (InterfaceC0322f) obj2;
                j.e(acc2, "acc");
                j.e(element2, "element");
                h g3 = acc2.g(element2.getKey());
                i iVar = i.f4981a;
                if (g3 == iVar) {
                    return element2;
                }
                C0320d c0320d = C0320d.f4980a;
                InterfaceC0321e interfaceC0321e = (InterfaceC0321e) g3.k(c0320d);
                if (interfaceC0321e == null) {
                    c0318b = new C0318b(g3, element2);
                } else {
                    h g4 = g3.g(c0320d);
                    if (g4 == iVar) {
                        return new C0318b(element2, interfaceC0321e);
                    }
                    c0318b = new C0318b(new C0318b(g4, element2), interfaceC0321e);
                }
                return c0318b;
        }
    }
}
