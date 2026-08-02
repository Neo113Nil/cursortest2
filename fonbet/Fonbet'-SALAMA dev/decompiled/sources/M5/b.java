package M5;

import android.graphics.drawable.ColorDrawable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f4594a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorDrawable f4595b;

    /* renamed from: c, reason: collision with root package name */
    public final c f4596c;

    /* renamed from: d, reason: collision with root package name */
    public final c f4597d;

    /* renamed from: e, reason: collision with root package name */
    public final c f4598e;

    /* renamed from: f, reason: collision with root package name */
    public final c f4599f;

    public b(d dVar, ColorDrawable colorDrawable, c cVar, c cVar2, c cVar3, c cVar4) {
        this.f4594a = dVar;
        this.f4595b = colorDrawable;
        this.f4596c = cVar;
        this.f4597d = cVar2;
        this.f4598e = cVar3;
        this.f4599f = cVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4594a == bVar.f4594a) {
            ColorDrawable colorDrawable = bVar.f4595b;
            ColorDrawable colorDrawable2 = this.f4595b;
            if (((colorDrawable2 == null && colorDrawable == null) || colorDrawable2.getColor() == colorDrawable.getColor()) && Objects.equals(this.f4596c, bVar.f4596c) && Objects.equals(this.f4597d, bVar.f4597d) && Objects.equals(this.f4598e, bVar.f4598e) && Objects.equals(this.f4599f, bVar.f4599f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ColorDrawable colorDrawable = this.f4595b;
        return Objects.hash(colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor()), this.f4596c, this.f4597d, this.f4598e, this.f4599f);
    }
}
