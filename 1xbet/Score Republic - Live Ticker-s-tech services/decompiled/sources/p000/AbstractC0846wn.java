package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: wn */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0846wn implements wh0 {

    /* JADX INFO: renamed from: j */
    public final int f8589j;

    /* JADX INFO: renamed from: k */
    public final int f8590k;

    /* JADX INFO: renamed from: l */
    public h11 f8591l;

    public AbstractC0846wn() {
        if (!zg1.m5903n(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            C0270h1.m2190f("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.f8589j = Integer.MIN_VALUE;
        this.f8590k = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo551d(Drawable drawable);

    /* JADX INFO: renamed from: f */
    public abstract void mo553f(Object obj);

    @Override // p000.wh0
    /* JADX INFO: renamed from: a */
    public final void mo245a() {
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: b */
    public final void mo246b() {
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: c */
    public final void mo247c() {
    }

    /* JADX INFO: renamed from: e */
    public void mo552e(Drawable drawable) {
    }
}
