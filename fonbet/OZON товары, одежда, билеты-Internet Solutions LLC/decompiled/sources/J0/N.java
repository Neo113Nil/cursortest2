package J0;

import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class N<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f12900a = new LinkedHashMap();

    public final void a(T t2, float f7) {
        this.f12900a.put(t2, Float.valueOf(f7));
    }

    @NotNull
    public final LinkedHashMap b() {
        return this.f12900a;
    }
}
