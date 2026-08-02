package V5;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class x implements T5.f {

    /* renamed from: j, reason: collision with root package name */
    private static final p6.h<Class<?>, byte[]> f28309j = new p6.h<>(50);

    /* renamed from: b, reason: collision with root package name */
    private final W5.b f28310b;

    /* renamed from: c, reason: collision with root package name */
    private final T5.f f28311c;

    /* renamed from: d, reason: collision with root package name */
    private final T5.f f28312d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28313e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28314f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f28315g;

    /* renamed from: h, reason: collision with root package name */
    private final T5.i f28316h;

    /* renamed from: i, reason: collision with root package name */
    private final T5.m<?> f28317i;

    x(W5.b bVar, T5.f fVar, T5.f fVar2, int i11, int i12, T5.m<?> mVar, Class<?> cls, T5.i iVar) {
        this.f28310b = bVar;
        this.f28311c = fVar;
        this.f28312d = fVar2;
        this.f28313e = i11;
        this.f28314f = i12;
        this.f28317i = mVar;
        this.f28315g = cls;
        this.f28316h = iVar;
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f28314f == xVar.f28314f && this.f28313e == xVar.f28313e && p6.l.b(this.f28317i, xVar.f28317i) && this.f28315g.equals(xVar.f28315g) && this.f28311c.equals(xVar.f28311c) && this.f28312d.equals(xVar.f28312d) && this.f28316h.equals(xVar.f28316h)) {
                return true;
            }
        }
        return false;
    }

    @Override // T5.f
    public final int hashCode() {
        int hashCode = ((((this.f28312d.hashCode() + (this.f28311c.hashCode() * 31)) * 31) + this.f28313e) * 31) + this.f28314f;
        T5.m<?> mVar = this.f28317i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return this.f28316h.hashCode() + ((this.f28315g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f28311c + ", signature=" + this.f28312d + ", width=" + this.f28313e + ", height=" + this.f28314f + ", decodedResourceClass=" + this.f28315g + ", transformation='" + this.f28317i + "', options=" + this.f28316h + '}';
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        W5.b bVar = this.f28310b;
        byte[] bArr = (byte[]) bVar.c();
        ByteBuffer.wrap(bArr).putInt(this.f28313e).putInt(this.f28314f).array();
        this.f28312d.updateDiskCacheKey(messageDigest);
        this.f28311c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        T5.m<?> mVar = this.f28317i;
        if (mVar != null) {
            mVar.updateDiskCacheKey(messageDigest);
        }
        this.f28316h.updateDiskCacheKey(messageDigest);
        p6.h<Class<?>, byte[]> hVar = f28309j;
        Class<?> cls = this.f28315g;
        byte[] b11 = hVar.b(cls);
        if (b11 == null) {
            b11 = cls.getName().getBytes(T5.f.f26662a);
            hVar.f(cls, b11);
        }
        messageDigest.update(b11);
        bVar.a(bArr);
    }
}
