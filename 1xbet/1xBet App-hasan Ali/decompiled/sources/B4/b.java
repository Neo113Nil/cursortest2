package B4;

import F4.k;
import F4.o;
import com.google.android.gms.internal.ads.C1386of;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f759e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, String str) {
        super(str, true);
        this.f759e = i;
        this.f = obj;
    }

    @Override // B4.a
    public final long a() {
        switch (this.f759e) {
            case 0:
                ((k) this.f).invoke();
                return -1L;
            case 1:
                C1386of c1386of = (C1386of) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) c1386of.f14812d).iterator();
                int i = 0;
                long j5 = Long.MIN_VALUE;
                C4.k kVar = null;
                int i5 = 0;
                while (it.hasNext()) {
                    C4.k kVar2 = (C4.k) it.next();
                    l.e("connection", kVar2);
                    synchronized (kVar2) {
                        if (c1386of.b(kVar2, nanoTime) > 0) {
                            i5++;
                        } else {
                            i++;
                            long j6 = nanoTime - kVar2.f905q;
                            if (j6 > j5) {
                                kVar = kVar2;
                                j5 = j6;
                            }
                        }
                    }
                }
                long j7 = c1386of.f14811c;
                if (j5 < j7 && i <= 5) {
                    if (i > 0) {
                        return j7 - j5;
                    }
                    if (i5 > 0) {
                        return j7;
                    }
                    return -1L;
                }
                l.c(kVar);
                synchronized (kVar) {
                    if (!kVar.f904p.isEmpty()) {
                        return 0L;
                    }
                    if (kVar.f905q + j5 != nanoTime) {
                        return 0L;
                    }
                    kVar.f898j = true;
                    ((ConcurrentLinkedQueue) c1386of.f14812d).remove(kVar);
                    Socket socket = kVar.f894d;
                    l.c(socket);
                    z4.b.d(socket);
                    if (!((ConcurrentLinkedQueue) c1386of.f14812d).isEmpty()) {
                        return 0L;
                    }
                    ((c) c1386of.f14809a).a();
                    return 0L;
                }
            default:
                o oVar = (o) this.f;
                oVar.getClass();
                try {
                    oVar.f1616G.k(2, 0, false);
                    return -1L;
                } catch (IOException e3) {
                    oVar.b(2, 2, e3);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C1386of c1386of, String str) {
        super(str, true);
        this.f759e = 1;
        this.f = c1386of;
    }
}
