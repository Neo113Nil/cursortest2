package y0;

import D6.C0130m;
import L.e;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import f6.C1116i;
import i6.InterfaceC1287d;
import n.ExecutorC1441a;
import t6.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f18126a;

    public b(Context context) {
        h.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) io.flutter.plugin.editing.a.m());
        h.d(systemService, "context.getSystemService…:class.java\n            )");
        this.f18126a = io.flutter.plugin.editing.a.e(systemService);
    }

    public Object a(AbstractC1795a abstractC1795a, InterfaceC1287d interfaceC1287d) {
        new C0130m(1, P6.b.v(interfaceC1287d)).s();
        io.flutter.plugin.editing.a.o();
        throw null;
    }

    public Object b(InterfaceC1287d interfaceC1287d) {
        C0130m c0130m = new C0130m(1, P6.b.v(interfaceC1287d));
        c0130m.s();
        this.f18126a.getMeasurementApiStatus(new ExecutorC1441a(1), new e(c0130m));
        Object r7 = c0130m.r();
        j6.a aVar = j6.a.f14642a;
        return r7;
    }

    public Object c(Uri uri, InputEvent inputEvent, InterfaceC1287d interfaceC1287d) {
        C0130m c0130m = new C0130m(1, P6.b.v(interfaceC1287d));
        c0130m.s();
        this.f18126a.registerSource(uri, inputEvent, new ExecutorC1441a(1), new e(c0130m));
        Object r7 = c0130m.r();
        return r7 == j6.a.f14642a ? r7 : C1116i.f13008a;
    }

    public Object d(Uri uri, InterfaceC1287d interfaceC1287d) {
        C0130m c0130m = new C0130m(1, P6.b.v(interfaceC1287d));
        c0130m.s();
        this.f18126a.registerTrigger(uri, new ExecutorC1441a(1), new e(c0130m));
        Object r7 = c0130m.r();
        return r7 == j6.a.f14642a ? r7 : C1116i.f13008a;
    }

    public Object e(c cVar, InterfaceC1287d interfaceC1287d) {
        new C0130m(1, P6.b.v(interfaceC1287d)).s();
        io.flutter.plugin.editing.a.x();
        throw null;
    }

    public Object f(d dVar, InterfaceC1287d interfaceC1287d) {
        new C0130m(1, P6.b.v(interfaceC1287d)).s();
        io.flutter.plugin.editing.a.z();
        throw null;
    }
}
