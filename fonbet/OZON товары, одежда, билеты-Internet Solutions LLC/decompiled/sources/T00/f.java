package T00;

import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f<Model> {

    /* renamed from: a, reason: collision with root package name */
    private final List f26463a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f26464b;

    public f(@NotNull ArrayList incidents, List list) {
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        this.f26463a = list;
        this.f26464b = incidents;
    }

    @NotNull
    public final List<R00.f> a() {
        return this.f26464b;
    }

    public final Model b() {
        return (Model) this.f26463a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f26463a, fVar.f26463a) && this.f26464b.equals(fVar.f26464b);
    }

    public final int hashCode() {
        List list = this.f26463a;
        return this.f26464b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParsedModel(rawModel=");
        sb2.append(this.f26463a);
        sb2.append(", incidents=");
        return Om.a(")", sb2, this.f26464b);
    }
}
