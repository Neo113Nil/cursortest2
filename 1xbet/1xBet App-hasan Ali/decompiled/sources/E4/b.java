package E4;

import C4.k;
import C4.m;
import L4.C;
import L4.C0226i;
import L4.I;
import L4.K;
import L4.r;
import java.io.IOException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class b implements I {

    /* renamed from: k, reason: collision with root package name */
    public final r f1487k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1488l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f1489m;

    public b(m mVar) {
        this.f1489m = mVar;
        this.f1487k = new r(((C) mVar.f911d).f3050k.c());
    }

    public final void b() {
        m mVar = this.f1489m;
        int i = mVar.f908a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + mVar.f908a);
        }
        r rVar = this.f1487k;
        K k5 = rVar.f3109e;
        rVar.f3109e = K.f3065d;
        k5.a();
        k5.b();
        mVar.f908a = 6;
    }

    @Override // L4.I
    public final K c() {
        return this.f1487k;
    }

    @Override // L4.I
    public long e(C0226i c0226i, long j5) {
        m mVar = this.f1489m;
        l.f("sink", c0226i);
        try {
            return ((C) mVar.f911d).e(c0226i, j5);
        } catch (IOException e3) {
            ((k) mVar.f910c).l();
            b();
            throw e3;
        }
    }
}
