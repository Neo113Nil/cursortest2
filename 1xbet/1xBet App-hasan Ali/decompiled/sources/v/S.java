package v;

import android.content.Context;
import android.widget.EdgeEffect;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class S extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f20181a;

    /* renamed from: b, reason: collision with root package name */
    public float f20182b;

    public S(Context context) {
        super(context);
        this.f20181a = AbstractC2346c.a(context).f6003k * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f20182b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f5) {
        this.f20182b = 0.0f;
        super.onPull(f, f5);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f20182b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.f20182b = 0.0f;
        super.onPull(f);
    }
}
