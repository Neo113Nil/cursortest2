package p0;

/* renamed from: p0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0968t extends C0.c {

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f8289b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8290c;

    public BinderC0968t(com.google.android.gms.common.internal.a aVar, int i2) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f8289b = aVar;
        this.f8290c = i2;
    }

    @Override // C0.c
    public final boolean d(int i2, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i2 == 1) {
            int readInt = parcel.readInt();
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            android.os.Bundle bundle = (android.os.Bundle) z0.AbstractC1047a.a(parcel, android.os.Bundle.CREATOR);
            z0.AbstractC1047a.b(parcel);
            p0.AbstractC0966r.d(this.f8289b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f8289b;
            aVar.getClass();
            p0.C0970v c0970v = new p0.C0970v(aVar, readInt, readStrongBinder, bundle);
            p0.HandlerC0967s handlerC0967s = aVar.f2603e;
            handlerC0967s.sendMessage(handlerC0967s.obtainMessage(1, this.f8290c, -1, c0970v));
            this.f8289b = null;
        } else if (i2 == 2) {
            parcel.readInt();
            z0.AbstractC1047a.b(parcel);
            android.util.Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new java.lang.Exception());
        } else {
            if (i2 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
            p0.C0972x c0972x = (p0.C0972x) z0.AbstractC1047a.a(parcel, p0.C0972x.CREATOR);
            z0.AbstractC1047a.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f8289b;
            p0.AbstractC0966r.d(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            p0.AbstractC0966r.c(c0972x);
            aVar2.f2618u = c0972x;
            if (aVar2 instanceof x0.C1012b) {
                p0.C0951c c0951c = c0972x.f8299d;
                p0.C0955g b2 = p0.C0955g.b();
                p0.C0956h c0956h = c0951c == null ? null : c0951c.f8222a;
                synchronized (b2) {
                    if (c0956h == null) {
                        c0956h = p0.C0955g.f8254c;
                    } else {
                        p0.C0956h c0956h2 = (p0.C0956h) b2.f8255a;
                        if (c0956h2 != null) {
                            if (c0956h2.f8256a < c0956h.f8256a) {
                            }
                        }
                    }
                    b2.f8255a = c0956h;
                }
            }
            android.os.Bundle bundle2 = c0972x.f8296a;
            p0.AbstractC0966r.d(this.f8289b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f8289b;
            aVar3.getClass();
            p0.C0970v c0970v2 = new p0.C0970v(aVar3, readInt2, readStrongBinder2, bundle2);
            p0.HandlerC0967s handlerC0967s2 = aVar3.f2603e;
            handlerC0967s2.sendMessage(handlerC0967s2.obtainMessage(1, this.f8290c, -1, c0970v2));
            this.f8289b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
