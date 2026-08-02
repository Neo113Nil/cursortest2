package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public final class GroundOverlay {
    private final com.google.android.gms.internal.maps.zzx zza;

    public GroundOverlay(com.google.android.gms.internal.maps.zzx zzxVar) {
        this.zza = (com.google.android.gms.internal.maps.zzx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzxVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.maps.model.GroundOverlay)) {
            return false;
        }
        try {
            return this.zza.zzz(((com.google.android.gms.maps.model.GroundOverlay) obj).zza);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getBearing() {
        try {
            return this.zza.zzd();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.LatLngBounds getBounds() {
        try {
            return this.zza.zzl();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getHeight() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.lang.String getId() {
        try {
            return this.zza.zzm();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.LatLng getPosition() {
        try {
            return this.zza.zzk();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.lang.Object getTag() {
        try {
            return com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zza.zzj());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getTransparency() {
        try {
            return this.zza.zzf();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getWidth() {
        try {
            return this.zza.zzg();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getZIndex() {
        try {
            return this.zza.zzh();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.zza.zzi();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isClickable() {
        try {
            return this.zza.zzA();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isVisible() {
        try {
            return this.zza.zzB();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setImage(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        try {
            this.zza.zzs(bitmapDescriptor.zza());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            this.zza.zzn();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setBearing(float f) {
        try {
            this.zza.zzo(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.zza.zzp(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setDimensions(float f) {
        try {
            this.zza.zzq(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setPosition(com.google.android.gms.maps.model.LatLng latLng) {
        try {
            this.zza.zzt(latLng);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setPositionFromBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        try {
            this.zza.zzu(latLngBounds);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setTag(java.lang.Object obj) {
        try {
            this.zza.zzv(com.google.android.gms.dynamic.ObjectWrapper.wrap(obj));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setTransparency(float f) {
        try {
            this.zza.zzw(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.zza.zzx(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            this.zza.zzy(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setDimensions(float f, float f2) {
        try {
            this.zza.zzr(f, f2);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
