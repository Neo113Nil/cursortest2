package K4;

import A1.C0042s;
import A1.x0;
import E4.C0175h;
import E4.N;
import E4.O;
import W5.AbstractC0486a1;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p155w1.C1017n0;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements io.flutter.plugin.platform.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4069f;

    @Override // io.flutter.plugin.platform.i
    public long a() {
        return ((io.flutter.embedding.engine.renderer.i) this.f4067d).f14090a;
    }

    @Override // io.flutter.plugin.platform.i
    public void b(int i7, int i8) {
        this.f4064a = i7;
        this.f4065b = i8;
        SurfaceTexture surfaceTexture = (SurfaceTexture) this.f4068e;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i7, i8);
        }
    }

    public void c(String str) {
        String strH = AbstractC0486a1.h("Could not reach Cloud Firestore backend. ", str, "\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.");
        if (!this.f4066c) {
            Q0.a.v(1, "OnlineStateTracker", "%s", strH);
        } else {
            Q0.a.v(2, "OnlineStateTracker", "%s", strH);
            this.f4066c = false;
        }
    }

    public void d(int i7) {
        boolean z4;
        P2 p5;
        if (i7 != this.f4064a) {
            this.f4064a = i7;
            E4.H hE = ((E4.z) ((p033e3.h) ((C0042s) this.f4069f).f550b).f12673a).e();
            hE.a("handleOnlineStateChange");
            ArrayList arrayList = new ArrayList();
            Iterator it = hE.f2113c.entrySet().iterator();
            while (true) {
                z4 = false;
                if (!it.hasNext()) {
                    break;
                }
                N n2 = ((E4.E) ((Map.Entry) it.next()).getValue()).f2108c;
                Object obj = null;
                if (n2.f2151c && i7 == 3) {
                    n2.f2151c = false;
                    p5 = n2.a(new D3.j(n2.f2152d, new x0(3), n2.f2155g, false), null, false);
                } else {
                    p5 = new P2(7, obj, Collections.emptyList(), false);
                }
                p113p3.f.O("OnlineState should not affect limbo documents.", ((List) p5.f17515c).isEmpty(), new Object[0]);
                O o7 = (O) p5.f17514b;
                if (o7 != null) {
                    arrayList.add(o7);
                }
            }
            hE.f2122m.g(arrayList);
            p151v2.n nVar = hE.f2122m;
            nVar.f17142a = i7;
            Iterator it2 = ((HashMap) nVar.f17144c).values().iterator();
            while (it2.hasNext()) {
                for (E4.D d7 : ((C0175h) it2.next()).f2185a) {
                    d7.f2104e = i7;
                    O o8 = d7.f2105f;
                    if (o8 != null && !d7.f2103d && d7.d(o8, i7)) {
                        d7.c(d7.f2105f);
                        z4 = true;
                    }
                }
            }
            if (z4) {
                nVar.h();
            }
        }
    }

    public void e(int i7) {
        C1017n0 c1017n0 = (C1017n0) this.f4067d;
        if (c1017n0 != null) {
            c1017n0.f();
            this.f4067d = null;
        }
        this.f4065b = 0;
        if (i7 == 2) {
            this.f4066c = false;
        }
        d(i7);
    }

    @Override // io.flutter.plugin.platform.i
    public int getHeight() {
        return this.f4065b;
    }

    @Override // io.flutter.plugin.platform.i
    public Surface getSurface() {
        Surface surface = (Surface) this.f4069f;
        if (surface == null || this.f4066c) {
            if (surface != null) {
                surface.release();
                this.f4069f = null;
            }
            this.f4069f = new Surface((SurfaceTexture) this.f4068e);
            this.f4066c = false;
        }
        SurfaceTexture surfaceTexture = (SurfaceTexture) this.f4068e;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return (Surface) this.f4069f;
    }

    @Override // io.flutter.plugin.platform.i
    public int getWidth() {
        return this.f4064a;
    }

    @Override // io.flutter.plugin.platform.i
    public void release() {
        this.f4068e = null;
        Surface surface = (Surface) this.f4069f;
        if (surface != null) {
            surface.release();
            this.f4069f = null;
        }
    }
}
