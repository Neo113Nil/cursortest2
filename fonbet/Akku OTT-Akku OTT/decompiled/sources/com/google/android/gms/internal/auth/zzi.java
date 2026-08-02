package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.g;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.internal.InterfaceC0832f;
import com.google.android.gms.common.api.internal.InterfaceC0841o;
import com.google.android.gms.common.internal.AbstractC0866h;
import com.google.android.gms.common.internal.C0863e;

/* loaded from: classes4.dex */
final class zzi extends AbstractC0866h {
    public zzi(Context context, Looper looper, C0863e c0863e, InterfaceC0832f interfaceC0832f, InterfaceC0841o interfaceC0841o) {
        super(context, looper, 224, c0863e, interfaceC0832f, interfaceC0841o);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @Nullable
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzp(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final void disconnect(String str) {
        "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str));
        super.disconnect(str);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final C0854d[] getApiFeatures() {
        return new C0854d[]{g.c, g.b, g.a};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
