package kotlinx.coroutines;

/* compiled from: Dispatchers.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0007R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0013\u0010\b¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/Dispatchers;", "", "<init>", "()V", androidx.webkit.Profile.DEFAULT_PROFILE_NAME, "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault$annotations", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Main", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "getMain$annotations", "getMain", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "Unconfined", "getUnconfined$annotations", "getUnconfined", "IO", "getIO$annotations", "getIO", "shutdown", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
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
