package X4;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class h implements j5.w {

    /* renamed from: a, reason: collision with root package name */
    public final j5.w f3562a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3563b;

    /* renamed from: c, reason: collision with root package name */
    public long f3564c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3565d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3566e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f3568g;

    public h(i iVar, j5.w delegate, long j2) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f3568g = iVar;
        this.f3562a = delegate;
        this.f3563b = j2;
        this.f3565d = true;
        if (j2 == 0) {
            b(null);
        }
    }

    public final void a() {
        this.f3562a.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f3566e) {
            return iOException;
        }
        this.f3566e = true;
        i iVar = this.f3568g;
        if (iOException == null && this.f3565d) {
            this.f3565d = false;
            iVar.getClass();
            r call = (r) iVar.f3571c;
            kotlin.jvm.internal.i.e(call, "call");
        }
        return i.a(iVar, true, false, iOException, 4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3567f) {
            return;
        }
        this.f3567f = true;
        try {
            a();
            b(null);
        } catch (IOException e3) {
            IOException b6 = b(e3);
            kotlin.jvm.internal.i.b(b6);
            throw b6;
        }
    }

    @Override // j5.w
    public final j5.y d() {
        return this.f3562a.d();
    }

    @Override // j5.w
    public final long s(j5.f sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (this.f3567f) {
            throw new IllegalStateException("closed");
        }
        try {
            long s2 = this.f3562a.s(sink, 8192L);
            boolean z = this.f3565d;
            i iVar = this.f3568g;
            if (z) {
                this.f3565d = false;
                iVar.getClass();
                r call = (r) iVar.f3571c;
                kotlin.jvm.internal.i.e(call, "call");
            }
            if (s2 == -1) {
                b(null);
                return -1L;
            }
            long j6 = this.f3564c + s2;
            long j7 = this.f3563b;
            if (j7 == -1 || j6 <= j7) {
                this.f3564c = j6;
                if (((Y4.g) iVar.f3573e).c()) {
                    b(null);
                }
                return s2;
            }
            throw new ProtocolException("expected " + j7 + " bytes but received " + j6);
        } catch (IOException e3) {
            IOException b6 = b(e3);
            kotlin.jvm.internal.i.b(b6);
            throw b6;
        }
    }

    public final String toString() {
        return h.class.getSimpleName() + '(' + this.f3562a + ')';
    }
}
