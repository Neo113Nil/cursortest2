package c0;

import C.A;
import C.S;
import C.s0;
import W.u0;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Y0;
import d0.W;
import d0.X;
import e0.C6245b;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class l implements x2.j<W> {

    /* renamed from: g, reason: collision with root package name */
    private static final Size f56159g = new Size(1280, 720);

    /* renamed from: h, reason: collision with root package name */
    private static final Range<Integer> f56160h = new Range<>(1, 60);

    /* renamed from: a, reason: collision with root package name */
    private final String f56161a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0 f56162b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f56163c;

    /* renamed from: d, reason: collision with root package name */
    private final Size f56164d;

    /* renamed from: e, reason: collision with root package name */
    private final A f56165e;

    /* renamed from: f, reason: collision with root package name */
    private final Range<Integer> f56166f;

    public l(@NonNull String str, @NonNull Y0 y02, @NonNull u0 u0Var, @NonNull Size size, @NonNull A a11, @NonNull Range<Integer> range) {
        this.f56161a = str;
        this.f56162b = y02;
        this.f56163c = u0Var;
        this.f56164d = size;
        this.f56165e = a11;
        this.f56166f = range;
    }

    @Override // x2.j
    @NonNull
    public final W get() {
        int i11;
        Range<Integer> range = s0.f4222p;
        Range<Integer> range2 = this.f56166f;
        if (Objects.equals(range2, range)) {
            i11 = 30;
        } else {
            i11 = f56160h.clamp(range2.getUpper()).intValue();
        }
        int i12 = i11;
        Integer valueOf = Integer.valueOf(i12);
        boolean equals = Objects.equals(range2, range);
        Object obj = range2;
        if (!equals) {
            obj = "<UNSPECIFIED>";
        }
        S.a("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", valueOf, obj));
        S.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + i12 + "fps");
        Range<Integer> b11 = this.f56163c.b();
        S.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        A a11 = this.f56165e;
        int a12 = a11.a();
        Size size = this.f56164d;
        int width = size.getWidth();
        Size size2 = f56159g;
        int c11 = k.c(14000000, a12, 8, i12, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), b11);
        String str = this.f56161a;
        int a13 = C6245b.a(str, a11);
        X a14 = k.a(a13, str);
        W.a d11 = W.d();
        d11.f(str);
        d11.e(this.f56162b);
        d11.h(size);
        d11.b(c11);
        d11.d(i12);
        d11.g(a13);
        d11.c(a14);
        return d11.a();
    }
}
