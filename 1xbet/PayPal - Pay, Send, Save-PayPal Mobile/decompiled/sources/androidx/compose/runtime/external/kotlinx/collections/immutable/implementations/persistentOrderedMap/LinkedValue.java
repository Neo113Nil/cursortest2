package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\fR\u0017\u0010\u0003\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "previous", io.ktor.http.LinkHeader.Rel.Next, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "withValue", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "newPrevious", "withPrevious", "newNext", "withNext", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "getPrevious", "getNext", "", "getHasNext", "()Z", "hasNext", "getHasPrevious", "hasPrevious"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkedValue<V> {
    public static final int $stable = 8;
    private final java.lang.Object next;
    private final java.lang.Object previous;
    private final V value;

    public LinkedValue(V v, java.lang.Object obj, java.lang.Object obj2) {
        this.value = v;
        this.previous = obj;
        this.next = obj2;
    }

    public final java.lang.Object getNext() {
        return this.next;
    }

    public final java.lang.Object getPrevious() {
        return this.previous;
    }

    public final V getValue() {
        return this.value;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkedValue(V v) {
        this(v, r0, r0);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain endOfChain = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
    }

    public LinkedValue(V v, java.lang.Object obj) {
        this(v, obj, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE);
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> withValue(V newValue) {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<>(newValue, this.previous, this.next);
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> withPrevious(java.lang.Object newPrevious) {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<>(this.value, newPrevious, this.next);
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> withNext(java.lang.Object newNext) {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<>(this.value, this.previous, newNext);
    }

    public final boolean getHasNext() {
        return this.next != androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.previous != androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
    }
}
