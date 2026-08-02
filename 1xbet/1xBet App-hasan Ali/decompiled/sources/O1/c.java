package O1;

import G.q;
import W3.o;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import b4.EnumC0510a;
import kotlin.jvm.internal.l;
import p4.C2268h;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f4045a;

    public c(Context context) {
        Object systemService = context.getSystemService((Class<Object>) q.n());
        l.e("context.getSystemService…:class.java\n            )", systemService);
        this.f4045a = q.e(systemService);
    }

    public Object a(a aVar, a4.c<? super o> cVar) {
        new C2268h(1, AbstractC2346c.v(cVar)).r();
        q.A();
        throw null;
    }

    public Object b(a4.c<? super Integer> cVar) {
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(cVar));
        c2268h.r();
        this.f4045a.getMeasurementApiStatus(new b(0), new j1.b(c2268h));
        return c2268h.q();
    }

    public Object c(Uri uri, InputEvent inputEvent, a4.c<? super o> cVar) {
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(cVar));
        c2268h.r();
        this.f4045a.registerSource(uri, inputEvent, new b(0), new j1.b(c2268h));
        Object q5 = c2268h.q();
        return q5 == EnumC0510a.f7289k ? q5 : o.f6046a;
    }

    public Object d(Uri uri, a4.c<? super o> cVar) {
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(cVar));
        c2268h.r();
        this.f4045a.registerTrigger(uri, new b(0), new j1.b(c2268h));
        Object q5 = c2268h.q();
        return q5 == EnumC0510a.f7289k ? q5 : o.f6046a;
    }

    public Object e(d dVar, a4.c<? super o> cVar) {
        new C2268h(1, AbstractC2346c.v(cVar)).r();
        q.C();
        throw null;
    }

    public Object f(e eVar, a4.c<? super o> cVar) {
        new C2268h(1, AbstractC2346c.v(cVar)).r();
        q.D();
        throw null;
    }
}
