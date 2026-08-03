package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class z0 extends com.fyber.inneractive.sdk.protobuf.b {
    private static java.util.Map<java.lang.Object, com.fyber.inneractive.sdk.protobuf.z0> defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    protected com.fyber.inneractive.sdk.protobuf.n3 unknownFields = com.fyber.inneractive.sdk.protobuf.n3.f;
    protected int memoizedSerializedSize = -1;

    public static com.fyber.inneractive.sdk.protobuf.z0 a(com.fyber.inneractive.sdk.protobuf.z0 z0Var) {
        if (z0Var == null || z0Var.isInitialized()) {
            return z0Var;
        }
        com.fyber.inneractive.sdk.protobuf.m3 newUninitializedMessageException = z0Var.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        throw new com.fyber.inneractive.sdk.protobuf.n1(newUninitializedMessageException.getMessage());
    }

    public static com.fyber.inneractive.sdk.protobuf.x0 access$000(com.fyber.inneractive.sdk.protobuf.e0 e0Var) {
        e0Var.getClass();
        return (com.fyber.inneractive.sdk.protobuf.x0) e0Var;
    }

    public static com.fyber.inneractive.sdk.protobuf.b1 emptyBooleanList() {
        return com.fyber.inneractive.sdk.protobuf.j.d;
    }

    public static com.fyber.inneractive.sdk.protobuf.c1 emptyDoubleList() {
        return com.fyber.inneractive.sdk.protobuf.d0.d;
    }

    public static com.fyber.inneractive.sdk.protobuf.f1 emptyFloatList() {
        return com.fyber.inneractive.sdk.protobuf.q0.d;
    }

    public static com.fyber.inneractive.sdk.protobuf.g1 emptyIntList() {
        return com.fyber.inneractive.sdk.protobuf.a1.d;
    }

    public static com.fyber.inneractive.sdk.protobuf.j1 emptyLongList() {
        return com.fyber.inneractive.sdk.protobuf.u1.d;
    }

    public static <E> com.fyber.inneractive.sdk.protobuf.k1 emptyProtobufList() {
        return com.fyber.inneractive.sdk.protobuf.q2.d;
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T getDefaultInstance(java.lang.Class<T> cls) {
        com.fyber.inneractive.sdk.protobuf.z0 z0Var = defaultInstanceMap.get(cls);
        if (z0Var == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                z0Var = defaultInstanceMap.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (z0Var == null) {
            try {
                z0Var = (T) ((com.fyber.inneractive.sdk.protobuf.z0) com.fyber.inneractive.sdk.protobuf.x3.f4230a.allocateInstance(cls)).getDefaultInstanceForType();
                if (z0Var == null) {
                    throw new java.lang.IllegalStateException();
                }
                defaultInstanceMap.put(cls, z0Var);
            } catch (java.lang.Throwable th) {
                throw new java.lang.IllegalStateException(th);
            }
        }
        return (T) z0Var;
    }

    public static java.lang.reflect.Method getMethodOrDie(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static java.lang.Object invokeOrDie(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static com.fyber.inneractive.sdk.protobuf.g1 mutableCopy(com.fyber.inneractive.sdk.protobuf.g1 g1Var) {
        com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) g1Var;
        int i = a1Var.c;
        return a1Var.b(i == 0 ? 10 : i * 2);
    }

    public static java.lang.Object newMessageInfo(com.fyber.inneractive.sdk.protobuf.d2 d2Var, java.lang.String str, java.lang.Object[] objArr) {
        return new com.fyber.inneractive.sdk.protobuf.r2(d2Var, str, objArr);
    }

    public static <ContainingType extends com.fyber.inneractive.sdk.protobuf.d2, Type> com.fyber.inneractive.sdk.protobuf.x0 newRepeatedGeneratedExtension(ContainingType containingtype, com.fyber.inneractive.sdk.protobuf.d2 d2Var, com.fyber.inneractive.sdk.protobuf.e1 e1Var, int i, com.fyber.inneractive.sdk.protobuf.j4 j4Var, boolean z, java.lang.Class cls) {
        return new com.fyber.inneractive.sdk.protobuf.x0(containingtype, java.util.Collections.emptyList(), d2Var, new com.fyber.inneractive.sdk.protobuf.w0(e1Var, i, j4Var, true, z));
    }

    public static <ContainingType extends com.fyber.inneractive.sdk.protobuf.d2, Type> com.fyber.inneractive.sdk.protobuf.x0 newSingularGeneratedExtension(ContainingType containingtype, Type type, com.fyber.inneractive.sdk.protobuf.d2 d2Var, com.fyber.inneractive.sdk.protobuf.e1 e1Var, int i, com.fyber.inneractive.sdk.protobuf.j4 j4Var, java.lang.Class cls) {
        return new com.fyber.inneractive.sdk.protobuf.x0(containingtype, type, d2Var, new com.fyber.inneractive.sdk.protobuf.w0(e1Var, i, j4Var, false, false));
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseDelimitedFrom(T t, java.io.InputStream inputStream) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (T) a(a(t, inputStream, com.fyber.inneractive.sdk.protobuf.h0.a()));
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseFrom(T t, java.io.InputStream inputStream) throws com.fyber.inneractive.sdk.protobuf.n1 {
        com.fyber.inneractive.sdk.protobuf.w uVar;
        if (inputStream == null) {
            byte[] bArr = com.fyber.inneractive.sdk.protobuf.l1.b;
            int length = bArr.length;
            uVar = new com.fyber.inneractive.sdk.protobuf.t(bArr, 0, length, false);
            try {
                uVar.d(length);
            } catch (com.fyber.inneractive.sdk.protobuf.n1 e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } else {
            uVar = new com.fyber.inneractive.sdk.protobuf.u(inputStream);
        }
        return (T) a(parsePartialFrom(t, uVar, com.fyber.inneractive.sdk.protobuf.h0.a()));
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parsePartialFrom(T t, com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        T t2 = (T) t.dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.NEW_MUTABLE_INSTANCE);
        try {
            com.fyber.inneractive.sdk.protobuf.p2 p2Var = com.fyber.inneractive.sdk.protobuf.p2.c;
            p2Var.getClass();
            com.fyber.inneractive.sdk.protobuf.t2 a2 = p2Var.a(t2.getClass());
            com.fyber.inneractive.sdk.protobuf.x xVar = wVar.d;
            if (xVar == null) {
                xVar = new com.fyber.inneractive.sdk.protobuf.x(wVar);
            }
            a2.a(t2, xVar, h0Var);
            a2.c(t2);
            return t2;
        } catch (java.io.IOException e) {
            if (e.getCause() instanceof com.fyber.inneractive.sdk.protobuf.n1) {
                throw ((com.fyber.inneractive.sdk.protobuf.n1) e.getCause());
            }
            throw new com.fyber.inneractive.sdk.protobuf.n1(e.getMessage());
        } catch (java.lang.RuntimeException e2) {
            if (e2.getCause() instanceof com.fyber.inneractive.sdk.protobuf.n1) {
                throw ((com.fyber.inneractive.sdk.protobuf.n1) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> void registerDefaultInstance(java.lang.Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public java.lang.Object buildMessageInfo() throws java.lang.Exception {
        return dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends com.fyber.inneractive.sdk.protobuf.z0, BuilderType extends com.fyber.inneractive.sdk.protobuf.t0> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.NEW_BUILDER);
    }

    public java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj) {
        return dynamicMethod(y0Var, obj, null);
    }

    public abstract java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var, java.lang.Object obj, java.lang.Object obj2);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.protobuf.p2 p2Var = com.fyber.inneractive.sdk.protobuf.p2.c;
        p2Var.getClass();
        return p2Var.a(getClass()).b(this, (com.fyber.inneractive.sdk.protobuf.z0) obj);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final com.fyber.inneractive.sdk.protobuf.m2 getParserForType() {
        return (com.fyber.inneractive.sdk.protobuf.m2) dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.GET_PARSER);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            com.fyber.inneractive.sdk.protobuf.p2 p2Var = com.fyber.inneractive.sdk.protobuf.p2.c;
            p2Var.getClass();
            this.memoizedSerializedSize = p2Var.a(getClass()).b(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        com.fyber.inneractive.sdk.protobuf.p2 p2Var = com.fyber.inneractive.sdk.protobuf.p2.c;
        p2Var.getClass();
        int d = p2Var.a(getClass()).d(this);
        this.memoizedHashCode = d;
        return d;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e2
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        com.fyber.inneractive.sdk.protobuf.p2 p2Var = com.fyber.inneractive.sdk.protobuf.p2.c;
        p2Var.getClass();
        p2Var.a(getClass()).c(this);
    }

    public void mergeLengthDelimitedField(int i, com.fyber.inneractive.sdk.protobuf.s sVar) {
        if (this.unknownFields == com.fyber.inneractive.sdk.protobuf.n3.f) {
            this.unknownFields = new com.fyber.inneractive.sdk.protobuf.n3();
        }
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = this.unknownFields;
        if (!n3Var.e) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        n3Var.a((i << 3) | 2, sVar);
    }

    public final void mergeUnknownFields(com.fyber.inneractive.sdk.protobuf.n3 n3Var) {
        this.unknownFields = com.fyber.inneractive.sdk.protobuf.n3.a(this.unknownFields, n3Var);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.unknownFields == com.fyber.inneractive.sdk.protobuf.n3.f) {
            this.unknownFields = new com.fyber.inneractive.sdk.protobuf.n3();
        }
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = this.unknownFields;
        if (!n3Var.e) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        n3Var.a(i << 3, java.lang.Long.valueOf(i2));
    }

    public boolean parseUnknownField(int i, com.fyber.inneractive.sdk.protobuf.w wVar) throws java.io.IOException {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.unknownFields == com.fyber.inneractive.sdk.protobuf.n3.f) {
            this.unknownFields = new com.fyber.inneractive.sdk.protobuf.n3();
        }
        return this.unknownFields.a(i, wVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public java.lang.String toString() {
        java.lang.String obj = super.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(obj);
        com.fyber.inneractive.sdk.protobuf.f2.a(this, sb, 0);
        return sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public void writeTo(com.fyber.inneractive.sdk.protobuf.b0 b0Var) throws java.io.IOException {
        com.fyber.inneractive.sdk.protobuf.p2 p2Var = com.fyber.inneractive.sdk.protobuf.p2.c;
        p2Var.getClass();
        com.fyber.inneractive.sdk.protobuf.t2 a2 = p2Var.a(getClass());
        com.fyber.inneractive.sdk.protobuf.c0 c0Var = b0Var.f4178a;
        if (c0Var == null) {
            c0Var = new com.fyber.inneractive.sdk.protobuf.c0(b0Var);
        }
        a2.a((java.lang.Object) this, c0Var);
    }

    public static final <T extends com.fyber.inneractive.sdk.protobuf.z0> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((java.lang.Byte) t.dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        com.fyber.inneractive.sdk.protobuf.p2 p2Var = com.fyber.inneractive.sdk.protobuf.p2.c;
        p2Var.getClass();
        boolean a2 = p2Var.a(t.getClass()).a(t);
        if (z) {
            t.dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.SET_MEMOIZED_IS_INITIALIZED, a2 ? t : null);
        }
        return a2;
    }

    public final <MessageType extends com.fyber.inneractive.sdk.protobuf.z0, BuilderType extends com.fyber.inneractive.sdk.protobuf.t0> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(buildertype.b, messagetype);
        return buildertype;
    }

    public java.lang.Object dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0 y0Var) {
        return dynamicMethod(y0Var, null, null);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e2
    public final com.fyber.inneractive.sdk.protobuf.z0 getDefaultInstanceForType() {
        return (com.fyber.inneractive.sdk.protobuf.z0) dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.GET_DEFAULT_INSTANCE);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public final com.fyber.inneractive.sdk.protobuf.t0 newBuilderForType() {
        return (com.fyber.inneractive.sdk.protobuf.t0) dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.NEW_BUILDER);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public final com.fyber.inneractive.sdk.protobuf.t0 toBuilder() {
        com.fyber.inneractive.sdk.protobuf.t0 t0Var = (com.fyber.inneractive.sdk.protobuf.t0) dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.NEW_BUILDER);
        t0Var.c();
        com.fyber.inneractive.sdk.protobuf.t0.a(t0Var.b, this);
        return t0Var;
    }

    public static com.fyber.inneractive.sdk.protobuf.j1 mutableCopy(com.fyber.inneractive.sdk.protobuf.j1 j1Var) {
        com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) j1Var;
        int i = u1Var.c;
        return u1Var.b(i == 0 ? 10 : i * 2);
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseDelimitedFrom(T t, java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (T) a(a(t, inputStream, h0Var));
    }

    public static com.fyber.inneractive.sdk.protobuf.z0 a(com.fyber.inneractive.sdk.protobuf.z0 z0Var, java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            if ((read & 128) != 0) {
                read &= 127;
                int i = 7;
                while (true) {
                    if (i < 32) {
                        int read2 = inputStream.read();
                        if (read2 == -1) {
                            throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        read |= (read2 & 127) << i;
                        if ((read2 & 128) == 0) {
                            break;
                        }
                        i += 7;
                    } else {
                        while (i < 64) {
                            int read3 = inputStream.read();
                            if (read3 == -1) {
                                throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                            if ((read3 & 128) != 0) {
                                i += 7;
                            }
                        }
                        throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered a malformed varint.");
                    }
                }
            }
            com.fyber.inneractive.sdk.protobuf.u uVar = new com.fyber.inneractive.sdk.protobuf.u(new com.fyber.inneractive.sdk.protobuf.a(inputStream, read));
            com.fyber.inneractive.sdk.protobuf.z0 parsePartialFrom = parsePartialFrom(z0Var, uVar, h0Var);
            uVar.a(0);
            return parsePartialFrom;
        } catch (java.io.IOException e) {
            throw new com.fyber.inneractive.sdk.protobuf.n1(e.getMessage());
        }
    }

    public static com.fyber.inneractive.sdk.protobuf.f1 mutableCopy(com.fyber.inneractive.sdk.protobuf.f1 f1Var) {
        com.fyber.inneractive.sdk.protobuf.q0 q0Var = (com.fyber.inneractive.sdk.protobuf.q0) f1Var;
        int i = q0Var.c;
        return q0Var.b(i == 0 ? 10 : i * 2);
    }

    public static com.fyber.inneractive.sdk.protobuf.c1 mutableCopy(com.fyber.inneractive.sdk.protobuf.c1 c1Var) {
        com.fyber.inneractive.sdk.protobuf.d0 d0Var = (com.fyber.inneractive.sdk.protobuf.d0) c1Var;
        int i = d0Var.c;
        return d0Var.b(i == 0 ? 10 : i * 2);
    }

    public static com.fyber.inneractive.sdk.protobuf.b1 mutableCopy(com.fyber.inneractive.sdk.protobuf.b1 b1Var) {
        com.fyber.inneractive.sdk.protobuf.j jVar = (com.fyber.inneractive.sdk.protobuf.j) b1Var;
        int i = jVar.c;
        return jVar.b(i == 0 ? 10 : i * 2);
    }

    public static <E> com.fyber.inneractive.sdk.protobuf.k1 mutableCopy(com.fyber.inneractive.sdk.protobuf.k1 k1Var) {
        int size = k1Var.size();
        return k1Var.b(size == 0 ? 10 : size * 2);
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseFrom(T t, java.io.InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        com.fyber.inneractive.sdk.protobuf.w uVar;
        if (inputStream == null) {
            byte[] bArr = com.fyber.inneractive.sdk.protobuf.l1.b;
            int length = bArr.length;
            uVar = new com.fyber.inneractive.sdk.protobuf.t(bArr, 0, length, false);
            try {
                uVar.d(length);
            } catch (com.fyber.inneractive.sdk.protobuf.n1 e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } else {
            uVar = new com.fyber.inneractive.sdk.protobuf.u(inputStream);
        }
        return (T) a(parsePartialFrom(t, uVar, h0Var));
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parsePartialFrom(T t, byte[] bArr, int i, int i2, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        T t2 = (T) t.dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.NEW_MUTABLE_INSTANCE);
        try {
            com.fyber.inneractive.sdk.protobuf.p2 p2Var = com.fyber.inneractive.sdk.protobuf.p2.c;
            p2Var.getClass();
            com.fyber.inneractive.sdk.protobuf.t2 a2 = p2Var.a(t2.getClass());
            a2.a(t2, bArr, i, i + i2, new com.fyber.inneractive.sdk.protobuf.f(h0Var));
            a2.c(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new java.lang.RuntimeException();
        } catch (java.io.IOException e) {
            if (e.getCause() instanceof com.fyber.inneractive.sdk.protobuf.n1) {
                throw ((com.fyber.inneractive.sdk.protobuf.n1) e.getCause());
            }
            throw new com.fyber.inneractive.sdk.protobuf.n1(e.getMessage());
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parsePartialFrom(T t, com.fyber.inneractive.sdk.protobuf.w wVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (T) parsePartialFrom(t, wVar, com.fyber.inneractive.sdk.protobuf.h0.a());
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseFrom(T t, java.nio.ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        com.fyber.inneractive.sdk.protobuf.t tVar;
        com.fyber.inneractive.sdk.protobuf.w vVar;
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            int position = byteBuffer.position() + byteBuffer.arrayOffset();
            int remaining = byteBuffer.remaining();
            tVar = new com.fyber.inneractive.sdk.protobuf.t(array, position, remaining, false);
            try {
                tVar.d(remaining);
            } catch (com.fyber.inneractive.sdk.protobuf.n1 e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } else {
            if (byteBuffer.isDirect() && com.fyber.inneractive.sdk.protobuf.x3.d) {
                vVar = new com.fyber.inneractive.sdk.protobuf.v(byteBuffer, false);
                return (T) a(parseFrom(t, vVar, h0Var));
            }
            int remaining2 = byteBuffer.remaining();
            byte[] bArr = new byte[remaining2];
            byteBuffer.duplicate().get(bArr);
            com.fyber.inneractive.sdk.protobuf.t tVar2 = new com.fyber.inneractive.sdk.protobuf.t(bArr, 0, remaining2, true);
            try {
                tVar2.d(remaining2);
                tVar = tVar2;
            } catch (com.fyber.inneractive.sdk.protobuf.n1 e2) {
                throw new java.lang.IllegalArgumentException(e2);
            }
        }
        vVar = tVar;
        return (T) a(parseFrom(t, vVar, h0Var));
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseFrom(T t, java.nio.ByteBuffer byteBuffer) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (T) parseFrom(t, byteBuffer, com.fyber.inneractive.sdk.protobuf.h0.a());
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseFrom(T t, com.fyber.inneractive.sdk.protobuf.s sVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (T) a(parseFrom(t, sVar, com.fyber.inneractive.sdk.protobuf.h0.a()));
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseFrom(T t, com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        com.fyber.inneractive.sdk.protobuf.w d = sVar.d();
        com.fyber.inneractive.sdk.protobuf.z0 parsePartialFrom = parsePartialFrom(t, d, h0Var);
        d.a(0);
        return (T) a(parsePartialFrom);
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseFrom(T t, byte[] bArr) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (T) a(parsePartialFrom(t, bArr, 0, bArr.length, com.fyber.inneractive.sdk.protobuf.h0.a()));
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseFrom(T t, byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (T) a(parsePartialFrom(t, bArr, 0, bArr.length, h0Var));
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseFrom(T t, com.fyber.inneractive.sdk.protobuf.w wVar) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (T) parseFrom(t, wVar, com.fyber.inneractive.sdk.protobuf.h0.a());
    }

    public static <T extends com.fyber.inneractive.sdk.protobuf.z0> T parseFrom(T t, com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws com.fyber.inneractive.sdk.protobuf.n1 {
        return (T) a(parsePartialFrom(t, wVar, h0Var));
    }
}
