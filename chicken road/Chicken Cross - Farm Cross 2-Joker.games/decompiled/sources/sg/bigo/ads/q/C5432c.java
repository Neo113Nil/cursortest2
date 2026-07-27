package sg.bigo.ads.q;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.api.AdError;

/* renamed from: sg.bigo.ads.q.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5432c extends sg.bigo.ads.N.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f13239a;

    public C5432c(o oVar) {
        this.f13239a = oVar;
    }

    @Override // sg.bigo.ads.N.e
    public final void a(sg.bigo.ads.D.h hVar) {
        C5436g c5436g = this.f13239a.l;
        if (c5436g != null) {
            c5436g.a();
            this.f13239a.l = null;
        }
        C5436g c5436g2 = this.f13239a.m;
        if (c5436g2 != null) {
            c5436g2.a();
            this.f13239a.m = null;
        }
    }

    @Override // sg.bigo.ads.N.e
    public final void b(sg.bigo.ads.D.h hVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r1 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r1 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        r7 = r7 / r1;
     */
    @Override // sg.bigo.ads.N.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(sg.bigo.ads.D.h hVar) {
        sg.bigo.ads.r.c cVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ConcurrentHashMap concurrentHashMap;
        int a2;
        int indexOf;
        int i;
        o oVar = this.f13239a;
        boolean z = oVar.p;
        if (z) {
            cVar = oVar.b;
            arrayList = oVar.u;
            arrayList2 = oVar.q;
            concurrentHashMap = oVar.s;
            a2 = sg.bigo.ads.r.c.a(z ? cVar : oVar.c);
            indexOf = arrayList2.indexOf(hVar);
        } else {
            cVar = oVar.c;
            arrayList = oVar.v;
            arrayList2 = oVar.r;
            concurrentHashMap = oVar.t;
            a2 = sg.bigo.ads.r.c.a(z ? oVar.b : cVar);
            indexOf = arrayList2.indexOf(hVar);
        }
        o.a(oVar, cVar, arrayList, arrayList2, concurrentHashMap, i);
    }

    @Override // sg.bigo.ads.N.e
    public final void d(sg.bigo.ads.D.h hVar) {
    }

    @Override // sg.bigo.ads.N.e
    public final void a(sg.bigo.ads.D.h hVar, AdError adError) {
        adError.getCode();
        adError.getMessage();
    }
}
