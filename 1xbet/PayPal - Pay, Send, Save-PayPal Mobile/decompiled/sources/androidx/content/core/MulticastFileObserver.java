package androidx.content.core;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR,\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\t0\u0010j\u0002`\u00110\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver;", "Landroid/os/FileObserver;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "event", "path", "", "onEvent", "(ILjava/lang/String;)V", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Landroidx/datastore/core/FileMoveObserver;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MulticastFileObserver extends android.os.FileObserver {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.CopyOnWriteArrayList<kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>> Camera2StreamConfigurationMap;
    private final java.lang.String path;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.content.core.MulticastFileObserver.Companion INSTANCE = new androidx.content.core.MulticastFileObserver.Companion(null);
    private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private static final java.util.Map<java.lang.String, androidx.content.core.MulticastFileObserver> fileObservers = new java.util.LinkedHashMap();

    private MulticastFileObserver(java.lang.String str) {
        super(str, 128);
        this.path = str;
        this.Camera2StreamConfigurationMap = new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int event, java.lang.String path) {
        java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            ((kotlin.jvm.functions.Function1) it.next()).invoke(path);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00042\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000bj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0003R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u00158\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver$Companion;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lkotlinx/coroutines/flow/Flow;", "", "observe", "(Ljava/io/File;)Lkotlinx/coroutines/flow/Flow;", "p0", "Lkotlin/Function1;", "", "Landroidx/datastore/core/FileMoveObserver;", "p1", "Lkotlinx/coroutines/DisposableHandle;", "getHighSpeedVideoFpsRangesFor", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "removeAllObservers$datastore_core", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "", "Landroidx/datastore/core/MulticastFileObserver;", "fileObservers", "Ljava/util/Map;", "getFileObservers$datastore_core", "()Ljava/util/Map;", "getFileObservers$datastore_core$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getFileObservers$datastore_core$annotations() {
        }

        private Companion() {
        }

        public final java.util.Map<java.lang.String, androidx.content.core.MulticastFileObserver> getFileObservers$datastore_core() {
            return androidx.content.core.MulticastFileObserver.fileObservers;
        }

        public final kotlinx.coroutines.flow.Flow<kotlin.Unit> observe(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            return kotlinx.coroutines.flow.FlowKt.channelFlow(new androidx.content.core.MulticastFileObserver$Companion$observe$1(file, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static kotlinx.coroutines.DisposableHandle getHighSpeedVideoFpsRangesFor(java.io.File p0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p1) {
            final java.lang.String path = p0.getCanonicalFile().getPath();
            synchronized (androidx.content.core.MulticastFileObserver.getHighSpeedVideoFpsRanges) {
                java.util.Map<java.lang.String, androidx.content.core.MulticastFileObserver> fileObservers$datastore_core = androidx.content.core.MulticastFileObserver.INSTANCE.getFileObservers$datastore_core();
                androidx.content.core.MulticastFileObserver multicastFileObserver = fileObservers$datastore_core.get(path);
                if (multicastFileObserver == null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(path);
                    multicastFileObserver = new androidx.content.core.MulticastFileObserver(path, null);
                    fileObservers$datastore_core.put(path, multicastFileObserver);
                }
                androidx.content.core.MulticastFileObserver multicastFileObserver2 = multicastFileObserver;
                multicastFileObserver2.Camera2StreamConfigurationMap.add(p1);
                if (multicastFileObserver2.Camera2StreamConfigurationMap.size() == 1) {
                    multicastFileObserver2.startWatching();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return new kotlinx.coroutines.DisposableHandle() { // from class: androidx.datastore.core.MulticastFileObserver$Companion$$ExternalSyntheticLambda0
                @Override // kotlinx.coroutines.DisposableHandle
                public final void dispose() {
                    androidx.content.core.MulticastFileObserver.Companion.$r8$lambda$eAwcRiJ1OEtul7FLii0C5ArgMdg(path, p1);
                }
            };
        }

        public final void removeAllObservers$datastore_core() {
            synchronized (androidx.content.core.MulticastFileObserver.getHighSpeedVideoFpsRanges) {
                java.util.Iterator<T> it = androidx.content.core.MulticastFileObserver.INSTANCE.getFileObservers$datastore_core().values().iterator();
                while (it.hasNext()) {
                    ((androidx.content.core.MulticastFileObserver) it.next()).stopWatching();
                }
                androidx.content.core.MulticastFileObserver.INSTANCE.getFileObservers$datastore_core().clear();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        public static /* synthetic */ void $r8$lambda$eAwcRiJ1OEtul7FLii0C5ArgMdg(java.lang.String str, kotlin.jvm.functions.Function1 function1) {
            synchronized (androidx.content.core.MulticastFileObserver.getHighSpeedVideoFpsRanges) {
                androidx.content.core.MulticastFileObserver multicastFileObserver = androidx.content.core.MulticastFileObserver.INSTANCE.getFileObservers$datastore_core().get(str);
                if (multicastFileObserver != null) {
                    multicastFileObserver.Camera2StreamConfigurationMap.remove(function1);
                    if (multicastFileObserver.Camera2StreamConfigurationMap.isEmpty()) {
                        androidx.content.core.MulticastFileObserver.INSTANCE.getFileObservers$datastore_core().remove(str);
                        multicastFileObserver.stopWatching();
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MulticastFileObserver(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
