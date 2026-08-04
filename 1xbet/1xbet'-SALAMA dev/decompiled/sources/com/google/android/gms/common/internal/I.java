package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class I extends A {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f11261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0810f f11262h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC0810f abstractC0810f, int i7, IBinder iBinder, Bundle bundle) {
        super(abstractC0810f, i7, bundle);
        this.f11262h = abstractC0810f;
        this.f11261g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.A
    public final void a(ConnectionResult connectionResult) {
        AbstractC0810f abstractC0810f = this.f11262h;
        if (abstractC0810f.zzx != null) {
            abstractC0810f.zzx.onConnectionFailed(connectionResult);
        }
        abstractC0810f.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.A
    public final boolean b() {
        IBinder iBinder = this.f11261g;
        try {
            D.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0810f abstractC0810f = this.f11262h;
            if (!abstractC0810f.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + abstractC0810f.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = abstractC0810f.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(AbstractC0810f.zzn(abstractC0810f, 2, 4, iInterfaceCreateServiceInterface) || AbstractC0810f.zzn(abstractC0810f, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            abstractC0810f.zzB = null;
            Bundle connectionHint = abstractC0810f.getConnectionHint();
            if (abstractC0810f.zzw == null) {
                return true;
            }
            abstractC0810f.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
