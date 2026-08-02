package androidx.dynamicanimation.animation;

import android.widget.ImageView;
import androidx.dynamicanimation.animation.b;

/* loaded from: classes8.dex */
public final class c extends b<c> {

    /* renamed from: u, reason: collision with root package name */
    private final a f42666u;

    static final class a {

        /* renamed from: b, reason: collision with root package name */
        private float f42668b;

        /* renamed from: a, reason: collision with root package name */
        private float f42667a = -4.2f;

        /* renamed from: c, reason: collision with root package name */
        private final b.p f42669c = new b.p();

        a() {
        }

        public final boolean a(float f7) {
            return Math.abs(f7) < this.f42668b;
        }

        final void b(float f7) {
            this.f42667a = f7 * (-4.2f);
        }

        final void c(float f7) {
            this.f42668b = f7 * 62.5f;
        }

        final b.p d(float f7, float f11, long j11) {
            float f12 = j11;
            double exp = Math.exp((f12 / 1000.0f) * this.f42667a);
            b.p pVar = this.f42669c;
            pVar.f42665b = (float) (exp * f11);
            pVar.f42664a = (float) ((Math.exp((r0 * f12) / 1000.0f) * (f11 / this.f42667a)) + (f7 - r6));
            if (a(pVar.f42665b)) {
                pVar.f42665b = 0.0f;
            }
            return pVar;
        }
    }

    public c(e eVar) {
        super(eVar);
        a aVar = new a();
        this.f42666u = aVar;
        aVar.c(f());
    }

    @Override // androidx.dynamicanimation.animation.b
    final boolean m(long j11) {
        float f7 = this.f42652b;
        float f11 = this.f42651a;
        a aVar = this.f42666u;
        b.p d11 = aVar.d(f7, f11, j11);
        float f12 = d11.f42664a;
        this.f42652b = f12;
        float f13 = d11.f42665b;
        this.f42651a = f13;
        float f14 = this.f42658h;
        if (f12 < f14) {
            this.f42652b = f14;
            return true;
        }
        float f15 = this.f42657g;
        if (f12 <= f15) {
            return f12 >= f15 || f12 <= f14 || aVar.a(f13);
        }
        this.f42652b = f15;
        return true;
    }

    public final void n(float f7) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.f42666u.b(f7);
    }

    public final void o(float f7) {
        this.f42651a = f7;
    }

    public c(ImageView imageView, b.s sVar) {
        super(imageView, sVar);
        a aVar = new a();
        this.f42666u = aVar;
        aVar.c(f());
    }
}
