package a2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements InterfaceC4921a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final float[] f36214a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final float[] f36215b;

    public static final class a {
        public static final float a(float f7, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float abs = Math.abs(f7);
            float signum = Math.signum(f7);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                return signum * fArr2[binarySearch];
            }
            int i11 = -(binarySearch + 1);
            int i12 = i11 - 1;
            float f14 = 0.0f;
            if (i12 >= fArr.length - 1) {
                float f15 = fArr[fArr.length - 1];
                float f16 = fArr2[fArr.length - 1];
                if (f15 == 0.0f) {
                    return 0.0f;
                }
                return (f16 / f15) * f7;
            }
            if (i12 == -1) {
                f11 = fArr[0];
                f12 = fArr2[0];
                f13 = 0.0f;
            } else {
                float f17 = fArr[i12];
                f11 = fArr[i11];
                f14 = fArr2[i12];
                f12 = fArr2[i11];
                f13 = f17;
            }
            return d.a(f14, f12, f13, f11, abs) * signum;
        }
    }

    public c(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f36214a = fArr;
        this.f36215b = fArr2;
    }

    @Override // a2.InterfaceC4921a
    public final float a(float f7) {
        return a.a(f7, this.f36215b, this.f36214a);
    }

    @Override // a2.InterfaceC4921a
    public final float b(float f7) {
        return a.a(f7, this.f36214a, this.f36215b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f36214a, cVar.f36214a) && Arrays.equals(this.f36215b, cVar.f36215b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36215b) + (Arrays.hashCode(this.f36214a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f36214a);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f36215b);
        Intrinsics.checkNotNullExpressionValue(arrays2, "toString(this)");
        sb2.append(arrays2);
        sb2.append('}');
        return sb2.toString();
    }
}
