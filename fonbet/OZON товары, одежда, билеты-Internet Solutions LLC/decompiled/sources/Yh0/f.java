package Yh0;

import Xh0.a;
import Yh0.o;
import ai0.C5027c;
import ai0.ComponentCallbacks2C5026b;
import android.os.SystemClock;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.OzonApplication;
import ve.EnumC10311b;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f35088a = Sc.k.a(Sc.n.NONE, a.f35090b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static o f35089b = o.a.f35109a;

    static final class a extends AbstractC7737t implements Function0<ComponentCallbacks2C5026b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f35090b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacks2C5026b invoke() {
            return new ComponentCallbacks2C5026b(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public static o a() {
        ?? r02 = f35088a;
        ((ComponentCallbacks2C5026b) r02.getValue()).d();
        if (((ComponentCallbacks2C5026b) r02.getValue()).a()) {
            f35089b = o.b.f35110a;
        }
        o oVar = f35089b;
        f35089b = o.b.f35110a;
        return oVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static void b(@NotNull OzonApplication app) {
        Intrinsics.checkNotNullParameter(app, "app");
        ((ComponentCallbacks2C5026b) f35088a.getValue()).b(app);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    public static void c(@NotNull String stepName) {
        o oVar;
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        if (C5027c.a(stepName) && !((ComponentCallbacks2C5026b) f35088a.getValue()).a()) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            b bVar = new b(stepName, elapsedRealtimeNanos);
            o oVar2 = f35089b;
            if (oVar2 instanceof o.a) {
                oVar = new o.c(elapsedRealtimeNanos, bVar, new LinkedList());
            } else if (oVar2 instanceof o.c) {
                o.c cVar = (o.c) oVar2;
                String a11 = cVar.b().a();
                long b11 = cVar.b().b();
                b.Companion companion = kotlin.time.b.INSTANCE;
                a.b bVar2 = new a.b(a11, kotlin.time.c.h(elapsedRealtimeNanos - b11, EnumC10311b.NANOSECONDS));
                o.c a12 = o.c.a(cVar, bVar);
                ((LinkedList) a12.d()).add(bVar2);
                oVar = a12;
            } else {
                if (!(oVar2 instanceof o.b)) {
                    throw new Sc.o();
                }
                oVar = o.b.f35110a;
            }
            f35089b = oVar;
        }
    }
}
