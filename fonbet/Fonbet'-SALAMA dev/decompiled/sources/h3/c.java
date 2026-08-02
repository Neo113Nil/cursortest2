package h3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.InterfaceC0830g;
import com.google.android.gms.common.api.internal.InterfaceC0839p;
import com.google.android.gms.common.internal.AbstractC0857i;
import com.google.android.gms.common.internal.C0856h;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.base.zaf;

/* loaded from: classes.dex */
public final class c extends AbstractC0857i {

    /* renamed from: a, reason: collision with root package name */
    public final q f13528a;

    public c(Context context, Looper looper, C0856h c0856h, q qVar, InterfaceC0830g interfaceC0830g, InterfaceC0839p interfaceC0839p) {
        super(context, looper, 270, c0856h, interfaceC0830g, interfaceC0839p);
        this.f13528a = qVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C1197a ? (C1197a) queryLocalInterface : new C1197a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Feature[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Bundle getGetServiceRequestExtraArgs() {
        this.f13528a.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
