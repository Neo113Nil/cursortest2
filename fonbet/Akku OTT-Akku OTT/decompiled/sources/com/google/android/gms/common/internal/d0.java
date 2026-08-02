package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.internal.AbstractC0861c;

/* loaded from: classes4.dex */
public final class d0 extends O {

    @Nullable
    public final IBinder g;
    public final /* synthetic */ AbstractC0861c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public d0(AbstractC0861c abstractC0861c, @Nullable int i, @Nullable IBinder iBinder, Bundle bundle) {
        super(abstractC0861c, i, bundle);
        this.h = abstractC0861c;
        this.g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.O
    public final void c(C0852b c0852b) {
        AbstractC0861c abstractC0861c = this.h;
        if (abstractC0861c.zzx != null) {
            abstractC0861c.zzx.onConnectionFailed(c0852b);
        }
        abstractC0861c.onConnectionFailed(c0852b);
    }

    @Override // com.google.android.gms.common.internal.O
    public final boolean d() {
        String interfaceDescriptor;
        AbstractC0861c abstractC0861c;
        AbstractC0861c.a aVar;
        AbstractC0861c.a aVar2;
        IBinder iBinder = this.g;
        try {
            C0875q.g(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            abstractC0861c = this.h;
        } catch (RemoteException unused) {
        }
        if (!abstractC0861c.getServiceDescriptor().equals(interfaceDescriptor)) {
            abstractC0861c.getServiceDescriptor();
            return false;
        }
        IInterface createServiceInterface = abstractC0861c.createServiceInterface(iBinder);
        if (createServiceInterface != null && (AbstractC0861c.zzn(abstractC0861c, 2, 4, createServiceInterface) || AbstractC0861c.zzn(abstractC0861c, 3, 4, createServiceInterface))) {
            abstractC0861c.zzC = null;
            Bundle connectionHint = abstractC0861c.getConnectionHint();
            aVar = abstractC0861c.zzw;
            if (aVar == null) {
                return true;
            }
            aVar2 = abstractC0861c.zzw;
            aVar2.onConnected(connectionHint);
            return true;
        }
        return false;
    }
}
