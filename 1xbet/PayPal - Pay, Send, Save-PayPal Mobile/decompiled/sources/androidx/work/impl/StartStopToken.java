package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/impl/StartStopToken;", "", "Landroidx/work/impl/model/WorkGenerationalId;", "id", "<init>", "(Landroidx/work/impl/model/WorkGenerationalId;)V", "Landroidx/work/impl/model/WorkGenerationalId;", "getId", "()Landroidx/work/impl/model/WorkGenerationalId;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StartStopToken {
    private final androidx.work.impl.model.WorkGenerationalId id;

    public StartStopToken(androidx.work.impl.model.WorkGenerationalId workGenerationalId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workGenerationalId, "");
        this.id = workGenerationalId;
    }

    public final androidx.work.impl.model.WorkGenerationalId getId() {
        return this.id;
    }
}
