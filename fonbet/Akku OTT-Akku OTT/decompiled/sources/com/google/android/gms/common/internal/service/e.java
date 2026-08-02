package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.internal.InterfaceC0832f;
import com.google.android.gms.common.api.internal.InterfaceC0841o;
import com.google.android.gms.common.internal.AbstractC0866h;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.common.internal.C0880w;
import com.google.android.gms.internal.base.zaf;

/* loaded from: classes4.dex */
public final class e extends AbstractC0866h {
    public final C0880w a;

    public e(Context context, Looper looper, C0863e c0863e, C0880w c0880w, InterfaceC0832f interfaceC0832f, InterfaceC0841o interfaceC0841o) {
        super(context, looper, 270, c0863e, interfaceC0832f, interfaceC0841o);
        this.a = c0880w;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @Nullable
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final C0854d[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final Bundle getGetServiceRequestExtraArgs() {
        C0880w c0880w = this.a;
        c0880w.getClass();
        Bundle bundle = new Bundle();
        String str = c0880w.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
