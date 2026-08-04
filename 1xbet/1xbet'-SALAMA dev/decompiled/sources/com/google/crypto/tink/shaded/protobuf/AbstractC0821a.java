package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0821a implements Q {
    protected int memoizedHashCode;

    public abstract int b(c0 c0Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract AbstractC0840u d();

    public final byte[] e() {
        try {
            int iB = ((AbstractC0842w) this).b(null);
            byte[] bArr = new byte[iB];
            C0832l c0832l = new C0832l(bArr, iB);
            f(c0832l);
            if (iB - c0832l.j == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException(c("byte array"), e7);
        }
    }

    public abstract void f(C0832l c0832l);
}
