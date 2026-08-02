package androidx.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/activity/OnBackPressedCallbackInfo;", "Landroidx/navigationevent/NavigationEventInfo;", "Landroidx/activity/OnBackPressedCallback;", "p0", "Landroidx/lifecycle/LifecycleOwner;", "p1", "<init>", "(Landroidx/activity/OnBackPressedCallback;Landroidx/lifecycle/LifecycleOwner;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/activity/OnBackPressedCallback;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/LifecycleOwner;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class OnBackPressedCallbackInfo extends androidx.view.NavigationEventInfo {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.OnBackPressedCallback getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.LifecycleOwner getHighSpeedVideoFpsRangesFor;

    public OnBackPressedCallbackInfo(androidx.view.OnBackPressedCallback onBackPressedCallback, androidx.view.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        this.getHighResolutionOutputSizeshNQ4ISI = onBackPressedCallback;
        this.getHighSpeedVideoFpsRangesFor = lifecycleOwner;
    }

    public /* synthetic */ OnBackPressedCallbackInfo(androidx.view.OnBackPressedCallback onBackPressedCallback, androidx.view.LifecycleOwner lifecycleOwner, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(onBackPressedCallback, (i & 2) != 0 ? null : lifecycleOwner);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBackPressedCallbackInfo(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        androidx.view.LifecycleOwner lifecycleOwner = this.getHighSpeedVideoFpsRangesFor;
        return (hashCode * 31) + (lifecycleOwner == null ? 0 : lifecycleOwner.hashCode());
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.view.OnBackPressedCallbackInfo)) {
            return false;
        }
        androidx.view.OnBackPressedCallbackInfo onBackPressedCallbackInfo = (androidx.view.OnBackPressedCallbackInfo) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, onBackPressedCallbackInfo.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, onBackPressedCallbackInfo.getHighSpeedVideoFpsRangesFor);
    }
}
