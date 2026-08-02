package Qj0;

import Sc.InterfaceC4008j;
import We.InterfaceC4865g;
import We.v;
import android.content.Context;
import ei0.InterfaceC6369b;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mi0.InterfaceC8331a;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.android.networkinfo.models.NetworkInfoKt;
import ru.ozon.tracker.performance.Metric;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ServerTimingsParser;

/* loaded from: classes7.dex */
public final class D implements v.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3888h f23506a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ServerTimingsParser f23507b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9067a f23508c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23509d;

    static final class a extends AbstractC7737t implements Function1<String, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String message = str;
            Intrinsics.checkNotNullParameter(message, "message");
            InterfaceC8331a a11 = D.a(D.this);
            if (a11 != null) {
                a11.log(message);
            }
            return Unit.f71690a;
        }
    }

    public D(@NotNull Context context, InterfaceC3888h interfaceC3888h) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23506a = interfaceC3888h;
        this.f23507b = new ServerTimingsParser(0);
        this.f23508c = new C9067a(context);
        this.f23509d = Sc.k.b(E.f23511b);
    }

    public static final InterfaceC8331a a(D d11) {
        return (InterfaceC8331a) d11.f23509d.getValue();
    }

    @Override // We.v.c
    @NotNull
    public final We.v create(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        InterfaceC6369b b11 = InterfaceC6369b.f62344a.b();
        if (b11 == null || !b11.i()) {
            return We.v.NONE;
        }
        We.G request = call.request();
        String a11 = request.j().toString();
        String a12 = s0.a(request);
        TreeMap i11 = request.e().i();
        String h11 = request.h();
        We.K a13 = request.a();
        if (a13 != null) {
            a13.getContentType();
        }
        We.K a14 = request.a();
        if (a14 != null) {
            a14.contentLength();
        }
        C3889i c3889i = new C3889i(a11, a12, i11, h11);
        boolean z11 = false;
        InterfaceC3888h interfaceC3888h = this.f23506a;
        if (interfaceC3888h != null ? interfaceC3888h.intercept(c3889i) : false) {
            return We.v.NONE;
        }
        U beginTrace = b11.beginTrace(c3889i.b());
        TreeSet j11 = beginTrace.j();
        if (!j11.isEmpty()) {
            Iterator it = j11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Metric) it.next()).getType() == MetricType.TIME_TO_FIRST_BYTE_START) {
                    z11 = true;
                    break;
                }
            }
        }
        if (z11) {
            return We.v.NONE;
        }
        beginTrace.n(new t0(c3889i.c()), true);
        a onUnknown = new a();
        C9067a c9067a = this.f23508c;
        c9067a.getClass();
        Intrinsics.checkNotNullParameter(onUnknown, "onUnknown");
        beginTrace.n(new C3882b(NetworkInfoKt.toConnectionType(c9067a.h(onUnknown))), true);
        return new C(beginTrace, this.f23507b);
    }
}
