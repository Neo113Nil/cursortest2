package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0865a implements Q {
    protected int memoizedHashCode;

    public abstract int b(c0 c0Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract AbstractC0884u d();

    public final byte[] e() {
        try {
            int b7 = ((AbstractC0886w) this).b(null);
            byte[] bArr = new byte[b7];
            C0876l c0876l = new C0876l(bArr, b7);
            f(c0876l);
            if (b7 - c0876l.j == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException(c("byte array"), e7);
        }
    }

    public abstract void f(C0876l c0876l);
}
