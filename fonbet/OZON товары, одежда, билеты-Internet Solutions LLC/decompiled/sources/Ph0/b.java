package Ph0;

import android.content.Context;
import androidx.work.d;
import androidx.work.e;
import androidx.work.g;
import androidx.work.impl.C;
import androidx.work.p;
import androidx.work.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.token.worker.SendTokenWorker;
import ru.ozon.push.sdk.internal.updater.PushTokenUpdateResultsConverter;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f22552a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final PushTokenUpdateResultsConverter f22553b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q.a f22554c;

    public b(@NotNull Context appContext, @NotNull PushTokenUpdateResultsConverter pushTokenUpdateResultsConverter) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(pushTokenUpdateResultsConverter, "pushTokenUpdateResultsConverter");
        this.f22552a = appContext;
        this.f22553b = pushTokenUpdateResultsConverter;
        q.a k11 = new q.a(SendTokenWorker.class).k(15L, TimeUnit.SECONDS);
        d.a aVar = new d.a();
        aVar.b(p.CONNECTED);
        this.f22554c = k11.j(aVar.a());
    }

    public final void a(@NotNull ArrayList pushTokensUpdatesResults) {
        Intrinsics.checkNotNullParameter(pushTokensUpdatesResults, "pushTokensUpdatesResults");
        e.a aVar = new e.a();
        this.f22553b.b(aVar, pushTokensUpdatesResults);
        e a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        C i11 = C.i(this.f22552a);
        g gVar = g.REPLACE;
        q b11 = this.f22554c.m(a11).b();
        i11.getClass();
        i11.b("SendTokenWorker", gVar, Collections.singletonList(b11));
    }
}
