package Bj0;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Am.C2438a;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import tj0.InterfaceC9881a;
import tj0.InterfaceC9882b;
import wj0.C10566a;
import xj0.InterfaceC10781a;
import yj0.InterfaceC10914a;

/* loaded from: classes3.dex */
public abstract class g extends w0 {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f3899i = {C2438a.c(g.class, "trackEventsThrottleJob", "getTrackEventsThrottleJob()Lru/ozon/tracker/debug/menu/shared/utils/ThrottleJob;", 0), C2438a.c(g.class, "dispatchEventsThrottleJob", "getDispatchEventsThrottleJob()Lru/ozon/tracker/debug/menu/shared/utils/ThrottleJob;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9882b f3900a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9882b f3901b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC9881a f3902c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<C10566a> f3903d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Dj0.d f3904e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Dj0.d f3905f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<InterfaceC10914a> f3906g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final M0<InterfaceC10914a> f3907h;

    public g(@NotNull Gi0.g menuBuilder, @NotNull InterfaceC9882b trackTraces, @NotNull InterfaceC9882b pclPageTraces, @NotNull InterfaceC9881a dispatchTraces) {
        Intrinsics.checkNotNullParameter(menuBuilder, "menuBuilder");
        Intrinsics.checkNotNullParameter(trackTraces, "trackTraces");
        Intrinsics.checkNotNullParameter(pclPageTraces, "pclPageTraces");
        Intrinsics.checkNotNullParameter(dispatchTraces, "dispatchTraces");
        this.f3900a = trackTraces;
        this.f3901b = pclPageTraces;
        this.f3902c = dispatchTraces;
        List<C10566a> build = menuBuilder.build();
        this.f3903d = build;
        this.f3904e = new Dj0.d();
        this.f3905f = new Dj0.d();
        x0<InterfaceC10914a> a11 = O0.a(new InterfaceC10914a.b(new Cj0.a("test_metric", null, new a(this)), new Cj0.a("1", null, new b(this)), new Cj0.a("1", null, new c(this)), build));
        this.f3906g = a11;
        this.f3907h = C2399j.b(a11);
    }

    @NotNull
    protected final InterfaceC10914a g0() {
        return this.f3906g.getValue();
    }

    @NotNull
    public final M0<InterfaceC10914a> getUiState() {
        return this.f3907h;
    }

    public final void h0(@NotNull InterfaceC10781a intent) {
        InterfaceC10914a g02;
        Intrinsics.checkNotNullParameter(intent, "intent");
        x0<InterfaceC10914a> x0Var = this.f3906g;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof InterfaceC10781a.C2284a) {
            InterfaceC10914a g03 = g0();
            String a11 = ((InterfaceC10781a.C2284a) intent).a();
            g02 = InterfaceC10914a.C2311a.a(g03, Cj0.a.a(g03.c(), a11, Boolean.valueOf(true ^ h.K(a11))), null, null, 14);
        } else {
            if (intent instanceof InterfaceC10781a.b) {
                InterfaceC10914a g04 = g0();
                Long y02 = h.y0(((InterfaceC10781a.b) intent).a());
                Cj0.a d11 = g04.d();
                String l11 = y02 != null ? y02.toString() : null;
                g02 = InterfaceC10914a.C2311a.a(g04, null, Cj0.a.a(d11, l11 != null ? l11 : "", Boolean.valueOf(y02 != null && y02.longValue() > 0)), null, 13);
            } else if (intent instanceof InterfaceC10781a.c) {
                InterfaceC10914a g05 = g0();
                Integer w02 = h.w0(((InterfaceC10781a.c) intent).a());
                Cj0.a b11 = g05.b();
                String num = w02 != null ? w02.toString() : null;
                g02 = InterfaceC10914a.C2311a.a(g05, null, null, Cj0.a.a(b11, num != null ? num : "", Boolean.valueOf(w02 != null && w02.intValue() > 0)), 11);
            } else {
                boolean z11 = intent instanceof InterfaceC10781a.f;
                Dj0.d dVar = this.f3904e;
                m<Object>[] mVarArr = f3899i;
                if (z11) {
                    g02 = g0();
                    ((Dj0.b) dVar.getValue(this, mVarArr[0])).a(new f(g02, this, null));
                } else if (intent instanceof InterfaceC10781a.e) {
                    g02 = g0();
                    ((Dj0.b) dVar.getValue(this, mVarArr[0])).a(new e(g02, this, null));
                } else if (intent instanceof InterfaceC10781a.d) {
                    ((Dj0.b) this.f3905f.getValue(this, mVarArr[1])).a(new d(this, null));
                    g02 = g0();
                } else {
                    g02 = g0();
                }
            }
        }
        x0Var.setValue(g02);
    }
}
