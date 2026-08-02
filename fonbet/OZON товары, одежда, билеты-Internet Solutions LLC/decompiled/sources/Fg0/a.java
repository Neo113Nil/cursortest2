package Fg0;

import Qj0.C3882b;
import Qj0.Q;
import Qj0.S;
import Qj0.U;
import ei0.InterfaceC6369b;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.logging.error.PikazonErrorLogEntry;
import ru.ozon.app.android.pikazon.logging.error.PikazonErrorsLogger;
import ru.ozon.tracker.performance.MetricType;

/* loaded from: classes7.dex */
public final class a implements PikazonErrorsLogger {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f9461a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final PikazonErrorsLogger.AnalyticsPlatform f9462b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f9463c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Fg0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class EnumC0197a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC0197a[] $VALUES;
        public static final EnumC0197a INITIAL;
        public static final EnumC0197a MODIFIED;

        static {
            EnumC0197a enumC0197a = new EnumC0197a("INITIAL", 0);
            INITIAL = enumC0197a;
            EnumC0197a enumC0197a2 = new EnumC0197a("MODIFIED", 1);
            MODIFIED = enumC0197a2;
            EnumC0197a[] enumC0197aArr = {enumC0197a, enumC0197a2};
            $VALUES = enumC0197aArr;
            $ENTRIES = Xc.b.a(enumC0197aArr);
        }

        private EnumC0197a() {
            throw null;
        }

        public static EnumC0197a valueOf(String str) {
            return (EnumC0197a) Enum.valueOf(EnumC0197a.class, str);
        }

        public static EnumC0197a[] values() {
            return (EnumC0197a[]) $VALUES.clone();
        }
    }

    public a(@NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        this.f9461a = ozonTracker;
        this.f9462b = PikazonErrorsLogger.AnalyticsPlatform.OZON_TRACKER;
        this.f9463c = new LinkedHashMap();
    }

    public final synchronized void a(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (this.f9461a.hasTrace(uuid)) {
            if (this.f9463c.get(uuid) == EnumC0197a.INITIAL) {
                this.f9463c.remove(uuid);
                InterfaceC6369b interfaceC6369b = this.f9461a;
                U.p(interfaceC6369b.beginTrace(uuid), MetricType.TOTAL_TIME_END, 0L, false, 6);
                interfaceC6369b.endTrace(uuid);
            } else {
                this.f9463c.put(uuid, EnumC0197a.MODIFIED);
            }
        }
    }

    @Override // ru.ozon.app.android.pikazon.logging.error.PikazonErrorsLogger
    @NotNull
    public final PikazonErrorsLogger.AnalyticsPlatform getAnalyticsPlatform() {
        return this.f9462b;
    }

    @Override // ru.ozon.app.android.pikazon.logging.error.PikazonErrorsLogger
    public final synchronized void log(@NotNull PikazonErrorLogEntry logEntry) {
        Intrinsics.checkNotNullParameter(logEntry, "logEntry");
        String requestUuid = logEntry.getRequestUuid();
        U beginTrace = this.f9461a.beginTrace(requestUuid);
        Q q11 = new Q(logEntry.getStatusCode());
        int i11 = U.f23535i;
        beginTrace.n(q11, true);
        beginTrace.n(new S(logEntry.getStatusCodeType()), true);
        beginTrace.n(new C3882b(logEntry.getConnectionType()), true);
        if (this.f9463c.get(requestUuid) == EnumC0197a.MODIFIED) {
            this.f9463c.remove(requestUuid);
            InterfaceC6369b interfaceC6369b = this.f9461a;
            U.p(interfaceC6369b.beginTrace(requestUuid), MetricType.TOTAL_TIME_END, 0L, false, 6);
            interfaceC6369b.endTrace(requestUuid);
        } else {
            this.f9463c.put(requestUuid, EnumC0197a.INITIAL);
        }
    }
}
