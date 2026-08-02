package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public final class Polyline {
    private final com.google.android.gms.internal.maps.zzar zza;

    public Polyline(com.google.android.gms.internal.maps.zzar zzarVar) {
        this.zza = (com.google.android.gms.internal.maps.zzar) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzarVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.maps.model.Polyline)) {
            return false;
        }
        try {
            return this.zza.zzD(((com.google.android.gms.maps.model.Polyline) obj).zza);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getColor() {
        try {
            return this.zza.zzf();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.Cap getEndCap() {
        try {
            return this.zza.zzj().zza();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.lang.String getId() {
        try {
            return this.zza.zzl();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getJointType() {
        try {
            return this.zza.zzg();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.util.List<com.google.android.gms.maps.model.PatternItem> getPattern() {
        try {
            return com.google.android.gms.maps.model.PatternItem.zza(this.zza.zzm());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.util.List<com.google.android.gms.maps.model.LatLng> getPoints() {
        try {
            return this.zza.zzn();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.util.List<com.google.android.gms.maps.model.StyleSpan> getSpans() {
        try {
            return this.zza.zzo();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.Cap getStartCap() {
        try {
            return this.zza.zzk().zza();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.lang.Object getTag() {
        try {
            return com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zza.zzi());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getWidth() {
        try {
            return this.zza.zzd();
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
            return this.zza.zzh();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isClickable() {
        try {
            return this.zza.zzE();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isGeodesic() {
        try {
            return this.zza.zzF();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isVisible() {
        try {
            return this.zza.zzG();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setEndCap(com.google.android.gms.maps.model.Cap cap) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(cap, "endCap must not be null");
        try {
            this.zza.zzs(cap);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setPoints(java.util.List<com.google.android.gms.maps.model.LatLng> list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "points must not be null");
        try {
            this.zza.zzw(list);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setStartCap(com.google.android.gms.maps.model.Cap cap) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(cap, "startCap must not be null");
        try {
            this.zza.zzy(cap);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void remove() {
        try {
            this.zza.zzp();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setClickable(boolean z) {
        try {
            this.zza.zzq(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setColor(int i) {
        try {
            this.zza.zzr(i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setGeodesic(boolean z) {
        try {
            this.zza.zzt(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setJointType(int i) {
        try {
            this.zza.zzu(i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setPattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) {
        try {
            this.zza.zzv(list);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setSpans(java.util.List<com.google.android.gms.maps.model.StyleSpan> list) {
        try {
            this.zza.zzx(list);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setTag(java.lang.Object obj) {
        try {
            this.zza.zzz(com.google.android.gms.dynamic.ObjectWrapper.wrap(obj));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setVisible(boolean z) {
        try {
            this.zza.zzA(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setWidth(float f) {
        try {
            this.zza.zzB(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            this.zza.zzC(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
