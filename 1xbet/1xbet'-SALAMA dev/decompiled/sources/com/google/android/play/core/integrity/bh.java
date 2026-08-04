package com.google.android.play.core.integrity;

import A3.C0056e;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bh extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f11638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f11639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f11641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f11642e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(bnVar, taskCompletionSource);
        this.f11642e = bnVar;
        this.f11638a = bundle;
        this.f11639b = activity;
        this.f11640c = taskCompletionSource2;
        this.f11641d = i7;
    }

    @Override // A3.A
    public final void b() {
        if (bn.k(this.f11642e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f11642e;
            C0056e c0056e = bnVar.f11652a;
            A3.p pVar = (A3.p) c0056e.f652n;
            Bundle bundle = this.f11638a;
            as asVarA = bnVar.f11656e.a(this.f11639b, this.f11640c, c0056e);
            A3.n nVar = (A3.n) pVar;
            nVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(nVar.f633b);
            int i7 = A3.l.f657a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asVarA);
            nVar.Z(6, parcelObtain);
        } catch (RemoteException e7) {
            this.f11642e.f11653b.a(e7, "requestAndShowDialog(%s)", Integer.valueOf(this.f11641d));
            this.f11640c.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
