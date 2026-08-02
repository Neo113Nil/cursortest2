package c0;

import C.A;
import C.S;
import C.s0;
import W.u0;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import androidx.camera.core.impl.Y0;
import d0.W;
import d0.X;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class m implements x2.j<W> {

    /* renamed from: a, reason: collision with root package name */
    private final String f56167a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0 f56168b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f56169c;

    /* renamed from: d, reason: collision with root package name */
    private final Size f56170d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5086c0.c f56171e;

    /* renamed from: f, reason: collision with root package name */
    private final A f56172f;

    /* renamed from: g, reason: collision with root package name */
    private final Range<Integer> f56173g;

    public m(@NonNull String str, @NonNull Y0 y02, @NonNull u0 u0Var, @NonNull Size size, @NonNull InterfaceC5086c0.c cVar, @NonNull A a11, @NonNull Range<Integer> range) {
        this.f56167a = str;
        this.f56168b = y02;
        this.f56169c = u0Var;
        this.f56170d = size;
        this.f56171e = cVar;
        this.f56172f = a11;
        this.f56173g = range;
    }

    @Override // x2.j
    @NonNull
    public final W get() {
        InterfaceC5086c0.c cVar = this.f56171e;
        int f7 = cVar.f();
        Range<Integer> range = s0.f4222p;
        Range<Integer> range2 = this.f56173g;
        int intValue = !Objects.equals(range2, range) ? range2.clamp(Integer.valueOf(f7)).intValue() : f7;
        Integer valueOf = Integer.valueOf(intValue);
        Integer valueOf2 = Integer.valueOf(f7);
        boolean equals = Objects.equals(range2, range);
        Object obj = range2;
        if (!equals) {
            obj = "<UNSPECIFIED>";
        }
        S.a("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", valueOf, valueOf2, obj));
        S.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + intValue + "fps");
        Range<Integer> b11 = this.f56169c.b();
        S.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int c11 = cVar.c();
        int a11 = this.f56172f.a();
        int b12 = cVar.b();
        int f11 = cVar.f();
        Size size = this.f56170d;
        int c12 = k.c(c11, a11, b12, intValue, f11, size.getWidth(), cVar.k(), size.getHeight(), cVar.h(), b11);
        int j11 = cVar.j();
        String str = this.f56167a;
        X a12 = k.a(j11, str);
        W.a d11 = W.d();
        d11.f(str);
        d11.e(this.f56168b);
        d11.h(size);
        d11.b(c12);
        d11.d(intValue);
        d11.g(j11);
        d11.c(a12);
        return d11.a();
    }
}
