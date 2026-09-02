package n1;

import i1.o;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import s1.n;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public final o f6182e;

    /* renamed from: f, reason: collision with root package name */
    public long f6183f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6184g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f6185h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, o oVar) {
        super(gVar);
        this.f6185h = gVar;
        this.f6183f = -1L;
        this.f6184g = true;
        this.f6182e = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005d, code lost:
    
        if (r6 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0073, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r8)));
     */
    @Override // n1.a, s1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(s1.e eVar, long j2) {
        s1.e eVar2;
        if (this.f6176b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f6184g) {
            return -1L;
        }
        long j3 = this.f6183f;
        if (j3 == 0 || j3 == -1) {
            g gVar = this.f6185h;
            if (j3 != -1) {
                gVar.f6194c.m(Long.MAX_VALUE);
            }
            try {
                n nVar = gVar.f6194c;
                nVar.o(1L);
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    boolean n2 = nVar.n(i3);
                    eVar2 = nVar.f6638a;
                    if (!n2) {
                        break;
                    }
                    byte b2 = eVar2.b(i2);
                    if ((b2 < 48 || b2 > 57) && ((b2 < 97 || b2 > 102) && (b2 < 65 || b2 > 70))) {
                        break;
                    }
                    i2 = i3;
                }
                this.f6183f = eVar2.k();
                String trim = gVar.f6194c.m(Long.MAX_VALUE).trim();
                if (this.f6183f < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f6183f + trim + "\"");
                }
                if (this.f6183f == 0) {
                    this.f6184g = false;
                    m1.d.d(gVar.f6192a.f1393f, this.f6182e, gVar.h());
                    a(true, null);
                }
                if (!this.f6184g) {
                    return -1L;
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
        long c2 = super.c(eVar, Math.min(8192L, this.f6183f));
        if (c2 != -1) {
            this.f6183f -= c2;
            return c2;
        }
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a(false, protocolException);
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        if (this.f6176b) {
            return;
        }
        if (this.f6184g) {
            try {
                z2 = j1.d.o(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                z2 = false;
            }
            if (!z2) {
                a(false, null);
            }
        }
        this.f6176b = true;
    }
}
