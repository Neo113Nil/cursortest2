package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Zb {

    /* renamed from: a, reason: collision with root package name */
    public final int f30580a;

    /* renamed from: b, reason: collision with root package name */
    public final Sr f30581b;

    public Zb(int i11, Sr text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f30580a = i11;
        this.f30581b = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zb)) {
            return false;
        }
        Zb zb2 = (Zb) obj;
        return this.f30580a == zb2.f30580a && this.f30581b.equals(zb2.f30581b);
    }

    public final int hashCode() {
        return this.f30581b.hashCode() + (Integer.hashCode(this.f30580a) * 31);
    }

    public final String toString() {
        return "HintHelperItem(priority=" + this.f30580a + ", text=" + this.f30581b + ")";
    }
}
