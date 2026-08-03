package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class d4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.fyber.inneractive.sdk.protobuf.z3 f4185a;

    static {
        f4185a = (com.fyber.inneractive.sdk.protobuf.x3.e && com.fyber.inneractive.sdk.protobuf.x3.d && !com.fyber.inneractive.sdk.protobuf.d.a()) ? new com.fyber.inneractive.sdk.protobuf.c4() : new com.fyber.inneractive.sdk.protobuf.a4();
    }

    public static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int a(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(charSequence, i2) < 65536) {
                                throw new com.fyber.inneractive.sdk.protobuf.b4(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }
}
