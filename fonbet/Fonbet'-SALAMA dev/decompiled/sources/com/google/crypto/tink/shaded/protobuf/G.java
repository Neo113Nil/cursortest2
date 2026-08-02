package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class G extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f11717c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(long j, Object obj, int i7) {
        E e7;
        List list = (List) o0.f11810c.i(j, obj);
        if (list.isEmpty()) {
            List e8 = list instanceof F ? new E(i7) : ((list instanceof Y) && (list instanceof InterfaceC0889z)) ? ((InterfaceC0889z) list).a(i7) : new ArrayList(i7);
            o0.v(obj, j, e8);
            return e8;
        }
        if (f11717c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            o0.v(obj, j, arrayList);
            e7 = arrayList;
        } else {
            if (!(list instanceof j0)) {
                if (!(list instanceof Y) || !(list instanceof InterfaceC0889z)) {
                    return list;
                }
                InterfaceC0889z interfaceC0889z = (InterfaceC0889z) list;
                if (((AbstractC0866b) interfaceC0889z).f11754a) {
                    return list;
                }
                InterfaceC0889z a2 = interfaceC0889z.a(list.size() + i7);
                o0.v(obj, j, a2);
                return a2;
            }
            E e9 = new E(list.size() + i7);
            e9.addAll((j0) list);
            o0.v(obj, j, e9);
            e7 = e9;
        }
        return e7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) o0.f11810c.i(j, obj);
        if (list instanceof F) {
            unmodifiableList = ((F) list).c();
        } else {
            if (f11717c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof Y) && (list instanceof InterfaceC0889z)) {
                AbstractC0866b abstractC0866b = (AbstractC0866b) ((InterfaceC0889z) list);
                if (abstractC0866b.f11754a) {
                    abstractC0866b.f11754a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        o0.v(obj, j, unmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) o0.f11810c.i(j, obj2);
        List d7 = d(j, obj, list.size());
        int size = d7.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d7.addAll(list);
        }
        if (size > 0) {
            list = d7;
        }
        o0.v(obj, j, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}
