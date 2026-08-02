package O0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4014a;

    public a(int i) {
        this.f4014a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f4014a == ((a) obj).f4014a;
    }

    public final int hashCode() {
        return this.f4014a;
    }

    public final String toString() {
        return AbstractC2107A.t(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f4014a, ')');
    }
}
