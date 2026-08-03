package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class z extends java.io.IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public z(java.lang.IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public z(java.lang.String str, java.lang.IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
