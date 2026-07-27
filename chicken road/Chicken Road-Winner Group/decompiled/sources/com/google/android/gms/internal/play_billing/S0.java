package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class S0 {
    protected int zza;

    public abstract int a(D1 d12);

    public final byte[] b() {
        try {
            AbstractC0190g1 abstractC0190g1 = (AbstractC0190g1) this;
            int e3 = abstractC0190g1.e();
            byte[] bArr = new byte[e3];
            Z0 z02 = new Z0(e3, bArr);
            D1 a3 = A1.f2595c.a(abstractC0190g1.getClass());
            C0222r1 c0222r1 = z02.f2719b;
            if (c0222r1 == null) {
                c0222r1 = new C0222r1(z02);
            }
            a3.h(abstractC0190g1, c0222r1);
            if (e3 - z02.f2722e == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            throw new RuntimeException(B0.c.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e4);
        }
    }
}
