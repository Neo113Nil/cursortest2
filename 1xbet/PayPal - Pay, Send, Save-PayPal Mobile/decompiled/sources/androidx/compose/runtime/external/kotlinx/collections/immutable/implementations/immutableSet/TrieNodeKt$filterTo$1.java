package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrieNodeKt$filterTo$1 implements kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> {
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt$filterTo$1 INSTANCE = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt$filterTo$1();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Boolean invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(obj != androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.INSTANCE.getEMPTY$runtime());
    }
}
