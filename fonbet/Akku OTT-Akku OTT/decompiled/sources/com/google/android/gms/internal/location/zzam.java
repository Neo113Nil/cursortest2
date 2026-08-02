package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.InterfaceC0834h;
import com.google.android.gms.location.C0924c;
import com.google.android.gms.location.C0926e;
import com.google.android.gms.location.C0930i;
import com.google.android.gms.location.C0933l;
import com.google.android.gms.location.K;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: classes4.dex */
public interface zzam extends IInterface {
    void zzd(C0926e c0926e, PendingIntent pendingIntent, zzak zzakVar) throws RemoteException;

    void zze(PendingIntent pendingIntent, zzak zzakVar, String str) throws RemoteException;

    void zzf(String[] strArr, zzak zzakVar, String str) throws RemoteException;

    void zzg(K k, zzak zzakVar) throws RemoteException;

    void zzh(long j, boolean z, PendingIntent pendingIntent) throws RemoteException;

    void zzi(C0924c c0924c, PendingIntent pendingIntent, InterfaceC0834h interfaceC0834h) throws RemoteException;

    void zzj(PendingIntent pendingIntent, InterfaceC0834h interfaceC0834h) throws RemoteException;

    void zzk(PendingIntent pendingIntent) throws RemoteException;

    void zzl(PendingIntent pendingIntent, InterfaceC0834h interfaceC0834h) throws RemoteException;

    @Deprecated
    Location zzm() throws RemoteException;

    Location zzn(@Nullable String str) throws RemoteException;

    void zzo(zzbc zzbcVar) throws RemoteException;

    void zzp(boolean z) throws RemoteException;

    void zzq(Location location) throws RemoteException;

    void zzr(zzai zzaiVar) throws RemoteException;

    LocationAvailability zzs(String str) throws RemoteException;

    void zzt(C0930i c0930i, zzao zzaoVar, String str) throws RemoteException;

    void zzu(zzl zzlVar) throws RemoteException;

    void zzv(PendingIntent pendingIntent, @Nullable C0933l c0933l, InterfaceC0834h interfaceC0834h) throws RemoteException;
}
