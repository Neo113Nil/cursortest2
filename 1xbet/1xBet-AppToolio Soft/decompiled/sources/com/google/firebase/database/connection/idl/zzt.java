package com.google.firebase.database.connection.idl;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public interface zzt extends IInterface {
    void compareAndPut(List<String> list, IObjectWrapper iObjectWrapper, String str, zzah zzahVar) throws RemoteException;

    void initialize() throws RemoteException;

    void interrupt(String str) throws RemoteException;

    boolean isInterrupted(String str) throws RemoteException;

    void listen(List<String> list, IObjectWrapper iObjectWrapper, zzq zzqVar, long j, zzah zzahVar) throws RemoteException;

    void merge(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) throws RemoteException;

    void onDisconnectCancel(List<String> list, zzah zzahVar) throws RemoteException;

    void onDisconnectMerge(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) throws RemoteException;

    void onDisconnectPut(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) throws RemoteException;

    void purgeOutstandingWrites() throws RemoteException;

    void put(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) throws RemoteException;

    void refreshAuthToken() throws RemoteException;

    void refreshAuthToken2(String str) throws RemoteException;

    void resume(String str) throws RemoteException;

    void setup(zzc zzcVar, zzk zzkVar, IObjectWrapper iObjectWrapper, zzw zzwVar) throws RemoteException;

    void shutdown() throws RemoteException;

    void unlisten(List<String> list, IObjectWrapper iObjectWrapper) throws RemoteException;
}
