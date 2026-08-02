package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aN\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "Lkotlinx/io/Buffer;", "", "fromIndex", "Lkotlin/Function2;", "Lkotlinx/io/Segment;", "lambda", "seek", "(Lkotlinx/io/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BufferKt {
    public static final /* synthetic */ <T> T seek(kotlinx.io.Buffer buffer, long j, kotlin.jvm.functions.Function2<? super kotlinx.io.Segment, ? super java.lang.Long, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if (buffer.getHead() == null) {
            return function2.invoke(null, -1L);
        }
        if (buffer.getSizeMut() - j < j) {
            kotlinx.io.Segment tail = buffer.getTail();
            long sizeMut = buffer.getSizeMut();
            while (tail != null && sizeMut > j) {
                sizeMut -= tail.getLimit() - tail.getPos();
                if (sizeMut <= j) {
                    break;
                }
                tail = tail.getPrev();
            }
            return function2.invoke(tail, java.lang.Long.valueOf(sizeMut));
        }
        kotlinx.io.Segment head = buffer.getHead();
        long j2 = 0;
        while (head != null) {
            long limit = (head.getLimit() - head.getPos()) + j2;
            if (limit > j) {
                break;
            }
            head = head.getNext();
            j2 = limit;
        }
        return function2.invoke(head, java.lang.Long.valueOf(j2));
    }
}
