package p166y0;

import D6.C0130m;
import L.e;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import io.flutter.plugin.editing.a;
import p044f6.i;
import p065i6.d;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MeasurementManager f18132a;

    public b(Context context) {
        h.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) a.m());
        h.d(systemService, "context.getSystemService…:class.java\n            )");
        this.f18132a = a.e(systemService);
    }

    public Object a(a aVar, d dVar) {
        new C0130m(1, P6.b.v(dVar)).s();
        a.o();
        throw null;
    }

    public Object b(d dVar) {
        C0130m c0130m = new C0130m(1, P6.b.v(dVar));
        c0130m.s();
        this.f18132a.getMeasurementApiStatus(new p094n.a(1), new e(c0130m));
        Object objR = c0130m.r();
        j6.a aVar = j6.a.f14648a;
        return objR;
    }

    public Object c(Uri uri, InputEvent inputEvent, d dVar) {
        C0130m c0130m = new C0130m(1, P6.b.v(dVar));
        c0130m.s();
        this.f18132a.registerSource(uri, inputEvent, new p094n.a(1), new e(c0130m));
        Object objR = c0130m.r();
        return objR == j6.a.f14648a ? objR : i.f13014a;
    }

    public Object d(Uri uri, d dVar) {
        C0130m c0130m = new C0130m(1, P6.b.v(dVar));
        c0130m.s();
        this.f18132a.registerTrigger(uri, new p094n.a(1), new e(c0130m));
        Object objR = c0130m.r();
        return objR == j6.a.f14648a ? objR : i.f13014a;
    }

    public Object e(c cVar, d dVar) {
        new C0130m(1, P6.b.v(dVar)).s();
        a.x();
        throw null;
    }

    public Object f(d dVar, d dVar2) {
        new C0130m(1, P6.b.v(dVar2)).s();
        a.z();
        throw null;
    }
}
