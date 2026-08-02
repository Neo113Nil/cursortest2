package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012"}, d2 = {"E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "persistentVectorOf", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "element", "", "presizedBufferWith", "(Ljava/lang/Object;)[Ljava/lang/Object;", "", "index", "shift", "indexSegment", "(II)I", "vectorSize", "rootSize", "(I)I", "MAX_BUFFER_SIZE", com.visa.cbp.getEncExpo.warmup, "LOG_MAX_BUFFER_SIZE", "MAX_BUFFER_SIZE_MINUS_ONE", "MUTABLE_BUFFER_SIZE"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final int LOG_MAX_BUFFER_SIZE = 5;
    public static final int MAX_BUFFER_SIZE = 32;
    public static final int MAX_BUFFER_SIZE_MINUS_ONE = 31;
    public static final int MUTABLE_BUFFER_SIZE = 33;

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final int rootSize(int i) {
        return (i - 1) & (-32);
    }

    public static final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> persistentVectorOf() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.INSTANCE.getEMPTY();
    }

    public static final java.lang.Object[] presizedBufferWith(java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[32];
        objArr[0] = obj;
        return objArr;
    }
}
