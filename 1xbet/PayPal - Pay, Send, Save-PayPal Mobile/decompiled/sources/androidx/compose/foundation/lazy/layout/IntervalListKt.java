package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "", "p0", "getHighSpeedVideoSizes", "(Landroidx/compose/runtime/collection/MutableVector;I)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntervalListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int getHighSpeedVideoSizes(androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.IntervalList.Interval<T>> mutableVector, int i) {
        int size = mutableVector.getSize() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = ((size - i2) / 2) + i2;
            int startIndex = mutableVector.content[i3].getStartIndex();
            if (startIndex != i) {
                if (startIndex < i) {
                    i2 = i3 + 1;
                    if (i < mutableVector.content[i2].getStartIndex()) {
                    }
                } else {
                    size = i3 - 1;
                }
            }
            return i3;
        }
        return i2;
    }
}
