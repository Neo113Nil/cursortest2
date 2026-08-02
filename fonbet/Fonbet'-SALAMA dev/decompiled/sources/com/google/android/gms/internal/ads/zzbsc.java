package com.google.android.gms.internal.ads;

import F2.X0;
import O2.g;
import O2.j;
import android.os.RemoteException;
import java.util.List;
import y2.o;

/* loaded from: classes.dex */
public final class zzbsc implements j {
    private final zzbgd zza;
    private g zzb;

    public zzbsc(zzbgd zzbgdVar) {
        this.zza = zzbgdVar;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e7) {
            J2.j.e("", e7);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e7) {
            J2.j.e("", e7);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e7) {
            J2.j.e("", e7);
            return null;
        }
    }

    public final g getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null && this.zza.zzq()) {
                this.zzb = new zzbrv(this.zza);
            }
        } catch (RemoteException e7) {
            J2.j.e("", e7);
        }
        return this.zzb;
    }

    public final O2.b getImage(String str) {
        try {
            zzbfj zzg = this.zza.zzg(str);
            if (zzg != null) {
                return new zzbrw(zzg);
            }
            return null;
        } catch (RemoteException e7) {
            J2.j.e("", e7);
            return null;
        }
    }

    public final o getMediaContent() {
        try {
            if (this.zza.zzf() != null) {
                return new X0(this.zza.zzf(), this.zza);
            }
            return null;
        } catch (RemoteException e7) {
            J2.j.e("", e7);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e7) {
            J2.j.e("", e7);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e7) {
            J2.j.e("", e7);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e7) {
            J2.j.e("", e7);
        }
    }
}
