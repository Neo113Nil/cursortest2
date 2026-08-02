package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: ec */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0169ec implements y11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2054a;

    /* JADX INFO: renamed from: b */
    public final Object f2055b;

    /* JADX INFO: renamed from: c */
    public final Object f2056c;

    public C0169ec(Resources resources, y11 y11Var) {
        this.f2054a = 0;
        this.f2056c = resources;
        this.f2055b = y11Var;
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: a */
    public final v11 mo18a(Object obj, int i, int i2, uu0 uu0Var) {
        boolean z;
        h01 h01Var;
        C0708sx c0708sx;
        switch (this.f2054a) {
            case 0:
                v11 v11VarMo18a = ((y11) this.f2055b).mo18a(obj, i, i2, uu0Var);
                Resources resources = (Resources) this.f2056c;
                if (v11VarMo18a == null) {
                    return null;
                }
                return new C0354jc(resources, v11VarMo18a);
            case 1:
                v11 v11VarM20c = ((a21) this.f2055b).m20c((Uri) obj, uu0Var);
                if (v11VarM20c == null) {
                    return null;
                }
                return hn0.m2314h((InterfaceC0318ic) this.f2056c, (Drawable) ((c80) v11VarM20c).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                boolean z2 = false;
                if (inputStream instanceof h01) {
                    h01Var = (h01) inputStream;
                    z = false;
                } else {
                    z = true;
                    h01Var = new h01(inputStream, (nk0) this.f2056c);
                }
                ArrayDeque arrayDeque = C0708sx.f7222l;
                synchronized (arrayDeque) {
                    c0708sx = (C0708sx) arrayDeque.poll();
                    break;
                }
                if (c0708sx == null) {
                    c0708sx = new C0708sx();
                }
                C0708sx c0708sx2 = c0708sx;
                c0708sx2.f7223j = h01Var;
                gm0 gm0Var = new gm0(c0708sx2);
                a81 a81Var = new a81(h01Var, c0708sx2, 3, z2);
                try {
                    C0742tu c0742tu = (C0742tu) this.f2055b;
                    C0354jc c0354jcM4848a = c0742tu.m4848a(new qd0(gm0Var, c0742tu.f7599d, c0742tu.f7598c), i, i2, uu0Var, a81Var);
                    c0708sx2.f7224k = null;
                    c0708sx2.f7223j = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c0708sx2);
                        break;
                    }
                    return c0354jcM4848a;
                } finally {
                    c0708sx2.f7224k = null;
                    c0708sx2.f7223j = null;
                    ArrayDeque arrayDeque2 = C0708sx.f7222l;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c0708sx2);
                        if (z) {
                            h01Var.m2184e();
                        }
                    }
                }
        }
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: b */
    public final boolean mo19b(Object obj, uu0 uu0Var) {
        switch (this.f2054a) {
            case 0:
                return ((y11) this.f2055b).mo19b(obj, uu0Var);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public /* synthetic */ C0169ec(int i, Object obj, Object obj2) {
        this.f2054a = i;
        this.f2055b = obj;
        this.f2056c = obj2;
    }
}
