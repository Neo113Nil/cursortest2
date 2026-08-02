package androidx.compose.runtime.collection;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\t\u001a\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\t\u001a(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0006\b\u0000\u0010\u0012\u0018\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001aG\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0014\b\b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0015\u0010\u001a\u001a\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0006\b\u0000\u0010\u0012\u0018\u0001H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0006\b\u0000\u0010\u0012\u0018\u00012\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001d\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001f"}, d2 = {"", "", "index", "", "checkIndex", "(Ljava/util/List;I)V", "p0", "p1", "Camera2StreamConfigurationMap", "(II)V", "fromIndex", "toIndex", "checkSubIndex", "(Ljava/util/List;II)V", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "(I)V", "getHighSpeedVideoFpsRanges", "T", "capacity", "Landroidx/compose/runtime/collection/MutableVector;", "MutableVector", "(I)Landroidx/compose/runtime/collection/MutableVector;", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlin/Function1;", "init", "(ILkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/collection/MutableVector;", "mutableVectorOf", "()Landroidx/compose/runtime/collection/MutableVector;", "", "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableVectorKt {
    public static final void checkIndex(java.util.List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            Camera2StreamConfigurationMap(i, size);
        }
    }

    private static final void Camera2StreamConfigurationMap(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
        sb.append(i);
        sb.append(" is out of bounds. The list has ");
        sb.append(i2);
        sb.append(" elements.");
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public static final void checkSubIndex(java.util.List<?> list, int i, int i2) {
        if (i > i2) {
            getHighSpeedVideoFpsRanges(i, i2);
        }
        if (i < 0) {
            getHighResolutionOutputSizeshNQ4ISI(i);
        }
        if (i2 > list.size()) {
            getHighSpeedVideoFpsRangesFor(i2, list.size());
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("toIndex (");
        sb.append(i);
        sb.append(") is more than than the list size (");
        sb.append(i2);
        sb.append(')');
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("fromIndex (");
        sb.append(i);
        sb.append(") is less than 0.");
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    private static final void getHighSpeedVideoFpsRanges(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Indices are out of order. fromIndex (");
        sb.append(i);
        sb.append(") is greater than toIndex (");
        sb.append(i2);
        sb.append(").");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final /* synthetic */ <T> androidx.compose.runtime.collection.MutableVector<T> MutableVector(int i) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T?");
        return new androidx.compose.runtime.collection.MutableVector<>(new java.lang.Object[i], 0);
    }

    public static /* synthetic */ androidx.compose.runtime.collection.MutableVector MutableVector$default(int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 16;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T?");
        return new androidx.compose.runtime.collection.MutableVector(new java.lang.Object[i], 0);
    }

    public static final /* synthetic */ <T> androidx.compose.runtime.collection.MutableVector<T> MutableVector(int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T");
        java.lang.Object[] objArr = new java.lang.Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = function1.invoke(java.lang.Integer.valueOf(i2));
        }
        return new androidx.compose.runtime.collection.MutableVector<>(objArr, i);
    }

    public static final /* synthetic */ <T> androidx.compose.runtime.collection.MutableVector<T> mutableVectorOf(T... tArr) {
        return new androidx.compose.runtime.collection.MutableVector<>(tArr, tArr.length);
    }

    public static final /* synthetic */ <T> androidx.compose.runtime.collection.MutableVector<T> mutableVectorOf() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T?");
        return new androidx.compose.runtime.collection.MutableVector<>(new java.lang.Object[16], 0);
    }
}
