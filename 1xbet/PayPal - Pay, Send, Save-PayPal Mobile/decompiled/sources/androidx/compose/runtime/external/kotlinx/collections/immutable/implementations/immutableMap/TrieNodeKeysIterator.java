package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeKeysIterator;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "<init>", "()V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrieNodeKeysIterator<K, V> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator<K, V, K> {
    public static final int $stable = 8;

    @Override // java.util.Iterator
    public final K next() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(hasNextKey());
        setIndex(getIndex() + 2);
        return (K) getBuffer()[getIndex() - 2];
    }
}
