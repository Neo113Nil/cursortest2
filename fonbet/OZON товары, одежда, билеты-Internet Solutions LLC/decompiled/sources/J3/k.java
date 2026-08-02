package J3;

import F3.C3013s;
import J3.j;
import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import m3.N;
import p3.C8848h;
import p3.InterfaceC8846f;
import p3.x;

/* loaded from: classes8.dex */
public final class k<T> implements j.d {

    /* renamed from: b, reason: collision with root package name */
    public final p3.i f13818b;

    /* renamed from: d, reason: collision with root package name */
    private final x f13820d;

    /* renamed from: e, reason: collision with root package name */
    private final a<? extends T> f13821e;

    /* renamed from: f, reason: collision with root package name */
    private volatile T f13822f;

    /* renamed from: c, reason: collision with root package name */
    public final int f13819c = 4;

    /* renamed from: a, reason: collision with root package name */
    public final long f13817a = C3013s.a();

    public interface a<T> {
        Object a(Uri uri, C8848h c8848h) throws IOException;
    }

    public k(InterfaceC8846f interfaceC8846f, p3.i iVar, a aVar) {
        this.f13820d = new x(interfaceC8846f);
        this.f13818b = iVar;
        this.f13821e = aVar;
    }

    public static Object e(q3.c cVar, a aVar, p3.i iVar) throws IOException {
        k kVar = new k(cVar, iVar, aVar);
        kVar.load();
        T t2 = kVar.f13822f;
        t2.getClass();
        return t2;
    }

    public final long a() {
        return this.f13820d.i();
    }

    public final Map<String, List<String>> b() {
        return this.f13820d.k();
    }

    public final T c() {
        return this.f13822f;
    }

    @Override // J3.j.d
    public final void cancelLoad() {
    }

    public final Uri d() {
        return this.f13820d.j();
    }

    @Override // J3.j.d
    public final void load() throws IOException {
        this.f13820d.l();
        C8848h c8848h = new C8848h(this.f13820d, this.f13818b);
        try {
            c8848h.c();
            Uri uri = this.f13820d.getUri();
            uri.getClass();
            this.f13822f = (T) this.f13821e.a(uri, c8848h);
        } finally {
            N.g(c8848h);
        }
    }
}
