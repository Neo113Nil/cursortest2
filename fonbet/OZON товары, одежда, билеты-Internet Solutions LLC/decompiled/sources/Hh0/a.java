package Hh0;

import Ah0.c;
import Ih0.e;
import android.content.Context;
import androidx.work.d;
import androidx.work.e;
import androidx.work.g;
import androidx.work.impl.C;
import androidx.work.p;
import androidx.work.q;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.status.data.worker.PushStatusWorker;

/* loaded from: classes7.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f10999a;

    public a(@NotNull Context context, @NotNull c pushStatusMessageIdWorkLinker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushStatusMessageIdWorkLinker, "pushStatusMessageIdWorkLinker");
        this.f10999a = context;
    }

    public final void a(e.a aVar, boolean z11) {
        int i11 = z11 ? 5 : 1;
        e.a aVar2 = new e.a();
        aVar2.f("trigger_push_status_event_id_param", aVar != null ? aVar.a() : null);
        aVar2.e(i11, "max_attempts_count_param");
        androidx.work.e a11 = aVar2.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        q.a i12 = new q.a(PushStatusWorker.class).k(0L, TimeUnit.SECONDS).i(androidx.work.a.EXPONENTIAL, 10000L, TimeUnit.MILLISECONDS);
        d.a aVar3 = new d.a();
        aVar3.b(p.CONNECTED);
        q.a workRequestBuilder = i12.j(aVar3.a()).m(a11);
        if (aVar != null && aVar.b() == Ih0.a.DELIVERY) {
            String messageId = aVar.a();
            Intrinsics.checkNotNullParameter(workRequestBuilder, "workRequestBuilder");
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            String format = String.format("ru.ozon.push.sdk.internal.status.data.fallback.MESSAGE_ID:%s", Arrays.copyOf(new Object[]{messageId}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            workRequestBuilder.a(format);
        }
        q b11 = workRequestBuilder.b();
        C i13 = C.i(this.f10999a);
        g gVar = g.REPLACE;
        i13.getClass();
        i13.b("ru.ozon.push.sdk.pushstatus.data.worker.PushWorkManager", gVar, Collections.singletonList(b11));
    }
}
