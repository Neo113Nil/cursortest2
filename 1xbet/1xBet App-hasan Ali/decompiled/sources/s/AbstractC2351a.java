package s;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2351a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f19149a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f19150b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f19151c = new Object[0];

    public static final int a(int i, int i5, int[] iArr) {
        l.f("array", iArr);
        int i6 = i - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i5) {
                i7 = i8 + 1;
            } else {
                if (i9 <= i5) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }

    public static final int b(long[] jArr, int i, long j5) {
        l.f("array", jArr);
        int i5 = i - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            long j6 = jArr[i7];
            if (j6 < j5) {
                i6 = i7 + 1;
            } else {
                if (j6 <= j5) {
                    return i7;
                }
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }

    public static final void c(String str) {
        l.f("message", str);
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        l.f("message", str);
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        l.f("message", str);
        throw new NoSuchElementException(str);
    }
}
