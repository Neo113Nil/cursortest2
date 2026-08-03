package androidx.compose.ui.platform;

/* compiled from: GlobalSnapshotManager.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "()V", "sent", "Ljava/util/concurrent/atomic/AtomicBoolean;", com.ironsource.X3.i.d0, "ensureStarted", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GlobalSnapshotManager {
    public static final androidx.compose.ui.platform.GlobalSnapshotManager INSTANCE = new androidx.compose.ui.platform.GlobalSnapshotManager();
    private static final java.util.concurrent.atomic.AtomicBoolean started = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static final java.util.concurrent.atomic.AtomicBoolean sent = new java.util.concurrent.atomic.AtomicBoolean(false);
    public static final int $stable = 8;

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(1, null, null, 6, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.compose.ui.platform.AndroidUiDispatcher.INSTANCE.getMain()), null, null, new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1(Channel$default, null), 3, null);
            androidx.compose.runtime.snapshots.Snapshot.INSTANCE.registerGlobalWriteObserver(new kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                    invoke2(obj);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Object obj) {
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
                    atomicBoolean = androidx.compose.ui.platform.GlobalSnapshotManager.sent;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        Channel$default.mo10716trySendJP2dKIU(kotlin.Unit.INSTANCE);
                    }
                }
            });
        }
    }
}
