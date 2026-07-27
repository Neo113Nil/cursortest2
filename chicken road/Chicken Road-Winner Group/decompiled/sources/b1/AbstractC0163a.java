package b1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0163a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2471a;

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f2472d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2473e;

    public /* synthetic */ AbstractC0163a(IBinder iBinder, String str, int i3) {
        this.f2471a = i3;
        this.f2472d = iBinder;
        this.f2473e = str;
    }

    public Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2473e);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f2471a) {
        }
        return this.f2472d;
    }

    public Parcel b(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f2472d.transact(i3, parcel, obtain, 0);
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

    public void c(Parcel parcel, int i3) {
        try {
            this.f2472d.transact(i3, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
