package J;

import B4.V;

/* loaded from: classes8.dex */
final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final float f12607a;

    /* renamed from: b, reason: collision with root package name */
    private final float f12608b;

    /* renamed from: c, reason: collision with root package name */
    private final float f12609c;

    /* renamed from: d, reason: collision with root package name */
    private final float f12610d;

    b(float f7, float f11, float f12, float f13) {
        this.f12607a = f7;
        this.f12608b = f11;
        this.f12609c = f12;
        this.f12610d = f13;
    }

    @Override // C.v0
    public final float a() {
        return this.f12608b;
    }

    @Override // C.v0
    public final float b() {
        return this.f12610d;
    }

    @Override // C.v0
    public final float c() {
        return this.f12609c;
    }

    @Override // C.v0
    public final float d() {
        return this.f12607a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (Float.floatToIntBits(this.f12607a) == Float.floatToIntBits(((b) gVar).f12607a)) {
                b bVar = (b) gVar;
                if (Float.floatToIntBits(this.f12608b) == Float.floatToIntBits(bVar.f12608b) && Float.floatToIntBits(this.f12609c) == Float.floatToIntBits(bVar.f12609c) && Float.floatToIntBits(this.f12610d) == Float.floatToIntBits(bVar.f12610d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f12607a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f12608b)) * 1000003) ^ Float.floatToIntBits(this.f12609c)) * 1000003) ^ Float.floatToIntBits(this.f12610d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableZoomState{zoomRatio=");
        sb2.append(this.f12607a);
        sb2.append(", maxZoomRatio=");
        sb2.append(this.f12608b);
        sb2.append(", minZoomRatio=");
        sb2.append(this.f12609c);
        sb2.append(", linearZoom=");
        return V.b(this.f12610d, "}", sb2);
    }
}
