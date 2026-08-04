package com.google.android.gms.internal.ads;

import F2.C0251r0;
import F2.InterfaceC0250q0;
import F2.V0;
import J2.j;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p167y2.y;

/* JADX INFO: loaded from: classes.dex */
public final class zzbhe {
    private final zzbhd zza;
    private final zzbfk zzc;
    private final List zzb = new ArrayList();
    private final y zzd = new y();
    private final List zze = new ArrayList();

    public zzbhe(zzbhd zzbhdVar) {
        zzbfj zzbfhVar;
        IBinder iBinder;
        this.zza = zzbhdVar;
        zzbfk zzbfkVar = null;
        try {
            List listZzu = zzbhdVar.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzbfhVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbfhVar = iInterfaceQueryLocalInterface instanceof zzbfj ? (zzbfj) iInterfaceQueryLocalInterface : new zzbfh(iBinder);
                    }
                    if (zzbfhVar != null) {
                        this.zzb.add(new zzbfk(zzbfhVar));
                    }
                }
            }
        } catch (RemoteException e7) {
            j.e("", e7);
        }
        try {
            List listZzv = this.zza.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    InterfaceC0250q0 interfaceC0250q0Z = obj2 instanceof IBinder ? V0.Z((IBinder) obj2) : null;
                    if (interfaceC0250q0Z != null) {
                        this.zze.add(new C0251r0(interfaceC0250q0Z));
                    }
                }
            }
        } catch (RemoteException e8) {
            j.e("", e8);
        }
        try {
            zzbfj zzbfjVarZzk = this.zza.zzk();
            if (zzbfjVarZzk != null) {
                zzbfkVar = new zzbfk(zzbfjVarZzk);
            }
        } catch (RemoteException e9) {
            j.e("", e9);
        }
        this.zzc = zzbfkVar;
        try {
            if (this.zza.zzi() != null) {
                new zzbfd(this.zza.zzi());
            }
        } catch (RemoteException e10) {
            j.e("", e10);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzJ(bundle);
        } catch (RemoteException e7) {
            j.e("", e7);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final y zza() {
        try {
            if (this.zza.zzh() != null) {
                this.zzd.a(this.zza.zzh());
            }
        } catch (RemoteException e7) {
            j.e("Exception occurred while getting video controller", e7);
        }
        return this.zzd;
    }

    public final B2.a zzb() {
        return this.zzc;
    }

    public final Double zzc() {
        try {
            double dZze = this.zza.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    public final Object zzd() {
        try {
            p105o3.a aVarZzl = this.zza.zzl();
            if (aVarZzl != null) {
                return p105o3.b.t0(aVarZzl);
            }
            return null;
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    public final String zze() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    public final String zzf() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    public final String zzg() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    public final String zzh() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    public final String zzi() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    public final String zzj() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    public final List zzk() {
        return this.zzb;
    }
}
