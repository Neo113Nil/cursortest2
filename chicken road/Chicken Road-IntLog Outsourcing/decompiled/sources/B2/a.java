package B2;

import B4.j;
import T4.l;
import T4.p;
import T4.s;
import T4.t;
import T4.u;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import kotlin.jvm.internal.i;
import n2.AbstractC1341c;
import x3.h;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f239a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f240b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f241c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f242d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f243e;

    public a(String str, String str2, String str3, String str4, boolean z) {
        this.f240b = str == null ? "libapp.so" : str;
        this.f241c = str2 == null ? "flutter_assets" : str2;
        this.f243e = str4;
        this.f242d = str3 == null ? "" : str3;
        this.f239a = z;
    }

    public a(String str, long j2, long j6, com.onesignal.otel.config.a aVar, K3.a aVar2, SSLContext sSLContext) {
        Duration ofNanos;
        long millis;
        Duration ofNanos2;
        long millis2;
        Duration duration;
        long millis3;
        Duration duration2;
        long millis4;
        ofNanos = Duration.ofNanos(j2);
        millis = ofNanos.toMillis();
        int min = (int) Math.min(millis, 2147483647L);
        ofNanos2 = Duration.ofNanos(j6);
        millis2 = ofNanos2.toMillis();
        int min2 = (int) Math.min(millis2, 2147483647L);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new L3.e("okhttp-dispatch"));
        l lVar = new l();
        lVar.f2903c = threadPoolExecutor;
        this.f239a = true;
        t tVar = new t();
        tVar.f2934a = lVar;
        duration = Duration.ofMillis(min2);
        i.e(duration, "duration");
        millis3 = duration.toMillis();
        TimeUnit unit = TimeUnit.MILLISECONDS;
        i.e(unit, "unit");
        tVar.f2953t = U4.e.b(millis3, unit);
        duration2 = Duration.ofMillis(min);
        i.e(duration2, "duration");
        millis4 = duration2.toMillis();
        tVar.f2952s = U4.e.b(millis4, unit);
        if (aVar2 != null) {
            tVar.f2936c.add(new D3.i(aVar2, new A3.b(8)));
        }
        if (str.startsWith("http://")) {
            List connectionSpecs = Collections.singletonList(T4.i.f2881f);
            i.e(connectionSpecs, "connectionSpecs");
            connectionSpecs.equals(tVar.f2948o);
            tVar.f2948o = U4.e.j(connectionSpecs);
        }
        this.f240b = new u(tVar);
        p pVar = new p();
        pVar.c(null, str);
        this.f241c = pVar.a();
        j jVar = s.f2931b;
        this.f243e = AbstractC1341c.z("application/x-protobuf");
        this.f242d = aVar;
    }
}
