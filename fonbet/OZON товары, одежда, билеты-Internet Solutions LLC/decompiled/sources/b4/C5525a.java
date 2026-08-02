package b4;

import j3.s;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5525a extends AbstractC5532h {

    /* renamed from: b, reason: collision with root package name */
    public final String f55484b;

    /* renamed from: c, reason: collision with root package name */
    public final String f55485c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55486d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f55487e;

    public C5525a(int i11, String str, byte[] bArr, String str2) {
        super("APIC");
        this.f55484b = str;
        this.f55485c = str2;
        this.f55486d = i11;
        this.f55487e = bArr;
    }

    @Override // j3.t.a
    public final void a(s.a aVar) {
        aVar.I(this.f55486d, this.f55487e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5525a.class == obj.getClass()) {
            C5525a c5525a = (C5525a) obj;
            if (this.f55486d == c5525a.f55486d && Objects.equals(this.f55484b, c5525a.f55484b) && Objects.equals(this.f55485c, c5525a.f55485c) && Arrays.equals(this.f55487e, c5525a.f55487e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = (527 + this.f55486d) * 31;
        String str = this.f55484b;
        int hashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55485c;
        return Arrays.hashCode(this.f55487e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // b4.AbstractC5532h
    public final String toString() {
        return this.f55512a + ": mimeType=" + this.f55484b + ", description=" + this.f55485c;
    }
}
