package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class j2 implements com.fyber.inneractive.sdk.protobuf.t2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.protobuf.d2 f4199a;
    public final com.fyber.inneractive.sdk.protobuf.o3 b;
    public final boolean c;
    public final com.fyber.inneractive.sdk.protobuf.j0 d;

    public j2(com.fyber.inneractive.sdk.protobuf.o3 o3Var, com.fyber.inneractive.sdk.protobuf.j0 j0Var, com.fyber.inneractive.sdk.protobuf.d2 d2Var) {
        this.b = o3Var;
        j0Var.getClass();
        this.c = d2Var instanceof com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage;
        this.d = j0Var;
        this.f4199a = d2Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final java.lang.Object a() {
        return ((com.fyber.inneractive.sdk.protobuf.t0) this.f4199a.newBuilderForType()).b();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean b(java.lang.Object obj, java.lang.Object obj2) {
        this.b.getClass();
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields;
        this.b.getClass();
        if (!n3Var.equals(((com.fyber.inneractive.sdk.protobuf.z0) obj2).unknownFields)) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.getClass();
        com.fyber.inneractive.sdk.protobuf.n0 n0Var = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions;
        this.d.getClass();
        return n0Var.equals(((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj2).extensions);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void c(java.lang.Object obj) {
        this.b.getClass();
        ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields.e = false;
        this.d.getClass();
        ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int d(java.lang.Object obj) {
        this.b.getClass();
        int hashCode = ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields.hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.getClass();
        return (hashCode * 53) + ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions.f4206a.hashCode();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        com.fyber.inneractive.sdk.protobuf.o3 o3Var = this.b;
        java.lang.Class cls = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
        o3Var.getClass();
        com.fyber.inneractive.sdk.protobuf.z0 z0Var = (com.fyber.inneractive.sdk.protobuf.z0) obj;
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = z0Var.unknownFields;
        com.fyber.inneractive.sdk.protobuf.n3 n3Var2 = ((com.fyber.inneractive.sdk.protobuf.z0) obj2).unknownFields;
        if (!n3Var2.equals(com.fyber.inneractive.sdk.protobuf.n3.f)) {
            n3Var = com.fyber.inneractive.sdk.protobuf.n3.a(n3Var, n3Var2);
        }
        z0Var.unknownFields = n3Var;
        if (this.c) {
            this.d.getClass();
            com.fyber.inneractive.sdk.protobuf.n0 n0Var = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj2).extensions;
            if (n0Var.f4206a.isEmpty()) {
                return;
            }
            ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().a(n0Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int b(java.lang.Object obj) {
        this.b.getClass();
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields;
        int i = n3Var.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < n3Var.f4208a; i3++) {
                int i4 = n3Var.b[i3] >>> 3;
                com.fyber.inneractive.sdk.protobuf.s sVar = (com.fyber.inneractive.sdk.protobuf.s) n3Var.c[i3];
                i2 += com.fyber.inneractive.sdk.protobuf.b0.a(sVar) + com.fyber.inneractive.sdk.protobuf.b0.b(3) + com.fyber.inneractive.sdk.protobuf.b0.c(i4) + com.fyber.inneractive.sdk.protobuf.b0.b(2) + (com.fyber.inneractive.sdk.protobuf.b0.b(1) * 2);
            }
            n3Var.d = i2;
            i = i2;
        }
        if (!this.c) {
            return i;
        }
        this.d.getClass();
        return i + ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions.a();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.c0 c0Var) {
        this.d.getClass();
        java.util.Iterator d = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions.d();
        while (d.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) d.next();
            com.fyber.inneractive.sdk.protobuf.w0 w0Var = (com.fyber.inneractive.sdk.protobuf.w0) entry.getKey();
            if (w0Var.c.a() == com.fyber.inneractive.sdk.protobuf.k4.MESSAGE && !w0Var.d && !w0Var.e) {
                int i = w0Var.b;
                java.lang.Object value = entry.getValue();
                c0Var.getClass();
                if (value instanceof com.fyber.inneractive.sdk.protobuf.s) {
                    c0Var.f4181a.b(i, (com.fyber.inneractive.sdk.protobuf.s) value);
                } else {
                    c0Var.f4181a.a(i, (com.fyber.inneractive.sdk.protobuf.d2) value);
                }
            } else {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
        }
        this.b.getClass();
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields;
        n3Var.getClass();
        c0Var.getClass();
        if (com.fyber.inneractive.sdk.protobuf.q4.ASCENDING == com.fyber.inneractive.sdk.protobuf.q4.DESCENDING) {
            for (int i2 = n3Var.f4208a - 1; i2 >= 0; i2--) {
                int i3 = n3Var.b[i2] >>> 3;
                java.lang.Object obj2 = n3Var.c[i2];
                if (obj2 instanceof com.fyber.inneractive.sdk.protobuf.s) {
                    c0Var.f4181a.b(i3, (com.fyber.inneractive.sdk.protobuf.s) obj2);
                } else {
                    c0Var.f4181a.a(i3, (com.fyber.inneractive.sdk.protobuf.d2) obj2);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < n3Var.f4208a; i4++) {
            int i5 = n3Var.b[i4] >>> 3;
            java.lang.Object obj3 = n3Var.c[i4];
            if (obj3 instanceof com.fyber.inneractive.sdk.protobuf.s) {
                c0Var.f4181a.b(i5, (com.fyber.inneractive.sdk.protobuf.s) obj3);
            } else {
                c0Var.f4181a.a(i5, (com.fyber.inneractive.sdk.protobuf.d2) obj3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.lang.Object obj, byte[] bArr, int i, int i2, com.fyber.inneractive.sdk.protobuf.f fVar) {
        com.fyber.inneractive.sdk.protobuf.z0 z0Var = (com.fyber.inneractive.sdk.protobuf.z0) obj;
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = z0Var.unknownFields;
        if (n3Var == com.fyber.inneractive.sdk.protobuf.n3.f) {
            n3Var = new com.fyber.inneractive.sdk.protobuf.n3();
            z0Var.unknownFields = n3Var;
        }
        com.fyber.inneractive.sdk.protobuf.n0 ensureExtensionsAreMutable = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        com.fyber.inneractive.sdk.protobuf.x0 x0Var = null;
        while (i < i2) {
            int d = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i, fVar);
            int i3 = fVar.f4189a;
            if (i3 == 11) {
                int i4 = 0;
                com.fyber.inneractive.sdk.protobuf.s sVar = null;
                while (true) {
                    if (d >= i2) {
                        break;
                    }
                    int i5 = d + 1;
                    byte b = bArr[d];
                    if (b >= 0) {
                        fVar.f4189a = b;
                    } else {
                        i5 = com.fyber.inneractive.sdk.protobuf.g.a(b, bArr, i5, fVar);
                    }
                    int i6 = fVar.f4189a;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (x0Var != null) {
                                d = com.fyber.inneractive.sdk.protobuf.g.a(com.fyber.inneractive.sdk.protobuf.p2.c.a(x0Var.c.getClass()), bArr, i5, i2, fVar);
                                ensureExtensionsAreMutable.c(x0Var.d, fVar.c);
                            } else if (i8 == 2) {
                                d = com.fyber.inneractive.sdk.protobuf.g.a(bArr, i5, fVar);
                                sVar = (com.fyber.inneractive.sdk.protobuf.s) fVar.c;
                            }
                        }
                        if (i6 != 12) {
                            d = i5;
                            break;
                        }
                        d = com.fyber.inneractive.sdk.protobuf.g.a(i6, bArr, i5, i2, fVar);
                    } else if (i8 == 0) {
                        int i9 = i5 + 1;
                        byte b2 = bArr[i5];
                        if (b2 >= 0) {
                            fVar.f4189a = b2;
                        } else {
                            i9 = com.fyber.inneractive.sdk.protobuf.g.a(b2, bArr, i9, fVar);
                        }
                        d = i9;
                        i4 = fVar.f4189a;
                        com.fyber.inneractive.sdk.protobuf.j0 j0Var = this.d;
                        com.fyber.inneractive.sdk.protobuf.h0 h0Var = fVar.d;
                        com.fyber.inneractive.sdk.protobuf.d2 d2Var = this.f4199a;
                        j0Var.getClass();
                        x0Var = h0Var.a(i4, d2Var);
                    } else if (i6 != 12) {
                    }
                }
                if (sVar != null) {
                    n3Var.a((i4 << 3) | 2, sVar);
                }
                i = d;
            } else if ((i3 & 7) == 2) {
                com.fyber.inneractive.sdk.protobuf.j0 j0Var2 = this.d;
                com.fyber.inneractive.sdk.protobuf.h0 h0Var2 = fVar.d;
                com.fyber.inneractive.sdk.protobuf.d2 d2Var2 = this.f4199a;
                j0Var2.getClass();
                com.fyber.inneractive.sdk.protobuf.x0 a2 = h0Var2.a(i3 >>> 3, d2Var2);
                if (a2 != null) {
                    i = com.fyber.inneractive.sdk.protobuf.g.a(com.fyber.inneractive.sdk.protobuf.p2.c.a(a2.c.getClass()), bArr, d, i2, fVar);
                    ensureExtensionsAreMutable.c(a2.d, fVar.c);
                } else {
                    i = com.fyber.inneractive.sdk.protobuf.g.a(i3, bArr, d, i2, n3Var, fVar);
                }
                x0Var = a2;
            } else {
                i = com.fyber.inneractive.sdk.protobuf.g.a(i3, bArr, d, i2, fVar);
            }
        }
        if (i != i2) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.s2 s2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        com.fyber.inneractive.sdk.protobuf.o3 o3Var = this.b;
        com.fyber.inneractive.sdk.protobuf.j0 j0Var = this.d;
        o3Var.getClass();
        com.fyber.inneractive.sdk.protobuf.z0 z0Var = (com.fyber.inneractive.sdk.protobuf.z0) obj;
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = z0Var.unknownFields;
        if (n3Var == com.fyber.inneractive.sdk.protobuf.n3.f) {
            n3Var = new com.fyber.inneractive.sdk.protobuf.n3();
            z0Var.unknownFields = n3Var;
        }
        com.fyber.inneractive.sdk.protobuf.n3 n3Var2 = n3Var;
        j0Var.getClass();
        com.fyber.inneractive.sdk.protobuf.n0 ensureExtensionsAreMutable = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        do {
            try {
                if (s2Var.s() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                z0Var.unknownFields = n3Var2;
            }
        } while (a(s2Var, h0Var, j0Var, ensureExtensionsAreMutable, o3Var, n3Var2));
    }

    public final boolean a(com.fyber.inneractive.sdk.protobuf.s2 s2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var, com.fyber.inneractive.sdk.protobuf.j0 j0Var, com.fyber.inneractive.sdk.protobuf.n0 n0Var, com.fyber.inneractive.sdk.protobuf.o3 o3Var, com.fyber.inneractive.sdk.protobuf.n3 n3Var) {
        byte[] bArr;
        int e = s2Var.e();
        if (e != 11) {
            if ((e & 7) == 2) {
                com.fyber.inneractive.sdk.protobuf.d2 d2Var = this.f4199a;
                j0Var.getClass();
                com.fyber.inneractive.sdk.protobuf.x0 a2 = h0Var.a(e >>> 3, d2Var);
                if (a2 != null) {
                    n0Var.c(a2.d, s2Var.b(a2.c.getClass(), h0Var));
                    return true;
                }
                o3Var.getClass();
                return com.fyber.inneractive.sdk.protobuf.o3.a((java.lang.Object) n3Var, s2Var);
            }
            return s2Var.i();
        }
        com.fyber.inneractive.sdk.protobuf.x0 x0Var = null;
        com.fyber.inneractive.sdk.protobuf.s sVar = null;
        int i = 0;
        while (s2Var.s() != Integer.MAX_VALUE) {
            int e2 = s2Var.e();
            if (e2 == 16) {
                i = s2Var.c();
                com.fyber.inneractive.sdk.protobuf.d2 d2Var2 = this.f4199a;
                j0Var.getClass();
                x0Var = h0Var.a(i, d2Var2);
            } else if (e2 == 26) {
                if (x0Var != null) {
                    j0Var.getClass();
                    n0Var.c(x0Var.d, s2Var.b(x0Var.c.getClass(), h0Var));
                } else {
                    sVar = s2Var.a();
                }
            } else if (!s2Var.i()) {
                break;
            }
        }
        if (s2Var.e() != 12) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message end-group tag did not match expected tag.");
        }
        if (sVar != null) {
            if (x0Var != null) {
                j0Var.getClass();
                com.fyber.inneractive.sdk.protobuf.z0 b = ((com.fyber.inneractive.sdk.protobuf.t0) x0Var.c.newBuilderForType()).b();
                int size = sVar.size();
                if (size == 0) {
                    bArr = com.fyber.inneractive.sdk.protobuf.l1.b;
                } else {
                    byte[] bArr2 = new byte[size];
                    sVar.a(size, bArr2);
                    bArr = bArr2;
                }
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
                if (wrap.hasArray()) {
                    com.fyber.inneractive.sdk.protobuf.h hVar = new com.fyber.inneractive.sdk.protobuf.h(wrap);
                    com.fyber.inneractive.sdk.protobuf.p2 p2Var = com.fyber.inneractive.sdk.protobuf.p2.c;
                    p2Var.getClass();
                    p2Var.a(b.getClass()).a(b, hVar, h0Var);
                    n0Var.c(x0Var.d, b);
                    if (hVar.s() != Integer.MAX_VALUE) {
                        throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message end-group tag did not match expected tag.");
                    }
                } else {
                    throw new java.lang.IllegalArgumentException("Direct buffers not yet supported");
                }
            } else {
                o3Var.getClass();
                n3Var.a((i << 3) | 2, sVar);
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean a(java.lang.Object obj) {
        this.d.getClass();
        return ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions.c();
    }
}
