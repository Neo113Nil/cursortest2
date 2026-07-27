package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes.dex */
public final class Q1 extends AbstractC0190g1 {
    private static final Q1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private U1 zzh;

    static {
        Q1 q12 = new Q1();
        zzb = q12;
        AbstractC0190g1.k(Q1.class, q12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.play_billing.D1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.play_billing.g1, java.lang.Object] */
    public static Q1 n(byte[] bArr, AbstractC0172a1 abstractC0172a1) {
        Q1 q12 = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r22 = (AbstractC0190g1) q12.d(4);
            try {
                ?? a3 = A1.f2595c.a(r22.getClass());
                V0 v0 = new V0();
                abstractC0172a1.getClass();
                a3.b(r22, bArr, 0, length, v0);
                a3.a(r22);
                q12 = r22;
            } catch (G1 e3) {
                throw new C0211n1(e3.getMessage());
            } catch (C0211n1 e4) {
                throw e4;
            } catch (IOException e5) {
                if (e5.getCause() instanceof C0211n1) {
                    throw ((C0211n1) e5.getCause());
                }
                throw new C0211n1(e5.getMessage(), e5);
            } catch (IndexOutOfBoundsException unused) {
                throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (q12 == null || AbstractC0190g1.m(q12, true)) {
            return q12;
        }
        throw new C0211n1(new G1().getMessage());
    }

    public static /* synthetic */ void o(Q1 q12, U1 u1) {
        q12.zzh = u1;
        q12.zzd |= 2;
    }

    public static /* synthetic */ void p(Q1 q12, e2 e2Var) {
        q12.zzf = e2Var;
        q12.zze = 4;
    }

    public static /* synthetic */ void q(Q1 q12, int i3) {
        q12.zzg = i3 - 1;
        q12.zzd |= 1;
    }

    public static P1 r() {
        return (P1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0190g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", R0.f2670c, "zzh", e2.class});
        }
        if (i4 == 3) {
            return new Q1();
        }
        if (i4 == 4) {
            return new P1(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
