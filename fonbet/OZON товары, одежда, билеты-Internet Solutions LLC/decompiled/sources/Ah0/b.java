package Ah0;

import androidx.work.d;
import androidx.work.e;
import androidx.work.g;
import androidx.work.impl.C;
import androidx.work.p;
import androidx.work.q;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.status.data.fallback.PushDeliveryStatusFallbackSenderWorker;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C f1225a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f1226b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final a f1227a;

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            f1227a = new a();
        }
    }

    public b(C workManager) {
        a initialDelay = a.f1227a;
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        Intrinsics.checkNotNullParameter(initialDelay, "initialDelay");
        this.f1225a = workManager;
        this.f1226b = initialDelay;
    }

    public final void a(@NotNull String commsMessageId) {
        Intrinsics.checkNotNullParameter(commsMessageId, "commsMessageId");
        String name = PushDeliveryStatusFallbackSenderWorker.class.getName();
        e.a aVar = new e.a();
        aVar.f("COMMS_MESSAGE_ID", commsMessageId);
        e a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        q.a aVar2 = new q.a(PushDeliveryStatusFallbackSenderWorker.class);
        this.f1226b.getClass();
        q.a k11 = aVar2.k(60L, TimeUnit.SECONDS);
        d.a aVar3 = new d.a();
        aVar3.b(p.CONNECTED);
        q b11 = k11.j(aVar3.a()).m(a11).b();
        g gVar = g.REPLACE;
        C c11 = this.f1225a;
        c11.getClass();
        c11.b(name, gVar, Collections.singletonList(b11));
    }
}
