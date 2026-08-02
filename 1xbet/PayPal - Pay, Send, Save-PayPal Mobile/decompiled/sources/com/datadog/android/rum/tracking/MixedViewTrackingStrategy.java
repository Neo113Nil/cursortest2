package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\f\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u000f\u001a\u00020\u000e8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0011\u001a\u00020\u00108\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/datadog/android/rum/tracking/MixedViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "", "trackExtras", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroid/app/Activity;", "componentPredicate", "Landroidx/fragment/app/Fragment;", "supportFragmentComponentPredicate", "Landroid/app/Fragment;", "defaultFragmentComponentPredicate", "<init>", "(ZLcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/tracking/ComponentPredicate;)V", "Lcom/datadog/android/rum/tracking/ActivityViewTrackingStrategy;", "activityViewTrackingStrategy", "Lcom/datadog/android/rum/tracking/FragmentViewTrackingStrategy;", "fragmentViewTrackingStrategy", "(Lcom/datadog/android/rum/tracking/ActivityViewTrackingStrategy;Lcom/datadog/android/rum/tracking/FragmentViewTrackingStrategy;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/content/Context;", "context", "", "register", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "unregister", "(Landroid/content/Context;)V", "Lcom/datadog/android/rum/tracking/ActivityViewTrackingStrategy;", "getActivityViewTrackingStrategy$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/ActivityViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/FragmentViewTrackingStrategy;", "getFragmentViewTrackingStrategy$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/FragmentViewTrackingStrategy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MixedViewTrackingStrategy extends com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy implements com.datadog.android.rum.tracking.ViewTrackingStrategy {
    private final com.datadog.android.rum.tracking.ActivityViewTrackingStrategy activityViewTrackingStrategy;
    private final com.datadog.android.rum.tracking.FragmentViewTrackingStrategy fragmentViewTrackingStrategy;

    /* renamed from: getActivityViewTrackingStrategy$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.tracking.ActivityViewTrackingStrategy getActivityViewTrackingStrategy() {
        return this.activityViewTrackingStrategy;
    }

    /* renamed from: getFragmentViewTrackingStrategy$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.tracking.FragmentViewTrackingStrategy getFragmentViewTrackingStrategy() {
        return this.fragmentViewTrackingStrategy;
    }

    public MixedViewTrackingStrategy(com.datadog.android.rum.tracking.ActivityViewTrackingStrategy activityViewTrackingStrategy, com.datadog.android.rum.tracking.FragmentViewTrackingStrategy fragmentViewTrackingStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityViewTrackingStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentViewTrackingStrategy, "");
        this.activityViewTrackingStrategy = activityViewTrackingStrategy;
        this.fragmentViewTrackingStrategy = fragmentViewTrackingStrategy;
    }

    public /* synthetic */ MixedViewTrackingStrategy(boolean z, com.datadog.android.rum.tracking.AcceptAllActivities acceptAllActivities, com.datadog.android.rum.tracking.AcceptAllSupportFragments acceptAllSupportFragments, com.datadog.android.rum.tracking.AcceptAllDefaultFragment acceptAllDefaultFragment, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new com.datadog.android.rum.tracking.AcceptAllActivities() : acceptAllActivities, (i & 4) != 0 ? new com.datadog.android.rum.tracking.AcceptAllSupportFragments() : acceptAllSupportFragments, (i & 8) != 0 ? new com.datadog.android.rum.tracking.AcceptAllDefaultFragment() : acceptAllDefaultFragment);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MixedViewTrackingStrategy(boolean z, com.datadog.android.rum.tracking.ComponentPredicate<android.app.Activity> componentPredicate, com.datadog.android.rum.tracking.ComponentPredicate<androidx.fragment.app.Fragment> componentPredicate2, com.datadog.android.rum.tracking.ComponentPredicate<android.app.Fragment> componentPredicate3) {
        this(new com.datadog.android.rum.tracking.ActivityViewTrackingStrategy(z, componentPredicate), new com.datadog.android.rum.tracking.FragmentViewTrackingStrategy(z, componentPredicate2, componentPredicate3));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate3, "");
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, com.datadog.android.rum.tracking.TrackingStrategy
    public final void register(com.datadog.android.api.SdkCore sdkCore, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        super.register(sdkCore, context);
        this.activityViewTrackingStrategy.register(sdkCore, context);
        this.fragmentViewTrackingStrategy.register(sdkCore, context);
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, com.datadog.android.rum.tracking.TrackingStrategy
    public final void unregister(android.content.Context context) {
        this.activityViewTrackingStrategy.unregister(context);
        this.fragmentViewTrackingStrategy.unregister(context);
        super.unregister(context);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.datadog.android.rum.tracking.MixedViewTrackingStrategy mixedViewTrackingStrategy = (com.datadog.android.rum.tracking.MixedViewTrackingStrategy) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.activityViewTrackingStrategy, mixedViewTrackingStrategy.activityViewTrackingStrategy) && kotlin.jvm.internal.Intrinsics.areEqual(this.fragmentViewTrackingStrategy, mixedViewTrackingStrategy.fragmentViewTrackingStrategy);
    }

    public final int hashCode() {
        return (this.activityViewTrackingStrategy.hashCode() * 31) + this.fragmentViewTrackingStrategy.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MixedViewTrackingStrategy(boolean z, com.datadog.android.rum.tracking.ComponentPredicate<android.app.Activity> componentPredicate, com.datadog.android.rum.tracking.ComponentPredicate<androidx.fragment.app.Fragment> componentPredicate2) {
        this(z, componentPredicate, componentPredicate2, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MixedViewTrackingStrategy(boolean z, com.datadog.android.rum.tracking.ComponentPredicate<android.app.Activity> componentPredicate) {
        this(z, componentPredicate, null, null, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
    }

    public MixedViewTrackingStrategy(boolean z) {
        this(z, null, null, null, 14, null);
    }
}
