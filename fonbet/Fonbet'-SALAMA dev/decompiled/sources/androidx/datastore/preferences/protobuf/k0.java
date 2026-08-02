package androidx.datastore.preferences.protobuf;

import n3.AbstractC1464a;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1464a f9221a;

    static {
        f9221a = (h0.f9198e && h0.f9197d && !AbstractC0679c.a()) ? new i0(1) : new i0(0);
    }

    public static int a(String str) {
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && str.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = str.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = str.length();
                while (i8 < length2) {
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i8) < 65536) {
                                throw new j0(i8, length2);
                            }
                            i8++;
                        }
                    }
                    i8++;
                }
                i9 += i7;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }
}
