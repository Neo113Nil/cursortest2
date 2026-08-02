package g0;

import W5.RunnableC0493d;
import java.util.ArrayList;
import w1.C1722m0;
import w1.F0;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123e extends p3.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1124f f13015d;

    public C1123e(C1124f c1124f) {
        super(24);
        this.f13015d = c1124f;
    }

    @Override // p3.f
    public final void T(Throwable th) {
        this.f13015d.f13016a.d(th);
    }

    @Override // p3.f
    public final void U(F0 f02) {
        C1124f c1124f = this.f13015d;
        c1124f.f13018c = f02;
        c1124f.f13017b = new com.google.android.gms.common.internal.w(c1124f.f13018c, new C1722m0(17), c1124f.f13016a.f13030h);
        j jVar = c1124f.f13016a;
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        jVar.f13023a.writeLock().lock();
        try {
            jVar.f13025c = 1;
            arrayList.addAll(jVar.f13024b);
            jVar.f13024b.clear();
            jVar.f13023a.writeLock().unlock();
            jVar.f13026d.post(new RunnableC0493d(arrayList, jVar.f13025c, (Throwable) null));
        } catch (Throwable th) {
            jVar.f13023a.writeLock().unlock();
            throw th;
        }
    }
}
