package com.datadog.android.rum.internal.tracking;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/NoOpInteractionPredicate;", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "", "getTargetName", "(Ljava/lang/Object;)Ljava/lang/String;", "", "hashCode", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoOpInteractionPredicate implements com.datadog.android.rum.tracking.InteractionPredicate {
    public final int hashCode() {
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        return other instanceof com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate;
    }

    @Override // com.datadog.android.rum.tracking.InteractionPredicate
    public final java.lang.String getTargetName(java.lang.Object target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        return null;
    }
}
