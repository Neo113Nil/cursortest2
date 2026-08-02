package com.google.android.gms.maps;

/* loaded from: classes8.dex */
public final class UiSettings {
    private final com.google.android.gms.maps.internal.IUiSettingsDelegate zza;

    public final boolean isCompassEnabled() {
        try {
            return this.zza.isCompassEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isIndoorLevelPickerEnabled() {
        try {
            return this.zza.isIndoorLevelPickerEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isMapToolbarEnabled() {
        try {
            return this.zza.isMapToolbarEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isMyLocationButtonEnabled() {
        try {
            return this.zza.isMyLocationButtonEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isRotateGesturesEnabled() {
        try {
            return this.zza.isRotateGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isScrollGesturesEnabled() {
        try {
            return this.zza.isScrollGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        try {
            return this.zza.isScrollGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isTiltGesturesEnabled() {
        try {
            return this.zza.isTiltGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isZoomControlsEnabled() {
        try {
            return this.zza.isZoomControlsEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isZoomGesturesEnabled() {
        try {
            return this.zza.isZoomGesturesEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setAllGesturesEnabled(boolean z) {
        try {
            this.zza.setAllGesturesEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setCompassEnabled(boolean z) {
        try {
            this.zza.setCompassEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setIndoorLevelPickerEnabled(boolean z) {
        try {
            this.zza.setIndoorLevelPickerEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setMapToolbarEnabled(boolean z) {
        try {
            this.zza.setMapToolbarEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationButtonEnabled(boolean z) {
        try {
            this.zza.setMyLocationButtonEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setRotateGesturesEnabled(boolean z) {
        try {
            this.zza.setRotateGesturesEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setScrollGesturesEnabled(boolean z) {
        try {
            this.zza.setScrollGesturesEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setScrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        try {
            this.zza.setScrollGesturesEnabledDuringRotateOrZoom(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setTiltGesturesEnabled(boolean z) {
        try {
            this.zza.setTiltGesturesEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setZoomControlsEnabled(boolean z) {
        try {
            this.zza.setZoomControlsEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setZoomGesturesEnabled(boolean z) {
        try {
            this.zza.setZoomGesturesEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    UiSettings(com.google.android.gms.maps.internal.IUiSettingsDelegate iUiSettingsDelegate) {
        this.zza = iUiSettingsDelegate;
    }
}
