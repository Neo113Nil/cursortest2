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
import p098n4.C0929b;
import p098n4.C0934g;
import p098n4.D;
import p098n4.M;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1941b;

    public /* synthetic */ l(Object obj, int i7) {
        this.f1940a = i7;
        this.f1941b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
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
                String strJ = wVar.f12086t.j("ETag");
                if (!TextUtils.isEmpty(strJ) && (str = wVar.f12087u) != null && !str.equals(strJ)) {
                    wVar.f12081o = 409;
                    throw new IOException("The ETag on the server changed.");
                }
                wVar.f12087u = strJ;
                T4.a aVar3 = wVar.f12086t;
                int i8 = aVar3.f6359g;
                return aVar3.f6360h;
            case 4:
                D d7 = (D) this.f1941b;
                d7.f15371g.c();
                M m7 = d7.f15366b;
                m7.getClass();
                ArrayList arrayList = new ArrayList((ArrayList) m7.f15390b);
                m7.f15389a = C0929b.f15397b;
                m7.f15390b = new ArrayList();
                return arrayList.isEmpty() ? Collections.emptyList() : D.a(d7, new p106o4.a(C0934g.f15421d, new p120q4.c(Boolean.TRUE), true));
            default:
                p102o0.a aVar4 = (p102o0.a) this.f1941b;
                aVar4.f15543e.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar4.f15545x.c();
                    Binder.flushPendingCommands();
                    aVar4.a(null);
                    return null;
                } catch (Throwable th) {
                    try {
                        aVar4.f15542d.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        aVar4.a(null);
                        throw th2;
                    }
                }
        }
    }
}
