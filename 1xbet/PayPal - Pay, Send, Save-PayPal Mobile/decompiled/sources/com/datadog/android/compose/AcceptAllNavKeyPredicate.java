package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/compose/AcceptAllNavKeyPredicate;", "", "T", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "<init>", "()V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "", "accept", "(Ljava/lang/Object;)Z", "other", "equals", "", "getViewName", "(Ljava/lang/Object;)Ljava/lang/String;", "", "hashCode", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class AcceptAllNavKeyPredicate<T> implements com.datadog.android.rum.tracking.ComponentPredicate<T> {
    public static final int $stable = 0;

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null);
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    @Override // com.datadog.android.rum.tracking.ComponentPredicate
    public java.lang.String getViewName(T component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        return null;
    }

    @Override // com.datadog.android.rum.tracking.ComponentPredicate
    public boolean accept(T component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        return true;
    }
}
