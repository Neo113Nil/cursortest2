package W;

import B90.C2618u;
import W.C4852x;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: W.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4839j extends C4852x.a {

    /* renamed from: j, reason: collision with root package name */
    private final int f33075j;

    /* renamed from: k, reason: collision with root package name */
    private final String f33076k;

    /* renamed from: l, reason: collision with root package name */
    private final List<Size> f33077l;

    C4839j(int i11, String str, List<Size> list) {
        this.f33075j = i11;
        this.f33076k = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f33077l = list;
    }

    @Override // W.C4852x.a
    @NonNull
    public final String c() {
        return this.f33076k;
    }

    @Override // W.C4852x.a
    @NonNull
    public final List<Size> d() {
        return this.f33077l;
    }

    @Override // W.C4852x.a
    public final int e() {
        return this.f33075j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4852x.a)) {
            return false;
        }
        C4852x.a aVar = (C4852x.a) obj;
        return this.f33075j == aVar.e() && this.f33076k.equals(aVar.c()) && this.f33077l.equals(aVar.d());
    }

    public final int hashCode() {
        return ((((this.f33075j ^ 1000003) * 1000003) ^ this.f33076k.hashCode()) * 1000003) ^ this.f33077l.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConstantQuality{value=");
        sb2.append(this.f33075j);
        sb2.append(", name=");
        sb2.append(this.f33076k);
        sb2.append(", typicalSizes=");
        return C2618u.h(sb2, this.f33077l, "}");
    }
}
