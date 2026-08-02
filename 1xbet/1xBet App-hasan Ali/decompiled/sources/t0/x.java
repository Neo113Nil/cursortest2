package t0;

import P.C0283b0;
import a3.AbstractC0467k;
import com.google.android.gms.internal.ads.C1071hd;

/* loaded from: classes.dex */
public final class x implements b0.n {

    /* renamed from: k, reason: collision with root package name */
    public Z0.d f19529k;

    /* renamed from: l, reason: collision with root package name */
    public C0283b0 f19530l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19531m;

    /* renamed from: n, reason: collision with root package name */
    public final C1071hd f19532n = new C1071hd(this);

    @Override // b0.p
    public final /* synthetic */ b0.p c(b0.p pVar) {
        return AbstractC0467k.d(this, pVar);
    }

    @Override // b0.p
    public final Object d(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    public final i4.c i() {
        Z0.d dVar = this.f19529k;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.l.k("onTouchEvent");
        throw null;
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }
}
