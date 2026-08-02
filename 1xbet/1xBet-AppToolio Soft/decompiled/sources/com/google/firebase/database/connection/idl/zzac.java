package com.google.firebase.database.connection.idl;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.firebase_database.zzba;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzac implements com.google.android.gms.internal.firebase_database.zzak {
    private final /* synthetic */ zzw zzfw;

    zzac(zzw zzwVar) {
        this.zzfw = zzwVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void onDisconnect() {
        try {
            this.zzfw.onDisconnect();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void zza(List<String> list, Object obj, boolean z, Long l) {
        long zza;
        try {
            zzw zzwVar = this.zzfw;
            IObjectWrapper wrap = ObjectWrapper.wrap(obj);
            zza = IPersistentConnectionImpl.zza(l);
            zzwVar.zza(list, wrap, z, zza);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void zza(List<String> list, List<zzba> list2, Long l) {
        long zza;
        ArrayList arrayList = new ArrayList(list2.size());
        ArrayList arrayList2 = new ArrayList(list2.size());
        for (zzba zzbaVar : list2) {
            arrayList.add(new zzak(zzbaVar.zzap(), zzbaVar.zzaq()));
            arrayList2.add(zzbaVar.zzar());
        }
        try {
            zzw zzwVar = this.zzfw;
            IObjectWrapper wrap = ObjectWrapper.wrap(arrayList2);
            zza = IPersistentConnectionImpl.zza(l);
            zzwVar.zza(list, arrayList, wrap, zza);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void zzaa() {
        try {
            this.zzfw.zzaa();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void zzb(boolean z) {
        try {
            this.zzfw.zzb(z);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzak
    public final void zzc(Map<String, Object> map) {
        try {
            this.zzfw.zza(ObjectWrapper.wrap(map));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
