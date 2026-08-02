package coil3.compose.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcoil3/compose/internal/AsyncImageState;", "", "model", "Lcoil3/compose/AsyncImageModelEqualityDelegate;", "modelEqualityDelegate", "Lcoil3/ImageLoader;", "imageLoader", "<init>", "(Ljava/lang/Object;Lcoil3/compose/AsyncImageModelEqualityDelegate;Lcoil3/ImageLoader;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "getModel", "()Ljava/lang/Object;", "Lcoil3/compose/AsyncImageModelEqualityDelegate;", "getModelEqualityDelegate", "()Lcoil3/compose/AsyncImageModelEqualityDelegate;", "Lcoil3/ImageLoader;", "getImageLoader", "()Lcoil3/ImageLoader;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AsyncImageState {
    public static final int $stable = 0;
    private final coil3.ImageLoader imageLoader;
    private final java.lang.Object model;
    private final coil3.compose.AsyncImageModelEqualityDelegate modelEqualityDelegate;

    public AsyncImageState(java.lang.Object obj, coil3.compose.AsyncImageModelEqualityDelegate asyncImageModelEqualityDelegate, coil3.ImageLoader imageLoader) {
        this.model = obj;
        this.modelEqualityDelegate = asyncImageModelEqualityDelegate;
        this.imageLoader = imageLoader;
    }

    public final java.lang.Object getModel() {
        return this.model;
    }

    public final coil3.compose.AsyncImageModelEqualityDelegate getModelEqualityDelegate() {
        return this.modelEqualityDelegate;
    }

    public final coil3.ImageLoader getImageLoader() {
        return this.imageLoader;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.compose.internal.AsyncImageState)) {
            return false;
        }
        coil3.compose.internal.AsyncImageState asyncImageState = (coil3.compose.internal.AsyncImageState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.modelEqualityDelegate, asyncImageState.modelEqualityDelegate) && this.modelEqualityDelegate.equals(this.model, asyncImageState.model) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageLoader, asyncImageState.imageLoader);
    }

    public final int hashCode() {
        return (((this.modelEqualityDelegate.hashCode() * 31) + this.modelEqualityDelegate.hashCode(this.model)) * 31) + this.imageLoader.hashCode();
    }
}
