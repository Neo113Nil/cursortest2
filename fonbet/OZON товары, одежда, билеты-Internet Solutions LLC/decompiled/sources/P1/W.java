package P1;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3809p f21528a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final F f21529b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21530c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21531d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f21532e;

    public W(AbstractC3809p abstractC3809p, F f7, int i11, int i12, Object obj) {
        this.f21528a = abstractC3809p;
        this.f21529b = f7;
        this.f21530c = i11;
        this.f21531d = i12;
        this.f21532e = obj;
    }

    public static W a(W w11) {
        F f7 = w11.f21529b;
        int i11 = w11.f21530c;
        int i12 = w11.f21531d;
        Object obj = w11.f21532e;
        w11.getClass();
        return new W(null, f7, i11, i12, obj);
    }

    public final AbstractC3809p b() {
        return this.f21528a;
    }

    public final int c() {
        return this.f21530c;
    }

    public final int d() {
        return this.f21531d;
    }

    @NotNull
    public final F e() {
        return this.f21529b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w11 = (W) obj;
        return Intrinsics.d(this.f21528a, w11.f21528a) && Intrinsics.d(this.f21529b, w11.f21529b) && this.f21530c == w11.f21530c && this.f21531d == w11.f21531d && Intrinsics.d(this.f21532e, w11.f21532e);
    }

    public final int hashCode() {
        AbstractC3809p abstractC3809p = this.f21528a;
        int a11 = C2454a.a(this.f21531d, C2454a.a(this.f21530c, (this.f21529b.hashCode() + ((abstractC3809p == null ? 0 : abstractC3809p.hashCode()) * 31)) * 31, 31), 31);
        Object obj = this.f21532e;
        return a11 + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f21528a);
        sb2.append(", fontWeight=");
        sb2.append(this.f21529b);
        sb2.append(", fontStyle=");
        String str = "Invalid";
        int i11 = this.f21530c;
        sb2.append((Object) (i11 == 0 ? "Normal" : i11 == 1 ? "Italic" : "Invalid"));
        sb2.append(", fontSynthesis=");
        int i12 = this.f21531d;
        if (i12 == 0) {
            str = "None";
        } else if (i12 == 1) {
            str = "All";
        } else if (i12 == 2) {
            str = "Weight";
        } else if (i12 == 3) {
            str = "Style";
        }
        sb2.append((Object) str);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f21532e);
        sb2.append(')');
        return sb2.toString();
    }
}
