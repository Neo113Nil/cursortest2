package Lg;

import B90.c0;
import Fg.C3049a;
import Hg.c;
import Sc.o;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f17083a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Kg.a f17084b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Mg.a f17085c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ConcurrentLinkedQueue<C3594a> f17086d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Ng.a f17087e;

    /* synthetic */ class a extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            b.b((b) this.receiver);
            return Unit.f71690a;
        }
    }

    public b(@NotNull c tracer) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        this.f17083a = tracer;
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        this.f17084b = tracer.h();
        this.f17085c = new Mg.a(tracer);
        this.f17086d = new ConcurrentLinkedQueue<>();
        this.f17087e = new Ng.a(new a(0, this, b.class, "prepareUpload", "prepareUpload()V", 0));
    }

    public static void a(b this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Tc.b builder = C7714v.B();
        while (true) {
            C3594a poll = this$0.f17086d.poll();
            if (poll == null) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                this$0.f17085c.a(builder.B());
                return;
            }
            Intrinsics.checkNotNullExpressionValue(poll, "queue.poll() ?: break");
            builder.add(poll);
        }
    }

    public static final void b(b bVar) {
        c tracer = bVar.f17083a;
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        tracer.d().a().execute(new c0(bVar, 1));
    }

    public final void c(@NotNull String name, long j11, @NotNull Pair... attributes) {
        String str;
        TimeUnit unit = TimeUnit.NANOSECONDS;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(unit, "<this>");
        switch (Gg.a.f10228a[unit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "us";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new o();
        }
        String str2 = str;
        Map j12 = U.j((Pair[]) Arrays.copyOf(attributes, attributes.length));
        if (this.f17084b.b("PERFORMANCE_METRICS")) {
            Log.e("Tracer", "Feature PERFORMANCE_METRICS limited");
        } else {
            this.f17086d.add(new C3594a(C3049a.a(), j11, name, str2, j12));
            Ng.a.c(this.f17087e);
        }
    }
}
