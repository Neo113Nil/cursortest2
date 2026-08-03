package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class n0 {
    public static final com.fyber.inneractive.sdk.protobuf.n0 d = new com.fyber.inneractive.sdk.protobuf.n0(0);

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.protobuf.e3 f4206a;
    public boolean b;
    public boolean c;

    public n0() {
        int i = com.fyber.inneractive.sdk.protobuf.e3.h;
        this.f4206a = new com.fyber.inneractive.sdk.protobuf.v2(16);
    }

    public static boolean b(java.util.Map.Entry entry) {
        com.fyber.inneractive.sdk.protobuf.w0 w0Var = (com.fyber.inneractive.sdk.protobuf.w0) entry.getKey();
        if (w0Var.c.a() != com.fyber.inneractive.sdk.protobuf.k4.MESSAGE) {
            return true;
        }
        if (!w0Var.d) {
            java.lang.Object value = entry.getValue();
            if (value instanceof com.fyber.inneractive.sdk.protobuf.d2) {
                return ((com.fyber.inneractive.sdk.protobuf.d2) value).isInitialized();
            }
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((com.fyber.inneractive.sdk.protobuf.d2) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public final void a(com.fyber.inneractive.sdk.protobuf.n0 n0Var) {
        for (int i = 0; i < n0Var.f4206a.b.size(); i++) {
            c((java.util.Map.Entry) n0Var.f4206a.b.get(i));
        }
        java.util.Iterator it = n0Var.f4206a.b().iterator();
        while (it.hasNext()) {
            c((java.util.Map.Entry) it.next());
        }
    }

    public final boolean c() {
        for (int i = 0; i < this.f4206a.b.size(); i++) {
            if (!b((java.util.Map.Entry) this.f4206a.b.get(i))) {
                return false;
            }
        }
        java.util.Iterator it = this.f4206a.b().iterator();
        while (it.hasNext()) {
            if (!b((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final java.util.Iterator d() {
        return this.c ? new com.fyber.inneractive.sdk.protobuf.o1(this.f4206a.entrySet().iterator()) : this.f4206a.entrySet().iterator();
    }

    public final void e() {
        if (this.b) {
            return;
        }
        com.fyber.inneractive.sdk.protobuf.v2 v2Var = (com.fyber.inneractive.sdk.protobuf.v2) this.f4206a;
        if (!v2Var.d) {
            for (int i = 0; i < v2Var.b.size(); i++) {
                java.util.Map.Entry entry = (java.util.Map.Entry) v2Var.b.get(i);
                if (((com.fyber.inneractive.sdk.protobuf.w0) entry.getKey()).d) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
            for (java.util.Map.Entry entry2 : v2Var.b()) {
                if (((com.fyber.inneractive.sdk.protobuf.w0) entry2.getKey()).d) {
                    entry2.setValue(java.util.Collections.unmodifiableList((java.util.List) entry2.getValue()));
                }
            }
        }
        if (!v2Var.d) {
            v2Var.c = v2Var.c.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(v2Var.c);
            v2Var.f = v2Var.f.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(v2Var.f);
            v2Var.d = true;
        }
        this.b = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.fyber.inneractive.sdk.protobuf.n0) {
            return this.f4206a.equals(((com.fyber.inneractive.sdk.protobuf.n0) obj).f4206a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4206a.hashCode();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final com.fyber.inneractive.sdk.protobuf.n0 m5260clone() {
        com.fyber.inneractive.sdk.protobuf.n0 n0Var = new com.fyber.inneractive.sdk.protobuf.n0();
        for (int i = 0; i < this.f4206a.b.size(); i++) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.f4206a.b.get(i);
            n0Var.c((com.fyber.inneractive.sdk.protobuf.w0) entry.getKey(), entry.getValue());
        }
        for (java.util.Map.Entry entry2 : this.f4206a.b()) {
            n0Var.c((com.fyber.inneractive.sdk.protobuf.w0) entry2.getKey(), entry2.getValue());
        }
        n0Var.c = this.c;
        return n0Var;
    }

    public n0(int i) {
        int i2 = com.fyber.inneractive.sdk.protobuf.e3.h;
        this.f4206a = new com.fyber.inneractive.sdk.protobuf.v2(0);
        e();
        e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:5:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(com.fyber.inneractive.sdk.protobuf.w0 w0Var, java.lang.Object obj) {
        boolean z;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var = w0Var.c;
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        obj.getClass();
        switch (com.fyber.inneractive.sdk.protobuf.m0.f4205a[j4Var.a().ordinal()]) {
            case 1:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(w0Var.b), w0Var.c.a(), obj.getClass().getName()));
            case 2:
                z = obj instanceof java.lang.Long;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(w0Var.b), w0Var.c.a(), obj.getClass().getName()));
            case 3:
                z = obj instanceof java.lang.Float;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(w0Var.b), w0Var.c.a(), obj.getClass().getName()));
            case 4:
                z = obj instanceof java.lang.Double;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(w0Var.b), w0Var.c.a(), obj.getClass().getName()));
            case 5:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(w0Var.b), w0Var.c.a(), obj.getClass().getName()));
            case 6:
                z = obj instanceof java.lang.String;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(w0Var.b), w0Var.c.a(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof com.fyber.inneractive.sdk.protobuf.s) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(w0Var.b), w0Var.c.a(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.fyber.inneractive.sdk.protobuf.d1)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(w0Var.b), w0Var.c.a(), obj.getClass().getName()));
            case 9:
                z = obj instanceof com.fyber.inneractive.sdk.protobuf.d2;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(w0Var.b), w0Var.c.a(), obj.getClass().getName()));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(w0Var.b), w0Var.c.a(), obj.getClass().getName()));
        }
    }

    public final int a() {
        int i = 0;
        for (int i2 = 0; i2 < this.f4206a.b.size(); i2++) {
            i += a((java.util.Map.Entry) this.f4206a.b.get(i2));
        }
        java.util.Iterator it = this.f4206a.b().iterator();
        while (it.hasNext()) {
            i += a((java.util.Map.Entry) it.next());
        }
        return i;
    }

    public final void c(java.util.Map.Entry entry) {
        com.fyber.inneractive.sdk.protobuf.w0 w0Var = (com.fyber.inneractive.sdk.protobuf.w0) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (w0Var.d) {
            java.lang.Object obj = this.f4206a.get(w0Var);
            if (obj == null) {
                obj = new java.util.ArrayList();
            }
            for (java.lang.Object obj2 : (java.util.List) value) {
                java.util.List list = (java.util.List) obj;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            this.f4206a.a(w0Var, obj);
            return;
        }
        if (w0Var.c.a() == com.fyber.inneractive.sdk.protobuf.k4.MESSAGE) {
            java.lang.Object obj3 = this.f4206a.get(w0Var);
            if (obj3 == null) {
                com.fyber.inneractive.sdk.protobuf.e3 e3Var = this.f4206a;
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                e3Var.a(w0Var, value);
                return;
            }
            com.fyber.inneractive.sdk.protobuf.t0 t0Var = (com.fyber.inneractive.sdk.protobuf.t0) ((com.fyber.inneractive.sdk.protobuf.d2) obj3).toBuilder();
            t0Var.c();
            com.fyber.inneractive.sdk.protobuf.t0.a(t0Var.b, (com.fyber.inneractive.sdk.protobuf.z0) ((com.fyber.inneractive.sdk.protobuf.d2) value));
            this.f4206a.a(w0Var, t0Var.a());
            return;
        }
        com.fyber.inneractive.sdk.protobuf.e3 e3Var2 = this.f4206a;
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            java.lang.System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        e3Var2.a(w0Var, value);
    }

    public static int a(java.util.Map.Entry entry) {
        com.fyber.inneractive.sdk.protobuf.w0 w0Var = (com.fyber.inneractive.sdk.protobuf.w0) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (w0Var.c.a() == com.fyber.inneractive.sdk.protobuf.k4.MESSAGE && !w0Var.d && !w0Var.e) {
            int i = ((com.fyber.inneractive.sdk.protobuf.w0) entry.getKey()).b;
            int c = com.fyber.inneractive.sdk.protobuf.b0.c(i) + com.fyber.inneractive.sdk.protobuf.b0.b(2) + (com.fyber.inneractive.sdk.protobuf.b0.b(1) * 2);
            int b = com.fyber.inneractive.sdk.protobuf.b0.b(3);
            int serializedSize = ((com.fyber.inneractive.sdk.protobuf.d2) value).getSerializedSize();
            return com.fyber.inneractive.sdk.protobuf.l0.a(serializedSize, serializedSize, b, c);
        }
        return b(w0Var, value);
    }

    public final int b() {
        int i = 0;
        for (int i2 = 0; i2 < this.f4206a.b.size(); i2++) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.f4206a.b.get(i2);
            i += b((com.fyber.inneractive.sdk.protobuf.w0) entry.getKey(), entry.getValue());
        }
        for (java.util.Map.Entry entry2 : this.f4206a.b()) {
            i += b((com.fyber.inneractive.sdk.protobuf.w0) entry2.getKey(), entry2.getValue());
        }
        return i;
    }

    public static int b(com.fyber.inneractive.sdk.protobuf.w0 w0Var, java.lang.Object obj) {
        int b;
        int a2;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var = w0Var.c;
        int i = w0Var.b;
        if (w0Var.d) {
            int i2 = 0;
            if (w0Var.e) {
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    i2 += a(j4Var, it.next());
                }
                b = com.fyber.inneractive.sdk.protobuf.b0.b(i) + i2;
                a2 = com.fyber.inneractive.sdk.protobuf.b0.c(i2);
            } else {
                for (java.lang.Object obj2 : (java.util.List) obj) {
                    int b2 = com.fyber.inneractive.sdk.protobuf.b0.b(i);
                    if (j4Var == com.fyber.inneractive.sdk.protobuf.j4.GROUP) {
                        b2 *= 2;
                    }
                    i2 += a(j4Var, obj2) + b2;
                }
                return i2;
            }
        } else {
            b = com.fyber.inneractive.sdk.protobuf.b0.b(i);
            if (j4Var == com.fyber.inneractive.sdk.protobuf.j4.GROUP) {
                b *= 2;
            }
            a2 = a(j4Var, obj);
        }
        return a2 + b;
    }

    public final void c(com.fyber.inneractive.sdk.protobuf.w0 w0Var, java.lang.Object obj) {
        if (w0Var.d) {
            if (obj instanceof java.util.List) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll((java.util.List) obj);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d(w0Var, it.next());
                }
                obj = arrayList;
            } else {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            d(w0Var, obj);
        }
        this.f4206a.a(w0Var, obj);
    }

    public static int a(com.fyber.inneractive.sdk.protobuf.j4 j4Var, java.lang.Object obj) {
        int serializedSize;
        int c;
        switch (com.fyber.inneractive.sdk.protobuf.m0.b[j4Var.ordinal()]) {
            case 1:
                ((java.lang.Double) obj).getClass();
                java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
                return 8;
            case 2:
                ((java.lang.Float) obj).getClass();
                java.util.logging.Logger logger2 = com.fyber.inneractive.sdk.protobuf.b0.b;
                return 4;
            case 3:
                return com.fyber.inneractive.sdk.protobuf.b0.a(((java.lang.Long) obj).longValue());
            case 4:
                return com.fyber.inneractive.sdk.protobuf.b0.a(((java.lang.Long) obj).longValue());
            case 5:
                int intValue = ((java.lang.Integer) obj).intValue();
                if (intValue >= 0) {
                    return com.fyber.inneractive.sdk.protobuf.b0.c(intValue);
                }
                java.util.logging.Logger logger3 = com.fyber.inneractive.sdk.protobuf.b0.b;
                return 10;
            case 6:
                ((java.lang.Long) obj).getClass();
                java.util.logging.Logger logger4 = com.fyber.inneractive.sdk.protobuf.b0.b;
                return 8;
            case 7:
                ((java.lang.Integer) obj).getClass();
                java.util.logging.Logger logger5 = com.fyber.inneractive.sdk.protobuf.b0.b;
                return 4;
            case 8:
                ((java.lang.Boolean) obj).getClass();
                java.util.logging.Logger logger6 = com.fyber.inneractive.sdk.protobuf.b0.b;
                return 1;
            case 9:
                java.util.logging.Logger logger7 = com.fyber.inneractive.sdk.protobuf.b0.b;
                return ((com.fyber.inneractive.sdk.protobuf.d2) obj).getSerializedSize();
            case 10:
                java.util.logging.Logger logger8 = com.fyber.inneractive.sdk.protobuf.b0.b;
                serializedSize = ((com.fyber.inneractive.sdk.protobuf.d2) obj).getSerializedSize();
                c = com.fyber.inneractive.sdk.protobuf.b0.c(serializedSize);
                break;
            case 11:
                if (obj instanceof com.fyber.inneractive.sdk.protobuf.s) {
                    return com.fyber.inneractive.sdk.protobuf.b0.a((com.fyber.inneractive.sdk.protobuf.s) obj);
                }
                return com.fyber.inneractive.sdk.protobuf.b0.a((java.lang.String) obj);
            case 12:
                if (obj instanceof com.fyber.inneractive.sdk.protobuf.s) {
                    return com.fyber.inneractive.sdk.protobuf.b0.a((com.fyber.inneractive.sdk.protobuf.s) obj);
                }
                java.util.logging.Logger logger9 = com.fyber.inneractive.sdk.protobuf.b0.b;
                serializedSize = ((byte[]) obj).length;
                c = com.fyber.inneractive.sdk.protobuf.b0.c(serializedSize);
                break;
            case 13:
                return com.fyber.inneractive.sdk.protobuf.b0.c(((java.lang.Integer) obj).intValue());
            case 14:
                ((java.lang.Integer) obj).getClass();
                java.util.logging.Logger logger10 = com.fyber.inneractive.sdk.protobuf.b0.b;
                return 4;
            case 15:
                ((java.lang.Long) obj).getClass();
                java.util.logging.Logger logger11 = com.fyber.inneractive.sdk.protobuf.b0.b;
                return 8;
            case 16:
                return com.fyber.inneractive.sdk.protobuf.b0.c(com.fyber.inneractive.sdk.protobuf.b0.d(((java.lang.Integer) obj).intValue()));
            case 17:
                return com.fyber.inneractive.sdk.protobuf.b0.a(com.fyber.inneractive.sdk.protobuf.b0.b(((java.lang.Long) obj).longValue()));
            case 18:
                if (obj instanceof com.fyber.inneractive.sdk.protobuf.d1) {
                    return com.fyber.inneractive.sdk.protobuf.b0.a(((com.fyber.inneractive.sdk.protobuf.d1) obj).a());
                }
                return com.fyber.inneractive.sdk.protobuf.b0.a(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return c + serializedSize;
    }

    public final void a(com.fyber.inneractive.sdk.protobuf.w0 w0Var, java.lang.Object obj) {
        java.util.List list;
        if (w0Var.d) {
            d(w0Var, obj);
            java.lang.Object obj2 = this.f4206a.get(w0Var);
            if (obj2 == null) {
                list = new java.util.ArrayList();
                this.f4206a.a(w0Var, list);
            } else {
                list = (java.util.List) obj2;
            }
            list.add(obj);
            return;
        }
        throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }
}
