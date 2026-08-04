package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class S extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f12147c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List d(long j, Object obj, int i7) {
        List list;
        List listA;
        List list2 = (List) K0.f12117c.k(j, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof Q) {
                listA = new P(i7);
            } else {
                listA = ((list2 instanceof InterfaceC0870l0) && (list2 instanceof J)) ? ((J) list2).a(i7) : new ArrayList(i7);
            }
            K0.s(obj, j, listA);
            return listA;
        }
        if (f12147c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i7);
            arrayList.addAll(list2);
            K0.s(obj, j, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof F0)) {
                if (!(list2 instanceof InterfaceC0870l0) || !(list2 instanceof J)) {
                    return list2;
                }
                J j3 = (J) list2;
                if (((AbstractC0849b) j3).f12176a) {
                    return list2;
                }
                J jA = j3.a(list2.size() + i7);
                K0.s(obj, j, jA);
                return jA;
            }
            P p5 = new P(list2.size() + i7);
            p5.addAll((F0) list2);
            K0.s(obj, j, p5);
            list = p5;
        }
        return list;
    }

    @Override // com.google.protobuf.U
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) K0.f12117c.k(j, obj);
        if (list instanceof Q) {
            objUnmodifiableList = ((Q) list).c();
        } else {
            if (f12147c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC0870l0) && (list instanceof J)) {
                AbstractC0849b abstractC0849b = (AbstractC0849b) ((J) list);
                boolean z4 = abstractC0849b.f12176a;
                if (z4 && z4) {
                    abstractC0849b.f12176a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        K0.s(obj, j, objUnmodifiableList);
    }

    @Override // com.google.protobuf.U
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) K0.f12117c.k(j, obj2);
        List listD = d(j, obj, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        K0.s(obj, j, list);
    }

    @Override // com.google.protobuf.U
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}
