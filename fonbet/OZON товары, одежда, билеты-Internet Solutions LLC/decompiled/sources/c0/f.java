package c0;

import C.S;
import W.AbstractC4830a;
import Z.a;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;

/* loaded from: classes8.dex */
public final class f implements x2.j<Z.a> {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4830a f56142a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5086c0.a f56143b;

    public f(@NonNull AbstractC4830a abstractC4830a, @NonNull InterfaceC5086c0.a aVar) {
        this.f56142a = abstractC4830a;
        this.f56143b = aVar;
    }

    @Override // x2.j
    @NonNull
    public final Z.a get() {
        AbstractC4830a abstractC4830a = this.f56142a;
        int b11 = C5694b.b(abstractC4830a);
        int c11 = C5694b.c(abstractC4830a);
        int b12 = abstractC4830a.b();
        Range<Integer> c12 = abstractC4830a.c();
        InterfaceC5086c0.a aVar = this.f56143b;
        int c13 = aVar.c();
        if (b12 == -1) {
            S.a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + c13);
            b12 = c13;
        } else {
            S.a("AudioSrcAdPrflRslvr", Cm.e.c("Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: ", c13, ", Resolved Channel Count: ", "]", b12));
        }
        int g10 = aVar.g();
        int e11 = C5694b.e(c12, b12, c11, g10);
        S.a("AudioSrcAdPrflRslvr", Cm.e.c("Using resolved AUDIO sample rate or nearest supported from AudioProfile: ", e11, "Hz. [AudioProfile sample rate: ", "Hz]", g10));
        a.AbstractC0654a a11 = Z.a.a();
        a11.d(b11);
        a11.c(c11);
        a11.e(b12);
        a11.f(e11);
        return a11.b();
    }
}
