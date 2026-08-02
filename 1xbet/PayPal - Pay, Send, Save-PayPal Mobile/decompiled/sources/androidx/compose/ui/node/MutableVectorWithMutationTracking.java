package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0086\n¢\u0006\u0004\b\u001a\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0012\u0010#\u001a\u00020\f8Ç\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "T", "", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "Lkotlin/Function0;", "", "onVectorMutated", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;Lkotlin/jvm/functions/Function0;)V", "clear", "()V", "", "index", "element", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(ILjava/lang/Object;)V", "removeAt", "(I)Ljava/lang/Object;", "Lkotlin/Function1;", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "", "asList", "()Ljava/util/List;", "get", "Landroidx/compose/runtime/collection/MutableVector;", "getVector", "()Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/jvm/functions/Function0;", "getOnVectorMutated", "()Lkotlin/jvm/functions/Function0;", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = androidx.compose.runtime.collection.MutableVector.$stable;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onVectorMutated;
    private final androidx.compose.runtime.collection.MutableVector<T> vector;

    public MutableVectorWithMutationTracking(androidx.compose.runtime.collection.MutableVector<T> mutableVector, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.vector = mutableVector;
        this.onVectorMutated = function0;
    }

    public final androidx.compose.runtime.collection.MutableVector<T> getVector() {
        return this.vector;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return getVector().getSize();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void add(int index, T element) {
        this.vector.add(index, element);
        this.onVectorMutated.invoke();
    }

    public final T removeAt(int index) {
        T removeAt = this.vector.removeAt(index);
        this.onVectorMutated.invoke();
        return removeAt;
    }

    public final void forEach(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        androidx.compose.runtime.collection.MutableVector<T> vector = getVector();
        T[] tArr = vector.content;
        int size = vector.getSize();
        for (int i = 0; i < size; i++) {
            block.invoke(tArr[i]);
        }
    }

    public final java.util.List<T> asList() {
        return getVector().asMutableList();
    }

    public final T get(int index) {
        return getVector().content[index];
    }
}
