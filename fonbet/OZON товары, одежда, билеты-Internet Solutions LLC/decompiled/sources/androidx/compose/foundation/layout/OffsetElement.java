package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/Q;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class OffsetElement extends AbstractC2794c0<Q> {

    /* renamed from: a, reason: collision with root package name */
    private final float f39364a;

    /* renamed from: b, reason: collision with root package name */
    private final float f39365b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39366c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<C5242e1, Unit> f39367d;

    private OffsetElement() {
        throw null;
    }

    public OffsetElement(float f7, float f11, Function1 function1) {
        this.f39364a = f7;
        this.f39365b = f11;
        this.f39366c = true;
        this.f39367d = function1;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final Q getF41119a() {
        return new Q(this.f39364a, this.f39365b, this.f39366c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && Z1.h.b(this.f39364a, offsetElement.f39364a) && Z1.h.b(this.f39365b, offsetElement.f39365b) && this.f39366c == offsetElement.f39366c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39366c) + Pk0.b.a(this.f39365b, Float.hashCode(this.f39364a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetModifierElement(x=");
        sb2.append((Object) Z1.h.c(this.f39364a));
        sb2.append(", y=");
        sb2.append((Object) Z1.h.c(this.f39365b));
        sb2.append(", rtlAware=");
        return B4.V.d(sb2, this.f39366c, ')');
    }

    @Override // D1.AbstractC2794c0
    public final void update(Q q11) {
        Q q12 = q11;
        q12.M1(this.f39364a);
        q12.N1(this.f39365b);
        q12.L1(this.f39366c);
    }
}
