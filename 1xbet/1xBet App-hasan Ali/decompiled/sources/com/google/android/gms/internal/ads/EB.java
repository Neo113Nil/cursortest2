package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class EB extends AbstractC1400ot {

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f8469m = Logger.getLogger(EB.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f8470n = CC.f7975e;

    /* renamed from: l, reason: collision with root package name */
    public Ps f8471l;

    public static int o0(String str) {
        int length;
        try {
            length = EC.c(str);
        } catch (DC unused) {
            length = str.getBytes(VB.f11871a).length;
        }
        return p0(length) + length;
    }

    public static int p0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int q0(long j5) {
        return (640 - (Long.numberOfLeadingZeros(j5) * 9)) >>> 6;
    }

    public abstract void A0(int i);

    public abstract void B0(int i, AbstractC1464qB abstractC1464qB, InterfaceC1554sC interfaceC1554sC);

    public abstract void C0(String str, int i);

    public abstract void D0(int i, int i5);

    public abstract void E0(int i, int i5);

    public abstract void F0(int i);

    public abstract void G0(int i, long j5);

    public abstract void H0(long j5);

    public final void r0(String str, DC dc) {
        f8469m.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dc);
        byte[] bytes = str.getBytes(VB.f11871a);
        try {
            int length = bytes.length;
            F0(length);
            o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e3) {
            throw new N3.c(e3);
        }
    }

    public abstract void s0(byte b3);

    public abstract void t0(int i, boolean z3);

    public abstract void u0(int i, AbstractC1823yB abstractC1823yB);

    public abstract void v0(int i, int i5);

    public abstract void w0(int i);

    public abstract void x0(int i, long j5);

    public abstract void y0(long j5);

    public abstract void z0(int i, int i5);
}
