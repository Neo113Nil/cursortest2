package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f11633a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f11634b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f11635c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11636d;

    /* renamed from: e, reason: collision with root package name */
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
        A3.z zVar;
        if (bn.k(this.f11637e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f11637e;
            A3.p pVar = (A3.p) bnVar.f11652a.f652n;
            Bundle a2 = bn.a(bnVar, this.f11633a, this.f11634b, this.f11635c, 0);
            bk bkVar = new bk(this.f11637e, this.f11636d, this.f11634b);
            A3.n nVar = (A3.n) pVar;
            nVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(nVar.f633b);
            int i7 = A3.l.f657a;
            obtain.writeInt(1);
            a2.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(bkVar);
            nVar.Z(3, obtain);
        } catch (RemoteException e7) {
            bn bnVar2 = this.f11637e;
            String str = this.f11633a;
            zVar = bnVar2.f11653b;
            zVar.a(e7, "requestExpressIntegrityToken(%s, %s)", str, Long.valueOf(this.f11634b));
            this.f11636d.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
