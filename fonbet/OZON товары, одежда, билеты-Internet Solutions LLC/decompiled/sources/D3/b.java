package D3;

import D3.p;
import android.net.Uri;
import android.util.SparseArray;
import j3.C7275q;
import java.util.concurrent.ExecutorService;
import m3.N;
import q3.c;
import y3.C10834a;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final c.a f5617a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f5618b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<w> f5619c;

    public b(c.a aVar, ExecutorService executorService) {
        this.f5617a = aVar;
        executorService.getClass();
        this.f5618b = executorService;
        this.f5619c = new SparseArray<>();
    }

    private static w b(Class<? extends w> cls, c.a aVar) {
        try {
            return cls.getConstructor(c.a.class).newInstance(aVar);
        } catch (Exception e11) {
            throw new IllegalStateException("Downloader factory missing", e11);
        }
    }

    private w c(int i11, c.a aVar) throws ClassNotFoundException {
        w b11;
        if (i11 == 0) {
            b11 = b(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader$Factory").asSubclass(w.class), aVar);
        } else if (i11 == 1) {
            b11 = b(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory").asSubclass(w.class), aVar);
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException(Ej.b.a(i11, "Unsupported type: "));
            }
            b11 = b(C10834a.C2290a.class.asSubclass(w.class), aVar);
        }
        this.f5619c.put(i11, b11);
        return b11;
    }

    public final q a(p pVar) {
        w c11;
        int J11 = N.J(pVar.f5703b, pVar.f5704c);
        c.a aVar = this.f5617a;
        String str = pVar.f5707f;
        Uri uri = pVar.f5703b;
        if (J11 != 0 && J11 != 1 && J11 != 2) {
            if (J11 != 4) {
                throw new IllegalArgumentException(Ej.b.a(J11, "Unsupported type: "));
            }
            C7275q.a aVar2 = new C7275q.a();
            aVar2.i(uri);
            aVar2.b(str);
            C7275q a11 = aVar2.a();
            p.c cVar = pVar.f5709h;
            return new t(a11, aVar, this.f5618b, cVar != null ? cVar.f5718a : 0L, cVar != null ? cVar.f5719b : -1L);
        }
        SparseArray<w> sparseArray = this.f5619c;
        if (N.k(sparseArray, J11)) {
            c11 = sparseArray.get(J11);
        } else {
            try {
                c11 = c(J11, aVar);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException(Ej.b.a(J11, "Module missing for content type "), e11);
            }
        }
        C7275q.a aVar3 = new C7275q.a();
        aVar3.i(uri);
        aVar3.f(pVar.f5705d);
        aVar3.b(str);
        C7275q a12 = aVar3.a();
        p.d dVar = pVar.f5710i;
        if (dVar != null) {
            c11.a(dVar.f5720a).f5751e = dVar.f5721b;
        }
        return c11.b(this.f5618b).e(a12);
    }
}
