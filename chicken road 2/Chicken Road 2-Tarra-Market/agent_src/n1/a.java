package n1;

import java.io.IOException;
import s1.i;
import s1.s;
import s1.u;

/* loaded from: classes.dex */
public abstract class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final i f6175a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6176b;

    /* renamed from: c, reason: collision with root package name */
    public long f6177c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f6178d;

    public a(g gVar) {
        this.f6178d = gVar;
        this.f6175a = new i(gVar.f6194c.f6639b.d());
    }

    public final void a(boolean z2, IOException iOException) {
        g gVar = this.f6178d;
        int i2 = gVar.f6196e;
        if (i2 == 6) {
            return;
        }
        if (i2 != 5) {
            throw new IllegalStateException("state: " + gVar.f6196e);
        }
        i iVar = this.f6175a;
        u uVar = iVar.f6624e;
        iVar.f6624e = u.f6653d;
        uVar.a();
        uVar.b();
        gVar.f6196e = 6;
        l1.g gVar2 = gVar.f6193b;
        if (gVar2 != null) {
            gVar2.h(!z2, gVar, iOException);
        }
    }

    @Override // s1.s
    public long c(s1.e eVar, long j2) {
        try {
            long c2 = this.f6178d.f6194c.c(eVar, j2);
            if (c2 > 0) {
                this.f6177c += c2;
            }
            return c2;
        } catch (IOException e2) {
            a(false, e2);
            throw e2;
        }
    }

    @Override // s1.s
    public final u d() {
        return this.f6175a;
    }
}
