package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "<init>", "()V", "", "allFactories", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "createDispatcher", "(Ljava/util/List;)Lkotlinx/coroutines/MainCoroutineDispatcher;", "", "getLoadPriority", "()I", "loadPriority"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MissingMainCoroutineDispatcherFactory implements kotlinx.coroutines.internal.MainDispatcherFactory {
    public static final kotlinx.coroutines.internal.MissingMainCoroutineDispatcherFactory INSTANCE = new kotlinx.coroutines.internal.MissingMainCoroutineDispatcherFactory();

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final int getLoadPriority() {
        return -1;
    }

    private MissingMainCoroutineDispatcherFactory() {
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final java.lang.String hintOnError() {
        return kotlinx.coroutines.internal.MainDispatcherFactory.DefaultImpls.hintOnError(this);
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final kotlinx.coroutines.MainCoroutineDispatcher createDispatcher(java.util.List<? extends kotlinx.coroutines.internal.MainDispatcherFactory> allFactories) {
        return new kotlinx.coroutines.internal.MissingMainCoroutineDispatcher(null, null, 2, null);
    }
}
