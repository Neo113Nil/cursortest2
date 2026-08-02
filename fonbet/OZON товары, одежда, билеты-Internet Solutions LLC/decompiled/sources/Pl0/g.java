package Pl0;

import Sc.InterfaceC4008j;
import We.B;
import We.E;
import We.G;
import We.L;
import android.content.Context;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22653a = Sc.k.b(a.f22654b);

    public static final class a extends AbstractC7737t implements Function0<E> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f22654b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final E invoke() {
            InterfaceC4008j interfaceC4008j = g.f22653a;
            e loggerProvider = e.f22650a;
            Intrinsics.checkNotNullParameter(loggerProvider, "loggerProvider");
            C8588a c8588a = new C8588a(C8588a.b.f77100h0);
            c8588a.c(C8588a.EnumC1299a.NONE);
            El0.n nVar = e.f22651b;
            if (nVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = nVar.f8115a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "vkpnsPushConfig.application.applicationContext");
            final String packageName = applicationContext.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "ConfigModule.applicationContext.packageName");
            Intrinsics.checkNotNullParameter("host_sdk/6.1.0", "versionName");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            B[] interceptors = {c8588a, new B() { // from class: zb.a
                @Override // We.B
                public final L intercept(B.a chain) {
                    Intrinsics.checkNotNullParameter("host_sdk/6.1.0", "$versionName");
                    String packageName2 = packageName;
                    Intrinsics.checkNotNullParameter(packageName2, "$packageName");
                    Intrinsics.checkNotNullParameter(chain, "chain");
                    G request = chain.request();
                    request.getClass();
                    G.a aVar = new G.a(request);
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                    aVar.d("x-vkpns-request-id", uuid);
                    aVar.d("User-Agent", "host_sdk/6.1.0");
                    aVar.d("X-Vkpns-Package-Name", packageName2);
                    return chain.proceed(aVar.b());
                }
            }};
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            E.a aVar = new E.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.f(60L, timeUnit);
            aVar.b0(60L, timeUnit);
            aVar.X(60L, timeUnit);
            aVar.Y();
            C7714v.r(aVar.S(), interceptors);
            return new E(aVar);
        }
    }
}
