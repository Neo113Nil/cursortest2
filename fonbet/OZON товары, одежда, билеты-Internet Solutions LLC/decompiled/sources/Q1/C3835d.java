package Q1;

import Sc.InterfaceC3999a;
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* renamed from: Q1.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3835d {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0106, code lost:
    
        if (b(r19, r4.o(), r4.h()) == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC3999a
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CursorAnchorInfo a(@NotNull CursorAnchorInfo.Builder builder, @NotNull K k11, @NotNull D d11, @NotNull K1.K k12, @NotNull Matrix matrix, @NotNull C7460f c7460f, @NotNull C7460f c7460f2, boolean z11, boolean z12, boolean z13, boolean z14) {
        int i11;
        builder.reset();
        builder.setMatrix(matrix);
        int h11 = K1.Q.h(k11.e());
        builder.setSelectionRange(h11, K1.Q.g(k11.e()));
        if (z11 && h11 >= 0) {
            int originalToTransformed = d11.originalToTransformed(h11);
            C7460f e11 = k12.e(originalToTransformed);
            float d12 = kotlin.ranges.h.d(e11.n(), 0.0f, (int) (k12.A() >> 32));
            boolean b11 = b(c7460f, d12, e11.q());
            boolean b12 = b(c7460f, d12, e11.h());
            int i12 = 1;
            boolean z15 = k12.c(originalToTransformed) == V1.g.Rtl;
            if (!b11 && !b12) {
                i12 = 0;
            }
            if (!b11 || !b12) {
                i12 |= 2;
            }
            if (z15) {
                i12 |= 4;
            }
            builder.setInsertionMarkerLocation(d12, e11.q(), e11.h(), e11.h(), i12);
        }
        if (z12) {
            K1.Q d13 = k11.d();
            int h12 = d13 != null ? K1.Q.h(d13.k()) : -1;
            K1.Q d14 = k11.d();
            int g10 = d14 != null ? K1.Q.g(d14.k()) : -1;
            if (h12 >= 0 && h12 < g10) {
                builder.setComposingText(h12, k11.f().subSequence(h12, g10));
                int originalToTransformed2 = d11.originalToTransformed(h12);
                int originalToTransformed3 = d11.originalToTransformed(g10);
                float[] fArr = new float[(originalToTransformed3 - originalToTransformed2) * 4];
                k12.v().a(K1.S.a(originalToTransformed2, originalToTransformed3), fArr);
                while (h12 < g10) {
                    int originalToTransformed4 = d11.originalToTransformed(h12);
                    int i13 = (originalToTransformed4 - originalToTransformed2) * 4;
                    C7460f c7460f3 = new C7460f(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], fArr[i13 + 3]);
                    boolean y11 = c7460f.y(c7460f3);
                    if (b(c7460f, c7460f3.n(), c7460f3.q())) {
                        i11 = y11;
                    }
                    i11 = (y11 ? 1 : 0) | 2;
                    if (k12.c(originalToTransformed4) == V1.g.Rtl) {
                        i11 = (i11 == true ? 1 : 0) | 4;
                    }
                    builder.addCharacterBounds(h12, c7460f3.n(), c7460f3.q(), c7460f3.o(), c7460f3.h(), i11);
                    h12++;
                }
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33 && z13) {
            C3833b.a(builder, c7460f2);
        }
        if (i14 >= 34 && z14) {
            C3834c.a(builder, k12, c7460f);
        }
        return builder.build();
    }

    private static final boolean b(C7460f c7460f, float f7, float f11) {
        float n11 = c7460f.n();
        if (f7 > c7460f.o() || n11 > f7) {
            return false;
        }
        return f11 <= c7460f.h() && c7460f.q() <= f11;
    }
}
