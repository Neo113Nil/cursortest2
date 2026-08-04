package p146u2;

import A1.C0045t0;
import D3.f;
import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import p151v2.a;
import p151v2.t;
import p155w1.L;

/* JADX INFO: renamed from: u2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0952k extends AbstractC0948g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0958q f16795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f16796f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16797x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16798y;

    @Override // p146u2.InterfaceC0954m
    public final void close() {
        if (this.f16796f != null) {
            this.f16796f = null;
            e();
        }
        this.f16795e = null;
    }

    @Override // p146u2.InterfaceC0954m
    public final long o(C0958q c0958q) throws C0045t0, C0955n {
        f();
        this.f16795e = c0958q;
        Uri uri = c0958q.f16814a;
        String scheme = uri.getScheme();
        a.e("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i7 = t.f17159a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new C0045t0("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f16796f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e7) {
                throw new C0045t0(L.i("Error while parsing Base64 encoded string: ", str), e7, true, 0);
            }
        } else {
            this.f16796f = URLDecoder.decode(str, f.f1717a.name()).getBytes(f.f1719c);
        }
        byte[] bArr = this.f16796f;
        long length = bArr.length;
        long j = c0958q.f16818e;
        if (j > length) {
            this.f16796f = null;
            throw new C0955n(2008);
        }
        int i8 = (int) j;
        this.f16797x = i8;
        int length2 = bArr.length - i8;
        this.f16798y = length2;
        long j3 = c0958q.f16819f;
        if (j3 != -1) {
            this.f16798y = (int) Math.min(length2, j3);
        }
        g(c0958q);
        return j3 != -1 ? j3 : this.f16798y;
    }

    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f16798y;
        if (i9 == 0) {
            return -1;
        }
        int iMin = Math.min(i8, i9);
        byte[] bArr2 = this.f16796f;
        int i10 = t.f17159a;
        System.arraycopy(bArr2, this.f16797x, bArr, i7, iMin);
        this.f16797x += iMin;
        this.f16798y -= iMin;
        b(iMin);
        return iMin;
    }

    @Override // p146u2.InterfaceC0954m
    public final Uri t() {
        C0958q c0958q = this.f16795e;
        if (c0958q != null) {
            return c0958q.f16814a;
        }
        return null;
    }
}
