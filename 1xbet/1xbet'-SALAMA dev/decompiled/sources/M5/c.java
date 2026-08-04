package M5;

import android.graphics.drawable.ColorDrawable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorDrawable f4600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorDrawable f4601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f4603d;

    public c(ColorDrawable colorDrawable, ColorDrawable colorDrawable2, a aVar, Double d7) {
        this.f4600a = colorDrawable;
        this.f4601b = colorDrawable2;
        this.f4602c = aVar;
        this.f4603d = d7;
    }

    public final Float a() {
        Double d7 = this.f4603d;
        if (d7 == null) {
            return null;
        }
        return Float.valueOf(d7.floatValue());
    }

    public final boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        ColorDrawable colorDrawable2 = this.f4600a;
        if (((colorDrawable2 == null && cVar.f4600a == null) || colorDrawable2.getColor() == cVar.f4600a.getColor()) && (((colorDrawable = this.f4601b) == null && cVar.f4601b == null) || colorDrawable.getColor() == cVar.f4601b.getColor())) {
            if (Objects.equals(this.f4603d, cVar.f4603d) && Objects.equals(this.f4602c, cVar.f4602c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ColorDrawable colorDrawable = this.f4600a;
        Integer numValueOf = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        ColorDrawable colorDrawable2 = this.f4601b;
        return Objects.hash(numValueOf, colorDrawable2 != null ? Integer.valueOf(colorDrawable2.getColor()) : null, this.f4603d, this.f4602c);
    }
}
