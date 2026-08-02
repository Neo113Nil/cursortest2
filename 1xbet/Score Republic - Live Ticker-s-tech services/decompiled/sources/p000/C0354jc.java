package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: jc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0354jc implements v11, sd0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3897j = 1;

    /* JADX INFO: renamed from: k */
    public final Object f3898k;

    /* JADX INFO: renamed from: l */
    public final Object f3899l;

    public C0354jc(InterfaceC0318ic interfaceC0318ic, Bitmap bitmap) {
        o80.m3647h(bitmap, "Bitmap must not be null");
        this.f3898k = bitmap;
        o80.m3647h(interfaceC0318ic, "BitmapPool must not be null");
        this.f3899l = interfaceC0318ic;
    }

    @Override // p000.sd0
    /* JADX INFO: renamed from: a */
    public final void mo901a() {
        switch (this.f3897j) {
            case 0:
                ((Bitmap) this.f3898k).prepareToDraw();
                break;
            default:
                v11 v11Var = (v11) this.f3899l;
                if (v11Var instanceof sd0) {
                    ((sd0) v11Var).mo901a();
                }
                break;
        }
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: c */
    public final int mo267c() {
        switch (this.f3897j) {
            case 0:
                return zg1.m5896g((Bitmap) this.f3898k);
            default:
                return ((v11) this.f3899l).mo267c();
        }
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: d */
    public final Class mo268d() {
        switch (this.f3897j) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: e */
    public final void mo269e() {
        switch (this.f3897j) {
            case 0:
                ((InterfaceC0318ic) this.f3899l).mo2591h((Bitmap) this.f3898k);
                break;
            default:
                ((v11) this.f3899l).mo269e();
                break;
        }
    }

    @Override // p000.v11
    public final Object get() {
        switch (this.f3897j) {
            case 0:
                return (Bitmap) this.f3898k;
            default:
                return new BitmapDrawable((Resources) this.f3898k, (Bitmap) ((v11) this.f3899l).get());
        }
    }

    public C0354jc(Resources resources, v11 v11Var) {
        o80.m3647h(resources, "Argument must not be null");
        this.f3898k = resources;
        o80.m3647h(v11Var, "Argument must not be null");
        this.f3899l = v11Var;
    }
}
