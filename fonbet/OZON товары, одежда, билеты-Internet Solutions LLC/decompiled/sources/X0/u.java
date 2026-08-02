package X0;

import gd.InterfaceC6712a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class u<K, V, T> implements Iterator<T>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Object[] f33944a;

    /* renamed from: b, reason: collision with root package name */
    private int f33945b;

    /* renamed from: c, reason: collision with root package name */
    private int f33946c;

    public u() {
        t tVar;
        tVar = t.f33937e;
        this.f33944a = tVar.j();
    }

    public final K b() {
        return (K) this.f33944a[this.f33946c];
    }

    @NotNull
    public final t<? extends K, ? extends V> c() {
        k();
        Object obj = this.f33944a[this.f33946c];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    @NotNull
    protected final Object[] e() {
        return this.f33944a;
    }

    protected final int h() {
        return this.f33946c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return i();
    }

    public final boolean i() {
        return this.f33946c < this.f33945b;
    }

    public final boolean k() {
        return this.f33946c < this.f33944a.length;
    }

    public final void l() {
        this.f33946c += 2;
    }

    public final void m() {
        k();
        this.f33946c++;
    }

    public final void n(int i11, int i12, @NotNull Object[] objArr) {
        this.f33944a = objArr;
        this.f33945b = i11;
        this.f33946c = i12;
    }

    protected final void o(int i11) {
        this.f33946c = i11;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
