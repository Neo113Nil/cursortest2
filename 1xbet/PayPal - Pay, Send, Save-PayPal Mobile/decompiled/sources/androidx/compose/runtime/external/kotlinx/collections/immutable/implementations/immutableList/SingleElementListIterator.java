package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\r\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SingleElementListIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "element", "", "index", "<init>", "(Ljava/lang/Object;I)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "previous", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingleElementListIterator<E> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator<E> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final E getHighSpeedVideoSizes;

    public SingleElementListIterator(E e, int i) {
        super(i, 1);
        this.getHighSpeedVideoSizes = e;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final E next() {
        checkHasNext$runtime();
        setIndex(getIndex() + 1);
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        checkHasPrevious$runtime();
        setIndex(getIndex() - 1);
        return this.getHighSpeedVideoSizes;
    }
}
