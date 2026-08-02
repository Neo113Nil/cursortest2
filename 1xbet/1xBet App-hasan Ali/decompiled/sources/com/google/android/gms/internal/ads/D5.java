package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class D5 implements IInterface {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8164k;

    /* renamed from: l, reason: collision with root package name */
    public final IBinder f8165l;

    /* renamed from: m, reason: collision with root package name */
    public final String f8166m;

    public /* synthetic */ D5(IBinder iBinder, String str, int i) {
        this.f8164k = i;
        this.f8165l = iBinder;
        this.f8166m = str;
    }

    public Parcel L(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f8165l.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e3) {
                obtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel N() {
        switch (this.f8164k) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f8166m);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f8166m);
                return obtain2;
        }
    }

    public Parcel Y(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f8165l.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e3) {
                obtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f8164k) {
        }
        return this.f8165l;
    }

    public void d1(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f8165l.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void h1(Parcel parcel, int i) {
        try {
            this.f8165l.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
