package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "<init>", "()V", "", "ensureStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GlobalSnapshotManager {
    public static final androidx.compose.ui.platform.GlobalSnapshotManager INSTANCE = new androidx.compose.ui.platform.GlobalSnapshotManager();
    private static final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean(false);
    public static final int $stable = 8;

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
            final kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(1, null, null, 6, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.compose.ui.platform.AndroidUiDispatcher.INSTANCE.getMain()), null, null, new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1(Channel$default, null), 3, null);
            androidx.compose.runtime.snapshots.Snapshot.INSTANCE.registerGlobalWriteObserver(new kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                    getHighSpeedVideoFpsRanges(obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(java.lang.Object obj) {
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
                    atomicBoolean = androidx.compose.ui.platform.GlobalSnapshotManager.getHighSpeedVideoFpsRangesFor;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        Channel$default.mo9266trySendJP2dKIU(kotlin.Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
    }
}
