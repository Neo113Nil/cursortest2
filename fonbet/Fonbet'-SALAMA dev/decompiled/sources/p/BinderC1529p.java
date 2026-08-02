package p;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* renamed from: p.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1529p extends Binder implements c.e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f15656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1531r f15657b;

    public BinderC1529p(InterfaceC1531r interfaceC1531r) {
        this.f15657b = interfaceC1531r;
        attachInterface(this, c.e.f10160n);
        this.f15656a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        final boolean z4;
        String str = c.e.f10160n;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        final InterfaceC1531r interfaceC1531r = this.f15657b;
        Handler handler = this.f15656a;
        if (i7 == 2) {
            z4 = parcel.readInt() != 0;
            final Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            final int i9 = 1;
            handler.post(new Runnable() { // from class: p.o
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            interfaceC1531r.onSessionEnded(z4, bundle);
                            break;
                        default:
                            interfaceC1531r.onVerticalScrollEvent(z4, bundle);
                            break;
                    }
                }
            });
        } else if (i7 == 3) {
            handler.post(new A0.a(interfaceC1531r, parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), 3));
        } else {
            if (i7 != 4) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            z4 = parcel.readInt() != 0;
            final Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            final int i10 = 0;
            handler.post(new Runnable() { // from class: p.o
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            interfaceC1531r.onSessionEnded(z4, bundle2);
                            break;
                        default:
                            interfaceC1531r.onVerticalScrollEvent(z4, bundle2);
                            break;
                    }
                }
            });
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
