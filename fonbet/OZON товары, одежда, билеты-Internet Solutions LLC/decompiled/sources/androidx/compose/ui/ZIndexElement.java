package androidx.compose.ui;

import D1.AbstractC2794c0;
import F3.G;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "LD1/c0;", "Landroidx/compose/ui/f;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ZIndexElement extends AbstractC2794c0<f> {

    /* renamed from: a, reason: collision with root package name */
    private final float f40320a;

    public ZIndexElement(float f7) {
        this.f40320a = f7;
    }

    @Override // D1.AbstractC2794c0
    public final f create() {
        return new f(this.f40320a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f40320a, ((ZIndexElement) obj).f40320a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f40320a);
    }

    @NotNull
    public final String toString() {
        return G.a(new StringBuilder("ZIndexElement(zIndex="), this.f40320a, ')');
    }

    @Override // D1.AbstractC2794c0
    public final void update(f fVar) {
        fVar.J1(this.f40320a);
    }
}
