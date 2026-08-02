package n4;

import g0.AbstractC1125g;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class w extends Q0.a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v4.r f15489m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.w f15490n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1125g f15491o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15492p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D f15493q;

    public w(D d7, v4.r rVar, com.google.android.gms.common.internal.w wVar, AbstractC1125g abstractC1125g, ArrayList arrayList) {
        this.f15493q = d7;
        this.f15489m = rVar;
        this.f15490n = wVar;
        this.f15491o = abstractC1125g;
        this.f15492p = arrayList;
    }

    @Override // Q0.a
    public final void c0(Object obj, Object obj2) {
        v4.c cVar = (v4.c) obj;
        q4.c cVar2 = (q4.c) obj2;
        v4.r rVar = this.f15489m;
        v4.r o7 = rVar != null ? rVar.o(cVar) : null;
        com.google.android.gms.common.internal.w wVar = this.f15490n;
        com.google.android.gms.common.internal.w wVar2 = new com.google.android.gms.common.internal.w(13, ((C1473g) wVar.f11335b).t(cVar), (M) wVar.f11336c);
        AbstractC1125g a2 = this.f15491o.a(cVar);
        if (a2 != null) {
            this.f15492p.addAll(this.f15493q.e(a2, cVar2, o7, wVar2));
        }
    }
}
