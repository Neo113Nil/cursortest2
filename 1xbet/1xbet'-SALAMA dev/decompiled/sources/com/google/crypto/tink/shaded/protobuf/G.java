package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f11717c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List d(long j, Object obj, int i7) {
        List list;
        List listA;
        List list2 = (List) o0.f11810c.i(j, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof F) {
                listA = new E(i7);
            } else {
                listA = ((list2 instanceof Y) && (list2 instanceof InterfaceC0845z)) ? ((InterfaceC0845z) list2).a(i7) : new ArrayList(i7);
            }
            o0.v(obj, j, listA);
            return listA;
        }
        if (f11717c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i7);
            arrayList.addAll(list2);
            o0.v(obj, j, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof j0)) {
                if (!(list2 instanceof Y) || !(list2 instanceof InterfaceC0845z)) {
                    return list2;
                }
                InterfaceC0845z interfaceC0845z = (InterfaceC0845z) list2;
                if (((AbstractC0822b) interfaceC0845z).f11754a) {
                    return list2;
                }
                InterfaceC0845z interfaceC0845zA = interfaceC0845z.a(list2.size() + i7);
                o0.v(obj, j, interfaceC0845zA);
                return interfaceC0845zA;
            }
            E e7 = new E(list2.size() + i7);
            e7.addAll((j0) list2);
            o0.v(obj, j, e7);
            list = e7;
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) o0.f11810c.i(j, obj);
        if (list instanceof F) {
            objUnmodifiableList = ((F) list).c();
        } else {
            if (f11717c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof Y) && (list instanceof InterfaceC0845z)) {
                AbstractC0822b abstractC0822b = (AbstractC0822b) ((InterfaceC0845z) list);
                if (abstractC0822b.f11754a) {
                    abstractC0822b.f11754a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        o0.v(obj, j, objUnmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) o0.f11810c.i(j, obj2);
        List listD = d(j, obj, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        o0.v(obj, j, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}
