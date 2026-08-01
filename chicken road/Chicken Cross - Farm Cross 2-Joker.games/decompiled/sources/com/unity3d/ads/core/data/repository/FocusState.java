package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\bR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusState;", "", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getActivity", "()Ljava/lang/ref/WeakReference;", "Focused", "Unfocused", "Lcom/unity3d/ads/core/data/repository/FocusState$Focused;", "Lcom/unity3d/ads/core/data/repository/FocusState$Unfocused;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface FocusState {
    WeakReference<Activity> getActivity();

    /* compiled from: FocusRepository.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusState$Focused;", "Lcom/unity3d/ads/core/data/repository/FocusState;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Focused implements FocusState {
        private final WeakReference<Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Focused copy$default(Focused focused, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = focused.activity;
            }
            return focused.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return this.activity;
        }

        public final Focused copy(WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new Focused(activity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Focused) && Intrinsics.areEqual(this.activity, ((Focused) other).activity);
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "Focused(activity=" + this.activity + ')';
        }

        public Focused(WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }
    }

    /* compiled from: FocusRepository.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusState$Unfocused;", "Lcom/unity3d/ads/core/data/repository/FocusState;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unfocused implements FocusState {
        private final WeakReference<Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unfocused copy$default(Unfocused unfocused, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = unfocused.activity;
            }
            return unfocused.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return this.activity;
        }

        public final Unfocused copy(WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new Unfocused(activity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unfocused) && Intrinsics.areEqual(this.activity, ((Unfocused) other).activity);
        }

        public int hashCode() {
            return this.activity.hashCode();
        }

        public String toString() {
            return "Unfocused(activity=" + this.activity + ')';
        }

        public Unfocused(WeakReference<Activity> activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }
    }
}
