package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0829i implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0828h f11779b = new C0828h(A.f11703b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0826f f11780c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11781a;

    static {
        f11780c = AbstractC0823c.a() ? new C0826f(1) : new C0826f(0);
    }

    public static int m(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.f(i7, "Beginning index: ", " < 0"));
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0486a1.e(i8, i9, "End index: ", " >= "));
    }

    public static C0828h t(byte[] bArr, int i7, int i8) {
        byte[] bArrCopyOfRange;
        m(i7, i7 + i8, bArr.length);
        switch (f11780c.f11768a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                bArrCopyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, bArrCopyOfRange, 0, i8);
                break;
        }
        return new C0828h(bArrCopyOfRange);
    }

    public final int hashCode() {
        int i7 = this.f11781a;
        if (i7 == 0) {
            int size = size();
            C0828h c0828h = (C0828h) this;
            int iA = c0828h.A();
            int i8 = size;
            for (int i9 = iA; i9 < iA + size; i9++) {
                i8 = (i8 * 31) + c0828h.f11777d[i9];
            }
            i7 = i8 == 0 ? 1 : i8;
            this.f11781a = i7;
        }
        return i7;
    }

    public abstract byte l(int i7);

    public abstract int size();

    public final String toString() {
        C0828h c0827g;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = p113p3.f.E(this);
        } else {
            StringBuilder sb = new StringBuilder();
            C0828h c0828h = (C0828h) this;
            int iM = m(0, 47, c0828h.size());
            if (iM == 0) {
                c0827g = f11779b;
            } else {
                c0827g = new C0827g(c0828h.f11777d, c0828h.A(), iM);
            }
            sb.append(p113p3.f.E(c0827g));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return p031e1.k.i(sb2, string, "\">");
    }

    public abstract void y(int i7, byte[] bArr);

    public final byte[] z() {
        int size = size();
        if (size == 0) {
            return A.f11703b;
        }
        byte[] bArr = new byte[size];
        y(size, bArr);
        return bArr;
    }
}
