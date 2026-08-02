package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public class Marker {
    protected final com.google.android.gms.internal.maps.zzaj zza;

    public Marker(com.google.android.gms.internal.maps.zzaj zzajVar) {
        this.zza = (com.google.android.gms.internal.maps.zzaj) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzajVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.maps.model.Marker)) {
            return false;
        }
        try {
            return this.zza.zzE(((com.google.android.gms.maps.model.Marker) obj).zza);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public float getAlpha() {
        try {
            return this.zza.zzd();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public java.lang.String getId() {
        try {
            return this.zza.zzk();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.gms.maps.model.LatLng getPosition() {
        try {
            return this.zza.zzj();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public float getRotation() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public java.lang.String getSnippet() {
        try {
            return this.zza.zzl();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public java.lang.Object getTag() {
        try {
            return com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zza.zzi());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public java.lang.String getTitle() {
        try {
            return this.zza.zzm();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public float getZIndex() {
        try {
            return this.zza.zzf();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzg();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isDraggable() {
        try {
            return this.zza.zzF();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isFlat() {
        try {
            return this.zza.zzG();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isInfoWindowShown() {
        try {
            return this.zza.zzH();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzI();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setIcon(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        try {
            if (bitmapDescriptor == null) {
                this.zza.zzt(null);
            } else {
                this.zza.zzt(bitmapDescriptor.zza());
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void hideInfoWindow() {
        try {
            this.zza.zzn();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void remove() {
        try {
            this.zza.zzo();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setAlpha(float f) {
        try {
            this.zza.zzp(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setAnchor(float f, float f2) {
        try {
            this.zza.zzq(f, f2);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setDraggable(boolean z) {
        try {
            this.zza.zzr(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setFlat(boolean z) {
        try {
            this.zza.zzs(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setInfoWindowAnchor(float f, float f2) {
        try {
            this.zza.zzv(f, f2);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setRotation(float f) {
        try {
            this.zza.zzx(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setSnippet(java.lang.String str) {
        try {
            this.zza.zzy(str);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setTag(java.lang.Object obj) {
        try {
            this.zza.zzz(com.google.android.gms.dynamic.ObjectWrapper.wrap(obj));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setTitle(java.lang.String str) {
        try {
            this.zza.zzA(str);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setVisible(boolean z) {
        try {
            this.zza.zzB(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setZIndex(float f) {
        try {
            this.zza.zzC(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void showInfoWindow() {
        try {
            this.zza.zzD();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(com.google.android.gms.maps.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.zza.zzw(latLng);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
