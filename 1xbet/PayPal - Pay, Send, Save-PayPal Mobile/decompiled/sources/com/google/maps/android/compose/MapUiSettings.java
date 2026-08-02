package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017Jq\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b%\u0010\u001c"}, d2 = {"Lcom/google/maps/android/compose/MapUiSettings;", "", "", "compassEnabled", "indoorLevelPickerEnabled", "mapToolbarEnabled", "myLocationButtonEnabled", "rotationGesturesEnabled", "scrollGesturesEnabled", "scrollGesturesEnabledDuringRotateOrZoom", "tiltGesturesEnabled", "zoomControlsEnabled", "zoomGesturesEnabled", "<init>", "(ZZZZZZZZZZ)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "copy", "(ZZZZZZZZZZ)Lcom/google/maps/android/compose/MapUiSettings;", "Z", "getCompassEnabled", "()Z", "getIndoorLevelPickerEnabled", "getMapToolbarEnabled", "getMyLocationButtonEnabled", "getRotationGesturesEnabled", "getScrollGesturesEnabled", "getScrollGesturesEnabledDuringRotateOrZoom", "getTiltGesturesEnabled", "getZoomControlsEnabled", "getZoomGesturesEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapUiSettings {
    public static final int $stable = 0;
    private final boolean compassEnabled;
    private final boolean indoorLevelPickerEnabled;
    private final boolean mapToolbarEnabled;
    private final boolean myLocationButtonEnabled;
    private final boolean rotationGesturesEnabled;
    private final boolean scrollGesturesEnabled;
    private final boolean scrollGesturesEnabledDuringRotateOrZoom;
    private final boolean tiltGesturesEnabled;
    private final boolean zoomControlsEnabled;
    private final boolean zoomGesturesEnabled;

    public MapUiSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.compassEnabled = z;
        this.indoorLevelPickerEnabled = z2;
        this.mapToolbarEnabled = z3;
        this.myLocationButtonEnabled = z4;
        this.rotationGesturesEnabled = z5;
        this.scrollGesturesEnabled = z6;
        this.scrollGesturesEnabledDuringRotateOrZoom = z7;
        this.tiltGesturesEnabled = z8;
        this.zoomControlsEnabled = z9;
        this.zoomGesturesEnabled = z10;
    }

    public /* synthetic */ MapUiSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? true : z7, (i & 128) != 0 ? true : z8, (i & 256) != 0 ? true : z9, (i & 512) == 0 ? z10 : true);
    }

    public final boolean getCompassEnabled() {
        return this.compassEnabled;
    }

    public final boolean getIndoorLevelPickerEnabled() {
        return this.indoorLevelPickerEnabled;
    }

    public final boolean getMapToolbarEnabled() {
        return this.mapToolbarEnabled;
    }

    public final boolean getMyLocationButtonEnabled() {
        return this.myLocationButtonEnabled;
    }

    public final boolean getRotationGesturesEnabled() {
        return this.rotationGesturesEnabled;
    }

    public final boolean getScrollGesturesEnabled() {
        return this.scrollGesturesEnabled;
    }

    public final boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.scrollGesturesEnabledDuringRotateOrZoom;
    }

    public final boolean getTiltGesturesEnabled() {
        return this.tiltGesturesEnabled;
    }

    public final boolean getZoomControlsEnabled() {
        return this.zoomControlsEnabled;
    }

    public final boolean getZoomGesturesEnabled() {
        return this.zoomGesturesEnabled;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MapUiSettings(compassEnabled=");
        sb.append(this.compassEnabled);
        sb.append(", indoorLevelPickerEnabled=");
        sb.append(this.indoorLevelPickerEnabled);
        sb.append(", mapToolbarEnabled=");
        sb.append(this.mapToolbarEnabled);
        sb.append(", myLocationButtonEnabled=");
        sb.append(this.myLocationButtonEnabled);
        sb.append(", rotationGesturesEnabled=");
        sb.append(this.rotationGesturesEnabled);
        sb.append(", scrollGesturesEnabled=");
        sb.append(this.scrollGesturesEnabled);
        sb.append(", scrollGesturesEnabledDuringRotateOrZoom=");
        sb.append(this.scrollGesturesEnabledDuringRotateOrZoom);
        sb.append(", tiltGesturesEnabled=");
        sb.append(this.tiltGesturesEnabled);
        sb.append(", zoomControlsEnabled=");
        sb.append(this.zoomControlsEnabled);
        sb.append(", zoomGesturesEnabled=");
        sb.append(this.zoomGesturesEnabled);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.google.maps.android.compose.MapUiSettings)) {
            return false;
        }
        com.google.maps.android.compose.MapUiSettings mapUiSettings = (com.google.maps.android.compose.MapUiSettings) other;
        return this.compassEnabled == mapUiSettings.compassEnabled && this.indoorLevelPickerEnabled == mapUiSettings.indoorLevelPickerEnabled && this.mapToolbarEnabled == mapUiSettings.mapToolbarEnabled && this.myLocationButtonEnabled == mapUiSettings.myLocationButtonEnabled && this.rotationGesturesEnabled == mapUiSettings.rotationGesturesEnabled && this.scrollGesturesEnabled == mapUiSettings.scrollGesturesEnabled && this.scrollGesturesEnabledDuringRotateOrZoom == mapUiSettings.scrollGesturesEnabledDuringRotateOrZoom && this.tiltGesturesEnabled == mapUiSettings.tiltGesturesEnabled && this.zoomControlsEnabled == mapUiSettings.zoomControlsEnabled && this.zoomGesturesEnabled == mapUiSettings.zoomGesturesEnabled;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Boolean.valueOf(this.compassEnabled), java.lang.Boolean.valueOf(this.indoorLevelPickerEnabled), java.lang.Boolean.valueOf(this.mapToolbarEnabled), java.lang.Boolean.valueOf(this.myLocationButtonEnabled), java.lang.Boolean.valueOf(this.rotationGesturesEnabled), java.lang.Boolean.valueOf(this.scrollGesturesEnabled), java.lang.Boolean.valueOf(this.scrollGesturesEnabledDuringRotateOrZoom), java.lang.Boolean.valueOf(this.tiltGesturesEnabled), java.lang.Boolean.valueOf(this.zoomControlsEnabled), java.lang.Boolean.valueOf(this.zoomGesturesEnabled));
    }

    public final com.google.maps.android.compose.MapUiSettings copy(boolean compassEnabled, boolean indoorLevelPickerEnabled, boolean mapToolbarEnabled, boolean myLocationButtonEnabled, boolean rotationGesturesEnabled, boolean scrollGesturesEnabled, boolean scrollGesturesEnabledDuringRotateOrZoom, boolean tiltGesturesEnabled, boolean zoomControlsEnabled, boolean zoomGesturesEnabled) {
        return new com.google.maps.android.compose.MapUiSettings(compassEnabled, indoorLevelPickerEnabled, mapToolbarEnabled, myLocationButtonEnabled, rotationGesturesEnabled, scrollGesturesEnabled, scrollGesturesEnabledDuringRotateOrZoom, tiltGesturesEnabled, zoomControlsEnabled, zoomGesturesEnabled);
    }

    public MapUiSettings() {
        this(false, false, false, false, false, false, false, false, false, false, 1023, null);
    }
}
