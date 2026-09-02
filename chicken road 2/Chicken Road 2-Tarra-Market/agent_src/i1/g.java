package i1;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f1331g;

    /* renamed from: a, reason: collision with root package name */
    public final int f1332a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1333b;

    /* renamed from: c, reason: collision with root package name */
    public final P.m f1334c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f1335d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.editing.a f1336e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1337f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = j1.d.f6053a;
        f1331g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new j1.c("OkHttp ConnectionPool", true));
    }

    public g() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f1334c = new P.m(6, this);
        this.f1335d = new ArrayDeque();
        this.f1336e = new io.flutter.plugin.editing.a(5);
        this.f1332a = 5;
        this.f1333b = timeUnit.toNanos(5L);
    }

    public final int a(l1.c cVar, long j2) {
        ArrayList arrayList = cVar.f6101n;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                p1.g.f6437a.m("A connection to " + cVar.f6090c.f1269a.f1279a + " was leaked. Did you forget to close a response body?", ((l1.f) reference).f6112a);
                arrayList.remove(i2);
                cVar.f6098k = true;
                if (arrayList.isEmpty()) {
                    cVar.f6102o = j2 - this.f1333b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
