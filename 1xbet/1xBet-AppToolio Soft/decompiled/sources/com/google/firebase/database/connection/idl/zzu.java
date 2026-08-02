package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzu extends com.google.android.gms.internal.firebase_database.zzb implements zzt {
    public zzu() {
        super("com.google.firebase.database.connection.idl.IPersistentConnection");
    }

    public static zzt asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IPersistentConnection");
        return queryLocalInterface instanceof zzt ? (zzt) queryLocalInterface : new zzv(iBinder);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzk zzmVar;
        zzq zzsVar;
        zzw zzwVar = null;
        zzah zzahVar = null;
        zzah zzahVar2 = null;
        zzah zzahVar3 = null;
        zzah zzahVar4 = null;
        zzah zzahVar5 = null;
        zzah zzahVar6 = null;
        zzah zzajVar = null;
        switch (i) {
            case 1:
                zzc zzcVar = (zzc) com.google.android.gms.internal.firebase_database.zzc.zza(parcel, zzc.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzmVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IConnectionAuthTokenProvider");
                    zzmVar = queryLocalInterface instanceof zzk ? (zzk) queryLocalInterface : new zzm(readStrongBinder);
                }
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
                    zzwVar = queryLocalInterface2 instanceof zzw ? (zzw) queryLocalInterface2 : new zzy(readStrongBinder2);
                }
                setup(zzcVar, zzmVar, asInterface, zzwVar);
                break;
            case 2:
                initialize();
                break;
            case 3:
                shutdown();
                break;
            case 4:
                refreshAuthToken();
                break;
            case 5:
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    zzsVar = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.firebase.database.connection.idl.IListenHashProvider");
                    zzsVar = queryLocalInterface3 instanceof zzq ? (zzq) queryLocalInterface3 : new zzs(readStrongBinder3);
                }
                long readLong = parcel.readLong();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    zzajVar = queryLocalInterface4 instanceof zzah ? (zzah) queryLocalInterface4 : new zzaj(readStrongBinder4);
                }
                listen(createStringArrayList, asInterface2, zzsVar, readLong, zzajVar);
                break;
            case 6:
                unlisten(parcel.createStringArrayList(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 7:
                purgeOutstandingWrites();
                break;
            case 8:
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    zzahVar6 = queryLocalInterface5 instanceof zzah ? (zzah) queryLocalInterface5 : new zzaj(readStrongBinder5);
                }
                put(createStringArrayList2, asInterface3, zzahVar6);
                break;
            case 9:
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    zzahVar5 = queryLocalInterface6 instanceof zzah ? (zzah) queryLocalInterface6 : new zzaj(readStrongBinder6);
                }
                compareAndPut(createStringArrayList3, asInterface4, readString, zzahVar5);
                break;
            case 10:
                ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    zzahVar4 = queryLocalInterface7 instanceof zzah ? (zzah) queryLocalInterface7 : new zzaj(readStrongBinder7);
                }
                merge(createStringArrayList4, asInterface5, zzahVar4);
                break;
            case 11:
                ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    zzahVar3 = queryLocalInterface8 instanceof zzah ? (zzah) queryLocalInterface8 : new zzaj(readStrongBinder8);
                }
                onDisconnectPut(createStringArrayList5, asInterface6, zzahVar3);
                break;
            case 12:
                ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    zzahVar2 = queryLocalInterface9 instanceof zzah ? (zzah) queryLocalInterface9 : new zzaj(readStrongBinder9);
                }
                onDisconnectMerge(createStringArrayList6, asInterface7, zzahVar2);
                break;
            case 13:
                ArrayList<String> createStringArrayList7 = parcel.createStringArrayList();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.firebase.database.connection.idl.IRequestResultCallback");
                    zzahVar = queryLocalInterface10 instanceof zzah ? (zzah) queryLocalInterface10 : new zzaj(readStrongBinder10);
                }
                onDisconnectCancel(createStringArrayList7, zzahVar);
                break;
            case 14:
                interrupt(parcel.readString());
                break;
            case 15:
                resume(parcel.readString());
                break;
            case 16:
                boolean isInterrupted = isInterrupted(parcel.readString());
                parcel2.writeNoException();
                com.google.android.gms.internal.firebase_database.zzc.writeBoolean(parcel2, isInterrupted);
                return true;
            case 17:
                refreshAuthToken2(parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
