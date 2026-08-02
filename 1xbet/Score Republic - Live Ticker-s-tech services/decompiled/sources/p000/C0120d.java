package p000;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: renamed from: d */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0120d implements li1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1497j;

    /* JADX INFO: renamed from: k */
    public int f1498k;

    /* JADX INFO: renamed from: l */
    public boolean f1499l;

    /* JADX INFO: renamed from: m */
    public final Object f1500m;

    public C0120d(C0095ce c0095ce, int i, boolean z) {
        this.f1497j = 1;
        a90.m127k(c0095ce, "callOptions");
        this.f1500m = c0095ce;
        this.f1498k = i;
        this.f1499l = z;
    }

    @Override // p000.li1
    /* JADX INFO: renamed from: a */
    public void mo1067a() {
        if (this.f1499l) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f1500m;
        actionBarContextView.f347o = null;
        super/*android.view.View*/.setVisibility(this.f1498k);
    }

    @Override // p000.li1
    /* JADX INFO: renamed from: b */
    public void mo1068b() {
        this.f1499l = true;
    }

    @Override // p000.li1
    /* JADX INFO: renamed from: d */
    public void mo1069d() {
        super/*android.view.View*/.setVisibility(0);
        this.f1499l = false;
    }

    public String toString() {
        switch (this.f1497j) {
            case 1:
                C0809vn c0809vnM5362k = wm1.m5362k(this);
                c0809vnM5362k.m5172c((C0095ce) this.f1500m, "callOptions");
                c0809vnM5362k.m5175f("previousAttempts", String.valueOf(this.f1498k));
                c0809vnM5362k.m5174e("isTransparentRetry", this.f1499l);
                return c0809vnM5362k.toString();
            default:
                return super.toString();
        }
    }

    public C0120d(ActionBarContextView actionBarContextView) {
        this.f1497j = 0;
        this.f1500m = actionBarContextView;
        this.f1499l = false;
    }
}
