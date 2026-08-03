package m0;

/* loaded from: classes.dex */
public abstract class n extends C0.c implements p0.InterfaceC0964p {

    /* renamed from: b, reason: collision with root package name */
    public final int f8068b;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f8068b = java.util.Arrays.hashCode(bArr);
    }

    public static byte[] e(java.lang.String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    @Override // C0.c
    public final boolean d(int i2, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i2 == 1) {
            v0.a aVar = new v0.a(f());
            parcel2.writeNoException();
            int i3 = z0.AbstractC1047a.f8519a;
            parcel2.writeStrongBinder(aVar);
        } else {
            if (i2 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f8068b);
        }
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof p0.InterfaceC0964p)) {
            try {
                p0.InterfaceC0964p interfaceC0964p = (p0.InterfaceC0964p) obj;
                if (((m0.n) interfaceC0964p).f8068b != this.f8068b) {
                    return false;
                }
                return java.util.Arrays.equals(f(), new v0.a(((m0.n) interfaceC0964p).f()).f8386b);
            } catch (android.os.RemoteException e2) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public abstract byte[] f();

    public final int hashCode() {
        return this.f8068b;
    }
}
