package Bf0;

import Sc.InterfaceC4008j;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;
import ru.ozon.android.ozonLogger.core.h;
import vf0.C10315a;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3709a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f3710b = Sc.k.b(a.f3711b);

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.ozonLogger.core.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3711b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.ozonLogger.core.h invoke() {
            return Xf0.a.a(new sj.a("Network", "whitelisting_status", null));
        }
    }

    private final ru.ozon.android.ozonLogger.core.h b() {
        return (ru.ozon.android.ozonLogger.core.h) this.f3710b.getValue();
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ru.ozon.android.ozonLogger.core.h b11 = b();
        if (b11 != null) {
            h.a.a(b11, message, null, Boolean.TRUE, 2);
        }
    }

    public final void c(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ru.ozon.android.ozonLogger.core.h b11 = b();
        if (b11 != null) {
            h.a.b(b11, message, Boolean.TRUE, 2);
        }
    }

    public final void d(@NotNull C10315a configuration, @NotNull qf0.e result) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.c() == EnumC9053a.Unknown) {
            return;
        }
        ru.ozon.android.ozonLogger.core.h b11 = b();
        if (b11 != null) {
            b11.d("статус доступности extra домена", sj.f.b(new Pair("tag", "extra_domain_ping_status"), new Pair(ImagesContract.URL, result.a()), new Pair("status", result.c()), new Pair("statusCode", result.b()), new Pair("statusCodeType", configuration.e())), Boolean.FALSE);
        }
        ru.ozon.android.ozonLogger.core.h b12 = b();
        if (b12 != null) {
            h.a.b(b12, "Отправили аналитику по " + result.a() + " домену. Статус: " + result.c() + ", тип сети: " + result.b(), Boolean.TRUE, 2);
        }
    }

    public final void e(@NotNull C10315a configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (configuration.g() && !this.f3709a) {
            ru.ozon.android.ozonLogger.core.h b11 = b();
            if (b11 != null) {
                b11.d("приложение перешло в режим вайтлистинга", sj.f.b(new Pair("tag", "whitelisting_status"), new Pair(ImagesContract.URL, configuration.f()), new Pair("status", configuration.b())), Boolean.FALSE);
            }
            this.f3709a = true;
            ru.ozon.android.ozonLogger.core.h b12 = b();
            if (b12 != null) {
                h.a.b(b12, "Отправили whitelisting аналитику", Boolean.TRUE, 2);
            }
        }
    }
}
