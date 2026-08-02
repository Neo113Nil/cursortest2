package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aK\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0007\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000e\"\u0004\b\u0000\u0010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"", io.ktor.http.ContentDisposition.Parameters.Size, "step", "", "checkWindowSizeStep", "(II)V", "T", "Lkotlin/sequences/Sequence;", "", "partialWindows", "reuseBuffer", "", "windowedSequence", "(Lkotlin/sequences/Sequence;IIZZ)Lkotlin/sequences/Sequence;", "", "iterator", "windowedIterator", "(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SlidingWindowKt {
    public static final void checkWindowSizeStep(int i, int i2) {
        java.lang.String obj;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Both size ");
                sb.append(i);
                sb.append(" and step ");
                sb.append(i2);
                sb.append(" must be greater than zero.");
                obj = sb.toString();
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("size ");
                sb2.append(i);
                sb2.append(" must be greater than zero.");
                obj = sb2.toString();
            }
            throw new java.lang.IllegalArgumentException(obj.toString());
        }
    }

    public static final <T> kotlin.sequences.Sequence<java.util.List<T>> windowedSequence(final kotlin.sequences.Sequence<? extends T> sequence, final int i, final int i2, final boolean z, final boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        checkWindowSizeStep(i, i2);
        return new kotlin.sequences.Sequence<java.util.List<? extends T>>() { // from class: kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<java.util.List<? extends T>> iterator() {
                return kotlin.collections.SlidingWindowKt.windowedIterator(kotlin.sequences.Sequence.this.iterator(), i, i2, z, z2);
            }
        };
    }

    public static final <T> java.util.Iterator<java.util.List<T>> windowedIterator(java.util.Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "");
        return !it.hasNext() ? kotlin.collections.EmptyIterator.INSTANCE : kotlin.sequences.SequencesKt.iterator(new kotlin.collections.SlidingWindowKt$windowedIterator$1(i, i2, it, z2, z, null));
    }
}
