package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

/* compiled from: PersistentHashSetIterator.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000b\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000b\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ%\u0010\u0014\u001a\u00020\u00122\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0015R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "()V", "buffer", "", "[Ljava/lang/Object;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "currentElement", "()Ljava/lang/Object;", "currentNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "hasNextCell", "", "hasNextElement", "hasNextNode", "moveToNextCell", "", "nextElement", "reset", "([Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TrieNodeIterator<E> {
    public static final int $stable = 8;
    private java.lang.Object[] buffer = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.INSTANCE.getEMPTY$runtime_release().getBuffer();
    private int index;

    public static /* synthetic */ void reset$default(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator trieNodeIterator, java.lang.Object[] objArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        trieNodeIterator.reset(objArr, i);
    }

    public final void reset(java.lang.Object[] buffer, int index) {
        this.buffer = buffer;
        this.index = index;
    }

    public final boolean hasNextCell() {
        return this.index < this.buffer.length;
    }

    public final void moveToNextCell() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(hasNextCell());
        this.index++;
    }

    public final boolean hasNextElement() {
        return hasNextCell() && !(this.buffer[this.index] instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode);
    }

    public final E currentElement() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(hasNextElement());
        return (E) this.buffer[this.index];
    }

    public final E nextElement() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(hasNextElement());
        java.lang.Object[] objArr = this.buffer;
        int i = this.index;
        this.index = i + 1;
        return (E) objArr[i];
    }

    public final boolean hasNextNode() {
        return hasNextCell() && (this.buffer[this.index] instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode);
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<? extends E> currentNode() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(hasNextNode());
        java.lang.Object obj = this.buffer[this.index];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
    }
}
