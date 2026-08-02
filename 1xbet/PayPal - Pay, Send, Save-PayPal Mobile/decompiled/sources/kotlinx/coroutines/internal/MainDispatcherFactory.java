package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "", "allFactories", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "createDispatcher", "(Ljava/util/List;)Lkotlinx/coroutines/MainCoroutineDispatcher;", "", "hintOnError", "()Ljava/lang/String;", "", "getLoadPriority", "()I", "loadPriority"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface MainDispatcherFactory {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.String hintOnError(kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory) {
            return null;
        }
    }

    kotlinx.coroutines.MainCoroutineDispatcher createDispatcher(java.util.List<? extends kotlinx.coroutines.internal.MainDispatcherFactory> allFactories);

    int getLoadPriority();

    java.lang.String hintOnError();
}
