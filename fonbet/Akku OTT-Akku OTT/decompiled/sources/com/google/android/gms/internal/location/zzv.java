package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.C0838l;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.location.InterfaceC0928g;

/* loaded from: classes4.dex */
final class zzv extends zzx {
    final /* synthetic */ InterfaceC0928g zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(zzz zzzVar, h hVar, InterfaceC0928g interfaceC0928g) {
        super(hVar);
        this.zza = interfaceC0928g;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0830d
    public final void doExecute(zzaz zzazVar) throws RemoteException {
        InterfaceC0928g interfaceC0928g = this.zza;
        String simpleName = InterfaceC0928g.class.getSimpleName();
        C0875q.h(interfaceC0928g, "Listener must not be null");
        C0875q.e(simpleName, "Listener type must not be empty");
        zzazVar.zzF(new C0838l.a<>(interfaceC0928g, simpleName), new zzy(this));
    }
}
