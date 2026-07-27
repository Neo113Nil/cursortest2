package o0;

import S1.i;
import T1.l;
import T1.m;
import T1.n;
import T1.o;
import android.os.Build;
import android.os.Vibrator;
import b0.j;
import io.flutter.plugin.editing.k;

/* loaded from: classes.dex */
public class b implements P1.b, m {

    /* renamed from: a, reason: collision with root package name */
    public o f10142a;

    @Override // P1.b
    public final void onAttachedToEngine(P1.a aVar) {
        j jVar = new j(new k((Vibrator) aVar.f1152a.getSystemService("vibrator")));
        o oVar = new o(aVar.f1153b, "vibration");
        this.f10142a = oVar;
        oVar.b(jVar);
    }

    @Override // P1.b
    public final void onDetachedFromEngine(P1.a aVar) {
        this.f10142a.b(null);
        this.f10142a = null;
    }

    @Override // T1.m
    public final void onMethodCall(l lVar, n nVar) {
        if (!lVar.f1468a.equals("getPlatformVersion")) {
            ((i) nVar).a();
            return;
        }
        ((i) nVar).success("Android " + Build.VERSION.RELEASE);
    }
}
