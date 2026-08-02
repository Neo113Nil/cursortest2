package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "", "previous", io.ktor.http.LinkHeader.Rel.Next, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "newNext", "withNext", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "newPrevious", "withPrevious", "Ljava/lang/Object;", "getPrevious", "()Ljava/lang/Object;", "getNext", "", "getHasNext", "()Z", "hasNext", "getHasPrevious", "hasPrevious"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Links {
    public static final int $stable = 8;
    private final java.lang.Object next;
    private final java.lang.Object previous;

    public Links(java.lang.Object obj, java.lang.Object obj2) {
        this.previous = obj;
        this.next = obj2;
    }

    public final java.lang.Object getNext() {
        return this.next;
    }

    public final java.lang.Object getPrevious() {
        return this.previous;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Links() {
        this(r0, r0);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain endOfChain = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
    }

    public Links(java.lang.Object obj) {
        this(obj, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE);
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links withNext(java.lang.Object newNext) {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links(this.previous, newNext);
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links withPrevious(java.lang.Object newPrevious) {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links(newPrevious, this.next);
    }

    public final boolean getHasNext() {
        return this.next != androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.previous != androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
    }
}
