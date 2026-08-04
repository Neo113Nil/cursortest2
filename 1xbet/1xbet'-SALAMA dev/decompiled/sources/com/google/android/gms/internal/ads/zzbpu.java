package com.google.android.gms.internal.ads;

import A1.Q;
import F2.InterfaceC0238k0;
import F2.T0;
import J2.j;
import L2.s;
import O2.f;
import android.location.Location;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p167y2.A;

/* JADX INFO: loaded from: classes.dex */
public final class zzbpu implements s {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbey zzg;
    private final boolean zzi;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbpu(Date date, int i7, Set set, Location location, boolean z4, int i8, zzbey zzbeyVar, List list, boolean z7, int i9, String str) {
        this.zza = date;
        this.zzb = i7;
        this.zzc = set;
        this.zze = location;
        this.zzd = z4;
        this.zzf = i8;
        this.zzg = zzbeyVar;
        this.zzi = z7;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.zzj.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.zzj.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        float fZze;
        T0 t0E = T0.e();
        synchronized (t0E.f2638e) {
            InterfaceC0238k0 interfaceC0238k0 = t0E.f2639f;
            fZze = 1.0f;
            if (interfaceC0238k0 != null) {
                try {
                    fZze = interfaceC0238k0.zze();
                } catch (RemoteException e7) {
                    j.e("Unable to get app volume.", e7);
                }
            }
        }
        return fZze;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // L2.d
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // L2.s
    public final B2.b getNativeAdOptions() {
        Parcelable.Creator<zzbey> creator = zzbey.CREATOR;
        Q q7 = new Q();
        zzbey zzbeyVar = this.zzg;
        if (zzbeyVar == null) {
            return new B2.b(q7);
        }
        int i7 = zzbeyVar.zza;
        if (i7 == 2) {
            q7.f197e = zzbeyVar.zze;
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    q7.f198f = zzbeyVar.zzg;
                    q7.f195c = zzbeyVar.zzh;
                }
            }
            com.google.android.gms.ads.internal.client.zzfx zzfxVar = zzbeyVar.zzf;
            if (zzfxVar != null) {
                q7.f199g = new A(zzfxVar);
            }
            q7.f197e = zzbeyVar.zze;
        }
        q7.f193a = zzbeyVar.zzb;
        q7.f194b = zzbeyVar.zzc;
        q7.f196d = zzbeyVar.zzd;
        return new B2.b(q7);
    }

    @Override // L2.s
    public final f getNativeAdRequestOptions() {
        return zzbey.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        boolean zZzv;
        T0 t0E = T0.e();
        synchronized (t0E.f2638e) {
            InterfaceC0238k0 interfaceC0238k0 = t0E.f2639f;
            zZzv = false;
            if (interfaceC0238k0 != null) {
                try {
                    zZzv = interfaceC0238k0.zzv();
                } catch (RemoteException e7) {
                    j.e("Unable to get app mute state.", e7);
                }
            }
        }
        return zZzv;
    }

    @Override // L2.d
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // L2.d
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // L2.s
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // L2.d
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // L2.s
    public final Map zza() {
        return this.zzj;
    }

    @Override // L2.s
    public final boolean zzb() {
        return this.zzh.contains("3");
    }
}
