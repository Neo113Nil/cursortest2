package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bf extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f11630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f11632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i7, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f11632c = bnVar;
        this.f11630a = j;
        this.f11631b = taskCompletionSource2;
    }

    @Override // A3.A
    public final void b() {
        if (bn.k(this.f11632c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f11632c;
            A3.p pVar = (A3.p) bnVar.f11652a.f652n;
            Bundle bundleB = bn.b(bnVar, this.f11630a, 0);
            bl blVar = new bl(this.f11632c, this.f11631b);
            A3.n nVar = (A3.n) pVar;
            nVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(nVar.f633b);
            int i7 = A3.l.f657a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(blVar);
            nVar.Z(2, parcelObtain);
        } catch (RemoteException e7) {
            this.f11632c.f11653b.a(e7, "warmUpIntegrityToken(%s)", Long.valueOf(this.f11630a));
            this.f11631b.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
