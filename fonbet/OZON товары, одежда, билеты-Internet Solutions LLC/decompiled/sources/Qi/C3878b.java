package Qi;

import G.g;
import Sc.C4001c;
import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sj.d;
import sj.e;
import sj.f;

/* renamed from: Qi.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3878b implements InterfaceC3877a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f23475a = k.b(a.f23476b);

    /* renamed from: Qi.b$a */
    static final class a extends AbstractC7737t implements Function0<d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f23476b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            try {
                return e.f98817f.q(new sj.a("Gallery", "Gallery", null));
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // Qi.InterfaceC3877a
    public final void a(@NotNull ru.ozon.android.ozonLogger.core.c level) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter("ozon_gallery, camera_state_provider, emitDiscoveryResult error", "message");
        d dVar = (d) this.f23475a.getValue();
        if (dVar != null) {
            dVar.f(level, "ozon_gallery, camera_state_provider, emitDiscoveryResult error", null, Boolean.FALSE);
        }
    }

    @Override // Qi.InterfaceC3877a
    public final void b(Throwable th2, @NotNull String tag, @NotNull String message, @NotNull Map additionalFields) {
        String c11;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(additionalFields, "additionalFields");
        if (th2 != null && (c11 = g.c(th2.getMessage(), ", message = ", message)) != null) {
            message = c11;
        }
        d dVar = (d) this.f23475a.getValue();
        if (dVar != null) {
            ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.ERROR;
            Tc.d builder = new Tc.d();
            builder.put("tag", tag);
            if (th2 != null) {
                builder.put("stackTrace", C4001c.b(th2));
            }
            if (th2 != null) {
                String canonicalName = th2.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = "";
                }
                builder.put("exceptionType", canonicalName);
            }
            builder.putAll(additionalFields);
            Unit unit = Unit.f71690a;
            Intrinsics.checkNotNullParameter(builder, "builder");
            dVar.f(cVar, message, f.a(builder.u()), Boolean.FALSE);
        }
    }
}
