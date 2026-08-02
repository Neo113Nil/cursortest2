package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public final class g extends com.google.android.play.integrity.internal.a implements com.google.android.play.integrity.internal.i {
    g(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void c(android.os.Bundle bundle, com.google.android.play.integrity.internal.r rVar) throws android.os.RemoteException {
        android.os.Parcel a2 = a();
        com.google.android.play.integrity.internal.c.c(a2, bundle);
        a2.writeStrongBinder(rVar);
        b(6, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void d(android.os.Bundle bundle, com.google.android.play.integrity.internal.k kVar) throws android.os.RemoteException {
        android.os.Parcel a2 = a();
        com.google.android.play.integrity.internal.c.c(a2, bundle);
        a2.writeStrongBinder(kVar);
        b(3, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void e(android.os.Bundle bundle, com.google.android.play.integrity.internal.k kVar) throws android.os.RemoteException {
        android.os.Parcel a2 = a();
        com.google.android.play.integrity.internal.c.c(a2, bundle);
        a2.writeStrongBinder(kVar);
        b(2, a2);
    }
}
