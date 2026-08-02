package Q1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface D {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0448a f22814a = new C0448a();

        /* renamed from: Q1.D$a$a, reason: collision with other inner class name */
        public static final class C0448a implements D {
            @Override // Q1.D
            public final int originalToTransformed(int i11) {
                return i11;
            }

            @Override // Q1.D
            public final int transformedToOriginal(int i11) {
                return i11;
            }
        }

        @NotNull
        public static C0448a a() {
            return f22814a;
        }
    }

    int originalToTransformed(int i11);

    int transformedToOriginal(int i11);
}
