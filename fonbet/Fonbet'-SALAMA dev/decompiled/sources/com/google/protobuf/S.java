package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class S extends U {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f12147c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(long j, Object obj, int i7) {
        P p5;
        List list = (List) K0.f12117c.k(j, obj);
        if (list.isEmpty()) {
            List p7 = list instanceof Q ? new P(i7) : ((list instanceof InterfaceC0914l0) && (list instanceof J)) ? ((J) list).a(i7) : new ArrayList(i7);
            K0.s(obj, j, p7);
            return p7;
        }
        if (f12147c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            K0.s(obj, j, arrayList);
            p5 = arrayList;
        } else {
            if (!(list instanceof F0)) {
                if (!(list instanceof InterfaceC0914l0) || !(list instanceof J)) {
                    return list;
                }
                J j3 = (J) list;
                if (((AbstractC0893b) j3).f12176a) {
                    return list;
                }
                J a2 = j3.a(list.size() + i7);
                K0.s(obj, j, a2);
                return a2;
            }
            P p8 = new P(list.size() + i7);
            p8.addAll((F0) list);
            K0.s(obj, j, p8);
            p5 = p8;
        }
        return p5;
    }

    @Override // com.google.protobuf.U
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) K0.f12117c.k(j, obj);
        if (list instanceof Q) {
            unmodifiableList = ((Q) list).c();
        } else {
            if (f12147c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC0914l0) && (list instanceof J)) {
                AbstractC0893b abstractC0893b = (AbstractC0893b) ((J) list);
                boolean z4 = abstractC0893b.f12176a;
                if (z4 && z4) {
                    abstractC0893b.f12176a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        K0.s(obj, j, unmodifiableList);
    }

    @Override // com.google.protobuf.U
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) K0.f12117c.k(j, obj2);
        List d7 = d(j, obj, list.size());
        int size = d7.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d7.addAll(list);
        }
        if (size > 0) {
            list = d7;
        }
        K0.s(obj, j, list);
    }

    @Override // com.google.protobuf.U
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}
