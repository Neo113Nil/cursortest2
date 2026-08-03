package p0;

/* renamed from: p0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0946A implements android.os.Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0.C0947B f8210a;

    public /* synthetic */ C0946A(p0.C0947B c0947b) {
        this.f8210a = c0947b;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f8210a.f8214a) {
                try {
                    p0.C0973y c0973y = (p0.C0973y) message.obj;
                    p0.ServiceConnectionC0974z serviceConnectionC0974z = (p0.ServiceConnectionC0974z) this.f8210a.f8214a.get(c0973y);
                    if (serviceConnectionC0974z != null && serviceConnectionC0974z.f8304a.isEmpty()) {
                        if (serviceConnectionC0974z.f8306c) {
                            serviceConnectionC0974z.f8310g.f8216c.removeMessages(1, serviceConnectionC0974z.f8308e);
                            p0.C0947B c0947b = serviceConnectionC0974z.f8310g;
                            c0947b.f8217d.b(c0947b.f8215b, serviceConnectionC0974z);
                            serviceConnectionC0974z.f8306c = false;
                            serviceConnectionC0974z.f8305b = 2;
                        }
                        this.f8210a.f8214a.remove(c0973y);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        synchronized (this.f8210a.f8214a) {
            try {
                p0.C0973y c0973y2 = (p0.C0973y) message.obj;
                p0.ServiceConnectionC0974z serviceConnectionC0974z2 = (p0.ServiceConnectionC0974z) this.f8210a.f8214a.get(c0973y2);
                if (serviceConnectionC0974z2 != null && serviceConnectionC0974z2.f8305b == 3) {
                    android.util.Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(java.lang.String.valueOf(c0973y2)), new java.lang.Exception());
                    android.content.ComponentName componentName = serviceConnectionC0974z2.f8309f;
                    if (componentName == null) {
                        c0973y2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        java.lang.String str = c0973y2.f8302b;
                        p0.AbstractC0966r.c(str);
                        componentName = new android.content.ComponentName(str, io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                    }
                    serviceConnectionC0974z2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
