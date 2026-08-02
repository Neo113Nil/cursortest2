package E;

import E.C2893i;
import android.graphics.Bitmap;

/* renamed from: E.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2885a extends C2893i.b {

    /* renamed from: a, reason: collision with root package name */
    private final N.p<Bitmap> f6865a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6866b;

    C2885a(N.p<Bitmap> pVar, int i11) {
        if (pVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f6865a = pVar;
        this.f6866b = i11;
    }

    @Override // E.C2893i.b
    final int a() {
        return this.f6866b;
    }

    @Override // E.C2893i.b
    final N.p<Bitmap> b() {
        return this.f6865a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2893i.b)) {
            return false;
        }
        C2893i.b bVar = (C2893i.b) obj;
        return this.f6865a.equals(bVar.b()) && this.f6866b == bVar.a();
    }

    public final int hashCode() {
        return ((this.f6865a.hashCode() ^ 1000003) * 1000003) ^ this.f6866b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{packet=");
        sb2.append(this.f6865a);
        sb2.append(", jpegQuality=");
        return K00.b.e(this.f6866b, "}", sb2);
    }
}
