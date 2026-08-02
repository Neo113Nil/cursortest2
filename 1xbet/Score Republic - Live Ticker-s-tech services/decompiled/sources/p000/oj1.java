package p000;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oj1 {

    /* JADX INFO: renamed from: a */
    public final Rect[][] f5759a;

    /* JADX INFO: renamed from: b */
    public final Rect[][] f5760b;

    public oj1(ak1 ak1Var) {
        this.f5759a = new Rect[10][];
        this.f5760b = new Rect[10][];
        mo3398c(ak1Var);
    }

    /* JADX INFO: renamed from: b */
    public abstract ak1 mo2654b();

    /* JADX INFO: renamed from: c */
    public void mo3398c(ak1 ak1Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo3936e = ak1Var.f229a.mo3936e(i);
            int iM3495d = n80.m3495d(i);
            this.f5759a[iM3495d] = (Rect[]) listMo3936e.toArray(new Rect[listMo3936e.size()]);
            if (i != 8) {
                List<Rect> listMo3937f = ak1Var.f229a.mo3937f(i);
                this.f5760b[iM3495d] = (Rect[]) listMo3937f.toArray(new Rect[listMo3937f.size()]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2655d(wd0 wd0Var);

    public oj1() {
        this(new ak1());
    }

    /* JADX INFO: renamed from: a */
    public final void m3696a() {
    }
}
