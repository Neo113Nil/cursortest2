package com.unity3d.ads.core.data.repository;

/* compiled from: FocusRepository.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\bR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusState;", "", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getActivity", "()Ljava/lang/ref/WeakReference;", "Focused", "Unfocused", "Lcom/unity3d/ads/core/data/repository/FocusState$Focused;", "Lcom/unity3d/ads/core/data/repository/FocusState$Unfocused;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FocusState {
    java.lang.ref.WeakReference<android.app.Activity> getActivity();

    /* compiled from: FocusRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusState$Focused;", "Lcom/unity3d/ads/core/data/repository/FocusState;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Focused implements com.unity3d.ads.core.data.repository.FocusState {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.unity3d.ads.core.data.repository.FocusState.Focused copy$default(com.unity3d.ads.core.data.repository.FocusState.Focused focused, java.lang.ref.WeakReference weakReference, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                weakReference = focused.getActivity();
            }
            return focused.copy(weakReference);
        }

        public final java.lang.ref.WeakReference<android.app.Activity> component1() {
            return getActivity();
        }

        public final com.unity3d.ads.core.data.repository.FocusState.Focused copy(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            return new com.unity3d.ads.core.data.repository.FocusState.Focused(activity);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.data.repository.FocusState.Focused) && kotlin.jvm.internal.Intrinsics.areEqual(getActivity(), ((com.unity3d.ads.core.data.repository.FocusState.Focused) other).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public java.lang.String toString() {
            return "Focused(activity=" + getActivity() + ')';
        }

        public Focused(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        public java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }
    }

    /* compiled from: FocusRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusState$Unfocused;", "Lcom/unity3d/ads/core/data/repository/FocusState;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Unfocused implements com.unity3d.ads.core.data.repository.FocusState {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.unity3d.ads.core.data.repository.FocusState.Unfocused copy$default(com.unity3d.ads.core.data.repository.FocusState.Unfocused unfocused, java.lang.ref.WeakReference weakReference, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                weakReference = unfocused.getActivity();
            }
            return unfocused.copy(weakReference);
        }

        public final java.lang.ref.WeakReference<android.app.Activity> component1() {
            return getActivity();
        }

        public final com.unity3d.ads.core.data.repository.FocusState.Unfocused copy(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            return new com.unity3d.ads.core.data.repository.FocusState.Unfocused(activity);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.ads.core.data.repository.FocusState.Unfocused) && kotlin.jvm.internal.Intrinsics.areEqual(getActivity(), ((com.unity3d.ads.core.data.repository.FocusState.Unfocused) other).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public java.lang.String toString() {
            return "Unfocused(activity=" + getActivity() + ')';
        }

        public Unfocused(java.lang.ref.WeakReference<android.app.Activity> activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        public java.lang.ref.WeakReference<android.app.Activity> getActivity() {
            return this.activity;
        }
    }
}
