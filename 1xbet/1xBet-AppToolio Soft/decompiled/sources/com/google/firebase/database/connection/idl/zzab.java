package com.google.firebase.database.connection.idl;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzab extends zzx {
    private final /* synthetic */ com.google.android.gms.internal.firebase_database.zzak zzfv;

    zzab(com.google.android.gms.internal.firebase_database.zzak zzakVar) {
        this.zzfv = zzakVar;
    }

    @Override // com.google.firebase.database.connection.idl.zzw
    public final void onDisconnect() {
        this.zzfv.onDisconnect();
    }

    @Override // com.google.firebase.database.connection.idl.zzw
    public final void zza(IObjectWrapper iObjectWrapper) {
        this.zzfv.zzc((Map) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.firebase.database.connection.idl.zzw
    public final void zza(List<String> list, IObjectWrapper iObjectWrapper, boolean z, long j) {
        Long zzf;
        com.google.android.gms.internal.firebase_database.zzak zzakVar = this.zzfv;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        zzf = IPersistentConnectionImpl.zzf(j);
        zzakVar.zza(list, unwrap, z, zzf);
    }

    @Override // com.google.firebase.database.connection.idl.zzw
    public final void zza(List<String> list, List<zzak> list2, IObjectWrapper iObjectWrapper, long j) {
        Long zzf;
        List list3 = (List) ObjectWrapper.unwrap(iObjectWrapper);
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i = 0; i < list2.size(); i++) {
            arrayList.add(zzak.zza(list2.get(i), list3.get(i)));
        }
        com.google.android.gms.internal.firebase_database.zzak zzakVar = this.zzfv;
        zzf = IPersistentConnectionImpl.zzf(j);
        zzakVar.zza(list, arrayList, zzf);
    }

    @Override // com.google.firebase.database.connection.idl.zzw
    public final void zzaa() {
        this.zzfv.zzaa();
    }

    @Override // com.google.firebase.database.connection.idl.zzw
    public final void zzb(boolean z) {
        this.zzfv.zzb(z);
    }
}
