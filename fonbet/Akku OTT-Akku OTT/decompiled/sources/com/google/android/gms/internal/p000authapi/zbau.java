package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.identity.K;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.internal.InterfaceC0832f;
import com.google.android.gms.common.api.internal.InterfaceC0841o;
import com.google.android.gms.common.internal.AbstractC0866h;
import com.google.android.gms.common.internal.C0863e;

/* loaded from: classes4.dex */
public final class zbau extends AbstractC0866h {
    private final Bundle zba;

    public zbau(Context context, Looper looper, K k, C0863e c0863e, InterfaceC0832f interfaceC0832f, InterfaceC0841o interfaceC0841o) {
        super(context, looper, 212, c0863e, interfaceC0832f, interfaceC0841o);
        this.zba = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @Nullable
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof zbv ? (zbv) queryLocalInterface : new zbv(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final C0854d[] getApiFeatures() {
        return zbav.zbv;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
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
