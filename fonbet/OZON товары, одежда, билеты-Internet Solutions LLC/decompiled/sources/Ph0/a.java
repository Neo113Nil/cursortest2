package Ph0;

import Zg0.f;
import android.content.Context;
import androidx.work.d;
import androidx.work.impl.C;
import androidx.work.p;
import androidx.work.t;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.token.worker.SendChannelStateWorker;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f22551a;

    public a(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f22551a = appContext;
    }

    public final void a() {
        C.i(this.f22551a).a("NotificationChannelStateWorker");
    }

    public final void b(@NotNull f periodicConfig) {
        Intrinsics.checkNotNullParameter(periodicConfig, "periodicConfig");
        C i11 = C.i(this.f22551a);
        androidx.work.f fVar = androidx.work.f.UPDATE;
        TimeUnit repeatIntervalTimeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(SendChannelStateWorker.class, "workerClass");
        Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        t.a aVar = new t.a(SendChannelStateWorker.class);
        aVar.h().h(repeatIntervalTimeUnit.toMillis(1440L));
        t.a k11 = aVar.k(86400L, TimeUnit.SECONDS);
        d.a aVar2 = new d.a();
        aVar2.b(p.CONNECTED);
        i11.f(fVar, k11.j(aVar2.a()).b());
    }
}
