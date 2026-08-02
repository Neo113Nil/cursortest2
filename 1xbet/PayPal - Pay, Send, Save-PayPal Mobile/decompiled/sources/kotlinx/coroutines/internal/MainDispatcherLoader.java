package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "<init>", "()V", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "getHighSpeedVideoSizes", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges", "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MainDispatcherLoader {
    public static final kotlinx.coroutines.internal.MainDispatcherLoader INSTANCE = new kotlinx.coroutines.internal.MainDispatcherLoader();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final boolean getHighSpeedVideoFpsRanges = kotlinx.coroutines.internal.SystemPropsKt.systemProp("kotlinx.coroutines.fast.service.loader", true);
    public static final kotlinx.coroutines.MainCoroutineDispatcher dispatcher = getHighSpeedVideoSizes();

    private MainDispatcherLoader() {
    }

    private static kotlinx.coroutines.MainCoroutineDispatcher getHighSpeedVideoSizes() {
        java.lang.Object next;
        kotlinx.coroutines.MainCoroutineDispatcher tryCreateDispatcher;
        try {
            java.util.List<kotlinx.coroutines.internal.MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core = getHighSpeedVideoFpsRanges ? kotlinx.coroutines.internal.FastServiceLoader.INSTANCE.loadMainDispatcherFactory$kotlinx_coroutines_core() : kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.asSequence(java.util.ServiceLoader.load(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader()).iterator()));
            java.util.Iterator<T> it = loadMainDispatcherFactory$kotlinx_coroutines_core.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((kotlinx.coroutines.internal.MainDispatcherFactory) next).getLoadPriority();
                    do {
                        java.lang.Object next2 = it.next();
                        int loadPriority2 = ((kotlinx.coroutines.internal.MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory = (kotlinx.coroutines.internal.MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (tryCreateDispatcher = kotlinx.coroutines.internal.MainDispatchersKt.tryCreateDispatcher(mainDispatcherFactory, loadMainDispatcherFactory$kotlinx_coroutines_core)) == null) ? kotlinx.coroutines.internal.MainDispatchersKt.Camera2StreamConfigurationMap(null, 3) : tryCreateDispatcher;
        } catch (java.lang.Throwable th) {
            return kotlinx.coroutines.internal.MainDispatchersKt.Camera2StreamConfigurationMap(th, 2);
        }
    }
}
