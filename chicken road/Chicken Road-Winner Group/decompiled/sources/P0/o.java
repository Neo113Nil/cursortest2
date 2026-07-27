package P0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1147e;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f1147e = bArr;
    }

    @Override // P0.n
    public final byte[] g() {
        return this.f1147e;
    }
}
