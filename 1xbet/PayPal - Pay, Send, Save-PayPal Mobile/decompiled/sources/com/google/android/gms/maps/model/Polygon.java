package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public final class Polygon {
    private final com.google.android.gms.internal.maps.zzao zza;

    public Polygon(com.google.android.gms.internal.maps.zzao zzaoVar) {
        this.zza = (com.google.android.gms.internal.maps.zzao) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaoVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.maps.model.Polygon)) {
            return false;
        }
        try {
            return this.zza.zzB(((com.google.android.gms.maps.model.Polygon) obj).zza);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getFillColor() {
        try {
            return this.zza.zzf();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> getHoles() {
        try {
            return this.zza.zzl();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.lang.String getId() {
        try {
            return this.zza.zzk();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.util.List<com.google.android.gms.maps.model.LatLng> getPoints() {
        try {
            return this.zza.zzm();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getStrokeColor() {
        try {
            return this.zza.zzg();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getStrokeJointType() {
        try {
            return this.zza.zzh();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.util.List<com.google.android.gms.maps.model.PatternItem> getStrokePattern() {
        try {
            return com.google.android.gms.maps.model.PatternItem.zza(this.zza.zzn());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getStrokeWidth() {
        try {
            return this.zza.zzd();
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

    public final float getZIndex() {
        try {
            return this.zza.zze();
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
            return this.zza.zzC();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isGeodesic() {
        try {
            return this.zza.zzD();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isVisible() {
        try {
            return this.zza.zzE();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setPoints(java.util.List<com.google.android.gms.maps.model.LatLng> list) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "points must not be null.");
            this.zza.zzt(list);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            this.zza.zzo();
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

    public final void setFillColor(int i) {
        try {
            this.zza.zzq(i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setGeodesic(boolean z) {
        try {
            this.zza.zzr(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setHoles(java.util.List<? extends java.util.List<com.google.android.gms.maps.model.LatLng>> list) {
        try {
            this.zza.zzs(list);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setStrokeColor(int i) {
        try {
            this.zza.zzu(i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setStrokeJointType(int i) {
        try {
            this.zza.zzv(i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setStrokePattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) {
        try {
            this.zza.zzw(list);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setStrokeWidth(float f) {
        try {
            this.zza.zzx(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setTag(java.lang.Object obj) {
        try {
            this.zza.zzy(com.google.android.gms.dynamic.ObjectWrapper.wrap(obj));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.zza.zzz(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            this.zza.zzA(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
