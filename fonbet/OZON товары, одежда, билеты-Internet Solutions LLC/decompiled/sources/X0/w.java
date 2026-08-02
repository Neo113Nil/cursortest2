package X0;

/* loaded from: classes8.dex */
public final class w<K, V> extends u<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        o(h() + 2);
        return (K) e()[h() - 2];
    }
}
