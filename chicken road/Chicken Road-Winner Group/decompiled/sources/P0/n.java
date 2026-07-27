package P0;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c1.AbstractBinderC0169a;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class n extends AbstractBinderC0169a implements S0.p {

    /* renamed from: d, reason: collision with root package name */
    public final int f1146d;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 0);
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f1146d = Arrays.hashCode(bArr);
    }

    public static byte[] f(String str) {
        try {
            return str.getBytes(CharEncoding.ISO_8859_1);
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // c1.AbstractBinderC0169a
    public final boolean d(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            if (i3 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f1146d);
            return true;
        }
        Y0.a aVar = new Y0.a(g());
        parcel2.writeNoException();
        int i4 = c1.b.f2528a;
        parcel2.writeStrongBinder(aVar);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof S0.p)) {
            try {
                S0.p pVar = (S0.p) obj;
                if (((n) pVar).f1146d == this.f1146d) {
                    return Arrays.equals(g(), new Y0.a(((n) pVar).g()).f1635d);
                }
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            }
        }
        return false;
    }

    public abstract byte[] g();

    public final int hashCode() {
        return this.f1146d;
    }
}
