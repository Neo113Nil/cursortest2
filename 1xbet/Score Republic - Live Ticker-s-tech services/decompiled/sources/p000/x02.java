package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x02 extends cl1 implements IInterface {

    /* JADX INFO: renamed from: c */
    public final int f8735c;

    public x02(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        p80.m3858b(bArr.length == 25);
        this.f8735c = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: I */
    public static byte[] m5495I(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.cl1
    /* JADX INFO: renamed from: F */
    public final boolean mo966F(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            xb0 xb0VarM5496H = m5496H();
            parcel2.writeNoException();
            ru1.m4408b(parcel2, xb0VarM5496H);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f8735c);
        return true;
    }

    /* JADX INFO: renamed from: G */
    public abstract byte[] mo3431G();

    /* JADX INFO: renamed from: H */
    public final xb0 m5496H() {
        return new vs0(mo3431G());
    }

    public final boolean equals(Object obj) {
        xb0 xb0VarM5496H;
        if (obj instanceof x02) {
            try {
                x02 x02Var = (x02) obj;
                if (x02Var.f8735c == this.f8735c && (xb0VarM5496H = x02Var.m5496H()) != null) {
                    return Arrays.equals(mo3431G(), (byte[]) vs0.m5188H(xb0VarM5496H));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8735c;
    }
}
