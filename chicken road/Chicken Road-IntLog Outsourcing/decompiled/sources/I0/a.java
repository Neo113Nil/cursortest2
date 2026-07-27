package I0;

import B1.g;
import D2.b;
import G2.i;
import H2.l;
import H2.m;
import H2.n;
import H2.o;
import android.os.Build;
import android.os.Vibrator;
import h2.C0482c;

/* loaded from: classes.dex */
public class a implements b, m {

    /* renamed from: a, reason: collision with root package name */
    public o f1247a;

    @Override // D2.b
    public final void onAttachedToEngine(D2.a aVar) {
        g gVar = new g(19, new C0482c(20, (Vibrator) aVar.f433a.getSystemService("vibrator")));
        o oVar = new o(aVar.f435c, "vibration");
        this.f1247a = oVar;
        oVar.b(gVar);
    }

    @Override // D2.b
    public final void onDetachedFromEngine(D2.a aVar) {
        this.f1247a.b(null);
        this.f1247a = null;
    }

    @Override // H2.m
    public final void onMethodCall(l lVar, n nVar) {
        if (!lVar.f1146a.equals("getPlatformVersion")) {
            ((i) nVar).a();
            return;
        }
        ((i) nVar).success("Android " + Build.VERSION.RELEASE);
    }
}
