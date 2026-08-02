package kotlin.collections.builders;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0010\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"E", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "arrayOfUninitializedElements", "(I)[Ljava/lang/Object;", "T", "newSize", "copyOfUninitializedElements", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "index", "", "resetAt", "([Ljava/lang/Object;I)V", "fromIndex", "toIndex", "resetRange", "([Ljava/lang/Object;II)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ListBuilderKt {
    public static final <E> E[] arrayOfUninitializedElements(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("capacity must be non-negative.".toString());
        }
        return (E[]) new java.lang.Object[i];
    }

    public static final <T> T[] copyOfUninitializedElements(T[] tArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        T[] tArr2 = (T[]) java.util.Arrays.copyOf(tArr, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tArr2, "");
        return tArr2;
    }

    public static final <E> void resetAt(E[] eArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eArr, "");
        eArr[i] = null;
    }

    public static final <E> void resetRange(E[] eArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eArr, "");
        while (i < i2) {
            resetAt(eArr, i);
            i++;
        }
    }

    public static final /* synthetic */ boolean access$subarrayContentEquals(java.lang.Object[] objArr, int i, int i2, java.util.List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final /* synthetic */ int access$subarrayContentHashCode(java.lang.Object[] objArr, int i, int i2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            java.lang.Object obj = objArr[i + i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public static final /* synthetic */ java.lang.String access$subarrayContentToString(java.lang.Object[] objArr, int i, int i2, java.util.Collection collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }
}
