package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C0106a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h80 {

    /* JADX INFO: renamed from: a */
    public final y91 f3081a;

    /* JADX INFO: renamed from: b */
    public final Handler f3082b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f3083c;

    /* JADX INFO: renamed from: d */
    public final n11 f3084d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0318ic f3085e;

    /* JADX INFO: renamed from: f */
    public boolean f3086f;

    /* JADX INFO: renamed from: g */
    public boolean f3087g;

    /* JADX INFO: renamed from: h */
    public i11 f3088h;

    /* JADX INFO: renamed from: i */
    public f80 f3089i;

    /* JADX INFO: renamed from: j */
    public boolean f3090j;

    /* JADX INFO: renamed from: k */
    public f80 f3091k;

    /* JADX INFO: renamed from: l */
    public Bitmap f3092l;

    /* JADX INFO: renamed from: m */
    public f80 f3093m;

    /* JADX INFO: renamed from: n */
    public int f3094n;

    /* JADX INFO: renamed from: o */
    public int f3095o;

    /* JADX INFO: renamed from: p */
    public int f3096p;

    public h80(ComponentCallbacks2C0106a componentCallbacks2C0106a, y91 y91Var, int i, int i2, Bitmap bitmap) {
        InterfaceC0318ic interfaceC0318ic = componentCallbacks2C0106a.f1307j;
        q80 q80Var = componentCallbacks2C0106a.f1309l;
        Context baseContext = q80Var.getBaseContext();
        o80.m3647h(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        n11 n11VarM989b = ComponentCallbacks2C0106a.m983a(baseContext).f1311n.m989b(baseContext);
        Context baseContext2 = q80Var.getBaseContext();
        o80.m3647h(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        n11 n11VarM989b2 = ComponentCallbacks2C0106a.m983a(baseContext2).f1311n.m989b(baseContext2);
        n11VarM989b2.getClass();
        i11 i11VarM2517r = new i11(n11VarM989b2.f5240j, n11VarM989b2, Bitmap.class, n11VarM989b2.f5241k).mo2514a(n11.f5239t).mo2514a(((p11) ((p11) ((p11) new p11().m4288d(C0371jt.f4088b)).m4299p()).m4296m()).m4290g(i, i2));
        this.f3083c = new ArrayList();
        this.f3084d = n11VarM989b;
        Handler handler = new Handler(Looper.getMainLooper(), new g80(0, this));
        this.f3085e = interfaceC0318ic;
        this.f3082b = handler;
        this.f3088h = i11VarM2517r;
        this.f3081a = y91Var;
        m2228c(mf1.f5040b, bitmap);
    }

    /* JADX INFO: renamed from: a */
    public final void m2226a() {
        int i;
        int i2;
        if (!this.f3086f || this.f3087g) {
            return;
        }
        f80 f80Var = this.f3093m;
        if (f80Var != null) {
            this.f3093m = null;
            m2227b(f80Var);
            return;
        }
        this.f3087g = true;
        y91 y91Var = this.f3081a;
        i80 i80Var = y91Var.f9241l;
        int i3 = i80Var.f3465c;
        if (i3 <= 0 || (i2 = y91Var.f9240k) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((e80) i80Var.f3467e.get(i2)).f2005i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        int i4 = (y91Var.f9240k + 1) % y91Var.f9241l.f3465c;
        y91Var.f9240k = i4;
        this.f3091k = new f80(this.f3082b, i4, jUptimeMillis);
        this.f3088h.mo2514a((p11) new p11().m4295l(new us0(Double.valueOf(Math.random())))).m2521v(y91Var).m2520u(this.f3091k);
    }

    /* JADX INFO: renamed from: b */
    public final void m2227b(f80 f80Var) {
        this.f3087g = false;
        boolean z = this.f3090j;
        Handler handler = this.f3082b;
        if (z) {
            handler.obtainMessage(2, f80Var).sendToTarget();
            return;
        }
        if (!this.f3086f) {
            this.f3093m = f80Var;
            return;
        }
        if (f80Var.f2349p != null) {
            Bitmap bitmap = this.f3092l;
            if (bitmap != null) {
                this.f3085e.mo2591h(bitmap);
                this.f3092l = null;
            }
            f80 f80Var2 = this.f3089i;
            this.f3089i = f80Var;
            ArrayList arrayList = this.f3083c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b80 b80Var = (b80) arrayList.get(size);
                Object callback = b80Var.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    b80Var.stop();
                    b80Var.invalidateSelf();
                } else {
                    b80Var.invalidateSelf();
                    h80 h80Var = b80Var.f756j.f61a;
                    f80 f80Var3 = h80Var.f3089i;
                    if ((f80Var3 != null ? f80Var3.f2347n : -1) == h80Var.f3081a.f9241l.f3465c - 1) {
                        b80Var.f761o++;
                    }
                    int i = b80Var.f762p;
                    if (i != -1 && b80Var.f761o >= i) {
                        b80Var.stop();
                    }
                }
            }
            if (f80Var2 != null) {
                handler.obtainMessage(2, f80Var2).sendToTarget();
            }
        }
        m2226a();
    }

    /* JADX INFO: renamed from: c */
    public final void m2228c(ie1 ie1Var, Bitmap bitmap) {
        o80.m3647h(ie1Var, "Argument must not be null");
        o80.m3647h(bitmap, "Argument must not be null");
        this.f3092l = bitmap;
        this.f3088h = this.f3088h.mo2514a(new p11().m4297n(ie1Var));
        this.f3094n = zg1.m5896g(bitmap);
        this.f3095o = bitmap.getWidth();
        this.f3096p = bitmap.getHeight();
    }
}
