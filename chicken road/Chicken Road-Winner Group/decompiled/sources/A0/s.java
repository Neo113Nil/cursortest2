package A0;

import android.content.Context;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import x0.C1249b;
import y0.C1251a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static volatile m f85e;

    /* renamed from: a, reason: collision with root package name */
    public final P0.j f86a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.j f87b;

    /* renamed from: c, reason: collision with root package name */
    public final F0.d f88c;

    /* renamed from: d, reason: collision with root package name */
    public final G0.l f89d;

    public s(P0.j jVar, P0.j jVar2, F0.d dVar, G0.l lVar, G0.n nVar) {
        this.f86a = jVar;
        this.f87b = jVar2;
        this.f88c = dVar;
        this.f89d = lVar;
        nVar.getClass();
        nVar.f429a.execute(new G0.m(0, nVar));
    }

    public static s a() {
        m mVar = f85e;
        if (mVar != null) {
            return (s) mVar.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f85e == null) {
            synchronized (s.class) {
                try {
                    if (f85e == null) {
                        l lVar = new l();
                        context.getClass();
                        lVar.f72a = context;
                        f85e = lVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final j c(C1251a c1251a) {
        byte[] bytes;
        Set unmodifiableSet = c1251a != null ? Collections.unmodifiableSet(C1251a.f10570d) : Collections.singleton(new C1249b("proto"));
        j a3 = k.a();
        c1251a.getClass();
        a3.f66b = "cct";
        String str = c1251a.f10572a;
        String str2 = c1251a.f10573b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName(CharEncoding.UTF_8));
        }
        a3.f67c = bytes;
        return new j(unmodifiableSet, a3.t(), this, 1);
    }
}
