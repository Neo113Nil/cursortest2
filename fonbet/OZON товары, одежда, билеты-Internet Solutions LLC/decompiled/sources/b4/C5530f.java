package b4;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: b4.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5530f extends AbstractC5532h {

    /* renamed from: b, reason: collision with root package name */
    public final String f55503b;

    /* renamed from: c, reason: collision with root package name */
    public final String f55504c;

    /* renamed from: d, reason: collision with root package name */
    public final String f55505d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f55506e;

    public C5530f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f55503b = str;
        this.f55504c = str2;
        this.f55505d = str3;
        this.f55506e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5530f.class == obj.getClass()) {
            C5530f c5530f = (C5530f) obj;
            if (Objects.equals(this.f55503b, c5530f.f55503b) && Objects.equals(this.f55504c, c5530f.f55504c) && Objects.equals(this.f55505d, c5530f.f55505d) && Arrays.equals(this.f55506e, c5530f.f55506e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f55503b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55504c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55505d;
        return Arrays.hashCode(this.f55506e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // b4.AbstractC5532h
    public final String toString() {
        return this.f55512a + ": mimeType=" + this.f55503b + ", filename=" + this.f55504c + ", description=" + this.f55505d;
    }
}
