package p109p;

import A0.a;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import p017c.e;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Binder implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f15662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f15663b;

    public p(r rVar) {
        this.f15663b = rVar;
        attachInterface(this, e.f10160n);
        this.f15662a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        final boolean z4;
        String str = e.f10160n;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        final r rVar = this.f15663b;
        Handler handler = this.f15662a;
        if (i7 == 2) {
            z4 = parcel.readInt() != 0;
            final Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            final int i9 = 1;
            handler.post(new Runnable() { // from class: p.o
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            rVar.onSessionEnded(z4, bundle);
                            break;
                        default:
                            rVar.onVerticalScrollEvent(z4, bundle);
                            break;
                    }
                }
            });
        } else if (i7 == 3) {
            handler.post(new a(rVar, parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), 3));
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
                            rVar.onSessionEnded(z4, bundle2);
                            break;
                        default:
                            rVar.onVerticalScrollEvent(z4, bundle2);
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
