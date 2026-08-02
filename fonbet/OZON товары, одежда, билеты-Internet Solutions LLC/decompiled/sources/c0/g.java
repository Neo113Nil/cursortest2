package c0;

import C.S;
import W.AbstractC4830a;
import Z.a;
import android.util.Range;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class g implements x2.j<Z.a> {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4830a f56144a;

    public g(@NonNull AbstractC4830a abstractC4830a) {
        this.f56144a = abstractC4830a;
    }

    @Override // x2.j
    @NonNull
    public final Z.a get() {
        int e11;
        AbstractC4830a abstractC4830a = this.f56144a;
        int b11 = C5694b.b(abstractC4830a);
        int c11 = C5694b.c(abstractC4830a);
        int b12 = abstractC4830a.b();
        if (b12 == -1) {
            S.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            b12 = 1;
        } else {
            S.a("DefAudioResolver", "Using supplied AUDIO channel count: " + b12);
        }
        Range<Integer> c12 = abstractC4830a.c();
        if (AbstractC4830a.f32998b.equals(c12)) {
            S.a("DefAudioResolver", "Using fallback AUDIO sample rate: 44100Hz");
            e11 = 44100;
        } else {
            e11 = C5694b.e(c12, b12, c11, c12.getUpper().intValue());
            S.a("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: " + e11 + "Hz");
        }
        a.AbstractC0654a a11 = Z.a.a();
        a11.d(b11);
        a11.c(c11);
        a11.e(b12);
        a11.f(e11);
        return a11.b();
    }
}
