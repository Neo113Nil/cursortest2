package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c80 implements v11, sd0 {

    /* JADX INFO: renamed from: j */
    public final Drawable f1161j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f1162k;

    public c80(Drawable drawable, int i) {
        this.f1162k = i;
        o80.m3647h(drawable, "Argument must not be null");
        this.f1161j = drawable;
    }

    @Override // p000.sd0
    /* JADX INFO: renamed from: a */
    public void mo901a() {
        int i = this.f1162k;
        Drawable drawable = this.f1161j;
        switch (i) {
            case 0:
                ((b80) drawable).f756j.f61a.f3092l.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof b80) {
                    ((b80) drawable).f756j.f61a.f3092l.prepareToDraw();
                }
                break;
        }
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: c */
    public final int mo267c() {
        int i = this.f1162k;
        Drawable drawable = this.f1161j;
        switch (i) {
            case 0:
                h80 h80Var = ((b80) drawable).f756j.f61a;
                y91 y91Var = h80Var.f3081a;
                return (y91Var.f9239j.length * 4) + y91Var.f9233d.limit() + y91Var.f9238i.length + h80Var.f3094n;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: d */
    public final Class mo268d() {
        switch (this.f1162k) {
            case 0:
                return b80.class;
            default:
                return this.f1161j.getClass();
        }
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: e */
    public final void mo269e() {
        nk0 nk0Var;
        nk0 nk0Var2;
        nk0 nk0Var3;
        switch (this.f1162k) {
            case 0:
                b80 b80Var = (b80) this.f1161j;
                b80Var.stop();
                b80Var.f759m = true;
                h80 h80Var = b80Var.f756j.f61a;
                n11 n11Var = h80Var.f3084d;
                h80Var.f3083c.clear();
                Bitmap bitmap = h80Var.f3092l;
                if (bitmap != null) {
                    h80Var.f3085e.mo2591h(bitmap);
                    h80Var.f3092l = null;
                }
                h80Var.f3086f = false;
                f80 f80Var = h80Var.f3089i;
                if (f80Var != null) {
                    n11Var.m3461d(f80Var);
                    h80Var.f3089i = null;
                }
                f80 f80Var2 = h80Var.f3091k;
                if (f80Var2 != null) {
                    n11Var.m3461d(f80Var2);
                    h80Var.f3091k = null;
                }
                f80 f80Var3 = h80Var.f3093m;
                if (f80Var3 != null) {
                    n11Var.m3461d(f80Var3);
                    h80Var.f3093m = null;
                }
                y91 y91Var = h80Var.f3081a;
                f50 f50Var = y91Var.f9232c;
                y91Var.f9241l = null;
                byte[] bArr = y91Var.f9238i;
                if (bArr != null && (nk0Var3 = (nk0) f50Var.f2314l) != null) {
                    nk0Var3.m3547g(bArr);
                }
                int[] iArr = y91Var.f9239j;
                if (iArr != null && (nk0Var2 = (nk0) f50Var.f2314l) != null) {
                    nk0Var2.m3547g(iArr);
                }
                Bitmap bitmap2 = y91Var.f9242m;
                if (bitmap2 != null) {
                    ((InterfaceC0318ic) f50Var.f2313k).mo2591h(bitmap2);
                }
                y91Var.f9242m = null;
                y91Var.f9233d = null;
                y91Var.f9248s = null;
                byte[] bArr2 = y91Var.f9234e;
                if (bArr2 != null && (nk0Var = (nk0) f50Var.f2314l) != null) {
                    nk0Var.m3547g(bArr2);
                }
                h80Var.f3090j = true;
                break;
        }
    }

    @Override // p000.v11
    public final Object get() {
        Drawable drawable = this.f1161j;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    /* JADX INFO: renamed from: b */
    private final void m900b() {
    }
}
