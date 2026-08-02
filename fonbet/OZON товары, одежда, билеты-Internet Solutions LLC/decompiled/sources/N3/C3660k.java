package N3;

import N3.C3662m;
import T7.C4027i;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.z;
import java.lang.reflect.Constructor;
import m3.InterfaceC8064f;
import m3.r;
import u3.InterfaceC9928b;

/* renamed from: N3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3660k implements C3662m.a.InterfaceC0356a, B.b, z.a, O7.e, r.a {
    public static StringBuilder c(int i11, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(i11);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder d(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    @Override // N3.C3662m.a.InterfaceC0356a
    public Constructor a() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC3665p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    @Override // O7.e
    public Object apply(Object obj) {
        return new u3.t((InterfaceC8064f) obj);
    }

    @Override // com.google.crypto.tink.internal.z.a
    public com.google.crypto.tink.internal.G b(S7.q qVar) {
        return U7.b.b((C4027i) qVar);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(He.g gVar) {
        T7.G g10 = (T7.G) gVar;
        return U7.w.c(S7.n.a(g10.h().c()).b(g10.h().c()), g10.e());
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
