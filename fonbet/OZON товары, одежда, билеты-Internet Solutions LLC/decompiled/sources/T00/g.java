package T00;

import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f26465a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f26466b;

    public g(String str, @NotNull ArrayList states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f26465a = str;
        this.f26466b = states;
    }

    public final String a() {
        return this.f26465a;
    }

    @NotNull
    public final List<h> b() {
        return this.f26466b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f26465a, gVar.f26465a) && this.f26466b.equals(gVar.f26466b);
    }

    public final int hashCode() {
        String str = this.f26465a;
        return this.f26466b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaceholderWidgetData(json=");
        sb2.append(this.f26465a);
        sb2.append(", states=");
        return Om.a(")", sb2, this.f26466b);
    }
}
