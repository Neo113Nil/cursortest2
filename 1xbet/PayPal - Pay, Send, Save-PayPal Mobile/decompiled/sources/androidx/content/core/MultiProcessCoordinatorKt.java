package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/io/File;", "file", "Landroidx/datastore/core/InterProcessCoordinator;", "createMultiProcessCoordinator", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)Landroidx/datastore/core/InterProcessCoordinator;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MultiProcessCoordinatorKt {
    public static final androidx.content.core.InterProcessCoordinator createMultiProcessCoordinator(kotlin.coroutines.CoroutineContext coroutineContext, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return new androidx.content.core.MultiProcessCoordinator(coroutineContext, file);
    }
}
