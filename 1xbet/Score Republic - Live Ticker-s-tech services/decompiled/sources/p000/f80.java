package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f80 extends AbstractC0846wn {

    /* JADX INFO: renamed from: m */
    public final Handler f2346m;

    /* JADX INFO: renamed from: n */
    public final int f2347n;

    /* JADX INFO: renamed from: o */
    public final long f2348o;

    /* JADX INFO: renamed from: p */
    public Bitmap f2349p;

    public f80(Handler handler, int i, long j) {
        this.f2346m = handler;
        this.f2347n = i;
        this.f2348o = j;
    }

    @Override // p000.AbstractC0846wn
    /* JADX INFO: renamed from: d */
    public final void mo551d(Drawable drawable) {
        this.f2349p = null;
    }

    @Override // p000.AbstractC0846wn
    /* JADX INFO: renamed from: f */
    public final void mo553f(Object obj) {
        this.f2349p = (Bitmap) obj;
        Handler handler = this.f2346m;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f2348o);
    }
}
