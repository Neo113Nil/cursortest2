package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "Landroidx/work/impl/model/WorkGenerationalId;", "generationalId", "(Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/model/WorkGenerationalId;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkSpecKt {
    public static final androidx.work.impl.model.WorkGenerationalId generationalId(androidx.work.impl.model.WorkSpec workSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        return new androidx.work.impl.model.WorkGenerationalId(workSpec.id, workSpec.getGeneration());
    }
}
