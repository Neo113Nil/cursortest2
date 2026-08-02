package M1;

import O1.e;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.l;
import p4.AbstractC2282w;
import p4.D;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final O1.c f3603a;

    public d(O1.c cVar) {
        this.f3603a = cVar;
    }

    public static final d b(Context context) {
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        K1.a aVar = K1.a.f2882a;
        sb.append(i >= 30 ? aVar.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        O1.c cVar = (i >= 30 ? aVar.a() : 0) >= 5 ? new O1.c(context) : null;
        if (cVar != null) {
            return new d(cVar);
        }
        return null;
    }

    public E3.a a(O1.a aVar) {
        l.f("deletionRequest", aVar);
        throw null;
    }

    public E3.a c() {
        return G4.d.h(AbstractC2282w.c(AbstractC2282w.a(D.f18743a), null, new a(this, null), 3));
    }

    public E3.a d(Uri uri, InputEvent inputEvent) {
        l.f("attributionSource", uri);
        return G4.d.h(AbstractC2282w.c(AbstractC2282w.a(D.f18743a), null, new b(this, uri, inputEvent, null), 3));
    }

    public E3.a e(Uri uri) {
        l.f("trigger", uri);
        return G4.d.h(AbstractC2282w.c(AbstractC2282w.a(D.f18743a), null, new c(this, uri, null), 3));
    }

    public E3.a f(O1.d dVar) {
        l.f("request", dVar);
        throw null;
    }

    public E3.a g(e eVar) {
        l.f("request", eVar);
        throw null;
    }
}
