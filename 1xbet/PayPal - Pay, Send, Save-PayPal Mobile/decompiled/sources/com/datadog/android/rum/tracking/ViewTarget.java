package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/tracking/ViewTarget;", "", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "viewRef", "Lcom/datadog/android/rum/tracking/Node;", "node", "<init>", "(Ljava/lang/ref/WeakReference;Lcom/datadog/android/rum/tracking/Node;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/datadog/android/rum/tracking/Node;", "getNode", "()Lcom/datadog/android/rum/tracking/Node;", "Ljava/lang/ref/WeakReference;", "getViewRef", "()Ljava/lang/ref/WeakReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ViewTarget {
    private final com.datadog.android.rum.tracking.Node node;
    private final java.lang.ref.WeakReference<android.view.View> viewRef;

    public ViewTarget(java.lang.ref.WeakReference<android.view.View> weakReference, com.datadog.android.rum.tracking.Node node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
        this.viewRef = weakReference;
        this.node = node;
    }

    public /* synthetic */ ViewTarget(java.lang.ref.WeakReference weakReference, com.datadog.android.rum.tracking.Node node, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.lang.ref.WeakReference(null) : weakReference, (i & 2) != 0 ? null : node);
    }

    public final java.lang.ref.WeakReference<android.view.View> getViewRef() {
        return this.viewRef;
    }

    public final com.datadog.android.rum.tracking.Node getNode() {
        return this.node;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.tracking.ViewTarget)) {
            return false;
        }
        com.datadog.android.rum.tracking.ViewTarget viewTarget = (com.datadog.android.rum.tracking.ViewTarget) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.viewRef.get(), viewTarget.viewRef.get()) && kotlin.jvm.internal.Intrinsics.areEqual(this.node, viewTarget.node);
    }

    public final int hashCode() {
        android.view.View view = this.viewRef.get();
        int hashCode = view != null ? view.hashCode() : 0;
        com.datadog.android.rum.tracking.Node node = this.node;
        return (hashCode * 31) + (node != null ? node.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewTarget() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
