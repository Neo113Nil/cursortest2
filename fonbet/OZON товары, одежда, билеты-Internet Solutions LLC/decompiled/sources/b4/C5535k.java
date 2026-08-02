package b4;

import java.util.Arrays;

/* renamed from: b4.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5535k extends AbstractC5532h {

    /* renamed from: b, reason: collision with root package name */
    public final int f55517b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55518c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55519d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f55520e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f55521f;

    public C5535k(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        super("MLLT");
        this.f55517b = i11;
        this.f55518c = i12;
        this.f55519d = i13;
        this.f55520e = iArr;
        this.f55521f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5535k.class == obj.getClass()) {
            C5535k c5535k = (C5535k) obj;
            if (this.f55517b == c5535k.f55517b && this.f55518c == c5535k.f55518c && this.f55519d == c5535k.f55519d && Arrays.equals(this.f55520e, c5535k.f55520e) && Arrays.equals(this.f55521f, c5535k.f55521f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f55521f) + ((Arrays.hashCode(this.f55520e) + ((((((527 + this.f55517b) * 31) + this.f55518c) * 31) + this.f55519d) * 31)) * 31);
    }
}
