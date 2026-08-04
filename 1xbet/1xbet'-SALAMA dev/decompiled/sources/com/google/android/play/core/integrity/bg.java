package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bg extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f11633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f11634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f11635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f11637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i7, String str, long j, long j3, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f11637e = bnVar;
        this.f11633a = str;
        this.f11634b = j;
        this.f11635c = j3;
        this.f11636d = taskCompletionSource2;
    }

    @Override // A3.A
    public final void b() {
        if (bn.k(this.f11637e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f11637e;
            A3.p pVar = (A3.p) bnVar.f11652a.f652n;
            Bundle bundleA = bn.a(bnVar, this.f11633a, this.f11634b, this.f11635c, 0);
            bk bkVar = new bk(this.f11637e, this.f11636d, this.f11634b);
            A3.n nVar = (A3.n) pVar;
            nVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(nVar.f633b);
            int i7 = A3.l.f657a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(bkVar);
            nVar.Z(3, parcelObtain);
        } catch (RemoteException e7) {
            this.f11637e.f11653b.a(e7, "requestExpressIntegrityToken(%s, %s)", this.f11633a, Long.valueOf(this.f11634b));
            this.f11636d.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
