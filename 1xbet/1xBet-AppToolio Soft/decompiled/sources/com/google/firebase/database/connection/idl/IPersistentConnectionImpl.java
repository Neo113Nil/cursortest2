package com.google.firebase.database.connection.idl;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.firebase_database.ModuleDescriptor;
import com.google.android.gms.internal.firebase_database.zzbb;
import com.google.android.gms.internal.firebase_database.zzhw;
import com.google.android.gms.internal.firebase_database.zzib;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

@DynamiteApi
/* loaded from: classes.dex */
public class IPersistentConnectionImpl extends zzu {
    private com.google.android.gms.internal.firebase_database.zzaj zzfs;

    public static zzt loadDynamic(Context context, zzc zzcVar, com.google.android.gms.internal.firebase_database.zzad zzadVar, ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.firebase_database.zzak zzakVar) {
        try {
            zzt asInterface = zzu.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION, ModuleDescriptor.MODULE_ID).instantiate("com.google.firebase.database.connection.idl.IPersistentConnectionImpl"));
            asInterface.setup(zzcVar, new zzad(zzadVar), ObjectWrapper.wrap(scheduledExecutorService), new zzab(zzakVar));
            return asInterface;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long zza(Long l) {
        if (l == null) {
            return -1L;
        }
        if (l.longValue() != -1) {
            return l.longValue();
        }
        throw new IllegalArgumentException("Tag parameter clashed with NO_TAG value");
    }

    private static zzbb zza(zzah zzahVar) {
        return new zzaa(zzahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Long zzf(long j) {
        if (j == -1) {
            return null;
        }
        return Long.valueOf(j);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void compareAndPut(List<String> list, IObjectWrapper iObjectWrapper, String str, zzah zzahVar) {
        this.zzfs.zza(list, ObjectWrapper.unwrap(iObjectWrapper), str, zza(zzahVar));
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void initialize() {
        this.zzfs.initialize();
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void interrupt(String str) {
        this.zzfs.interrupt(str);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public boolean isInterrupted(String str) {
        return this.zzfs.isInterrupted(str);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void listen(List<String> list, IObjectWrapper iObjectWrapper, zzq zzqVar, long j, zzah zzahVar) {
        Long zzf = zzf(j);
        this.zzfs.zza(list, (Map) ObjectWrapper.unwrap(iObjectWrapper), new zzz(this, zzqVar), zzf, zza(zzahVar));
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void merge(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) {
        this.zzfs.zza(list, (Map<String, Object>) ObjectWrapper.unwrap(iObjectWrapper), zza(zzahVar));
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void onDisconnectCancel(List<String> list, zzah zzahVar) {
        this.zzfs.zza(list, zza(zzahVar));
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void onDisconnectMerge(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) {
        this.zzfs.zzb(list, (Map<String, Object>) ObjectWrapper.unwrap(iObjectWrapper), zza(zzahVar));
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void onDisconnectPut(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) {
        this.zzfs.zzb(list, ObjectWrapper.unwrap(iObjectWrapper), zza(zzahVar));
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void purgeOutstandingWrites() {
        this.zzfs.purgeOutstandingWrites();
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void put(List<String> list, IObjectWrapper iObjectWrapper, zzah zzahVar) {
        this.zzfs.zza(list, ObjectWrapper.unwrap(iObjectWrapper), zza(zzahVar));
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void refreshAuthToken() {
        this.zzfs.refreshAuthToken();
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void refreshAuthToken2(String str) {
        this.zzfs.zzh(str);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void resume(String str) {
        this.zzfs.resume(str);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void setup(zzc zzcVar, zzk zzkVar, IObjectWrapper iObjectWrapper, zzw zzwVar) {
        zzib zzibVar;
        com.google.android.gms.internal.firebase_database.zzah zza = zzi.zza(zzcVar.zzfk);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ObjectWrapper.unwrap(iObjectWrapper);
        zzac zzacVar = new zzac(zzwVar);
        switch (zzcVar.zzfl) {
            case 0:
            default:
                zzibVar = zzib.NONE;
                break;
            case 1:
                zzibVar = zzib.DEBUG;
                break;
            case 2:
                zzibVar = zzib.INFO;
                break;
            case 3:
                zzibVar = zzib.WARN;
                break;
            case 4:
                zzibVar = zzib.ERROR;
                break;
        }
        this.zzfs = new com.google.android.gms.internal.firebase_database.zzal(new com.google.android.gms.internal.firebase_database.zzaf(new zzhw(zzibVar, zzcVar.zzfm), new zzaf(zzkVar), scheduledExecutorService, zzcVar.zzcp, zzcVar.zzfn, zzcVar.zzcr, zzcVar.zzcs), zza, zzacVar);
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void shutdown() {
        this.zzfs.shutdown();
    }

    @Override // com.google.firebase.database.connection.idl.zzt
    public void unlisten(List<String> list, IObjectWrapper iObjectWrapper) {
        this.zzfs.zza(list, (Map<String, Object>) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
