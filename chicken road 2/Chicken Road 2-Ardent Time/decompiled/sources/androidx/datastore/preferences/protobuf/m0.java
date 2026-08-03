package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0.AbstractC0995a f2342a;

    static {
        f2342a = (androidx.datastore.preferences.protobuf.j0.f2327d && androidx.datastore.preferences.protobuf.j0.f2326c && !androidx.datastore.preferences.protobuf.AbstractC0067c.a()) ? new androidx.datastore.preferences.protobuf.k0(1) : new androidx.datastore.preferences.protobuf.k0(0);
    }

    public static int a(java.lang.String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = str.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = str.length();
                while (i3 < length2) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(str, i3) < 65536) {
                                throw new androidx.datastore.preferences.protobuf.l0(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (i4 + 4294967296L));
    }
}
