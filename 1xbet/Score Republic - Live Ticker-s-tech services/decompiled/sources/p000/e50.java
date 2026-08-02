package p000;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0030a;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e50 extends o80 implements hi1, yh0, x41, w50 {

    /* JADX INFO: renamed from: n */
    public final AbstractActivityC0790v4 f1951n;

    /* JADX INFO: renamed from: o */
    public final AbstractActivityC0790v4 f1952o;

    /* JADX INFO: renamed from: p */
    public final Handler f1953p;

    /* JADX INFO: renamed from: q */
    public final t50 f1954q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ AbstractActivityC0790v4 f1955r;

    public e50(AbstractActivityC0790v4 abstractActivityC0790v4) {
        this.f1955r = abstractActivityC0790v4;
        Handler handler = new Handler();
        this.f1951n = abstractActivityC0790v4;
        this.f1952o = abstractActivityC0790v4;
        this.f1953p = handler;
        this.f1954q = new t50();
    }

    @Override // p000.x41
    /* JADX INFO: renamed from: a */
    public final C0086c5 mo859a() {
        return (C0086c5) this.f1955r.f2777m.f5011m;
    }

    @Override // p000.hi1
    /* JADX INFO: renamed from: c */
    public final gi1 mo861c() {
        return this.f1955r.mo861c();
    }

    @Override // p000.yh0
    /* JADX INFO: renamed from: d */
    public final C0030a mo862d() {
        return this.f1955r.f8057E;
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: t */
    public final View mo24t(int i) {
        return this.f1955r.findViewById(i);
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: u */
    public final boolean mo25u() {
        Window window = this.f1955r.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p000.w50
    /* JADX INFO: renamed from: b */
    public final void mo1364b() {
    }
}
