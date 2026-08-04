package p055h3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.InterfaceC0786g;
import com.google.android.gms.common.api.internal.InterfaceC0795p;
import com.google.android.gms.common.internal.AbstractC0813i;
import com.google.android.gms.common.internal.C0812h;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.base.zaf;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0813i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f13534a;

    public c(Context context, Looper looper, C0812h c0812h, q qVar, InterfaceC0786g interfaceC0786g, InterfaceC0795p interfaceC0795p) {
        super(context, looper, 270, c0812h, interfaceC0786g, interfaceC0795p);
        this.f13534a = qVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Feature[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Bundle getGetServiceRequestExtraArgs() {
        this.f13534a.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
