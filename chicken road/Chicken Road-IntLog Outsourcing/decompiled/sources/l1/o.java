package l1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f11025f;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f11025f = bArr;
    }

    @Override // l1.n
    public final byte[] f() {
        return this.f11025f;
    }
}
