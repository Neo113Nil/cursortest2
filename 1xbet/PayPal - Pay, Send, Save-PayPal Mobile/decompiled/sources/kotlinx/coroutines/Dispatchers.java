package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R \u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\b\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0016\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\n"}, d2 = {"Lkotlinx/coroutines/Dispatchers;", "", "<init>", "()V", "", "shutdown", "Lkotlinx/coroutines/CoroutineDispatcher;", "Default", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault$annotations", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "getMain", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "getMain$annotations", "Main", "Unconfined", "getUnconfined", "getUnconfined$annotations", "getIO", "getIO$annotations", "IO"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Dispatchers {
    public static final kotlinx.coroutines.Dispatchers INSTANCE = new kotlinx.coroutines.Dispatchers();
    private static final kotlinx.coroutines.CoroutineDispatcher Default = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE;
    private static final kotlinx.coroutines.CoroutineDispatcher Unconfined = kotlinx.coroutines.Unconfined.INSTANCE;

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getDefault$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getIO$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getMain$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getUnconfined$annotations() {
    }

    private Dispatchers() {
    }

    public static final kotlinx.coroutines.CoroutineDispatcher getDefault() {
        return Default;
    }

    public static final kotlinx.coroutines.MainCoroutineDispatcher getMain() {
        return kotlinx.coroutines.internal.MainDispatcherLoader.dispatcher;
    }

    public static final kotlinx.coroutines.CoroutineDispatcher getUnconfined() {
        return Unconfined;
    }

    public static final kotlinx.coroutines.CoroutineDispatcher getIO() {
        return kotlinx.coroutines.scheduling.DefaultIoScheduler.INSTANCE;
    }

    public final void shutdown() {
        kotlinx.coroutines.DefaultExecutor.INSTANCE.shutdown();
        kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE.shutdown$kotlinx_coroutines_core();
    }
}
