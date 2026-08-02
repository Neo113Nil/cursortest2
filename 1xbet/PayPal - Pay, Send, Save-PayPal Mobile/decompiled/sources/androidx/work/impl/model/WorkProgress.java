package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/work/impl/model/WorkProgress;", "", "", "workSpecId", "Landroidx/work/Data;", "progress", "<init>", "(Ljava/lang/String;Landroidx/work/Data;)V", "Ljava/lang/String;", "getWorkSpecId", "()Ljava/lang/String;", "Landroidx/work/Data;", "getProgress", "()Landroidx/work/Data;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkProgress {
    private final androidx.work.Data progress;
    private final java.lang.String workSpecId;

    public WorkProgress(java.lang.String str, androidx.work.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        this.workSpecId = str;
        this.progress = data;
    }

    public final java.lang.String getWorkSpecId() {
        return this.workSpecId;
    }

    public final androidx.work.Data getProgress() {
        return this.progress;
    }
}
