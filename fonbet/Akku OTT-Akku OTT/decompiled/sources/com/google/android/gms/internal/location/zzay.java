package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC0831e;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.location.C0931j;

/* loaded from: classes4.dex */
final class zzay extends zzan {
    private InterfaceC0831e<C0931j> zza;

    public zzay(InterfaceC0831e<C0931j> interfaceC0831e) {
        C0875q.b(interfaceC0831e != null, "listener can't be null.");
        this.zza = interfaceC0831e;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(C0931j c0931j) throws RemoteException {
        this.zza.setResult(c0931j);
        this.zza = null;
    }
}
