package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/maps/android/compose/DefaultIndoorStateChangeListener;", "Lcom/google/maps/android/compose/IndoorStateChangeListener;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DefaultIndoorStateChangeListener implements com.google.maps.android.compose.IndoorStateChangeListener {
    public static final int $stable = 0;
    public static final com.google.maps.android.compose.DefaultIndoorStateChangeListener INSTANCE = new com.google.maps.android.compose.DefaultIndoorStateChangeListener();

    private DefaultIndoorStateChangeListener() {
    }

    @Override // com.google.maps.android.compose.IndoorStateChangeListener
    public final /* bridge */ void onIndoorBuildingFocused() {
        super.onIndoorBuildingFocused();
    }

    @Override // com.google.maps.android.compose.IndoorStateChangeListener
    public final /* bridge */ void onIndoorLevelActivated(com.google.android.gms.maps.model.IndoorBuilding indoorBuilding) {
        super.onIndoorLevelActivated(indoorBuilding);
    }
}
