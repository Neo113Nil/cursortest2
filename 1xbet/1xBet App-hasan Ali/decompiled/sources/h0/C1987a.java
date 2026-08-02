package h0;

import t3.AbstractC2425d;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1987a {

    /* renamed from: a, reason: collision with root package name */
    public float f17187a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f17188b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f17189c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f17190d = 0.0f;

    public final void a(float f, float f5, float f6, float f7) {
        this.f17187a = Math.max(f, this.f17187a);
        this.f17188b = Math.max(f5, this.f17188b);
        this.f17189c = Math.min(f6, this.f17189c);
        this.f17190d = Math.min(f7, this.f17190d);
    }

    public final boolean b() {
        return (this.f17187a >= this.f17189c) | (this.f17188b >= this.f17190d);
    }

    public final String toString() {
        return "MutableRect(" + AbstractC2425d.M(this.f17187a) + ", " + AbstractC2425d.M(this.f17188b) + ", " + AbstractC2425d.M(this.f17189c) + ", " + AbstractC2425d.M(this.f17190d) + ')';
    }
}
