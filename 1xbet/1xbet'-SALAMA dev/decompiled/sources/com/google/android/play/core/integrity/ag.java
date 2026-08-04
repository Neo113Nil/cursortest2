package com.google.android.play.core.integrity;

import A3.A;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class ag extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f11580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f11581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f11583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f11584e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(taskCompletionSource);
        this.f11584e = ajVar;
        this.f11580a = bundle;
        this.f11581b = activity;
        this.f11582c = taskCompletionSource2;
        this.f11583d = i7;
    }

    @Override // A3.A
    public final void b() {
        try {
            aj ajVar = this.f11584e;
            A3.u uVar = (A3.u) ajVar.f11589a.f652n;
            Bundle bundle = this.f11580a;
            as asVarA = ajVar.f11592d.a(this.f11581b, this.f11582c, ajVar.f11589a);
            A3.s sVar = (A3.s) uVar;
            sVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(sVar.f633b);
            int i7 = A3.l.f657a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asVarA);
            sVar.Z(3, parcelObtain);
        } catch (RemoteException e7) {
            this.f11584e.f11590b.a(e7, "requestAndShowDialog(%s)", Integer.valueOf(this.f11583d));
            this.f11582c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}
