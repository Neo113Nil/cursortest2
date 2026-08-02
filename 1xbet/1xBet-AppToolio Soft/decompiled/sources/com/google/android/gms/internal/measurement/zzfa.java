package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public interface zzfa extends IInterface {
    List<zzka> zza(zzeb zzebVar, boolean z) throws RemoteException;

    List<zzef> zza(String str, String str2, zzeb zzebVar) throws RemoteException;

    List<zzka> zza(String str, String str2, String str3, boolean z) throws RemoteException;

    List<zzka> zza(String str, String str2, boolean z, zzeb zzebVar) throws RemoteException;

    void zza(long j, String str, String str2, String str3) throws RemoteException;

    void zza(zzeb zzebVar) throws RemoteException;

    void zza(zzef zzefVar, zzeb zzebVar) throws RemoteException;

    void zza(zzex zzexVar, zzeb zzebVar) throws RemoteException;

    void zza(zzex zzexVar, String str, String str2) throws RemoteException;

    void zza(zzka zzkaVar, zzeb zzebVar) throws RemoteException;

    byte[] zza(zzex zzexVar, String str) throws RemoteException;

    void zzb(zzeb zzebVar) throws RemoteException;

    void zzb(zzef zzefVar) throws RemoteException;

    String zzc(zzeb zzebVar) throws RemoteException;

    void zzd(zzeb zzebVar) throws RemoteException;

    List<zzef> zze(String str, String str2, String str3) throws RemoteException;
}
