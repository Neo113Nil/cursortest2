package X0;

import Q1.j;
import java.util.Arrays;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f6068a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f6069b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f6068a = fArr;
        this.f6069b = fArr2;
    }

    @Override // X0.a
    public final float a(float f) {
        return j.c(f, this.f6069b, this.f6068a);
    }

    @Override // X0.a
    public final float b(float f) {
        return j.c(f, this.f6068a, this.f6069b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f6068a, cVar.f6068a) && Arrays.equals(this.f6069b, cVar.f6069b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6069b) + (Arrays.hashCode(this.f6068a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f6068a);
        l.e("toString(...)", arrays);
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f6069b);
        l.e("toString(...)", arrays2);
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
