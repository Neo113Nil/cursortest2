package c2;

import A1.C0008a0;
import A1.C0012c0;
import A1.C0014d0;
import A1.C0016e0;
import A1.C0018f0;
import A1.C0022h0;
import A1.C0026j0;
import E3.AbstractC0167z;
import E3.C0165x;
import android.net.Uri;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Collections;
import java.util.List;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class c0 extends AbstractC0795a {
    public static final A1.X j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0022h0 f10312k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f10313l;

    /* renamed from: h, reason: collision with root package name */
    public final long f10314h;

    /* renamed from: i, reason: collision with root package name */
    public final C0022h0 f10315i;

    static {
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "audio/raw";
        format$Builder.f10550x = 2;
        format$Builder.f10551y = 44100;
        format$Builder.f10552z = 2;
        A1.X x4 = new A1.X(format$Builder);
        j = x4;
        C0008a0 c0008a0 = new C0008a0();
        C0165x c0165x = AbstractC0167z.f2083b;
        E3.L l7 = E3.L.f2000e;
        List emptyList = Collections.emptyList();
        E3.L l8 = E3.L.f2000e;
        C0018f0 c0018f0 = C0018f0.f352c;
        Uri uri = Uri.EMPTY;
        f10312k = new C0022h0("SilenceMediaSource", new C0012c0(c0008a0), uri != null ? new C0016e0(uri, x4.f283C, null, emptyList, l8, null) : null, new C0014d0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0026j0.f414X, c0018f0);
        f10313l = new byte[4096];
    }

    public c0(long j3, C0022h0 c0022h0) {
        AbstractC1664a.f(j3 >= 0);
        this.f10314h = j3;
        this.f10315i = c0022h0;
    }

    @Override // c2.AbstractC0795a
    public final InterfaceC0794B a(D d7, u2.r rVar, long j3) {
        return new a0(this.f10314h);
    }

    @Override // c2.AbstractC0795a
    public final C0022h0 g() {
        return this.f10315i;
    }

    @Override // c2.AbstractC0795a
    public final void j(u2.U u4) {
        C0022h0 c0022h0 = this.f10315i;
        long j3 = this.f10314h;
        k(new d0(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, true, false, false, null, c0022h0, null));
    }

    @Override // c2.AbstractC0795a
    public final void h() {
    }

    @Override // c2.AbstractC0795a
    public final void n() {
    }

    @Override // c2.AbstractC0795a
    public final void l(InterfaceC0794B interfaceC0794B) {
    }
}
