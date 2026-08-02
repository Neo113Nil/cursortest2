package com.datadog.android.sessionreplay.internal.prerequisite;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/prerequisite/NoOpSystemRequirementChecker;", "Lcom/datadog/android/sessionreplay/internal/prerequisite/SystemRequirementChecker;", "<init>", "()V", "", "checkMinimumRequirement", "()Z", "", "checkedValue", "()Ljava/lang/Object;", "", "name", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoOpSystemRequirementChecker implements com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker {
    @Override // com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker
    public final boolean checkMinimumRequirement() {
        return false;
    }

    @Override // com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker
    public final java.lang.Object checkedValue() {
        return null;
    }

    @Override // com.datadog.android.sessionreplay.internal.prerequisite.SystemRequirementChecker
    public final java.lang.String name() {
        return "";
    }
}
