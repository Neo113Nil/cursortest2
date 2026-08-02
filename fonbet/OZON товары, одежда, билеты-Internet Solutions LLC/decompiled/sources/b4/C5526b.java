package b4;

import java.util.Arrays;

/* renamed from: b4.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5526b extends AbstractC5532h {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f55488b;

    public C5526b(String str, byte[] bArr) {
        super(str);
        this.f55488b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5526b.class == obj.getClass()) {
            C5526b c5526b = (C5526b) obj;
            if (this.f55512a.equals(c5526b.f55512a) && Arrays.equals(this.f55488b, c5526b.f55488b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f55488b) + G.g.a(527, 31, this.f55512a);
    }
}
