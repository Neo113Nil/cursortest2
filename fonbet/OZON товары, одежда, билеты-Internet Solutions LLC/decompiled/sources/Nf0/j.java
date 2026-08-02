package Nf0;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.InterfaceC4008j;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNf0/j;", "Landroidx/lifecycle/w0;", "<init>", "()V", "ozon-network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f19544a = Sc.k.b(a.f19547b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<h> f19545b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M0<h> f19546c;

    static final class a extends AbstractC7737t implements Function0<bg0.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f19547b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final bg0.f invoke() {
            return new bg0.f();
        }
    }

    public j() {
        x0<h> a11 = O0.a(new h(3, (ArrayList) null));
        this.f19545b = a11;
        this.f19546c = C2399j.b(a11);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new i(this, null), 3);
    }

    public static final bg0.f d0(j jVar) {
        return (bg0.f) jVar.f19544a.getValue();
    }

    @NotNull
    public final M0<h> f0() {
        return this.f19546c;
    }
}
