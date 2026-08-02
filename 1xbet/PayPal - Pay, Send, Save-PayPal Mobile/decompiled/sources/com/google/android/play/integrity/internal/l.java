package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public final class l extends com.google.android.play.integrity.internal.a implements com.google.android.play.integrity.internal.n {
    l(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void c(android.os.Bundle bundle, com.google.android.play.integrity.internal.r rVar) throws android.os.RemoteException {
        android.os.Parcel a2 = a();
        com.google.android.play.integrity.internal.c.c(a2, bundle);
        a2.writeStrongBinder(rVar);
        b(3, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void d(android.os.Bundle bundle, com.google.android.play.integrity.internal.p pVar) throws android.os.RemoteException {
        android.os.Parcel a2 = a();
        com.google.android.play.integrity.internal.c.c(a2, bundle);
        a2.writeStrongBinder(pVar);
        b(2, a2);
    }
}
