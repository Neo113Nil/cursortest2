package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/work/impl/model/WorkGenerationalId;", "generationalId", "", "systemId", "Landroidx/work/impl/model/SystemIdInfo;", "systemIdInfo", "(Landroidx/work/impl/model/WorkGenerationalId;I)Landroidx/work/impl/model/SystemIdInfo;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SystemIdInfoKt {
    public static final androidx.work.impl.model.SystemIdInfo systemIdInfo(androidx.work.impl.model.WorkGenerationalId workGenerationalId, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workGenerationalId, "");
        return new androidx.work.impl.model.SystemIdInfo(workGenerationalId.getWorkSpecId(), workGenerationalId.getGeneration(), i);
    }
}
