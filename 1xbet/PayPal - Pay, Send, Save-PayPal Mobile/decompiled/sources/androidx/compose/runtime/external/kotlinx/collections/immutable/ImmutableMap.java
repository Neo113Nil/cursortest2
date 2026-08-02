package androidx.compose.runtime.external.kotlinx.collections.immutable;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "getKeys", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "values", "", "getEntries", "entries"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ImmutableMap<K, V> extends java.util.Map<K, V>, kotlin.jvm.internal.markers.KMappedMarker {
    androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<K, V>> getEntries();

    androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<K> getKeys();

    androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection<V> getValues();
}
