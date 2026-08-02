package Q0;

import P0.EnumC3790y1;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f22754a = new LinkedHashMap();

    public final void a(EnumC3790y1 enumC3790y1, float f7) {
        this.f22754a.put(enumC3790y1, Float.valueOf(f7));
    }

    @NotNull
    public final LinkedHashMap b() {
        return this.f22754a;
    }
}
