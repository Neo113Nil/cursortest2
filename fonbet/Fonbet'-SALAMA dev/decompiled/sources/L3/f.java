package L3;

import F.x;
import java.security.GeneralSecurityException;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public final class f extends x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4336c;

    public f(byte[] bArr, int i7) {
        this.f4336c = i7;
        if (!AbstractC1663a.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f2475a = n(1, bArr);
        this.f2476b = n(0, bArr);
    }

    @Override // F.x
    public final e n(int i7, byte[] bArr) {
        switch (this.f4336c) {
            case 0:
                return new d(bArr, i7, 0);
            default:
                return new d(bArr, i7, 1);
        }
    }
}
