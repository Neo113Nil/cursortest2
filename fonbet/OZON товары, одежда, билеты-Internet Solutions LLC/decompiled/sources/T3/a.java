package T3;

import N3.C3650a;
import N3.M;
import T3.e;
import j3.C7272n;
import j3.v;
import java.util.Collections;
import m3.C8049B;
import m3.C8050C;

/* loaded from: classes8.dex */
final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f26569e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f26570b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26571c;

    /* renamed from: d, reason: collision with root package name */
    private int f26572d;

    public a(M m11) {
        super(m11);
    }

    protected final boolean a(C8050C c8050c) throws e.a {
        if (this.f26570b) {
            c8050c.S(1);
            return true;
        }
        int E11 = c8050c.E();
        int i11 = (E11 >> 4) & 15;
        this.f26572d = i11;
        M m11 = this.f26592a;
        if (i11 == 2) {
            int i12 = f26569e[(E11 >> 2) & 3];
            C7272n.a aVar = new C7272n.a();
            aVar.W("video/x-flv");
            aVar.y0("audio/mpeg");
            aVar.T(1);
            aVar.z0(i12);
            m11.a(aVar.P());
            this.f26571c = true;
        } else if (i11 == 7 || i11 == 8) {
            String str = i11 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
            C7272n.a aVar2 = new C7272n.a();
            aVar2.W("video/x-flv");
            aVar2.y0(str);
            aVar2.T(1);
            aVar2.z0(8000);
            m11.a(aVar2.P());
            this.f26571c = true;
        } else if (i11 != 10) {
            throw new e.a("Audio format not supported: " + this.f26572d);
        }
        this.f26570b = true;
        return true;
    }

    protected final boolean b(long j11, C8050C c8050c) throws v {
        int i11 = this.f26572d;
        M m11 = this.f26592a;
        if (i11 == 2) {
            int a11 = c8050c.a();
            m11.e(a11, c8050c);
            this.f26592a.b(j11, 1, a11, 0, null);
            return true;
        }
        int E11 = c8050c.E();
        if (E11 != 0 || this.f26571c) {
            if (this.f26572d == 10 && E11 != 1) {
                return false;
            }
            int a12 = c8050c.a();
            m11.e(a12, c8050c);
            this.f26592a.b(j11, 1, a12, 0, null);
            return true;
        }
        int a13 = c8050c.a();
        byte[] bArr = new byte[a13];
        c8050c.n(0, a13, bArr);
        C3650a.C0354a b11 = C3650a.b(new C8049B(a13, bArr), false);
        C7272n.a aVar = new C7272n.a();
        aVar.W("video/x-flv");
        aVar.y0("audio/mp4a-latm");
        aVar.U(b11.f18544c);
        aVar.T(b11.f18543b);
        aVar.z0(b11.f18542a);
        aVar.k0(Collections.singletonList(bArr));
        m11.a(aVar.P());
        this.f26571c = true;
        return false;
    }
}
