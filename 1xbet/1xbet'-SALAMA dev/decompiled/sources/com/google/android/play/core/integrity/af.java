package com.google.android.play.core.integrity;

import A3.A;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class af extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f11575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f11576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f11578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f11579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l7, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f11579e = ajVar;
        this.f11575a = bArr;
        this.f11576b = l7;
        this.f11577c = taskCompletionSource2;
        this.f11578d = integrityTokenRequest;
    }

    @Override // A3.A
    public final void a(Exception exc) {
        if (exc instanceof A3.f) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // A3.A
    public final void b() {
        try {
            aj ajVar = this.f11579e;
            A3.u uVar = (A3.u) ajVar.f11589a.f652n;
            Bundle bundleA = aj.a(ajVar, this.f11575a, this.f11576b, null);
            ai aiVar = new ai(this.f11579e, this.f11577c);
            A3.s sVar = (A3.s) uVar;
            sVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(sVar.f633b);
            int i7 = A3.l.f657a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(aiVar);
            sVar.Z(2, parcelObtain);
        } catch (RemoteException e7) {
            this.f11579e.f11590b.a(e7, "requestIntegrityToken(%s)", this.f11578d);
            this.f11577c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}
