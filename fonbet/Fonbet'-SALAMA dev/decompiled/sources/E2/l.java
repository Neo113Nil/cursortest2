package E2;

import I2.K;
import I2.P;
import P2.C0375a;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaul;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;
import com.google.firebase.storage.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import n4.C1468b;
import n4.C1473g;
import n4.D;
import n4.M;
import o0.RunnableC1487a;
import o4.C1509a;

/* loaded from: classes.dex */
public final class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1941b;

    public /* synthetic */ l(Object obj, int i7) {
        this.f1940a = i7;
        this.f1941b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.f1940a) {
            case 0:
                n nVar = (n) this.f1941b;
                return new zzauo(zzaun.zzt(nVar.f1946d, new zzaul(nVar.f1943a.f10834a, false)));
            case 1:
                K k7 = P.f3579l;
                P p5 = o.f1952C.f1957c;
                return P.l((Uri) this.f1941b);
            case 2:
                return ((C0375a) this.f1941b).getViewSignals();
            case 3:
                w wVar = (w) this.f1941b;
                wVar.f12079m.f6338e = false;
                T4.a aVar = wVar.f12086t;
                if (aVar != null) {
                    aVar.o();
                }
                T4.a aVar2 = new T4.a(wVar.f12078l.b(), wVar.f12078l.f12045b.f12012a, wVar.f12083q);
                wVar.f12086t = aVar2;
                wVar.f12079m.b(aVar2, false);
                wVar.f12081o = wVar.f12086t.f6357e;
                Exception exc = wVar.f12086t.f6353a;
                if (exc == null) {
                    exc = wVar.f12080n;
                }
                wVar.f12080n = exc;
                int i7 = wVar.f12081o;
                if ((i7 != 308 && (i7 < 200 || i7 >= 300)) || wVar.f12080n != null || wVar.f12066h != 4) {
                    throw new IOException("Could not open resulting stream.");
                }
                String j = wVar.f12086t.j("ETag");
                if (!TextUtils.isEmpty(j) && (str = wVar.f12087u) != null && !str.equals(j)) {
                    wVar.f12081o = 409;
                    throw new IOException("The ETag on the server changed.");
                }
                wVar.f12087u = j;
                T4.a aVar3 = wVar.f12086t;
                int i8 = aVar3.f6359g;
                return aVar3.f6360h;
            case 4:
                D d7 = (D) this.f1941b;
                d7.f15365g.c();
                M m7 = d7.f15360b;
                m7.getClass();
                ArrayList arrayList = new ArrayList((ArrayList) m7.f15384b);
                m7.f15383a = C1468b.f15391b;
                m7.f15384b = new ArrayList();
                return arrayList.isEmpty() ? Collections.emptyList() : D.a(d7, new C1509a(C1473g.f15415d, new q4.c(Boolean.TRUE), true));
            default:
                RunnableC1487a runnableC1487a = (RunnableC1487a) this.f1941b;
                runnableC1487a.f15537e.set(true);
                try {
                    Process.setThreadPriority(10);
                    runnableC1487a.f15539x.c();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        runnableC1487a.f15536d.set(true);
                        throw th;
                    } finally {
                        runnableC1487a.a(null);
                    }
                }
        }
    }
}
