package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class r1 extends com.fyber.inneractive.sdk.protobuf.t1 {
    public static final java.lang.Class c = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(java.lang.Object obj, long j) {
        java.lang.Object unmodifiableList;
        java.util.List list = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
        if (list instanceof com.fyber.inneractive.sdk.protobuf.q1) {
            unmodifiableList = ((com.fyber.inneractive.sdk.protobuf.q1) list).a();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.fyber.inneractive.sdk.protobuf.n2) && (list instanceof com.fyber.inneractive.sdk.protobuf.k1)) {
                com.fyber.inneractive.sdk.protobuf.c cVar = (com.fyber.inneractive.sdk.protobuf.c) ((com.fyber.inneractive.sdk.protobuf.k1) list);
                if (cVar.f4180a) {
                    cVar.f4180a = false;
                    return;
                }
                return;
            }
            unmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, unmodifiableList);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final java.util.List b(java.lang.Object obj, long j) {
        return a(obj, j, 10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(long j, java.lang.Object obj, java.lang.Object obj2) {
        java.util.List list = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j);
        java.util.List a2 = a(obj, j, list.size());
        int size = a2.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            a2.addAll(list);
        }
        if (size > 0) {
            list = a2;
        }
        com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List a(java.lang.Object obj, long j, int i) {
        com.fyber.inneractive.sdk.protobuf.p1 p1Var;
        java.util.List arrayList;
        java.util.List list = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
        if (list.isEmpty()) {
            if (list instanceof com.fyber.inneractive.sdk.protobuf.q1) {
                arrayList = new com.fyber.inneractive.sdk.protobuf.p1(i);
            } else if ((list instanceof com.fyber.inneractive.sdk.protobuf.n2) && (list instanceof com.fyber.inneractive.sdk.protobuf.k1)) {
                arrayList = ((com.fyber.inneractive.sdk.protobuf.k1) list).b(i);
            } else {
                arrayList = new java.util.ArrayList(i);
            }
            com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(list.getClass())) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size() + i);
            arrayList2.addAll(list);
            com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, arrayList2);
            p1Var = arrayList2;
        } else if (list instanceof com.fyber.inneractive.sdk.protobuf.r3) {
            com.fyber.inneractive.sdk.protobuf.p1 p1Var2 = new com.fyber.inneractive.sdk.protobuf.p1(list.size() + i);
            p1Var2.addAll((com.fyber.inneractive.sdk.protobuf.r3) list);
            com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, p1Var2);
            p1Var = p1Var2;
        } else {
            if (!(list instanceof com.fyber.inneractive.sdk.protobuf.n2) || !(list instanceof com.fyber.inneractive.sdk.protobuf.k1)) {
                return list;
            }
            com.fyber.inneractive.sdk.protobuf.k1 k1Var = (com.fyber.inneractive.sdk.protobuf.k1) list;
            if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
                return list;
            }
            com.fyber.inneractive.sdk.protobuf.k1 b = k1Var.b(list.size() + i);
            com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, b);
            return b;
        }
        return p1Var;
    }
}
