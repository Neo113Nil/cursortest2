package p0;

/* renamed from: p0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0970v extends p0.AbstractC0963o {

    /* renamed from: g, reason: collision with root package name */
    public final android.os.IBinder f8293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8294h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0970v(com.google.android.gms.common.internal.a aVar, int i2, android.os.IBinder iBinder, android.os.Bundle bundle) {
        super(aVar, i2, bundle);
        this.f8294h = aVar;
        this.f8293g = iBinder;
    }

    @Override // p0.AbstractC0963o
    public final void a(m0.b bVar) {
        p0.C0955g c0955g = this.f8294h.f2613o;
        if (c0955g != null) {
            ((n0.h) c0955g.f8255a).b(bVar);
        }
        java.lang.System.currentTimeMillis();
    }

    @Override // p0.AbstractC0963o
    public final boolean b() {
        android.os.IBinder iBinder = this.f8293g;
        try {
            p0.AbstractC0966r.c(iBinder);
            java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f8294h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                android.util.Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            android.os.IInterface n2 = aVar.n(iBinder);
            if (n2 == null || !(com.google.android.gms.common.internal.a.u(aVar, 2, 4, n2) || com.google.android.gms.common.internal.a.u(aVar, 3, 4, n2))) {
                return false;
            }
            aVar.f2617s = null;
            p0.C0955g c0955g = aVar.f2612n;
            if (c0955g == null) {
                return true;
            }
            ((n0.g) c0955g.f8255a).c();
            return true;
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
