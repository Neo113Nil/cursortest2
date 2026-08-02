package E;

import E.C2904u;
import E.Y;
import android.util.Size;
import androidx.annotation.NonNull;

/* renamed from: E.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2886b extends C2904u.b {

    /* renamed from: d, reason: collision with root package name */
    private final Size f6870d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6871e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6872f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6873g;

    /* renamed from: h, reason: collision with root package name */
    private final C.O f6874h;

    /* renamed from: i, reason: collision with root package name */
    private final Size f6875i;

    /* renamed from: j, reason: collision with root package name */
    private final int f6876j;

    /* renamed from: k, reason: collision with root package name */
    private final N.m<P> f6877k;

    /* renamed from: l, reason: collision with root package name */
    private final N.m<Y.a> f6878l;

    C2886b(Size size, int i11, int i12, boolean z11, C.O o11, Size size2, int i13, N.m<P> mVar, N.m<Y.a> mVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f6870d = size;
        this.f6871e = i11;
        this.f6872f = i12;
        this.f6873g = z11;
        this.f6874h = o11;
        this.f6875i = size2;
        this.f6876j = i13;
        this.f6877k = mVar;
        this.f6878l = mVar2;
    }

    @Override // E.C2904u.b
    @NonNull
    final N.m<Y.a> b() {
        return this.f6878l;
    }

    @Override // E.C2904u.b
    final C.O c() {
        return this.f6874h;
    }

    @Override // E.C2904u.b
    final int d() {
        return this.f6871e;
    }

    @Override // E.C2904u.b
    final int e() {
        return this.f6872f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2904u.b)) {
            return false;
        }
        C2904u.b bVar = (C2904u.b) obj;
        if (!this.f6870d.equals(bVar.j()) || this.f6871e != bVar.d() || this.f6872f != bVar.e() || this.f6873g != bVar.l()) {
            return false;
        }
        C.O o11 = this.f6874h;
        if (o11 == null) {
            if (bVar.c() != null) {
                return false;
            }
        } else if (!o11.equals(bVar.c())) {
            return false;
        }
        Size size = this.f6875i;
        if (size == null) {
            if (bVar.g() != null) {
                return false;
            }
        } else if (!size.equals(bVar.g())) {
            return false;
        }
        return this.f6876j == bVar.f() && this.f6877k.equals(bVar.i()) && this.f6878l.equals(bVar.b());
    }

    @Override // E.C2904u.b
    final int f() {
        return this.f6876j;
    }

    @Override // E.C2904u.b
    final Size g() {
        return this.f6875i;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f6870d.hashCode() ^ 1000003) * 1000003) ^ this.f6871e) * 1000003) ^ this.f6872f) * 1000003) ^ (this.f6873g ? 1231 : 1237)) * 1000003;
        C.O o11 = this.f6874h;
        int hashCode2 = (hashCode ^ (o11 == null ? 0 : o11.hashCode())) * 1000003;
        Size size = this.f6875i;
        return ((((((hashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.f6876j) * 1000003) ^ this.f6877k.hashCode()) * 1000003) ^ this.f6878l.hashCode();
    }

    @Override // E.C2904u.b
    @NonNull
    final N.m<P> i() {
        return this.f6877k;
    }

    @Override // E.C2904u.b
    final Size j() {
        return this.f6870d;
    }

    @Override // E.C2904u.b
    final boolean l() {
        return this.f6873g;
    }

    public final String toString() {
        return "In{size=" + this.f6870d + ", inputFormat=" + this.f6871e + ", outputFormat=" + this.f6872f + ", virtualCamera=" + this.f6873g + ", imageReaderProxyProvider=" + this.f6874h + ", postviewSize=" + this.f6875i + ", postviewImageFormat=" + this.f6876j + ", requestEdge=" + this.f6877k + ", errorEdge=" + this.f6878l + "}";
    }
}
