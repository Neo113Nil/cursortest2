package Cb;

import El0.i;
import Za.d;
import Zl0.g;
import Zl0.l;
import Zl0.r;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.vk.push.common.messaging.RemoteMessage;
import java.util.ArrayList;
import lb.InterfaceC7913b;

/* loaded from: classes9.dex */
public abstract class a extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface("com.vk.push.core.push.PushClient");
        }
        if (i11 == 1598968902) {
            parcel2.writeString("com.vk.push.core.push.PushClient");
            return true;
        }
        if (i11 == 2) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(RemoteMessage.INSTANCE);
            InterfaceC7913b H11 = InterfaceC7913b.a.H(parcel.readStrongBinder());
            r rVar = (r) this;
            if (i.f8074r != null) {
                if (createTypedArrayList != null && !createTypedArrayList.isEmpty() && H11 != null) {
                    ((l) rVar.f36098e.getValue()).d(Eb.a.a(rVar), createTypedArrayList, H11);
                    return true;
                }
                ((d) rVar.f36100g.getValue()).b("Callback or messages is null for some reason", null);
            }
        } else if (i11 == 3) {
            InterfaceC7913b H12 = InterfaceC7913b.a.H(parcel.readStrongBinder());
            r rVar2 = (r) this;
            if (i.f8074r != null) {
                if (H12 == null) {
                    ((d) rVar2.f36100g.getValue()).b("Callback is null for some reason", null);
                    return true;
                }
                ((g) rVar2.f36099f.getValue()).b(Eb.a.a(rVar2), H12);
                return true;
            }
        } else if (i11 == 4) {
            InterfaceC7913b H13 = InterfaceC7913b.a.H(parcel.readStrongBinder());
            r rVar3 = (r) this;
            if (i.f8074r != null) {
                if (H13 == null) {
                    ((d) rVar3.f36100g.getValue()).b("Callback is null for some reason", null);
                    return true;
                }
                ((g) rVar3.f36099f.getValue()).c(Eb.a.a(rVar3), H13);
                return true;
            }
        } else {
            if (i11 != 5) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            String readString = parcel.readString();
            InterfaceC7913b H14 = InterfaceC7913b.a.H(parcel.readStrongBinder());
            r rVar4 = (r) this;
            if (i.f8074r != null) {
                if (H14 == null || readString == null) {
                    ((d) rVar4.f36100g.getValue()).b("Token or callback argument is null for some reason", null);
                    return true;
                }
                ((g) rVar4.f36099f.getValue()).a(Eb.a.a(rVar4), readString, H14);
                return true;
            }
        }
        return true;
    }
}
