package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType> extends com.fyber.inneractive.sdk.protobuf.z0 implements com.fyber.inneractive.sdk.protobuf.e2 {
    protected com.fyber.inneractive.sdk.protobuf.n0 extensions = com.fyber.inneractive.sdk.protobuf.n0.d;

    private void eagerlyMergeMessageSetExtension(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.x0 x0Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var, int i) throws java.io.IOException {
        parseExtension(wVar, h0Var, x0Var, (i << 3) | 2, i);
    }

    private void mergeMessageSetExtensionFromBytes(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var, com.fyber.inneractive.sdk.protobuf.x0 x0Var) throws java.io.IOException {
        com.fyber.inneractive.sdk.protobuf.d2 d2Var = (com.fyber.inneractive.sdk.protobuf.d2) this.extensions.f4206a.get(x0Var.d);
        com.fyber.inneractive.sdk.protobuf.c2 builder = d2Var != null ? d2Var.toBuilder() : null;
        if (builder == null) {
            builder = x0Var.c.newBuilderForType();
        }
        com.fyber.inneractive.sdk.protobuf.t0 t0Var = (com.fyber.inneractive.sdk.protobuf.t0) builder;
        t0Var.getClass();
        try {
            com.fyber.inneractive.sdk.protobuf.w d = sVar.d();
            t0Var.a(d, h0Var);
            d.a(0);
            java.lang.Object a2 = t0Var.a();
            com.fyber.inneractive.sdk.protobuf.n0 ensureExtensionsAreMutable = ensureExtensionsAreMutable();
            com.fyber.inneractive.sdk.protobuf.w0 w0Var = x0Var.d;
            if (w0Var.c.a() == com.fyber.inneractive.sdk.protobuf.k4.ENUM) {
                a2 = java.lang.Integer.valueOf(((com.fyber.inneractive.sdk.protobuf.d1) a2).a());
            }
            ensureExtensionsAreMutable.c(w0Var, a2);
        } catch (com.fyber.inneractive.sdk.protobuf.n1 e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Reading " + t0Var.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
        }
    }

    private <MessageType extends com.fyber.inneractive.sdk.protobuf.d2> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws java.io.IOException {
        int i = 0;
        com.fyber.inneractive.sdk.protobuf.q qVar = null;
        com.fyber.inneractive.sdk.protobuf.x0 x0Var = null;
        while (true) {
            int t = wVar.t();
            if (t == 0) {
                break;
            }
            if (t == 16) {
                i = wVar.u();
                if (i != 0) {
                    x0Var = h0Var.a(i, messagetype);
                }
            } else if (t == 26) {
                if (i == 0 || x0Var == null) {
                    qVar = wVar.e();
                } else {
                    eagerlyMergeMessageSetExtension(wVar, x0Var, h0Var, i);
                    qVar = null;
                }
            } else if (!wVar.e(t)) {
                break;
            }
        }
        wVar.a(12);
        if (qVar == null || i == 0) {
            return;
        }
        if (x0Var != null) {
            mergeMessageSetExtensionFromBytes(qVar, h0Var, x0Var);
        } else {
            mergeLengthDelimitedField(i, qVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /* JADX WARN: Type inference failed for: r10v27, types: [com.fyber.inneractive.sdk.protobuf.d1] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean parseExtension(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var, com.fyber.inneractive.sdk.protobuf.x0 x0Var, int i, int i2) throws java.io.IOException {
        boolean z;
        java.lang.Object a2;
        com.fyber.inneractive.sdk.protobuf.d2 d2Var;
        int i3 = i & 7;
        boolean z2 = false;
        if (x0Var != null) {
            com.fyber.inneractive.sdk.protobuf.j4 j4Var = x0Var.d.c;
            com.fyber.inneractive.sdk.protobuf.n0 n0Var = com.fyber.inneractive.sdk.protobuf.n0.d;
            if (i3 == j4Var.b()) {
                z = false;
            } else {
                com.fyber.inneractive.sdk.protobuf.w0 w0Var = x0Var.d;
                if (w0Var.d && w0Var.c.c()) {
                    com.fyber.inneractive.sdk.protobuf.j4 j4Var2 = x0Var.d.c;
                    if (i3 == 2) {
                        z = true;
                    }
                }
            }
            if (!z2) {
                return parseUnknownField(i, wVar);
            }
            ensureExtensionsAreMutable();
            if (z) {
                int d = wVar.d(wVar.m());
                if (x0Var.d.c == com.fyber.inneractive.sdk.protobuf.j4.ENUM) {
                    while (wVar.a() > 0) {
                        java.lang.Object a3 = x0Var.d.f4223a.a(wVar.g());
                        if (a3 == 0) {
                            return true;
                        }
                        com.fyber.inneractive.sdk.protobuf.n0 n0Var2 = this.extensions;
                        com.fyber.inneractive.sdk.protobuf.w0 w0Var2 = x0Var.d;
                        if (w0Var2.c.a() == com.fyber.inneractive.sdk.protobuf.k4.ENUM) {
                            a3 = java.lang.Integer.valueOf(a3.a());
                        }
                        n0Var2.a(w0Var2, a3);
                    }
                } else {
                    while (wVar.a() > 0) {
                        com.fyber.inneractive.sdk.protobuf.j4 j4Var3 = x0Var.d.c;
                        com.fyber.inneractive.sdk.protobuf.n0 n0Var3 = com.fyber.inneractive.sdk.protobuf.n0.d;
                        this.extensions.a(x0Var.d, com.fyber.inneractive.sdk.protobuf.p4.a(wVar, j4Var3, com.fyber.inneractive.sdk.protobuf.o4.LOOSE));
                    }
                }
                wVar.c(d);
            } else {
                int i4 = com.fyber.inneractive.sdk.protobuf.s0.f4218a[x0Var.d.c.a().ordinal()];
                if (i4 == 1) {
                    com.fyber.inneractive.sdk.protobuf.w0 w0Var3 = x0Var.d;
                    com.fyber.inneractive.sdk.protobuf.c2 builder = (w0Var3.d || (d2Var = (com.fyber.inneractive.sdk.protobuf.d2) this.extensions.f4206a.get(w0Var3)) == null) ? null : d2Var.toBuilder();
                    if (builder == null) {
                        builder = x0Var.c.newBuilderForType();
                    }
                    com.fyber.inneractive.sdk.protobuf.w0 w0Var4 = x0Var.d;
                    if (w0Var4.c == com.fyber.inneractive.sdk.protobuf.j4.GROUP) {
                        wVar.a(w0Var4.b, builder, h0Var);
                    } else {
                        wVar.a(builder, h0Var);
                    }
                    a2 = ((com.fyber.inneractive.sdk.protobuf.t0) builder).a();
                } else if (i4 != 2) {
                    com.fyber.inneractive.sdk.protobuf.j4 j4Var4 = x0Var.d.c;
                    com.fyber.inneractive.sdk.protobuf.n0 n0Var4 = com.fyber.inneractive.sdk.protobuf.n0.d;
                    a2 = com.fyber.inneractive.sdk.protobuf.p4.a(wVar, j4Var4, com.fyber.inneractive.sdk.protobuf.o4.LOOSE);
                } else {
                    int g = wVar.g();
                    com.fyber.inneractive.sdk.protobuf.d1 a4 = x0Var.d.f4223a.a(g);
                    if (a4 == null) {
                        mergeVarintField(i2, g);
                        return true;
                    }
                    a2 = a4;
                }
                com.fyber.inneractive.sdk.protobuf.w0 w0Var5 = x0Var.d;
                if (w0Var5.d) {
                    com.fyber.inneractive.sdk.protobuf.n0 n0Var5 = this.extensions;
                    if (w0Var5.c.a() == com.fyber.inneractive.sdk.protobuf.k4.ENUM) {
                        a2 = java.lang.Integer.valueOf(((com.fyber.inneractive.sdk.protobuf.d1) a2).a());
                    }
                    n0Var5.a(w0Var5, a2);
                } else {
                    com.fyber.inneractive.sdk.protobuf.n0 n0Var6 = this.extensions;
                    if (w0Var5.c.a() == com.fyber.inneractive.sdk.protobuf.k4.ENUM) {
                        a2 = java.lang.Integer.valueOf(((com.fyber.inneractive.sdk.protobuf.d1) a2).a());
                    }
                    n0Var6.c(w0Var5, a2);
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        if (!z2) {
        }
    }

    private void verifyExtensionContainingType(com.fyber.inneractive.sdk.protobuf.x0 x0Var) {
        if (x0Var.f4228a != getDefaultInstanceForType()) {
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public com.fyber.inneractive.sdk.protobuf.n0 ensureExtensionsAreMutable() {
        com.fyber.inneractive.sdk.protobuf.n0 n0Var = this.extensions;
        if (n0Var.b) {
            this.extensions = n0Var.m5260clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.c();
    }

    public int extensionsSerializedSize() {
        return this.extensions.b();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.a();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0, com.fyber.inneractive.sdk.protobuf.e2
    public /* bridge */ /* synthetic */ com.fyber.inneractive.sdk.protobuf.d2 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [Type, java.util.ArrayList] */
    public final <Type> Type getExtension(com.fyber.inneractive.sdk.protobuf.e0 e0Var) {
        com.fyber.inneractive.sdk.protobuf.x0 access$000 = com.fyber.inneractive.sdk.protobuf.z0.access$000(e0Var);
        verifyExtensionContainingType(access$000);
        Type type = (Type) this.extensions.f4206a.get(access$000.d);
        if (type == 0) {
            return (Type) access$000.b;
        }
        com.fyber.inneractive.sdk.protobuf.w0 w0Var = access$000.d;
        if (!w0Var.d) {
            return w0Var.c.a() == com.fyber.inneractive.sdk.protobuf.k4.ENUM ? (Type) access$000.d.f4223a.a(((java.lang.Integer) type).intValue()) : type;
        }
        if (w0Var.c.a() != com.fyber.inneractive.sdk.protobuf.k4.ENUM) {
            return type;
        }
        ?? r1 = (Type) new java.util.ArrayList();
        for (java.lang.Object obj : (java.util.List) type) {
            if (access$000.d.c.a() == com.fyber.inneractive.sdk.protobuf.k4.ENUM) {
                obj = access$000.d.f4223a.a(((java.lang.Integer) obj).intValue());
            }
            r1.add(obj);
        }
        return r1;
    }

    public final <Type> int getExtensionCount(com.fyber.inneractive.sdk.protobuf.e0 e0Var) {
        com.fyber.inneractive.sdk.protobuf.x0 access$000 = com.fyber.inneractive.sdk.protobuf.z0.access$000(e0Var);
        verifyExtensionContainingType(access$000);
        com.fyber.inneractive.sdk.protobuf.n0 n0Var = this.extensions;
        com.fyber.inneractive.sdk.protobuf.w0 w0Var = access$000.d;
        n0Var.getClass();
        if (!w0Var.d) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object obj = n0Var.f4206a.get(w0Var);
        if (obj == null) {
            return 0;
        }
        return ((java.util.List) obj).size();
    }

    public final <Type> boolean hasExtension(com.fyber.inneractive.sdk.protobuf.e0 e0Var) {
        com.fyber.inneractive.sdk.protobuf.x0 access$000 = com.fyber.inneractive.sdk.protobuf.z0.access$000(e0Var);
        verifyExtensionContainingType(access$000);
        com.fyber.inneractive.sdk.protobuf.n0 n0Var = this.extensions;
        com.fyber.inneractive.sdk.protobuf.w0 w0Var = access$000.d;
        n0Var.getClass();
        if (w0Var.d) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return n0Var.f4206a.get(w0Var) != null;
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        com.fyber.inneractive.sdk.protobuf.n0 n0Var = this.extensions;
        if (n0Var.b) {
            this.extensions = n0Var.m5260clone();
        }
        this.extensions.a(messagetype.extensions);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0, com.fyber.inneractive.sdk.protobuf.d2
    public /* bridge */ /* synthetic */ com.fyber.inneractive.sdk.protobuf.c2 newBuilderForType() {
        return newBuilderForType();
    }

    public com.fyber.inneractive.sdk.protobuf.v0 newExtensionWriter() {
        return new com.fyber.inneractive.sdk.protobuf.v0(this);
    }

    public com.fyber.inneractive.sdk.protobuf.v0 newMessageSetExtensionWriter() {
        return new com.fyber.inneractive.sdk.protobuf.v0(this);
    }

    public <MessageType extends com.fyber.inneractive.sdk.protobuf.d2> boolean parseUnknownField(MessageType messagetype, com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var, int i) throws java.io.IOException {
        int i2 = i >>> 3;
        return parseExtension(wVar, h0Var, h0Var.a(i2, messagetype), i, i2);
    }

    public <MessageType extends com.fyber.inneractive.sdk.protobuf.d2> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var, int i) throws java.io.IOException {
        if (i != 11) {
            return (i & 7) == 2 ? parseUnknownField(messagetype, wVar, h0Var, i) : wVar.e(i);
        }
        mergeMessageSetExtensionFromCodedStream(messagetype, wVar, h0Var);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0, com.fyber.inneractive.sdk.protobuf.d2
    public /* bridge */ /* synthetic */ com.fyber.inneractive.sdk.protobuf.c2 toBuilder() {
        return toBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Type> Type getExtension(com.fyber.inneractive.sdk.protobuf.e0 e0Var, int i) {
        com.fyber.inneractive.sdk.protobuf.x0 access$000 = com.fyber.inneractive.sdk.protobuf.z0.access$000(e0Var);
        verifyExtensionContainingType(access$000);
        com.fyber.inneractive.sdk.protobuf.n0 n0Var = this.extensions;
        com.fyber.inneractive.sdk.protobuf.w0 w0Var = access$000.d;
        n0Var.getClass();
        if (w0Var.d) {
            java.lang.Object obj = n0Var.f4206a.get(w0Var);
            if (obj != null) {
                Type type = (Type) ((java.util.List) obj).get(i);
                return access$000.d.c.a() == com.fyber.inneractive.sdk.protobuf.k4.ENUM ? (Type) access$000.d.f4223a.a(((java.lang.Integer) type).intValue()) : type;
            }
            throw new java.lang.IndexOutOfBoundsException();
        }
        throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
