package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0007\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/collections/FloatIterator;", "", "", "<init>", "()V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Float;", "nextFloat", "()F"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class FloatIterator implements java.util.Iterator<java.lang.Float>, kotlin.jvm.internal.markers.KMappedMarker {
    public abstract float nextFloat();

    @Override // java.util.Iterator
    public /* synthetic */ java.lang.Float next() {
        return java.lang.Float.valueOf(nextFloat());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final java.lang.Float next() {
        return java.lang.Float.valueOf(nextFloat());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
