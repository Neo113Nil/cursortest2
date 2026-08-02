package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.C0838l;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.location.AbstractC0927f;

/* loaded from: classes4.dex */
final class zzn extends zzx {
    final /* synthetic */ AbstractC0927f zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(zzz zzzVar, h hVar, AbstractC0927f abstractC0927f) {
        super(hVar);
        this.zza = abstractC0927f;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0830d
    public final void doExecute(zzaz zzazVar) throws RemoteException {
        AbstractC0927f abstractC0927f = this.zza;
        String simpleName = AbstractC0927f.class.getSimpleName();
        C0875q.h(abstractC0927f, "Listener must not be null");
        C0875q.e(simpleName, "Listener type must not be empty");
        zzazVar.zzH(new C0838l.a<>(abstractC0927f, simpleName), new zzy(this));
    }
}
