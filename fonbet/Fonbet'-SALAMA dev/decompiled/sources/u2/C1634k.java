package u2;

import A1.C0045t0;
import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import v2.AbstractC1664a;

/* renamed from: u2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1634k extends AbstractC1630g {

    /* renamed from: e, reason: collision with root package name */
    public C1640q f16789e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f16790f;

    /* renamed from: x, reason: collision with root package name */
    public int f16791x;

    /* renamed from: y, reason: collision with root package name */
    public int f16792y;

    @Override // u2.InterfaceC1636m
    public final void close() {
        if (this.f16790f != null) {
            this.f16790f = null;
            e();
        }
        this.f16789e = null;
    }

    @Override // u2.InterfaceC1636m
    public final long o(C1640q c1640q) {
        f();
        this.f16789e = c1640q;
        Uri uri = c1640q.f16808a;
        String scheme = uri.getScheme();
        AbstractC1664a.e("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i7 = v2.t.f17153a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new C0045t0("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f16790f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e7) {
                throw new C0045t0(w1.L.i("Error while parsing Base64 encoded string: ", str), e7, true, 0);
            }
        } else {
            this.f16790f = URLDecoder.decode(str, D3.f.f1717a.name()).getBytes(D3.f.f1719c);
        }
        byte[] bArr = this.f16790f;
        long length = bArr.length;
        long j = c1640q.f16812e;
        if (j > length) {
            this.f16790f = null;
            throw new C1637n(2008);
        }
        int i8 = (int) j;
        this.f16791x = i8;
        int length2 = bArr.length - i8;
        this.f16792y = length2;
        long j3 = c1640q.f16813f;
        if (j3 != -1) {
            this.f16792y = (int) Math.min(length2, j3);
        }
        g(c1640q);
        return j3 != -1 ? j3 : this.f16792y;
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f16792y;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        byte[] bArr2 = this.f16790f;
        int i10 = v2.t.f17153a;
        System.arraycopy(bArr2, this.f16791x, bArr, i7, min);
        this.f16791x += min;
        this.f16792y -= min;
        b(min);
        return min;
    }

    @Override // u2.InterfaceC1636m
    public final Uri t() {
        C1640q c1640q = this.f16789e;
        if (c1640q != null) {
            return c1640q.f16808a;
        }
        return null;
    }
}
