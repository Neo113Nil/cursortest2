package com.google.common.collect;

import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.google.common.collect.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0971t {
    public static final kotlinx.serialization.internal.S a(String name, kotlinx.serialization.b primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new kotlinx.serialization.internal.S(name, new kotlinx.serialization.internal.T(primitiveSerializer));
    }

    public static Object b(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static int c(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int d(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        g(r12, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = c(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int b = C.b(obj);
        int i2 = b & i;
        int f = f(i2, obj3);
        if (f != 0) {
            int i3 = ~i;
            int i4 = b & i3;
            int i5 = -1;
            while (true) {
                int i6 = f - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) != i4 || !com.google.common.base.i.a(obj, objArr[i6]) || (objArr2 != null && !com.google.common.base.i.a(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    f = i8;
                }
            }
        }
        return -1;
    }

    public static int f(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & UByte.MAX_VALUE : obj instanceof short[] ? ((short[]) obj)[i] & UShort.MAX_VALUE : ((int[]) obj)[i];
    }

    public static void g(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int h(int i) {
        int max = Math.max(i + 1, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
            highestOneBit = 1073741824;
        }
        return Math.max(4, highestOneBit);
    }
}
