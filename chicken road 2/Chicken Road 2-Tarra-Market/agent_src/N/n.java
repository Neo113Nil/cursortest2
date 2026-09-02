package N;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f255c;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f255c = bArr;
    }

    @Override // N.m
    public final byte[] f() {
        return this.f255c;
    }
}
