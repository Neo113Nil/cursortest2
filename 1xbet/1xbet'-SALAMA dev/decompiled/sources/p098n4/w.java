package p098n4;

import Q0.a;
import java.util.ArrayList;
import p046g0.g;
import v4.c;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f15495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.w f15496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f15497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D f15499q;

    public w(D d7, r rVar, com.google.android.gms.common.internal.w wVar, g gVar, ArrayList arrayList) {
        this.f15499q = d7;
        this.f15495m = rVar;
        this.f15496n = wVar;
        this.f15497o = gVar;
        this.f15498p = arrayList;
    }

    @Override // Q0.a
    public final void c0(Object obj, Object obj2) {
        c cVar = (c) obj;
        p120q4.c cVar2 = (p120q4.c) obj2;
        r rVar = this.f15495m;
        r rVarO = rVar != null ? rVar.o(cVar) : null;
        com.google.android.gms.common.internal.w wVar = this.f15496n;
        com.google.android.gms.common.internal.w wVar2 = new com.google.android.gms.common.internal.w(13, ((C0934g) wVar.f11335b).t(cVar), (M) wVar.f11336c);
        g gVarA = this.f15497o.a(cVar);
        if (gVarA != null) {
            this.f15498p.addAll(this.f15499q.e(gVarA, cVar2, rVarO, wVar2));
        }
    }
}
