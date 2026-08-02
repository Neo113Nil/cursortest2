package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/U;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingElement extends AbstractC2794c0<U> {

    /* renamed from: a, reason: collision with root package name */
    private float f39374a;

    /* renamed from: b, reason: collision with root package name */
    private float f39375b;

    /* renamed from: c, reason: collision with root package name */
    private float f39376c;

    /* renamed from: d, reason: collision with root package name */
    private float f39377d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39378e;

    private PaddingElement() {
        throw null;
    }

    public PaddingElement(float f7, float f11, float f12, float f13, Function1 function1) {
        this.f39374a = f7;
        this.f39375b = f11;
        this.f39376c = f12;
        this.f39377d = f13;
        this.f39378e = true;
        if ((f7 < 0.0f && !Z1.h.b(f7, Float.NaN)) || ((f11 < 0.0f && !Z1.h.b(f11, Float.NaN)) || ((f12 < 0.0f && !Z1.h.b(f12, Float.NaN)) || (f13 < 0.0f && !Z1.h.b(f13, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final U getF41119a() {
        return new U(this.f39374a, this.f39375b, this.f39376c, this.f39377d, this.f39378e);
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && Z1.h.b(this.f39374a, paddingElement.f39374a) && Z1.h.b(this.f39375b, paddingElement.f39375b) && Z1.h.b(this.f39376c, paddingElement.f39376c) && Z1.h.b(this.f39377d, paddingElement.f39377d) && this.f39378e == paddingElement.f39378e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39378e) + Pk0.b.a(this.f39377d, Pk0.b.a(this.f39376c, Pk0.b.a(this.f39375b, Float.hashCode(this.f39374a) * 31, 31), 31), 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(U u11) {
        U u12 = u11;
        u12.O1(this.f39374a);
        u12.P1(this.f39375b);
        u12.M1(this.f39376c);
        u12.L1(this.f39377d);
        u12.N1(this.f39378e);
    }
}
