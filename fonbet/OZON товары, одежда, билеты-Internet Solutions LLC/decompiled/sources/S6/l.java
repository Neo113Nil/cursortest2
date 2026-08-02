package S6;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.c f25933a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f25934b;

    public l(@NonNull Q6.c cVar, @NonNull byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f25933a = cVar;
        this.f25934b = bArr;
    }

    public final byte[] a() {
        return this.f25934b;
    }

    public final Q6.c b() {
        return this.f25933a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f25933a.equals(lVar.f25933a)) {
            return Arrays.equals(this.f25934b, lVar.f25934b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f25933a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25934b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f25933a + ", bytes=[...]}";
    }
}
