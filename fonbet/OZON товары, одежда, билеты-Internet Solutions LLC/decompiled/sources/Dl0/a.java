package Dl0;

import Ay.C2452a;
import El0.i;
import El0.k;
import El0.n;
import Ml.C3639a;
import Ol0.C3711a;
import Yl0.g;
import android.app.Application;
import android.util.Log;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import vl0.C10327a;
import xe.C10727i;
import xe.E0;
import xe.N;
import yl0.C10923h;
import yl0.s;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f6752a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f6753b;

    @NotNull
    public static C10923h a() {
        C10923h<Unit> a11;
        if (!f6753b) {
            throw new IllegalStateException("RuStorePushClient.init() must be called before accessing its methods.");
        }
        C10923h c10923h = new C10923h(0);
        Pair pair = new Pair(c10923h, new C10923h.a());
        C10923h c10923h2 = (C10923h) pair.a();
        C10923h.a aVar = (C10923h.a) pair.b();
        i iVar = i.f8074r;
        if (iVar != null) {
            a11 = iVar.a();
        } else {
            Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
            a11 = s.a(new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        }
        a11.i(new C3639a(aVar));
        a11.h(new C2452a(aVar));
        return c10923h2;
    }

    @NotNull
    public static C10923h b() {
        if (!f6753b) {
            throw new IllegalStateException("RuStorePushClient.init() must be called before accessing its methods.");
        }
        i iVar = i.f8074r;
        if (iVar != null) {
            return iVar.c();
        }
        Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
        return s.a(new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
    }

    public static void c(@NotNull Application application, @NotNull String projectId, @NotNull Hl0.a logger) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(logger, "logger");
        if (f6753b) {
            logger.b("RuStorePushClient already initialized", null);
            return;
        }
        if (h.K(projectId)) {
            throw new IllegalStateException("projectId can't be empty");
        }
        String a11 = C10327a.C2235a.a().a().a();
        K k11 = K.f71697a;
        n config = new n(application, projectId, logger, k11, k11, null, null, new Za.a("ru.vk.store", "661F20828EF780DE0B79BC59F26A30864316355F30E4F91CFA14A20791839914"), k11, a11);
        Intrinsics.checkNotNullParameter(config, "<this>");
        Intrinsics.d(null, "prod");
        synchronized (i.f8073q) {
            try {
                Intrinsics.checkNotNullParameter(config, "config");
                i iVar = i.f8074r;
                if (iVar != null) {
                    logger.b("Client SDK has been already initialized", null);
                } else {
                    if (iVar != null) {
                        if (iVar == null) {
                            throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
                        }
                        N.c(iVar.f8089o, null);
                        E0.d(iVar.f8089o.getCoroutineContext());
                    }
                    i iVar2 = new i(config);
                    i.f8074r = iVar2;
                    Yl0.i iVar3 = (Yl0.i) iVar2.f8080f.getValue();
                    Nl0.a aVar = iVar3.f35166a;
                    g gVar = new g(2, iVar3, Yl0.i.class, "onActivityCreated", "onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V", 0);
                    aVar.f19608a.f20463a.registerActivityLifecycleCallbacks(new C3711a(gVar));
                    iVar2.f8090p = C10727i.c(iVar2.f8089o, null, null, new k(iVar2, null), 3);
                }
            } finally {
            }
        }
        f6753b = true;
    }

    public static boolean d() {
        return f6753b;
    }
}
