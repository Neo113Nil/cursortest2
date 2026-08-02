package com.google.android.gms.internal.ads;

import E2.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.InterfaceC0850b;
import com.google.android.gms.common.internal.InterfaceC0851c;

/* loaded from: classes.dex */
public final class zzfnh extends c {
    private final int zze;

    public zzfnh(Context context, Looper looper, InterfaceC0850b interfaceC0850b, InterfaceC0851c interfaceC0851c, int i7) {
        super(context, looper, interfaceC0850b, interfaceC0851c, 116);
        this.zze = i7;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof zzfnm ? (zzfnm) queryLocalInterface : new zzfnm(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final int getMinApkVersion() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public final zzfnm zzp() {
        return (zzfnm) getService();
    }
}
