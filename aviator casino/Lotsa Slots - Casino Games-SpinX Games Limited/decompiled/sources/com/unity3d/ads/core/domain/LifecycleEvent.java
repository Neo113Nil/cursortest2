package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetLifecycleFlow.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent;", "", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getActivity", "()Ljava/lang/ref/WeakReference;", "Created", "Destroyed", "Paused", "Resumed", "SaveInstanceState", "Started", "Stopped", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Created;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Destroyed;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Paused;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Resumed;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$SaveInstanceState;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Started;", "Lcom/unity3d/ads/core/domain/LifecycleEvent$Stopped;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LifecycleEvent {
    java.lang.ref.WeakReference<android.app.Activity> getActivity();

    /* compiled from: AndroidGetLifecycleFlow.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Created;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "(Ljava/lang/ref/WeakReference;Landroid/os/Bundle;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "getBundle", "()Landroid/os/Bundle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Created implements com.unity3d.ads.core.domain.LifecycleEvent {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;
        private final android.os.Bundle bundle;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.unity3d.ads.core.domain.LifecycleEvent.Created copy$default(com.unity3d.ads.core.domain.LifecycleEvent.Created created, java.lang.ref.WeakReference weakReference, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                weakReference = created.getActivity();
            }
            if ((i & 2) != 0) {
                bundle = created.bundle;
            }
            return created.copy(weakReference, bundle);
        }

        public final java.lang.ref.WeakReference<android.app.Activity> component1() {
            return getActivity();
        }

        /* renamed from: component2, reason: from getter */
        public final android.os.Bundle getBundle() {
            return this.bundle;
        }

        public final com.unity3d.ads.core.domain.LifecycleEvent.Created copy(java.lang.ref.WeakReference<android.app.Activity> activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            return new com.unity3d.ads.core.domain.LifecycleEvent.Created(activity, bundle);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.ads.core.domain.LifecycleEvent.Created)) {
                return false;
            }
            com.unity3d.ads.core.domain.LifecycleEvent.Created created = (com.unity3d.ads.core.domain.LifecycleEvent.Created) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(getActivity(), created.getActivity()) && kotlin.jvm.internal.Intrinsics.areEqual(this.bundle, created.bundle);
        }

        public int hashCode() {
            int hashCode = getActivity().hashCode() * 31;
            android.os.Bundle bundle = this.bundle;
            return hashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public java.lang.String toString() {
            return "Created(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }

        public Created(java.lang.ref.WeakReference<android.app.Activity> activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.bundle = bundle;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }

        public final android.os.Bundle getBundle() {
            return this.bundle;
        }
    }

    /* compiled from: AndroidGetLifecycleFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Started;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Started implements com.unity3d.ads.core.domain.LifecycleEvent {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.unity3d.ads.core.domain.LifecycleEvent.Started copy$default(com.unity3d.ads.core.domain.LifecycleEvent.Started started, java.lang.ref.WeakReference weakReference, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                weakReference = started.getActivity();
            }
            return started.copy(weakReference);
        }

        public final java.lang.ref.WeakReference<android.app.Activity> component1() {
            return getActivity();
        }

        public final com.unity3d.ads.core.domain.LifecycleEvent.Started copy(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            return new com.unity3d.ads.core.domain.LifecycleEvent.Started(activity);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.domain.LifecycleEvent.Started) && kotlin.jvm.internal.Intrinsics.areEqual(getActivity(), ((com.unity3d.ads.core.domain.LifecycleEvent.Started) other).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public java.lang.String toString() {
            return "Started(activity=" + getActivity() + ')';
        }

        public Started(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }
    }

    /* compiled from: AndroidGetLifecycleFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Resumed;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Resumed implements com.unity3d.ads.core.domain.LifecycleEvent {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.unity3d.ads.core.domain.LifecycleEvent.Resumed copy$default(com.unity3d.ads.core.domain.LifecycleEvent.Resumed resumed, java.lang.ref.WeakReference weakReference, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                weakReference = resumed.getActivity();
            }
            return resumed.copy(weakReference);
        }

        public final java.lang.ref.WeakReference<android.app.Activity> component1() {
            return getActivity();
        }

        public final com.unity3d.ads.core.domain.LifecycleEvent.Resumed copy(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            return new com.unity3d.ads.core.domain.LifecycleEvent.Resumed(activity);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed) && kotlin.jvm.internal.Intrinsics.areEqual(getActivity(), ((com.unity3d.ads.core.domain.LifecycleEvent.Resumed) other).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public java.lang.String toString() {
            return "Resumed(activity=" + getActivity() + ')';
        }

        public Resumed(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }
    }

    /* compiled from: AndroidGetLifecycleFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Paused;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Paused implements com.unity3d.ads.core.domain.LifecycleEvent {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.unity3d.ads.core.domain.LifecycleEvent.Paused copy$default(com.unity3d.ads.core.domain.LifecycleEvent.Paused paused, java.lang.ref.WeakReference weakReference, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                weakReference = paused.getActivity();
            }
            return paused.copy(weakReference);
        }

        public final java.lang.ref.WeakReference<android.app.Activity> component1() {
            return getActivity();
        }

        public final com.unity3d.ads.core.domain.LifecycleEvent.Paused copy(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            return new com.unity3d.ads.core.domain.LifecycleEvent.Paused(activity);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.domain.LifecycleEvent.Paused) && kotlin.jvm.internal.Intrinsics.areEqual(getActivity(), ((com.unity3d.ads.core.domain.LifecycleEvent.Paused) other).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public java.lang.String toString() {
            return "Paused(activity=" + getActivity() + ')';
        }

        public Paused(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }
    }

    /* compiled from: AndroidGetLifecycleFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Stopped;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Stopped implements com.unity3d.ads.core.domain.LifecycleEvent {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.unity3d.ads.core.domain.LifecycleEvent.Stopped copy$default(com.unity3d.ads.core.domain.LifecycleEvent.Stopped stopped, java.lang.ref.WeakReference weakReference, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                weakReference = stopped.getActivity();
            }
            return stopped.copy(weakReference);
        }

        public final java.lang.ref.WeakReference<android.app.Activity> component1() {
            return getActivity();
        }

        public final com.unity3d.ads.core.domain.LifecycleEvent.Stopped copy(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            return new com.unity3d.ads.core.domain.LifecycleEvent.Stopped(activity);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.domain.LifecycleEvent.Stopped) && kotlin.jvm.internal.Intrinsics.areEqual(getActivity(), ((com.unity3d.ads.core.domain.LifecycleEvent.Stopped) other).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public java.lang.String toString() {
            return "Stopped(activity=" + getActivity() + ')';
        }

        public Stopped(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }
    }

    /* compiled from: AndroidGetLifecycleFlow.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$SaveInstanceState;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "(Ljava/lang/ref/WeakReference;Landroid/os/Bundle;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "getBundle", "()Landroid/os/Bundle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SaveInstanceState implements com.unity3d.ads.core.domain.LifecycleEvent {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;
        private final android.os.Bundle bundle;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.unity3d.ads.core.domain.LifecycleEvent.SaveInstanceState copy$default(com.unity3d.ads.core.domain.LifecycleEvent.SaveInstanceState saveInstanceState, java.lang.ref.WeakReference weakReference, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                weakReference = saveInstanceState.getActivity();
            }
            if ((i & 2) != 0) {
                bundle = saveInstanceState.bundle;
            }
            return saveInstanceState.copy(weakReference, bundle);
        }

        public final java.lang.ref.WeakReference<android.app.Activity> component1() {
            return getActivity();
        }

        /* renamed from: component2, reason: from getter */
        public final android.os.Bundle getBundle() {
            return this.bundle;
        }

        public final com.unity3d.ads.core.domain.LifecycleEvent.SaveInstanceState copy(java.lang.ref.WeakReference<android.app.Activity> activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            return new com.unity3d.ads.core.domain.LifecycleEvent.SaveInstanceState(activity, bundle);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.ads.core.domain.LifecycleEvent.SaveInstanceState)) {
                return false;
            }
            com.unity3d.ads.core.domain.LifecycleEvent.SaveInstanceState saveInstanceState = (com.unity3d.ads.core.domain.LifecycleEvent.SaveInstanceState) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(getActivity(), saveInstanceState.getActivity()) && kotlin.jvm.internal.Intrinsics.areEqual(this.bundle, saveInstanceState.bundle);
        }

        public int hashCode() {
            int hashCode = getActivity().hashCode() * 31;
            android.os.Bundle bundle = this.bundle;
            return hashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public java.lang.String toString() {
            return "SaveInstanceState(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }

        public SaveInstanceState(java.lang.ref.WeakReference<android.app.Activity> activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.bundle = bundle;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }

        public final android.os.Bundle getBundle() {
            return this.bundle;
        }
    }

    /* compiled from: AndroidGetLifecycleFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/LifecycleEvent$Destroyed;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Destroyed implements com.unity3d.ads.core.domain.LifecycleEvent {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.unity3d.ads.core.domain.LifecycleEvent.Destroyed copy$default(com.unity3d.ads.core.domain.LifecycleEvent.Destroyed destroyed, java.lang.ref.WeakReference weakReference, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                weakReference = destroyed.getActivity();
            }
            return destroyed.copy(weakReference);
        }

        public final java.lang.ref.WeakReference<android.app.Activity> component1() {
            return getActivity();
        }

        public final com.unity3d.ads.core.domain.LifecycleEvent.Destroyed copy(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            return new com.unity3d.ads.core.domain.LifecycleEvent.Destroyed(activity);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.domain.LifecycleEvent.Destroyed) && kotlin.jvm.internal.Intrinsics.areEqual(getActivity(), ((com.unity3d.ads.core.domain.LifecycleEvent.Destroyed) other).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public java.lang.String toString() {
            return "Destroyed(activity=" + getActivity() + ')';
        }

        public Destroyed(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }
    }
}
