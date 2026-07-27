package P4;

import java.util.Arrays;

/* renamed from: P4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128g extends K {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2372a;

    /* renamed from: b, reason: collision with root package name */
    public int f2373b;

    @Override // P4.K
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f2372a, this.f2373b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // P4.K
    public final void b(int i2) {
        byte[] bArr = this.f2372a;
        if (bArr.length < i2) {
            int length = bArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2372a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2373b;
    }
}
