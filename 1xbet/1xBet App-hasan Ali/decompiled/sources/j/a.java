package j;

import android.graphics.drawable.Animatable;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class a extends AbstractC2349a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f17345n;

    /* renamed from: o, reason: collision with root package name */
    public final Animatable f17346o;

    public /* synthetic */ a(Animatable animatable, int i) {
        this.f17345n = i;
        this.f17346o = animatable;
    }

    @Override // r3.AbstractC2349a
    public final void O() {
        switch (this.f17345n) {
            case 0:
                this.f17346o.start();
                break;
            default:
                ((b2.d) this.f17346o).start();
                break;
        }
    }

    @Override // r3.AbstractC2349a
    public final void P() {
        switch (this.f17345n) {
            case 0:
                this.f17346o.stop();
                break;
            default:
                ((b2.d) this.f17346o).stop();
                break;
        }
    }
}
