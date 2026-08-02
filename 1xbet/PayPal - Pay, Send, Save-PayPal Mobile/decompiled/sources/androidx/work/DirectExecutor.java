package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fj\u0002\b\r"}, d2 = {"Landroidx/work/DirectExecutor;", "Ljava/util/concurrent/Executor;", "", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "INSTANCE"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DirectExecutor implements java.util.concurrent.Executor {
    private static final /* synthetic */ androidx.work.DirectExecutor[] Camera2StreamConfigurationMap;
    public static final androidx.work.DirectExecutor INSTANCE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DirectExecutor(java.lang.String str) {
    }

    static {
        androidx.work.DirectExecutor directExecutor = new androidx.work.DirectExecutor("INSTANCE");
        INSTANCE = directExecutor;
        androidx.work.DirectExecutor[] directExecutorArr = {directExecutor};
        Camera2StreamConfigurationMap = directExecutorArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(directExecutorArr);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable command) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "");
        command.run();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "DirectExecutor";
    }

    public static androidx.work.DirectExecutor[] values() {
        return (androidx.work.DirectExecutor[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.work.DirectExecutor valueOf(java.lang.String str) {
        return (androidx.work.DirectExecutor) java.lang.Enum.valueOf(androidx.work.DirectExecutor.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.work.DirectExecutor> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
