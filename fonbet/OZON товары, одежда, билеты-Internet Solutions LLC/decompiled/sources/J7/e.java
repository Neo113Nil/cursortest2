package J7;

import android.app.PendingIntent;
import g.C6594f;

/* loaded from: classes9.dex */
final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f14164a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14165b;

    e(PendingIntent pendingIntent, boolean z11) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f14164a = pendingIntent;
        this.f14165b = z11;
    }

    @Override // J7.b
    final PendingIntent a() {
        return this.f14164a;
    }

    @Override // J7.b
    final boolean b() {
        return this.f14165b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14164a.equals(bVar.a()) && this.f14165b == bVar.b();
    }

    public final int hashCode() {
        return ((this.f14164a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f14165b ? 1237 : 1231);
    }

    public final String toString() {
        return Pk0.a.a("}", C6594f.b("ReviewInfo{pendingIntent=", this.f14164a.toString(), ", isNoOp="), this.f14165b);
    }
}
