package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\" \u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b"}, d2 = {"", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/Delay;", "DefaultDelay", "Lkotlinx/coroutines/Delay;", "getDefaultDelay", "()Lkotlinx/coroutines/Delay;", "getDefaultDelay$annotations", "()V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultExecutorKt {
    private static final kotlinx.coroutines.Delay DefaultDelay;
    private static final boolean getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void getDefaultDelay$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1 != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlinx.coroutines.DefaultExecutor defaultExecutor;
        boolean systemProp = kotlinx.coroutines.internal.SystemPropsKt.systemProp("kotlinx.coroutines.main.delay", false);
        getHighResolutionOutputSizeshNQ4ISI = systemProp;
        if (systemProp) {
            kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
            if (!kotlinx.coroutines.internal.MainDispatchersKt.isMissing(main)) {
                boolean z = main instanceof kotlinx.coroutines.Delay;
                defaultExecutor = main;
            }
        }
        defaultExecutor = kotlinx.coroutines.DefaultExecutor.INSTANCE;
        DefaultDelay = defaultExecutor;
    }

    public static final kotlinx.coroutines.Delay getDefaultDelay() {
        return DefaultDelay;
    }
}
