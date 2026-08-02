package Eg0;

import Sc.InterfaceC4008j;
import Sc.k;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.app.android.pikazon.logging.error.PikazonErrorLogEntry;
import ru.ozon.app.android.pikazon.logging.error.PikazonErrorsLogger;
import sj.d;
import sj.e;
import sj.f;

/* loaded from: classes7.dex */
public final class b implements PikazonErrorsLogger {

    /* renamed from: a, reason: collision with root package name */
    private final List<Eg0.a> f7983a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final PikazonErrorsLogger.AnalyticsPlatform f7984b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f7985c;

    static final class a extends AbstractC7737t implements Function0<d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f7986b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            return e.f98817f.q(new sj.a("Frameworks", "Pikazon", null));
        }
    }

    public b() {
        this(null);
    }

    @Override // ru.ozon.app.android.pikazon.logging.error.PikazonErrorsLogger
    @NotNull
    public final PikazonErrorsLogger.AnalyticsPlatform getAnalyticsPlatform() {
        return this.f7984b;
    }

    @Override // ru.ozon.app.android.pikazon.logging.error.PikazonErrorsLogger
    public final void log(@NotNull PikazonErrorLogEntry logEntry) {
        Intrinsics.checkNotNullParameter(logEntry, "logEntry");
        String b11 = V.e.b(new Object[]{logEntry.getContextMessage()}, 1, "Pikazon image loading failure, details = [%S]", "format(...)");
        d dVar = (d) this.f7985c.getValue();
        c cVar = c.ERROR;
        String requestUuid = logEntry.getRequestUuid();
        LinkedHashMap l11 = U.l(new Pair("originalUrl", logEntry.getOriginalUrl()), new Pair(ImagesContract.URL, logEntry.getUrl()), new Pair("statusCode", Integer.valueOf(logEntry.getStatusCode())), new Pair("statusCodeType", logEntry.getStatusCodeType()), new Pair("vpn", Boolean.valueOf(logEntry.getVpn())), new Pair("proxy", Boolean.valueOf(logEntry.getProxy())), new Pair("cronet", Boolean.valueOf(logEntry.getCronet())), new Pair("connectionType", logEntry.getConnectionType()), new Pair("protocolVersion", logEntry.getProtocolVersion()));
        if (logEntry.getExceptionName() != null) {
            l11.put("exceptionName", logEntry.getExceptionName());
        }
        List<Eg0.a> list = this.f7983a;
        if (list != null) {
            for (Eg0.a aVar : list) {
                l11.put(aVar.getKey(), aVar.getValue(requestUuid));
            }
        }
        dVar.f(cVar, b11, f.a(l11), Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends Eg0.a> list) {
        this.f7983a = list;
        this.f7984b = PikazonErrorsLogger.AnalyticsPlatform.OZON_LOGGER;
        this.f7985c = k.b(a.f7986b);
    }
}
