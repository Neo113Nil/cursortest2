package O;

import P.C0000a;
import P.C0002c;
import P.o;
import P.v;
import P.x;
import P.z;
import Q.C0006d;
import Q.s;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f266a;

    /* renamed from: b, reason: collision with root package name */
    public final String f267b;

    /* renamed from: c, reason: collision with root package name */
    public final Y.e f268c;

    /* renamed from: d, reason: collision with root package name */
    public final b f269d;

    /* renamed from: e, reason: collision with root package name */
    public final C0000a f270e;

    /* renamed from: f, reason: collision with root package name */
    public final int f271f;

    /* renamed from: g, reason: collision with root package name */
    public final N.i f272g;

    /* renamed from: h, reason: collision with root package name */
    public final C0002c f273h;

    public f(Context context, Y.e eVar, b bVar, e eVar2) {
        s.d(context, "Null context is not permitted.");
        s.d(eVar, "Api must not be null.");
        s.d(eVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        s.d(applicationContext, "The provided context did not have an application context.");
        this.f266a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f267b = attributionTag;
        this.f268c = eVar;
        this.f269d = bVar;
        this.f270e = new C0000a(eVar, bVar, attributionTag);
        C0002c e2 = C0002c.e(applicationContext);
        this.f273h = e2;
        this.f271f = e2.f309h.getAndIncrement();
        this.f272g = eVar2.f265a;
        Z.e eVar3 = e2.f314m;
        eVar3.sendMessage(eVar3.obtainMessage(7, this));
    }

    public final C0.b a() {
        C0.b bVar = new C0.b(3, false);
        Set emptySet = Collections.emptySet();
        if (((f.c) bVar.f54b) == null) {
            bVar.f54b = new f.c(0);
        }
        ((f.c) bVar.f54b).addAll(emptySet);
        Context context = this.f266a;
        bVar.f56d = context.getClass().getName();
        bVar.f55c = context.getPackageName();
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e0.k b(int i2, P.i iVar) {
        v vVar;
        e0.d dVar = new e0.d();
        C0002c c0002c = this.f273h;
        c0002c.getClass();
        int i3 = iVar.f319d;
        Z.e eVar = c0002c.f314m;
        e0.k kVar = dVar.f954a;
        if (i3 != 0) {
            if (c0002c.a()) {
                Q.i iVar2 = (Q.i) Q.h.b().f439a;
                C0000a c0000a = this.f270e;
                boolean z2 = true;
                if (iVar2 != null) {
                    if (iVar2.f441b) {
                        o oVar = (o) c0002c.f311j.get(c0000a);
                        if (oVar != null) {
                            c cVar = oVar.f329b;
                            if (cVar instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                                if (aVar.f752u != null && !aVar.a()) {
                                    C0006d a2 = v.a(oVar, aVar, i3);
                                    if (a2 != null) {
                                        oVar.f339l++;
                                        z2 = a2.f408c;
                                    }
                                }
                            }
                        }
                        z2 = iVar2.f442c;
                    }
                }
                vVar = new v(c0002c, i3, c0000a, z2 ? System.currentTimeMillis() : 0L, z2 ? SystemClock.elapsedRealtime() : 0L);
                if (vVar != null) {
                    eVar.getClass();
                    P.k kVar2 = new P.k(eVar, 0);
                    kVar.getClass();
                    kVar.f969b.c(new e0.f(kVar2, vVar));
                    kVar.h();
                }
            }
            vVar = null;
            if (vVar != null) {
            }
        }
        eVar.sendMessage(eVar.obtainMessage(4, new x(new z(i2, iVar, dVar, this.f272g), c0002c.f310i.get(), this)));
        return kVar;
    }
}
