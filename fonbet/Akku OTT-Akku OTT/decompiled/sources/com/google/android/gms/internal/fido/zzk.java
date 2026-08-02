package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.AbstractC0866h;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.fido.b;

/* loaded from: classes4.dex */
public final class zzk extends AbstractC0866h {
    public zzk(Context context, Looper looper, C0863e c0863e, h.a aVar, h.b bVar) {
        super(context, looper, 149, c0863e, aVar, bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        return queryLocalInterface instanceof zzn ? (zzn) queryLocalInterface : new zzn(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final C0854d[] getApiFeatures() {
        return new C0854d[]{b.b, b.c, b.d};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.privileged.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.privileged.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
