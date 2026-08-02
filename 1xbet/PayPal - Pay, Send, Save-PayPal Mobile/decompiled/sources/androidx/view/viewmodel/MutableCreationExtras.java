package androidx.view.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\bJ,\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "initialExtras", "<init>", "(Ljava/util/Map;)V", "(Landroidx/lifecycle/viewmodel/CreationExtras;)V", "T", "key", "t", "", "set", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;Ljava/lang/Object;)V", "get", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableCreationExtras extends androidx.view.viewmodel.CreationExtras {
    public MutableCreationExtras(java.util.Map<androidx.lifecycle.viewmodel.CreationExtras.Key<?>, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        getExtras$lifecycle_viewmodel().putAll(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MutableCreationExtras(androidx.view.viewmodel.CreationExtras creationExtras) {
        this((java.util.Map<androidx.lifecycle.viewmodel.CreationExtras.Key<?>, ? extends java.lang.Object>) creationExtras.getExtras$lifecycle_viewmodel());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
    }

    public /* synthetic */ MutableCreationExtras(androidx.lifecycle.viewmodel.CreationExtras.Empty empty, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE : empty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(androidx.lifecycle.viewmodel.CreationExtras.Key<T> key, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        getExtras$lifecycle_viewmodel().put(key, t);
    }

    @Override // androidx.view.viewmodel.CreationExtras
    public final <T> T get(androidx.lifecycle.viewmodel.CreationExtras.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return (T) getExtras$lifecycle_viewmodel().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutableCreationExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
