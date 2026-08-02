package B0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class g2 implements Q1.D {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Q1.D f1738a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1739b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1740c;

    public g2(@NotNull Q1.D d11, int i11, int i12) {
        this.f1738a = d11;
        this.f1739b = i11;
        this.f1740c = i12;
    }

    @Override // Q1.D
    public final int originalToTransformed(int i11) {
        int originalToTransformed = this.f1738a.originalToTransformed(i11);
        if (i11 >= 0 && i11 <= this.f1739b) {
            h2.e(originalToTransformed, this.f1740c, i11);
        }
        return originalToTransformed;
    }

    @Override // Q1.D
    public final int transformedToOriginal(int i11) {
        int transformedToOriginal = this.f1738a.transformedToOriginal(i11);
        if (i11 >= 0 && i11 <= this.f1740c) {
            h2.f(transformedToOriginal, this.f1739b, i11);
        }
        return transformedToOriginal;
    }
}
