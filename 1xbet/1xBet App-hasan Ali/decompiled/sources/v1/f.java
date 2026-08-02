package v1;

import android.os.Build;
import com.google.android.gms.internal.ads.RunnableC0920e5;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f20339a;

    public f(g gVar) {
        this.f20339a = gVar;
    }

    @Override // v1.j
    public final void c(Throwable th) {
        this.f20339a.f20340a.f(th);
    }

    @Override // v1.j
    public final void d(m2.g gVar) {
        g gVar2 = this.f20339a;
        gVar2.f20342c = gVar;
        m2.g gVar3 = gVar2.f20342c;
        k kVar = gVar2.f20340a;
        gVar2.f20341b = new v3.e(gVar3, kVar.f20350g, kVar.i, Build.VERSION.SDK_INT >= 34 ? m.a() : v.r.d());
        k kVar2 = gVar2.f20340a;
        kVar2.getClass();
        ArrayList arrayList = new ArrayList();
        kVar2.f20345a.writeLock().lock();
        try {
            kVar2.f20347c = 1;
            arrayList.addAll(kVar2.f20346b);
            kVar2.f20346b.clear();
            kVar2.f20345a.writeLock().unlock();
            kVar2.f20348d.post(new RunnableC0920e5(arrayList, kVar2.f20347c, (Throwable) null));
        } catch (Throwable th) {
            kVar2.f20345a.writeLock().unlock();
            throw th;
        }
    }
}
