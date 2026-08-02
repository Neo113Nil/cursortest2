package Q1;

import K1.C3422b;
import K1.C3424d;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Q1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3843l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private K f22896a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C3844m f22897b;

    public C3843l() {
        long j11;
        C3422b d11 = C3424d.d();
        j11 = K1.Q.f15009b;
        K k11 = new K(d11, j11, (K1.Q) null);
        this.f22896a = k11;
        this.f22897b = new C3844m(k11.c(), this.f22896a.e());
    }

    @NotNull
    public final K a(@NotNull List<? extends InterfaceC3841j> list) {
        InterfaceC3841j interfaceC3841j;
        InterfaceC3841j interfaceC3841j2 = null;
        try {
            int size = list.size();
            int i11 = 0;
            InterfaceC3841j interfaceC3841j3 = null;
            while (i11 < size) {
                try {
                    interfaceC3841j = list.get(i11);
                } catch (Exception e11) {
                    e = e11;
                    interfaceC3841j2 = interfaceC3841j3;
                }
                try {
                    interfaceC3841j.a(this.f22897b);
                    i11++;
                    interfaceC3841j3 = interfaceC3841j;
                } catch (Exception e12) {
                    e = e12;
                    interfaceC3841j2 = interfaceC3841j;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error while applying EditCommand batch to buffer (length=" + this.f22897b.h() + ", composition=" + this.f22897b.d() + ", selection=" + ((Object) K1.Q.j(this.f22897b.i())) + "):");
                    Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                    sb2.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                    C7714v.U(list, sb2, "\n", null, null, new C3842k(interfaceC3841j2, this), 60);
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                    throw new RuntimeException(sb3, e);
                }
            }
            C3422b r11 = this.f22897b.r();
            long i12 = this.f22897b.i();
            K1.Q b11 = K1.Q.i(this.f22896a.e()) ? null : K1.Q.b(i12);
            K k11 = new K(r11, b11 != null ? b11.k() : K1.S.a(K1.Q.g(i12), K1.Q.h(i12)), this.f22897b.d());
            this.f22896a = k11;
            return k11;
        } catch (Exception e13) {
            e = e13;
        }
    }

    public final void b(@NotNull K k11, V v11) {
        boolean d11 = Intrinsics.d(k11.d(), this.f22897b.d());
        boolean z11 = true;
        boolean z12 = false;
        if (!Intrinsics.d(this.f22896a.c(), k11.c())) {
            this.f22897b = new C3844m(k11.c(), k11.e());
        } else if (K1.Q.d(this.f22896a.e(), k11.e())) {
            z11 = false;
        } else {
            this.f22897b.o(K1.Q.h(k11.e()), K1.Q.g(k11.e()));
            z12 = true;
            z11 = false;
        }
        if (k11.d() == null) {
            this.f22897b.a();
        } else if (!K1.Q.e(k11.d().k())) {
            this.f22897b.n(K1.Q.h(k11.d().k()), K1.Q.g(k11.d().k()));
        }
        if (z11 || (!z12 && !d11)) {
            this.f22897b.a();
            k11 = K.a(k11, null, 0L, 3);
        }
        K k12 = this.f22896a;
        this.f22896a = k11;
        if (v11 != null) {
            v11.c(k12, k11);
        }
    }

    @NotNull
    public final K c() {
        return this.f22896a;
    }
}
