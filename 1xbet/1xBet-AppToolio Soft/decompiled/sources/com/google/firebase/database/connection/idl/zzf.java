package com.google.firebase.database.connection.idl;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.firebase_database.zzbb;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzf implements com.google.android.gms.internal.firebase_database.zzaj {
    private final zzt zzfp;

    private zzf(zzt zztVar) {
        this.zzfp = zztVar;
    }

    private static zzah zza(zzbb zzbbVar) {
        return new zzh(zzbbVar);
    }

    public static zzf zza(Context context, zzc zzcVar, com.google.android.gms.internal.firebase_database.zzaf zzafVar, com.google.android.gms.internal.firebase_database.zzak zzakVar) {
        return new zzf(IPersistentConnectionImpl.loadDynamic(context, zzcVar, zzafVar.zzr(), zzafVar.zzs(), zzakVar));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void initialize() {
        try {
            this.zzfp.initialize();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void interrupt(String str) {
        try {
            this.zzfp.interrupt(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final boolean isInterrupted(String str) {
        try {
            return this.zzfp.isInterrupted(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void purgeOutstandingWrites() {
        try {
            this.zzfp.purgeOutstandingWrites();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void refreshAuthToken() {
        try {
            this.zzfp.refreshAuthToken();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void resume(String str) {
        try {
            this.zzfp.resume(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void shutdown() {
        try {
            this.zzfp.shutdown();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, zzbb zzbbVar) {
        try {
            this.zzfp.onDisconnectCancel(list, zza(zzbbVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, Object obj, zzbb zzbbVar) {
        try {
            this.zzfp.put(list, ObjectWrapper.wrap(obj), zza(zzbbVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, Object obj, String str, zzbb zzbbVar) {
        try {
            this.zzfp.compareAndPut(list, ObjectWrapper.wrap(obj), str, zza(zzbbVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, Map<String, Object> map) {
        try {
            this.zzfp.unlisten(list, ObjectWrapper.wrap(map));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, Map<String, Object> map, com.google.android.gms.internal.firebase_database.zzai zzaiVar, Long l, zzbb zzbbVar) {
        long longValue;
        zzg zzgVar = new zzg(this, zzaiVar);
        if (l != null) {
            try {
                longValue = l.longValue();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            longValue = -1;
        }
        this.zzfp.listen(list, ObjectWrapper.wrap(map), zzgVar, longValue, zza(zzbbVar));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zza(List<String> list, Map<String, Object> map, zzbb zzbbVar) {
        try {
            this.zzfp.merge(list, ObjectWrapper.wrap(map), zza(zzbbVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zzb(List<String> list, Object obj, zzbb zzbbVar) {
        try {
            this.zzfp.onDisconnectPut(list, ObjectWrapper.wrap(obj), zza(zzbbVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zzb(List<String> list, Map<String, Object> map, zzbb zzbbVar) {
        try {
            this.zzfp.onDisconnectMerge(list, ObjectWrapper.wrap(map), zza(zzbbVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzaj
    public final void zzh(String str) {
        try {
            this.zzfp.refreshAuthToken2(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
