package androidx.compose.foundation.layout;

import D1.AbstractC2794c0;
import E0.C2942q;
import androidx.compose.ui.platform.C5242e1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "LD1/c0;", "Landroidx/compose/foundation/layout/f;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AspectRatioElement extends AbstractC2794c0<C5183f> {

    /* renamed from: a, reason: collision with root package name */
    private final float f39298a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39299b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<C5242e1, Unit> f39300c;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectRatioElement(float f7, boolean z11, @NotNull Function1<? super C5242e1, Unit> function1) {
        this.f39298a = f7;
        this.f39299b = z11;
        this.f39300c = function1;
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException(C2942q.b(f7, "aspectRatio ", " must be > 0").toString());
        }
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final C5183f getF41119a() {
        return new C5183f(this.f39298a, this.f39299b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement != null && this.f39298a == aspectRatioElement.f39298a) {
            return this.f39299b == ((AspectRatioElement) obj).f39299b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39299b) + (Float.hashCode(this.f39298a) * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(C5183f c5183f) {
        C5183f c5183f2 = c5183f;
        c5183f2.I1(this.f39298a);
        c5183f2.J1(this.f39299b);
    }
}
