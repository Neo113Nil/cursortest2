package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", "", "index", "key", "", "Item", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "getContentType", "(I)Ljava/lang/Object;", "getKey", "getIndex", "(Ljava/lang/Object;)I", "getItemCount", "()I", "itemCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyLayoutItemProvider {
    void Item(int i, java.lang.Object obj, androidx.compose.runtime.Composer composer, int i2);

    default java.lang.Object getContentType(int index) {
        return null;
    }

    default int getIndex(java.lang.Object key) {
        return -1;
    }

    int getItemCount();

    default java.lang.Object getKey(int index) {
        return androidx.compose.foundation.lazy.layout.Lazy_androidKt.getDefaultLazyLayoutKey(index);
    }
}
