package l1;

import i1.C0071b;
import i1.j;
import i1.l;
import i1.m;
import i1.o;
import i1.p;
import i1.q;
import i1.r;
import i1.v;
import i1.w;
import i1.x;
import i1.y;
import i1.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import s1.n;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6083a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6084b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f6083a = i2;
        this.f6084b = obj;
    }

    @Override // i1.p
    public final y a(m1.e eVar) {
        boolean z2;
        int i2 = 0;
        switch (this.f6083a) {
            case 0:
                w wVar = eVar.f6135f;
                g gVar = eVar.f6131b;
                boolean z3 = !wVar.f1431b.equals("GET");
                r rVar = (r) this.f6084b;
                gVar.getClass();
                int i3 = eVar.f6138i;
                int i4 = eVar.f6139j;
                int i5 = eVar.f6140k;
                rVar.getClass();
                try {
                    m1.b h2 = gVar.d(i3, i4, i5, rVar.f1405r, z3).h(rVar, eVar, gVar);
                    synchronized (gVar.f6116d) {
                        gVar.f6126n = h2;
                    }
                    return eVar.b(wVar, gVar, h2, gVar.a());
                } catch (IOException e2) {
                    throw new d(e2);
                }
            default:
                w wVar2 = eVar.f6135f;
                v a2 = wVar2.a();
                H0.b bVar = wVar2.f1433d;
                if (bVar != null) {
                    if (((q) bVar.f181c) != null) {
                        a2.f1427c.d("Content-Type", "application/x-protobuf");
                    }
                    long j2 = bVar.f180b;
                    if (j2 != -1) {
                        a2.f1427c.d("Content-Length", Long.toString(j2));
                        a2.c("Transfer-Encoding");
                    } else {
                        a2.f1427c.d("Transfer-Encoding", "chunked");
                        a2.c("Content-Length");
                    }
                }
                m mVar = wVar2.f1432c;
                String a3 = mVar.a("Host");
                o oVar = wVar2.f1430a;
                if (a3 == null) {
                    a2.f1427c.d("Host", j1.d.j(oVar, false));
                }
                if (mVar.a("Connection") == null) {
                    a2.f1427c.d("Connection", "Keep-Alive");
                }
                if (mVar.a("Accept-Encoding") == null && mVar.a("Range") == null) {
                    a2.f1427c.d("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0071b c0071b = (C0071b) this.f6084b;
                c0071b.getClass();
                List emptyList = Collections.emptyList();
                if (!emptyList.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (int size = emptyList.size(); i2 < size; size = size) {
                        if (i2 > 0) {
                            sb.append("; ");
                        }
                        j jVar = (j) emptyList.get(i2);
                        sb.append(jVar.f1352a);
                        sb.append('=');
                        sb.append(jVar.f1353b);
                        i2++;
                    }
                    a2.f1427c.d("Cookie", sb.toString());
                }
                if (mVar.a("User-Agent") == null) {
                    a2.f1427c.d("User-Agent", "okhttp/3.12.0");
                }
                y a4 = eVar.a(a2.a());
                m mVar2 = a4.f1453f;
                m1.d.d(c0071b, oVar, mVar2);
                x b2 = a4.b();
                b2.f1436a = wVar2;
                if (z2 && "gzip".equalsIgnoreCase(a4.a("Content-Encoding")) && m1.d.b(a4)) {
                    s1.j jVar2 = new s1.j(a4.f1454g.g());
                    l c2 = mVar2.c();
                    c2.c("Content-Encoding");
                    c2.c("Content-Length");
                    ArrayList arrayList = c2.f1365a;
                    String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                    l lVar = new l(0);
                    Collections.addAll(lVar.f1365a, strArr);
                    b2.f1441f = lVar;
                    a4.a("Content-Type");
                    Logger logger = s1.l.f6634a;
                    b2.f1442g = new z(-1L, new n(jVar2), 1);
                }
                return b2.a();
        }
    }
}
