package kotlinx.coroutines;

/* compiled from: Executors.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \r2\u00020\u00012\u00020\u00022\u00060\u0003j\u0002`\u0004:\u0001\rB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "close", "", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ExecutorCoroutineDispatcher extends kotlinx.coroutines.CoroutineDispatcher implements java.io.Closeable, java.lang.AutoCloseable {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher.Companion INSTANCE = new kotlinx.coroutines.ExecutorCoroutineDispatcher.Companion(null);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract java.util.concurrent.Executor getExecutor();

    /* compiled from: Executors.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.ExecutorCoroutineDispatcher$Key, reason: from kotlin metadata */
    public static final class Companion extends kotlin.coroutines.AbstractCoroutineContextKey<kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.ExecutorCoroutineDispatcher> {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(kotlinx.coroutines.CoroutineDispatcher.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlinx.coroutines.ExecutorCoroutineDispatcher _init_$lambda$0;
                    _init_$lambda$0 = kotlinx.coroutines.ExecutorCoroutineDispatcher.Companion._init_$lambda$0((kotlin.coroutines.CoroutineContext.Element) obj);
                    return _init_$lambda$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlinx.coroutines.ExecutorCoroutineDispatcher _init_$lambda$0(kotlin.coroutines.CoroutineContext.Element element) {
            if (element instanceof kotlinx.coroutines.ExecutorCoroutineDispatcher) {
                return (kotlinx.coroutines.ExecutorCoroutineDispatcher) element;
            }
            return null;
        }
    }
}
