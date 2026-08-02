package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0017B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/datastore/core/FileStorage;", "T", "Landroidx/datastore/core/Storage;", "Landroidx/datastore/core/Serializer;", "serializer", "Lkotlin/Function1;", "Ljava/io/File;", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinatorProducer", "Lkotlin/Function0;", "produceFile", "<init>", "(Landroidx/datastore/core/Serializer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroidx/datastore/core/StorageConnection;", "createConnection", "()Landroidx/datastore/core/StorageConnection;", "getHighSpeedVideoFpsRangesFor", "Landroidx/datastore/core/Serializer;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileStorage<T> implements androidx.content.core.Storage<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.content.core.FileStorage.Companion INSTANCE = new androidx.content.core.FileStorage.Companion(null);
    private static final java.util.Set<java.lang.String> activeFiles = new java.util.LinkedHashSet();
    private static final java.lang.Object activeFilesLock = new java.lang.Object();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.io.File> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.io.File, androidx.content.core.InterProcessCoordinator> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.content.core.Serializer<T> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public FileStorage(androidx.content.core.Serializer<T> serializer, kotlin.jvm.functions.Function1<? super java.io.File, ? extends androidx.content.core.InterProcessCoordinator> function1, kotlin.jvm.functions.Function0<? extends java.io.File> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRangesFor = serializer;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = function0;
    }

    public /* synthetic */ FileStorage(androidx.content.core.Serializer serializer, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(serializer, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.datastore.core.FileStorage$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.content.core.FileStorage.$r8$lambda$i_CTkxVTKhfAC0UyaWMuAs7ImrQ((java.io.File) obj);
            }
        } : function1, function0);
    }

    @Override // androidx.content.core.Storage
    public final androidx.content.core.StorageConnection<T> createConnection() {
        final java.io.File canonicalFile = this.Camera2StreamConfigurationMap.invoke().getCanonicalFile();
        synchronized (activeFilesLock) {
            java.lang.String absolutePath = canonicalFile.getAbsolutePath();
            java.util.Set<java.lang.String> set = activeFiles;
            if (set.contains(absolutePath)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("There are multiple DataStores active for the same file: ");
                sb.append(absolutePath);
                sb.append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(absolutePath);
            set.add(absolutePath);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(canonicalFile);
        return new androidx.content.core.FileStorageConnection(canonicalFile, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI.invoke(canonicalFile), new kotlin.jvm.functions.Function0() { // from class: androidx.datastore.core.FileStorage$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.content.core.FileStorage.getHighSpeedVideoSizes(canonicalFile);
                return highSpeedVideoSizes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(java.io.File file) {
        synchronized (activeFilesLock) {
            activeFiles.remove(file.getAbsolutePath());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/datastore/core/FileStorage$Companion;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", "getActiveFiles$datastore_core", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "getActiveFilesLock$datastore_core", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Set<java.lang.String> getActiveFiles$datastore_core() {
            return androidx.content.core.FileStorage.activeFiles;
        }

        public final java.lang.Object getActiveFilesLock$datastore_core() {
            return androidx.content.core.FileStorage.activeFilesLock;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ androidx.content.core.InterProcessCoordinator $r8$lambda$i_CTkxVTKhfAC0UyaWMuAs7ImrQ(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return androidx.content.core.InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(file);
    }
}
