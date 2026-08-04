package p046g0;

import W5.RunnableC0493d;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import p113p3.f;
import p155w1.C1013m0;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f13021d;

    public e(f fVar) {
        super(24);
        this.f13021d = fVar;
    }

    @Override // p113p3.f
    public final void T(Throwable th) {
        this.f13021d.f13022a.d(th);
    }

    @Override // p113p3.f
    public final void U(F0 f7) {
        f fVar = this.f13021d;
        fVar.f13024c = f7;
        fVar.f13023b = new w(fVar.f13024c, new C1013m0(17), fVar.f13022a.f13036h);
        j jVar = fVar.f13022a;
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        jVar.f13029a.writeLock().lock();
        try {
            jVar.f13031c = 1;
            arrayList.addAll(jVar.f13030b);
            jVar.f13030b.clear();
            jVar.f13029a.writeLock().unlock();
            jVar.f13032d.post(new RunnableC0493d(arrayList, jVar.f13031c, (Throwable) null));
        } catch (Throwable th) {
            jVar.f13029a.writeLock().unlock();
            throw th;
        }
    }
}
