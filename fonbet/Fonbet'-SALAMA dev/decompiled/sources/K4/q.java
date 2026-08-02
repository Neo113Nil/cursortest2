package K4;

import B4.I;
import U5.AbstractC0439f;
import U5.AbstractC0457y;
import U5.b0;
import U5.l0;
import Y4.C0577i;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.protobuf.AbstractC0891a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import w1.P2;

/* loaded from: classes2.dex */
public final class q extends AbstractC0457y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4047a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4048b;

    /* renamed from: c, reason: collision with root package name */
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
                k1.g gVar = (k1.g) obj;
                boolean e7 = l0Var.e();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) gVar.f14676c;
                if (!e7) {
                    I g3 = L4.r.g(l0Var);
                    if (g3.f1098a == B4.H.UNAUTHENTICATED) {
                        r rVar = ((j) gVar.f14677d).f4026c;
                        rVar.f4054b.a0();
                        rVar.f4055c.Z();
                    }
                    taskCompletionSource.trySetException(g3);
                    break;
                } else {
                    taskCompletionSource.trySetResult(Collections.emptyList());
                    break;
                }
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
                    break;
                } else if (!taskCompletionSource2.getTask().isComplete()) {
                    taskCompletionSource2.setException(new I("Received onClose with status OK, but no message.", B4.H.INTERNAL));
                    break;
                }
                break;
        }
    }

    @Override // U5.AbstractC0457y
    public final void i(AbstractC0891a abstractC0891a) {
        H4.k h6;
        switch (this.f4047a) {
            case 0:
                k1.g gVar = (k1.g) this.f4048b;
                ArrayList arrayList = (ArrayList) gVar.f14674a;
                arrayList.add((C0577i) abstractC0891a);
                int size = arrayList.size();
                List list = (List) gVar.f14675b;
                if (size == list.size()) {
                    HashMap hashMap = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0577i c0577i = (C0577i) it.next();
                        P2 p22 = ((j) gVar.f14677d).f4024a;
                        if (t.e.b(c0577i.z(), 1)) {
                            p3.f.O("Tried to deserialize a found document from a missing document.", t.e.b(c0577i.z(), 1), new Object[0]);
                            H4.h j = p22.j(c0577i.w().A());
                            H4.l e7 = H4.l.e(c0577i.w().z());
                            H4.n n2 = P2.n(c0577i.w().B());
                            p3.f.O("Got a document response with no snapshot version", !n2.equals(H4.n.f3332b), new Object[0]);
                            h6 = new H4.k(j);
                            h6.a(n2, e7);
                        } else {
                            if (!t.e.b(c0577i.z(), 2)) {
                                int z4 = c0577i.z();
                                throw new IllegalArgumentException("Unknown result case: ".concat(z4 != 1 ? z4 != 2 ? z4 != 3 ? "null" : "RESULT_NOT_SET" : "MISSING" : "FOUND"));
                            }
                            p3.f.O("Tried to deserialize a missing document from a found document.", t.e.b(c0577i.z(), 2), new Object[0]);
                            H4.h j3 = p22.j(c0577i.x());
                            H4.n n7 = P2.n(c0577i.y());
                            p3.f.O("Got a no document response with no snapshot version", !n7.equals(H4.n.f3332b), new Object[0]);
                            h6 = H4.k.h(j3, n7);
                        }
                        hashMap.put(h6.f3323a, h6);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((H4.k) hashMap.get((H4.h) it2.next()));
                    }
                    ((TaskCompletionSource) gVar.f14676c).trySetResult(arrayList2);
                }
                ((AbstractC0439f) this.f4049c).c(1);
                return;
            default:
                ((TaskCompletionSource) this.f4048b).setResult(abstractC0891a);
                return;
        }
    }

    public q(k1.g gVar, AbstractC0439f abstractC0439f) {
        this.f4048b = gVar;
        this.f4049c = abstractC0439f;
    }
}
