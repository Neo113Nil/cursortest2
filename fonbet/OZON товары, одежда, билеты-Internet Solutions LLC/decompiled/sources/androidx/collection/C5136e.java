package androidx.collection;

import kotlin.collections.C7705l;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5136e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f38697a;

    /* renamed from: b, reason: collision with root package name */
    private int f38698b;

    /* renamed from: c, reason: collision with root package name */
    private int f38699c;

    /* renamed from: d, reason: collision with root package name */
    private int f38700d;

    public C5136e() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f38700d = highestOneBit - 1;
        this.f38697a = new int[highestOneBit];
    }

    public final void a(int i11) {
        int[] iArr = this.f38697a;
        int i12 = this.f38699c;
        iArr[i12] = i11;
        int i13 = this.f38700d & (i12 + 1);
        this.f38699c = i13;
        int i14 = this.f38698b;
        if (i13 == i14) {
            int length = iArr.length;
            int i15 = length - i14;
            int i16 = length << 1;
            if (i16 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i16];
            C7705l.p(0, i14, iArr, iArr2, length);
            C7705l.p(i15, 0, this.f38697a, iArr2, this.f38698b);
            this.f38697a = iArr2;
            this.f38698b = 0;
            this.f38699c = length;
            this.f38700d = i16 - 1;
        }
    }

    public final void b() {
        this.f38699c = this.f38698b;
    }

    public final boolean c() {
        return this.f38698b == this.f38699c;
    }

    public final int d() {
        int i11 = this.f38698b;
        if (i11 == this.f38699c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f38697a[i11];
        this.f38698b = (i11 + 1) & this.f38700d;
        return i12;
    }
}
