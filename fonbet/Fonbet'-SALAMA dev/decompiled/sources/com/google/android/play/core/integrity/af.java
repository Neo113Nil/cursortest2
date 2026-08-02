package com.google.android.play.core.integrity;

import A3.A;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class af extends A {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f11575a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f11576b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11577c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f11578d;

    /* renamed from: e, reason: collision with root package name */
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
        A3.z zVar;
        try {
            aj ajVar = this.f11579e;
            A3.u uVar = (A3.u) ajVar.f11589a.f652n;
            Bundle a2 = aj.a(ajVar, this.f11575a, this.f11576b, null);
            ai aiVar = new ai(this.f11579e, this.f11577c);
            A3.s sVar = (A3.s) uVar;
            sVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(sVar.f633b);
            int i7 = A3.l.f657a;
            obtain.writeInt(1);
            a2.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aiVar);
            sVar.Z(2, obtain);
        } catch (RemoteException e7) {
            aj ajVar2 = this.f11579e;
            IntegrityTokenRequest integrityTokenRequest = this.f11578d;
            zVar = ajVar2.f11590b;
            zVar.a(e7, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.f11577c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}
