package N;

import Q.q;
import a0.AbstractBinderC0010a;
import a0.AbstractC0011b;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m extends AbstractBinderC0010a implements q {

    /* renamed from: b, reason: collision with root package name */
    public final int f254b;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f254b = Arrays.hashCode(bArr);
    }

    public static byte[] e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // a0.AbstractBinderC0010a
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            W.a aVar = new W.a(f());
            parcel2.writeNoException();
            int i3 = AbstractC0011b.f548a;
            parcel2.writeStrongBinder(aVar);
        } else {
            if (i2 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f254b);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof q)) {
            try {
                q qVar = (q) obj;
                if (((m) qVar).f254b != this.f254b) {
                    return false;
                }
                return Arrays.equals(f(), new W.a(((m) qVar).f()).f505b);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public abstract byte[] f();

    public final int hashCode() {
        return this.f254b;
    }
}
