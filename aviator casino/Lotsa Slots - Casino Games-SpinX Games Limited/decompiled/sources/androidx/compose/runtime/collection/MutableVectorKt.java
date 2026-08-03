package androidx.compose.runtime.collection;

/* compiled from: MutableVector.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a@\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b\u001a0\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\n\"\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a \u0010\u0010\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¨\u0006\u0013"}, d2 = {"MutableVector", "Landroidx/compose/runtime/collection/MutableVector;", "T", "capacity", "", "size", com.ironsource.X3.a.f, "Lkotlin/Function1;", "mutableVectorOf", "elements", "", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;", "checkIndex", "", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "checkSubIndex", "fromIndex", "toIndex", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableVectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(java.util.List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new java.lang.IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(java.util.List<?> list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new java.lang.IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        }
        if (i2 <= size) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
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
