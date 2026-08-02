package B0;

import Am.C2438a;
import K1.C3422b;
import Q1.D;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Q1.D f1786a = new g2(D.a.a(), 0, 0);

    @NotNull
    public static final Q1.W c(@NotNull Q1.X x11, @NotNull C3422b c3422b) {
        Q1.W filter = x11.filter(c3422b);
        int length = c3422b.length();
        int length2 = filter.b().length();
        int min = Math.min(length, 100);
        for (int i11 = 0; i11 < min; i11++) {
            e(filter.a().originalToTransformed(i11), length2, i11);
        }
        e(filter.a().originalToTransformed(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i12 = 0; i12 < min2; i12++) {
            f(filter.a().transformedToOriginal(i12), length, i12);
        }
        f(filter.a().transformedToOriginal(length2), length, length2);
        return new Q1.W(filter.b(), new g2(filter.a(), c3422b.length(), filter.b().length()));
    }

    @NotNull
    public static final Q1.D d() {
        return f1786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(int i11, int i12, int i13) {
        if (i11 < 0 || i11 > i12) {
            throw new IllegalStateException(Ek.a.d(C2438a.a("OffsetMapping.originalToTransformed returned invalid mapping: ", i13, " -> ", " is not in range of transformed text [0, ", i11), i12, ']').toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(int i11, int i12, int i13) {
        if (i11 < 0 || i11 > i12) {
            throw new IllegalStateException(Ek.a.d(C2438a.a("OffsetMapping.transformedToOriginal returned invalid mapping: ", i13, " -> ", " is not in range of original text [0, ", i11), i12, ']').toString());
        }
    }
}
