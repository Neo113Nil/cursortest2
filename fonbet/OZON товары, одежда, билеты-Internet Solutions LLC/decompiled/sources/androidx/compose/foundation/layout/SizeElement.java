package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/b0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeElement extends AbstractC2794c0<b0> {

    /* renamed from: a, reason: collision with root package name */
    private final float f39392a;

    /* renamed from: b, reason: collision with root package name */
    private final float f39393b;

    /* renamed from: c, reason: collision with root package name */
    private final float f39394c;

    /* renamed from: d, reason: collision with root package name */
    private final float f39395d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39396e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<C5242e1, Unit> f39397f;

    private SizeElement() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SizeElement(float f7, float f11, float f12, float f13, boolean z11, Function1 function1, int i11) {
        this(f7, f11, f12, r7, r8, r9);
        Function1 function12;
        boolean z12;
        float f14;
        f7 = (i11 & 1) != 0 ? Float.NaN : f7;
        f11 = (i11 & 2) != 0 ? Float.NaN : f11;
        f12 = (i11 & 4) != 0 ? Float.NaN : f12;
        if ((i11 & 8) != 0) {
            function12 = function1;
            z12 = z11;
            f14 = Float.NaN;
        } else {
            function12 = function1;
            z12 = z11;
            f14 = f13;
        }
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final b0 getF41119a() {
        return new b0(this.f39392a, this.f39393b, this.f39394c, this.f39395d, this.f39396e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return Z1.h.b(this.f39392a, sizeElement.f39392a) && Z1.h.b(this.f39393b, sizeElement.f39393b) && Z1.h.b(this.f39394c, sizeElement.f39394c) && Z1.h.b(this.f39395d, sizeElement.f39395d) && this.f39396e == sizeElement.f39396e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39396e) + Pk0.b.a(this.f39395d, Pk0.b.a(this.f39394c, Pk0.b.a(this.f39393b, Float.hashCode(this.f39392a) * 31, 31), 31), 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(b0 b0Var) {
        b0 b0Var2 = b0Var;
        b0Var2.N1(this.f39392a);
        b0Var2.M1(this.f39393b);
        b0Var2.L1(this.f39394c);
        b0Var2.K1(this.f39395d);
        b0Var2.J1(this.f39396e);
    }

    public SizeElement(float f7, float f11, float f12, float f13, boolean z11, Function1 function1) {
        this.f39392a = f7;
        this.f39393b = f11;
        this.f39394c = f12;
        this.f39395d = f13;
        this.f39396e = z11;
        this.f39397f = function1;
    }
}
