package Yf;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class k extends j<a> {

    /* renamed from: y, reason: collision with root package name */
    private static final HashSet f34962y;

    /* renamed from: v, reason: collision with root package name */
    private float f34963v;

    /* renamed from: w, reason: collision with root package name */
    float f34964w;

    /* renamed from: x, reason: collision with root package name */
    float f34965x;

    public interface a {
        void a(@NonNull k kVar, float f7);

        boolean b(@NonNull k kVar);

        void c(@NonNull k kVar, float f7, float f11, float f12);
    }

    public static class b implements a {
    }

    static {
        HashSet hashSet = new HashSet();
        f34962y = hashSet;
        hashSet.add(2);
    }

    @Override // Yf.f, Yf.b
    protected final boolean b(int i11) {
        return Math.abs(this.f34964w) >= this.f34963v && super.b(2);
    }

    @Override // Yf.f
    protected final boolean h() {
        HashMap<i, e> hashMap = this.f34948m;
        ArrayList arrayList = this.f34947l;
        e eVar = hashMap.get(new i((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
        float degrees = (float) Math.toDegrees(Math.atan2(eVar.e(), eVar.d()) - Math.atan2(eVar.c(), eVar.a()));
        this.f34965x = degrees;
        this.f34964w += degrees;
        if (t()) {
            float f7 = this.f34965x;
            if (f7 != 0.0f) {
                ((a) this.f34925h).a(this, f7);
                return true;
            }
        }
        if (!b(2) || !((a) this.f34925h).b(this)) {
            return false;
        }
        p();
        return true;
    }

    @Override // Yf.f
    protected final void n() {
        this.f34964w = 0.0f;
    }

    @Override // Yf.j
    protected final void q() {
        super.q();
        if (this.f34965x == 0.0f) {
            this.f34960t = 0.0f;
            this.f34961u = 0.0f;
        }
        float f7 = this.f34960t;
        float abs = Math.abs((float) (((i().y * f7) + (i().x * this.f34961u)) / (Math.pow(i().y, 2.0d) + Math.pow(i().x, 2.0d))));
        if (this.f34965x < 0.0f) {
            abs = -abs;
        }
        ((a) this.f34925h).c(this, this.f34960t, this.f34961u, abs);
    }

    @Override // Yf.j
    @NonNull
    protected final HashSet u() {
        return f34962y;
    }

    public final float v() {
        return this.f34965x;
    }

    public final float w() {
        return this.f34964w;
    }

    public final void x(float f7) {
        this.f34963v = f7;
    }
}
