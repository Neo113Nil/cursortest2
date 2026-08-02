package androidx.work.impl.constraints.controllers;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/impl/constraints/controllers/ConstraintController;", "", "Landroidx/work/Constraints;", "constraints", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "track", "(Landroidx/work/Constraints;)Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "hasConstraint", "(Landroidx/work/impl/model/WorkSpec;)Z", "isCurrentlyConstrained"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ConstraintController {
    boolean hasConstraint(androidx.work.impl.model.WorkSpec workSpec);

    boolean isCurrentlyConstrained(androidx.work.impl.model.WorkSpec workSpec);

    kotlinx.coroutines.flow.Flow<androidx.work.impl.constraints.ConstraintsState> track(androidx.work.Constraints constraints);
}
