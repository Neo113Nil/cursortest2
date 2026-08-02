package N5;

import E0.C2942q;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import sf.C9674B;
import sf.C9681g;
import sf.C9684j;
import sf.G;

/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f18688e = new String[UserVerificationMethods.USER_VERIFY_PATTERN];

    /* renamed from: a, reason: collision with root package name */
    int f18689a;

    /* renamed from: b, reason: collision with root package name */
    int[] f18690b;

    /* renamed from: c, reason: collision with root package name */
    String[] f18691c;

    /* renamed from: d, reason: collision with root package name */
    int[] f18692d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String[] f18693a;

        /* renamed from: b, reason: collision with root package name */
        final C9674B f18694b;

        private a(String[] strArr, C9674B c9674b) {
            this.f18693a = strArr;
            this.f18694b = c9674b;
        }

        public static a a(String... strArr) {
            try {
                C9684j[] c9684jArr = new C9684j[strArr.length];
                C9681g c9681g = new C9681g();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    c.c(c9681g, strArr[i11]);
                    c9681g.readByte();
                    c9684jArr[i11] = c9681g.v0();
                }
                String[] strArr2 = (String[]) strArr.clone();
                int i12 = C9674B.f98649d;
                return new a(strArr2, C9674B.a.b(c9684jArr));
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BEGIN_ARRAY;
        public static final b BEGIN_OBJECT;
        public static final b BOOLEAN;
        public static final b END_ARRAY;
        public static final b END_DOCUMENT;
        public static final b END_OBJECT;
        public static final b NAME;
        public static final b NULL;
        public static final b NUMBER;
        public static final b STRING;

        static {
            b bVar = new b("BEGIN_ARRAY", 0);
            BEGIN_ARRAY = bVar;
            b bVar2 = new b("END_ARRAY", 1);
            END_ARRAY = bVar2;
            b bVar3 = new b("BEGIN_OBJECT", 2);
            BEGIN_OBJECT = bVar3;
            b bVar4 = new b("END_OBJECT", 3);
            END_OBJECT = bVar4;
            b bVar5 = new b("NAME", 4);
            NAME = bVar5;
            b bVar6 = new b("STRING", 5);
            STRING = bVar6;
            b bVar7 = new b("NUMBER", 6);
            NUMBER = bVar7;
            b bVar8 = new b("BOOLEAN", 7);
            BOOLEAN = bVar8;
            b bVar9 = new b("NULL", 8);
            NULL = bVar9;
            b bVar10 = new b("END_DOCUMENT", 9);
            END_DOCUMENT = bVar10;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f18688e[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f18688e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void c(C9681g c9681g, String str) throws IOException {
        int i11;
        String str2;
        String[] strArr = f18688e;
        c9681g.d0(34);
        int length = str.length();
        int i12 = 0;
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i11 = str2 == null ? i11 + 1 : 0;
                if (i12 < i11) {
                    c9681g.D0(i12, i11, str);
                }
                c9681g.H0(str2);
                i12 = i11 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i12 < i11) {
                }
                c9681g.H0(str2);
                i12 = i11 + 1;
            }
        }
        if (i12 < length) {
            c9681g.D0(i12, length, str);
        }
        c9681g.d0(34);
    }

    public static c k(G g10) {
        return new d(g10);
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    public final String d() {
        int i11 = this.f18689a;
        int[] iArr = this.f18690b;
        String[] strArr = this.f18691c;
        int[] iArr2 = this.f18692d;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i13 == 1 || i13 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i12]);
                sb2.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append('.');
                String str = strArr[i12];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public abstract boolean hasNext() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract b m() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract String nextString() throws IOException;

    final void o(int i11) {
        int i12 = this.f18689a;
        int[] iArr = this.f18690b;
        if (i12 == iArr.length) {
            if (i12 == 256) {
                throw new N5.a("Nesting too deep at " + d());
            }
            this.f18690b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f18691c;
            this.f18691c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f18692d;
            this.f18692d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f18690b;
        int i13 = this.f18689a;
        this.f18689a = i13 + 1;
        iArr3[i13] = i11;
    }

    public abstract int p(a aVar) throws IOException;

    public abstract void q() throws IOException;

    final void r(String str) throws N5.b {
        StringBuilder e11 = C2942q.e(str, " at path ");
        e11.append(d());
        throw new N5.b(e11.toString());
    }

    public abstract void skipValue() throws IOException;
}
