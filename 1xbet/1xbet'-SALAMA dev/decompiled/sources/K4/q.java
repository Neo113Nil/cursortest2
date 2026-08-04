package K4;

import B4.I;
import U5.AbstractC0439f;
import U5.AbstractC0457y;
import U5.b0;
import U5.l0;
import Y4.C0577i;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.protobuf.AbstractC0847a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends AbstractC0457y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4047a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4049c;

    public q(r rVar, TaskCompletionSource taskCompletionSource) {
        this.f4049c = rVar;
        this.f4048b = taskCompletionSource;
    }

    @Override // U5.AbstractC0457y
    public final void g(l0 l0Var, b0 b0Var) {
        Object obj = this.f4048b;
        switch (this.f4047a) {
            case 0:
                p072k1.g gVar = (p072k1.g) obj;
                boolean zE = l0Var.e();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) gVar.f14682c;
                if (!zE) {
                    I iG = L4.r.g(l0Var);
                    if (iG.f1098a == B4.H.UNAUTHENTICATED) {
                        r rVar = ((j) gVar.f14683d).f4026c;
                        rVar.f4054b.a0();
                        rVar.f4055c.Z();
                    }
                    taskCompletionSource.trySetException(iG);
                } else {
                    taskCompletionSource.trySetResult(Collections.emptyList());
                }
                break;
            default:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj;
                if (!l0Var.e()) {
                    ((r) this.f4049c).getClass();
                    HashSet hashSet = j.f4023d;
                    Throwable th = l0Var.f6549c;
                    if (th instanceof SSLHandshakeException) {
                        th.getMessage().contains("no ciphers available");
                    }
                    taskCompletionSource2.setException(L4.r.g(l0Var));
                } else if (!taskCompletionSource2.getTask().isComplete()) {
                    taskCompletionSource2.setException(new I("Received onClose with status OK, but no message.", B4.H.INTERNAL));
                }
                break;
        }
    }

    @Override // U5.AbstractC0457y
    public final void i(AbstractC0847a abstractC0847a) {
        String str;
        H4.k kVarH;
        switch (this.f4047a) {
            case 0:
                p072k1.g gVar = (p072k1.g) this.f4048b;
                ArrayList<C0577i> arrayList = (ArrayList) gVar.f14680a;
                arrayList.add((C0577i) abstractC0847a);
                int size = arrayList.size();
                List list = (List) gVar.f14681b;
                if (size == list.size()) {
                    HashMap map = new HashMap();
                    for (C0577i c0577i : arrayList) {
                        P2 p5 = ((j) gVar.f14683d).f4024a;
                        if (p136t.e.b(c0577i.z(), 1)) {
                            p113p3.f.O("Tried to deserialize a found document from a missing document.", p136t.e.b(c0577i.z(), 1), new Object[0]);
                            H4.h hVarJ = p5.j(c0577i.w().A());
                            H4.l lVarE = H4.l.e(c0577i.w().z());
                            H4.n nVarN = P2.n(c0577i.w().B());
                            p113p3.f.O("Got a document response with no snapshot version", !nVarN.equals(H4.n.f3332b), new Object[0]);
                            kVarH = new H4.k(hVarJ);
                            kVarH.a(nVarN, lVarE);
                        } else {
                            if (!p136t.e.b(c0577i.z(), 2)) {
                                int iZ = c0577i.z();
                                if (iZ == 1) {
                                    str = "FOUND";
                                } else if (iZ != 2) {
                                    str = iZ != 3 ? "null" : "RESULT_NOT_SET";
                                } else {
                                    str = "MISSING";
                                }
                                throw new IllegalArgumentException("Unknown result case: ".concat(str));
                            }
                            p113p3.f.O("Tried to deserialize a missing document from a found document.", p136t.e.b(c0577i.z(), 2), new Object[0]);
                            H4.h hVarJ2 = p5.j(c0577i.x());
                            H4.n nVarN2 = P2.n(c0577i.y());
                            p113p3.f.O("Got a no document response with no snapshot version", !nVarN2.equals(H4.n.f3332b), new Object[0]);
                            kVarH = H4.k.h(hVarJ2, nVarN2);
                        }
                        map.put(kVarH.f3323a, kVarH);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((H4.k) map.get((H4.h) it.next()));
                    }
                    ((TaskCompletionSource) gVar.f14682c).trySetResult(arrayList2);
                }
                ((AbstractC0439f) this.f4049c).c(1);
                return;
            default:
                ((TaskCompletionSource) this.f4048b).setResult(abstractC0847a);
                return;
        }
    }

    public q(p072k1.g gVar, AbstractC0439f abstractC0439f) {
        this.f4048b = gVar;
        this.f4049c = abstractC0439f;
    }
}
