package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class b implements com.fyber.inneractive.sdk.protobuf.d2 {
    protected int memoizedHashCode = 0;

    @java.lang.Deprecated
    public static <T> void addAll(java.lang.Iterable<T> iterable, java.util.Collection<? super T> collection) {
        com.fyber.inneractive.sdk.protobuf.t0.a(iterable, (java.util.List) collection);
    }

    public static void checkByteStringIsUtf8(com.fyber.inneractive.sdk.protobuf.s sVar) throws java.lang.IllegalArgumentException {
        if (!sVar.c()) {
            throw new java.lang.IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public abstract int getMemoizedSerializedSize();

    public int getSerializedSize(com.fyber.inneractive.sdk.protobuf.t2 t2Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int b = t2Var.b(this);
        setMemoizedSerializedSize(b);
        return b;
    }

    public com.fyber.inneractive.sdk.protobuf.m3 newUninitializedMessageException() {
        return new com.fyber.inneractive.sdk.protobuf.m3();
    }

    public abstract void setMemoizedSerializedSize(int i);

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
            com.fyber.inneractive.sdk.protobuf.y yVar = new com.fyber.inneractive.sdk.protobuf.y(serializedSize, bArr);
            writeTo(yVar);
            if (yVar.a() == 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public com.fyber.inneractive.sdk.protobuf.s toByteString() {
        try {
            int serializedSize = getSerializedSize();
            com.fyber.inneractive.sdk.protobuf.q qVar = com.fyber.inneractive.sdk.protobuf.s.b;
            byte[] bArr = new byte[serializedSize];
            java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
            com.fyber.inneractive.sdk.protobuf.y yVar = new com.fyber.inneractive.sdk.protobuf.y(serializedSize, bArr);
            writeTo(yVar);
            if (yVar.a() == 0) {
                return new com.fyber.inneractive.sdk.protobuf.q(bArr);
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public void writeDelimitedTo(java.io.OutputStream outputStream) throws java.io.IOException {
        int serializedSize = getSerializedSize();
        int c = com.fyber.inneractive.sdk.protobuf.b0.c(serializedSize) + serializedSize;
        if (c > 4096) {
            c = 4096;
        }
        com.fyber.inneractive.sdk.protobuf.a0 a0Var = new com.fyber.inneractive.sdk.protobuf.a0(outputStream, c);
        a0Var.j(5);
        a0Var.i(serializedSize);
        writeTo(a0Var);
        if (a0Var.f > 0) {
            a0Var.a();
        }
    }

    public void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        int serializedSize = getSerializedSize();
        java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        com.fyber.inneractive.sdk.protobuf.a0 a0Var = new com.fyber.inneractive.sdk.protobuf.a0(outputStream, serializedSize);
        writeTo(a0Var);
        if (a0Var.f > 0) {
            a0Var.a();
        }
    }

    public static <T> void addAll(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        com.fyber.inneractive.sdk.protobuf.t0.a(iterable, list);
    }
}
