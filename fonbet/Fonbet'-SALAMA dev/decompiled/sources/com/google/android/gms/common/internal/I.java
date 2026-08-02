package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class I extends A {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f11261g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0854f f11262h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC0854f abstractC0854f, int i7, IBinder iBinder, Bundle bundle) {
        super(abstractC0854f, i7, bundle);
        this.f11262h = abstractC0854f;
        this.f11261g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.A
    public final void a(ConnectionResult connectionResult) {
        InterfaceC0851c interfaceC0851c;
        InterfaceC0851c interfaceC0851c2;
        AbstractC0854f abstractC0854f = this.f11262h;
        interfaceC0851c = abstractC0854f.zzx;
        if (interfaceC0851c != null) {
            interfaceC0851c2 = abstractC0854f.zzx;
            interfaceC0851c2.onConnectionFailed(connectionResult);
        }
        abstractC0854f.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.A
    public final boolean b() {
        InterfaceC0850b interfaceC0850b;
        InterfaceC0850b interfaceC0850b2;
        IBinder iBinder = this.f11261g;
        try {
            D.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0854f abstractC0854f = this.f11262h;
            if (!abstractC0854f.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + abstractC0854f.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = abstractC0854f.createServiceInterface(iBinder);
            if (createServiceInterface == null || !(AbstractC0854f.zzn(abstractC0854f, 2, 4, createServiceInterface) || AbstractC0854f.zzn(abstractC0854f, 3, 4, createServiceInterface))) {
                return false;
            }
            abstractC0854f.zzB = null;
            Bundle connectionHint = abstractC0854f.getConnectionHint();
            interfaceC0850b = abstractC0854f.zzw;
            if (interfaceC0850b == null) {
                return true;
            }
            interfaceC0850b2 = abstractC0854f.zzw;
            interfaceC0850b2.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
