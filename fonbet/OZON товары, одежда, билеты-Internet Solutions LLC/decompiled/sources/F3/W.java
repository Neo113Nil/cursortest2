package F3;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface W {

    public static class a implements W {

        /* renamed from: a, reason: collision with root package name */
        private final Random f8573a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f8574b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f8575c;

        public a() {
            this(new Random());
        }

        @Override // F3.W
        public final int a(int i11) {
            int i12 = this.f8575c[i11] - 1;
            if (i12 >= 0) {
                return this.f8574b[i12];
            }
            return -1;
        }

        @Override // F3.W
        public final int b(int i11) {
            int i12 = this.f8575c[i11] + 1;
            int[] iArr = this.f8574b;
            if (i12 < iArr.length) {
                return iArr[i12];
            }
            return -1;
        }

        @Override // F3.W
        public final int c() {
            int[] iArr = this.f8574b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // F3.W
        public final a d() {
            return new a(new Random(this.f8573a.nextLong()));
        }

        @Override // F3.W
        public final int e() {
            int[] iArr = this.f8574b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // F3.W
        public final a f(int i11) {
            int[] iArr = this.f8574b;
            int[] iArr2 = new int[iArr.length - i11];
            int i12 = 0;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 < 0 || i14 >= i11) {
                    int i15 = i13 - i12;
                    if (i14 >= 0) {
                        i14 -= i11;
                    }
                    iArr2[i15] = i14;
                } else {
                    i12++;
                }
            }
            return new a(iArr2, new Random(this.f8573a.nextLong()));
        }

        @Override // F3.W
        public final a g(int i11) {
            Random random;
            int[] iArr;
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            int i12 = 0;
            while (true) {
                random = this.f8573a;
                iArr = this.f8574b;
                if (i12 >= i11) {
                    break;
                }
                iArr2[i12] = random.nextInt(iArr.length + 1);
                int i13 = i12 + 1;
                int nextInt = random.nextInt(i13);
                iArr3[i12] = iArr3[nextInt];
                iArr3[nextInt] = i12;
                i12 = i13;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i11];
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < iArr.length + i11; i16++) {
                if (i14 >= i11 || i15 != iArr2[i14]) {
                    int i17 = i15 + 1;
                    int i18 = iArr[i15];
                    iArr4[i16] = i18;
                    if (i18 >= 0) {
                        iArr4[i16] = i18 + i11;
                    }
                    i15 = i17;
                } else {
                    iArr4[i16] = iArr3[i14];
                    i14++;
                }
            }
            return new a(iArr4, new Random(random.nextLong()));
        }

        @Override // F3.W
        public final int getLength() {
            return this.f8574b.length;
        }

        private a(int[] iArr, Random random) {
            this.f8574b = iArr;
            this.f8573a = random;
            this.f8575c = new int[iArr.length];
            for (int i11 = 0; i11 < iArr.length; i11++) {
                this.f8575c[iArr[i11]] = i11;
            }
        }

        private a(Random random) {
            this(new int[0], random);
        }
    }

    int a(int i11);

    int b(int i11);

    int c();

    a d();

    int e();

    a f(int i11);

    a g(int i11);

    int getLength();
}
