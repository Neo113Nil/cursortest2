package j3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f17527m;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f17527m = bArr;
    }

    @Override // j3.m
    public final byte[] t1() {
        return this.f17527m;
    }
}
