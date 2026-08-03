package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class t0 implements com.fyber.inneractive.sdk.protobuf.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.protobuf.z0 f4219a;
    public com.fyber.inneractive.sdk.protobuf.z0 b;
    public boolean c = false;

    public t0(com.fyber.inneractive.sdk.protobuf.z0 z0Var) {
        this.f4219a = z0Var;
        this.b = (com.fyber.inneractive.sdk.protobuf.z0) z0Var.dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.NEW_MUTABLE_INSTANCE);
    }

    public static void a(com.fyber.inneractive.sdk.protobuf.z0 z0Var, com.fyber.inneractive.sdk.protobuf.z0 z0Var2) {
        com.fyber.inneractive.sdk.protobuf.p2 p2Var = com.fyber.inneractive.sdk.protobuf.p2.c;
        p2Var.getClass();
        p2Var.a(z0Var.getClass()).a(z0Var, z0Var2);
    }

    public final com.fyber.inneractive.sdk.protobuf.z0 b() {
        if (this.c) {
            return this.b;
        }
        this.b.makeImmutable();
        this.c = true;
        return this.b;
    }

    public final void c() {
        if (this.c) {
            com.fyber.inneractive.sdk.protobuf.z0 z0Var = (com.fyber.inneractive.sdk.protobuf.z0) this.b.dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.NEW_MUTABLE_INSTANCE);
            a(z0Var, this.b);
            this.b = z0Var;
            this.c = false;
        }
    }

    public final java.lang.Object clone() {
        com.fyber.inneractive.sdk.protobuf.t0 newBuilderForType = this.f4219a.newBuilderForType();
        com.fyber.inneractive.sdk.protobuf.z0 b = b();
        newBuilderForType.c();
        a(newBuilderForType.b, b);
        return newBuilderForType;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e2
    public final com.fyber.inneractive.sdk.protobuf.d2 getDefaultInstanceForType() {
        return this.f4219a;
    }

    public static void a(java.lang.Iterable iterable, java.util.List list) {
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        iterable.getClass();
        if (iterable instanceof com.fyber.inneractive.sdk.protobuf.q1) {
            java.util.List b = ((com.fyber.inneractive.sdk.protobuf.q1) iterable).b();
            com.fyber.inneractive.sdk.protobuf.q1 q1Var = (com.fyber.inneractive.sdk.protobuf.q1) list;
            int size = list.size();
            for (java.lang.Object obj : b) {
                if (obj == null) {
                    java.lang.String str = "Element at index " + (q1Var.size() - size) + " is null.";
                    for (int size2 = q1Var.size() - 1; size2 >= size; size2--) {
                        q1Var.remove(size2);
                    }
                    throw new java.lang.NullPointerException(str);
                }
                if (obj instanceof com.fyber.inneractive.sdk.protobuf.s) {
                    q1Var.a((com.fyber.inneractive.sdk.protobuf.s) obj);
                } else {
                    q1Var.add((java.lang.String) obj);
                }
            }
            return;
        }
        if (iterable instanceof com.fyber.inneractive.sdk.protobuf.n2) {
            list.addAll((java.util.Collection) iterable);
            return;
        }
        if ((list instanceof java.util.ArrayList) && (iterable instanceof java.util.Collection)) {
            ((java.util.ArrayList) list).ensureCapacity(((java.util.Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (java.lang.Object obj2 : iterable) {
            if (obj2 == null) {
                java.lang.String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new java.lang.NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public final com.fyber.inneractive.sdk.protobuf.z0 a() {
        com.fyber.inneractive.sdk.protobuf.z0 b = b();
        if (b.isInitialized()) {
            return b;
        }
        throw new com.fyber.inneractive.sdk.protobuf.m3();
    }

    public final com.fyber.inneractive.sdk.protobuf.t0 a(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        c();
        try {
            com.fyber.inneractive.sdk.protobuf.p2 p2Var = com.fyber.inneractive.sdk.protobuf.p2.c;
            com.fyber.inneractive.sdk.protobuf.z0 z0Var = this.b;
            p2Var.getClass();
            com.fyber.inneractive.sdk.protobuf.t2 a2 = p2Var.a(z0Var.getClass());
            com.fyber.inneractive.sdk.protobuf.z0 z0Var2 = this.b;
            com.fyber.inneractive.sdk.protobuf.x xVar = wVar.d;
            if (xVar == null) {
                xVar = new com.fyber.inneractive.sdk.protobuf.x(wVar);
            }
            a2.a(z0Var2, xVar, h0Var);
            return this;
        } catch (java.lang.RuntimeException e) {
            if (e.getCause() instanceof java.io.IOException) {
                throw ((java.io.IOException) e.getCause());
            }
            throw e;
        }
    }
}
