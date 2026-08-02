package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000b\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f"}, d2 = {"", "index", "shift", "indexSegment", "(II)I", "K", "V", "", "", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "MAX_BRANCHING_FACTOR", com.visa.cbp.getEncExpo.warmup, "LOG_MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "ENTRY_SIZE", "MAX_SHIFT"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrieNodeKt {
    public static final int ENTRY_SIZE = 2;
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI(java.lang.Object[] objArr, int i, K k, V v) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length + 2];
        kotlin.collections.ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (java.lang.Object) null);
        kotlin.collections.ArraysKt.copyInto(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    public static final /* synthetic */ java.lang.Object[] access$removeEntryAtIndex(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 2];
        kotlin.collections.ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (java.lang.Object) null);
        kotlin.collections.ArraysKt.copyInto(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final /* synthetic */ java.lang.Object[] access$removeNodeAtIndex(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        kotlin.collections.ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (java.lang.Object) null);
        kotlin.collections.ArraysKt.copyInto(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final /* synthetic */ java.lang.Object[] access$replaceEntryWithNode(java.lang.Object[] objArr, int i, int i2, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode trieNode) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        kotlin.collections.ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (java.lang.Object) null);
        kotlin.collections.ArraysKt.copyInto(objArr, objArr2, i, i + 2, i2);
        objArr2[i2 - 2] = trieNode;
        kotlin.collections.ArraysKt.copyInto(objArr, objArr2, i2 - 1, i2, objArr.length);
        return objArr2;
    }

    public static final /* synthetic */ java.lang.Object[] access$replaceNodeWithEntry(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        kotlin.collections.ArraysKt.copyInto(copyOf, copyOf, i + 2, i + 1, objArr.length);
        kotlin.collections.ArraysKt.copyInto(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = obj;
        copyOf[i2 + 1] = obj2;
        return copyOf;
    }
}
