package c1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.E, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC5701E<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w<K, V> f56184a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Iterator<Map.Entry<K, V>> f56185b;

    /* renamed from: c, reason: collision with root package name */
    private int f56186c;

    /* renamed from: d, reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f56187d;

    /* renamed from: e, reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f56188e;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC5701E(@NotNull w<K, V> wVar, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.f56184a = wVar;
        this.f56185b = it;
        this.f56186c = wVar.c().h();
        c();
    }

    protected final void c() {
        this.f56187d = this.f56188e;
        Iterator<Map.Entry<K, V>> it = this.f56185b;
        this.f56188e = it.hasNext() ? it.next() : null;
    }

    protected final Map.Entry<K, V> e() {
        return this.f56187d;
    }

    @NotNull
    public final w<K, V> h() {
        return this.f56184a;
    }

    public final boolean hasNext() {
        return this.f56188e != null;
    }

    protected final Map.Entry<K, V> i() {
        return this.f56188e;
    }

    public final void remove() {
        w<K, V> wVar = this.f56184a;
        if (wVar.c().h() != this.f56186c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.f56187d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        wVar.remove(entry.getKey());
        this.f56187d = null;
        Unit unit = Unit.f71690a;
        this.f56186c = wVar.c().h();
    }
}
