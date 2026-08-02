package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/tracking/AcceptAllNavDestinations;", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroidx/navigation/NavDestination;", "<init>", "()V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "", "accept", "(Landroidx/navigation/NavDestination;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "getViewName", "(Landroidx/navigation/NavDestination;)Ljava/lang/String;", "", "hashCode", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class AcceptAllNavDestinations implements com.datadog.android.rum.tracking.ComponentPredicate<androidx.view.NavDestination> {
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
    public java.lang.String getViewName(androidx.view.NavDestination component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        return null;
    }

    @Override // com.datadog.android.rum.tracking.ComponentPredicate
    public boolean accept(androidx.view.NavDestination component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        return true;
    }
}
