package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
public interface zzh extends IInterface {
    void zzc(String str, String str2, Bundle bundle, zzj zzjVar) throws RemoteException;

    void zzd(Bundle bundle, zzj zzjVar) throws RemoteException;

    void zze(String str, List list, zzl zzlVar) throws RemoteException;

    void zzf(String str, String str2, String str3, Bundle bundle, zzj zzjVar) throws RemoteException;
}
