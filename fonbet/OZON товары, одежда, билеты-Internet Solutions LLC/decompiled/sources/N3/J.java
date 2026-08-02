package N3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7272n;
import java.io.IOException;
import m3.C8050C;

/* loaded from: classes.dex */
public final class J implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private final int f18509a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18510b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18511c;

    /* renamed from: d, reason: collision with root package name */
    private int f18512d;

    /* renamed from: e, reason: collision with root package name */
    private int f18513e;

    /* renamed from: f, reason: collision with root package name */
    private r f18514f;

    /* renamed from: g, reason: collision with root package name */
    private M f18515g;

    public J(int i11, int i12, String str) {
        this.f18509a = i11;
        this.f18510b = i12;
        this.f18511c = str;
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        if (j11 == 0 || this.f18513e == 1) {
            this.f18513e = 1;
            this.f18512d = 0;
        }
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f18514f = rVar;
        M track = rVar.track(UserVerificationMethods.USER_VERIFY_ALL, 4);
        this.f18515g = track;
        C7272n.a aVar = new C7272n.a();
        String str = this.f18511c;
        aVar.W(str);
        aVar.y0(str);
        track.a(aVar.P());
        this.f18514f.endTracks();
        this.f18514f.seekMap(new K());
        this.f18513e = 1;
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        int i11 = this.f18510b;
        int i12 = this.f18509a;
        G10.a.h((i12 == -1 || i11 == -1) ? false : true);
        C8050C c8050c = new C8050C(i11);
        ((C3659j) qVar).d(c8050c.e(), 0, i11, false);
        return c8050c.L() == i12;
    }

    @Override // N3.InterfaceC3665p
    public final int f(q qVar, G g10) throws IOException {
        int i11 = this.f18513e;
        if (i11 != 1) {
            if (i11 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        M m11 = this.f18515g;
        m11.getClass();
        int d11 = m11.d(qVar, UserVerificationMethods.USER_VERIFY_ALL, true);
        if (d11 != -1) {
            this.f18512d += d11;
            return 0;
        }
        this.f18513e = 2;
        this.f18515g.b(0L, 1, this.f18512d, 0, null);
        this.f18512d = 0;
        return 0;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}
