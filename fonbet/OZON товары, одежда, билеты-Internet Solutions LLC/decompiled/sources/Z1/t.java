package Z1;

import F3.G;
import a2.InterfaceC4921a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class t implements InterfaceC4921a {

    /* renamed from: a, reason: collision with root package name */
    private final float f35332a;

    public t(float f7) {
        this.f35332a = f7;
    }

    @Override // a2.InterfaceC4921a
    public final float a(float f7) {
        return f7 / this.f35332a;
    }

    @Override // a2.InterfaceC4921a
    public final float b(float f7) {
        return f7 * this.f35332a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f35332a, ((t) obj).f35332a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35332a);
    }

    @NotNull
    public final String toString() {
        return G.a(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f35332a, ')');
    }
}
