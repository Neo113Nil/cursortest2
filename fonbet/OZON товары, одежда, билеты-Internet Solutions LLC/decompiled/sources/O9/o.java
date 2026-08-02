package O9;

import java.util.Comparator;

/* loaded from: classes9.dex */
final class o implements Comparator<N9.m> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ N9.m f20123a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f20124b;

    o(p pVar, N9.m mVar) {
        this.f20124b = pVar;
        this.f20123a = mVar;
    }

    @Override // java.util.Comparator
    public final int compare(N9.m mVar, N9.m mVar2) {
        p pVar = this.f20124b;
        N9.m mVar3 = this.f20123a;
        return Float.compare(pVar.a(mVar2, mVar3), pVar.a(mVar, mVar3));
    }
}
