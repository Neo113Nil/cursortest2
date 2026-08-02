package F3;

import B0.A0;
import N3.C3659j;
import N3.InterfaceC3665p;
import android.net.Uri;
import com.google.common.collect.AbstractC5880y;
import g4.C6622d;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import p3.InterfaceC8846f;

/* renamed from: F3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2998c implements J {

    /* renamed from: a, reason: collision with root package name */
    private final N3.u f8629a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3665p f8630b;

    /* renamed from: c, reason: collision with root package name */
    private C3659j f8631c;

    public C2998c(N3.u uVar) {
        this.f8629a = uVar;
    }

    public final void a() {
        InterfaceC3665p interfaceC3665p = this.f8630b;
        if (interfaceC3665p == null) {
            return;
        }
        InterfaceC3665p c11 = interfaceC3665p.c();
        if (c11 instanceof C6622d) {
            ((C6622d) c11).g();
        }
    }

    public final long b() {
        C3659j c3659j = this.f8631c;
        if (c3659j != null) {
            return c3659j.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r1.getPosition() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (r1.getPosition() != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(InterfaceC8846f interfaceC8846f, Uri uri, Map map, long j11, long j12, N3.r rVar) throws IOException {
        C3659j c3659j = new C3659j(interfaceC8846f, j11, j12);
        this.f8631c = c3659j;
        if (this.f8630b != null) {
            return;
        }
        InterfaceC3665p[] d11 = this.f8629a.d(uri, map);
        AbstractC5880y.a m11 = AbstractC5880y.m(d11.length);
        boolean z11 = true;
        if (d11.length == 1) {
            this.f8630b = d11[0];
        } else {
            int length = d11.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                InterfaceC3665p interfaceC3665p = d11[i11];
                try {
                } catch (EOFException unused) {
                    if (this.f8630b == null) {
                    }
                } catch (Throwable th2) {
                    if (this.f8630b == null && c3659j.getPosition() != j11) {
                        z11 = false;
                    }
                    G10.a.h(z11);
                    c3659j.e();
                    throw th2;
                }
                if (interfaceC3665p.d(c3659j)) {
                    this.f8630b = interfaceC3665p;
                    c3659j.e();
                    break;
                }
                m11.h(interfaceC3665p.e());
                if (this.f8630b == null) {
                }
                boolean z12 = true;
                G10.a.h(z12);
                c3659j.e();
                i11++;
            }
            if (this.f8630b == null) {
                String str = "None of the available extractors (" + O7.f.e(", ").c(com.google.common.collect.G.a(AbstractC5880y.s(d11), new A0(1))) + ") could read the stream.";
                uri.getClass();
                throw new e0(str, m11.j());
            }
        }
        this.f8630b.b(rVar);
    }

    public final int d(N3.G g10) throws IOException {
        InterfaceC3665p interfaceC3665p = this.f8630b;
        interfaceC3665p.getClass();
        C3659j c3659j = this.f8631c;
        c3659j.getClass();
        return interfaceC3665p.f(c3659j, g10);
    }

    public final void e() {
        InterfaceC3665p interfaceC3665p = this.f8630b;
        if (interfaceC3665p != null) {
            interfaceC3665p.release();
            this.f8630b = null;
        }
        this.f8631c = null;
    }

    public final void f(long j11, long j12) {
        InterfaceC3665p interfaceC3665p = this.f8630b;
        interfaceC3665p.getClass();
        interfaceC3665p.a(j11, j12);
    }
}
