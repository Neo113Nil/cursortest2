package Z4;

import T4.C0152b;
import T4.o;
import T4.q;
import T4.u;
import Y4.h;
import j5.j;
import j5.w;
import j5.y;
import java.io.IOException;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class a implements w {

    /* renamed from: a, reason: collision with root package name */
    public final q f3792a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3793b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f3795d;

    public a(g gVar, q url) {
        i.e(url, "url");
        this.f3795d = gVar;
        this.f3792a = url;
        this.f3793b = new j(((j5.q) gVar.f3811c.f312c).f10518a.d());
    }

    public final void a(o trailers) {
        u uVar;
        C0152b c0152b;
        i.e(trailers, "trailers");
        g gVar = this.f3795d;
        int i2 = gVar.f3812d;
        if (i2 == 6) {
            return;
        }
        if (i2 != 5) {
            throw new IllegalStateException("state: " + gVar.f3812d);
        }
        j jVar = this.f3793b;
        y yVar = jVar.f10500e;
        jVar.f10500e = y.f10533d;
        yVar.a();
        yVar.b();
        gVar.f3812d = 6;
        if (trailers.size() <= 0 || (uVar = gVar.f3809a) == null || (c0152b = uVar.f2969j) == null) {
            return;
        }
        h.b(c0152b, this.f3792a, trailers);
    }

    @Override // j5.w
    public final y d() {
        return this.f3793b;
    }

    @Override // j5.w
    public long s(j5.f sink, long j2) {
        g gVar = this.f3795d;
        i.e(sink, "sink");
        try {
            return ((j5.q) gVar.f3811c.f312c).s(sink, j2);
        } catch (IOException e3) {
            gVar.f3810b.h();
            a(g.f3808f);
            throw e3;
        }
    }
}
