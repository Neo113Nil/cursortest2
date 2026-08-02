package p000;

import android.content.Context;
import android.util.Log;
import android.view.View;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sq1 implements iq0, f12 {

    /* JADX INFO: renamed from: j */
    public Object f7192j;

    public sq1(int i) {
        switch (i) {
            case 2:
                this.f7192j = new LinkedHashMap();
                break;
            case 5:
                this.f7192j = Collections.newSetFromMap(new IdentityHashMap());
                break;
            case 9:
                this.f7192j = new ConcurrentHashMap();
                break;
            default:
                this.f7192j = new ArrayDeque(20);
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo4125A(Object obj, long j, double d);

    @Override // p000.f12
    /* JADX INFO: renamed from: a */
    public u90 mo1562a() {
        throw null;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public ky1 mo1563b() {
        throw null;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: c */
    public a02 mo1564c() {
        throw null;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: e */
    public Context mo1566e() {
        throw null;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: f */
    public wa0 mo1567f() {
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo3289g(f71 f71Var);

    /* JADX INFO: renamed from: h */
    public abstract String mo3290h();

    /* JADX INFO: renamed from: i */
    public abstract void mo4089i();

    /* JADX INFO: renamed from: j */
    public abstract void mo4090j();

    /* JADX INFO: renamed from: k */
    public boolean m4575k() {
        int i;
        i91 i91Var = (i91) this.f7192j;
        View view = i91Var.f3488c.f1112P;
        if (view != null) {
            i = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        C0270h1.m2190f(j11.m2773h("Unknown visibility ", visibility));
                        return false;
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        int i2 = i91Var.f3486a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m4576l(jw0 jw0Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f7192j;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(jw0Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m4577m(Object obj, boolean z) {
        Set set = (Set) this.f7192j;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                mo4089i();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            mo4090j();
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract Object mo3366n();

    /* JADX INFO: renamed from: o */
    public abstract void mo4126o(Object obj, long j, byte b);

    /* JADX INFO: renamed from: p */
    public Object m4578p(ab2 ab2Var, d71 d71Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f7192j;
        Object obj = concurrentHashMap.get(ab2Var);
        if (obj != null) {
            return obj;
        }
        Object objMo3366n = mo3366n();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(ab2Var, objMo3366n);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iMo1126s = d71Var.mo1126s();
        for (int i = 0; i < iMo1126s; i++) {
            if (ua2.f7742f.equals(d71Var.mo1127u(i))) {
                d71Var.mo1128v(i);
            }
        }
        return objMo3366n;
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo4127q(Object obj, long j);

    /* JADX INFO: renamed from: r */
    public abstract boolean mo727r(Level level);

    /* JADX INFO: renamed from: s */
    public abstract void mo4128s(Object obj, long j, boolean z);

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        return new C0058bd(2, (g00) this.f7192j);
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo728u(ra2 ra2Var);

    /* JADX INFO: renamed from: v */
    public abstract float mo4129v(Object obj, long j);

    /* JADX INFO: renamed from: w */
    public void mo729w(RuntimeException runtimeException, ra2 ra2Var) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo4130x(Object obj, long j, float f);

    /* JADX INFO: renamed from: y */
    public abstract double mo4131y(Object obj, long j);

    /* JADX INFO: renamed from: z */
    public void mo11z() {
        a02 a02Var = ((f02) this.f7192j).f2248p;
        f02.m1560m(a02Var);
        a02Var.mo11z();
    }

    public sq1(f02 f02Var) {
        p80.m3863h(f02Var);
        this.f7192j = f02Var;
    }

    public /* synthetic */ sq1(Object obj) {
        this.f7192j = obj;
    }

    public sq1(i91 i91Var) {
        i91Var.getClass();
        this.f7192j = i91Var;
    }
}
