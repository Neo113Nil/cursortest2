package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7837o0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static Function1<? super Q1.F, ? extends Q1.F> f40741a = a.f40743b;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f40742b = 0;

    static final class a extends AbstractC7737t implements Function1<Q1.F, Q1.F> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40743b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Q1.F invoke(Q1.F f7) {
            return f7;
        }
    }

    public static final void b(float[] fArr, float f7, float f11, float[] fArr2) {
        C7837o0.e(fArr2);
        C7837o0.i(f7, f11, fArr2);
        e(fArr, fArr2);
    }

    private static final float c(int i11, int i12, float[] fArr, float[] fArr2) {
        int i13 = i11 * 4;
        return (fArr[i13 + 3] * fArr2[12 + i12]) + (fArr[i13 + 2] * fArr2[8 + i12]) + (fArr[i13 + 1] * fArr2[4 + i12]) + (fArr[i13] * fArr2[i12]);
    }

    @NotNull
    public static final Function1<Q1.F, Q1.F> d() {
        return f40741a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(float[] fArr, float[] fArr2) {
        float c11 = c(0, 0, fArr2, fArr);
        float c12 = c(0, 1, fArr2, fArr);
        float c13 = c(0, 2, fArr2, fArr);
        float c14 = c(0, 3, fArr2, fArr);
        float c15 = c(1, 0, fArr2, fArr);
        float c16 = c(1, 1, fArr2, fArr);
        float c17 = c(1, 2, fArr2, fArr);
        float c18 = c(1, 3, fArr2, fArr);
        float c19 = c(2, 0, fArr2, fArr);
        float c21 = c(2, 1, fArr2, fArr);
        float c22 = c(2, 2, fArr2, fArr);
        float c23 = c(2, 3, fArr2, fArr);
        float c24 = c(3, 0, fArr2, fArr);
        float c25 = c(3, 1, fArr2, fArr);
        float c26 = c(3, 2, fArr2, fArr);
        float c27 = c(3, 3, fArr2, fArr);
        fArr[0] = c11;
        fArr[1] = c12;
        fArr[2] = c13;
        fArr[3] = c14;
        fArr[4] = c15;
        fArr[5] = c16;
        fArr[6] = c17;
        fArr[7] = c18;
        fArr[8] = c19;
        fArr[9] = c21;
        fArr[10] = c22;
        fArr[11] = c23;
        fArr[12] = c24;
        fArr[13] = c25;
        fArr[14] = c26;
        fArr[15] = c27;
    }
}
