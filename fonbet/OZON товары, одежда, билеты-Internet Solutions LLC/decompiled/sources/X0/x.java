package X0;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class x<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final i<K, V> f33947d;

    public x(@NotNull i<K, V> iVar) {
        this.f33947d = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        o(h() + 2);
        return new c(this.f33947d, e()[h() - 2], e()[h() - 1]);
    }
}
