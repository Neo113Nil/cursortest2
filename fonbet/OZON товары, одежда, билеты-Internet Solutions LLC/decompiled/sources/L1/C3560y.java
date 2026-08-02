package L1;

import org.jetbrains.annotations.NotNull;

/* renamed from: L1.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3560y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W f16197a;

    /* renamed from: b, reason: collision with root package name */
    private int f16198b = -1;

    /* renamed from: c, reason: collision with root package name */
    private float f16199c;

    public C3560y(@NotNull W w11) {
        this.f16197a = w11;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float a(boolean z11, boolean z12, int i11, boolean z13) {
        boolean z14;
        int i12;
        int i13 = 1;
        W w11 = this.f16197a;
        if (z11) {
            int a11 = A.a(w11.h(), i11, z11);
            int t2 = w11.t(a11);
            int o11 = w11.o(a11);
            if (i11 == t2 || i11 == o11) {
                z14 = true;
                int i14 = i11 * 4;
                if (z13) {
                    i13 = z14 ? 2 : 3;
                } else if (z14) {
                    i13 = 0;
                }
                i12 = i14 + i13;
                if (this.f16198b != i12) {
                    return this.f16199c;
                }
                float y11 = z13 ? w11.y(i11, z11) : w11.A(i11, z11);
                if (z12) {
                    this.f16198b = i12;
                    this.f16199c = y11;
                }
                return y11;
            }
        }
        z14 = false;
        int i142 = i11 * 4;
        if (z13) {
        }
        i12 = i142 + i13;
        if (this.f16198b != i12) {
        }
    }

    public final float b(int i11) {
        return a(false, false, i11, true);
    }

    public final float c(int i11) {
        return a(true, true, i11, true);
    }

    public final float d(int i11) {
        return a(false, false, i11, false);
    }

    public final float e(int i11) {
        return a(true, true, i11, false);
    }
}
