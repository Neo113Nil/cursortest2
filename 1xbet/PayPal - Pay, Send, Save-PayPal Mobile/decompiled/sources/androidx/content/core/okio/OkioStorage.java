package androidx.content.core.okio;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001dBG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u001b\u0010\u0012\u001a\u00020\b8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0012\u0010\u001c"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage;", "T", "Landroidx/datastore/core/Storage;", "Lokio/FileSystem;", "fileSystem", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Lkotlin/Function2;", "Lokio/Path;", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinatorProducer", "Lkotlin/Function0;", "producePath", "<init>", "(Lokio/FileSystem;Landroidx/datastore/core/okio/OkioSerializer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/datastore/core/StorageConnection;", "createConnection", "()Landroidx/datastore/core/StorageConnection;", "Camera2StreamConfigurationMap", "Lokio/FileSystem;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/datastore/core/okio/OkioSerializer;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "()Lokio/Path;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OkioStorage<T> implements androidx.content.core.Storage<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.content.core.okio.OkioStorage.Companion INSTANCE = new androidx.content.core.okio.OkioStorage.Companion(null);
    private static final java.util.Set<java.lang.String> activeFiles = new java.util.LinkedHashSet();
    private static final androidx.content.core.okio.Synchronizer activeFilesLock = new androidx.content.core.okio.Synchronizer();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okio.FileSystem getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<okio.Path> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<okio.Path, okio.FileSystem, androidx.content.core.InterProcessCoordinator> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.content.core.okio.OkioSerializer<T> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public OkioStorage(okio.FileSystem fileSystem, androidx.content.core.okio.OkioSerializer<T> okioSerializer, kotlin.jvm.functions.Function2<? super okio.Path, ? super okio.FileSystem, ? extends androidx.content.core.InterProcessCoordinator> function2, kotlin.jvm.functions.Function0<okio.Path> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okioSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRanges = fileSystem;
        this.getHighResolutionOutputSizeshNQ4ISI = okioSerializer;
        this.getHighSpeedVideoSizes = function2;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.datastore.core.okio.OkioStorage$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.content.core.okio.OkioStorage.$r8$lambda$ngX1sQHRBFS9is12Tq2RMloe3b8(androidx.content.core.okio.OkioStorage.this);
            }
        });
    }

    public /* synthetic */ OkioStorage(okio.FileSystem fileSystem, androidx.content.core.okio.OkioSerializer okioSerializer, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fileSystem, okioSerializer, (i & 4) != 0 ? new kotlin.jvm.functions.Function2() { // from class: androidx.datastore.core.okio.OkioStorage$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.content.core.okio.OkioStorage.$r8$lambda$zaSHyDobNeO3yk4Wyl_gDVAF7jA((okio.Path) obj, (okio.FileSystem) obj2);
            }
        } : function2, function0);
    }

    private final okio.Path Camera2StreamConfigurationMap() {
        return (okio.Path) this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // androidx.content.core.Storage
    public final androidx.content.core.StorageConnection<T> createConnection() {
        java.lang.String obj = Camera2StreamConfigurationMap().toString();
        synchronized (activeFilesLock) {
            java.util.Set<java.lang.String> set = activeFiles;
            if (set.contains(obj)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("There are multiple DataStores active for the same file: ");
                sb.append(obj);
                sb.append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            set.add(obj);
        }
        return new androidx.content.core.okio.OkioStorageConnection(this.getHighSpeedVideoFpsRanges, Camera2StreamConfigurationMap(), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.invoke(Camera2StreamConfigurationMap(), this.getHighSpeedVideoFpsRanges), new kotlin.jvm.functions.Function0() { // from class: androidx.datastore.core.okio.OkioStorage$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.content.core.okio.OkioStorage.getHighSpeedVideoFpsRangesFor(androidx.content.core.okio.OkioStorage.this);
                return highSpeedVideoFpsRangesFor;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.content.core.okio.OkioStorage okioStorage) {
        synchronized (activeFilesLock) {
            activeFiles.remove(okioStorage.Camera2StreamConfigurationMap().toString());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage$Companion;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", "getActiveFiles$datastore_core_okio", "()Ljava/util/Set;", "Landroidx/datastore/core/okio/Synchronizer;", "activeFilesLock", "Landroidx/datastore/core/okio/Synchronizer;", "getActiveFilesLock", "()Landroidx/datastore/core/okio/Synchronizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Set<java.lang.String> getActiveFiles$datastore_core_okio() {
            return androidx.content.core.okio.OkioStorage.activeFiles;
        }

        public final androidx.content.core.okio.Synchronizer getActiveFilesLock() {
            return androidx.content.core.okio.OkioStorage.activeFilesLock;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ okio.Path $r8$lambda$ngX1sQHRBFS9is12Tq2RMloe3b8(androidx.content.core.okio.OkioStorage okioStorage) {
        okio.Path invoke = okioStorage.getHighSpeedVideoFpsRangesFor.invoke();
        if (!invoke.isAbsolute()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OkioStorage requires absolute paths, but did not get an absolute path from producePath = ");
            sb.append(okioStorage.getHighSpeedVideoFpsRangesFor);
            sb.append(", instead got ");
            sb.append(invoke);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return invoke.normalized();
    }

    public static /* synthetic */ androidx.content.core.InterProcessCoordinator $r8$lambda$zaSHyDobNeO3yk4Wyl_gDVAF7jA(okio.Path path, okio.FileSystem fileSystem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        return androidx.content.core.okio.OkioStorageKt.createSingleProcessCoordinator(path);
    }
}
