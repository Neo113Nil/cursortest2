package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f11630a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11631b;

    /* renamed from: c, reason: collision with root package name */
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
        A3.z zVar;
        if (bn.k(this.f11632c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f11632c;
            A3.p pVar = (A3.p) bnVar.f11652a.f652n;
            Bundle b7 = bn.b(bnVar, this.f11630a, 0);
            bl blVar = new bl(this.f11632c, this.f11631b);
            A3.n nVar = (A3.n) pVar;
            nVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(nVar.f633b);
            int i7 = A3.l.f657a;
            obtain.writeInt(1);
            b7.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(blVar);
            nVar.Z(2, obtain);
        } catch (RemoteException e7) {
            bn bnVar2 = this.f11632c;
            long j = this.f11630a;
            zVar = bnVar2.f11653b;
            zVar.a(e7, "warmUpIntegrityToken(%s)", Long.valueOf(j));
            this.f11631b.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
