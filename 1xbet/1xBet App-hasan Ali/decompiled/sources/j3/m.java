package j3;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import m3.t;
import m3.v;
import s3.BinderC2361b;
import x3.AbstractC2644a;

/* loaded from: classes.dex */
public abstract class m extends C3.c implements t {

    /* renamed from: l, reason: collision with root package name */
    public final int f17526l;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        v.a(bArr.length == 25);
        this.f17526l = Arrays.hashCode(bArr);
    }

    public static byte[] h1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // C3.c
    public final boolean d1(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            BinderC2361b binderC2361b = new BinderC2361b(t1());
            parcel2.writeNoException();
            AbstractC2644a.c(parcel2, binderC2361b);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f17526l);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof t)) {
            try {
                t tVar = (t) obj;
                if (((m) tVar).f17526l == this.f17526l) {
                    return Arrays.equals(t1(), (byte[]) BinderC2361b.t1(new BinderC2361b(((m) tVar).t1())));
                }
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17526l;
    }

    public abstract byte[] t1();
}
