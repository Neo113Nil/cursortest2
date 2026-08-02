package N3;

import android.util.Base64;
import com.google.common.collect.AbstractC5880y;
import e4.C6292a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import m3.C8050C;

/* loaded from: classes8.dex */
public final class P {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f18531a;

        public a(String[] strArr) {
            this.f18531a = strArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f18532a;

        public b(boolean z11) {
            this.f18532a = z11;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f18533a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18534b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18535c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18536d;

        /* renamed from: e, reason: collision with root package name */
        public final int f18537e;

        /* renamed from: f, reason: collision with root package name */
        public final int f18538f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f18539g;

        public c(int i11, int i12, int i13, int i14, int i15, int i16, byte[] bArr) {
            this.f18533a = i11;
            this.f18534b = i12;
            this.f18535c = i13;
            this.f18536d = i14;
            this.f18537e = i15;
            this.f18538f = i16;
            this.f18539g = bArr;
        }
    }

    public static int[] a(int i11) {
        if (i11 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i11 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i11 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i11 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i11 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i11) {
        int i12 = 0;
        while (i11 > 0) {
            i12++;
            i11 >>>= 1;
        }
        return i12;
    }

    public static j3.t c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = list.get(i11);
            int i12 = m3.N.f74289a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                m3.s.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(Z3.a.d(new C8050C(Base64.decode(split[1], 0))));
                } catch (RuntimeException e11) {
                    m3.s.g("VorbisUtil", "Failed to parse vorbis picture", e11);
                }
            } else {
                arrayList.add(new C6292a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new j3.t(arrayList);
    }

    public static AbstractC5880y<byte[]> d(byte[] bArr) {
        C8050C c8050c = new C8050C(bArr);
        c8050c.S(1);
        int i11 = 0;
        while (c8050c.a() > 0 && c8050c.m() == 255) {
            i11 += 255;
            c8050c.S(1);
        }
        int E11 = c8050c.E() + i11;
        int i12 = 0;
        while (c8050c.a() > 0 && c8050c.m() == 255) {
            i12 += 255;
            c8050c.S(1);
        }
        int E12 = c8050c.E() + i12;
        byte[] bArr2 = new byte[E11];
        int f7 = c8050c.f();
        System.arraycopy(bArr, f7, bArr2, 0, E11);
        int i13 = f7 + E11 + E12;
        int length = bArr.length - i13;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i13, bArr3, 0, length);
        return AbstractC5880y.C(bArr2, bArr3);
    }

    public static a e(C8050C c8050c, boolean z11, boolean z12) throws j3.v {
        if (z11) {
            f(3, c8050c, false);
        }
        c8050c.C((int) c8050c.v(), StandardCharsets.UTF_8);
        long v11 = c8050c.v();
        String[] strArr = new String[(int) v11];
        for (int i11 = 0; i11 < v11; i11++) {
            strArr[i11] = c8050c.C((int) c8050c.v(), StandardCharsets.UTF_8);
        }
        if (z12 && (c8050c.E() & 1) == 0) {
            throw j3.v.a(null, "framing bit expected to be set");
        }
        return new a(strArr);
    }

    public static boolean f(int i11, C8050C c8050c, boolean z11) throws j3.v {
        if (c8050c.a() < 7) {
            if (z11) {
                return false;
            }
            throw j3.v.a(null, "too short header: " + c8050c.a());
        }
        if (c8050c.E() != i11) {
            if (z11) {
                return false;
            }
            throw j3.v.a(null, "expected header type " + Integer.toHexString(i11));
        }
        if (c8050c.E() == 118 && c8050c.E() == 111 && c8050c.E() == 114 && c8050c.E() == 98 && c8050c.E() == 105 && c8050c.E() == 115) {
            return true;
        }
        if (z11) {
            return false;
        }
        throw j3.v.a(null, "expected characters 'vorbis'");
    }
}
