package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzcda;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public interface zzch extends IInterface {
    void zze(List list, zzcb zzcbVar) throws RemoteException;

    boolean zzf(String str) throws RemoteException;

    zzcda zzg(String str) throws RemoteException;

    boolean zzh(String str) throws RemoteException;

    zzbgz zzi(String str) throws RemoteException;

    boolean zzj(String str) throws RemoteException;

    zzbu zzk(String str) throws RemoteException;

    void zzl(zzbvu zzbvuVar) throws RemoteException;

    boolean zzm(String str, zzfp zzfpVar, zzce zzceVar) throws RemoteException;

    boolean zzn(int i, String str) throws RemoteException;

    zzbu zzo(String str) throws RemoteException;

    zzbgz zzp(String str) throws RemoteException;

    zzcda zzq(String str) throws RemoteException;

    zzfp zzr(int i, String str) throws RemoteException;

    Bundle zzs(int i) throws RemoteException;

    int zzt(int i, String str) throws RemoteException;

    boolean zzu(int i, String str) throws RemoteException;

    void zzv(int i) throws RemoteException;
}
