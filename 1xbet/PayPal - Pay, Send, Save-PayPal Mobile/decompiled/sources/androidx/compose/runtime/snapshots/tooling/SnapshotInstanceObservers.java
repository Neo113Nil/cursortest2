package androidx.compose.runtime.snapshots.tooling;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n"}, d2 = {"Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "getReadObserver", "()Lkotlin/jvm/functions/Function1;", "getWriteObserver"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapshotInstanceObservers {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver;
    private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> writeObserver;

    public SnapshotInstanceObservers(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function12) {
        this.readObserver = function1;
        this.writeObserver = function12;
    }

    public /* synthetic */ SnapshotInstanceObservers(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12);
    }

    public final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getReadObserver() {
        return this.readObserver;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getWriteObserver() {
        return this.writeObserver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotInstanceObservers() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
