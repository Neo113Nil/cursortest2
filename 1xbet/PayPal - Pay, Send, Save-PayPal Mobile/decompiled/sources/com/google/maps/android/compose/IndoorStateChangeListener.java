package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/google/maps/android/compose/IndoorStateChangeListener;", "", "", "onIndoorBuildingFocused", "()V", "Lcom/google/android/gms/maps/model/IndoorBuilding;", "building", "onIndoorLevelActivated", "(Lcom/google/android/gms/maps/model/IndoorBuilding;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface IndoorStateChangeListener {
    default void onIndoorBuildingFocused() {
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onIndoorBuildingFocused(com.google.maps.android.compose.IndoorStateChangeListener indoorStateChangeListener) {
            com.google.maps.android.compose.IndoorStateChangeListener.super.onIndoorBuildingFocused();
        }

        @java.lang.Deprecated
        public static void onIndoorLevelActivated(com.google.maps.android.compose.IndoorStateChangeListener indoorStateChangeListener, com.google.android.gms.maps.model.IndoorBuilding indoorBuilding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indoorBuilding, "");
            com.google.maps.android.compose.IndoorStateChangeListener.super.onIndoorLevelActivated(indoorBuilding);
        }
    }

    default void onIndoorLevelActivated(com.google.android.gms.maps.model.IndoorBuilding building) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(building, "");
    }
}
