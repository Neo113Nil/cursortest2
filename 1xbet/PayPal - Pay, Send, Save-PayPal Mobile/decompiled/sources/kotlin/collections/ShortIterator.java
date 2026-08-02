package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\n\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/collections/ShortIterator;", "", "", "<init>", "()V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Short;", "nextShort", "()S"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ShortIterator implements java.util.Iterator<java.lang.Short>, kotlin.jvm.internal.markers.KMappedMarker {
    public abstract short nextShort();

    @Override // java.util.Iterator
    public /* synthetic */ java.lang.Short next() {
        return java.lang.Short.valueOf(nextShort());
    }

    @Override // java.util.Iterator
    /* renamed from: next, reason: avoid collision after fix types in other method */
    public final java.lang.Short next2() {
        return java.lang.Short.valueOf(nextShort());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
