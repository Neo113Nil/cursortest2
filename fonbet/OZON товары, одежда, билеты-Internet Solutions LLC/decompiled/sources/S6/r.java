package S6;

import C.o0;
import S6.j;
import android.util.Base64;

/* loaded from: classes9.dex */
public abstract class r {

    public static abstract class a {
        public abstract r a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(Q6.e eVar);
    }

    public static a a() {
        j.a aVar = new j.a();
        aVar.d(Q6.e.DEFAULT);
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract Q6.e d();

    public final String toString() {
        String b11 = b();
        Q6.e d11 = d();
        String encodeToString = c() == null ? "" : Base64.encodeToString(c(), 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(b11);
        sb2.append(", ");
        sb2.append(d11);
        sb2.append(", ");
        return o0.c(sb2, encodeToString, ")");
    }
}
