package com.google.android.play.core.integrity;

import A3.A;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class ag extends A {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f11580a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f11581b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11582c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f11583d;

    /* renamed from: e, reason: collision with root package name */
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
        A3.z zVar;
        at atVar;
        try {
            aj ajVar = this.f11584e;
            A3.u uVar = (A3.u) ajVar.f11589a.f652n;
            Bundle bundle = this.f11580a;
            atVar = ajVar.f11592d;
            as a2 = atVar.a(this.f11581b, this.f11582c, ajVar.f11589a);
            A3.s sVar = (A3.s) uVar;
            sVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(sVar.f633b);
            int i7 = A3.l.f657a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a2);
            sVar.Z(3, obtain);
        } catch (RemoteException e7) {
            aj ajVar2 = this.f11584e;
            int i8 = this.f11583d;
            zVar = ajVar2.f11590b;
            zVar.a(e7, "requestAndShowDialog(%s)", Integer.valueOf(i8));
            this.f11582c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}
