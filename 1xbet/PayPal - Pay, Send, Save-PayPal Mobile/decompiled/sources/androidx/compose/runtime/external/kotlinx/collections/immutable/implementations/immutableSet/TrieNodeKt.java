package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"", "index", "shift", "indexSegment", "(II)I", "MAX_BRANCHING_FACTOR", com.visa.cbp.getEncExpo.warmup, "LOG_MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final /* synthetic */ java.lang.Object[] access$addElementAtIndex(java.lang.Object[] objArr, int i, java.lang.Object obj) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length + 1];
        kotlin.collections.ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (java.lang.Object) null);
        kotlin.collections.ArraysKt.copyInto(objArr, objArr2, i + 1, i, objArr.length);
        objArr2[i] = obj;
        return objArr2;
    }

    public static final /* synthetic */ java.lang.Object[] access$removeCellAtIndex(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        kotlin.collections.ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (java.lang.Object) null);
        kotlin.collections.ArraysKt.copyInto(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
