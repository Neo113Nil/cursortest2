package X0;

import gd.InterfaceC6715d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class c<K, V> extends b<K, V> implements InterfaceC6715d.a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final i<K, V> f33912c;

    /* renamed from: d, reason: collision with root package name */
    private V f33913d;

    public c(@NotNull i<K, V> iVar, K k11, V v11) {
        super(k11, v11);
        this.f33912c = iVar;
        this.f33913d = v11;
    }

    @Override // X0.b, java.util.Map.Entry
    public final V getValue() {
        return this.f33913d;
    }

    @Override // X0.b, java.util.Map.Entry
    public final V setValue(V v11) {
        V v12 = this.f33913d;
        this.f33913d = v11;
        this.f33912c.b(getKey(), v11);
        return v12;
    }
}
