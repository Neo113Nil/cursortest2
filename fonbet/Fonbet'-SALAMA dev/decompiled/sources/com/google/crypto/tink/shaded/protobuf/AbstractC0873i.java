package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0873i implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0872h f11779b = new C0872h(A.f11703b);

    /* renamed from: c, reason: collision with root package name */
    public static final C0870f f11780c;

    /* renamed from: a, reason: collision with root package name */
    public int f11781a;

    static {
        f11780c = AbstractC0867c.a() ? new C0870f(1) : new C0870f(0);
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

    public static C0872h t(byte[] bArr, int i7, int i8) {
        byte[] copyOfRange;
        m(i7, i7 + i8, bArr.length);
        switch (f11780c.f11768a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                copyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, copyOfRange, 0, i8);
                break;
        }
        return new C0872h(copyOfRange);
    }

    public final int hashCode() {
        int i7 = this.f11781a;
        if (i7 == 0) {
            int size = size();
            C0872h c0872h = (C0872h) this;
            int A7 = c0872h.A();
            int i8 = size;
            for (int i9 = A7; i9 < A7 + size; i9++) {
                i8 = (i8 * 31) + c0872h.f11777d[i9];
            }
            i7 = i8 == 0 ? 1 : i8;
            this.f11781a = i7;
        }
        return i7;
    }

    public abstract byte l(int i7);

    public abstract int size();

    public final String toString() {
        C0872h c0871g;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = p3.f.E(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            C0872h c0872h = (C0872h) this;
            int m7 = m(0, 47, c0872h.size());
            if (m7 == 0) {
                c0871g = f11779b;
            } else {
                c0871g = new C0871g(c0872h.f11777d, c0872h.A(), m7);
            }
            sb2.append(p3.f.E(c0871g));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return e1.k.i(sb3, sb, "\">");
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
